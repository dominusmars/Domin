public class Temp extends Convert{
    public Temp(double input, boolean way) {
        super(input, way);
    }
    public double FeraandCels(){
        if(way == true){
            return (input -32) * ((double)5/9);
        }
        else{
            return (input*(double)9/5) +32;
        }
    }
    public double CelsandKel(){
        if(way == true){
            return input +273.15;
        }
        else{
            return input -273.15;
        }
    }
}