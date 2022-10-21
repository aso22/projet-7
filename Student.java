public class Student extends Person{
    private String major;
    public Student(String name,String YearOfBirth,String major)
    {
        super(name,YearOfBirth);
        this.major=major;
    }
    public String toString()
    {
        String fullInfo=super.toString()+" "+major;
        return fullInfo;
    }
}
