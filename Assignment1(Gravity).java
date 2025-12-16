//引力计算

import java.util.Scanner;

class GravityCalculator {
    private static final double GRAVITY = -9.81;
    public static double calculatePosition(double acceleration, double time,
                                           double initialVelocity, double initialPosition) {
        //公式:x(t) = 0.5 * a * t^2 + vi * t + xi
        //计算第一项
        //java中 t^2 用 Math.pow(t , 2)或t * t 来实现
        double term1 = 0.5 * acceleration * Math.pow(time, 2);
        //第二项
        double term2 = initialVelocity * time;
        //计算最终位置
        double finalPosition = term1 + term2 + initialPosition;

        return finalPosition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//创建 Scanner 对象
        System.out.println("---重力计算器---");
        System.out.println("请输入初始高度（米）：");
        double initialPosition  = scanner.nextDouble();
        System.out.println("请输入初始速度（米/秒）：");
        double initialVelocity = scanner.nextDouble();
        System.out.println("请输入经过的时间（秒）：");
        double time = scanner.nextDouble();

        double finalPosition = calculatePosition(
                GRAVITY,
                time,
                initialVelocity,
                initialPosition
        );
        scanner.close();

        System.out.println("--计算结果--");
        System.out.println("在" + time + "秒后，物体的位置是：");
        System.out.println(finalPosition);
    }
}