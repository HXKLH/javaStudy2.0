package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main( String[] args ) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
//        person.age = -20;
        person.setAge(-20);
        person.show();



    }
}
