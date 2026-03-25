class Television {

    private String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channelName) {
        boolean isAdded = false;

        if(channelName != null && !channelName.isEmpty()) {
            if(index < this.channelNames.length) {
                this.channelNames[index++] = channelName;
                isAdded = true;
            } else {
                System.out.println("Channel list is full!");
            }
        } else {
            System.out.println("Invalid Channel Name!");
        }

        return isAdded;
    }

    public void getChannels() {
        System.out.println("\n===============================");
        System.out.println("      Television Channel List");
        System.out.println("=================================\n");

        for(String c : channelNames) {
            System.out.println("Channel: " + c);
        }

        System.out.println("\n=================================\n");
    }

    public void deleteChannel(int index) {
        System.out.println(" Removing channel at index: " + index);
        channelNames[index] = null;
    }

    public void updateChannel(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println(" Updating channel at index " + index);
            channelNames[index] = name;
        } else {
            System.out.println(" Invalid Channel Name!");
        }
    }
}