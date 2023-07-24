public class Main {
    public static boolean shouldWakeUp(boolean param1,int param2) {
        boolean s=false;
         if(param1==true && param2>-1 && (param2<9 || param2>20)){
             s=true;
            return  s ;
        
        }
        s=false;
        return s;
      }
      public static boolean hasTeen(int param1,int param2,int param3) {
        boolean s=false;
         if((param1<20 && param1>12) ||(param2<20 && param2>12)|| (param3<20 && param3>12)){
             s=true;
            return  s ;
        
        }
        s=false;
        return s;
      }
    public static boolean isCatPlaying(boolean param1,int param2) {
        boolean s=false;
         if((param1==true && (param2>24 && param2<46)) || (param1==false && (param2>24 && param2<36)) ){
             s=true;
            return  s ;
        
        }
        s=false;
        return s;
      }
      public static int area(int param,int param2) {
         if(param<0 || param2<0){
             
            return  -1 ;
        
        }
        return param*param2;
      }
      public static double area( double param) {
         if(param<0){
             
            return  -1 ;
        
        }
        return param*param*Math.PI;
      }
      public static void main(String[] args) {
        System.out.println(area(9.5));
      }
}