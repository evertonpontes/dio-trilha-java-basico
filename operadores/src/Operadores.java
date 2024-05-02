public class Operadores {
    public static void main(String[] args) throws Exception {
        // Arithmetic Operators

        int num1 = 100;
        int num2 = 50;

        System.out.println("Arithmetic Operators");

        // Addition
        int sum = num1 + num2;
        System.out.println(sum);
        // Subtraction 
        int sub = num1 - num2;
        System.out.println(sub);
        // Multiplication
        int mult = num1 * num2;
        System.out.println(mult);
        // Division
        int div = num1 / num2;
        System.out.println(div);
        // Modulus (remainder of the division)
        int remainder = num1 % num2;
        System.out.println(remainder);
        // Increment
        System.out.println(++num1);
        // Decrement
        System.out.println(--num1);

        // Assignment Operators

        System.out.println("Assignment Operators");


        int x = 10;
        // addition assignment operator
        x += 5;
        // others

        // System.out.println(x -= 3);
        // System.out.println(x *= 3);
        // System.out.println(x /= 3);
        // System.out.println(x %= 3);
        // System.out.println(x &= 3);
        System.out.println(x |= 3);
        System.out.println(x ^= 3);

        // Comparison Operators

        System.out.println("Comparison Operators");

        int z = 5;
        int y = 3;
        System.out.println(z > y);
        System.out.println(z == y);
        System.out.println(z != y);
        System.out.println(z < y);
        System.out.println(z <= y);
        System.out.println(z >= y);

        // Logical Operators

        System.out.println("Logical Operators");

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue && isFalse);
        System.out.println(isTrue || isFalse);
        System.out.println(!isTrue);

    }
}
