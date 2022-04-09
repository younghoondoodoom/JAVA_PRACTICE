package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매를 합니다.");
	}

	@Override
	public void buy() {
		System.out.println("구입을 합니다.");
	}

	@Override
	public void order() {
		Buy.super.order();
	}

}
