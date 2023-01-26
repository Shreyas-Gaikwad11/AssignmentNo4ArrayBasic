// Write a program to Add Student Class Object in Array and print it.

package ArrayBasic;
public class StudentObj {

    public static void main(String[] args) {

        Sample[] s = new Sample[3];
        s[0]=new Sample("ABC",1,"OS");
        s[1]=new Sample("XYZ",2,"Java");
        s[2]=new Sample("PQR",3,"Angular");


        for(int i=0;i<s.length;i++){
            System.out.println("My name is "+s[i].getName() +", my roll number is :"+s[i].getRollno()+" ,my favorite subject is "+s[i].getSub());
        }
    }

}
