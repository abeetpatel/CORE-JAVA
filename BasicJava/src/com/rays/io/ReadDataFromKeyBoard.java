package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadDataFromKeyBoard {

    public static void main(String[] args) throws Exception {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(ir);

        System.out.println("Enter your data (type 'bye' to exit):");

        PrintWriter pr = new PrintWriter(new FileWriter("D://IO//temp.txt"));

        String line = r.readLine();

        while (!line.equals("bye")) {
            // Split the line based on spaces or other delimiters
            String[] parts = line.split(" "); // Change delimiter if needed

            // Write each part to the file
            for (String part : parts) {
                pr.write(part + "\n");
                System.out.println(part);
            }

            line = r.readLine();
        }

        pr.close();
    }
}
