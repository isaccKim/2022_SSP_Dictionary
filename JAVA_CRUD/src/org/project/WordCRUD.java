package org.project;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
	ArrayList<Word> list;
	Scanner sc;
	
	WordCRUD(Scanner sc){
		list = new ArrayList<>();
		this.sc = sc;
	}
	@Override
	public Object add() {
		System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
	int level = sc.nextInt();
	String word = sc.nextLine();
	
	System.out.print("뜻 입력 : ");
	String meaning = sc.nextLine();
		
	return new Word(0, level, word, meaning);
	}
	
	public void addWord() {
		
		
	}

	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectOne(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public void listAll() {
		System.out.println("--------------------------------");
		for(int i=0; i<list.size(); i++) {
			System.out.print((i+1) + " ");
			System.out.println(list.get(i).toString());
		}
		System.out.println("--------------------------------");
	}

}
 