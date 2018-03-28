/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author omarhamdy
 */
public class Song extends SongComponent {

    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongName, String newBandName, int newReleaseYear) {

        songName = newSongName;
        bandName = newBandName;
        releaseYear = newReleaseYear;

    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public void displaySongInfo() {

        System.out.println(getSongName() + " was recorded by "
                + getBandName() + " in " + getReleaseYear());

    }

}
