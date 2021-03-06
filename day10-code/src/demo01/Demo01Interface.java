package demo01;
/*
接口就是多個類的公共規範
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法
如何定义一个接口的格式：
public interface 接口名称{
  //接口内容
}

备注：换成interface关键词后，编译生成的字节码文件仍然是： .java ---> . class。

如果是JAVA7,那么接口中可以包含的内容有：
1常量
2抽象方法

如果是java 8，还可以额外包含
3默认方法
4静态方法

如果是java 9 还包含：
5私有方法

接口使用步骤：
1、接口不能直接使用，必须要有一个“实现类”来实现该接口
格式
public class 实现类名称 implement 接口名称{
        //....
}
2、接口实现类必须重写接口中所有的抽象方法
3、创建实现类对象，进行使用

注意事项：
如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己必须是抽象类
 */
public class Demo01Interface {
    public static void main( String[] args ) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
    }
}
