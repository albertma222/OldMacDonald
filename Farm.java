class Farm  {     
   private Animal[] aBunchOfAnimals = new Animal[4];    
   public Farm()     {
      aBunchOfAnimals[0] = new Cow("Cow","mooooo!"); 
      aBunchOfAnimals[1] = new Chick("Chick","cluck!","cheep!");       
      aBunchOfAnimals[2] = new Pig("Pig","oink!");
      aBunchOfAnimals[3] = new NamedCow("Rosie","mooooo!","Rosie.");  
    }
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());
      }
       System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[3]).getName());
    } 
} 