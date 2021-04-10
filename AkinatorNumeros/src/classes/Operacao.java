/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author rafa_
 */
public class Operacao {
        int num;
        String acertou;
        String errou;
        String res;
        int val;
        
        void Reposta(){
        num = (int) (1 + Math.random() * (6 - 1));
        this.acertou = ("<html>Parabéns você adivinhou eu estava pensando no número " + this.num + "</html>");
        this.errou = ("<html>Errado eu pensei no numero " + this.num + "</html>");
        this.res = (this.val == num)?acertou:errou;
        
        
        }
     
         }

