import java.util.HashMap;

public class EmployeeHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "John");
        employeeMap.put(102, "Sara");

        System.out.println("Employee ID 101: " + employeeMap.get(101));
        System.out.println("Employee ID 102: " + employeeMap.get(102));
    }
}
