/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 02/08/13
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Number {

    public static final int BINARY_BASE  = 2;
    public static final int REQUIRED_BIT = 1;
    private int decimalValue;

    public Number(int decimalValue) {
        this.decimalValue = decimalValue;
    }

    public Number() {
    }

    public int getNumberOfOnes() {
        int numberOfOnes=0;
        int givenDecimalNumber=decimalValue;
        while(givenDecimalNumber!=0){
             if(givenDecimalNumber%BINARY_BASE == REQUIRED_BIT){
                 numberOfOnes++;
             }
            givenDecimalNumber=givenDecimalNumber/BINARY_BASE;
        }
        return numberOfOnes;
    }
    public int [] sort(int numberArray[])
    {
        for(int i=0;i<numberArray.length;i++)
        {
            int j,currentNumber = numberArray[i];
            for(j=i-1;j>=0 && comparisonCriteria(numberArray[j],currentNumber);j--)
                numberArray[j+1]=numberArray[j];
            numberArray[j+1]=currentNumber;
        }
        return numberArray;
    }

    private boolean comparisonCriteria(int arrayNumber,int currentNumber) {
        Number numberOnRight = new Number(arrayNumber);
        Number numberOnLeft = new Number(currentNumber);
        if(numberOnRight.getNumberOfOnes() > numberOnLeft.getNumberOfOnes())
            return true;
        else if(numberOnRight.getNumberOfOnes() == numberOnLeft.getNumberOfOnes())
            return (arrayNumber > currentNumber);
        return false;
    }


}
