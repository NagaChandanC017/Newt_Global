interface Cal{
    public int add(int i,int j);
}

class ExpDemo{
    public static void main(String[] args){
       Cal c1=(i,j)->i+j;
       System.out.println(c1.add(2,3));
    }
}