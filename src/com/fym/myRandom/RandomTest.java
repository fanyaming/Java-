package com.fym.myRandom;

public class RandomTest {
    public static void main(String[] args) {
      /*  String[] beforeShuffle = new String[]{"0","1","2", "3", "4", "5", "6", "7",
                "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z"};
        List com.fym.list = Arrays.asList(beforeShuffle);
        Collections.shuffle(com.fym.list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < com.fym.list.size(); i++) {
            sb.append(com.fym.list.get(i));
        }
        String afterShuffle = sb.toString();
        System.out.println(afterShuffle);
        String result = afterShuffle.substring(5, 11);
        System.out.print(result);*/
        System.out.println((int)((Math.random()*9+1)*100000));
    }
}

