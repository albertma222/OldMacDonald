class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String soundX, String soundY)     {         
         myType = type;         
         if(Math.random() < 0.5)
           mySound = soundX;
         else
           mySound = soundY;
     }
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}  