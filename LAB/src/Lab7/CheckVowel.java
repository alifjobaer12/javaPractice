package Lab7;

public class CheckVowel {
    public void checkVowel(String s) throws VoulException {
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                throw new VoulException("Found vowel " + s.charAt(i));
            }
        }
        System.out.println("Accepted");

    }
}
