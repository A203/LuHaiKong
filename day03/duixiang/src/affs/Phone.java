package affs;

class Phone {
	String name;
	String brand;
	int price;

    void call(){
    	System.out.println("��绰....");
    }
    void sendMsg(){
    	System.out.println("������....");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Phone p=new Phone();
        
        p.name="note";
        p.brand="���׻�";
        p.price=99;
        System.out.println(p.name);
        p.sendMsg();
	}

}