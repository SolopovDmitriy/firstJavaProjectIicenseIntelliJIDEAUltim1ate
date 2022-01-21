package first;

import entity.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {







    public static void test1(){
        String[] people = new String[] { "Tom", "Sam", "Bob", "Kate", "Tom", "Alice", "Alex" };

        // находим первый и последний элементы  где длина строки больше 3 символов
        // String? first = Array.Find(people, person => person.Length > 3);
        // Console.WriteLine(first); // Kate
        String first = Arrays.stream(people).filter(p->p.length() > 3).findFirst().orElse(null); // // Kate
        // String first = Arrays.stream(people).filter(p->p.length() > 3).findFirst().get(); // // Kate

        System.out.println(first);

//                string? last = Array.FindLast(people, person => person.Length > 3);
//                Console.WriteLine(last); // Alex

        String last = Arrays.stream(people).filter(p->p.length() > 3).reduce((temp, second) -> second)
                .orElse(null);
        System.out.println(last);

        String all = Arrays.stream(people).filter(p->p.length() > 3).reduce((temp, second) -> temp + second )
                .orElse(null);
        System.out.println(all);
//
//        // находим элементы, у которых длина строки равна 3
//                string[] group = Array.FindAll(people, person => person.Length == 3);
//                foreach (var person in group) Console.WriteLine(person);
        // Tom Sam Bob Tom


        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);

        Integer sum = numbers.stream()
                .reduce(10, (left2, right2) -> left2 + right2);
        // 10 + 1 = 11
        // 11 + 2 = 13
        // 13 + 3 = 16
        // 16 + 5 = 21

//        Integer sum = numbers.stream()
//                .reduce((left2, right2) -> left2 + right2).get();
        // 0 + 1 = 1
        // 1 + 2 = 3
        // 3 + 3 = 6
        // 6 + 5 = 11

        System.out.println(sum); //output 21


        // 5! = 1*2*3*4*5
    }



    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello");
//        Student s1 = new Student();![](../../../../AppData/Local/Temp/download.jpg)
//        s1.name = "Alex";
//        System.out.println(s1.name);
//        Teacher t1 = new Teacher();

//        String s = "hello";
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(12); // in C# numbers.Add(12)
//        numbers.add(4);
//        numbers.add(17);
//
//        System.out.println(numbers.get(2)); // 4

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//
//        for(int number : numbers){  // in c#  foreach
//            System.out.println(number);
//        }

//        int[] array = {1,5,6,6,6,6,8};
//        for(int n : array){
//            System.out.println(n);
//        }

//        System.out.println(array[0]);


        test1();

    }
}
