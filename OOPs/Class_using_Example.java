package OOPs;

/*
 * In this File we exploring Java Classes with an Example
 * we creating a Student class 
 * and we see how to access class atrributes
 * we use these attribbutes
 *  - student name
 *  - student roll no
 *  - student age
 *  - student class
 * and we also creates some useful methods for the student class
 * 
 * Lets start it.
 */

public class Class_using_Example {
    public static void main(String[] args) {
        
        // creating objects of class `Student`
        Student st1 = new Student("akash", 1001, 23, "bca-vi-a");
        Student st2 = new Student("karn", 1002, 20, "bca-iii-a");
        Student st3 = new Student("abhinav", 1003, 19, "bsc-v-c");

        System.out.println("\nStudents information are as follows:-");
        st1.getStudentInfo();    // Calling method for student 1
        st2.getStudentInfo();    // Calling method for student 2
        st3.getStudentInfo();    // Calling method for student 3



    }
    
}

class Student {
    // attributes of the class
    String name, class_;
    int age, roll_no;

    // constructor
    Student (String name, int rn, int age, String c){
        this.name = name;
        this.roll_no = rn;
        this.age = age;
        this.class_ = c;
    }

    public void getStudentInfo(){
        /*
         * This method will display the information of student
         * all information i.e. Student's name, age, class & roll no
         */
        System.out.println(
            "\n\n--------------------------------------\n" +
            "|\tStudent Name    : " + this.name.toUpperCase() + "\n" +
            "|\tStudent Roll No : " + this.roll_no + "\n" +
            "|\tStudent Age     : " + this.age + "\n" +
            "|\tStudent Class   : " + this.class_.toUpperCase() + 
            "\n--------------------------------------"
        );
    }


}

