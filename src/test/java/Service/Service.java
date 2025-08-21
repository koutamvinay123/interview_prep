package Service;

public class Service {
    public static void main(String[] args) {
        String s ="Reverse";
        String s1 ="";
//        for (int i=s.length()-1;i>=0;i--){
//            s1 +=s.charAt(i);
//        }
//        System.out.println(s1 +"test");
//        for (int i =0;i<s.length();i++){
//            s1 +=s.charAt(i);
//        }
//        System.out.println(s1 +"test");
        String store = new StringBuilder(s).reverse().toString();
        System.out.println(store);
        char[] ch = s.toCharArray();
        for (char c:ch) {
            System.out.println(c);
        }
        int[] arr = {2, 4, 5, 9, 7, 3};
        int sum=0;
        for (int i =0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];
            for (int k =0; k<arr.length;k++) {
                if (sum == arr[k]) {
                    System.out.println(arr[i] + "+" + arr[j] + "is" + sum);
                    return;
                }
            }
            }
        }
    }
}
