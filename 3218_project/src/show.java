import java.awt.Dimension;
import java.awt.Panel;
import java.util.*;
import javax.swing.JFrame;

public class show extends JFrame {
	Panel panel;
	
	public show() {
		super("������ȣ");
		
		setPreferredSize(new Dimension(1000, 800));
		setLocation(400,80);
		
		//X��ư ������ �� �������� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args)
	{
		
	}

}
