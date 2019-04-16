public class Runner  {
    public static void main(String[] args){

        School berkeleyhigh = new School("Berkeley High");

        Section math = new Section("Math");
        Section biology= new Section("Biology");
        Section computerscience = new Section("Computer Science");

        Teacher albinson = new Teacher("Albinson",40, "Computer Science");
        Teacher teacher1 = new Teacher("teacher1",1,"Math");
        Teacher teacher2 = new Teacher("teacher2",2,"Biology");

        Student friend1 = new Student("friend1",500,12);
        Student friend2 = new Student("friend2",501,12);
        Student friend3 = new Student("friend3",502,10);
        Student friend4 = new Student("friend4",503,10);
        Student friend5 = new Student("friend5",504,11);
        Student friend6 = new Student("friend6",505,9);

        math.setTeacher(teacher1);
        biology.setTeacher(teacher2);
        computerscience.setTeacher(albinson);

        biology.addStudent(friend1);
        biology.addStudent(friend3);
        biology.addStudent(friend6);
        math.addStudent(friend1);
        math.addStudent(friend5);
        computerscience.addStudent(friend1);
        computerscience.addStudent(friend2);
        computerscience.addStudent(friend3);
        computerscience.addStudent(friend4);
        computerscience.addStudent(friend5);
        computerscience.addStudent(friend6);

        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(computerscience.toString());
    }
}