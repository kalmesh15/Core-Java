class MusicAlbum {

    int albumId;
    int totalSongs;

    double albumPrice;
    double ratingScore;

    String albumTitle;
    String artistName;
    String genre;

    boolean released;
    boolean digitalAvailable;

    char albumGrade;

    long albumCode;

    float durationHours;

    MusicAlbum(int albumId, int totalSongs){
        this.albumId = albumId;
        this.totalSongs = totalSongs;
    }

    MusicAlbum(double albumPrice, double ratingScore){
        this.albumPrice = albumPrice;
        this.ratingScore = ratingScore;
    }

    MusicAlbum(String albumTitle, String artistName, String genre){
        this.albumTitle = albumTitle;
        this.artistName = artistName;
        this.genre = genre;
    }

    MusicAlbum(boolean released, boolean digitalAvailable){
        this.released = released;
        this.digitalAvailable = digitalAvailable;
    }

    MusicAlbum(char albumGrade){
        this.albumGrade = albumGrade;
    }

    MusicAlbum(long albumCode){
        this.albumCode = albumCode;
    }

    MusicAlbum(float durationHours){
        this.durationHours = durationHours;
    }

}