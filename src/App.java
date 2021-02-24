public class App {
    public static void main(String[] args) {


        float myMinFloatValue = Float.MIN_VALUE; 
        float myMaxFloatValue = Float.MAX_VALUE; 


        System.out.println("Float Min Value = " + myMinFloatValue); 
        System.out.println("Float Max Valye = " + myMaxFloatValue); 


        double myMinDoubleValue = Double.MIN_VALUE; 
        double myMaxDoubleValue = Double.MAX_VALUE; 


        System.out.println("Double Min Value = " + myMinDoubleValue); 
        System.out.println("Double Max Valye = " + myMaxDoubleValue);

        int myIntValue = 5 / 3; 
        float myFloatValue = 5f / 3f;
        // easier to just add an f at the end of the number 
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue); 

        double pounds = 200d; 

        double kilogram = 0.45359237d; 

        double total = pounds * kilogram; 

        System.out.println(total);
    }
}
