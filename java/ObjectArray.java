class Student{
    int rollnumber;
    String name;
    double marks;
}

class store{
    public static void main(String[] args){
        
        Student s1=new Student();
        s1.rollnumber=1;
        s1.name="naga";
        s1.marks=90;

        Student s2=new Student();
        s2.rollnumber=2;
        s2.name="Chandan";
        s2.marks=92;


        Student s3=new Student();
        s3.rollnumber=3;
        s3.name="jathin";
        s3.marks=99;

        Student[] arr={s1,s2,s3};

        for(Student str:arr){
            System.out.println("roll number: "+str.rollnumber);
            System.out.println("name: "+str.name);
            System.out.println("marks: "+str.marks);
            System.out.println("------------------------------------");
        }
    }
}