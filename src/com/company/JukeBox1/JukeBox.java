package com.company.JukeBox1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class JukeBox {
    /**
     * list that stores song list.
     */
    ArrayList<Song> songList = new ArrayList<Song>();

    public void go(){
        getSongs();
//        System.out.println(songList);

        /**
         * this is a static sort() method in Collections that takes a list as a parameter and sorts the list
         * since this Collection class uses generic and implements the comparable interface the object passed as a parameter(if it is a user generated type) i.e songlist needs to implement the Comparable interface
         */
//        Collections.sort(songList);
//
//        System.out.println(songList);
//
//        ArtistCompare artistCompare = new ArtistCompare();
        /**
         * This is an overloaded sort methods available in collections package that takes a comparator as well as its parameter
         * This is useful if we want different ways to sort the list.
         * in our case: sorting the list according to artist and not by title.
         */
//        Collections.sort(songList, artistCompare);
//        System.out.println(songList);
        /**
         * What happens if we have duplicate values in our Song list.
         * ArrayList can not remove duplicates
         * we need a set ! HashSet
         * But this does not work either. (Still duplicates value exist.)
         * Reason is that HashSet uses hashcodes of the object and if the hashcodes are not equal it assumes that the objects are not duplicates. each song object has a different hashcode
         * Song class should have a method that over rides the HashCode() method in order to to make the objects equal.
         */
//        HashSet<Song> songSet = new HashSet<Song>();
        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    /**
     * Reads the file that has all the songs information
     */
    void getSongs(){
        try{
            File file = new File("C:\\Users\\armaroof\\IdeaProjects\\Java Collections\\src\\com\\company\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line=reader.readLine())!=null){
                addSong(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Splits the string on the basis of "/" to keep the title of the song and ignoring the artist name
     * @param lineToParse A string that holds the Title name and artist name separated by "/"
     */
    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
