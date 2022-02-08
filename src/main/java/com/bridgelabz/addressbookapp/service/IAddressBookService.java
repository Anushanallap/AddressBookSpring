package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IAddressBookService {


    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int personId);

    AddressBookData createAddressBookData(AddressBookDTO AddressBookDTO);

    AddressBookData updateAddressBookData(int personId, AddressBookDTO AddressBookDTO);

    void deleteAddressBookData(int personId);
}
