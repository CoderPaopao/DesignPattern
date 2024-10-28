package expression_pattern;

/**
 * 用于封装变量的类
 */

public class Variable extends AbstractExpression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }


    @Override
    public int interpret(Context context) {
        //返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
