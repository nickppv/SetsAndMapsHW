import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.print("Task 1: ");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Task 2
        // соооортировка пузырькооооом
        System.out.print("Task 2: ");
        nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 9, 11, 8, 15, 16, 10));
        boolean condition = true;
        while (condition) {
            condition = false;
            for (int i = 0; i < nums.size()-1; i++) {
                if (nums.get(i) > nums.get(i+1)) {
                    int temp = nums.get(i);
                    nums.set(i, nums.get(i+1));
                    nums.set(i+1, temp);
                    condition = true;
                }
            }
        }

        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Task 3
        System.out.print("Task 3: ");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "адын!", "три", "адын!", "ноль", "три", "ноль", "пять"));
        Set<String> stringSet = new HashSet<>(strings);
        System.out.println(stringSet.toString().substring(1, stringSet.toString().length()-1));

        // Task 4
        System.out.print("Task 4: ");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            if (!frequencyMap.containsKey(strings.get(i))) {
                frequencyMap.put(strings.get(i), 1);
            } else {
                continue;
            }
            for (int j = i+1; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    frequencyMap.put(strings.get(i), frequencyMap.get(strings.get(j))+1);
                }
            }
        }
        System.out.println(frequencyMap);
    }
}