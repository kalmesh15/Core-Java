package com.xworkz.comparlearning.comparator.movie;

import com.xworkz.comparlearning.dto.MovieDto;

import java.util.Comparator;

public class MovieBudgetComparator implements Comparator<MovieDto> {
    @Override
    public int compare(MovieDto o1, MovieDto o2) {
        return Double.compare(o1.getBudgetInCr(), o2.getBudgetInCr());
    }
}
