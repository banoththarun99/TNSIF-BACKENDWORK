 class object{
    int a=12;
    int b=1;
    public int add(){
        int result=a+b;
        System.out.println("addition is:"+result);
        return result;
    }
}

public class CreateObject {
    public static void main(String [] arg){
        object o=new object();
        o.add();
    }
    
}
