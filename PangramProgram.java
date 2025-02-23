import java.util.*;
public class PangramProgram {
    public static void main(String[] args) {
        String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        boolean result = false;
        ArrayList<Character> ch = new ArrayList<>();
        String sen = "abcdefghijklmnopqrstuvwxyz";
        char na[] = sen.toCharArray();
        for(int i = 0; i < sen.length(); i++){
            ch.add(na[i]);
        }
        System.out.println(ch);

        for (int j = 0; j < sentence.length(); j++) {
            if (ch.contains(sentence.charAt(j))) {
                result = true;

            }else{
                result = false;
                break;
            }

        }



        System.out.println(result);
    }
}
