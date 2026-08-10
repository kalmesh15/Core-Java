package com.xworkz.comparlearning.comparator.book;

import com.xworkz.comparlearning.dto.BookDto;

import java.util.Comparator;

public class BookPageCountComparator implements Comparator<BookDto> {
    @Override
    public int compare(BookDto o1, BookDto o2) {
        return o1.getPageCount()-o2.getPageCount();
    }
}
