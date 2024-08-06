public class pre_incre_post_incre {
    public static void main(String[] args) {
        int v=55;
        int a=67;
        int b=98;
        int d=88;
        //int y=++v,v++,v++,a++;
       int y=v++ + ++v + a++ + v++ + d++ + ++b;
       
        System.out.println(y);
        
    }
    
}
