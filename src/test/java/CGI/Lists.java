package CGI;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        a.add("test");
        System.out.println(a.get(0));
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("noe");
        System.out.println(a1.get(0));
        System.out.println(a1.remove(0));
        System.out.println(a1);
        StringBuilder sb = new StringBuilder("new");
        sb.append("test");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer("new");
        sb1.append("test");
        System.out.println(sb1);
    }
}
