package com.sist.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.Board;
/*
 * 	@AutoWired
 * 							annotation을 찾는 위치 (*:올라갈 수 있는 곳)
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
	//@Qualifier("fb") // 객체 타입이 Board 인터페이스로 동일함->여러개 중 하나를 지정. AutoWired는 객체명을 지정할 수 없기 때문에
	@Resource(name="rb") //AutoWired 와 Qualifier를 합친 것
	private Board board; //autowired는 setter 없어도 값 받을 수 있다
	
	
	/*@Autowired  ->set 메서드에도 대입가능
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
		MainClass mc=(MainClass)app.getBean("mc"); //생성된 객체를 갖고온다
		mc.board.select();
		mc.board.insert();
		mc.board.update();
		mc.board.delete();
	}

}
