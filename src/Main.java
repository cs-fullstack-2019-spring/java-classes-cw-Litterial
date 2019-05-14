import com.company.classwork.Account;
import com.company.classwork.Dog;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args)
    {
//        ex1();
        ex2();
    }

    public static void ex1()
    {
        Account a = new Account("Kyancy",10);  //calls a class that sets the value of both name and amount
        Account b= new Account("KGibbs",100);
        b.withdrawal(100); //calls a class that withdrawals the amount entered from the balance.
        a.deposit(100);   //calls a class that add the amount entered to the balance.
        System.out.println(a);
        System.out.println(b);
    }

    public static void ex2()
    {
        ArrayList<Dog> doggy= new ArrayList<Dog>(); //an arraylist that accept the Dog type
        Dog dog1=new Dog("Spike","Beagle","brown",12);
        Dog dog2=new Dog("Elvis","Terrier","tan",7);
        Dog dog3=new Dog("Zo","Yorie","yellow/brown",5);
        doggy.add(dog1); //adds to arraylist
        doggy.add(dog2); //adds to arraylist
        doggy.add(dog3); //adds to arraylist
        doggyArray(doggy); //calls function to iterate through array
    }

    public static void doggyArray(ArrayList<Dog> wuff_wuff)
    {
        for(Dog i:wuff_wuff)
        {
            System.out.println(i); // will print from the to String class
        }
    }
}
