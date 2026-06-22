package com.xworkz.netflixapp.events;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Event {
    private int eventId;
    private String eventName;
    private String eventType;


}
