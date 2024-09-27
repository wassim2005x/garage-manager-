class motorcycle extends vehicle{
    private float SizeEngine;

    public motorcycle (String model , String made , int year , float SizeEngine){
        super( model , year , made);
        this.SizeEngine=SizeEngine;
    }

    public void setSizeEngine (float SizeEngine){
        this.SizeEngine=SizeEngine;
    }
    
    public float getSizeEngine (){
        return SizeEngine;
    }

    public void display (){
        System.out.println("MODELL : "+getModel());
        System.out.println("MADE IN "+getMade());
        System.out.println("SEAT'S NUM : "+getSizeEngine());
    }


}
