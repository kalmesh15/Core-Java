package com.xworkz.netflixapp;

import com.xworkz.netflixapp.events.Event;
import com.xworkz.netflixapp.service.NetflixService;

import java.util.Scanner;

public class NetflixRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of events to be added ");
        int size =scanner.nextInt();
        NetflixService netflixService = new NetflixService(size);


        String yesOrNo=null;
        do {
            System.out.println("Press 1 for add event");
            System.out.println("Press 2 for display All events");
            System.out.println("Press 3 for display  event by id");
            int option=scanner.nextInt();

            switch (option){
                case 1:
                    for (int index = 0; index < size; index++) {
                        Event event = new Event();
                        System.out.println("Enter the Event Id");
                        event.setEventId( scanner.nextInt());
                        System.out.println("Enter the event name");
                        scanner.nextLine();
                        event.setEventName(scanner.nextLine());
                        System.out.println("Enter the event Type");
                        event.setEventType(scanner.nextLine());
                        netflixService.addEvent(event);
                    }
                    break;
                case 2:
                    System.out.println("Display All events");
                    netflixService.displayEvents();
                    break;
                case 3:
                    System.out.println("Display event by Id");
                    netflixService.displayEventById(scanner.nextInt());
                    break;
                default:
                    System.out.println("Enter valid option!!!!!!!!!!!!!");

            }scanner.nextLine();

            System.out.println("Will you want to continue.....(yes/no)");

             yesOrNo=scanner.nextLine();


        }
        while(yesOrNo.equalsIgnoreCase("yes"));

        System.out.println("Thank-you for using application!!!!!!!!!!! ");


        scanner.close();
    }

}
