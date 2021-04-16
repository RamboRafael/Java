package classes;
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

