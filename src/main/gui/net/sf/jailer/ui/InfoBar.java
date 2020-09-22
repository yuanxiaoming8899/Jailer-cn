/*
 * Copyright 2007 - 2020 Ralf Wisser.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.jailer.ui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * Info Bar.
 * 
 * @author Ralf Wisser
 */
public class InfoBar extends JPanel {

	private static final long serialVersionUID = -6737420167295938488L;
	private final Font font = new JLabel().getFont();
	private final Font bold = new Font(font.getName(), font.getStyle() | Font.BOLD, font.getSize());
	private final Font big = new Font(font.getName(), font.getStyle() | Font.BOLD, (int) (font.getSize() * 1.3));
	private final String titel;
	private final String message;
	private final String footer;
	
	/** Creates new form SqlErrorDialog */
	public InfoBar(String titel, String message, String footer) {
		this.titel = titel;
		this.message = message;
		this.footer = footer;
		initComponents();
		int y = 1;
		if (titel != null) {
			JLabel label = new JLabel(titel);
			label.setFont(big);
			java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridy = y++;
			gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 0;
			gridBagConstraints.insets = new Insets(0, 0, 8, 0);
			messagePanel.add(label, gridBagConstraints);
		}
		for (String line : message.split("\n")) {
			JLabel label = new JLabel(line);
			java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridy = y++;
			gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 0;
			messagePanel.add(label, gridBagConstraints);
		}
		if (footer != null) {
			JLabel label = new JLabel(footer);
			label.setFont(bold);
			java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridy = y++;
			gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 0;
			messagePanel.add(label, gridBagConstraints);
		}
		iconLabel.setText(null);
		try {
			setIcon(UIManager.getIcon("OptionPane.informationIcon"));
		} catch (Throwable t) {
			// ignore
		}
	}

	public InfoBar(InfoBar infoBar) {
		this(infoBar.titel, infoBar.message, infoBar.footer);
		if (infoBar.iconLabel.getIcon() != null) {
			setIcon(infoBar.iconLabel.getIcon());
		}
	}

	public void setIcon(Icon errorIcon) {
		iconLabel.setIcon(errorIcon);
	}
	
	public void shrink() {
		jLabel1.setVisible(false);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		iconLabel = new javax.swing.JLabel();
		messagePanel = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();

		setLayout(new java.awt.GridBagLayout());

		iconLabel.setText("jLabel1");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 12);
		add(iconLabel, gridBagConstraints);

		messagePanel.setLayout(new java.awt.GridBagLayout());

		jLabel1.setText("  ");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 100;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		messagePanel.add(jLabel1, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
		add(messagePanel, gridBagConstraints);
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel iconLabel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel messagePanel;
	// End of variables declaration//GEN-END:variables

}
