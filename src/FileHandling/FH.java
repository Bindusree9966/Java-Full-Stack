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

        System.out.println("Starting My File");
        String path="C:\\Users\\Admin\\IdeaProjects\\Java\\src\\FileHandling\\test.txt";
        File f=new File(path);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int ch;
        int c=0;
        while ((ch=br.read())!=-1){
            System.out.print((char)ch);
            c++;
        }
        System.out.println(c);
    }
}
