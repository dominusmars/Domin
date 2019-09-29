public class Data extends Convert{
    public Data(double input, boolean way){
        super(input,way)
    }
    public double bitandByte(){
        if (way == true){
            return output = input/8;
        }
        else{
            return output = input*8;
        }
    }
    public double byteandKb(){
        if (way == true){
            return output = input /1000;
        }
        else{
            return output = input*1000;
        }
    }
    public double kbandMb(){
        if (way == true){
            return output = input /1000;
        }
        else{
            return output = input *1000;
        }
    }
    public double mbandGb(){
        if (way == true){
            return output = input /1000;
        }
        else{
            return output = input *1000;
        }
    }
    public double gbandTb(){
        if (way == true){
            return output = input /1000;
        }
        else{
            return output = input *1000;
        }
    }
    public double tbandPb(){
        if (way == true){
            return output = input /1000;
        }
        else{
            return output = input *1000;
        }
    }
}