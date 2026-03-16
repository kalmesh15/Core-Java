class MusicInstrument {

    int instrumentId;
    String instrumentName;
    String type;
    int price;

    public void getInstrumentDetail(){

        System.out.println("Music Instrument Details");
        System.out.println("Instrument Id: " + this.instrumentId);
        System.out.println("Instrument Name: " + this.instrumentName);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);

    }
}