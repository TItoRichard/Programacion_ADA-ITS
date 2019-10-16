public class CondicionalWhile {
    public static void main (String[] args) {
        int n = 0;
        boolean control = true;
        while (control) {
            //n++; //n = n + 1 --> n +=1;
            System.out.println("Este se ejecuta por "+(++n)+" vez");
            if (n > 6){
                control = false;
            }
        }
    }
}