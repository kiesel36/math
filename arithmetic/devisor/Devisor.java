public class Devisor{
    public static int getGreatestCommundDeviderEuclid(int number1, int number2){
        int result=number2;
        int memory;
        while((memory=number1%number2)!=0){
            number1=number2;
            number2=memory;
        }
        return result;
    }
}