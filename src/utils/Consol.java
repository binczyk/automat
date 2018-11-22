package utils;

import automat.State;

import java.util.Optional;
import java.util.Scanner;

public class Consol {

    public static String getWord() {
        Scanner scanner = new Scanner(System.in);
        print("Word:");
        String word = scanner.nextLine();
        return word.toLowerCase();
    }

    public static void printResult(State state, String word) {
        Optional<String> optional = Optional.ofNullable(word);

        if (state.isEndState()) {
            System.out.println(optional.filter(s -> !s.isEmpty()).orElse("<empty>") + " is ok");
        } else {
            System.out.println(optional.filter(s -> !s.isEmpty()).orElse("<empty>") + " is not ok");
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}
