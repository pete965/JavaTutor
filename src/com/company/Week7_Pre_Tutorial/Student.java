package com.company.Week7_Pre_Tutorial;


/**
 * 在这里给出对类 Student 的描述。
 *
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Student
{
    private int age;
    private String name;
    public static void main(String[] args) {
        //构造对象
        //Constructor

        Student student1 =  new Student("Bob",12);
        Student student2 = new Student("Alice",123);
        //使用
        //Getter
        System.out.println("This student's age is:"+ student1.getAge());
        System.out.println("This student's name is:"+ student1.getName());
        //Setter
        System.out.println("We change the name of this student");
        student1.setName("Kevin");
        //查看下Setter的设置效果
        System.out.println("This student's name is:"+student1.getName());
    }

    public void setName(String newName) {
        //设定此对象的name属性
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    // 实例变量 - 用你自己的变量替换下面的例子


    /**
     * 类 Student 的对象的构造函数
     */
    public Student(String name,int age)
    {
        // 初始化实例变量
        this.age = age;
        this.name = name;
    }

    /**
     * 一个方法的例子 - 使用你自己的说明替代它
     *
     * @参数 y，方法的一个样本参数
     * @返回 x，y的和
     */
    public int sampleMethod(int y)
    {
        // 在这里加入你的代码
        return y;
    }

    //Getter and setter for property "age"
    public int getAge(){
        return this.age;
    }

    public void setAge(int i) {
        this.age = i;
    }
}

