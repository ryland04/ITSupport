package com.company;

public class mobilePhone extends Device{
    public mobilePhone(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
    }

    @Override
    public String toString() {
        return "mobilePhone{" +
                "identificationCode='" + identificationCode + '\'' +
                ", makeAndModel='" + makeAndModel + '\'' +
                ", owner='" + owner + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairNotes='" + repairNotes + '\'' +
                ", priority=" + priority +
                '}';
    }
}
