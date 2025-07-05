class Animal{
    public void bark(){
        System.out.println("Animal is barking");
    }
}

class dog extends Animal{
    public void eat(){
        System.out.println("dog is eating");
    }
}


public class Inheritance {
    public static void main(String [] args){
        dog d=new dog();
        d.eat();
        d.bark();
        
    }
    
}
