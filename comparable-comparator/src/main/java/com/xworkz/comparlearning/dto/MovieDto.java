package com.xworkz.comparlearning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto implements Comparable<MovieDto>{
    private int id;
    private String movieName;
    private String language;
    private String heroName;
    private String duration;
    private double budgetInCr;

    @Override
    public int compareTo(MovieDto o) {
        return this.id-o.getId();
    }
}
