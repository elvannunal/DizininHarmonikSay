public class Array {
    public static void main(String[] args) {

        int[] list={1,2,3,4,5,6,7,8,9,10};

       /* for(int i=0; i< list.length; i++){
            System.out.println(list[i]);
        }*/
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        System.out.println(sum);


       /* int [][] matris=new int[3][4];

        int number=1;

        for(int i=0;i< matris.length; i++){
            for (int j=0; j< matris[i].length; j++){
                matris[i][j]=number++;
            }
        }

        for(int i=0; i< matris.length; i++){
            for(int j=0; j< matris[i].length; j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
