package com.xworkz.netflixapp.dao;

import com.xworkz.netflixapp.events.Event;

public interface OttDao {
    public boolean addEvent(Event event);
    public void displayEvents();
    public void displayEventById(int eventid);

}
