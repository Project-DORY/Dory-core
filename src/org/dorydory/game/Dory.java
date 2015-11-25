package org.dorydory.game;

import java.util.ArrayList;

import org.dorydory.model.Unit;
import org.dorydory.view.IView;
import org.dorydory.view.TextView;

public class Dory {
	private Npc helper = new Npc();
	helper.setName(wendy);
	
	public static void main(String[] args) {
		IView view;
		view = new TextView();
		
		System.out.println("Welcome to  the DORY Game!");
		System.out.println("DORY 게임에 오신것을 환영합니다! 저는 여러분의 도우미 ");
		System.out.format("%s", helper.name());
	}

}