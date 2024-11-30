package day07_relational_operators;

import java.sql.SQLOutput;

public class OperatorPractice {
    public static void main(String[] args) {

        int b =12;
        b++; // POST INCREMENT b= b +1; ---> b=13
        System.out.println(b);
        ++b; // PRE INCREMENT --> b= b + 1; ---> b = 14;

        b--; // POST DECREMENT --> b= b - 1; --->. b = 13;
        System.out.println(b);
        --b; // PRE DECREMENT --> b= b - 1; ---> b = 12;

        System.out.print(b);

        System.out.println(b++); // POST INCREMENT
        // 2 actions
        //  print --> b = 12;
        //  update --> b = 13;



    }
}
