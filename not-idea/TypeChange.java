public class TypeChange{
	public static void main(String[] args){
		char a = 123;
		int b = a;
		System.out.println("char类型a"+(a-0));
		System.out.println("char变为int b="+b);
		//short类型是16位二进制数
		//表示的范围是-32768~32767
		short c = -32768;
		int cc = c;
		System.out.println("短整型c"+c);
		System.out.println("转换后的短整型cc"+cc);
		float ccf = c;
		System.out.println("有损失的转浮点型"+ccf);
		//报错不支持从float转为int , 精度会有丢失
		//int n = 5.6f;
		//长整型转换为浮点型
		float f = 100000000000000L;
		System.out.println("f="+f);
		//有精度丢失的浮点型
		float ff = 1234567896789L;
		System.out.println("ff="+ff);
	}
}