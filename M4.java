


import java.util.*;
public class M3{
    public static char findFirstNonRepeatedChar(String str) {
    
       
        HashMap<Character,Integer>hash=new HashMap<>();
        
                for(char w :str.toCharArray()){
                   
                    hash.put(w,hash.getOrDefault(w,0)+1);
                }
                
                for(Map.Entry<Character,Integer>entry:hash.entrySet()){
                    if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
    public static void  main(String[] args){
        String str = "GoodMorning";
        char result = findFirstNonRepeatedChar(str);
        
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        
    }
    
        }}