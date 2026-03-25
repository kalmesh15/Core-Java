class NetflixExecutor {
    public static void main(String[] args) {

        NetflixManager netflix = new NetflixManager();

        netflix.addWebSeries("Stranger Things");
        netflix.addWebSeries("Money Heist");
        netflix.addWebSeries("Dark");
        netflix.addWebSeries("Breaking Bad");
        netflix.addWebSeries("Better Call Saul");
        netflix.addWebSeries("The Witcher");
        netflix.addWebSeries("Narcos");
        netflix.addWebSeries("Sacred Games");
        netflix.addWebSeries("Mirzapur");
        netflix.addWebSeries("The Crown");
        netflix.addWebSeries("Lucifer");
        netflix.addWebSeries("Wednesday");
        netflix.addWebSeries("Ozark");
        netflix.addWebSeries("Peaky Blinders");
        netflix.addWebSeries("Black Mirror");
        netflix.addWebSeries("Squid Game");
        netflix.addWebSeries("You");
        netflix.addWebSeries("Delhi Crime");

        netflix.getWebSeries();
    }
}