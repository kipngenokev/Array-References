package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray=new int[5];
        int[] anotherArray=myIntArray;

        System.out.println("myIntArray ="+ Arrays.toString(myIntArray));
        System.out.println("AnotherArray ="+Arrays.toString(anotherArray));

        anotherArray[0]=1;
        System.out.println("after change myIntArray ="+Arrays.toString(myIntArray));
        System.out.println("after change anotherArray ="+Arrays.toString(anotherArray));

        //to check what can happen in the cas eof Strings
        String name ="John";
        String secondName =name;

        System.out.println(name);
        System.out.println(secondName);

        secondName="Victor";
        System.out.println(name);
        System.out.println(secondName);

        
    }
}
