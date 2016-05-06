package com.company;

/*
Задача:
    Дан текст. Определите процентное отношение строчных и прописных букв к общему числу символов в нем.
 */
public class task_5 {
    public task_5() {
    }

    static void GetResult() {
        String in = "jmLT <, Y0qiPZ ' ' BbaKc9341c, () 334095 qPQZBJv7MQbY";
        double numWordSymbols = 0,numAllSymbols = 0;
        for(char c : in.toCharArray()){
            if(Character.isLowerCase(c) || Character.isUpperCase(c)) {
                numWordSymbols++;
            }
            else numAllSymbols++;
        }
        System.out.println((numWordSymbols/(numWordSymbols+numAllSymbols))*100+"%");
    }
}
