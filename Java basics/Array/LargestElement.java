package Array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3,6,8,1};
        int largest = arr[0]; //assume 1st element is largest
        for (int i=0; i< arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest number is: "+largest);

    }
}
