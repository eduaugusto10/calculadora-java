/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgblue.calculadora;

/**
 *
 * @author Eduardo
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }
    Double value1, value2;
    String operation;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnTwo = new javax.swing.JButton();
        jBtnEight = new javax.swing.JButton();
        jBtnOne = new javax.swing.JButton();
        jBtnFive = new javax.swing.JButton();
        jBtnZero = new javax.swing.JButton();
        jBtnFour = new javax.swing.JButton();
        jBtnSeven = new javax.swing.JButton();
        jBtnResult = new javax.swing.JButton();
        jBtnSix = new javax.swing.JButton();
        jBtnNine = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jBtnMultiply = new javax.swing.JButton();
        jBtnThree = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtnClear2 = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jBtnDivide = new javax.swing.JButton();
        jBtnPercentage = new javax.swing.JButton();
        jBtnSquare = new javax.swing.JButton();
        jBtnElevator = new javax.swing.JButton();
        jBtnInverse = new javax.swing.JButton();
        jDisplay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnTwo.setText("2");
        jBtnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTwoActionPerformed(evt);
            }
        });

        jBtnEight.setText("8");
        jBtnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEightActionPerformed(evt);
            }
        });

        jBtnOne.setText("1");
        jBtnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOneActionPerformed(evt);
            }
        });

        jBtnFive.setText("5");
        jBtnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFiveActionPerformed(evt);
            }
        });

        jBtnZero.setText("0");
        jBtnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnZeroActionPerformed(evt);
            }
        });

        jBtnFour.setText("4");
        jBtnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFourActionPerformed(evt);
            }
        });

        jBtnSeven.setText("7");
        jBtnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSevenActionPerformed(evt);
            }
        });

        jBtnResult.setText("=");
        jBtnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResultActionPerformed(evt);
            }
        });

        jBtnSix.setText("6");
        jBtnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSixActionPerformed(evt);
            }
        });

        jBtnNine.setText("9");
        jBtnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNineActionPerformed(evt);
            }
        });

        jBtnPlus.setText("+");
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });

        jBtnMultiply.setText("X");
        jBtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplyActionPerformed(evt);
            }
        });

        jBtnThree.setText("3");
        jBtnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnThreeActionPerformed(evt);
            }
        });

        jBtnDot.setText(".");
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtnMinus.setText("-");
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });

        jBtnClear2.setText("CE");
        jBtnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClear2ActionPerformed(evt);
            }
        });

        jBtnClear.setText("C");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnBack.setText("←");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        jBtnDivide.setText("/");
        jBtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivideActionPerformed(evt);
            }
        });

        jBtnPercentage.setText("%");
        jBtnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPercentageActionPerformed(evt);
            }
        });

        jBtnSquare.setText("√");
        jBtnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSquareActionPerformed(evt);
            }
        });

        jBtnElevator.setText("x²");
        jBtnElevator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElevatorActionPerformed(evt);
            }
        });

        jBtnInverse.setText("1/x");
        jBtnInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInverseActionPerformed(evt);
            }
        });

        jDisplay.setEditable(false);
        jDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jDisplay.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnElevator, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jBtnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBtnDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnElevator, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Calculadora Simples em Java");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTwoActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("2");
        else jDisplay.setText(jDisplay.getText() + "2");
    }//GEN-LAST:event_jBtnTwoActionPerformed

    private void jBtnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEightActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("8");
        else jDisplay.setText(jDisplay.getText() + "8");
    }//GEN-LAST:event_jBtnEightActionPerformed

    private void jBtnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOneActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("1");
        else jDisplay.setText(jDisplay.getText() + "1");
    }//GEN-LAST:event_jBtnOneActionPerformed

    private void jBtnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFiveActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("5");
        else jDisplay.setText(jDisplay.getText() + "5");
    }//GEN-LAST:event_jBtnFiveActionPerformed

    private void jBtnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnZeroActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("0");
        else jDisplay.setText(jDisplay.getText() + "0");
    }//GEN-LAST:event_jBtnZeroActionPerformed

    private void jBtnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFourActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("4");
        else jDisplay.setText(jDisplay.getText() + "4");
    }//GEN-LAST:event_jBtnFourActionPerformed

    private void jBtnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSevenActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("7");
        else jDisplay.setText(jDisplay.getText() + "7");
    }//GEN-LAST:event_jBtnSevenActionPerformed

    private void jBtnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResultActionPerformed
        value2 = Double.parseDouble(jDisplay.getText());
        switch(operation){
            case "sum":
                jDisplay.setText(String.valueOf(value1 + value2));
                break;
            case "subtration":
                jDisplay.setText(String.valueOf(value1 - value2));
                break;
            case "multiply":
                jDisplay.setText(String.valueOf(value1 * value2));
                break;
            case "divide":
                jDisplay.setText(String.valueOf(value1 / value2)); 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jBtnResultActionPerformed

    private void jBtnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSixActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("6");
        else jDisplay.setText(jDisplay.getText() + "6");
    }//GEN-LAST:event_jBtnSixActionPerformed

    private void jBtnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNineActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("9");
        else jDisplay.setText(jDisplay.getText() + "9");
    }//GEN-LAST:event_jBtnNineActionPerformed

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
        value1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");
        operation = "sum";
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiplyActionPerformed
        value1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");
        operation = "multiply";
    }//GEN-LAST:event_jBtnMultiplyActionPerformed

    private void jBtnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnThreeActionPerformed
        if("0".equals(jDisplay.getText())) jDisplay.setText("3");
        else jDisplay.setText(jDisplay.getText() + "3");
    }//GEN-LAST:event_jBtnThreeActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        if(jDisplay.getText().contains(".")) jDisplay.setText(jDisplay.getText());
        else  jDisplay.setText(jDisplay.getText() + ".");
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        value1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");
        operation = "subtration";
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClear2ActionPerformed
        jDisplay.setText("0");
    }//GEN-LAST:event_jBtnClear2ActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        jDisplay.setText("0");
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jBtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivideActionPerformed
        value1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");
        operation = "divide";
    }//GEN-LAST:event_jBtnDivideActionPerformed

    private void jBtnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPercentageActionPerformed
        value1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(String.valueOf(value1 * 100));
    }//GEN-LAST:event_jBtnPercentageActionPerformed

    private void jBtnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSquareActionPerformed
        value1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(String.valueOf(Math.sqrt(value1)));        
    }//GEN-LAST:event_jBtnSquareActionPerformed

    private void jBtnElevatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElevatorActionPerformed
        value1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(String.valueOf(value1 * value1));
    }//GEN-LAST:event_jBtnElevatorActionPerformed

    private void jBtnInverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInverseActionPerformed
        value1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(String.valueOf( 1 / value1));
    }//GEN-LAST:event_jBtnInverseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnClear2;
    private javax.swing.JButton jBtnDivide;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEight;
    private javax.swing.JButton jBtnElevator;
    private javax.swing.JButton jBtnFive;
    private javax.swing.JButton jBtnFour;
    private javax.swing.JButton jBtnInverse;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMultiply;
    private javax.swing.JButton jBtnNine;
    private javax.swing.JButton jBtnOne;
    private javax.swing.JButton jBtnPercentage;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jBtnResult;
    private javax.swing.JButton jBtnSeven;
    private javax.swing.JButton jBtnSix;
    private javax.swing.JButton jBtnSquare;
    private javax.swing.JButton jBtnThree;
    private javax.swing.JButton jBtnTwo;
    private javax.swing.JButton jBtnZero;
    private javax.swing.JTextField jDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
