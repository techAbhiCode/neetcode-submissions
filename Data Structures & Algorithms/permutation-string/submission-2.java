class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s1.length(); i++){
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        HashMap<Character, Integer> windowMap = new HashMap<>();

        for(int i =0; i<s1.length(); i++){
            char c = s2.charAt(i);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

        }
        if(windowMap.equals(map)){
            return true;
        }
        for(int i = s1.length(); i<s2.length(); i++){
            char newChar = s2.charAt(i);
            windowMap.put(newChar, windowMap.getOrDefault(newChar, 0) + 1);

            char oldChar = s2.charAt(i - s1.length());

            if(windowMap.get(oldChar) == 1){
                windowMap.remove(oldChar);
            }else{
                windowMap.put(oldChar, windowMap.get(oldChar)-1);
            }

            if(windowMap.equals(map)){
                return true;
            }
        }


        return false;
        
    }
}
