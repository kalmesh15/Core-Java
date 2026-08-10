package com.xworkz.comparlearning.runner;


import com.xworkz.comparlearning.comparator.book.*;
import com.xworkz.comparlearning.dto.BookDto;

import java.util.*;

public class BookRunner {
    public static void main(String[] args) {
        BookDto bookDto=new BookDto(1,"The Alchemist","Paulo Coelho",172,1988,259);
        BookDto bookDto1=new BookDto(2,"Atomic Habit","James Clear",320,2018,470);
        BookDto bookDto2=new BookDto(3,"Harry Potter and the Philosopher's Stone","J.K. Rowling",223,1997,599);
        BookDto bookDto3=new BookDto(4,"The Monk Who Sold his Ferrari","Robin Sharma",198,1996,225);
        BookDto bookDto4=new BookDto(5,"Wings of Fire","A.P.J. Abdul Kalam",180,1999,450);
        BookDto bookDto5=new BookDto(6,"Rich Dad Poor Dad","Robert T. Kiyosaki",336,1997,399);
        BookDto bookDto6=new BookDto(7,"It ends with us","Collen hoover",384,2016,450);
        BookDto bookDto7=new BookDto(8,"Sapiens","Yuval noah Harari",443,2011,550);
        BookDto bookDto8=new BookDto(9,"The Psychology of Money","Morgan Housel",256,2020,350);
        BookDto bookDto9=new BookDto(10,"To kill a MockingBird","Harper Lee",281,1960,299);


//        List<BookDto> bookDtos=new ArrayList<>();
//        bookDtos.add(bookDto1);
//        bookDtos.add(bookDto);
//        bookDtos.add(bookDto2);
//        bookDtos.add(bookDto3);
//        bookDtos.add(bookDto4);
//        bookDtos.add(bookDto5);
//        bookDtos.add(bookDto6);
//        bookDtos.add(bookDto7);
//        bookDtos.add(bookDto8);
//        bookDtos.add(bookDto9);
//
//        System.out.println("Without sort");
//        for (BookDto book:bookDtos){
//            System.out.println(book);
//        }
//
//        Collections.sort(bookDtos, new BookDto());
//
//        System.out.println(" sort by id (comparator)");
//        for (BookDto book:bookDtos){
//            System.out.println(book);
//        }
//
//        Collections.sort(bookDtos , new BookAuthorComparator());
//
//        System.out.println(" sort by Author (comparator)");
//        for (BookDto book:bookDtos){
//            System.out.println(book);
//        }
//
//        Collections.sort(bookDtos, new BookNameComparator());
//
//        System.out.println(" sort by Book name (comparator)");
//        for (BookDto book:bookDtos){
//            System.out.println(book);
//        }
//        Collections.sort(bookDtos,new BookPageCountComparator());
//
//        System.out.println(" sort by page count (comparator)");
//        for (BookDto book:bookDtos){
//            System.out.println(book);
//        }
//
//        Collections.sort(bookDtos , new BookPriceComparator());
//
//        System.out.println(" sort by book price (comparator)");
//        for (BookDto book:bookDtos){
//            System.out.println(book);
//        }
//
//        Collections.sort(bookDtos, new BookPublishYearComparator());
//
//        System.out.println(" sort by publish year (comparator)");
//        for (BookDto book:bookDtos){
//            System.out.println(book);
//        }


        Map<Integer,String> map=new HashMap<>();
        map.put(14,"Kalmesh");
        map.put(354,"Prajwal");
        map.put(22,"Pranam");
        map.put(65,"Tarun");
        System.out.println(map);

        Set<Map.Entry<Integer,String>> entries=map.entrySet();

        System.out.println("---------------------For each loop(map)---------------------");
        for (Map.Entry entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("----------------------for each method(map)---------------------");
        map.forEach((i,s) -> System.out.println(i+" "+s));

        Map<Integer,BookDto> bookMap=new HashMap<>();
        bookMap.put(1,bookDto1);
        bookMap.put(2,bookDto3);
        bookMap.put(3,bookDto2);
        bookMap.put(4,bookDto5);
        bookMap.put(5,bookDto4);
        bookMap.put(6,bookDto6);
        System.out.println("-------------------------For each loop(bookMap)--------------------");
        for (Map.Entry<Integer,BookDto> bookDtoEntry:bookMap.entrySet()){
            System.out.println(bookDtoEntry.getKey()+" "+bookDtoEntry.getValue());
        }
        System.out.println("------------------For each method(bookMap)---------------------");
        bookMap.forEach((i,b)-> System.out.println(i+" "+b ));

      Map<String,Integer> map1=new HashMap<>();
      map1.put("kalmesh",22);
      map1.put("Prajwal",23);
      map1.put("Praveen",24);
      map1.put("Shivu",25);
      map1.put("Tarun",15);
      map1.put("Prakash",10);

        System.out.println("----------------------for each loop(map1)------------------");
        for (Map.Entry<String,Integer> entry:map1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("===========For Each Method(map1)============");
        map1.forEach((s,i)-> System.out.println(s+" "+i));

    }
}
