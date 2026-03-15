package org.prog.session16.ApiHomeWork16.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode
public class ResultsDto {
    private List<PersonDto> results;
}
