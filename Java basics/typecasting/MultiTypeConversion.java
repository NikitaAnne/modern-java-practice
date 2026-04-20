package typecasting;

public class MultiTypeConversion {
    public static void main(String[] args) {
    Number[] numbers = {8,10.3f,3.9d};
    for(int i=0;i<numbers.length;i++){
        int convertedValue= numbers[i].intValue();
        System.out.println("Value at index "+ i +" \t -> Int: " + convertedValue);
    }

    }
}
