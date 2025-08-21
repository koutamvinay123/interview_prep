package LTI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ArrayList<String> al = new ArrayList();
//        al.add("java");
//        al.add("java");
//        System.out.println( al );
//        LinkedList<String> ll = new LinkedList<>();
//        System.out.println("this is linked" + ll );
//        Set<String> ss = new HashSet<>();
//        ss.add("java");
//        ss.add("java");
//        ss.add("you");
//        ss.add("ok");
//        System.out.println("this is set" + ss );
//        Set<String> sl = new LinkedHashSet<>();
//        sl.add("java");
//        sl.add("you");
//        sl.add("ok");
//        System.out.println("this is linkedset" + sl );
//        Set<String> treeSet = new TreeSet<>();
//        treeSet.add("Banana");
//        treeSet.add("Apple");
//        treeSet.add("Apple"); // duplicate ignored
//        System.out.println("TreeSet (sorted order): " + treeSet);
//        Map<Integer, String> m = new HashMap<>();
//        m.put(1,"value");
//        m.put(1,"text");
//        m.put(2,"value");
//        m.put(3,"value");
//        System.out.println("Map (sorted order): " + m);
//        Map<Integer, String> treeMap = new TreeMap<>();
//        treeMap.put(3, "Apple");
//        treeMap.put(1, "Banana");
//        treeMap.put(2, "Banana"); // duplicate values are allowed
//        System.out.println("TreeMap (sorted by keys): " + treeMap);
        int ar1[] = {1,2,4,5,6,7,8,9,10};
        int ar2[] = {1,2,4,5,6,5,6,7,10};

//        Map<Integer, Integer> countMap = new HashMap<>();
//        for (int n : ar2) countMap.put(n, countMap.getOrDefault(n, 0) + 1);
//
//        for (int n : ar1) {
//            System.out.println(n + " -> " + countMap.getOrDefault(n, 0));
//        }
//   for(int i :ar1){
//       int count = 0;
//       for(int j : ar2){
//           if(i==j){
//               count++;
//           }
//       }
//       System.out.println(i + " -> " + count);
//   }
        for (int i =0;i<ar1.length;i++){
            int count =0;
            for (int j =0; j<ar2.length;j++){
                if (ar1[i] == ar2[j]) {
                    count++;
                }
            }
            System.out.println(ar1[i] + " -> " + count);
        }
        String s = "I LOVE LTI LTI IS A GOOD COMPANY LTI IS IN CHENNAI LTI";
        String ar[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String ss : ar){
            if(ss.equals("LTI")){
                sb.append("LTIMindTree");
            }
            else{
                sb.append(ss);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
