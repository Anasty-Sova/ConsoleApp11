package com.mrt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("mass.txt");
        if (file.exists())
        {
            System.out.println("File existed");
        }
        else {
            System.out.println("File created!");
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;
        int sum = 0;
        int num = 0;
        int cout =0;


    while ((str =bufferedReader.readLine())!=null)
    {

        num = Integer.parseInt(str);
        if (num%2!=0)
        {
            cout++;
        }
    }
        System.out.println(cout);
    }
    
}
