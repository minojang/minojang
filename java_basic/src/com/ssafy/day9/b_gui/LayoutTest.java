package com.ssafy.day9.b_gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel lNum1, lNum2, lCorrectCnt, lWrongCnt;	//화면 표시용 라벨들
    private JTextField tfAns;	// 텍스트 입력 필드
    private int answer;

    public static void main(String[] args) {
        LayoutTest lt = new LayoutTest();
        //lt.setVisible(true);
        lt.launchUi();
    }

    private void launchUi() {
        this.add(new JLabel("구구단을 외자!"), BorderLayout.NORTH);

        makeResultPanel();
        makeProblemPanel();
        // Frame 기본 설정
        this.setTitle("layout test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private void makeProblem() {
        Random rand = new Random();
        int num1 = rand.nextInt(9) + 1;
        int num2 = rand.nextInt(9) + 1;
        this.answer = num1 * num2;
        lNum1.setText(num1 + "");
        lNum2.setText(num2 + "");
        tfAns.setText("");
    }

    private void makeResultPanel() {
        // TODO: 결과를 보여줄 panel을 구성하시오.
    	JPanel panel = new JPanel();
    	panel.add(new JLabel("정답 개수 : "));
    	panel.add(lCorrectCnt = new JLabel("0"));
    	panel.add(new JLabel("오답 개수 : "));
    	panel.add(lWrongCnt = new JLabel("0"));
    	this.add(panel, BorderLayout.SOUTH);
    	// END
    }

    private void makeProblemPanel() {
        // TODO: 문제를 출제할 패널을 구성하시오.
    	JPanel panel = new JPanel();
    	lNum1 = new JLabel();	//숫자 1
    	panel.add(lNum1);
    	panel.add(new JLabel("*"));	//곱셈 기호
    	lNum2 = new JLabel();
    	panel.add(lNum2);	// 숫자 2
    	panel.add(new JLabel("="));	// 등호
    	tfAns = new JTextField(10);	// 10 : 너비
    	panel.add(tfAns);
    	
    	tfAns.addKeyListener(new KeyAdapter() {
    		@Override
    		public void keyReleased(KeyEvent e) {
    			System.out.println("키보드 눌렀다가 뗌");
    			if (e.getKeyCode() == 10) {
    				// 입력값 얻어오기
    				int val = Integer.parseInt(tfAns.getText());
    				if (answer == val) {
    					lCorrectCnt.setText(Integer.parseInt(lCorrectCnt.getText()) + 1 + ""); 
    				} else {
    					lWrongCnt.setText(Integer.parseInt(lWrongCnt.getText()) + 1 + ""); 
    				}
    			}
    		}
		});
    	makeProblem();
    	this.add(panel, BorderLayout.CENTER);
    	//this.add(panel, "Center");
        // END
    }

}
