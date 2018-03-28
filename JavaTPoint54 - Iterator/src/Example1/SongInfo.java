/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 * Kindly maintain this order:
 *
 * SongIterator interface; 
 * SongInfo class;
 * SongsOfThe70s class;
 * SongsOfThe80s class; 
 * SongsOfThe90s class;
 * 
 *
 * @author omarhamdy
 */
// Will hold all of the info needed for each song
// I told all users to:
// 1. create a function named addSong() for adding song, band and release
// 2. create a function named getBestSongs() that will return the collection
//    of songs
public class SongInfo {

    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearReleased) {

        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;

    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearReleased() {
        return yearReleased;
    }

}
