public class Calculator {

    public static  Integer firstNumber;
    public static Integer[] result = new Integer[10];

    public static void main(String[] args) {
        testAllCalc();
    }

    /**
     * method menampilkan result
     */
    public static void showResult(){

        for (var i = 0; i < result.length; i++){
            if(result[i] != null){
                System.out.println(result[i]);
            }
        }
    }

    public  static void testShowResult(){
        result[0] = 2;
        result[1] = 3;
        result[2] = 5;
        result[3] = 78;

        showResult();
    }

    /**
     * menambah value ke firstNumber variabel dari index terakhir array result
     */
    public static void firstNumberFromLastIndexResult(){
        for (var i = 0; i < result.length; i++){
            int id;
            if (result[i] == null) {
                id = i - 1;
                firstNumber = result[id];
                break;
            }
        }
    }

    public  static void testFirstNumberFromLastIndexResult(){
        result[0] = 2;
        result[1] = 3;
        result[2] = 5;
        result[3] = 78;

        firstNumberFromLastIndexResult();
        System.out.println(firstNumber);
    }

    /**
     * method menambah result
     */
    public static void addResult(int resultCalc){
        var isFull = true;

        for (var i = 0; i < result.length; i++){
            if(result[i] == null){
                result[i] = resultCalc;
                firstNumber = resultCalc;
                isFull = false;
                break;
            }
        }

        if(isFull){
            var temp = result;
            result = new Integer[result.length * 2];

            for(var i = 0; i < temp.length; i++){
                result[i] = temp[i];
            }

            for(var i = temp.length -1; i < result.length; i++){
                if(temp[i] != null){
                    result[i] = resultCalc;
                    firstNumber = resultCalc;
                    break;
                }
            }
        }


    }

    public static void testAddResult(){

        for (var i = 0; i < 20; i++) {
            addResult(i + 1);
        }

        showResult();
        firstNumberFromLastIndexResult();
        System.out.println(firstNumber);
    }

    /**
     *
     * method calculator tambah
     */
    public static void calcAdd(Integer secondNumber){
        var res = firstNumber + secondNumber;
        addResult(res);
    }

    public static void testCalcAdd(){
        firstNumber = 10;
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);
        calcAdd(10);

        System.out.println(firstNumber);


        showResult();
    }

    /**
     *
     * method calculator pengurangan
     */
    public static void calcMin(Integer secondNumber){
        var res = firstNumber - secondNumber;
        addResult(res);
    }

    public static void testCalcMin(){
        firstNumber = 10;
        calcAdd(10);
        calcMin(5);
        calcAdd(30);
        calcMin(20);

        System.out.println(firstNumber);
        showResult();
    }


    /**
     *
     * method calculator kali
     */
    public static void calcTime(Integer secondNumber){
        var res = firstNumber * secondNumber;
        addResult(res);
    }

    /**
     *
     * method calculator bagi
     */
    public static void calcFor(Integer secondNumber){
        var res = firstNumber / secondNumber;
        addResult(res);
    }


    public static void testAllCalc(){
        firstNumber = 10;
        calcAdd(20);
        calcMin(10);
        calcTime(2);
        calcFor(2);
        calcAdd(20);
        calcMin(10);
        calcTime(2);
        calcFor(2);
        calcAdd(20);
        calcMin(10);
        calcTime(2);
        calcFor(2);

        System.out.println(firstNumber);
        showResult();
    }

}
