package com.kh.silsub01_polymorphism.snack.model.vo;

public class Fried extends Snack{
	
	public Fried(int bun, int exp, String kinds) {
		super(bun, exp, kinds);
	}

	@Override
	public void cook() {
		System.out.println("���Ƣ���� �븩�븩�ϰ� Ƣ������ �ֽ��ϴ�!");
	}
	
	public void fire() {
		System.out.println("�Ҽ��Ⱑ ���������ϴ�.");
	}
	
	public void timer() {
		System.out.println("Ÿ�̸� �ð��� 1�� �����߽��ϴ�.");
		super.setBun(super.getBun()-1);
	
		if(super.getBun() <=0) {
			System.out.println("Ÿ�̸Ӱ� �︮���ֽ��ϴ�~ �丮 ������ "+super.getExp()+" �����߽��ϴ�!");
		}
		
	
	
	}
	
	
	
}
