package ba.unsa.etf.rpr.tutorijal05;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    Float broj = 0f;
    int operacija = 0;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button modul;

    @FXML
    private Button kroz;

    @FXML
    private Button puta;

    @FXML
    private Button minus;

    @FXML
    private Button plusBtn;

    @FXML
    private Button equalsBtn;

    @FXML
    private Button tacka;

    @FXML
    private Label display = new Label("");

    @FXML
    public void Brojevi(ActionEvent actionEvent) {
        if(actionEvent.getSource()==btn0){
            display.setText(display.getText()+"0");
        }
        else if(actionEvent.getSource()==btn1){
            display.setText(display.getText()+"1");
        }
        else if(actionEvent.getSource()==btn2){
            display.setText(display.getText()+"2");
        }
        else if(actionEvent.getSource()==btn3){
            display.setText(display.getText()+"3");
        }
        else if(actionEvent.getSource()==btn4){
            display.setText(display.getText()+"4");
        }
        else if(actionEvent.getSource()==btn5){
            display.setText(display.getText()+"5");
        }
        else if(actionEvent.getSource()==btn6){
            display.setText(display.getText()+"6");
        }
        else if(actionEvent.getSource()==btn7){
            display.setText(display.getText()+"7");
        }
        else if(actionEvent.getSource()==btn8){
            display.setText(display.getText()+"8");
        }
        else if(actionEvent.getSource()==btn9){
            display.setText(display.getText()+"9");
        }
        else if(actionEvent.getSource()==tacka){
            display.setText(display.getText()+".");
        }
    }

    @FXML
    public void Operacije(ActionEvent actionEvent) {
        if(actionEvent.getSource()==plusBtn){
            broj = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 1;
        }
        else if(actionEvent.getSource()==minus){
            broj = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 2;
        }

        else if(actionEvent.getSource()==kroz){
            broj = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 3;
        }

        else if(actionEvent.getSource()==puta){
            broj = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 4;
        }

        else if(actionEvent.getSource()==modul){
            broj = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 5;
        }

        else if(actionEvent.getSource()==equalsBtn){
            Float drugiBroj = Float.parseFloat(display.getText());
            display.setText("");
            switch (operacija){
                case 1:
                    display.setText(String.valueOf(broj+drugiBroj));
                    break;
                case 2:
                    display.setText(String.valueOf(broj-drugiBroj));
                    break;
                case 3:
                    display.setText(String.valueOf(broj/drugiBroj));
                    break;
                case 4:
                    display.setText(String.valueOf(broj*drugiBroj));
                    break;
                case 5:
                    display.setText(String.valueOf(broj%drugiBroj));
                    break;
            }

        }
    }

}