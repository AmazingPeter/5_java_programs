package com.company;

/*
Задача:
    Дан массив слов. Заменить последние три символа слов,
    имеющих выбранную длину на символ "*".
 */
public class task_4 {
    public task_4() {
    }

    static void GetResult() {
        String[] in = {"jm","LTY0qi","PZB","baKc9341cq","PQZBJv7MQbY"};
        for(String s : in)
            if(s.length() > 3){
                StringBuilder tmp_str = new StringBuilder();
                for(int j = 0;j < s.length()-3;j++) {
                    tmp_str.append(s.charAt(j));
                }
                tmp_str.append("***");
                s = tmp_str.toString();
                System.out.println(s);
            }
    }
}
