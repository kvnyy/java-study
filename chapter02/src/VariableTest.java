/*
���Ա����Ļ���ʹ��
1. ��������⣺�����Ǵ洢���ݵģ������Ǵ���ڼ�����ڴ��еġ�
2. �������������������� ������ = ֵ;
3. java�б������������ͣ�
    �����������ͣ�
        byte  8λ
        short 16λ
        int   32λ
        long  64λ
        float 32λ
        double 64λ
        char  16λ
        boolean 1λ
     �����������ͣ�
        String �����������ͣ�String��java���ַ�������
        Class  �����������ͣ�Class��java��������
        Object  �����������ͣ�Object��java��Object����
        Array  �����������ͣ�Array��java����������
        Interface  �����������ͣ�Interface��java�нӿ�����
        Enum  �����������ͣ�Enum��java��ö������
        Annotation  �����������ͣ�Annotation��java��ע������
        ��

 */

public class VariableTest {
    public static void main(String[] args) {
        // ��������ķ�ʽ
        // 1. �������� + ��ֵ
        int a;
        a = 10;
        System.out.println("����a��ֵ: " + a);

        // 2. �������� + ��ֵ�ϲ�
        int b = 20;
        System.out.println("����b��ֵ: " + b);
        
        // 3. �����������
        int c, d;
        c = 30;
        d = 40;
        System.out.println("����c��ֵ: " + c + ", ����d��ֵ: " + d);
        
        // 4. ����������� + ��ֵ�ϲ�
        int e = 50, f = 60;
        System.out.println("����e��ֵ: " + e + ", ����f��ֵ: " + f);
        
        // �����������͵�ʹ��ʾ��
        testPrimitiveTypes();
        
        // �����������͵�ʹ��ʾ��
        testReferenceTypes();
        
        // ���Ƶ���ʶ��ʹ��
        testNumberSystems();
        
        // �����������Է���
        testAutoTypePromotion();
        testForceTypeConversion();
        testArithmeticOperators();
        testRelationalOperators();
        testLogicalOperators();
        testAssignmentOperators();
    }
    
    // �����������͵�ʹ��ʾ��
    public static void testPrimitiveTypes() {
        System.out.println("\n=== ������������ʹ��ʾ�� ===");
        
        // byte����: 8λ�з�����������Χ-128��127
        byte byteValue = 100;
        System.out.println("byte����ֵ: " + byteValue);
        
        // short����: 16λ�з�����������Χ-32,768��32,767
        short shortValue = 10000;
        System.out.println("short����ֵ: " + shortValue);
        
        // int����: 32λ�з�����������ΧԼ-21�ڵ�21��
        int intValue = 1000000;
        System.out.println("int����ֵ: " + intValue);
        
        // long����: 64λ�з�������
        long longValue = 10000000000L; // ע��long������������Ҫ��L��׺
        System.out.println("long����ֵ: " + longValue);
        
        // float����: 32λ�����ȸ�����
        float floatValue = 3.14159f; // ע��float������������Ҫ��f��׺
        System.out.println("float����ֵ: " + floatValue);
        
        // double����: 64λ˫���ȸ�����
        double doubleValue = 3.14159265359; // double��Java��Ĭ�ϵĸ�������
        System.out.println("double����ֵ: " + doubleValue);
        
        // char����: 16λUnicode�ַ�
        char charValue = 'A'; // char����ʹ�õ�����
        char charValue2 = '\u0041'; // ʹ��Unicode�����ʾ�ַ�A
        System.out.println("char����ֵ1: " + charValue);
        System.out.println("char����ֵ2(Unicode): " + charValue2);
        
        // boolean����: ֻ����true��false
        boolean booleanValue = true;
        boolean booleanValue2 = false;
        System.out.println("boolean����ֵ1: " + booleanValue);
        System.out.println("boolean����ֵ2: " + booleanValue2);
        
        // �����͵����ֵ����Сֵ
        System.out.println("\n�����͵�ȡֵ��Χ:");
        System.out.println("byteȡֵ��Χ: " + Byte.MIN_VALUE + " �� " + Byte.MAX_VALUE);
        System.out.println("shortȡֵ��Χ: " + Short.MIN_VALUE + " �� " + Short.MAX_VALUE);
        System.out.println("intȡֵ��Χ: " + Integer.MIN_VALUE + " �� " + Integer.MAX_VALUE);
        System.out.println("longȡֵ��Χ: " + Long.MIN_VALUE + " �� " + Long.MAX_VALUE);
        System.out.println("floatȡֵ��Χ: " + Float.MIN_VALUE + " �� " + Float.MAX_VALUE);
        System.out.println("doubleȡֵ��Χ: " + Double.MIN_VALUE + " �� " + Double.MAX_VALUE);
    }
    
