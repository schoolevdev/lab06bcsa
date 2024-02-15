// Lab06bvst.java
// This lab creates a school with 10 students and sorts them by
// name, gpa, and age
// Evin Lodder 2/14/2024
public class Main
{
    public static void main (String[] args)
    {
        System.out.println("Lab06bv100 by Evin Lodder");
        int size = 10;
        School bhs = new School(size);
        bhs.addData();
        System.out.println(bhs);
        bhs.bubbleSort1(); // Sorts by name (Only for 100-Point version)
        System.out.println(bhs);
        bhs.bubbleSort2(); // Sorts by gpa
        System.out.println(bhs);
        bhs.bubbleSort3(); // Sorts by age (Only for 100-Point version)
        System.out.println(bhs);
    }
}
class School
{
    private final Student[] students;
    private final int size;
    //creates new school with students initialized with `s` length
    public School (int s)
    {
        students = new Student[s];
        size = s;
    }
    // Already completed for Lab06a
    //adds the data necessary for the lab to be complete (why this doesn't take parameters i don't know)
    public void addData()
    {
        //create lists of names ages and gpas
        String[] names = new String[]{"Tom", "Ann", "Bob", "Jan", "Joe", "Sue", "Jay", "Meg", "Art", "Deb"};
        int[] ages = new int[]{21, 34, 18, 45, 27, 19, 30, 38, 40, 35};
        double[] gpas = new double[]{1.685, 3.875, 2.5, 4.0, 2.975, 3.225, 3.65, 2.0, 3.999, 2.125};
        //add new students to the array
        for(int i = 0; i < size; i++) {
            students[i] = new Student(names[i], ages[i], gpas[i]);
        }
    }
    // Sorts by name (For 100-Point version only )
    public void bubbleSort1() {
        //count backwards setting students[i] to the largest name
        for(int i = size - 1; i > 0; i--) {
            for(int f = 1; f <= i; f++) {
                //if students[f-1] name is greater than students[f], swap the values
                if(students[f - 1].getName().compareTo(students[f].getName()) > 0) {
                    Student temp = new Student(students[f].getName(), students[f].getAge(), students[f].getGPA());
                    students[f] = students[f-1];
                    students[f-1] = temp;
                }
            }
        }
    }
    // Sorts by gpa
    public void bubbleSort2() {
        //count backwards setting students[i] to the largest name
        for(int i = size - 1; i > 0; i--) {
            for(int f = 1; f <= i; f++) {
                //if students[f-1] gpa is greater than students[f], swap the values
                if(students[f - 1].getGPA() > students[f].getGPA()) {
                    Student temp = new Student(students[f].getName(), students[f].getAge(), students[f].getGPA());
                    students[f] = students[f-1];
                    students[f-1] = temp;
                }
            }
        }
    }
    // Sorts by age (For 100-Point version only)
    public void bubbleSort3() {
        //count backwards setting students[i] to the largest name
        for(int i = size - 1; i > 0; i--) {
            for(int f = 1; f <= i; f++) {
                //if students[f-1] age is greater than students[f], swap the values
                if(students[f - 1].getAge() > students[f].getAge()) {
                    Student temp = new Student(students[f].getName(), students[f].getAge(), students[f].getGPA());
                    students[f] = students[f-1];
                    students[f-1] = temp;
                }
            }
        }
    }
    // Already completed for Lab06a
    public String toString()
    {
        //creates a stringbuilder and appends each student with a newline
        StringBuilder builder = new StringBuilder();
        for(Student stu: students) {
            builder.append(stu);
        }
        return builder.toString();
    }
}

class Student
{
    private final String name;
    private final int age;
    private final double gpa;
    public Student (String n, int a, double g)
    {
        name = n;
        age = a;
        gpa = g;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGPA() { return gpa; }
    public String toString()
    {
        return name + " " + age + " " + gpa + "\n";
    }
}

