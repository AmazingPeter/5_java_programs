package com.company;

/*
Задача:
    Дана строка, состоящая из слов, разделенных пробелами и знаками препинания.
    Определить длину самого короткого слова.
 */
public class task_3 {
    public task_3() {
    }

    static void GetResult() {
        String s = "A834haf,a7k:s.ahaf 34if8ifdsg\' p4t  kerf  834hafa7ksahaf   kugrukh 95t8o9r 9rtg";
        String[] split_strings = s.split(" |\\.|,|:");

        int min_length = -1,i = 0;

        for(;i < split_strings.length;i++)
            if(split_strings[i].length() > 0) {
                min_length = split_strings[i].length();
                break;
            }
        if(min_length != -1) {
            for (; i < split_strings.length; i++)
                if (split_strings[i].length() < min_length && split_strings[i].length() > 0) {
                    min_length = split_strings[i].length();
                }
            System.out.println(min_length);
        }
    }
}
