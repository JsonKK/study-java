public class arguments{
	public static void main(String[] args){
		if(args.length>0){
			int i = 0;
			while(i<args.length){
				System.out.println("第"+i+"参数,是："+args[i]);
				i++;
			}
		}
		else{
			System.out.println("还没有传参，传个试试");
		}
	}
}