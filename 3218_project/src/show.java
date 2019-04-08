import java.awt.Dimension;
import java.awt.Panel;
import java.util.*;
import javax.swing.JFrame;

public class show extends JFrame {
	Panel panel;
	
	public show() {
		super("정보보호");
		
		setPreferredSize(new Dimension(1000, 800));
		setLocation(400,80);
		
		//X버튼 눌렀을 때 닫히도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args)
	{
		
	}

}
