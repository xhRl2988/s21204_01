package s21204_java90;

public class S21204_wrapper_01 {
	public static void main(String[] args) {
		// 기본박싱
		System.out.println("--기본박싱 및 언박싱------");
		Integer is1= new Integer(127);
		Integer is2= new Integer("127");
		//언박싱
		int si1=is1.intValue();
		int si2=is2.intValue();
		
		System.out.println("기본박싱is1:"+is2+"언박싱si2:"+si2);
		System.out.println("기본박싱is2:"+is2+"언박싱si2:"+si2);
	
		System.out.println("기박is1:"+System.identityHashCode(is1)+"언박:"+System.identityHashCode(si1));
		System.out.println("기박is2:"+System.identityHashCode(is2)+"언박:"+System.identityHashCode(si2));
		//자동 박싱 및 언박싱
		System.out.println("--자동박싱 및 언박싱-----");
		Integer ia1 = 127; //자동 박싱
		Integer ia2 = 127; //자동 박싱
		int ai1 = ia1; //자동 언박싱
		int ai2 = ia2; //자동 언박싱
		System.out.println("자동박싱ia1:"+ia1+"자동언박싱a1:"+ai1);
		System.out.println("자동박싱ia2:"+ia2+"자동언박싱a2:"+ai2);
		
		System.out.println("자박ia1:"+ System.identityHashCode(ia1)+"언:"+System.identityHashCode(ia2));
		System.out.println("자박ia2:"+ System.identityHashCode(ai2)+"언:"+System.identityHashCode(ai2));
	}
	
}
