//TWO SUM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
//ROMAN TO INTEGER
import java.util.*;
class Solution {
    public static int romanToInt(String s) {
        Map<Character ,Integer> romanvalues=new HashMap<>();
        romanvalues.put('I',1);
        romanvalues.put('V',5);
        romanvalues.put('X',10);  
        romanvalues.put('L',50); 
        romanvalues.put('C',100);
        romanvalues.put('D',500);
        romanvalues.put('M',1000);
        int total=0;
        for(int i=0;i<s.length();i++){
            int currentvalue=romanvalues.get(s.charAt(i));
            if(i+1<s.length()){
                int nextValue=romanvalues.get(s.charAt(i+1));
                if(currentvalue<nextValue){
                    total-=currentvalue;
                }else{
                    total+=currentvalue;
                }
            }else{
                total+=currentvalue;
            }
        }    
            return total;
   }     
//LONGEST COMMON PREFIX
    class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
              prefix= prefix.substring(0,prefix.length()-1);
            }
            if (prefix.isEmpty()) return "";
        }
        return prefix;

        
        
    }
}
    
 
}
