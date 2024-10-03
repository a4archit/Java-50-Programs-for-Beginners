package OOPs;

public class Multilevel {
    public static void main(String[] args) {
        
        JavaDeveloper anurag = new JavaDeveloper("Anurag", "Java", "Google");

        anurag.getJavaDeveloperInfo();


    }
}






class Person{
    // constructor
    String name;
    Person(String n){
        this.name = n;
    }

    public void personInfo(){
        System.out.println("Person name is " + this.name);
    }

}

class Programmer extends Person {
    // constructor
    String language;
    Programmer(String n, String l){
        this.language = l;
        super(n);
    }

    public void programmerInfo(){
        System.out.println("Programmer name is " + this.name);
    }
}

class JavaDeveloper extends Programmer{
    // constructor
    String company;
    JavaDeveloper(String n, String l, String c){
        this.company = c;
        super(n,l);
    }

    public void getJavaDeveloperInfo(){
        System.out.println("Company of Java Developer(" + super.name + ") is " + this.company);
    }
}



