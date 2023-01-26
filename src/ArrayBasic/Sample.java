package ArrayBasic;

public class Sample {
    private String name;
    private int Rollno;
    private String sub;


    public Sample(String name,int Rollno,String sub){
       this.name=name;
        this.Rollno=Rollno;
        this.sub=sub;

    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return Rollno;
    }

    public String getSub() {
        return sub;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", Rollno=" + Rollno +
                ", sub='" + sub + '\'' +
                '}';
    }
}
