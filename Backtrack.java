public class Backtrack {
    public static void permutation( String str, String pera, int indx){
        if(str.length() == 0){
            System.out.println(pera);
            return;
        }

        for(int i =0; i < str.length(); i++){
            char currentchar = str.charAt(i);
            String newwsrt = str.substring(0, i) + str.substring(i+1);

            permutation(newwsrt, pera + currentchar,indx+1);
        }

    }
    public static void main(String args[]){
        String str = "ABC";
        permutation(str,"", 0);
    }
}
