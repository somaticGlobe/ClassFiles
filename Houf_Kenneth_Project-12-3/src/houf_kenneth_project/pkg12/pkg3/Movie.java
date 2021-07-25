/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houf_kenneth_project.pkg12.pkg3;


/**
 *
 * @author somat
 */
public class Movie
{
    private String title;
    private String genre;
    
    public Movie(String title, String genre)
    {
        this.title = title;
        this.genre = genre;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}
