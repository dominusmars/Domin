public class ConvertData extends Convert{

    public ConvertData(double input, boolean way) {
        super(input, way);
    }
    public double bitandByte(){
        if (way == true){
            return input/8;
        }
        else{
            return input*8;
        }
    }
    public double byteandKb(){
        if (way == true){
            return input /1000;
        }
        else{
            return input*1000;
        }
    }
    public double kbandMb(){
        if (way == true){
            return input /1000;
        }
        else{
            return input *1000;
        }
    }
    public double mbandGb(){
        if (way == true){
            return input /1000;
        }
        else{
            return input *1000;
        }
    }
    public double gbandTb(){
        if (way == true){
            return input /1000;
        }
        else{
            return input *1000;
        }
    }
    public double tbandPb(){
        if (way == true){
            return input /1000;
        }
        else{
            return input *1000;
        }
    }
}