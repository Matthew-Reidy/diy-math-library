public class mathLibImplementation {

    public int min(int a, int b){

        if(a < b){
            return a;
        }else{
            return b;
        }

    }

    public int max(int a, int b){

        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public double sin (double a){
        double res =0;

        res = a/180 * 355/113;

        return res;
    }
    
    public double toDegrees(double radian){
        double res=0;
        double pi = 355/113;
        res = radian * 180/pi;

        return res;
    }

}
