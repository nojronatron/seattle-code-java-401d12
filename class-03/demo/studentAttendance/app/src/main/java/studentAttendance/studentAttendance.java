/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package studentAttendance;

import com.sun.jdi.ArrayReference;
import org.checkerframework.checker.units.qual.A;
import zork.Zork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class studentAttendance {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        Zork.staticZork();

        // actual instantiation
        Zork doggo = new Zork();
        doggo.giveGreeting();

        ArrayList<Boolean> hasAttended = new ArrayList<>();
        hasAttended.add(true);
        hasAttended.add(false);
        hasAttended.add(true);


        // Attendance - how do we map this?
        // SETS AND MAPS!!!
            // 1. Uniqueness
            // 2. quick lookups
            // 3. count the instance of something(data)

        HashMap<String, ArrayList<Boolean>> dailyAttendance = new HashMap<>();
        HashSet<String> classStudents = new HashSet<>();

        // if we have time, let's explore linked sets and maps

        ArrayList<String> students = new ArrayList<>();
        students.add("Chuck");
        students.add("Jon");
        students.add("Roger");
        students.add("Mike");
        students.add("Jason");
        students.add("Raul");
        students.add("Abdulahi");
        students.add("Scott");
        students.add("Marta");
        students.add("Darius");
        classStudents.addAll(students);

        // if we have time, let's come back and update our hashmap

        dailyAttendance.put("Alex", hasAttended);

        System.out.println("Students: " + classStudents);
        System.out.println("Alex's times attended: " + dailyAttendance.get("Alex"));
        System.out.println(dailyAttendance.isEmpty());


    }

}
