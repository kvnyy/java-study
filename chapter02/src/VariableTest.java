/*
测试变量的基本使用
1. 变量的理解：变量是存储数据的，数据是存放在计算机内存中的。
2. 变量的声明：数据类型 变量名 = 值;
3. java中变量的数据类型：
    基本数据类型：
        byte  8位
        short 16位
        int   32位
        long  64位
        float 32位
        double 64位
        char  16位
        boolean 1位
     引用数据类型：
        String 引用数据类型，String是java中字符串类型
        Class  引用数据类型，Class是java中类类型
        Object  引用数据类型，Object是java中Object类型
        Array  引用数据类型，Array是java中数组类型
        Interface  引用数据类型，Interface是java中接口类型
        Enum  引用数据类型，Enum是java中枚举类型
        Annotation  引用数据类型，Annotation是java中注解类型
        等

 */

public class VariableTest {
    public static void main(String[] args) {
        // 定义变量的方式
        // 1. 声明变量 + 赋值
        int a;
        a = 10;
        System.out.println("变量a的值: " + a);

        // 2. 声明变量 + 赋值合并
        int b = 20;
        System.out.println("变量b的值: " + b);
        
        // 3. 声明多个变量
        int c, d;
        c = 30;
        d = 40;
        System.out.println("变量c的值: " + c + ", 变量d的值: " + d);
        
        // 4. 声明多个变量 + 赋值合并
        int e = 50, f = 60;
        System.out.println("变量e的值: " + e + ", 变量f的值: " + f);
        
        // 基本数据类型的使用示例
        testPrimitiveTypes();
        
        // 引用数据类型的使用示例
        testReferenceTypes();
        
        // 进制的认识和使用
        testNumberSystems();
        
        // 调用其他测试方法
        testAutoTypePromotion();
        testForceTypeConversion();
        testArithmeticOperators();
        testRelationalOperators();
        testLogicalOperators();
        testAssignmentOperators();
    }
    
    // 基本数据类型的使用示例
    public static void testPrimitiveTypes() {
        System.out.println("\n=== 基本数据类型使用示例 ===");
        
        // byte类型: 8位有符号整数，范围-128到127
        byte byteValue = 100;
        System.out.println("byte类型值: " + byteValue);
        
        // short类型: 16位有符号整数，范围-32,768到32,767
        short shortValue = 10000;
        System.out.println("short类型值: " + shortValue);
        
        // int类型: 32位有符号整数，范围约-21亿到21亿
        int intValue = 1000000;
        System.out.println("int类型值: " + intValue);
        
        // long类型: 64位有符号整数
        long longValue = 10000000000L; // 注意long类型字面量需要加L后缀
        System.out.println("long类型值: " + longValue);
        
        // float类型: 32位单精度浮点数
        float floatValue = 3.14159f; // 注意float类型字面量需要加f后缀
        System.out.println("float类型值: " + floatValue);
        
        // double类型: 64位双精度浮点数
        double doubleValue = 3.14159265359; // double是Java中默认的浮点类型
        System.out.println("double类型值: " + doubleValue);
        
        // char类型: 16位Unicode字符
        char charValue = 'A'; // char类型使用单引号
        char charValue2 = '\u0041'; // 使用Unicode编码表示字符A
        System.out.println("char类型值1: " + charValue);
        System.out.println("char类型值2(Unicode): " + charValue2);
        
        // boolean类型: 只能是true或false
        boolean booleanValue = true;
        boolean booleanValue2 = false;
        System.out.println("boolean类型值1: " + booleanValue);
        System.out.println("boolean类型值2: " + booleanValue2);
        
        // 各类型的最大值和最小值
        System.out.println("\n各类型的取值范围:");
        System.out.println("byte取值范围: " + Byte.MIN_VALUE + " 到 " + Byte.MAX_VALUE);
        System.out.println("short取值范围: " + Short.MIN_VALUE + " 到 " + Short.MAX_VALUE);
        System.out.println("int取值范围: " + Integer.MIN_VALUE + " 到 " + Integer.MAX_VALUE);
        System.out.println("long取值范围: " + Long.MIN_VALUE + " 到 " + Long.MAX_VALUE);
        System.out.println("float取值范围: " + Float.MIN_VALUE + " 到 " + Float.MAX_VALUE);
        System.out.println("double取值范围: " + Double.MIN_VALUE + " 到 " + Double.MAX_VALUE);
    }
    
