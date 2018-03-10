public class String {

    public static void main(java.lang.String[] args) {
        java.lang.String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        java.lang.String numberString = "250.55";
        numberString = numberString + "44.95";
        System.out.println("The result is " + numberString);

        java.lang.String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LAstString is equal to " + lastString);

        double doubleNumber = 10.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
    }

}
