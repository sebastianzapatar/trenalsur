public class Excersices {
    public static int[] middle(int[] vec){
        if(vec.length<=2){
            return new int[0];
        }
        int newVec[]=new int[vec.length];
        for(int i=1;i<vec.length-1;i++){
            newVec[i-1]=vec[i];
        }
        return newVec;
    }
}
