package se.nackademin;

import java.util.*;  
import java.util.ArrayList;
import se.nackademin.gui.FortuneTellerGui;




public class FortuneTeller {
    MagicNumbers magicNumbers;
    FortuneTellerGui fortuneTellerGui;
    Translator translator;

    public  String  yourname;
    private String  name;
    private int     income;
    private String  location;
    private int     age;
    private int     height;

    /*
     * Returns a fortune based on name, income, location, age and height
     *
     * Calculates the magical numbers A-E, and then feeds these numbers to the Translator. The translator class returns
     * individual words which are fed into the magical template. The result of this operation is a scientifically
     * proven fortune.
     *
     * @return A scientifically proven fortune
     *
     */

    
    public String calculate() {
        int A=magicNumbers.calculateA();
        int B=magicNumbers.calculateB();
        int C=magicNumbers.calculateC();
        int D=magicNumbers.calculateD();
        int E=magicNumbers.calculateE();
        
        //tst = magicNumbers.Adjektiv(A);
        
//      tst = translator.Adjektiv(E);
//            
        String Adjektiv_1   = translator.Adjektiv(A);
        String verb_1       = translator.Verb(B);   
        String Substantiv_1 = translator.Substantiv(C);   
        String verb_2       = translator.Verb(D);  
        String Adjektiv_2   = translator.Adjektiv(E);
        
       //System.out.println("Hello  "+ yourname); 
         
        String answer =
                //"Hej "+ yourname +
                "Din framtid är "+Adjektiv_1
                + " och du borde sluta "+verb_1
                + ", Vi ser att du snart kommer att skaffa "+Substantiv_1
                + "\nSnart kommer du vilja "+verb_2
                + " men då är det viktigt att du är "+Adjektiv_2
                + "\n************\n";
        
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        new FortuneTeller();
    }

    FortuneTeller() {
        fortuneTellerGui = new FortuneTellerGui(this);
        magicNumbers = new MagicNumbers();
        translator = new Translator();
        

    }

    public boolean setName(String name) {
       magicNumbers.setName(name);
       yourname = name;
       // System.out.println("ValueNameset is : "+ name); 
      
    return name != null;
    
    }

    Integer convertToInteger(String input) {
        Integer output = null;
        try {
            output = Integer.valueOf(input);
        } catch (NumberFormatException numberFormatException) {
            //if an exception is caught we'll return null
        }
        return output;
    }

    public boolean setIncome(String income) {
        Integer incomeValue = convertToInteger(income);
        if (incomeValue == null) {
            return false;
        } else {
            magicNumbers.setIncome(incomeValue);
            return incomeValue<=10_000_000;
        }
    }

    public boolean setLocation(String location) {
        magicNumbers.setLocation(location);
        return location != null;
    }

    public boolean setAge(String age) {
        Integer ageValue = convertToInteger(age);
        if (ageValue == null) {
            return false;
        } else {
            magicNumbers.setAge(ageValue);
            return true;
        }
    }

    public boolean setHeight(String height) {
        Integer heightValue = convertToInteger(height);
        if (heightValue == null) {
            return false;
        } else {
            magicNumbers.setHeight(heightValue);
            return true;
        }
    }
}
