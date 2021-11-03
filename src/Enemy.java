public class Enemy {
   private int health;
    public void Talk(){
        System.out.println("I am an enemy. You better run!");
    }
    public void gethealth(){
        System.out.println(health);
    }
    public void setHealth(int x){
        health = x;
    }
}
