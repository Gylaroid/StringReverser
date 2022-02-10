public class Main {
    public static void main(String[] args){
        String str = "The some string";
        strBuilderReverser(str);
        alternativeReverser(str);
    }

    private static void strBuilderReverser(String str){
        StringBuilder newBuilderStr = new StringBuilder(str.length());
        for(int i = str.length() - 1; i >= 0; i-- ){
            newBuilderStr.append(str.charAt(i));
        }
        System.out.println(newBuilderStr);
    }

    private static void alternativeReverser(String str){
        char[] chArray = str.toCharArray();
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(chArray[i]);
        }
    }
}
