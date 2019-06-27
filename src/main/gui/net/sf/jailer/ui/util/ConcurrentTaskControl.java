/*
 * Copyright 2007 - 2019 the original author or authors.
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
package net.sf.jailer.ui.util;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import net.sf.jailer.ui.UIUtil;

/**
 * Controls a concurrent task.
 *
 * @author Wisser
 */
@SuppressWarnings("serial")
public abstract class ConcurrentTaskControl extends javax.swing.JPanel {

    /**
     * Creates new form ConcurrentTaskControl
     * @param parent
     */
    public ConcurrentTaskControl(Window parent, String info) {
        initComponents();
        infoLabel.setText(info);
        parent.addWindowListener(new WindowListener() {
			@Override
			public void windowClosed(WindowEvent e) {
				cancel();
			}
			@Override
			public void windowOpened(WindowEvent e) {
			}
			@Override
			public void windowIconified(WindowEvent e) {
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			@Override
			public void windowClosing(WindowEvent e) {
			}
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        infoLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        infoLabel.setFont(infoLabel.getFont().deriveFont(infoLabel.getFont().getSize()+4f));
        infoLabel.setText("<html>1<br>2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(infoLabel, gridBagConstraints);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        add(cancelButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        cancel();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private boolean cancelled;
    
    private void cancel() {
		cancelled = true;
		onCancellation();
	}

	/**
     * A task.
     */
	public interface Task {

		/**
		 * Runs the task.
		 */
		void run() throws Throwable;

	}

	/**
	 * Starts the task.
	 * 
	 * @param task the task
	 */
	public void start(final Task task) {
		cancelled = false;
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					task.run();
				} catch (final Throwable e) {
					if (!cancelled) {
						UIUtil.invokeLater(new Runnable() {
							@Override
							public void run() {
								onError(e);
							}
						});
					}
				}
			}
		});
		thread.setDaemon(true);
		thread.start();
	}

	/**
	 * Reacts on errors (called in AWT-Thread).
	 * 
	 * @param error the error
	 */
	protected abstract void onError(Throwable error);

	/**
	 * Reacts on cancellation (called in AWT-Thread).
	 * 
	 * @param error the error
	 */
	protected abstract void onCancellation();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel infoLabel;
    // End of variables declaration//GEN-END:variables
}
