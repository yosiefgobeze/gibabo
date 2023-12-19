class Student{
    private int id;
    private String name;
    private boolean active;

    public Student(int id, String name, boolean active){
        this.id = id;
        this.name = name;
        this.active = active;
    }
}
public class StudentEntry {
    public static void main(String[] args){
        //create an array of Student class
        Student[] std = new Student[5];
        std[0] = new Student(1, "Yosief", true);
       // std[1] = new Student(2, "Minas", true);
       // std[2] = new Student(3, "Noah", true);
       // std[3] = new Student(4, "Waka", false);
        //std[4] = new Student(5, "Abraham", false);

        //for (Student student : std) {
            //System.out.println(student);
       // }
    }

    /* 
    public static void printStudents(Student[] std){
        for (Student student : std) {
            System.out.println(student);
        }
    }
    */
}
