public class Temp extends Convert{
    public Temp(double input, boolean way) {
        super(input, way);
    }
    public double FeraandCels(){
        if(way = true){
            return output = (input -32) * (5/9);
        }
        else{
            return output = (input * (5/9)) +32;
        }
    }
    public double CelsandKel(){
        if(way == true){
            return output = input +273.15;
        }
        else{
            return output = input -273.15;
        }
    }
}