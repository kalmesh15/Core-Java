class WonderlaManager {

    private String waterGames[] = new String[20];
    int index;

    public boolean addGame(String game) {
        boolean isAdded = false;

        if(game != null && !game.isEmpty()) {
            if(index < this.waterGames.length) {
                this.waterGames[index++] = game;
                isAdded = true;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Invalid Game Name");
        }

        return isAdded;
    }

    public void getGames() {
        System.out.println("------ Wonderla Water Games ------");
        for(String g : waterGames) {
            System.out.println("Game: " + g);
        }
    }

    public void deleteGame(int index) {
        waterGames[index] = null;
    }

    public void updateGame(int index, String name) {
        if(name != null && !name.isEmpty()) {
            waterGames[index] = name;
        }
    }
}