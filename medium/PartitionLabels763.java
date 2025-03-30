import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class PartitionLabels763{
    HashMap<Character,Integer> charToLastPos = new HashMap<Character,Integer>();

    public List<Integer> solution(String s){
        List<Integer> sol = new ArrayList<>();

        for(int i =0; i <s.length(); i++){
            charToLastPos.put(s.charAt(i), i);
        }

        System.out.println(charToLastPos);
        int size=0;
        int end =0;
        for(int i=0; i < s.length(); i++){
            size+=1;
            if(charToLastPos.get(s.charAt(i))>end){
                end = charToLastPos.get(s.charAt(i));
            }   
            if(i==end){
                sol.add(size);
                size = 0;
            }
        }
        return sol;
        
        
    }

}