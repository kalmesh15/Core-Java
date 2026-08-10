package com.xworkz.comparlearning.comparator.book;

import com.xworkz.comparlearning.dto.BookDto;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<BookDto> {
    @Override
    public int compare(BookDto o1, BookDto o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
