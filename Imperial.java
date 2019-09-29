public class Imperial extends Convert{

    public Imperial(double input, boolean way) {
        super(input, way);
    }
    public double InchandFeet(){
        if(way == true){
            return output = input /12;
        }
        else{
            return output = input *12;
        }
    }
    public double FeetandYards(){
        if(way ==true){
            return output = input / 3;
        }
        else{
            return output = input * 3;
        }
    }
    public double YardsandMiles(){
        if(way == true){
            return output = input/1760;
        }
        else{
            return output = input*1760;
        }
    }
}