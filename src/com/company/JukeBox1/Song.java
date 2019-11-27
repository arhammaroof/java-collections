package com.company.JukeBox1;

/**
 * This Class needs to implement Comparable Interface in order to make the collections.sort() method work for its object
 */
class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    /**
     * If two objects have the same hashcode value, they are NOT required to be equal.
     * But if they’re equal, they MUST have the same hashcode value
     * So, if you override equals(), you MUST override hashCode().
     * The default behavior of hashCode() is to generate a unique integer for each object on the heap. So if you don’t override hashCode() in a class, no two objects of that type can EVER be considered equal.
     * This is an over ridden equals() method of string class that check if the hashcode-matched objects are really equal. in our case have the same title?
     * @param aSong Object class object that is being casted to the passed Song object as a parameter
     * @return boolean value that tells if the titles of the passed and current Song object matched or not.
     */
    public boolean equals(Object aSong){
        Song s = (Song) aSong;
        return this.getTitle().equals((s.getTitle()));
    }

    /**
     * Overridden method to make the hashcodes same of the object based on their title
     * @return
     */
    public int hashCode(){
        return this.title.hashCode();
    }

    /**
     * This is an overridden method of comparable interface which need to be implemented in order to make the sort() method understand on what to compare to so that it can sort accordingly
     * @param s Is a song object which needs to be passed in this method as it takes a <T> type object. in our case that is Song Object
     * @return and integer
     */

    /**
     *
     * @param s passes the current object of song and compares it on the basis of title
     * @return an integer value and sorts on the basis of lexicographical differences between the two strings
     */
    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }

    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getRating() {
        return rating;
    }
    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    } }