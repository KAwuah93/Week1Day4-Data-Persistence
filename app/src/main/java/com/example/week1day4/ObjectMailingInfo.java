package com.example.week1day4;

import android.os.Parcel;
import android.os.Parcelable;

public class ObjectMailingInfo implements Parcelable {

    private String fName, lName, address, state, zip, city;

    protected ObjectMailingInfo(Parcel in) {
        fName = in.readString();
        lName = in.readString();
        address = in.readString();
        state = in.readString();
        zip = in.readString();
        city = in.readString();
    }

    public static final Creator<ObjectMailingInfo> CREATOR = new Creator<ObjectMailingInfo>() {
        @Override
        public ObjectMailingInfo createFromParcel(Parcel in) {
            return new ObjectMailingInfo(in);
        }

        @Override
        public ObjectMailingInfo[] newArray(int size) {
            return new ObjectMailingInfo[size];
        }
    };

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ObjectMailingInfo(String fName, String lName, String address, String city, String state, String zip) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.state = state;
        this.zip = zip;
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(fName);
        parcel.writeString(lName);
        parcel.writeString(address);
        parcel.writeString(state);
        parcel.writeString(zip);
        parcel.writeString(city);
    }
}
