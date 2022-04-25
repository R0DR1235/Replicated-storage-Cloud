import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Client {
	private JFrame frame;

	public Client() {
		frame = new JFrame("Client");
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		addFrameContent();
		
		frame.pack();
	}

	public void open(int a,int b) {
		frame.setSize(a,b);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void addFrameContent() {
		
		
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		frame.add(panel,BorderLayout.NORTH);
		
		JLabel posicao = new JLabel();
		posicao.setText("Posição a consultar:");
		JLabel comprimento = new JLabel();
		comprimento.setText("Comprimento:");
		
		JTextField posicaoText = new JTextField();
		posicaoText.setText("                       ");
		JTextField comprimentoText = new JTextField();
		comprimentoText.setText("                       ");
		
		panel.add(posicao);panel.add(posicaoText);panel.add(comprimento);panel.add(comprimentoText);
		
		
		JButton consultar = new JButton("consultar");
		consultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});	
		panel.add(consultar);
		
		JTextArea resposta = new JTextArea();
		resposta.setText("As respostas aparecerão aqui...");
		frame.add(resposta,BorderLayout.CENTER);
		
		
		
	}

	public static void main(String[] args) {
		Client window = new Client();
		window.open(800,170);
	}
}


