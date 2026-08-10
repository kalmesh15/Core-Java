package com.xworkz.comparlearning.comparator.movie;

import com.xworkz.comparlearning.dto.MovieDto;

import java.util.Comparator;

public class MovieLanguageComparator implements Comparator<MovieDto> {
    @Override
    public int compare(MovieDto o1, MovieDto o2) {
        return o1.getLanguage().compareTo(o2.getLanguage());
    }
}
