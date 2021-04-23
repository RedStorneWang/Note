package Interface1;

public class InterfaceStandard {
	public static void main(String[] args) {
		Computer c=new Computer();
		c.go(new Print());
		c.go(new Flash());
	}
}

interface USB{
	public void work();
}

class Print implements USB{
	public void work() {
		System.out.println("打印机连接电脑中工作……");
	}
}

class Flash implements USB{
	public void work() {
		System.out.println("U盘连接电脑工作……");
	}
}

class Computer{
	public void go(USB usb) {
		usb.work();
	}
}