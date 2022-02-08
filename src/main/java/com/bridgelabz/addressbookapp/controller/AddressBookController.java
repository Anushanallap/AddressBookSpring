package com.bridgelabz.addressbookapp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    //http://localhost:8080/addressbook/get
    @GetMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getAddressBookData()
    {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    //http://localhost:8080/addressbook/get/1
    @GetMapping("/get/{personId}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("personId") int personId)
    {
        return new ResponseEntity<String> ("Get Call Success for id: "+personId, HttpStatus.OK);
    }

    //http://localhost:8080/addressbook/create
    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData()
    {
        return new ResponseEntity<String> ("Created address book Data for: ", HttpStatus.OK);
    }

    //http://localhost:8080/addressbook/update/1
    @PutMapping("/update/{personId}")
    public ResponseEntity<String> updateAddressBookData(@PathVariable("personId") int personId)
    {
        return new ResponseEntity<String> ("Updated address book Data for: "+personId, HttpStatus.OK);
    }

    //http://localhost:8080/addressbook/delete/1
    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("personId") int personId)
    {
        return new ResponseEntity<String> ("Delete Call Success for Id for: "+personId, HttpStatus.OK);
    }
}
