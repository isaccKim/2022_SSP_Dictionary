package org.project;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.run(args);
	}
	
	public void run(String[] args) {
		new WordManager().start();
	}
	

}
