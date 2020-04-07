package com.fym.main.io;

        import java.io.FileNotFoundException;
        import java.util.Scanner;

/**
 * Created by lenovo on 2020/4/6.
 */
public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //1.扫描文件中的数据
        // Scanner scanner = new Scanner(new File("file/scanner.txt"),"UTF-8");
        //2.扫描键盘输入的数据
        //Scanner scanner = new Scanner(System.in);
        //3.扫描字符串中的数据
        Scanner scanner = new Scanner("java是一种编程语言");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println("ECHO:"+line);
        }
        scanner.close();
    }
}
