class StaticVariable
{
    static int count = 0;                             // static variable
    //int count = 0;                                      // instance variable
    public void incr(){
        count++;
    }
}
class StaticVariableMain{                               //
    public static void main(String args[]){             //String 'S' is capital
        StaticVariable sv1 = new StaticVariable();
        StaticVariable sv2 = new StaticVariable();
        sv1.incr();
        sv2.incr();
        System.out.println("sv1.count= "+ sv1.count);
        System.out.println("sv1.count= "+ sv2.count);
    }
}