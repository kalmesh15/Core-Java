class MusicAlbumExecutor {

    public static void main(String[] args) {

        MusicAlbum a1 = new MusicAlbum(1201,12);
        System.out.println("The album id is " + a1.albumId);
        System.out.println("The total songs in the album are " + a1.totalSongs);

        MusicAlbum a2 = new MusicAlbum(199.5,4.8);
        System.out.println("The album price is " + a2.albumPrice);
        System.out.println("The album rating score is " + a2.ratingScore);

        MusicAlbum a3 = new MusicAlbum("Golden Hits","Arijit Singh","Melody");
        System.out.println("The album title is " + a3.albumTitle);
        System.out.println("The artist name is " + a3.artistName);
        System.out.println("The album genre is " + a3.genre);

        MusicAlbum a4 = new MusicAlbum(true,true);
        System.out.println("The album released status is " + a4.released);
        System.out.println("The digital availability is " + a4.digitalAvailable);

        MusicAlbum a5 = new MusicAlbum('A');
        System.out.println("The album grade is " + a5.albumGrade);

        MusicAlbum a6 = new MusicAlbum(778899001122L);
        System.out.println("The album code is " + a6.albumCode);

        MusicAlbum a7 = new MusicAlbum(1.5f);
        System.out.println("The album duration in hours is " + a7.durationHours);

    }
}