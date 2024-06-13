package tdd;

public class JavaProgram {
    public int sumUpAllTheEvenNumberInAnArray(int [] expecting){
        int sum = 0;
        for(int i=0; i<expecting.length; i++){
            if(expecting[i]%2==0){
                sum += expecting[i];
            }
        }
        return sum;
    }

    public int sumUpTheOddNumberInAnArray(int [] expecting){
        int sum = 0;
        for(int i=0; i<expecting.length; i++){
            if(expecting[i]%2!=1){
                sum += expecting[i];
            }
        }
        return sum;
    }

    public int multipyAllElementAtThirdIndex(int[] expecting){
        int muti = 0;
        for(int i=0; i<expecting.length; i+=3){
            muti = muti * expecting[i];
        }
        return muti;
    }

    public int averageOfElementInArray(int [] expecting){
        int sum = 0;
        int average = 0;
        for(int i=0; i<expecting.length; i++){
            sum = sum + expecting[i];
        }
        return average = sum / expecting.length;
    }

    public int largestNumberInArray(int [] expecting){
        int largest = expecting[0];
        for(int i=1; i<expecting.length; i++){
            if(largest<expecting[i]){
                largest = expecting[i];
            }
        }
        return largest;
    }
    public int smallestNumberInArray(int [] expecting){
        int smallest = expecting[0];
        for(int i=1; i<expecting.length; i++){
            if(smallest>expecting[i]){
                smallest = expecting[i];
            }
        }
        return smallest;
    }
}
