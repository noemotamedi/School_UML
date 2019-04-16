public class Teacher extends Person {

    private String subject;
    private Section[] section = new Section[10];
    private int sectionCount = 0;

    Teacher(String name, int id, String subject){
        super(name,id);
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }


    public void setSubject(String n){
        this.subject = subject;
    }


    public Section[] getSections(){
        return this.section;
    }

    public void addSection(Section s){
        this.section[this.sectionCount] = s;
        sectionCount++;
    }
}