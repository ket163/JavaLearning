/**
 * Created by qa on 14.02.18.
 */
public class Calculator {

    private int result;


    public void sum(int ... params) {
        for (int param : params) {
            result = result + param;
        }
    }


    public int getResult() {
        return result;
    }

    public void cleanResult() {
        result = 0;
    }
}
