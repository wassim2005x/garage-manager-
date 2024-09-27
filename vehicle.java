abstract class vehicle {
      private String model;
      private int year;
      private String  made;

      public vehicle(String model, int year, String made) {
        this.model = model;
        this.year = year;
        this.made = made;
    }
       

   
   public void setModele (String model){
    this.model=model;
   }

   public void setYear (int  year){
    this.year=year;
   }

   public void setMade (String made){
    this.made=made;
   }

   public String getModel (){
    return model;
   }

   public int getYear (){
    return year;
   }

   public String getMade (){
    return made;
   }

     abstract public void display ();   
}
