package Classes;

public class SingletonJava {
    private volatile static SingletonJava singletonJava;

   // private SingletonJava(){}

    public synchronized static SingletonJava newInstance(){
        if (singletonJava==null){
            singletonJava=new SingletonJava();
        }
        return singletonJava;
    }

    public String name;
    private int counter;
    public int getCounter(){
        return counter;
    }

    public void setCounter(int increasedValue){
        counter+=increasedValue;
    }


}

class SingletonTest{
    public static void main(String[] args) {
      SingletonJava singleton=SingletonJava.newInstance();
        singleton.setCounter(1);
        SingletonJava singleton2=SingletonJava.newInstance();
        singleton.setCounter(1);
        SingletonJava singleton3=SingletonJava.newInstance();
        singleton.setCounter(1);


    /* Bu şekilde sayamazsın.
       SingletonJava singleton= new SingletonJava();
        singleton.setCounter(1);
        SingletonJava singleton2= new SingletonJava();
        singleton2.setCounter(1);
        SingletonJava singleton3= new SingletonJava();
        singleton3.setCounter(1);

     */

        System.out.println(singleton.getCounter());
        System.out.println(singleton2.getCounter());
        System.out.println(singleton3.getCounter());


        }
}
