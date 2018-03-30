package com.endava;

import com.endava.models.MajorDeg;
import com.endava.models.Student;
import com.endava.models.User;

import java.util.*;
import java.util.stream.Collectors;

import static com.endava.models.Gender.FEMALE;
import static com.endava.models.Gender.MALE;

public class Main {

    public static final List<User> USERS = Arrays.asList(
            new User("Vasea", MALE, 39),
            new User("Sveta", FEMALE, 30),
            new User("Jenea", MALE, 40),
            new User("Igor", MALE, 55),
            new User("Sveta", FEMALE, 30),
            new User("Jenea", MALE, 40));
    public static final List<Student> STUDENTS = Arrays.asList(
            new Student("Valera", MALE, 18, new MajorDeg("IT", 9.8)),
            new Student("Valera", MALE, 19, new MajorDeg("IT", 8.8)),
            new Student("Valera", MALE, 19, new MajorDeg("Economics", 7.1)),
            new Student("Valera", MALE, 19, new MajorDeg("Economics", 7.5))
    );
    public static void main(String[] args) {

        countOccurrences("This is is, is the, string,,,  to  check. check.");
        printDelimiterLine();

        System.out.println(filterUsersByAge(USERS));
        printDelimiterLine();

        System.out.println(youngestUser(USERS));
        printDelimiterLine();

        System.out.println(sortStringsAndRemoveDuplicates(Arrays.asList(
                "String",
                "String",
                "hi",
                "hello",
                "hi"
        )));
        printDelimiterLine();

        detectStudent(STUDENTS);

    }

    public static void countOccurrences(String message){
        List<String> string = new ArrayList<>(Arrays.asList(message.split("[ ,.]+")));
        System.out.println(
                string.stream().collect(Collectors.groupingBy(Object::toString, Collectors.counting()))
        );
    }

    public static List filterUsersByAge(List<User> users){
        return users.stream().filter(user -> user.getAge() > 40).collect(Collectors.toList());
    }

    public static void detectStudent(List<Student> students){
        System.out.println(
            students
                    .stream()
                    .filter(student -> student.getName().equals("Valera"))
                    .collect(Collectors.groupingBy(student -> student.getMajor().getName(),
                                        Collectors.maxBy(Comparator.comparing(student -> student.getMajor().getScore()))))
        );
    }
    public static Optional<User> youngestUser(List<User> users){
        return users.stream().min(Comparator.comparing(User::getAge));
    }

    public static List sortStringsAndRemoveDuplicates(List<String> strings){
        return strings.stream().sorted().distinct().collect(Collectors.toList());
    }
    public static void printDelimiterLine() {
        System.out.println("\n-------------------------------------------------------\n");
    }
}
