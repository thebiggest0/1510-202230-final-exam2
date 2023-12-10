package ca.bcit.comp2522.finalexam.q2;


import com.google.gson.Gson;

import java.io.File;

import java.util.Scanner;

public class APIUrlReader {
    public String jsonString;

    public APIUrlReader() {
        jsonString = getJSONFromFile("/res/APIList.txt");
    }

    public static void main(String[] args) {
        APIUrlReader reader = new APIUrlReader();
    }

    public long getCountAPIs() {
        return 0;
    }

    public long getCountNoAuth() {
        return 0;
    }

    public long getCountHTTPS() {
        return 0;
    }

    public long getCountAnimalAPIs() {
        return 0;
    }

    public static String getJSONFromFile(String aFile) {
        String inline = "";
        try {

            Scanner scanner = new Scanner(new File(aFile));

            while (scanner.hasNext()) {
                inline += scanner.nextLine();
            }
            scanner.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return inline;
    }
}
