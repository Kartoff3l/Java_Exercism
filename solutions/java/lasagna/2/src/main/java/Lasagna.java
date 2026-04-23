public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int a){
        int cooked = a;
        return expectedMinutesInOven() - cooked; 
    }
    public int preparationTimeInMinutes(int n){
        int layers = n;
        return 2 * layers;
    }
    public int totalTimeInMinutes(int a, int b){
        int prelayers = preparationTimeInMinutes(a);
        int precooked = b;
        return prelayers + precooked;
    }
}