    // 引用数据类型的使用示例
    public static void testReferenceTypes() {
        System.out.println("\n=== 引用数据类型使用示例 ===");
        
        // String类型 - 字符串引用类型
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = str1 + " " + str2; // 字符串连接
        System.out.println("String类型示例: " + str3);
        
        // String常用方法
        System.out.println("str1的长度: " + str1.length());
        System.out.println("str1转为大写: " + str1.toUpperCase());
        System.out.println("str2转为小写: " + str2.toLowerCase());
        System.out.println("str1中是否包含el: " + str1.contains("el"));
        
        // Array类型 - 数组引用类型
        // 一维数组声明和初始化
        int[] intArray1 = new int[5]; // 创建长度为5的整型数组，默认值为0
        int[] intArray2 = {1, 2, 3, 4, 5}; // 创建并初始化数组
        String[] strArray = new String[]{"apple", "banana", "orange"};
        
        // 访问和修改数组元素
        intArray1[0] = 10;
        intArray1[1] = 20;
        System.out.println("数组intArray1的第一个元素: " + intArray1[0]);
        System.out.println("数组intArray2的第三个元素: " + intArray2[2]);
        System.out.println("数组strArray的第二个元素: " + strArray[1]);
        
        // 获取数组长度
        System.out.println("intArray2的长度: " + intArray2.length);
        
        // Object类型 - 所有类的父类
        Object obj1 = "这是一个字符串对象";
        Object obj2 = 123;
        Object obj3 = new int[]{1, 2, 3};
        
        System.out.println("Object引用字符串: " + obj1);
        System.out.println("Object引用整数: " + obj2);
        System.out.println("Object引用数组: " + obj3);
        
        // Class类型 - 类的类型信息
        Class<String> stringClass = String.class;
        Class<Integer> integerClass = Integer.class;
        System.out.println("String类的类名: " + stringClass.getName());
        System.out.println("Integer类的简单类名: " + integerClass.getSimpleName());
        
        // 使用Class类型获取对象的类信息
        String exampleStr = "示例字符串";
        Class<?> exampleClass = exampleStr.getClass();
        System.out.println("exampleStr对象的类名: " + exampleClass.getName());
    }
    
    // 进制的认识和使用
    public static void testNumberSystems() {
        System.out.println("\n=== 进制的认识和使用 ===");
        
        // 十进制（Decimal）- 我们日常生活中最常用的进制
        int decimal = 123;
        System.out.println("十进制数: " + decimal);
        
        // 二进制（Binary）- 计算机内部使用的进制，以0b或0B开头
        int binary = 0b1111011; // 二进制的1111011等于十进制的123
        System.out.println("二进制数 0b1111011 对应的十进制: " + binary);
        
        // 八进制（Octal）- 以0开头的数字
        int octal = 0173; // 八进制的173等于十进制的123
        System.out.println("八进制数 0173 对应的十进制: " + octal);
        
        // 十六进制（Hexadecimal）- 以0x或0X开头，使用0-9和A-F表示
        int hexadecimal = 0x7B; // 十六进制的7B等于十进制的123
        System.out.println("十六进制数 0x7B 对应的十进制: " + hexadecimal);
        
        // 在Java中输出不同进制表示的数字
        System.out.println("\n数字123的不同进制表示:");
        System.out.println("十进制: " + 123);
        System.out.println("二进制: " + Integer.toBinaryString(123));
        System.out.println("八进制: " + Integer.toOctalString(123));
        System.out.println("十六进制: " + Integer.toHexString(123));
        
        // 进制之间的转换示例
        System.out.println("\n=== 进制转换示例 ===");
        String binaryStr = "1111011";
        String octalStr = "173";
        String hexStr = "7B";
        
        // 将其他进制的字符串转换为十进制
        int fromBinary = Integer.parseInt(binaryStr, 2);   // 二进制转十进制
        int fromOctal = Integer.parseInt(octalStr, 8);     // 八进制转十进制
        int fromHex = Integer.parseInt(hexStr, 16);        // 十六进制转十进制
        
        System.out.println("二进制 " + binaryStr + " 转十进制: " + fromBinary);
        System.out.println("八进制 " + octalStr + " 转十进制: " + fromOctal);
        System.out.println("十六进制 " + hexStr + " 转十进制: " + fromHex);
        
        // 负数的表示（补码形式）
        System.out.println("\n负数在不同进制下的表示:");
        int negative = -123;
        System.out.println("十进制负数: " + negative);
        System.out.println("二进制表示: " + Integer.toBinaryString(negative));
        System.out.println("八进制表示: " + Integer.toOctalString(negative));
        System.out.println("十六进制表示: " + Integer.toHexString(negative));
    }
    
