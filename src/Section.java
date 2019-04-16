public class Section {

    private Student[] sections = new Student[50];
    private int currentSize = 0;
    private String name;
    private Teacher teacher;

    public Section(String name) { this.name = name; }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.sections;
    }

    public void addStudent(Student s){
        this.sections[this.currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String stringToReturn = "This "+this.name+" class is taught by "+this.teacher.getName()+" and has "+this.currentSize+" students: ";
        for(int i=0;i<this.currentSize-1;i++){
            stringToReturn+=this.sections[i].getName()+", ";
        }
        stringToReturn+=this.sections[this.currentSize-1].getName();
        return stringToReturn;
    }
}