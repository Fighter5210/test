import com.Function;
import com.FunctionService;

public class Test {
	static char i;
	public static int addAge(int personNum, int age) {
		if (personNum == 8) {
			return age;
		}
		personNum++;
		age = age + 2;
		return addAge(personNum, age);
	}

	public static void main(String[] args) {
		String b = "";
		System.out.println("哈希值："+b.hashCode());
		//System.out.println(addAge(1, 10));
//		Function fu =new FunctionService().getFunctionPort();
//		String str=fu.transWords("Let's Get Heck Out Of Here!");
//
//		System.out.println(str);

	//	System.out.println("i " + i);
		int i=0,j=0;
		do {
			try {
				//正常的流程
				if(j==0) {
					i = i / 0;
				}
				System.out.println("正常执行");
				break;
			} catch (Exception e) {
				//异常的流程
				System.out.println("抛出异常");
				j++;
				continue;
			}
		}while (true) ;
	}



}
