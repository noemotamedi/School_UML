public class Student extends Person{

    private int grade;
    private Section[] section = new Section[10];
    private int sectionCount = 0;

    Student(String name, int id, int grade){
        super(name,id);
        this.grade = grade;
    }

    public int getgrade(){
        return this.grade;
    }


    public void setgrade(String n){
        this.grade= grade;
    }


    public Section[] getSections(){
        return this.section;
    }

    public void addSection(Section s){
        this.section[this.sectionCount] = s;
        sectionCount++;
    }
}