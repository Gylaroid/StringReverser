public class Main {
    public static void main(String[] args){
        String str = "The some string";
        defaultReverser(str);
        splitReverser(str);
        strBuilderReverser(str);
        alternativeReverser(str);
    }

    //Warning: String concatenation '+=' in loop
    private static void defaultReverser(String str){
        String newStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }

    //Warning: String concatenation '+=' in loop
    private static void splitReverser(String str){
        String newStr = "";
        String[] stringArray = str.split("");
        for(int i = stringArray.length - 1; i >= 0; i--){
            newStr += stringArray[i];
        }
        System.out.println(newStr);
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
