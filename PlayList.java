class PlayList {

    private String songNames[] = new String[15];
    int index;

    public boolean addSong(String songName) {
        boolean isAdded = false;

        if(songName != null && !songName.isEmpty()) {
            if(index < this.songNames.length) {
                this.songNames[index++] = songName;
                isAdded = true;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Invalid Song Name");
        }

        return isAdded;
    }

    public void getSongs() {
        System.out.println("------ PlayList Songs ------");
        for(String s : songNames) {
            System.out.println("Song: " + s);
        }
    }

    public void deleteSong(int index) {
        songNames[index] = null;
    }

    public void updateSong(int index, String name) {
        if(name != null && !name.isEmpty()) {
            songNames[index] = name;
        }
    }
}