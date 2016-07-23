import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stu {

    public static void main(String[] args) throws IOException{

        float one;
        float two;

        System.out.println("Set first number: ");
        one = Integer.parseInt(setNumber());
        System.out.println("Set second number: ");
        two = Integer.parseInt(setNumber());
        System.out.println("Choise action (+, -, /, *): ");
        Stu stu = new Stu();
        System.out.println("Result : " + stu.actionSwitch(one, two));
    }

    public static String setNumber() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        return read.readLine();
    }

    public static String setActionChoise() throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        return read.readLine();
    }

    public static float actionSwitch(float one, float two) throws IOException{
        float result = 0;

        switch (setActionChoise()) {
            case ("+"):
                result = one + two;
                break;
            case ("-"):
                result = one - two;
                break;
            case ("*"):
                result = one * two;
                break;
            case ("/"):
                if (one == 0) {
                    System.out.println("Na nol delit' nelzya");
                    return result;
                }
                result = one / two;
                break;
            case ("^"):
                result = (float)Math.pow(one, two);
                break;
            default: System.out.println("Посчитать не удалось");
        }
        return result;
    }
}