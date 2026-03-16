class Dance {

    int danceId;
    String danceStyle;

    Form form;

    public void getDanceDetail(){

        System.out.println("--------------------------------");
        System.out.println("Dance Details");
        System.out.println("Dance Id: " + this.danceId);
        System.out.println("Dance Style: " + this.danceStyle);

        this.form.getFormDetail();

    }
}