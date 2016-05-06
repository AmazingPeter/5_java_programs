package com.company;

/*
 Задача:
 Построить палиндром(текст наоборот) Dot saw I was Tod
 */
public class Stringbuilder {
    public Stringbuilder() {
    }

    static void GetResult() {
        String s = "Dot saw I was Tod";
        String[] split_strings = s.split(" ");
        StringBuilder result = new StringBuilder();
        result.append(split_strings[split_strings.length - 1]);

        for(int i = split_strings.length - 2; i >= 0; --i) {
            result.append(" ").append(split_strings[i]);
        }

        result.toString();
        System.out.println(result);
    }
}
