 class truck extends vehicle{
    private float   ShippingWeight;

    public truck (String model , String made , int year , float ShippingWeight){
        super( model , year , made);
        this.ShippingWeight=ShippingWeight;
    }

    public void setShippingWeight (float ShippingWeight){
        this.ShippingWeight=ShippingWeight;
    }
    
    public float getShippingWeight (){
        return ShippingWeight;
    }

    public void display (){
        System.out.println("MODELL : "+getModel());
        System.out.println("MADE IN "+getMade());
        System.out.println("SEAT'S NUM : "+getShippingWeight());
    }  
}
