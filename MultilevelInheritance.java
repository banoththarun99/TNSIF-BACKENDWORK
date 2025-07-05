class Grandfather{
    public void displaygf(){
        String surname="banoth";
        System.out.println("the surname of grandfather:"+surname);
    }
}
class Father extends Grandfather{
    public void displayf(){
        String fullname="banoth nousi";
        System.out.println("surname from grandfather to father:"+fullname);
    }
}
class son extends Father{
    public void displayson(){
        String name="banoth tharun";
        System.out.println("surname from father to son:"+name);

    }

}


public class MultilevelInheritance {
    public static void main (String [] args){
        son s=new son();
        s.displaygf();
        s.displayf();
        s.displayson();
    }
    
}
