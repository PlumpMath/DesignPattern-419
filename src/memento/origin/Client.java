package memento.origin;

public class Client {
	
	public static void main(String[] args)
	{
		Originator originator = new Originator("on");
		originator.show();
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento()); //管理者存储发起者的备份数据  
		
		originator.setState("off");  //改变发起者状态
		originator.show();
		
		originator.setMemento(caretaker.getMemento());  //恢复原始状态  
		originator.show();
		
	}
}
