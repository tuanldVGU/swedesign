package org.translator.GUI;

import org.translator.control.TranslateModule;

import java.util.HashMap;
import java.util.Scanner;
    public class TranslatorConsole {
        private static Scanner scan;
        private static String input;
        private static String[] inputArr;
        private static HashMap<String, String> result;

        static {
            scan = new Scanner(System.in);
            input = scan.nextLine();
            inputArr = null;
            result = new HashMap();
        }

        public TranslatorConsole() {
        }

        public static void readInput() {
            inputArr = input.split(" ");
            if (inputArr[0].equals("translate")) {
                try {
                    result = TranslateModule.translateMethod(inputArr[1].split(";"));
                } catch (Exception var1) {
                    result = TranslateModule.translateMethod(inputArr[1]);
                }
            }

        }

        public static HashMap<String,String> display() {
            System.out.println(result);
            return result;
        }
}
