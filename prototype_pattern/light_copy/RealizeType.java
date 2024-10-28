package prototype_pattern.light_copy;

public class RealizeType implements Cloneable{

    public RealizeType() {
        System.out.println("具体的原型对象创建完成！");
    }

    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体的原型复制成功！");
        return (RealizeType) super.clone();
    }

}
