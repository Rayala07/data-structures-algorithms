import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Add_Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a arrayList to dynamically add names without defining the size;
        List<String> addNames = new ArrayList<>();

        System.out.print("Enter how many names to input: ");
        int inputSize = input.nextInt();
        input.nextLine();

        for(int i=0; i<inputSize; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            String nameInput = input.nextLine();
            addNames.add(nameInput);
        }

        // Defining a string array to convert the ArrayList into an Array and print the output
        String[] names = new String[inputSize];
        for(int i=0; i<inputSize; i++) {
            names[i] = addNames.get(i);
        }

        System.out.println("Names: " + Arrays.toString(names));
        input.close();
    }
}
