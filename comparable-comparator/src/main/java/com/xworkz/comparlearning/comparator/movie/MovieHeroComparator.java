package com.xworkz.comparlearning.comparator.movie;

import com.xworkz.comparlearning.dto.MovieDto;

import java.util.Comparator;

public class MovieHeroComparator implements Comparator<MovieDto> {
    @Override
    public int compare(MovieDto o1, MovieDto o2) {
        return o1.getHeroName().compareTo(o2.getHeroName());
    }
}
