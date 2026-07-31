import java.util.HashMap;

public class FrequencyCounter {

    public static void main(String[] args) {

        String text = "banana";

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : text.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequency:");
        System.out.println(frequencyMap);
    }
}
