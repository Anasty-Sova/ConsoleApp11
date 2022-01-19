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
            System.out.println("File created!");//fd
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;
        int sum = 0;
        int sa = 0;
        int co=42;

    while ((str =bufferedReader.readLine())!=null)
    {
        sum += Integer.parseInt(str);
        sa = sum / co;
    }
        System.out.println(sum);
        System.out.println(sa);
    }
}
