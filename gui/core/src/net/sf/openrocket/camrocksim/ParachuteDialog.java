/*
%## Copyright (C) 2010, 2016 S.Box
%## 
%## This program is free software; you can redistribute it and/or modify
%## it under the terms of the GNU General Public License as published by
%## the Free Software Foundation; either version 2 of the License, or
%## (at your option) any later version.
%## 
%## This program is distributed in the hope that it will be useful,
%## but WITHOUT ANY WARRANTY; without even the implied warranty of
%## MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
%## GNU General Public License for more details.
%## 
%## You should have received a copy of the GNU General Public License
%## along with this program; if not, write to the Free Software
%## Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA

%## ParachuteDialog.java

%## Author: S.Box
%## Created: 2010-05-27
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ParachuteDialog.java
 *
 * Created on 20-May-2010, 12:22:42
 */

package net.sf.openrocket.camrocksim;

import java.util.Vector;

import javax.swing.JOptionPane;

/**
 *
 * @author sb4p07
 */
public class ParachuteDialog extends javax.swing.JDialog {
	
	///*Class Members*******
	double ParaArea,
			ParaCD,
			PackedLength,
			PackedDiameter,
			Altitude,
			Mass,
			Position;
	String Name;
	boolean Apogee;
	boolean ReadOk;
	
	/** Creates new form ParachuteDialog */
	public ParachuteDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		
		ParaTitle = new javax.swing.JLabel();
		ParaAreaLabel = new javax.swing.JLabel();
		ParaCDLabel = new javax.swing.JLabel();
		ParaLengthLabel = new javax.swing.JLabel();
		ParaDiamLabel = new javax.swing.JLabel();
		ParaMassLabel = new javax.swing.JLabel();
		ParaPosLabel = new javax.swing.JLabel();
		ParaAreaText = new javax.swing.JTextField();
		ParaCDText = new javax.swing.JTextField();
		ParaLengthText = new javax.swing.JTextField();
		ParaDiamText = new javax.swing.JTextField();
		ParaMassText = new javax.swing.JTextField();
		ParaPosText = new javax.swing.JTextField();
		ParaNameLabel = new javax.swing.JLabel();
		ParaNameText = new javax.swing.JTextField();
		ParaAddButtoon = new javax.swing.JButton();
		ParaCancelButton = new javax.swing.JButton();
		ParaAreaUnits = new javax.swing.JLabel();
		ParaLengthUnits = new javax.swing.JLabel();
		ParaDiamUnits = new javax.swing.JLabel();
		ParaMassUnits = new javax.swing.JLabel();
		ParaPositionUnits = new javax.swing.JLabel();
		ParaDeployTitle = new javax.swing.JLabel();
		ParaDcondLabel = new javax.swing.JLabel();
		ParaApogee = new javax.swing.JRadioButton();
		ParaAltitude = new javax.swing.JRadioButton();
		ParaAltitudeText = new javax.swing.JTextField();
		ParaAltitudeUnits = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		ParaTitle.setText("Set Parachute Specifications");
		
		ParaAreaLabel.setText("Parachute Area");
		
		ParaCDLabel.setText("Coeficient of Drag (CD)");
		
		ParaLengthLabel.setText("Packed Length");
		
		ParaDiamLabel.setText("Packed Diameter");
		
		ParaMassLabel.setText("Mass");
		
		ParaPosLabel.setText("Position");
		
