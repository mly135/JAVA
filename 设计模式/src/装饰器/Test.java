package 装饰器;


public class Test {
	public static void main(String[] args) {
		concreteComponent con = new concreteComponent();
		DecoatorA a = new DecoatorA();
		DecoatorB b = new DecoatorB();
		DecoatorC c = new DecoatorC();
		
		a.setComponent(con);
		
		a.getA();
		
	}

}

//抽象组件角色
abstract class Component{
	public abstract void Operation();
}

//被装饰者
class concreteComponent extends Component{

	@Override
	public void Operation() {
		System.out.println("被装饰类");
	}
	
	public void getConcrete(){
		
	}
	
}

//装饰器
abstract class Decoator extends Component{
	
	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void Operation() {
		component.Operation();
	}
}
	
//具体装饰类
class DecoatorA extends Decoator{

		@Override
		public void Operation() {
			super.Operation();
			System.out.println("装饰了A");
		}
		public void getA(){
			System.out.println("aaa");
		} 
		}


class DecoatorB extends Decoator{

	@Override
	public void Operation() {
		super.Operation();
		System.out.println("装饰了B");
	}
	public void getB(){
		
	} 
	}

class DecoatorC extends Decoator{

	@Override
	public void Operation() {
		super.Operation();
		System.out.println("装饰了C");
	}
	public void getC(){
		
	} 
	}

