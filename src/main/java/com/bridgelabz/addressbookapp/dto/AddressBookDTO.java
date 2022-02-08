package com.bridgelabz.addressbookapp.dto;


import lombok.Data;

@Data
public class AddressBookDTO {
    public String FirstName;

    public String LastName;

    public String Address;

    public String PhoneNum;

    public String City;

    public String State;

    public String Zip;

    @Override
    public String toString() {
        return "AddressBookDTO [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address
                + ", PhoneNum=" + PhoneNum + ", City=" + City + ", State=" + State + ", Zip=" + Zip + "]";
    }
}

