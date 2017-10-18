class NamedCow extends Cow 
{
  private String myName;      
  public NamedCow(String name) {
      myName = name;
  public Cow() {              
         myName = "unknown";     
     }        
     public String getName(){return myName;} 
  }
}