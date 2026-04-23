public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int a){
        int cooked = a;
        return expectedMinutesInOven() - cooked; 
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int n){
        int layers = n;
        return 2 * layers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int a, int b){
        int prelayers =   2 * a;
        int precooked = b;
        System.out.print(a + " "+b+" "+ prelayers + " "+ precooked);
        return prelayers + precooked;
    }
}
