
/* Given a route containing 4 direction (E,W,N,S) find the Shortest path to reach destination
   i/p: WNEENESENNN
   o/p:5 ;;;;
   i/p:NS
   o/p:0.0
 * 
 */


public class ShortestPath {
    public static float FindShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            // South
            if(dir=='S'){
                y--;
            }
            // North
            else if(dir=='N'){
                y++;
            }
            // West
            else if(dir =='W'){
                x--;
            }
            // East
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        // Distance =square of (x2-x1)+(y2-y1)
        return (float)Math.sqrt(X2+Y2);


    }
    public static void main(String[] args) {
        // String str="WNEENESENNN";
        String str="NS";
       System.out.println(FindShortestPath(str)) ;
    }
}
