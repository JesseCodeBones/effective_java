
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //equals方法的实现分为几步：
    //1， 先判断是否是自身，这样会增加效率
    //2， 判断是否是同一类型，同时排除null
    //3， 转换为同一类型
    //4， 比较关键字段
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    //hashCode主要是一些Hash集合中会用到，他们会先去找相同HASH值的对象。
    //原则是equals方法返回true的对象，要返回相同的hash值。
    //不同的要返回不同的hash值。
    @Override
    public int hashCode() {
        int result = 1;
        result += x;
        result += y;
        return result;
    }
}
