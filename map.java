import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Map.Entry;
public class map {
    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<>();
        map.put("T", 1010);

        map.put("H", 500);
    
        map.put("O", 100);
    
        map.put("R", 600);
    
        map.forEach((T,H)->System.out.println(T+"="+H));
    
        System.out.println("After Sorting by value");
    
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
    
        list.sort(Entry.comparingByValue());
    
        list.forEach(System.out::println);
    
      }
    
    }
    

