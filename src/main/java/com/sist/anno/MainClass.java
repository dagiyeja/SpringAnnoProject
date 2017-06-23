package com.sist.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.Board;
/*
 * 	@AutoWired
 * 							annotation�� ã�� ��ġ (*:�ö� �� �ִ� ��)
 * 		ElementType.TYPE (*)
 * 		ElementType.METHOD(*)
 * 		ElementType.PARAMETER
 * 		ElementType.FIELD(*)
 * 		ElementType.CONSTRUCTOR(*)
 * 
 * 		public class A
 * 		{
 * 			private B b;
 * 			public A(B b)
 * 			{
 * 			}
 * 			public void setA(B b)
 * 			{
 * 			}
 * 		}
 * */

public class MainClass {
	//@Autowired
	//@Qualifier("fb") // ��ü Ÿ���� Board �������̽��� ������->������ �� �ϳ��� ����. AutoWired�� ��ü���� ������ �� ���� ������
	@Resource(name="rb") //AutoWired �� Qualifier�� ��ģ ��
	private Board board; //autowired�� setter ��� �� ���� �� �ִ�
	
	
	/*@Autowired  ->set �޼��忡�� ���԰���
	@Qualifier("rb")
	public void setBoard(Board board) {
		this.board = board;
	}*/
	
	/*@Autowired  
	 * public void setBoard(@Qualifier("rb") Board board, int a) {
		this.board = board;
	}*/
	
	/*@Autowired  
	 * public void setBoard(@Qualifier("rb") Board board1,@Qualifier("fb") Board board2) {
			this.board 1= board1;
			this.board 2= board2;
	}*/

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		MainClass mc=(MainClass)app.getBean("mc"); //������ ��ü�� ����´�
		mc.board.select();
		mc.board.insert();
		mc.board.update();
		mc.board.delete();
	}

}
