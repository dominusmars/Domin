
public class Metric extends Convert{

    public Metric(double input, boolean way) {
        super(input, way);
    }
    public double MMandCM(){
        if(way == true){
           return output = input / 10;
        }
        else{
           return output = input*10;
        }
    }
    public double CMandM(){
        if(way == true){
            return output = input / 100;
        }
        else{
            return output = input*100;
        }
    }
    public double MandKM(){
        if(way==true){
            return output = input /1000;
        }
        else{
            return output = input*1000;
        }
    }
}