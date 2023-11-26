import java.util.*; // `*` it imports all class in a java.util package

public class java_util_package{
    public static void main(String[] args) {
        // ArrayList Example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java is");
        arrayList.add("High-level");
        arrayList.add("programming language");

        System.out.println("ArrayList Example:");
        for (String word : arrayList) {
            System.out.print(word + " ");
        }
        System.out.println();

        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        System.out.println("\nHashSet Example:");
        for (String fruit : hashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // HashMap Example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        System.out.println("\nHashMap Example:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterator Example
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("\nIterator Example:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Date Example
        Date currentDate = new Date();
        System.out.println("\nDate Example:");
        System.out.println("Current Date and Time: " + currentDate);

        // Calendar Example
        Calendar calendar = Calendar.getInstance();
        System.out.println("\nCalendar Example:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day of Month: " + calendar.get(Calendar.DAY_OF_MONTH));
    }
}