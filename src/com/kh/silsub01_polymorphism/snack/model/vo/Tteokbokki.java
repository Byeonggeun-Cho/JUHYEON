package com.kh.silsub01_polymorphism.snack.model.vo;

public class Tteokbokki extends Snack {
	
	
	public Tteokbokki(int bun, int exp, String kinds) {
		super(bun, exp, kinds);
				
	}
	
	@Override
	public void cook() {
		System.out.println("�����̸� ���ְ� �������Դϴ�~");
	}
	
	public void lack() {
		System.out.println("��ᰡ �����մϴ�.");
	}
	
	public void food() {
		System.out.println("�ϼ����� 3�� �����߽��ϴ�.");
		super.setBun(super.getBun()-3);
	
		if(super.getBun()<=0) {
			System.out.println("������ �ϼ��Ǿ����ϴ�. "
					+ "�丮 ����ġ�� "+super.getExp()+"��ŭ �����߽��ϴ�.");
		}
	}

	
	
}
