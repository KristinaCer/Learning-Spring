package com.cognizant.springlearn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Country {
    @Size(min = 2, max = 2, message = "Country code should be 2 characters")
    @NotNull
    private String code;
    private String name;
}
