package affs;

class Fruit {
	String name;
	int price;
	String address;
	Fruit(){}
	Fruit(String n,int p,String a){
		name =n;
		price=p;
		address=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fruit f=new Fruit("ƻ��",5,"ɽ��");
        System.out.println(f.name);
	}

}