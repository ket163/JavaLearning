/**
 * Created by qa on 14.02.18.
 */
public class Calculator {

    private int result = 0;
    private int resultMinus = 0;
    private int resultMultiply = 0;
    private double resultDivide = 0;
    private int resultDivideFull = 0;


    public void plus(int... params) {

        result = params[0] + params[1];

    }

    public void minus(int... params) {


        resultMinus = params[0] - params[1];


    }

    public void multiply(int... params) {

        resultMultiply = params[0] * params[1];





    }

    public void divide(int ... params) {


        resultDivide = (double) params[0] / params[1];
        resultDivideFull = params[0] / params[1];

        if (params[0]%params[1] == 0) {
            System.out.println("The result is : " + resultDivideFull);
        }
        else {
            System.out.println("The result is : " + resultDivide);

        }

    }


    public int getResultPlus() {
        return result;
    }

    public int getResultMinus() {
        return resultMinus;
    }

    public int getResultMultiply() {
        return resultMultiply;
    }




    public void cleanResult() {
        result = 0;
    }


}

