package Generic;

public class Foo<T> {//定義一泛型
	private T foo;//產生物件是需要傳入參數,傳入甚麼型別以下就用這個型別實作

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
}
