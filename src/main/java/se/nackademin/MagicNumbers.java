package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;
           

    public int calculateA() {
    //String[] words = name.trim().split("\\s+");
    //A = (words.length); 
//1. Beräkna antalet namn (här: antalet mellanslag i namnet + 1)        
        String[] split = name.split( " " );
        //System.out.println( "Split : "+split.length ); 
        int A=(split.length);
//2. Lägg till kundens ålder       
        A= A + age;
        
//3. Subtrahera 7 tills siffran är under 10      
        while (A>=10)
        {            
         // System.out.println("Value of A is : "+ A ); 
            A= A-7;
        }
       // JOptionPane.showMessageDialog(null,"Herbeet frans");  
        return A;
    }

    public int calculateB() {
//1. Ta antalet tecken i kundens bostadsort
    int B = 0;
    for (int i = 0; i < location.length(); i++) {
      if (Character.isLetter(location.charAt(i)))
        B++;
    }
    //System.out.println(B + " letters.");

//2. Lägg till kundens inkomst
    B = B + income;

//3. Subtrahera 7 tills siffran är under 10
while (B >= 10)
        {            
         // System.out.println("Value of A is : "+ A ); 
            B= B-7;
        }
        return B;
    }

    public int calculateC() {
//1. Beräkna <A>
    int C= calculateA();
    
//2. Addera <B>
    C= C + calculateB();
    
//3. Subtrahera kundens längd

    C= C- height;
    
//4. Addera 10 tills talet inte längre är negativt
    while (C < 0)
        {            
         // System.out.println("Value of C is : "+ C ); 
            C= C+10;
        }
        
        return C;
    }

    public int calculateD() {
//1. Beräkna <A>
    int D = calculateA();
//2. Om <A> är över 5, addera <B>. Om <A> är under eller lika med 5, addera <C>.
    if (D > 5){
        D=D+calculateB();
        }
    else{
        D=D+calculateC();
        }
//3. Subtrahera kundens inkomst
    D= D-income;
//4. Addera 10 tills talet inte längre är negativt
    while (D < 0)
        {            
         // System.out.println("Value of D is : "+ D ); 
            D= D+10;
        }
        return D;
    }

    public int calculateE() {
      
//1. Ta kundens ålder
    double Ei= age;
//2. Multiplicera med kundens inkomst
    Ei= Ei*income;
//3. Multiplicera resultatet från steg 2 med kundens inkomst, igen
    Ei= Ei*income;
//4. Multiplicera resultatet från steg 3 med kundens längd
    Ei=Ei*height;
//5. Ta roten ur genom Math.sqrt()
    double Es= Math.sqrt(Ei);
    //System.out.println("Value of Ei is : "+ Ei );
    //System.out.println("Value of Es is : "+ Es );
    
//6. Dividera talet med 2 tills talet är under 10. 
    while (Es>=10)
    {     
        Es=Es/2;           
    // System.out.println("Value of EsDiv2 is : "+ Es ); 
    }


    
//7. Avrunda med Math.round()
     //System.out.println("Value of Es is : "+ Es );
    int E = (int) Math.round(Es);
    //System.out.println("Value of E is : "+ E );
        return E;
    }

    /*
    public String setName(String name) {
        this.name = name;
        return name;
    }
    */
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
