import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class M2{
    public static void main(String[]args){
        String filePath="C:\\Users\\jeffrey.samuel\\Downloads\\Java Training\\context.txt";
        HashMap<String,Integer>hash=new HashMap<>();
        try(BufferedReader br= new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=br.readLine())!=null){
                String[]words=line.split("\\W+");
                for(String word:words){
                    word=word.toLowerCase();
                    hash.put(word,hash.getOrDefault(word,0)+1);
                }
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        for(Map.Entry m:hash.entrySet()){
            System.out.println(m.getKey() + ": " + m.getValue());
        }
        }}