package com.kh.silsub01_polymorphism.snack.model.vo;

public class Sundae extends Snack {
	
	public Sundae(int bun, int exp, String kinds) {
		super(bun, exp, kinds);
	}
	
	@Override
	public void cook() {
		System.out.println("���븦 �������Դϴ�~~");
	}
	
	public void reheat() {
		System.out.println("�����ð� 2�� ���ҵǾ����ϴ�.");
		super.setBun(super.getBun()-2);
		
		if(super.getBun() <=0) {
			System.out.println("���밡 �ϼ��Ǿ����ϴ�. ���������� "+super.getExp()+"��ŭ �����Ǿ����ϴ�.");
		}
		
	}
	

}
