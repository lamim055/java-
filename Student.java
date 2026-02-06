public class Student {
    String name;
    int id;
    float CGPA;

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name ="Lamim";
        s1.id =13;
        s1.CGPA =3.00f;

        System.out.println("Name :"+ s1.name);
        System.out.println("ID   :" + s1.id);
        System.out.println("CGPA  :" + s1.CGPA);
    }
}