public class Main {
    public static void main(String[] args){
        String str = "The some string";
//        String newStr = "";
//        for(int i = str.length() - 1; i >= 0; i--){
//            newStr += str.charAt(i);
//        }
//        System.out.println(newStr);
//        newStr = "";


//        String[] stringArray = str.split("");
//        for(int i = stringArray.length - 1; i >= 0; i--){
//            newStr += stringArray[i];
//        }
//        System.out.println(newStr);
//        newStr = "";


        StringBuilder newBuilderStr = new StringBuilder(str.length());
        for(int i = str.length() - 1; i >= 0; i-- ){
            newBuilderStr.append(str.charAt(i));
        }
        System.out.println(newBuilderStr);
    }
}
