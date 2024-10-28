package combination_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类（树枝节点）
 */

public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++)
            System.out.print("--");
        //打印菜单名称
        System.out.println(name);
        //打印子菜单或者子菜单项名称
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }
}
