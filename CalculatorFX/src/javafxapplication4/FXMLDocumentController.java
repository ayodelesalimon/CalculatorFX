/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button clear;

    @FXML
    private Button equal;

    @FXML
    private Button six;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button add;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button eight;

    @FXML
    private Button seven;

    @FXML
    private Button sub;

    @FXML
    private Button zero;

    @FXML
    private Button as;

    @FXML
    private Button div;

    @FXML
    private Button nine;

    @FXML
    private Button dot;

    @FXML
    private Button mul;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    
        // TODO
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    double rn=0;
    double n1;
    double n2;
    char op;
    int point;
    
    
    @FXML
    private void calculation(ActionEvent event){
        
        if(event.getSource()== one){
        display.appendText("1");
        }
        else if(event.getSource() == two){
        display.appendText("2");
        }
        else if(event.getSource() == three){
        display.appendText("3");
        }
        else if(event.getSource() == four){
        display.appendText("4");
        }
        else if(event.getSource() == five){
        display.appendText("5");
        }
        else if(event.getSource() == six){
        display.appendText("6");
        }
        else if(event.getSource() == seven){
        display.appendText("7");
        }
        else if(event.getSource() == eight){
        display.appendText("8");
        }
        else if(event.getSource() == nine){
        display.appendText("9");
        }
        else if(event.getSource() == zero){
        display.appendText("0");
        }
        else if(event.getSource() == dot && point == 0){
        display.appendText(".");
        point =1;
        }
        else if(event.getSource() == add){
            n1= Double.parseDouble(display.getText());
        display.setText("");
        op = '+';
        point = 0;
        }
        else if(event.getSource() == sub){
         n1= Double.parseDouble(display.getText());
        display.setText("");
        op = '-';
        point = 0;
        }
        else if(event.getSource() == mul){
            n1= Double.parseDouble(display.getText());
        display.setText("");
        op = '*';
        point = 0;
        }
        else if(event.getSource() == div){
            n1= Double.parseDouble(display.getText());
        display.setText("");
        op = '/';
        point = 0;
        }
        else if(event.getSource() == as){
            n1= Double.parseDouble(display.getText());
        n1 = n1 * (-1);
        display.setText(String.valueOf(n1));
        point = 0;
        }
        else if(event.getSource() == equal){
           n2=Double.parseDouble(display.getText());
           
           switch(op){
               case '+': rn = n1+n2;
                    break;
               case'-':rn = n1-n2;
                    break;
               case '*': rn = n1*n2;
                    break;
               case '/': rn = n1/n2;
                    break;
               default: display.setText("Error");    
           }
           display.setText(String.valueOf(rn));
        }
        
        else if(event.getSource() == clear){
            n1= 0;
            n2= 0;
            display.setText("");
            op=0;
            point=0;
        }
    }
}
