class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for( char i : s.toCharArray()){
            smap.put(i, smap.getOrDefault(i, 0) + 1);
        }

        for( char i : t.toCharArray()){
            tmap.put(i, tmap.getOrDefault(i, 0) + 1);
        }

        if(smap.equals(tmap)){
            return true;
        }

        return false;
    }
}
