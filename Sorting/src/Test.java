import java.util.Random;
public class Test {
	
    int  n=6400000;
    int[]array=new int[n];
    Random r=new Random();
    public  void addRandomValue(){
        for(int i=0;i<n;i++){
        array[i]=r.nextInt(1000);
        }
    }
public  void bubble(){
    for(int i= array.length-1;i>1;i--){
            for(int j =0;j<i;j++){
                if(array[j]>array[j+1]){
                    swap(j,j+1);
}
            }
    }
}
public  void insertion(){
     int in,out;
        for (out=1;out<array.length;out++){
            int temp =array[out];
            in = out;
            while(in>0 && array[in-1]>=temp){
            array[in]=array [in-1];
            in--;
            }
            array[in]=temp;
}
        }
public void swap(int a,int b){
    int temp=array[a];
    array[a]=array[b];
    array[b]=temp;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test t1=new Test();
	       t1.addRandomValue();
	       long startTime=System.currentTimeMillis();//record starting time
	       //t1.bubble();
	       t1.insertion();
	       long endTime=System.currentTimeMillis();//record the end time
	       long elapsed=endTime-startTime;//compute the elapsed time
	       System.out.println("Execution time: "+elapsed);
	   

	}

}
