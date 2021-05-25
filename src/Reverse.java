public class Reverse {
    public static void reverseString(String string){
        for(int count = string.length()-1; count != -1 ;count --){
            char reverse = string.charAt(count);
            System.out.print(reverse);
        }
    }
}
