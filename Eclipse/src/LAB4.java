import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JTextField;
import javax.swing.JButton;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;


public class LAB4 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LAB4 window = new LAB4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LAB4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnReadJsonFile = new JButton("Read JSON File");
		btnReadJsonFile.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				JSONObject jobjFile = null;
				try
				{
					jobjFile = new JSONObject(new JSONTokener(new FileReader("E:/Window Document/github/Java-Practice/Eclipse/src/dataJSON.json")));
				} 
				catch (FileNotFoundException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JSONException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try 
				{
					
					String strVar1=jobjFile.getString("sayHello");
					textField.setText(strVar1);
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnReadJsonFile.setBounds(277, 68, 122, 23);
		frame.getContentPane().add(btnReadJsonFile);
		JLabel lblNewLabel = new JLabel("JSON file:");
		lblNewLabel.setBounds(38, 67, 60, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblStudName = new JLabel("Stud.Name:");
		lblStudName.setBounds(38, 136, 74, 25);
		frame.getContentPane().add(lblStudName);
		
		JLabel lblStudage = new JLabel("Stud.Age:");
		lblStudage.setBounds(38, 181, 60, 25);
		frame.getContentPane().add(lblStudage);
		
		JLabel lblStud = new JLabel("Stud.Program:");
		lblStud.setBounds(38, 230, 89, 25);
		frame.getContentPane().add(lblStud);
	
		textField = new JTextField();
		textField.setBounds(137, 69, 130, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 138, 130, 20);
		
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 183, 130, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 232, 130, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(137, 100, 130, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		}}

