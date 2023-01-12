package com.tta.learn.threadlocalexplain;

public class TL01 {
    public static void main(String[] args) {
        String t1 = WebdriverDummy.getDriverTL();
        String t2 = WebdriverDummy.getDriverTL();
        t1 = "Hello";
        t2 = "HelloA";
        System.out.println(t1);
        System.out.println(t2);
        t2=t1;
        System.out.println(t2);
    }
}


class WebdriverDummy{

    private static ThreadLocal<String> driverTL = new ThreadLocal<>();

    public static String getDriverTL() {
        return driverTL.get();
    }

    public static void setDriverTL(String driverTLPassed) {
        driverTL.set(driverTLPassed);
    }

    public static void resetDriverTL(){
        driverTL.remove();
    }

}