		ParaAreaText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				ParaAreaTextFocusLost(evt);
			}
		});
		
		ParaCDText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				ParaCDTextFocusLost(evt);
			}
		});
		
		ParaLengthText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				ParaLengthTextFocusLost(evt);
			}
		});
		
		ParaDiamText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				ParaDiamTextFocusLost(evt);
			}
		});
		
		ParaMassText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				ParaMassTextFocusLost(evt);
			}
		});
		
		ParaPosText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				ParaPosTextFocusLost(evt);
			}
		});
		
		ParaNameLabel.setText("Name");
		
		ParaNameText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				ParaNameTextFocusLost(evt);
			}
		});
		
		ParaAddButtoon.setText("Add");
		ParaAddButtoon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ParaAddButtoonActionPerformed(evt);
			}
		});
		
		ParaCancelButton.setText("Cancel");
		ParaCancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ParaCancelButtonActionPerformed(evt);
			}
		});
		
		ParaAreaUnits.setText("<html>m<sup>2</sup>");
		
		ParaLengthUnits.setText("m");
		
		ParaDiamUnits.setText("m");
		
		ParaMassUnits.setText("kg");
		
		ParaPositionUnits.setText("m");
		
		ParaDeployTitle.setText("Set Deployment Conditions");
		
		ParaDcondLabel.setText("Paracute deploys at:");
		
		ParaApogee.setSelected(true);
		ParaApogee.setText("Apogee");
		ParaApogee.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ParaApogeeActionPerformed(evt);
			}
		});
		
		ParaAltitude.setText("Altitude");
		ParaAltitude.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ParaAltitudeActionPerformed(evt);
			}
		});
		
		ParaAltitudeText.setEnabled(false);
		ParaAltitudeText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				ParaAltitudeTextFocusLost(evt);
			}
		});
		
		ParaAltitudeUnits.setText("m");
		
		jButton1.setText("?");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addContainerGap()
												.addComponent(ParaTitle)
												.addGap(279, 279, 279))
										.addGroup(layout.createSequentialGroup()
												.addContainerGap(58, Short.MAX_VALUE)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(ParaAreaLabel)
														.addComponent(ParaCDLabel)
														.addComponent(ParaLengthLabel)
														.addComponent(ParaDiamLabel)
														.addComponent(ParaMassLabel)
														.addComponent(ParaPosLabel)
														.addComponent(ParaNameLabel))
												.addGap(37, 37, 37)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(ParaNameText)
														.addComponent(ParaAreaText, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
														.addComponent(ParaCDText)
														.addComponent(ParaLengthText)
														.addComponent(ParaDiamText)
														.addComponent(ParaMassText)
														.addComponent(ParaPosText))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(ParaPositionUnits)
														.addComponent(ParaMassUnits)
														.addComponent(ParaDiamUnits)
														.addComponent(ParaLengthUnits)
														.addComponent(ParaAreaUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(83, 83, 83)))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(ParaDeployTitle)
										.addComponent(ParaDcondLabel)
										.addGroup(layout.createSequentialGroup()
												.addGap(35, 35, 35)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addComponent(ParaAltitude)
																.addGap(18, 18, 18)
																.addComponent(ParaAltitudeText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(ParaAltitudeUnits))
														.addComponent(ParaApogee))))
								.addContainerGap(58, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap(293, Short.MAX_VALUE)
								.addComponent(ParaAddButtoon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(43, 43, 43)
								.addComponent(ParaCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(57, 57, 57)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(179, 179, 179)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ParaTitle)
										.addComponent(ParaDeployTitle))
								.addGap(36, 36, 36)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(ParaNameLabel)
														.addComponent(ParaNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
														.addComponent(ParaAreaLabel)
														.addComponent(ParaAreaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(ParaAreaUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
														.addComponent(ParaCDLabel)
														.addComponent(ParaCDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(layout.createSequentialGroup()
												.addComponent(ParaDcondLabel)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(ParaApogee)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
														.addComponent(ParaAltitude)
														.addComponent(ParaAltitudeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(ParaAltitudeUnits))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
										.addComponent(ParaLengthLabel)
										.addComponent(ParaLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(ParaLengthUnits))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
										.addComponent(ParaDiamLabel)
										.addComponent(ParaDiamText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(ParaDiamUnits))
								.addGap(12, 12, 12)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
										.addComponent(ParaMassLabel)
										.addComponent(ParaMassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(ParaMassUnits))
								.addGap(16, 16, 16)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ParaPosLabel)
										.addComponent(ParaPosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(ParaPositionUnits))
								.addGap(53, 53, 53)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ParaAddButtoon)
										.addComponent(ParaCancelButton)
										.addComponent(jButton1))
								.addGap(32, 32, 32)));
		
		pack();
	}// </editor-fold>//GEN-END:initComponents
	
	private void ParaAltitudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaAltitudeActionPerformed
		if (ParaAltitude.isSelected()) {
			ParaApogee.setSelected(false);
			ParaAltitudeText.setEnabled(true);
		} else {
			ParaAltitude.setSelected(true);
		}
	}//GEN-LAST:event_ParaAltitudeActionPerformed
	
	private void ParaApogeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaApogeeActionPerformed
		if (ParaApogee.isSelected()) {
			ParaAltitude.setSelected(false);
			ParaAltitudeText.setEnabled(false);
		} else {
			ParaApogee.setSelected(true);
		}
	}//GEN-LAST:event_ParaApogeeActionPerformed
	
	private void ParaAreaTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ParaAreaTextFocusLost
		//Function to test the validity of the user input
		TestUserTextInput PATest = new TestUserTextInput(ParaAreaText);
		ParaArea = PATest.TestDouble();
		ParaAreaText = PATest.InputField;
	}//GEN-LAST:event_ParaAreaTextFocusLost
	
	private void ParaCDTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ParaCDTextFocusLost
		//Function to test the validity of the user input
		TestUserTextInput CDTest = new TestUserTextInput(ParaCDText);
		ParaCD = CDTest.TestDouble();
		ParaCDText = CDTest.InputField;
	}//GEN-LAST:event_ParaCDTextFocusLost
	
	private void ParaLengthTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ParaLengthTextFocusLost
		//Function to test the validity of the user input
		TestUserTextInput PLTest = new TestUserTextInput(ParaLengthText);
		PackedLength = PLTest.TestDouble();
		ParaLengthText = PLTest.InputField;
	}//GEN-LAST:event_ParaLengthTextFocusLost
	
	private void ParaDiamTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ParaDiamTextFocusLost
		//Function to test the validity of the user input
		TestUserTextInput PDTest = new TestUserTextInput(ParaDiamText);
		PackedDiameter = PDTest.TestDouble();
		ParaDiamText = PDTest.InputField;
	}//GEN-LAST:event_ParaDiamTextFocusLost
	
	private void ParaMassTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ParaMassTextFocusLost
		//Function to test the validity of the user input
		TestUserTextInput PMTest = new TestUserTextInput(ParaMassText);
		Mass = PMTest.TestDouble();
		ParaMassText = PMTest.InputField;
	}//GEN-LAST:event_ParaMassTextFocusLost
	
	private void ParaPosTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ParaPosTextFocusLost
		//Function to test the validity of the user input
		TestUserTextInput PPTest = new TestUserTextInput(ParaPosText);
		Position = PPTest.TestDouble();
		ParaPosText = PPTest.InputField;
	}//GEN-LAST:event_ParaPosTextFocusLost
	
	private void ParaAltitudeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ParaAltitudeTextFocusLost
		//Function to test the validity of the user input
		TestUserTextInput PHTest = new TestUserTextInput(ParaAltitudeText);
		Altitude = PHTest.TestDouble();
		ParaAltitudeText = PHTest.InputField;
	}//GEN-LAST:event_ParaAltitudeTextFocusLost
	
	private void ParaAddButtoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaAddButtoonActionPerformed
		boolean Goer = CheckValidity();
		if (Goer == true) {
			ReadOk = true;
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(null, ("One or more of the data you entered are invalid"));//TODO do this for all dialogs!!
		}
	}//GEN-LAST:event_ParaAddButtoonActionPerformed
	
	private void ParaCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaCancelButtonActionPerformed
		this.dispose();
	}//GEN-LAST:event_ParaCancelButtonActionPerformed
	
	private void ParaNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ParaNameTextFocusLost
		Name = ParaNameText.getText();
	}//GEN-LAST:event_ParaNameTextFocusLost
	
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		Tips tDiag = new Tips(null, true);
		tDiag.setTipTxt(
				"Parachute Settings \n\n Use this window to specify the parameters of the Parachute. The parachute area is the cross sectional area of the mouth of the deployed parachute. Packed Length and Diameter refer to the dimensions of the parachute when packed in the rocket. Position is the distance, along the rocket's axis, from the nose tip to the foremost edge of the part.\n\n Parachutes can be set to deploy either at apogee or a specified altitude during descent. You should only set one apogee deploying parachute per rocket stage.");
		tDiag.setVisible(true);
	}//GEN-LAST:event_jButton1ActionPerformed
	
	/**
	* @param args the command line arguments
	*/
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				ParachuteDialog dialog = new ParachuteDialog(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}
	
	
	private boolean CheckValidity() {
		boolean answer;
		Apogee = ParaApogee.isSelected();
		Vector<javax.swing.JTextField> FieldsList = new Vector<javax.swing.JTextField>();
		FieldsList.add(ParaLengthText);
		FieldsList.add(ParaDiamText);
		FieldsList.add(ParaMassText);
		FieldsList.add(ParaPosText);
		FieldsList.add(ParaAreaText);
		FieldsList.add(ParaCDText);
		
		if (Apogee == false) {
			FieldsList.add(ParaAltitudeText);
		} else {
			Altitude = 0.0;
		}
		
		TestUserTextInput TUI1 = new TestUserTextInput(FieldsList);
		answer = TUI1.TestDoubleList();
		return (answer);
	}
	
	
	
	public void FillFields(double d1, double d2, double d3, double d4, double d5, double d6, double d7, boolean b1, String s1) {
		PackedLength = d1;
		PackedDiameter = d2;
		Mass = d3;
		Position = d4;
		ParaArea = d5;
		ParaCD = d6;
		Altitude = d7;
		Apogee = b1;
		
		Name = s1;
		//RadialPosition = d5;
		
		ParaLengthText.setText(Double.toString(PackedLength));
		ParaDiamText.setText(Double.toString(PackedDiameter));
		ParaMassText.setText(Double.toString(Mass));
		ParaPosText.setText(Double.toString(Position));
		ParaAreaText.setText(Double.toString(ParaArea));
		ParaCDText.setText(Double.toString(ParaCD));
		ParaNameText.setText(Name);
		
		if (Apogee == false) {
			ParaApogee.setEnabled(false);
			ParaAltitude.setEnabled(true);
			ParaAltitudeText.setEnabled(true);
			ParaAltitudeText.setText(Double.toString(Altitude));
		}
		//CylRadPosText.setText(Double.toString(RadialPosition));
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton ParaAddButtoon;
	private javax.swing.JRadioButton ParaAltitude;
	private javax.swing.JTextField ParaAltitudeText;
	private javax.swing.JLabel ParaAltitudeUnits;
	private javax.swing.JRadioButton ParaApogee;
	private javax.swing.JLabel ParaAreaLabel;
	private javax.swing.JTextField ParaAreaText;
	private javax.swing.JLabel ParaAreaUnits;
	private javax.swing.JLabel ParaCDLabel;
	private javax.swing.JTextField ParaCDText;
	private javax.swing.JButton ParaCancelButton;
	private javax.swing.JLabel ParaDcondLabel;
	private javax.swing.JLabel ParaDeployTitle;
	private javax.swing.JLabel ParaDiamLabel;
	private javax.swing.JTextField ParaDiamText;
	private javax.swing.JLabel ParaDiamUnits;
	private javax.swing.JLabel ParaLengthLabel;
	private javax.swing.JTextField ParaLengthText;
	private javax.swing.JLabel ParaLengthUnits;
	private javax.swing.JLabel ParaMassLabel;
	private javax.swing.JTextField ParaMassText;
	private javax.swing.JLabel ParaMassUnits;
	private javax.swing.JLabel ParaNameLabel;
	private javax.swing.JTextField ParaNameText;
	private javax.swing.JLabel ParaPosLabel;
	private javax.swing.JTextField ParaPosText;
	private javax.swing.JLabel ParaPositionUnits;
	private javax.swing.JLabel ParaTitle;
	private javax.swing.JButton jButton1;
	// End of variables declaration//GEN-END:variables
	
}
