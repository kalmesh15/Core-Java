class ElevatorExecutor{
    public static void main(String[] args){

        boolean isCreate;

        isCreate = Elevator.createElevator("Otis","8 Persons","1m/s","10","Passenger","Electric","AutoBrake");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator(null,"8 Persons","1m/s","10","Passenger","Electric","AutoBrake");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Otis","","1m/s","10","Passenger","Electric","AutoBrake");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Otis","8 Persons","","10","Passenger","Electric","AutoBrake");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Otis","8 Persons","1m/s","","Passenger","Electric","AutoBrake");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Otis","8 Persons","1m/s","10","","Electric","AutoBrake");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Otis","8 Persons","1m/s","10","Passenger","","AutoBrake");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Otis","8 Persons","1m/s","10","Passenger","Electric","");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("","","","","","","");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator(null,null,null,null,null,null,null);
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Kone","10 Persons","1.5m/s","15","Passenger","Electric","Sensor");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Schindler","6 Persons","1m/s","8","Passenger","Electric","Alarm");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("","","","","","","");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Thyssen","12 Persons","2m/s","20","Cargo","Hydraulic","EmergencyStop");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("","","","","","","");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Test","Test","Test","Test","Test","Test","Test");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("","","","","","","");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Elevator.createElevator("Otis","8 Persons","1m/s","10","Passenger","Electric","AutoBrake");
        if(isCreate){
            Elevator.getElevatorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

    }
}