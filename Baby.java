public class Baby {

    //实例变量(Instance Filed) - 每个婴儿都有自己的名字
    String name;

    //静态变量(Static Field) - 所有Baby对象共享这唯一的一个计数器
    static int numBabiesmade = 0;

    //构造方法(Constructor),用于在创建对象时设置属性的初始值，执行必要的初始化逻辑
    Baby(String newName){
        this.name = newName;

        numBabiesmade += 1;
        System.out.println(this.name + "诞生了！");
    }

    //实例方法(Instance Method) - 每个对象都可以执行的行为
    void sayHi(){
        System.out.println("Hi , my name is " + this.name + "!");
    }

    //静态方法(Static Method) - 属于类本身，用于报告总数
    static void reportTotalBabies(){
        System.out.println("--- 报告 ---");
        //静态方法可以直接访问静态变量
        System.out.println("目前一共诞生了" + numBabiesmade + "个婴儿。");
    }

    public static void main(String[] args){
        System.out.println("程序开始时，总数：" + numBabiesmade);
        Baby b1 = new Baby("爱丽丝");
        Baby b2 = new Baby("大卫");
        Baby b3 = new Baby("查理");

        b1.sayHi();
        b3.sayHi();

        Baby.reportTotalBabies();
    }
}
