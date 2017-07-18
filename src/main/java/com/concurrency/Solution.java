package com.concurrency;

/**
 * Created by neha on 15/07/17.
 */
import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {

        this.magazineMap = addToMap(magazine);
        this.noteMap = addToMap(note);
    }

    public Map<String, Integer> addToMap(String str){
        Map<String, Integer> map = new HashMap<String, Integer>();
        StringTokenizer tokens = new StringTokenizer(str);
        while (tokens.hasMoreTokens())
        {
            String token = tokens.nextToken();

            if(map.get(token) == null){
                map.put(token, 1);
            }else{
                map.put(token, map.get(token) +1);
            }
        }

        return map;

    }


    public boolean solve() {
        boolean flag = false;
        Set<String> keys = noteMap.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            if(magazineMap.get(key)== null){
                continue;
            }
            else if(magazineMap.get(key) == noteMap.get(key)){
                flag= true;
            }
            else if(noteMap.get(key) < magazineMap.get(key)){
                flag= true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
