package kr.hs.sdh.toast;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExampleService {

    public ExampleService() {}

    public String[] getFruits() {
        String[] fruits = new String[]{"사과", "바나나", "멜론", "수박"};
        return fruits;
    }

    public void driveCar(Car car){
        car.go();
    }
    public void carTest() {
        KiaCar kiaCar = new KiaCar();
        HyunDaiCar hyunDaiCar = new HyunDaiCar();

        driveCar(kiaCar);
        driveCar(hyunDaiCar);
    }

    public Menu getMenu() {
        List<Menu> menus = new ArrayList<Menu>();
        Menu subMenu1 = new Menu("서브 메뉴1", true);
        Menu subMenu2 = new Menu("서브 메뉴2", true);
        Menu subMenu3 = new Menu("서브 메뉴3", false);
        Menu subMenu4 = new Menu("서브 메뉴4", true);

        menus.add(subMenu1);
        menus.add(subMenu2);
        menus.add(subMenu3);
        menus.add(subMenu4);

        Menu rootMenu = new Menu("대메뉴", menus);

        return rootMenu;
    }

    public void parentTest() {
        // 반대로는 안됨
        Parent parent = new Child();
    }
}
