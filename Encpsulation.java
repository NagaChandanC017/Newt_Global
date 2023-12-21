class Human{
    private String name;
    private int age;

    public String getNmae(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }
    
}

class HumanSeter{
    public static void main(String[] args){
        Human h1=new Human();
        h1.setName("chandan");
        h1.setAge(20);

        Human h2=new Human();
        h2.setName("Jathin");
        h2.setAge(15);

        System.out.println(h1.getNmae()+" "+"age is "+h1.getAge());
        System.out.println(h2.getNmae()+" "+"age is "+h2.getAge());
    }
}