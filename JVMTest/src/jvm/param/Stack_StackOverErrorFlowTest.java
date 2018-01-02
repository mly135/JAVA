package jvm.param;


/**
 * 栈内存设置
 * -XX:PermSize=1M -XX:MaxPermSize=1M
 * <p>Title: Stack_StackOverErrorFlowTest</p>
 * <p>Description: </p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2017-12-7 上午10:46:38
 */
public class Stack_StackOverErrorFlowTest {
	private int stackLength = 1;
	
	public void addLength(){
		setStackLength(getStackLength() + 1);
		addLength();
	}
	
	public int getStackLength() {
		return stackLength;
	}


	public void setStackLength(int stackLength) {
		this.stackLength = stackLength;
	}
	
	public static void main(String[] args) {
		Stack_StackOverErrorFlowTest Soe = new Stack_StackOverErrorFlowTest();
		Soe.addLength();
	}

}
