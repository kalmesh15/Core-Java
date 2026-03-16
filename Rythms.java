class Rythms {

    int rhythmId;
    String bandName;

    MusicInstrument musicInstrument;

    public void getRhythmDetail(){

        System.out.println("--------------------------------");
        System.out.println("Rythms Details");
        System.out.println("Rhythm Id: " + this.rhythmId);
        System.out.println("Band Name: " + this.bandName);

        this.musicInstrument.getInstrumentDetail();

    }
}