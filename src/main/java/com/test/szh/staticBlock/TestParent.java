package com.test.szh.staticBlock;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/11/4 10:34
 * @desc com.test.szh.config:
 */
public class TestParent {
    private String name;
    private Integer age;
    public static String Static_String = "parent String";
    static{
        System.out.println("parent 静态代码块");
    }
    {
        System.out.println("parent 非静态代码块");
    }

    public String claim(){
        System.out.println(this.name+this.age);
        return "name";
    }

    public TestParent(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("parent name age");
    }

    public TestParent() {
        System.out.println("parent black");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
