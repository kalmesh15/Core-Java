class StateExecutor {
    public static void main(String[] args) {

        State obj = new State();

        obj.addHighway("NH44");
        obj.addHighway("NH48");
        obj.addHighway("NH75");
        obj.addHighway("NH66");
        obj.addHighway("NH77");
        obj.addHighway("NH275");
        obj.addHighway("NH169");
        obj.addHighway("NH367");
        obj.addHighway("NH150A");

        obj.getHighways();
    }
}