    // 基本数据类型变量间的运行规则
    // 自动类型提升
    // byte < short < int < long < float < double
    public static void testAutoTypePromotion() {
        System.out.println("\n=== 自动类型提升示例 ===");
        byte a = 10;
        short b = a;      // byte -> short
        int c = b;        // short -> int
        long d = c;       // int -> long
        float e = d;      // long -> float
        double f = e;     // float -> double
        
        System.out.println("byte值: " + a);
        System.out.println("short值: " + b);
        System.out.println("int值: " + c);
        System.out.println("long值: " + d);
        System.out.println("float值: " + e);
        System.out.println("double值: " + f);
    }
    
    // 强制类型转换
    // 含义：将数据从高到低进行转换
    // 转换规则：高精度数据转换为低精度数据
    // double > long > float > int > short > byte
    public static void testForceTypeConversion() {
        System.out.println("\n=== 强制类型转换示例 ===");
        double d = 123.456;
        int i = (int) d;  // double -> int，小数部分被截断
        System.out.println("强制转换前的double值: " + d);
        System.out.println("强制转换后的int值: " + i);
        
        // 注意精度丢失风险
        long bigValue = 10000000000L;
        int smallValue = (int) bigValue;
        System.out.println("大数值转换前: " + bigValue);
        System.out.println("大数值转换后(可能发生溢出): " + smallValue);
    }
    
    // 算术运算符
    // + - * / %
    public static void testArithmeticOperators() {
        System.out.println("\n=== 算术运算符示例 ===");
        int a = 20, b = 10;
        System.out.println("加法: " + a + " + " + b + " = " + (a + b));
        System.out.println("减法: " + a + " - " + b + " = " + (a - b));
        System.out.println("乘法: " + a + " * " + b + " = " + (a * b));
        System.out.println("除法: " + a + " / " + b + " = " + (a / b));
        System.out.println("取余: " + a + " % " + b + " = " + (a % b));
    }
    
    // 关系运算符
    // > < >= <= == !=
    public static void testRelationalOperators() {
        System.out.println("\n=== 关系运算符示例 ===");
        int x = 5, y = 10;
        System.out.println("比较 " + x + " > " + y + ": " + (x > y));
        System.out.println("比较 " + x + " < " + y + ": " + (x < y));
        System.out.println("比较 " + x + " == " + y + ": " + (x == y));
        System.out.println("比较 " + x + " != " + y + ": " + (x != y));
        System.out.println("比较 " + x + " >= " + y + ": " + (x >= y));
        System.out.println("比较 " + x + " <= " + y + ": " + (x <= y));
    }
    
    // 逻辑运算符
    // && || !
    public static void testLogicalOperators() {
        System.out.println("\n=== 逻辑运算符示例 ===");
        boolean flag1 = true, flag2 = false;
        System.out.println("flag1 && flag2: " + (flag1 && flag2));
        System.out.println("flag1 || flag2: " + (flag1 || flag2));
        System.out.println("!flag1: " + (!flag1));
    }
    
    // 赋值运算符
    // = += -= *= /= %= &= |= ^= <<= >>= >>>=
    public static void testAssignmentOperators() {
        System.out.println("\n=== 赋值运算符示例 ===");
        int num = 10;
        System.out.println("初始值: " + num);
        
        num += 5;    // 相当于 num = num + 5
        System.out.println("num += 5 后的值: " + num);
        
        num -= 3;    // 相当于 num = num - 3
        System.out.println("num -= 3 后的值: " + num);
        
        num *= 2;    // 相当于 num = num * 2
        System.out.println("num *= 2 后的值: " + num);
    }
}