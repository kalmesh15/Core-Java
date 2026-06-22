package com.xworkz.netflixapp.service;

import com.xworkz.netflixapp.dao.daoimpl.NetflixDaoImpl;
import com.xworkz.netflixapp.events.Event;
import com.xworkz.netflixapp.exception.EventNotAddedException;

public class NetflixService {
    NetflixDaoImpl netflixDao;
    public NetflixService(int size){
            netflixDao = new NetflixDaoImpl(size);
    }

    public boolean addEvent(Event event){
        boolean isEventAdded=false;
        try {
            if(event != null){
                if (event.getEventId() >0 && event.getEventName() != null && !event.getEventName().isEmpty()
                        && event.getEventType() !=null && !event.getEventType().isEmpty()){
                    netflixDao.addEvent(event);
                    isEventAdded=true;
                }
            }
            if (isEventAdded == false){
                throw  new EventNotAddedException("Event not should be null");
            }
        }catch (EventNotAddedException e){
            e.printStackTrace();
            e.getMessage();
        }
        return isEventAdded;
    }

    public void displayEvents(){
        try{
           netflixDao.displayEvents();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayEventById(int eventId){
        if (eventId > 0){
            netflixDao.displayEventById(eventId);
        }
    }
}
