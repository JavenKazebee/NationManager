package com.krazytar;

import java.util.Scanner;

public class InputManager {
    Scanner scanner = new Scanner(System.in);
    // Get user input from console
    public String[] getInput() {
        String rawInput =  scanner.nextLine();
        // Split input into array
        return rawInput.split(" ");
    }
    // What to do with console input
    public void processInput(String[] input) {
        switch(input[0]) {
            case "nn":
        }
    }
}
