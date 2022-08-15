/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author CEIA_____
 */
public class Calculadora extends javax.swing.JFrame {

    
    public Calculadora() {
        initComponents();
    }

    Double valor1, valor2;
    String sinal;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txf_Resultado = new javax.swing.JTextField();
        btn_um = new javax.swing.JButton();
        btn_quatro = new javax.swing.JButton();
        btn_sete = new javax.swing.JButton();
        btn_dois = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_oito = new javax.swing.JButton();
        btn_tres = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_nove = new javax.swing.JButton();
        btn_zero = new javax.swing.JButton();
        btn_ponto = new javax.swing.JButton();
        btn_adicao = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_ce = new javax.swing.JButton();
        btn_subtracao = new javax.swing.JButton();
        btn_multiplicacao = new javax.swing.JButton();
        btn_divisao = new javax.swing.JButton();
        btn_binario = new javax.swing.JButton();
        btn_octal = new javax.swing.JButton();
        btn_hexadecimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txf_Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_ResultadoActionPerformed(evt);
            }
        });

        btn_um.setText("1");
        btn_um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_umActionPerformed(evt);
            }
        });

        btn_quatro.setText("4");
        btn_quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quatroActionPerformed(evt);
            }
        });

        btn_sete.setText("7");
        btn_sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seteActionPerformed(evt);
            }
        });

        btn_dois.setText("2");
        btn_dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doisActionPerformed(evt);
            }
        });

        btn_cinco.setText("5");
        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        btn_oito.setText("8");
        btn_oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oitoActionPerformed(evt);
            }
        });

        btn_tres.setText("3");
        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_seis.setText("6");
        btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seisActionPerformed(evt);
            }
        });

        btn_nove.setText("9");
        btn_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noveActionPerformed(evt);
            }
        });

        btn_zero.setText("0");
        btn_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zeroActionPerformed(evt);
            }
        });

        btn_ponto.setText(".");
        btn_ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pontoActionPerformed(evt);
            }
        });

        btn_adicao.setText("+");
        btn_adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicaoActionPerformed(evt);
            }
        });

        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_c.setText("C");

        btn_ce.setText("CE");
        btn_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceActionPerformed(evt);
            }
        });

        btn_subtracao.setText("-");
        btn_subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subtracaoActionPerformed(evt);
            }
        });

        btn_multiplicacao.setText("*");
        btn_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacaoActionPerformed(evt);
            }
        });

        btn_divisao.setText("/");
        btn_divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisaoActionPerformed(evt);
            }
        });

        btn_binario.setText("BIN");
        btn_binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_binarioActionPerformed(evt);
            }
        });

        btn_octal.setText("OCTAL");
        btn_octal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_octalActionPerformed(evt);
            }
        });

        btn_hexadecimal.setText("HEXA");
        btn_hexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hexadecimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txf_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_um, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_sete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_oito, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                            .addComponent(btn_cinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_seis, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                            .addComponent(btn_nove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_ce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(btn_multiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_divisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_binario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_hexadecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_octal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(txf_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sete)
                    .addComponent(btn_oito)
                    .addComponent(btn_nove)
                    .addComponent(btn_ce)
                    .addComponent(btn_adicao)
                    .addComponent(btn_binario))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_quatro)
                    .addComponent(btn_cinco)
                    .addComponent(btn_seis)
                    .addComponent(btn_c)
                    .addComponent(btn_subtracao)
                    .addComponent(btn_octal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_um)
                            .addComponent(btn_dois)
                            .addComponent(btn_tres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_multiplicacao)
                            .addComponent(btn_hexadecimal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_divisao))
                    .addComponent(btn_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_ResultadoActionPerformed

    private void btn_doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doisActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"2");
    }//GEN-LAST:event_btn_doisActionPerformed

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tresActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"3");
    }//GEN-LAST:event_btn_tresActionPerformed

    private void btn_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zeroActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"0");
    }//GEN-LAST:event_btn_zeroActionPerformed

    private void btn_umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_umActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"1");
    }//GEN-LAST:event_btn_umActionPerformed

    private void btn_quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quatroActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"4");
    }//GEN-LAST:event_btn_quatroActionPerformed

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"5");
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seisActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"6");
    }//GEN-LAST:event_btn_seisActionPerformed

    private void btn_seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seteActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"7");
    }//GEN-LAST:event_btn_seteActionPerformed

    private void btn_oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oitoActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"8");
    }//GEN-LAST:event_btn_oitoActionPerformed

    private void btn_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noveActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+"9");
    }//GEN-LAST:event_btn_noveActionPerformed

    private void btn_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceActionPerformed
        txf_Resultado.setText("");
    }//GEN-LAST:event_btn_ceActionPerformed

    private void btn_pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pontoActionPerformed
        txf_Resultado.setText(txf_Resultado.getText()+".");
    }//GEN-LAST:event_btn_pontoActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        valor2=Double.parseDouble(txf_Resultado.getText());
        if(sinal=="soma"){
            txf_Resultado.setText(String.valueOf(valor1+valor2));
        }
        if(sinal=="subtrair"){
            txf_Resultado.setText(String.valueOf(valor1-valor2));
        }
        if(sinal=="multiplicar"){
            txf_Resultado.setText(String.valueOf(valor1*valor2));
        }
        if(sinal=="dividir"){
            txf_Resultado.setText(String.valueOf(valor1/valor2));
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_adicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicaoActionPerformed
        valor1=Double.parseDouble(txf_Resultado.getText());
        txf_Resultado.setText("");
        sinal="soma";
    }//GEN-LAST:event_btn_adicaoActionPerformed

    private void btn_subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subtracaoActionPerformed
        valor1=Double.parseDouble(txf_Resultado.getText());
        txf_Resultado.setText("");
        sinal="subtrair";
    }//GEN-LAST:event_btn_subtracaoActionPerformed

    private void btn_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacaoActionPerformed
        valor1=Double.parseDouble(txf_Resultado.getText());
        txf_Resultado.setText("");
        sinal="multiplicar";
    }//GEN-LAST:event_btn_multiplicacaoActionPerformed

    private void btn_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisaoActionPerformed
        valor1=Double.parseDouble(txf_Resultado.getText());
        txf_Resultado.setText("");
        sinal="dividir";
    }//GEN-LAST:event_btn_divisaoActionPerformed

    private void btn_binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_binarioActionPerformed
        valor1=Double.parseDouble(txf_Resultado.getText());
        int i_val = (int) Math.round(valor1);
        sinal="binario";
        if(sinal=="binario"){
            txf_Resultado.setText(String.valueOf(Integer.toBinaryString(i_val)));
        }
    }//GEN-LAST:event_btn_binarioActionPerformed

    private void btn_octalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_octalActionPerformed
        valor1=Double.parseDouble(txf_Resultado.getText());
        int i_val = (int) Math.round(valor1);
        sinal="octal";
        if(sinal=="octal"){
            txf_Resultado.setText(String.valueOf(Integer.toOctalString(i_val)));
        }
    }//GEN-LAST:event_btn_octalActionPerformed

    private void btn_hexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hexadecimalActionPerformed
        valor1=Double.parseDouble(txf_Resultado.getText());
        int i_val = (int) Math.round(valor1);
        sinal="hexadecimal";
        if(sinal=="hexadecimal"){
            txf_Resultado.setText(String.valueOf(Integer.toHexString(i_val)));
        }
    }//GEN-LAST:event_btn_hexadecimalActionPerformed

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
    private javax.swing.JButton btn_adicao;
    private javax.swing.JButton btn_binario;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_ce;
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_divisao;
    private javax.swing.JButton btn_dois;
    private javax.swing.JButton btn_hexadecimal;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacao;
    private javax.swing.JButton btn_nove;
    private javax.swing.JButton btn_octal;
    private javax.swing.JButton btn_oito;
    private javax.swing.JButton btn_ponto;
    private javax.swing.JButton btn_quatro;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_sete;
    private javax.swing.JButton btn_subtracao;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_um;
    private javax.swing.JButton btn_zero;
    private javax.swing.JTextField txf_Resultado;
    // End of variables declaration//GEN-END:variables
}
