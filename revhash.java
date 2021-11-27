public class revhash {
    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    static final String letters = "cdefghijlmnoqstuvxz";

    public static String revHash(long h) {
        String ans = "";
        while (h>7) {
            ans = letters.charAt((int)(h%23)) + ans;
            h = h/23;
        }
        return ans;
    }
    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}

