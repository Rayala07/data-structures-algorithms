import java.util.*;

class Students {
    String name;
    int rollNumber;
    int marks;

    public Students(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
}
public class Practice_1 {
    public static void main(String[] args) {
        // Students records which is unsorted so we need to sort it
        Students[] record = {
                new Students("Alice", 1, 85),
                new Students("Charlie", 3, 85),   // same marks as Alice
                new Students("David", 4, 70),
                new Students("Bob", 2, 92),
                new Students("Eve", 5, 92),       // same marks as Bob
                new Students("Frank", 6, 60)
        };

        System.out.println("Current Order of Record: ");
        for(Students s: record) {
            System.out.println(s.name + " " + s.rollNumber + " " + s.marks);
        }

        // Call the sorting function to sort the student records by their marks
        sortStudentsByMarks(record);
        System.out.println("Updated/Sorted order of Record: ");
        for(Students s: record) {
            System.out.println(s.name + " " + s.rollNumber + " " + s.marks);
        }
    }

    public static void sortStudentsByMarks(Students[] record) {
        if(record == null || record.length <= 1) return;
        int low = 0;
        int high = record.length - 1;
        mergeSort(record, low, high);
    }

    public static void mergeSort(Students[] record, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(record, low, mid);
        mergeSort(record, mid + 1, high);
        mergeByMarks(record, low, mid, high);
    }

    public static void mergeByMarks(Students[] record, int low, int mid, int high) {
        List<Students> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high) {
            if(record[left].marks <= record[right].marks) {
                temp.add(record[left]);
                left++;
            } else {
                temp.add(record[right]);
                right++;
            }
        }
        while(left <= mid) {
            temp.add(record[left]);
            left++;
        }
        while(right <= high) {
            temp.add(record[right]);
            right++;
        }

        for(int i=0; i < temp.size(); i++) {
            record[low + i] = temp.get(i);
        }
    }
}
