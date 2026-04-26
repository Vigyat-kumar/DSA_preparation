package OOPS;

public class constructor {
    public static class Student{
        String name;
        int rno;
        double cgpa;
        Student(){

        }// default constructor with no return type same as the name of the class

        Student(int x,String s,double d){
            name=s;
            rno=x;
            cgpa=d;

        }
        void print(){
            System.out.println(name+" "+rno+" "+cgpa+" ");
        }

    }

    public static void main(String[] args) {
        Student st= new Student(14,"Vigyat",99.9);
        st.print();
        Student c=new Student();//this is called because there is default constructor
    }
}
