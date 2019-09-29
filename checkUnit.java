

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
            return 3;
        }else if(input.equals("inch")){
            return 4;
        }else if(input.equals("feet")){
            return 5;
        }else if(input.equals("yard")){
            return 6;
        }else if(input.equals("mile")){
            return 7;
        }else if(input.equals("bit")){
            return 8;
        }else if(input.equals("byte")){
            return 9;
        }else if(input.equals("kb")){
            return 10;
        }else if(input.equals("mb")){
            return 11;
        }else if(input.equals("gb")){
            return 12;
        }else if(input.equals("tb")){
            return 13;
        }else if(input.equals("pb")){
            return 14;
        }
        return 0;
    }

}