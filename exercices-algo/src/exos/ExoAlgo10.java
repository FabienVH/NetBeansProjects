package exos;
/*
10. Inverser les éléments d'un tableau de 10 éléments 
(sans passer par un tableau intermédiaire).
*/
public class ExoAlgo10 {
    public static void main(String[] args) {
        int [] nb = {1,2,3,4,5,6,7,8,9,10};
        int temp;
         
        for(int j=0;j<5;j++){
            temp=nb[j];
            nb[j]=nb[9-j];
            nb[9-j]=temp;
           
        }
        for(int j=0;j<10;j++){
             System.out.println(nb[j]);   
        }
    }
}
