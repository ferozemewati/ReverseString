

/*
public class StringReverse {
    public static void main(String[] args) {
        String s="Ferozemewati";
        char arr[]=s.toCharArray();
        String newString=" ";
        for (int i=arr.length-1; i>=0; i--){
            newString=newString+arr[i];
        }
        System.out.println(newString);
    }
}
*/


/*
public class StringReverse {
    public static void main(String[] args) {
        String s="Ferozemewati";
        char arr[]=s.toCharArray();
        String newString=" ";
        for (int i= arr.length-1; i>=0; i--){
            newString=newString+arr[i];
        }
        System.out.println(newString);
    }
}
*/

/*
public class StringReverse {
    public static void main(String[] args) {
        String s="Ferozekk";
        int str=s.length()-1;
        String newString=" ";
        for (int i=str; i>=0; i--){
            newString=newString+s.charAt(i);
        }
        System.out.println(newString);
    }
}
*/


/*
class RevStr{
    public void finstr(){
        String s="Feroze Khan Mewati";
        char arr[]=s.toCharArray();
        int i=0, j=s.length()-1;
        while (i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++; j--;
        }
        String fkm=String.valueOf(arr);
        System.out.println(fkm);
    }
}
public class StringReverse {
    public static void main(String[] args) {
        RevStr obj=new RevStr();
        obj.finstr();
    }
}
*/


//Wap to reverse a string using array.  method:-2

//        class RevStrr {
//            public void findRS() {
//                String name = "Feroze khan mewati";
//                char arr[] = name.toCharArray();
//                String newString = " ";
//                for (int i = arr.length - 1; i >= 0; i--) {
//                    newString = newString + arr[i];
//                }
//                System.out.println(newString);
//            }
//        }

//public class Chap3_String{
//    public static void main(String[] args) {
//        RevStrr obj= new RevStrr();
//        obj.findRS();
//    }
//}



// Wap to reverse a string to using split method.

        class RevvStr{
            public void findRs(){
                String name="Aarif Ali Saifi";
                int i=name.length()-1;
                String newString=" ";
                while (i>=0){
                    while (i>=0 && name.charAt(i)==' ') i--;
                    int j=i;
                    if (i<=0)break;
                    while (i>=0 && name.charAt(i)!=' ') i--;
                    if (newString.isEmpty()){
                        newString=newString+(name.substring(i+1,j+1));
                    }
                    else {
                        newString=newString+(' '+name.substring(i+1,j+1));
                    }
                }
                System.out.println(newString);
            }
        }

        public class StringReverse {
            public static void main(String[] args) {
                RevvStr obj=new RevvStr();
                obj.findRs();
            }
        }

