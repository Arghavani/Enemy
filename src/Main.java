import java.util.*;

class Main {
     public static void main(String [] args){
         //Enemy enemy = new Enemy();
         //enemy.Talk();
         Vampire vampire= new Vampire();
         //vampire.Talk();
         vampire.setHealth(25);
         //System.out.println(vampire.health);
         vampire.gethealth();
        // Werwolf werwolf = new Werwolf();
         //werwolf.Talk();
//enemy pointer is from parent class and vampire is a child class of parent, therefore at the end it will make the vampire'S Talk method print out
         //Enemy enemy = vampire;
         //enemy.Talk();
        // Enemy [] enemies ={vampire, werwolf};
         //enemies[0].Talk();
         //enemies[1].Talk();
     }

}
