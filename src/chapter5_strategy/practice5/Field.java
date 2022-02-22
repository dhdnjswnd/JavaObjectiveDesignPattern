package chapter5_strategy.practice5;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Field extends JPanel implements Runnable {
	private JLabel lbl;
	private String[] walkingImage = { "walk1.gif", "walk2.gif" };

	public Field() {
		setLayout(new BorderLayout());
		lbl = new JLabel();
		lbl.setIcon(new ImageIcon("./src/walk1.gif"));
		add(lbl, BorderLayout.CENTER);
	}

	@Override
	public void run() {
		while (true) {
			String[] path = walkingImage;
			for (int i = 0; i < path.length; i++) {
				lbl.setIcon(new ImageIcon("./src/" + path[i]));
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
