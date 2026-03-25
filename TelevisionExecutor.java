class TelevisionExecutor {
    public static void main(String[] args) {

        Television obj = new Television();

        obj.addChannel("Star Sports");
        obj.addChannel("Zee Kannada");
        obj.addChannel("Colors Kannada");
        obj.addChannel("Sony TV");
        obj.addChannel("Discovery Channel");
        obj.addChannel("National Geographic");
        obj.addChannel("Cartoon Network");
        obj.addChannel("Pogo");
        obj.addChannel("Nickelodeon");
        obj.addChannel("Sun TV");
        obj.addChannel("Asianet");
        obj.addChannel("Zee News");
        obj.addChannel("Republic TV");
        obj.addChannel("BBC World News");
        obj.addChannel("History TV18");
        obj.addChannel("MTV India");
        obj.addChannel("VH1");

        obj.getChannels();
    }
}