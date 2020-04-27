package com.company.interfaceEx;

public class Main {
    public static void main(String[] args) {
        ITelephone timsphone;
        timsphone = new DeskPhone(2280390);
        timsphone.powerOn();
        timsphone.callPhone(2280390);
        timsphone.answer();

        timsphone = new MobilePhone(909280);
        timsphone.powerOn();
        timsphone.callPhone(246879);
        timsphone.answer();
    }

}
