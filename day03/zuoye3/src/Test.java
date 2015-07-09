interface Assaultable{
    void attack(); 
} 
interface Mobile{
	void move();
	} 
abstract class Weapon implements Assaultable,Mobile {
      public void attack(){
    	  
      } 
      public void move(){
    	  
      }
	}  
class Tank extends Weapon{
	public void attack(){ 
		System.out.println("坦克攻击！！！");
		} 
	public void move(){
		System.out.println("坦克移动！！！"); 
		} 
	}
class Flighter extends Weapon{ 
	public void attack(){
		System.out.println("战斗机攻击！！！");
		}
	public void move(){
		System.out.println("战斗机移动！！！");
        }
	} 
class Warship extends Weapon{ 
	public void attack(){
		System.out.println("战船攻击！！！"); 
		} 
	public  void move(){
		System.out.println("战船移动！！！"); 
		}
	} 
class Army { 
	Weapon[] w; 
	int max; 
	int j=0;
	public int getMax() {
		return max;
		} 
	public void setMax(int max) {
		this.max = max; 
		} 
	public Army(int max){
		w= new Weapon[max];
		this.max=max; 
		System.out.println("您最多拥有"+max+"个武器！！！") ;
		}
	public void addWeapon(Weapon wa){
		if(j<getMax()){
			System.out.println("武器库足够！"+"已增加"+(j+1)+"个武器");
			w[j]=wa;
			j++; 
			} 
		else{ 
			System.out.println("警告：武器库已满！！！不能增加武器！！！");
			}
		} 
	public void attackAll(){
       System.out.println();
	   System.out.println("所有武器准备战斗！！！"); 
	for(int i=0;i<w.length;i++){ 
		System.out.print((i+1)+"号");
		w[i].attack();
		}
	}
	public void moveAll(){
	   System.out.println();
	   System.out.println("所有武器准备移动！！！");
	for(int i=0;i<w.length;i++){
		System.out.print((i+1)+"号");
		w[i].move(); 
		}
	  }
	}
class Test {
	public static void main(String[] args) {
		Army army=new Army(6);
		army.addWeapon(new Tank());
		army.addWeapon(new Tank());
		army.addWeapon(new Flighter());
		army.addWeapon(new Flighter());
		army.addWeapon(new Warship());
		army.addWeapon(new Warship());
		army.attackAll();
		army.moveAll();
	}
}



