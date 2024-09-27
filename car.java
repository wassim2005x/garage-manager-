public class car extends vehicle {
    private int NumSeats;

    public car (String model , String made , int year , int NumSeats){
        super( model , year , made);
        this.NumSeats= NumSeats;
    }

    public void setNumSeats (int NumSeats){
        this.NumSeats= NumSeats;
    }
    
    public int getNumSeats (){
        return NumSeats;
    }

    public void display (){
        System.out.println("MODELL : "+getModel());
        System.out.println("MADE IN "+getMade());
        System.out.println("SEAT'S NUM : "+getNumSeats());
    }



}
