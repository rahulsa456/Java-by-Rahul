package oop;

public class opp {
    public static void main(String[] args) {
        person p1=new person();
        p1.age= 58;
        p1.Name="Rahul Sharma";
        System.out.println(p1.age+" "+p1.Name);

    }
}

class person{
    int age;
    String Name;
}
