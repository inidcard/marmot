package com.st.myenuma;

interface Color1{
	public static final int RED = 1 ;	// �����ɫ
	public static final int GREEN = 2 ;	// ������ɫ
	public static final int BLUE = 3 ;	// ������ɫ
}
public class ColorDemo02{
	public static void main(String args[]){
		System.out.println(Color1.RED + Color1.GREEN) ;	// ��ɫ���
	}
};