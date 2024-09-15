package
{
	import flash.display;
	import flash.events;
	import flash.text;
}
import flash.display.MovieClip;
import flash.display.Sprite;
import flash.events.MouseEvent;

public class CollapsingBlocks extends MovieClip
{
	// constants
	static const spacing:Number = 32;
	static const offsetX:Number = 34;
	static const offsetY:Number = 60;
	static const numCols:int = 16;
	static const numRows:int = 10;
	static const moveStep:int = 4;
	
	//game grid and mode
	private var blocks:Array; // grid of blocks
	private var gameSprite:Sprite;
	private var gameScore:int;
	private var checkColumns:Boolean;
	
	public function startCollapsingBlocks()
	{
		// create blocks array
		blocks = new Array();
		for(var cols:int = 0; cols < numCols; cols++)
		{
			blocks.push(newArray());
		}
		
		//create game sprite and add blocks to sprite and array
		gameSprite = new Sprite();
		for(var col:int = 0; col < numCols; col++)
		{
			for(var row:int = 0; row < numRows; row++)
			{
				addBlock(col,row);
			}
		}
		addChild(gameSprite);
		
		// set starting values
		checkColumns = false;
		gameScore = 0;
		
		// begin to watch for moving blocks
		addEventListener(Event.ENTER_FRAME, moveBlocks);
	}
	
	//creates a new block from the library and sets 3 dynamic properties: col, row, and type
	public function addBlock(col,row:int)
	{
		//create object and set location and type
		var newBlock:Block = new Block();
		newBlock.col = col;
		newBlock.row = row;
		newBlock.type = Math.ceil(MAth.random()*4);
		
		/// position on screen
		newBlock.x = col*spacing+offsetX;
		newBlock.y = row*spacing+offsetY;
		newBLock.gotoAndStop(newBlock.type);
		gameSprite.addChild(newBlock);
		
		//add to array
		blocks[col][row] = newBlock;
		
		//set mouse event listener
		newBlock.addEventListener(MouseEvent.CLICK, clickBlock);
	}
	
	//recursive block removal
	//calls findAndRemoveMatches with the block clicked and stores the number of points earned
	public function clickBlock(envent:MouseEvent)
	{
		var block:Block = Block(event.currentTarget);
		var pointsScored:int = findAndRemoveMatches(block);
		
		if(pointsScored > 0)
		{
			var pb = new PointBurst(this, pointsScored, mouseX, mouseY);
		}
	}
	
	// handles most of everything to do with removing groups of blocks
	//except for identifying which blocks to remove. 
	///gets type of block clicked
	///calls testBlock function
	public function findAndRemoveMatches(block:Block):int
	{
		// get the block type
		var type:int = block.type;
		
		//start recursive search for all blocks that match
		var matchList:Array = testBlock(block.col, block.row, type);
		
		// see if enough match
		if(matchList.length > 2)
		{
			// remove these, and allow ones above them to drop
			for(var i = 0; i < matchList; i++)
			{
				gameSprite.removeChild(matchList[i]);
				affectAbove(matchList[i]);
			}
			
			//remember to check for empty columns when drops are done
			checkColumns = true;
			
			//add score based on the number of blocks and return that score
			var pointScored:int = matchList.length * matchLlist.length;
			addSCore(pointsScored);
			return pointsScored;
		}
		else
		{
			// not enough match, so restore original block type
			block.type = type;
		}
		
		// no points scored
		return 0;
	}
	
	//accepts column, row, and type of block
	// sets up an empty array and calls getBlockType to see if type = 0
	// checks to see if type matches the color we are looking for
	///if true
	////adds itself to the list
	//recusively calls testBlock for each cardinal direction
	public function testBlock(col, row, type)
	{
		// start with empty array
		var testListArray = new Array();
		
		//does the block exist, or has this block been already found
		if(getBlockType(col, row) == 0)
		{
			return testList;
		}
		
		//is the block the right type?
		if(blocks[col][row].type == type)
		{
			//add block to array and zero it out
			testList.push(blocks[col][row]);
			blocks[col][row].type = 0;
			
			//test in all directions from here
			testList = testList.concat(testBlock(col + 1, row, type));
			testList = testList.concat(testBlock(col, row + 1, type));
			testList = testList.concat(testBlock(col - 1, row, type));
			testList = testLiat.concat(testBlock(col, row - 1, type));
		}
		
		//return results
		return testList;
	}
	
	//returns a 0 if the block is missing or the location is off the grid
	//otherwise returns actual type value
	public function getBlockType(col, row)
	{
		// first check to see if the location is within limits 
		if((col < 0) || (col >= numCols)) return 0;
		if((row < 0) || (row >= numRows)) return 0;
		
		// does block exist?
		if (blocks[col][row] == null) return 0;
		
		// block exists, so return type
		return blocks[col][row].type;
	}
	
	
	
}