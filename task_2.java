package com.company;

/*
Задача:
 Дана строка символов.
 Группы символов, разделенные одним или несколькими пробелами и не содержащие пробелов внутри себя,
 будем называть словами. В самом длинном слове заменить все буквы «a» на «b».
 */
public class task_2 {
    public task_2() {
    }

    static void GetResult() {
        String in = "A834hafa7ksahaf 34if8ifdsg\' p4t  kerf  834hafa7ksahaf   kugrukh 95t8o9r 9rtg";
        String[] arr = in.split(" ");
        StringBuilder result = new StringBuilder();
        int maxLen = 0;

        for(String s : arr) {
            if(s.length() > maxLen) {
                maxLen = s.length();
            }
        }

        for(String s : arr) {
            if(s.length() == maxLen) {
                result.append(s.replaceAll("a|A", "b")).append(" ");
            } else {
                result.append(s).append(" ");
            }
        }

        result.toString();
        System.out.println(result);
    }
}
