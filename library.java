public class mathLibImplementation {
    public final double pi = 3.14159265359;

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

        res = a/180 * pi;

        return res;
    }

    public double tan( double a){
        int res =0;

        return res;

    }

    public double cos( double a){
        int res =0;

        return res;

    }

    public double toDegrees(double radian){
        return radian * 180/pi;
    }

    public double toRadians(double degree){
        return degree * pi/180;
    }

}
