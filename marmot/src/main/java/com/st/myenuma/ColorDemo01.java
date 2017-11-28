package com.st.myenuma;

class Color2 {
	public static final Color2 RED = new Color2("��ɫ") ;	// �����һ������
	public static final Color2 GREEN = new Color2("��ɫ") ;	// �����һ������
	public static final Color2 BLUE = new Color2("��ɫ") ;	// �����һ������
	private String name ;
	private Color2(String name){
		this.name = name ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public static Color2 getInstance(int i){
		switch(i){
			case 1:{
				return RED ;
			}
			case 2:{
				return GREEN ;
			}
			case 3:{
				return BLUE ;
			}default:{
				return null ;
			}
		}

	}
}

public class ColorDemo01{
	public static void main(String args[]){
		Color2 c1 = Color2.RED ;	// ȡ�ú�ɫ
		System.out.println(c1.getName()) ;	// �������
		Color2 c2 = Color2.getInstance(3) ;	// ���ݱ��ȡ������
		System.out.println(c2.getName()) ;
	}
}