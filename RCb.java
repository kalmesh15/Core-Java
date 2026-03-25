class RCb {

    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayer(String playerName) {
        boolean isAdded = false;

        if(playerName != null && !playerName.isEmpty()) {
            if(index < this.playerNames.length) {
                this.playerNames[index++] = playerName;
                isAdded = true;
            } else {
                System.out.println("The player list is full. Cannot add more players.");
            }
        } else {
            System.out.println("Please enter a valid player name.");
        }

        return isAdded;
    }

    public void getPlayers() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of RCB players");
        System.out.println("------------------------------------------");

        for(String player : playerNames) {
            System.out.println("Player Name: " + player);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deletePlayer(int index) {
        System.out.println("Deleting the player at index: " + index);
        playerNames[index] = null;
    }

    public void updatePlayer(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the player at index: " + index);
            playerNames[index] = name;
        } else {
            System.out.println("Please enter a valid player name.");
        }
    }
}