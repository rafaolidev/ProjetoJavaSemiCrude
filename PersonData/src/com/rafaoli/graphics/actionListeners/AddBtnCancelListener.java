package com.rafaoli.graphics.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddBtnCancelListener implements ActionListener{

	private JFrame frame;
	
	public AddBtnCancelListener( JFrame p_jframe ) {
		frame = p_jframe;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		int decision = JOptionPane.showConfirmDialog(frame, "Deseja cancelar a operação?","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		if( decision == JOptionPane.YES_OPTION ) {
			
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			
 		}
	}

}
