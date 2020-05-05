package com.company.Week7_Pre_Tutorial;

public class TestOutput {
    public static void main(String[] args) {
        MusicOrganizer musicOrganizer = new MusicOrganizer();
        musicOrganizer.addFile("First album");
        musicOrganizer.addFile("Second album");
        musicOrganizer.addFile("Third album");
        musicOrganizer.displayCollection();
    }
}
