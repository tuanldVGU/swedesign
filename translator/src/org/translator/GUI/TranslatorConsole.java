package org.translator.GUI;

import javafx.application.Application;
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
            display();
            System.out.println("Do you want to continue or see history: 1/2");
            input = scan.nextLine();
            if(input.equals("1"))
            {
                input = scan.nextLine();
                inputArr = null;
                result = new HashMap<>();
                readInput();
            }
            if(input.equals("2"))
            {
                System.out.println("run");
                Application.launch(TranslationView.class,"");
            }


        }

        public static HashMap<String,String> display() {
            System.out.println(result);
            return result;
        }
}
