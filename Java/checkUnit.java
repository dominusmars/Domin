

public class checkUnit{
    String input;
    
    public checkUnit(String input){
        this.input = input;
    }
	public int numberUnit() {
        if (input.equals("mm")){
            return 1;
        }else if(input.equals("cm")){
            return 2;
        }else if(input.equals("m")){
            return 3;
        }else if(input.equals("km")){
            return 4;
        }else if(input.equals("inch")){
            return 5;
        }else if(input.equals("feet")){
            return 6;
        }else if(input.equals("yard")){
            return 7;
        }else if(input.equals("mile")){
            return 8;
        }else if(input.equals("bit")){
            return 9;
        }else if(input.equals("byte")){
            return 10;
        }else if(input.equals("kb")){
            return 11;
        }else if(input.equals("mb")){
            return 12;
        }else if(input.equals("gb")){
            return 13;
        }else if(input.equals("tb")){
            return 14;
        }else if(input.equals("pb")){
            return 15;
        }else if(input.equals("F")){
            return 16;
        }else if(input.equals("C")){
            return 17;
        }else if(input.equals("Kel")){
            return 18;
        }
        return 0;
    }

}