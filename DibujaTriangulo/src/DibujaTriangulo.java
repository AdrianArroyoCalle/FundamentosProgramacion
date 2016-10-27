import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

import java.util.Scanner;

class Triangulo extends JComponent {
	int h, r, gr, b;

	public Triangulo(int n) {
		h = n;

	}

	public void color(int a, int d, int c) {
		r = a;
		gr = d;
		b = c;
	}

	public void paint(Graphics g) {
		g.setColor(new Color(r, gr, b));
		/* Triangulo Bien */

		for (int x = 0; x < h; x++) {
			for (int y = 0; y < h - x; y++) {
				g.fillRect(x, y, 1, 1);
			}
		}
		/* Triangulo Inverso */
		/*
		 * for (int y = 0; y < h; y++) { for (int x = y; x < h; x++) {
		 * g.fillRect(x, y, 1, 1); } }
		 */

	}
}

public class DibujaTriangulo {
	public static void main(String args[]) {
		System.out.println("Altura del triángulo: ");
		Scanner in = new Scanner(System.in);
		Triangulo t = new Triangulo(in.nextInt());
		System.out.println("Color del triángulo(1=rojo,2=azul,3=verde,4=amarillo): ");

		switch (in.nextInt()) {
		case 1:
			t.color(255, 0, 0);
			break;
		case 2:
			t.color(0, 0, 255);
			break;
		case 3:
			t.color(0, 255, 0);
			break;
		case 4:
			t.color(0, 128, 128);
			break;
		}
		JFrame window = new JFrame();
		window.setTitle("TRIANGULO NO-ILLUMINATI");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 300, 300);
		window.getContentPane().add(t);
		window.setVisible(true);
	}
}
