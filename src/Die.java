import java.util.*;
public class Die{
    //data declaration
    private int faceValue;
    //default constructor ( no parameters)
    public Die(){
        faceValue = 1;
    }
    //method roll
    public void roll(){
        faceValue = (int)(Math.random()*6) + 1;
    }
    //getter method
    public int getFaceValue(){
        return faceValue;
    }
    //setter method
    public void setFaceValue(int num1){
        faceValue = num1;
    }
    //toString method
    public String toString(){
        return "Face Value: "+ faceValue;
    }
}
