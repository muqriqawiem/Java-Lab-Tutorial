package WIX1002.LAB.LabReport3;

public class Q2 {

    public static void main(String[] args) {

        String t = "Love Hate Neutral Like Always True Aroma Hesitate Ground XOXO Supermarket Flower Perfect Queens Lilac Asong Celeb Noname Zoo Gravity";
        String f = "a b c d e f g h i j k l m n o p q r s t";
        String s = "Yerin Ed IU Somi Twice Taylor Nikasu Adele Drake Coldplay Snarky Puppy Zico Unknown Zeka Bp Seven Sam Kim Nova";
        String d = "3:11 3:12 3:13 3:14 3:15 2:10 3:19 1:10 5:10 3:00 8:00 3:21 3:20 3:30 3:01 4:11 5:13 2:56 3:56 2:44";

        String[] titles = t.split(" ");
        String[] filenames = f.split(" ");
        String[] singers = s.split(" ");
        String[] durations = d.split(" ");
        int[] years = {2020, 2019, 2018, 2021, 2022, 2017, 2016, 2014, 2015, 2013, 2012, 2011, 2019, 2020, 2020, 2019, 2021, 2018, 2017, 1997};

        // first song
        Song song1 = new Song("In Love", "music/file", "Beak", "2:11", 2020);
        System.out.println(song1.toString());

        System.out.println();

        // add songs to the playlist
        for (int i = 0; i < titles.length - 1; i++) {
            new Song(titles[i], filenames[i], singers[i], durations[i], years[i]);
        }

        // Print first and last 3 songs
        for (int i = 0; i < Song.getSongs().length; i++) {
            if (i < 3 || i > 16) {
                System.out.println(Song.getSongs()[i].toString());
            }

        }

        System.out.println();

        // Current song info (The song added first)
        song1.play();

        System.out.println();

        // Previous song (which is the last)
        song1.previous();
        song1.play();

        System.out.println();

        // Next song (Which is the first song)
        song1.next();
        song1.play();

        System.out.println();

        // Sort by duration
        song1.sortDuration();
        for (int i = 0; i < 5; i++) {
            System.out.println(Song.getSongs()[i].toString());
        }

        System.out.println();

        // Make sure that current song is the same after sorting
        song1.play();

        System.out.println();

        // Sort by title
        song1.sortTitle();
        for (int i = 0; i < 5; i++) {
            System.out.println(Song.getSongs()[i].toString());
        }

        System.out.println();

        // Make sure that current song is the same after sorting
        song1.play();

        System.out.println();

        // Search by singer (valid and invalid)
        song1.searchSinger("IU");
        song1.searchSinger("Abu");

        System.out.println();

        // Search by title (valid and invalid)
        song1.searchTitle("Perfect");
        song1.searchTitle("Tonight");

        System.out.println();

        // show warning message if user wants to add a song when songlist is full
        Song song21 = new Song("Hey Jude", "musics/beatles", "The beatles", "3:11", 1996);
        System.out.println(song21.toString());
    }

}
