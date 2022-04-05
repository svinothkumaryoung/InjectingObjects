package com.cognizant.injectingObjectPgm;

public class StudentName {
    private StudentDetails vinoth;
    private StudentDetails ashok;
    private StudentDetails roshan;

    public StudentDetails getVinoth() {
        return vinoth;
    }

    public void setVinoth(StudentDetails vinoth) {
        this.vinoth = vinoth;
    }

    public StudentDetails getAshok() {
        return ashok;
    }

    public void setAshok(StudentDetails ashok) {
        this.ashok = ashok;
    }

    public StudentDetails getRoshan() {
        return roshan;
    }

    public void setRoshan(StudentDetails roshan) {
        this.roshan = roshan;
    }

    public void printData()
    {
        System.out.println("*******Vinoth Details********");
        System.out.println("Register Number is "+getVinoth().getRegisterNo());
        System.out.println("Name  is "+getVinoth().getName());
        System.out.println("Address is "+getVinoth().getAddress());


        System.out.println("*******Ashok Details********");
        System.out.println("Register Number is "+getAshok().getRegisterNo());
        System.out.println("Name  is "+getAshok().getName());
        System.out.println("Address is "+getAshok().getAddress());

        System.out.println("*******Roshan Details********");
        System.out.println("Register Number is "+getRoshan().getRegisterNo());
        System.out.println("Name  is "+getRoshan().getName());
        System.out.println("Address is "+getRoshan().getAddress());

    }
}
