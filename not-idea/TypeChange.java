public class TypeChange{
	public static void main(String[] args){
		char a = 123;
		int b = a;
		System.out.println("char����a"+(a-0));
		System.out.println("char��Ϊint b="+b);
		//short������16λ��������
		//��ʾ�ķ�Χ��-32768~32767
		short c = -32768;
		int cc = c;
		System.out.println("������c"+c);
		System.out.println("ת����Ķ�����cc"+cc);
		float ccf = c;
		System.out.println("����ʧ��ת������"+ccf);
		//����֧�ִ�floatתΪint , ���Ȼ��ж�ʧ
		//int n = 5.6f;
		//������ת��Ϊ������
		float f = 100000000000000L;
		System.out.println("f="+f);
		//�о��ȶ�ʧ�ĸ�����
		float ff = 1234567896789L;
		System.out.println("ff="+ff);
	}
}