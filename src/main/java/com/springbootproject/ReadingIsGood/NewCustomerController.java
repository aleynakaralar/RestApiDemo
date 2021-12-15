package com.springbootproject.ReadingIsGood;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/newCustomer")
public class NewCustomerController {
    private List<NewCustomerDto> newCustomerDtoList = new ArrayList<>();

    @PostMapping
    public ResponseEntity<List<NewCustomerDto>> save(@RequestBody NewCustomerDto  newCustomerDto){
        newCustomerDtoList.add(newCustomerDto);
        return ResponseEntity.ok(newCustomerDtoList);
    }

    @GetMapping
    public ResponseEntity<List<NewCustomerDto>> list(){
        return ResponseEntity.ok(newCustomerDtoList);
    }
    //TODO delete user by id
}
