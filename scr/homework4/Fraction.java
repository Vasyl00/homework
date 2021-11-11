package homework4;

public class Fraction {
    int intPart;
    short decimalPart;
    public static void main(String[] args) {
        String input = "11,132";
        Fraction num1 = new Fraction(input);
        input = "11,9881";
        Fraction num2 = new Fraction(input);
        int[] res = new int[2];
        res = addition(num1, num2);
        System.out.println(res[0] + "," + res[1]);
        res = subtraction(num1, num2);
        System.out.println(res[0] + "," + res[1]);
    }

    public Fraction(int intPart, short decimalPart) {
        this.intPart = intPart;
        this.decimalPart = decimalPart;
    }

    public Fraction(String str) {

        int delimit = str.indexOf(',');
        if (str.charAt(0) == '-') {
        }

        int check = Integer.parseInt(str.substring(++delimit, str.length()));
        delimit--;
        if (check > Short.MAX_VALUE || check < Short.MIN_VALUE) {
            System.out.println("decimal part out of bounds Short type");
        }
        this.intPart = Integer.parseInt(str.substring(0, delimit));

        this.decimalPart = Short.parseShort(str.substring(++delimit, str.length()));

    }


    public static int[] addition(Fraction num1, Fraction num2) {
        int in1 = num1.intPart;
        int in2 = num2.intPart;
        int sh1 = num1.decimalPart;
        int sh2 = num2.decimalPart;
        int[] res = new int[2];
        int bound = 0;
        if (amount(sh1) > amount(sh2)) {
            bound = (amount(sh1) - amount(sh2));
            sh2 = sh2 * degree(10, bound);
        } else if (amount(sh2) > amount(sh1)) {
            bound = (amount(sh2) - amount(sh1));
            sh1 = sh1 * degree(10, bound);
        }
//both plus
        if ((in1 > 0 && in2 > 0) || (in1 > 0 && in2 > 0)) {
            res[0] = in1 + in2;
            res[1] = sh1 + sh2;
        }
//first minus
        else if (in1 < 0 && in2 > 0) {
            if (Math.abs(in2) > Math.abs(in1)) {
                res[0] = Math.abs(in2) - Math.abs(in1);
                if (Math.abs(sh1) > Math.abs(sh2)) {
                    bound = amount(sh1);
                    res[1] = Math.abs(sh2) - Math.abs(sh1) + degree(10, bound);
                    res[0]--;
                } else {
                    bound = amount(sh1);
                    res[1] = Math.abs(sh2) - Math.abs(sh1) + degree(10, bound);
                    res[0]--;
                }

            } else {
                res[0] = Math.abs(in1) - Math.abs(in2);
                if (Math.abs(sh1) > Math.abs(sh2)) {
                    bound = amount(sh1);
                    res[1] = Math.abs(sh2) - Math.abs(sh1) + degree(10, bound);
                    res[0]++;
                } else {
                    bound = amount(sh1);
                    res[1] = Math.abs(sh1) - Math.abs(sh2) + degree(10, bound);
                    res[0]--;
                }
                res[0] = -res[0];
            }

        }
//second minus
        else if (in1 > 0 && in2 < 0) {
            if (Math.abs(in2) > Math.abs(in1)) {
                res[0] = Math.abs(in2) - Math.abs(in1);
                if (Math.abs(sh2) > Math.abs(sh1)) {
                    res[1] = Math.abs(sh2) - Math.abs(sh1);
                    res[1] = Math.abs(res[1]);
                    res[0]++;
                } else {
                    bound = amount(sh2);
                    res[1] = Math.abs(sh2) - Math.abs(sh1) + degree(10, bound);
                    res[0]--;
                }
                res[0] = -res[0];
            } else if (Math.abs(in1) > Math.abs(in2)) {
                res[0] = Math.abs(in1) - Math.abs(in2);
            }
        }
//both minus
        else if (in1 < 0 && in2 < 0) {
            res[0] = Math.abs(in1) + Math.abs(in2);
            res[1] = sh1 + sh2;
            res[0] = -res[0];
        }
        //output when decimal part begin from 0
        if (amount(res[1]) > amount(sh1) || amount(res[1]) > amount(sh2)) {
            bound = amount(res[1]) - 1;
            res[1] = res[1] - degree(10, bound);
            if (res[0] < 0) {
                res[0]--;
            } else {
                res[0]++;
            }
        }
        if (amount(res[1]) < bound) {
            bound = bound - amount(res[1]);
            String result = res[0] + ",";

            for (int j = 0; j < bound; j++) {
                result = result + "0";
            }
            result = result + res[1];
        }
        return res;
    }

