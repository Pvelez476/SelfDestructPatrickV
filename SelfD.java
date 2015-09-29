package com.example;

class SelfD {
    public static void main(String[] args) {
        int firstOfficer = 1;
        int secondOfficer = 2;
        int thirdOfficer = 3;
        String destruct = "accept";
        String code = "confirmed";

        System.out.println("Initiate Self Destruct Sequence");

        if (firstOfficer >=1) {
            System.out.println("Captain : Code 11A");
        }

        if (secondOfficer >=2) {
            System.out.println("First Officer : Code 11A2B");
        }

        if (thirdOfficer >=3) {
            System.out.println("Chief Engineer : Code 1B2B3");
        }
        if (destruct.equals("accept" )){
            System.out.println("Enter Final Code");
        }
        if (code.equals("confirmed"));{
            System.out.println("Captain : Zero-Zero-Zero Destruct Zero.");

            if (code.equals("confirmed"));{
                System.out.println("Self Destruct Sequence Initiated.");


            }
        }
    }

}