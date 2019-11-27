package com.company.JukeBox1;
import java.util.Comparator;


/**
 * This class is a comparator that implements the Comparator interface
 * This class needs to over ride the compare method which define on what basis the sort should work.
 * We can create multiple comparator and based on those comparator we can sort our list.
 */
public class ArtistCompare implements Comparator<Song> {
    /**
     * Takes two song objects and compares on the basis of artist lexicographically
     * @param one Song object 1
     * @param two Song object 2
     * @return an integer value and sorts on the basis of lexicographical differences between the two strings
     */
    public int compare(Song one, Song two){
        return one.getArtist().compareTo(two.getArtist());

    }
}
