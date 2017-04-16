package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Translator {

    private String name;   
    private String Adjektiv, Substantiv, Verb;
       
    
    public String Adjektiv (int seq) {
//        System.out.println("translatorverb: "+ seq);          
        List<String> valAdjektiv = new ArrayList<>();                
            valAdjektiv.add("stor");      //#0
            valAdjektiv.add("liten");     //#1
            valAdjektiv.add("stark");     //#2
            valAdjektiv.add("svag");      //#3
            valAdjektiv.add("mjuk");      //#4
            valAdjektiv.add("hård");      //#5
            valAdjektiv.add("snabb");     //#6
            valAdjektiv.add("vacker");    //#7
            valAdjektiv.add("ljus");      //#8
            valAdjektiv.add("mörk");      //#9
            
            valAdjektiv.add("FEL");       //#10
            
            Adjektiv = valAdjektiv.get(seq);     
          //          
          System.out.println("Adjektiv: "+ Adjektiv); 
           return Adjektiv;
            
    }
    
        public String Substantiv (int seq) {
//        System.out.println("translatorverb: "+ seq);          
            List<String> valSubstantiv = new ArrayList<>();                
            valSubstantiv.add("en lönehöjning");	//	#0
            valSubstantiv.add("en lönesänkning");	//	#1
            valSubstantiv.add("en fotboja");           //	#2
            valSubstantiv.add("en katt");              //	#3
            valSubstantiv.add("en hund");              //	#4
            valSubstantiv.add("ett hus");              //	#5
            valSubstantiv.add("ett barn");             //	#6
            valSubstantiv.add("ett elstängsel");	//	#7
            valSubstantiv.add("en dator");             //	#8
            valSubstantiv.add("ett golv");             //	#9

            valSubstantiv.add("FEL");                   //      #10
            
            Substantiv = valSubstantiv.get(seq);     
          //          
          System.out.println("Substantiv: "+ Substantiv); 
           return Substantiv;
    }
        
       
        public String Verb (int seq) {
//        System.out.println("translatorverb: "+ seq);          
            List<String> valVerb = new ArrayList<>();                
            valVerb.add("springa");	//	#0
            valVerb.add("ljuga");	//	#1
            valVerb.add("flyga");	//	#2
            valVerb.add("se");          //	#3
            valVerb.add("vara");	//	#4
            valVerb.add("äta");         //	#5
            valVerb.add("mäta");	//	#6
            valVerb.add("gå");          //	#7
            valVerb.add("röra");	//	#8
            valVerb.add("resa");	//	#9

            valVerb.add("FEL");         //      #10
            
            Verb = valVerb.get(seq);     
          //          System.out.println("Verb: "+ Verb); 
           return Verb;
    }  
     
          
      
    
}
