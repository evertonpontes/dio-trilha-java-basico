public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Primitive data types - byte, short, int, long, float, double, boolean and char
        // Non-primitive data types - String, Arrays and Classes
        
        byte byteNumber = 1; // -128 to 127
        short shortNumber = 30000; // -32768 to 32767
        int intNumber = 2024; // -2,147,483,648 to 2,147,483,647
        long longNumber = 12345678900L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float floatNumber = 1800.55F; // Sufficient for storing 6 to 7 decimal digits
        double doubleNumber = 3.14159265359; // Stores fractional numbers. Sufficient for storing 15 decimal digits

        boolean isTrue = true; // Store true or false
        char letter = 'E'; // Stores a single character/letter or ASCII values

        // converting double to int (casting)

        double myDouble = 5.5;
        int myInt = (int) myDouble;

        System.out.print(myInt);

        // String type

        String myName = "Everton Pontes Pereira";

        System.out.println("The length of my name is: " + myName.length());
    }
}
