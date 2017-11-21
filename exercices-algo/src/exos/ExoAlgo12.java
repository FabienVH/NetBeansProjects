package exos;

  //12. Fusionner deux tableaux déjà triés par ordre croissant

public class ExoAlgo12 {
    public static void main(String[] args) {
       
  
        int [] nb = {1,9,22,37};
        int [] tb = {2,5,15};
        int [] rb = new int[nb.length+tb.length];
        int k =0;
        int i =0;
        int j=0;
        
        System.out.println(rb[k]);
        if(nb[i]<tb[j]){
            while(nb[i]<=tb[j]){
                rb[k]=nb[i];
                i=i++;
                k=k++; 
                 System.out.println(rb[k]); System.out.println(rb[k]);
            }
        }else{
            while(tb[j]<=nb[i]){
                rb[k]=tb[j];
                j=j++;
                k=k++;  
            }
        }
        for(int l =0;l<(rb.length);l++){
            System.out.println(rb[l]);
        }
        
        
        
   
    }}