    // �����������͵�ʹ��ʾ��
    public static void testReferenceTypes() {
        System.out.println("\n=== ������������ʹ��ʾ�� ===");
        
        // String���� - �ַ�����������
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = str1 + " " + str2; // �ַ�������
        System.out.println("String����ʾ��: " + str3);
        
        // String���÷���
        System.out.println("str1�ĳ���: " + str1.length());
        System.out.println("str1תΪ��д: " + str1.toUpperCase());
        System.out.println("str2תΪСд: " + str2.toLowerCase());
        System.out.println("str1���Ƿ����el: " + str1.contains("el"));
        
        // Array���� - ������������
        // һά���������ͳ�ʼ��
        int[] intArray1 = new int[5]; // ��������Ϊ5���������飬Ĭ��ֵΪ0
        int[] intArray2 = {1, 2, 3, 4, 5}; // ��������ʼ������
        String[] strArray = new String[]{"apple", "banana", "orange"};
        
        // ���ʺ��޸�����Ԫ��
        intArray1[0] = 10;
        intArray1[1] = 20;
        System.out.println("����intArray1�ĵ�һ��Ԫ��: " + intArray1[0]);
        System.out.println("����intArray2�ĵ�����Ԫ��: " + intArray2[2]);
        System.out.println("����strArray�ĵڶ���Ԫ��: " + strArray[1]);
        
        // ��ȡ���鳤��
        System.out.println("intArray2�ĳ���: " + intArray2.length);
        
        // Object���� - ������ĸ���
        Object obj1 = "����һ���ַ�������";
        Object obj2 = 123;
        Object obj3 = new int[]{1, 2, 3};
        
        System.out.println("Object�����ַ���: " + obj1);
        System.out.println("Object��������: " + obj2);
        System.out.println("Object��������: " + obj3);
        
        // Class���� - ���������Ϣ
        Class<String> stringClass = String.class;
        Class<Integer> integerClass = Integer.class;
        System.out.println("String�������: " + stringClass.getName());
        System.out.println("Integer��ļ�����: " + integerClass.getSimpleName());
        
        // ʹ��Class���ͻ�ȡ���������Ϣ
        String exampleStr = "ʾ���ַ���";
        Class<?> exampleClass = exampleStr.getClass();
        System.out.println("exampleStr���������: " + exampleClass.getName());
    }
    
    // ���Ƶ���ʶ��ʹ��
    public static void testNumberSystems() {
        System.out.println("\n=== ���Ƶ���ʶ��ʹ�� ===");
        
        // ʮ���ƣ�Decimal��- �����ճ���������õĽ���
        int decimal = 123;
        System.out.println("ʮ������: " + decimal);
        
        // �����ƣ�Binary��- ������ڲ�ʹ�õĽ��ƣ���0b��0B��ͷ
        int binary = 0b1111011; // �����Ƶ�1111011����ʮ���Ƶ�123
        System.out.println("�������� 0b1111011 ��Ӧ��ʮ����: " + binary);
        
        // �˽��ƣ�Octal��- ��0��ͷ������
        int octal = 0173; // �˽��Ƶ�173����ʮ���Ƶ�123
        System.out.println("�˽����� 0173 ��Ӧ��ʮ����: " + octal);
        
        // ʮ�����ƣ�Hexadecimal��- ��0x��0X��ͷ��ʹ��0-9��A-F��ʾ
        int hexadecimal = 0x7B; // ʮ�����Ƶ�7B����ʮ���Ƶ�123
        System.out.println("ʮ�������� 0x7B ��Ӧ��ʮ����: " + hexadecimal);
        
        // ��Java�������ͬ���Ʊ�ʾ������
        System.out.println("\n����123�Ĳ�ͬ���Ʊ�ʾ:");
        System.out.println("ʮ����: " + 123);
        System.out.println("������: " + Integer.toBinaryString(123));
        System.out.println("�˽���: " + Integer.toOctalString(123));
        System.out.println("ʮ������: " + Integer.toHexString(123));
        
        // ����֮���ת��ʾ��
        System.out.println("\n=== ����ת��ʾ�� ===");
        String binaryStr = "1111011";
        String octalStr = "173";
        String hexStr = "7B";
        
        // ���������Ƶ��ַ���ת��Ϊʮ����
        int fromBinary = Integer.parseInt(binaryStr, 2);   // ������תʮ����
        int fromOctal = Integer.parseInt(octalStr, 8);     // �˽���תʮ����
        int fromHex = Integer.parseInt(hexStr, 16);        // ʮ������תʮ����
        
        System.out.println("������ " + binaryStr + " תʮ����: " + fromBinary);
        System.out.println("�˽��� " + octalStr + " תʮ����: " + fromOctal);
        System.out.println("ʮ������ " + hexStr + " תʮ����: " + fromHex);
        
        // �����ı�ʾ��������ʽ��
        System.out.println("\n�����ڲ�ͬ�����µı�ʾ:");
        int negative = -123;
        System.out.println("ʮ���Ƹ���: " + negative);
        System.out.println("�����Ʊ�ʾ: " + Integer.toBinaryString(negative));
        System.out.println("�˽��Ʊ�ʾ: " + Integer.toOctalString(negative));
        System.out.println("ʮ�����Ʊ�ʾ: " + Integer.toHexString(negative));
    }
    
