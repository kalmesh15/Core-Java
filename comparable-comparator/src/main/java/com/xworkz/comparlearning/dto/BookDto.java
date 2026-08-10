package com.xworkz.comparlearning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto implements Comparator<BookDto> {

    private int bookId;
    private String bookName;
    private  String Author;
    private  int pageCount;
    private int publishYear;
    private double price;


    @Override
    public int compare(BookDto o, BookDto o1) {
        return o.getBookId()- o1.getBookId();
    }
}
