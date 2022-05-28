import java.util.Random;

public class Song {
    // class variables
    private static int maxSongNum = 20;
    private static int curAddNum = 0;
    private static int curSongInd = 0;
    private static Song[] songs = new Song[20];
    private static Song curSong;

    // instance variables
    private String title, filename, singer, duration;
    private int year;

    public Song(String title, String filename, String singer, String duration, int year) {

        // set the first added song as current song
        if (curAddNum == 0) {
            curSong = this;
        }

        // if the list still got spaces
        if (curAddNum < maxSongNum) {
            this.title = title;
            this.filename = filename;
            this.singer = singer;
            this.duration = duration;
            this.year = year;
            songs[curAddNum] = this; // add new song to the song list at curAddNum index
            curAddNum++; // increment curAddNum index by 1
            //System.out.println("Song added to songlist");
        } else {
            System.out.println("Song list is full!");
        }
    }

    public void sortTitle() { //method to sort song based on title

        for (int i = 0; i < curAddNum; i++) {
            for (int j = i + 1; j < curAddNum; j++) {
                if (songs[i].title.compareToIgnoreCase(songs[j].title) > 0) {
                    Song tempSong = songs[i];
                    songs[i] = songs[j];
                    songs[j] = tempSong;

                    // handling the index of current song
                    if (curSongInd == i) {
                        curSongInd = j;
                    } else if (curSongInd == j) {
                        curSongInd = i;
                    }
                }
            }
        }
        // set current song back to the current song before sorting
        curSong = songs[curSongInd];
    }

    public void sortDuration() { //method to sort song based on duration

        // the format of duration is "minutes:seconds"
        for (int i = 0; i < curAddNum; i++) {
            for (int j = i + 1; j < curAddNum; j++) {

                String[] t1 = songs[i].duration.split(":");
                String[] t2 = songs[j].duration.split(":");
                boolean change = false;

                // compare minute
                if (Integer.parseInt(t1[0]) > Integer.parseInt(t2[0])) {
                    change = true;
                } else if (Integer.parseInt(t1[0]) == Integer.parseInt(t2[0])) {
                    // compare second
                    if (Integer.parseInt(t1[1]) > Integer.parseInt(t2[1])) {
                        change = true;
                    }
                }

                // handle change
                if (change) {
                    Song tempSong = songs[i];
                    songs[i] = songs[j];
                    songs[j] = tempSong;

                    if (curSongInd == i) {
                        curSongInd = j;
                    } else if (curSongInd == j) {
                        curSongInd = i;
                    }
                }
            }
        }
        // set current song back to the current song before sorting
        curSong = songs[curSongInd];
    }

    public void searchTitle(String name) { //method to search song based by title

        for (int i = 0; i < curAddNum; i++) {
            if (name.equalsIgnoreCase(songs[i].title)) {
                // set current song to the first song found 
                curSongInd = i;
                curSong = songs[i];
                System.out.println("Song found\nNow playing " + curSong.title + " by " + curSong.singer);
                return;
            }
        }
        // If not found
        System.out.println("Song not found..");
    }

    public void searchSinger(String name) { //method to search song based by singer
        for (int i = 0; i < curAddNum; i++) {
            if (name.equalsIgnoreCase(songs[i].singer)) {
                // set current song to the first song found 
                curSongInd = i;
                curSong = songs[i];
                System.out.println(
                        "Singer found\nNow playing " + curSong.title + " by " + curSong.singer);
                return;
            }
        }
        // If not found
        System.out.println("Singer not found..");
    }

    public void play() { //method that gets current song info 
        // Use curSong variable's info instead of the calling object (this)
        System.out.println(
                "Now playing " + curSong.title
                + " by " + curSong.singer
                + " in " + curSong.year
                + " (" + curSong.duration + ") "
                + "[stored at " + curSong.filename + "]"
        );
    }

    public void next() { //method that will moves to the next song
        // formula to increment the curSongInd so that
        // indices greater than current occupied song list (which is null) wont show up
        curSongInd = (curSongInd + 1) % curAddNum;
        curSong = songs[curSongInd];
    }

    public void previous() { //method that moves to the previous song
        // formula to decrement the curSongInd so that negative index wont show up
        curSongInd = (curSongInd - 1 + maxSongNum) % curAddNum;
        curSong = songs[curSongInd];
    }

    @Override
    public String toString() {  //method to display the song information
        String out = "";

        out = out + "Title: " + this.title + "\tSinger: " + this.singer
                + "\tYear: " + this.year + "\tDuration: " + this.duration
                + "\tFilename: " + this.filename;

        return out;
    }

    public static Song[] getSongs() {
        return songs;
    }
}
