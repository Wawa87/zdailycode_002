package com.anthonyguthrie.zdailycode_002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;
import java.util.Scanner;

@SpringBootApplication
public class Zdailycode002Application {

	public static void main(String[] args) {
		SpringApplication.run(Zdailycode002Application.class, args);

		System.setProperty("java.awt.headless", "false");

		Frame f = new Frame("TEST FRAME");
		f.setSize(800, 600);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Closing the frame/window.");
				f.dispose();
			}
		});
	}

}
