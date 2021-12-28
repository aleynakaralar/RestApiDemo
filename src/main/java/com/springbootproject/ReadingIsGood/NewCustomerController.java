package com.springbootproject.ReadingIsGood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/newCustomer")
public class NewCustomerController{


    private List<NewCustomerDto> newCustomerDtoList = new ArrayList<>();

    @PostMapping
    public ResponseEntity<List<NewCustomerDto>> save(@RequestBody NewCustomerDto newCustomerDto){
        newCustomerDtoList.add(newCustomerDto);
        return ResponseEntity.ok(newCustomerDtoList);
    }

    @GetMapping
    public ResponseEntity<List<NewCustomerDto>> list(){
        return ResponseEntity.ok(newCustomerDtoList);
    }
    //TODO delete user by id

    @DeleteMapping("/{id}")
    public ResponseEntity<List<NewCustomerDto>> delete(@PathVariable int id){
      //  System.out.println(newCustomerDtoList.size());
        Iterator<NewCustomerDto> iter = newCustomerDtoList.iterator();
        while(iter.hasNext()){
            NewCustomerDto customer = iter.next();
            if(customer.getId() == id){
                iter.remove();
            }

        }

        return ResponseEntity.ok(newCustomerDtoList);

    }
  }




