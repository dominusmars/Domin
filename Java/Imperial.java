public class Imperial extends Convert{

    public Imperial(double input, boolean way) {
        super(input, way);
    }
    public double InchandFeet(){
        if(way == true){
            return input /12;
        }
        else{
            return input *12;
        }
    }
    public double FeetandYards(){
        if(way ==true){
            return input / 3;
        }
        else{
            return input * 3;
        }
    }
    public double YardsandMiles(){
        if(way == true){
            return input/1760;
        }
        else{
            return input*1760;
        }
    }
}