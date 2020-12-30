import java.math.*; //library to perform certain mathematical functions
public class PerfectSquare { //class to find whether the number is perfect square or not
    public static void main(String[] args) {
        int number=25; //number for which we have to find perfect square
        int squareRootNumber=(int)Math.sqrt(number); //Taking out the square root of the number
        if(squareRootNumber*squareRootNumber==number)  //condition to check whether the number is perfect square or not
        {
            System.out.println("Yes the number is perfect square");
        }

        else{
            System.out.println("No the number is not perfect square");
        }

    }
}












![Perfect Square](https://user-images.githubusercontent.com/74056455/103378767-7aaed880-4b09-11eb-8af3-01153d845758.PNG)
