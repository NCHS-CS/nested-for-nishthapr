public class App{
   public static void main (String[]args){
   mystery2();
   mystery3();
    mystery4();
    challenge();
   }

   public static void mystery2(){
    for(int i= 1; i<6;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }
   }

   public static void mystery3(){
    for(int i= 1; i<6;i++){
        for (int k = 4;k>=(i);k--){
            System.out.print(".");
        }
        for(int j = 1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }
   }

   public static void mystery4(){
    for(int i= 1; i<6;i++){
        for (int k = 4;k>=(i);k--){
            System.out.print(".");
        }
        System.out.print(i);
        for(int j = 1;j<(i);j++){
            System.out.print(".");
        }
        System.out.println();
    }
   }

   public static void challenge(){

    for(int i= 1; i<10;i++){
        for(int j= (9-i); j>0;j--){
            System.out.print(" ");
        }
       
        for(int k= 1; k<=(2*i);k++){
            System.out.print(i);
        }
       System.out.println();
   }
    for(int i= 8; i>0;i--){
        for(int j= (9-i); j>0;j--){
            System.out.print(" ");
        }
       
        for(int k= 1; k<=(2*i);k++){
            System.out.print(i);
        }
       System.out.println();
   }
}

}