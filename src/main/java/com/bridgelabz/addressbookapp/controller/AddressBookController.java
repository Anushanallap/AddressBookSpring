package com.bridgelabz.addressbookapp.controller;


import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookapp")
public class AddressBookController {


    @Autowired
    IAddressBookService AddressBookService;

    //http://localhost:8080/addressbookapp/get
    @GetMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData()
    {

        List addressBookDataList = AddressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressBookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);    }

    //http://localhost:8080/addressbookapp/get/1
    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId)
    {
        AddressBookData addressBookData = AddressBookService.getAddressBookDataById(personId);
        ResponseDTO respDTO = new ResponseDTO("Get Call By Id Success", addressBookData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);    }

    //http://localhost:8080/addressbookapp/create
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO)
    {

        AddressBookData addressBookData = AddressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Address book data created", addressBookData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);    }

    //http://localhost:8080/addressbookapp/update/1
    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId, @RequestBody AddressBookDTO addressBookDTO)
    {

        AddressBookData addressBookData = AddressBookService.updateAddressBookData(personId, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("updated adressBook data", addressBookDTO);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);    }

    //http://localhost:8080/addressbookapp/delete/1
    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("personId") int personId)
    {

        AddressBookService.deleteAddressBookData(personId);
        ResponseDTO respDTO = new ResponseDTO("deleted adressBook data with personId :", personId);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);    }
}
