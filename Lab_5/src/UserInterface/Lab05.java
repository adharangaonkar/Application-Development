/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author hp
 */
public class Lab05 {
    enum Color {
        RED, GREEN, BLUE;
        
        public static String test = "test...";
        public static void main (String[] args){
            System.out.println(test);
            Color c1 = Color.RED;
            System.out.println(c1);
        }
    }
    
    enum Operator {
        ADD {
            @Override
            int execute (int num1, int num2)
            {
                return num1 + num2;
            }
        },
        
        SUBSTRACT {
            @Override
            int execute (int num1, int num2)
            {
                return num1 - num2;
            }
        },
        
        MULTIPLY {
            @Override
            int execute (int num1, int num2)
            {
                return num1 * num2;
            }
        },
        
        DIVIDE {
            @Override
            int execute ( int num1, int num2)
            {
                if (num2 != 0)
                {
                    return num1 / num2;
                }
                else 
                {
                    System.out.println("Can't divide by Zero");
                }
                return 0 ;
            }
        };
        abstract int execute (int num1, int num2);
        
}
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 2;
        int num3 = 100;
        Operator operator = Operator.ADD;
        int result = operator.execute(num1, num2);
        System.out.println("Operator = "+ operator + "; result=" + result);
        
        operator = Operator.DIVIDE;
        int result2 = operator.execute(num3, num2);
        System.out.println("Operator = "+ operator + "; result=" + result2);
    }
}