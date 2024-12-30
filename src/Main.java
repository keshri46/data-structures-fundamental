import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Test cases
        System.out.println(matchDoorsWithKeys(new String[]{"Room Number 1", "Secret room"}, new String[]{"910", "811"}));
        System.out.println(matchDoorsWithKeys(new String[]{"Room 666", "Don't enter"}, new String[]{"313", "800"}));
        System.out.println(matchDoorsWithKeys(new String[]{"Portal 1", "Portal 2", "Portal 3"}, new String[]{"501"}));
        System.out.println(matchDoorsWithKeys(new String[]{"Door to nowhere", "Door to nowhere 2"}, new String[]{"1200", "1203"}));
    }

    public static String matchDoorsWithKeys(String[] doors, String[] keys) {
        // Build a map for key codes to door list
        Map<String, List<String>> keyMap = new HashMap<>();
        for (String key : keys) {
            keyMap.putIfAbsent(key, new ArrayList<>());
        }

        // Process each door and generate a code
        for (String door : doors) {
            String doorCode = getDoorCode(door);
            if (keyMap.containsKey(doorCode)) {
                keyMap.get(doorCode).add(door);
            }
        }

        // Prepare the result list by traversing the map
        List<String> results = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : keyMap.entrySet()) {
            String keyCode = entry.getKey();
            for (String door : entry.getValue()) {
                results.add(door + "-" + keyCode);
            }
        }

        return String.join("; ", results) + ";";
    }

    private static String getDoorCode(String door) {
        int lowercaseCount = 0;
        int digitCount = 0;
        boolean containsRoom = false;

        // Traverse door to count lowercase letters and digits, and check "room"
        for (char c : door.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        // Check if the door contains "room" (case-insensitive)
        if (door.toLowerCase().contains("room")) {
            containsRoom = true;
        }

        // Construct the door code in a single step for efficiency
        return lowercaseCount + "" + (containsRoom ? 1 : 0) + digitCount;
    }
}
