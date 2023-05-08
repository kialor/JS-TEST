public class Casting {
    public static void main(String[] args){
        double data = 112.35;
        System.out.println("Double: " + data);

        int number = (int)data;
        System.out.println("int: " + number);

        String myString= "49";
        System.out.println("The string value is: " + myString);

        int value = Integer.parseInt(myString);
        System.out.println("The integer value is: " + value);
    }
}