    // �����������ͱ���������й���
    // �Զ���������
    // byte < short < int < long < float < double
    public static void testAutoTypePromotion() {
        System.out.println("\n=== �Զ���������ʾ�� ===");
        byte a = 10;
        short b = a;      // byte -> short
        int c = b;        // short -> int
        long d = c;       // int -> long
        float e = d;      // long -> float
        double f = e;     // float -> double
        
        System.out.println("byteֵ: " + a);
        System.out.println("shortֵ: " + b);
        System.out.println("intֵ: " + c);
        System.out.println("longֵ: " + d);
        System.out.println("floatֵ: " + e);
        System.out.println("doubleֵ: " + f);
    }
    
    // ǿ������ת��
    // ���壺�����ݴӸߵ��ͽ���ת��
    // ת�����򣺸߾�������ת��Ϊ�;�������
    // double > long > float > int > short > byte
    public static void testForceTypeConversion() {
        System.out.println("\n=== ǿ������ת��ʾ�� ===");
        double d = 123.456;
        int i = (int) d;  // double -> int��С�����ֱ��ض�
        System.out.println("ǿ��ת��ǰ��doubleֵ: " + d);
        System.out.println("ǿ��ת�����intֵ: " + i);
        
        // ע�⾫�ȶ�ʧ����
        long bigValue = 10000000000L;
        int smallValue = (int) bigValue;
        System.out.println("����ֵת��ǰ: " + bigValue);
        System.out.println("����ֵת����(���ܷ������): " + smallValue);
    }
    
    // ���������
    // + - * / %
    public static void testArithmeticOperators() {
        System.out.println("\n=== ���������ʾ�� ===");
        int a = 20, b = 10;
        System.out.println("�ӷ�: " + a + " + " + b + " = " + (a + b));
        System.out.println("����: " + a + " - " + b + " = " + (a - b));
        System.out.println("�˷�: " + a + " * " + b + " = " + (a * b));
        System.out.println("����: " + a + " / " + b + " = " + (a / b));
        System.out.println("ȡ��: " + a + " % " + b + " = " + (a % b));
    }
    
    // ��ϵ�����
    // > < >= <= == !=
    public static void testRelationalOperators() {
        System.out.println("\n=== ��ϵ�����ʾ�� ===");
        int x = 5, y = 10;
        System.out.println("�Ƚ� " + x + " > " + y + ": " + (x > y));
        System.out.println("�Ƚ� " + x + " < " + y + ": " + (x < y));
        System.out.println("�Ƚ� " + x + " == " + y + ": " + (x == y));
        System.out.println("�Ƚ� " + x + " != " + y + ": " + (x != y));
        System.out.println("�Ƚ� " + x + " >= " + y + ": " + (x >= y));
        System.out.println("�Ƚ� " + x + " <= " + y + ": " + (x <= y));
    }
    
    // �߼������
    // && || !
    public static void testLogicalOperators() {
        System.out.println("\n=== �߼������ʾ�� ===");
        boolean flag1 = true, flag2 = false;
        System.out.println("flag1 && flag2: " + (flag1 && flag2));
        System.out.println("flag1 || flag2: " + (flag1 || flag2));
        System.out.println("!flag1: " + (!flag1));
    }
    
    // ��ֵ�����
    // = += -= *= /= %= &= |= ^= <<= >>= >>>=
    public static void testAssignmentOperators() {
        System.out.println("\n=== ��ֵ�����ʾ�� ===");
        int num = 10;
        System.out.println("��ʼֵ: " + num);
        
        num += 5;    // �൱�� num = num + 5
        System.out.println("num += 5 ���ֵ: " + num);
        
        num -= 3;    // �൱�� num = num - 3
        System.out.println("num -= 3 ���ֵ: " + num);
        
        num *= 2;    // �൱�� num = num * 2
        System.out.println("num *= 2 ���ֵ: " + num);
    }
}