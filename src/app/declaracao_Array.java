package app;

import java.util.Arrays;

public class declaracao_Array {
	
	public static void main(String[] args) {
		Valores v = new Valores();
		v.ins(1);
		v.ins(3);
		v.ins(4);
		v.ins(12);
		v.ins(321);
		v.ins(1);
		v.ins(1);
		v.ins(1);
		v.ins(312);
		v.ins(23);
		v.ins(23000);
		int i = v.size();
		System.out.println(i);
		System.out.println(Arrays.toString(v.val));
	}
}
