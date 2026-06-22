package com.xworkz.netflixapp.dao.daoimpl;

import com.xworkz.netflixapp.NetflixRunner;
import com.xworkz.netflixapp.dao.OttDao;
import com.xworkz.netflixapp.events.Event;
import com.xworkz.netflixapp.exception.EventNotAddedException;

public class NetflixDaoImpl implements OttDao {

    Event[] events;

    public NetflixDaoImpl(int size){
        events=new Event[size];
    }
    int index;
    @Override
    public boolean addEvent(Event event) {
        boolean isEventAdded=false;
        try{
            if(event != null){
                events[index++]=event;
                isEventAdded = true;
            }
            if(isEventAdded == false){
                throw new EventNotAddedException("Event should not be null");
            }
        }catch (EventNotAddedException e){
            e.getMessage();
            e.printStackTrace();
        }

        return isEventAdded;
    }

    @Override
    public void displayEvents() {
        try{
            for (Event event:events){
                System.out.println(event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void displayEventById(int eventid) {
        try{
            for (Event event:events){
                if (eventid == event.getEventId()){
                    System.out.println(event);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
