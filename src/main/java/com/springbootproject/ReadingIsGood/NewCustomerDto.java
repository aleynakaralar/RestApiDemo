package com.springbootproject.ReadingIsGood;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NewCustomerDto {
    private int id;
    private String name;

}
