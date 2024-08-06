import java.util.*;
public class M1{
    public static void main(String[]args){
        String str="example";
        System.out.println(str);
        HashMap<Character,Integer>freq=new HashMap<>();
        
        for(char c:str.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        
        System.out.println(freq);
        }
    }
