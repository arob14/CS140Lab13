

public class lab13 {
    private static java.util.ArrayList<Integer> nums = new java.util.ArrayList<>();
    // methods
    public static void readData(String filename) {
        try {
            java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
            String inn;
            while ( (inn = input.readLine()) != null) {
                nums.add(Integer.parseInt(inn));
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
            System.exit(0);
        }
    }
    public long getTotalCount() {
        return nums.stream().count();
    }
    public long getOddCount() {
        return nums.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }
    public long getEvenCount() {
        return nums.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }
    public long getDistinctGreaterThanFiveCount() {
        return nums.stream()
                .distinct()
                .filter(x -> x > 5)
                .count();
    }
    public Integer[] getResult1() {
        return nums.stream()
                .filter(x -> x > 5)
                .filter(x -> x < 50)
                .sorted()
                .toArray(Integer[]::new);
    }
    public Integer[] getResult2() {
        return nums.stream()
                .limit(50)
                .map(x -> 3 * (x*x))
                .toArray(Integer[]::new);
    }
    public Integer[] getResult3() {
        return nums.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x*2)
                .sorted()
                .skip(20)
                .distinct()
                .toArray(Integer[]::new);
    }
}