    public static int[] subtraction(Fraction num1, Fraction num2) {
        int in1 = num1.intPart;
        int in2 = num2.intPart;
        int sh1 = num1.decimalPart;
        int sh2 = num2.decimalPart;
        int[] res = new int[2];
        int bound = 0;
        if (amount(sh1) > amount(sh2)) {
            bound = (amount(sh1) - amount(sh2));
            sh2 = sh2 * degree(10, bound);
        } else if (amount(sh2) > amount(sh1)) {
            bound = (amount(sh2) - amount(sh1));
            sh1 = sh1 * degree(10, bound);
        }
//both minus
        if (in1 < 0 && in2 < 0) {
            if (Math.abs(in2) > Math.abs(in1)) {
                res[0] = Math.abs(in2) - Math.abs(in1);
                if (Math.abs(sh1) > Math.abs(sh2)) {
                    bound = amount(sh1);
                    res[1] = Math.abs(sh2) - Math.abs(sh1) + degree(10, bound);
                    res[0]--;
                } else {
                    bound = amount(sh1);
                    res[1] = Math.abs(sh2) - Math.abs(sh1) + degree(10, bound);
                    res[0]--;
                }
            } else {
                res[0] = Math.abs(in1) - Math.abs(in2);
                if (Math.abs(sh1) > Math.abs(sh2)) {
                    bound = amount(sh1);
                    res[1] = Math.abs(sh2) - Math.abs(sh1) + degree(10, bound);
                    res[0]++;
                } else if (Math.abs(sh1) == Math.abs(sh2)) {
                    res[1] = 0;
                } else {
                    bound = amount(sh1);
                    res[1] = Math.abs(sh1) - Math.abs(sh2) + degree(10, bound);
                    res[0]--;
                }
                res[0] = -res[0];
            }
        }

//first minus
        else if (in1 < 0 && in2 > 0) {
            res[0] = Math.abs(in2) + Math.abs(in1);
            res[1] = Math.abs(sh2) + Math.abs(sh1);
            res[0] = -res[0];
        }
//second minus
        else if (in1 > 0 && in2 < 0) {
            res[0] = Math.abs(in2) + Math.abs(in1);
            res[1] = Math.abs(sh2) + Math.abs(sh1);
        }
//both plus
        else if (in1 > 0 && in2 > 0) {
            res[0] = Math.abs(in1) - Math.abs(in2);
            res[1] = sh1 - sh2;
            if (res[1] < 0 && res[0] !=0) {
                bound = amount(sh1);
                res[1] = res[1] + degree(10, bound);
                res[0]--;
            }else if(res[1] < 0 && res[0] ==0){

            }

        }
        //output when decimal part begin from 0
        if (amount(res[1]) > amount(sh1) || amount(res[1]) > amount(sh2)) {
            bound = amount(res[1]) - 1;
            res[1] = res[1] - degree(10, bound);
            if (res[0] < 0) {
                res[0]--;
            } else {
                res[0]++;
            }
        }
        if (amount(res[1]) < bound) {
            bound = bound - amount(res[1]);
            String result = res[0] + ",";
            for (int j = 0; j < bound; j++) {
                result = result + "0";
            }
            result = result + res[1];
        }
        return res;
    }

    public static int amount(int i) {
        int am = 0;
        i = (i - (i - (i / 10) * 10)) / 10;
        am++;
        while (i > 0) {
            i = (i - (i - (i / 10) * 10)) / 10;
            am++;
        }
        return am;
    }

    public static int degree(int arg, int degree) {
        int result = 1;
        for (int j = 0; j < degree; j++) {
            result = result * arg;
        }
        return result;
    }
}
