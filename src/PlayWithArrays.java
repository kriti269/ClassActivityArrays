public class PlayWithArrays {
    private int[] arrayElements;

    //initialize array
    public PlayWithArrays(){
        arrayElements = new int[] {10,20,12,45,9,89,31,8,11,55};
    }

    //prints array elements in reverse order
    public void displayReverseArrayElements(){
        System.out.println("\nReverse of array elements is: ");
        for(int i=arrayElements.length-1; i>=0; i--){
            System.out.print(arrayElements[i] + " ");
        }
    }

    //sorts array elements based on order type
    public void sortArrayElements(String order){
        for(int i=0; i< arrayElements.length ; i++){
            for(int j=i; j< arrayElements.length ; j++){
                if(order.equals("asc") && (arrayElements[i] > arrayElements[j]) || order.equals("desc") && (arrayElements[i] < arrayElements[j])){
                    int temp = arrayElements[i];
                    arrayElements[i] = arrayElements[j];
                    arrayElements[j] = temp;

                }
            }
        }
        System.out.println("\nThe array sorted in " + order.toLowerCase() + " order is: ");
        for(int element: arrayElements){
            System.out.print(element + " ");
        }
    }

    //prints elements based on provided option odd or even
    public void displayOddEvenElements(String elementType){
        System.out.println("\nThe " + elementType.toLowerCase() + " elements in array are: ");
        for(int element: arrayElements){
            if(elementType.equalsIgnoreCase("Odd") && element%2 != 0)
                System.out.print(element + " ");
            else if(elementType.equalsIgnoreCase("Even") && element%2 == 0)
                System.out.print(element + " ");
        }
    }

    //calculates the sum of all elements
    public void displaySumOfElements(){
        int sum = 0;
        for(int element : arrayElements){
            sum += element;
        }
        System.out.println("\nThe sum of array elements is: " + sum);
    }


    public static void main(String[] args){
        PlayWithArrays arrays = new PlayWithArrays();
        arrays.displayReverseArrayElements();
        arrays.sortArrayElements("asc");
        arrays.sortArrayElements("desc");
        arrays.displayOddEvenElements("odd");
        arrays.displayOddEvenElements("even");
        arrays.displaySumOfElements();
    }


}
