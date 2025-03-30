import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class PartitionLabels763{
    HashMap<Integer, Character> charToLastPos = new HashMap<Integer,Character>();

    public List<Integer> solution(String s){
        List<Integer> sol = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            charToLastPos.put(i,s.charAt(i));
            System.out.println("i: "+i+", charAtI: "+s.charAt(i));
            System.out.println("CharToLastPos.get(i) = "+charToLastPos.get(i));
        }
        
        int size=0;
        int end =0;
        for(int i=0; i < charToLastPos.size(); i++){
            size+=1;
            if(charToLastPos.get(i)>end){
                end = charToLastPos.get(i);
            }   
            if(i==end){
                sol.add(size);
                size = 0;
            }
        }
        return sol;
        
        
    }

}