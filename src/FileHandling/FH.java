package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FH {
    public static void main(String[] args) throws IOException {

        //CREATING A FILE
//        System.out.println("Starting My File");
//        String path="C:\\Users\\Admin\\IdeaProjects\\Java\\src\\FileHandling\\test.txt";
//        File f=new File(path);
//        FileWriter fw=new FileWriter(f);
//        BufferedWriter bw=new BufferedWriter(fw);
//        bw.write("Hello Bindu");
//        bw.close();
//        fw.close();

        //Adding data into Existing file

//        System.out.println("Starting My File");
//        String path="C:\\Users\\Admin\\IdeaProjects\\Java\\src\\FileHandling\\test.txt";
//        File f=new File(path);
//        FileWriter fw=new FileWriter(f,true);
//        BufferedWriter bw=new BufferedWriter(fw);
//        Scanner sc=new Scanner(System.in);
//        String inp=sc.nextLine();
//        bw.newLine();
//        bw.write(inp);
//        bw.close();
//        fw.close();

        //read

//        System.out.println("Starting My File");
//        String path="C:\\Users\\Admin\\IdeaProjects\\Java\\src\\FileHandling\\test.txt";
//        File f=new File(path);
//        FileReader fr=new FileReader(f);
//        BufferedReader br=new BufferedReader(fr);
//        int ch;
//        int c=0;
//        while ((ch=br.read())!=-1){
//            System.out.print((char)ch);
//            c++;
//        }
//        System.out.println(c);
//    }
//}


        System.out.println("Starting My File");
        String path = "C:\\Users\\Admin\\IdeaProjects\\Java\\src\\FileHandling\\test.txt";
        File f1 = new File(path);
        File f2 = new File("C:\\Users\\Admin\\IdeaProjects\\Java\\src\\FileHandling\\test2.txt");
        FileInputStream fis1 = new FileInputStream(f1);
        FileOutputStream fos2 = new FileOutputStream(f2);
        int ch;
        while ((ch = fis1.read()) != -1) {
            System.out.println((char) ch);
            fos2.write(ch);
        }
        fis1.close();
        fos2.close();
    }
}