import java.util.*;

public interface RemoveFromArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        List<String> cities = new ArrayList<>();

        int size = 5;
        System.out.print("Enter city names to input: ");
        for(int i=0; i < size; i++) {
            String city = input.next();
            cities.add(city);
        }

        System.out.println("Enter city name to replace: ");
        String newCity = input.next();

        cities.set(3, newCity);

        String[] arr = new String[cities.size()];

        for(int i=0; i< arr.length; i++) {
            arr[i] = cities.get(i);
        }
        
        System.out.println(Arrays.toString(arr));
        input.close();
    }
}
