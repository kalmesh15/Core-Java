class CricBuz {

    private String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String teamName) {
        boolean isAdded = false;

        if(teamName != null && !teamName.isEmpty()) {
            if(index < this.teamNames.length) {
                this.teamNames[index++] = teamName;
                isAdded = true;
            } else {
                System.out.println("The team list is full. Cannot add more teams.");
            }
        } else {
            System.out.println("Please enter a valid team name.");
        }

        return isAdded;
    }

    public void getTeams() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of cricket teams");
        System.out.println("------------------------------------------");

        for(String team : teamNames) {
            System.out.println("Team Name: " + team);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteTeam(int index) {
        System.out.println("Deleting the team at index: " + index);
        teamNames[index] = null;
    }

    public void updateTeam(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the team at index: " + index);
            teamNames[index] = name;
        } else {
            System.out.println("Please enter a valid team name.");
        }
    }
}