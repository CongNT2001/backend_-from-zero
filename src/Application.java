package Application;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    public static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // ghi file tự tạo file
//        FileWriter fw=null;
//        BufferedWriter bw=null;
//
//        try {
//            fw = new FileWriter("abc.txt", true ); // tự động tạo nếu chưa tồn tại
//            bw = new BufferedWriter(fw);
//            bw.newLine();
//            bw.write("16/11/2001");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }finally {
//            if(bw != null && fw != null){
//                try {
//                    bw.close();
//                    fw.close();
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
        // đọc dữ liệu vào file
//        FileReader fr=null;
//        BufferedReader br=null;
//
//        try {
//            fr = new FileReader("abc.txt"); // mở file ra
//            br = new BufferedReader(fr); // khai báo ra truyền filereader ra
//            String line;
//            while ((line=br.readLine())!=null){
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage()); /// đôi bang tieng viet dc vd file ko tim thay
//        }catch (IOException e){
//            System.out.printf(e.getMessage());
//        }
//        finally {
//            if(fr!=null &&  br!=null){
//                try {
//                    fr.close();
//                    br.close();
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }

    }
}





























//package Application;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Application {
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        FileWriter fw = null;
//        BufferedWriter bw = null;
//
//        try {
//            // Tạo hoặc mở file abc.txt, chế độ ghi nối tiếp (append)
//            fw = new FileWriter("abc.txt", true);
//            bw = new BufferedWriter(fw);
//
//            System.out.println("=== GHI NỘI DUNG VÀO FILE ===");
//            System.out.println("Nhập nội dung (gõ 'exit' để kết thúc):");
//
//            while (true) {
//                System.out.print("> ");
//                String line = sc.nextLine();
//
//                // Gõ exit thì dừng chương trình
//                if (line.equalsIgnoreCase("exit")) {
//                    break;
//                }
//
//                // Ghi dòng vừa nhập vào file
//                bw.write(line);
//                bw.newLine(); // Xuống dòng
//            }
//
//            System.out.println("✅ Ghi file thành công! Xem file abc.txt để kiểm tra.");
//        } catch (IOException e) {
//            System.out.println("❌ Lỗi ghi file: " + e.getMessage());
//        } finally {
//            // Đóng tài nguyên
//            try {
//                if (bw != null) bw.close();
//                if (fw != null) fw.close();
//            } catch (IOException e) {
//                System.out.println("❌ Lỗi đóng file: " + e.getMessage());
//            }
//        }
//    }
//}