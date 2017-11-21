package exos;

 //11. Trier un tableau de 10 éléments par ordre croissant.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ExoAlgo11 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        String saisi;
        int [] nb = new int[10];
        int temp;
        
        
        System.out.println("saisie de 10 valeurs:");
        for(int i =0;i < 10;i++){
            System.out.println("saisir la valeur n°"+(i+1));
            saisi = br.readLine();
            nb[i] = Integer.valueOf(saisi);
        } 
        System.out.println("---classement des nombres ---");
        for(int j =0;j<10;j++){
            for(int i =j;i<10;i++){
                if(nb[i]<nb[j]){
                    temp =nb[j];
                    nb[j]=nb[i];
                    nb[i]=temp;
                }
            }
        }
        
         for(int k=0;k<10;k++){
             System.out.println(nb[k]);   
        }
         
         br.close();
         isr.close();
    }
}
