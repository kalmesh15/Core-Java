class Tv {

    int tvId;
    String brand;

    Channel channel;

    public void getTvDetail() {

        System.out.println("--------------------------------");
        System.out.println("TV Details");
        System.out.println("TV Id: " + this.tvId);
        System.out.println("TV Brand: " + this.brand);

        this.channel.getChannelDetail();
    }
}