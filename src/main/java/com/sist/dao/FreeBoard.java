package com.sist.dao;

public class FreeBoard implements Board{

	@Override
	public void select() {
		System.out.println("FreeBoard:select() call...");
	}

	@Override
	public void insert() {
		System.out.println("FreeBoard:insert() call...");
	}

	@Override
	public void update() {
		System.out.println("FreeBoard:update() call...");
	}

	@Override
	public void delete() {
		System.out.println("FreeBoard:delete() call...");
	}

}
