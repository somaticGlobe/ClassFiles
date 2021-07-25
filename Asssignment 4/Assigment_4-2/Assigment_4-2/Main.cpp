#include <iostream>
#include <time.h>
#include <stdlib.h>
#include <stdio.h>

//array implementation
using namespace std;

int main()
{
	int valueArr[100];
	int insert;

	srand(time(NULL));

	for (int i = 0; i < 100;)
	{
		insert = rand() % 1000 +1;

		// checks for duplicate values
		for (int j = 0; j < i; j++)
		{
			if (valueArr[j] == insert)
			{
				insert = 0;
			}
		}
		//if no dulplicate values and index is empty, insert random num
		if (insert != 0 && valueArr[i] == NULL)
		{
			valueArr[i] = insert;
			i++;
		}
	}

	//displays values before removal
	cout << "Values in array before removal:" << endl;
	for (int i = 1; i <= 100; i++)
	{
		if (i % 25 == 0)
		{
			cout << ""<<valueArr[i-1]<<", " << endl;
		}
		else
		{
			cout << "" << valueArr[i - 1] << ", ";
		}
	}

	// removes first 50 values and shifts last 50 forward to fill the empty space
	for (int i = 0; i < 100; i++)
	{
		if (i < 50)
		{
			valueArr[i] = NULL;
		}
		else
		{
			valueArr[i - 50] = valueArr[i];
		}
	}

	// displays values after removal
	cout << "Values in array before removal: " << endl;
	for (int i = 1; i <= 50; i++)
	{
		if (i % 25 == 0)
		{
			cout << "" << valueArr[i - 1] << ", " << endl;
		}
		else
		{
			cout << "" << valueArr[i - 1] << ", ";
		}
	}

	return 0;
}