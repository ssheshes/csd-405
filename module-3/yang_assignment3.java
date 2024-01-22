
/*Alexis Yang
 * CSD 405 Assignment 3
 * 23 January 2024
 */
import java.lang.Math;

public class yang_assignment3 {

    public static void main(String[] args) {

        // 3 instances of AlexisInteger class
        AlexisInteger a1 = new AlexisInteger(11);
        AlexisInteger a2 = new AlexisInteger();
        // AlexisInteger a2 = new AlexisInteger((int) Math.random());
        AlexisInteger a3 = new AlexisInteger(11);

        Integer aa1 = a1.getAlexis();
        Integer aa2 = a2.getAlexis();
        Integer aa3 = a3.getAlexis();

        // test all methods a1
        System.out.println("== a1: " + a1.getAlexis() + " ==");
        System.out.println(a1.getAlexis() + " is Even: " + a1.isEven());
        System.out.println(a1.getAlexis() + " is Odd: " + a1.isOdd());
        System.out.println(a1.getAlexis() + " is Prime: " + a1.isPrime());
        System.out.println("int " + a1.getAlexis() + " is Even: " + a1.isEven(a1.getAlexis()));
        System.out.println("int " + a1.getAlexis() + " is Odd: " + a1.isOdd(a1.getAlexis()));
        System.out.println("int " + a1.getAlexis() + " is Prime: " + a1.isPrime(a1.getAlexis()));
        System.out.println("Integer " + a1.getAlexis() + " is Even: " + a1.isEven(aa1));
        System.out.println("Integer " + a1.getAlexis() + " is Odd: " + a1.isOdd(aa1));
        System.out.println("Integer " + a1.getAlexis() + " is Prime: " + a1.isPrime(aa1));
        System.out.println();

        // test all methods a2
        System.out.println("==================");
        System.out.println();
        System.out.println("== a2: " + a2.getAlexis() + " ==");
        System.out.println(a2.getAlexis() + " is Even: " + a2.isEven());
        System.out.println(a2.getAlexis() + " is Odd: " + a2.isOdd());
        System.out.println(a2.getAlexis() + " is Prime: " + a2.isPrime());
        System.out.println("int " + a2.getAlexis() + " is Even: " + a2.isEven(a2.getAlexis()));
        System.out.println("int " + a2.getAlexis() + " is Odd: " + a2.isOdd(a2.getAlexis()));
        System.out.println("int " + a2.getAlexis() + " is Prime: " + a2.isPrime(a2.getAlexis()));
        System.out.println("Integer " + a2.getAlexis() + " is Even: " + a2.isEven(aa2));
        System.out.println("Integer " + a2.getAlexis() + " is Odd: " + a2.isOdd(aa2));
        System.out.println("Integer " + a2.getAlexis() + " is Prime: " + a2.isPrime(aa2));
        System.out.println();

        // test all methods a3
        System.out.println("==================");
        System.out.println();
        System.out.println("== a3: " + a3.getAlexis() + " ==");
        System.out.println(a3.getAlexis() + " is Even: " + a3.isEven());
        System.out.println(a3.getAlexis() + " is Odd: " + a3.isOdd());
        System.out.println(a3.getAlexis() + " is Prime: " + a3.isPrime());
        System.out.println("int " + a3.getAlexis() + " is Even: " + a3.isEven(a3.getAlexis()));
        System.out.println("int " + a3.getAlexis() + " is Odd: " + a3.isOdd(a3.getAlexis()));
        System.out.println("int " + a3.getAlexis() + " is Prime: " + a3.isPrime(a3.getAlexis()));
        System.out.println("Integer " + a3.getAlexis() + " is Even: " + a3.isEven(aa3));
        System.out.println("Integer " + a3.getAlexis() + " is Odd: " + a3.isOdd(aa3));
        System.out.println("Integer " + a3.getAlexis() + " is Prime: " + a3.isPrime(aa3));
        System.out.println();

        // equals
        System.out.println("==================");
        System.out.println();
        System.out.println("a1 = a2");
        System.out.println(" " + a1.equals(a2.getAlexis()));
        System.out.println();
        System.out.println("a1 = a3");
        System.out.println(" " + a1.equals(a3.getAlexis()));
        System.out.println();
        System.out.println("a2 = a1");
        System.out.println(" " + a2.equals(a1.getAlexis()));
        System.out.println();
        System.out.println("a2 = a3");
        System.out.println(" " + a2.equals(a3.getAlexis()));
        System.out.println();
        System.out.println("a3 = a1");
        System.out.println(" " + a3.equals(a1.getAlexis()));
        System.out.println();
        System.out.println("a3 = a2");
        System.out.println(" " + a3.equals(a2.getAlexis()));
        System.out.println();

        // Integer equals
        System.out.println("==================");
        System.out.println();
        System.out.println("==Integer Equals==");
        System.out.println();
        System.out.println("a1 = a2");
        System.out.println(" " + a1.equals(aa2));
        System.out.println();
        System.out.println("a1 = a3");
        System.out.println(" " + a1.equals(aa3));
        System.out.println();
        System.out.println("a2 = a1");
        System.out.println(" " + a2.equals(aa1));
        System.out.println();
        System.out.println("a2 = a3");
        System.out.println(" " + a2.equals(aa3));
        System.out.println();
        System.out.println("a3 = a1");
        System.out.println(" " + a3.equals(aa1));
        System.out.println();
        System.out.println("a3 = a2");
        System.out.println(" " + a3.equals(aa2));
        System.out.println();

    }

}

class AlexisInteger {

    private int alexis;

    // constructor
    public AlexisInteger(int a) {
        this.alexis = a;
    }

    public AlexisInteger() {
        alexis = 549;
    }

    // getter
    public int getAlexis() {
        return alexis;
    }

    // setter
    public void setAlexis(int a) {
        this.alexis = a;
    }

    // non-static methods
    public boolean isEven() {
        if ((alexis / 2) * 2 == alexis) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if ((alexis / 2) * 2 == alexis) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isPrime() {
        if (alexis == 2) {
            return true;
        } else if (alexis < 2) {
            return false;
        }

        for (int i = 2; i < alexis; i++) {
            if (alexis % i == 0) {
                return false;
            }
        }

        return true;
    }

    // static methods int
    public static boolean isEven(int a) {
        if ((a / 2) * 2 == a) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int a) {
        if ((a / 2) * 2 == a) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isPrime(int a) {
        if (a == 2) {
            return true;
        } else if (a < 2) {
            return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }

    // static methods Integer
    public static boolean isEven(Integer a) {
        if ((a / 2) * 2 == a) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(Integer a) {
        if ((a / 2) * 2 == a) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isPrime(Integer a) {
        if (a == 2) {
            return true;
        } else if (a < 2) {
            return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean equals(int a) {
        if (a == alexis) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Integer a) {
        if (a == alexis) {
            return true;
        } else {
            return false;
        }
    }

}
