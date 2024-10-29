package kr.hs.sdh.toast;

import java.util.List;

public class Menu {
    private String name;
    private Boolean isActive;
    private List<Menu> menus;

    public Menu(String name) {
        this.name = name;
    }
    public Menu(Boolean isActive){
        this.isActive = isActive;
    }
    public Menu(String name, List<Menu> menus) {
        this.name = name;
        this.menus = menus;
    }
    public Menu(String name, Boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }
    public Menu(String name, Boolean isActive, List<Menu> menus) {
        this.name = name;
        this.isActive = isActive;
        this.menus = menus;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}