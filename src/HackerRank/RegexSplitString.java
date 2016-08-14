package HackerRank;

import java.io.*;
import java.util.*;

public class RegexSplitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if(s.length()>400000){
            System.out.println("");
        }else if(s.length()==0){
            System.out.println("0");
        }
            else{
            String[] splitter = s.split("\\s*[^a-zA-Z]+\\s*");
        
        System.out.println(splitter.length);
        
        for(String k:splitter)
            System.out.println(k);
        }
        
        

        // Write your code here.
    }
}

