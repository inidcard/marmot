package com.st.myenumb;

import java.util.Iterator;
import java.util.Set ;
import java.util.TreeSet ;
enum Color1{
	RED,GREEN,BLUE ;
}
public class ComparableEnum{
	public static void main(String args[]){
		Set<Color1> t = new TreeSet<Color1>() ;	// ��������
		t.add(Color1.GREEN) ;	// ������ɫ
		t.add(Color1.RED) ;		// �����ɫ
		t.add(Color1.BLUE) ;		// ������ɫ
		Iterator<Color1> iter = t.iterator() ;
		while(iter.hasNext()){
			System.out.print(iter.next() + "��") ;
		}
	}
};