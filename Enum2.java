enum laptop{
    Macbook(1300),Rog(20000),Thinkpad(10000);
    private int price;

    laptop(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}

class EnumDemo2{
    public static void main(String[] args){
        laptop[] lap=laptop.values();
        for(laptop l:lap){
            System.out.println(l+" : "+l.getPrice());
        }
    }
}