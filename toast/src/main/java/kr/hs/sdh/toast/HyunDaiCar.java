package kr.hs.sdh.toast;

public class HyunDaiCar implements Car{
    @Override
    public void go() {
        System.out.println("간다 현다이");
    }

    @Override
    public void back() {
        System.out.println("나와라 현다이");
    }
}
