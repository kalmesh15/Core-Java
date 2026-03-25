class NetflixManager {

    private String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String webSeries) {
        boolean isAdded = false;

        if(webSeries != null && !webSeries.isEmpty()) {
            if(index < this.webSeries.length) {
                this.webSeries[index++] = webSeries;
                isAdded = true;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Invalid Web Series");
        }

        return isAdded;
    }

    public void getWebSeries() {
        System.out.println("------ Netflix Web Series ------");
        for(String s : webSeries) {
            System.out.println("Series: " + s);
        }
    }

    public void deleteWebSeries(int index) {
        webSeries[index] = null;
    }

    public void updateWebSeries(int index, String name) {
        if(name != null && !name.isEmpty()) {
            webSeries[index] = name;
        }
    }
}