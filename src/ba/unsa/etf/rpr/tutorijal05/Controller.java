package ba.unsa.etf.rpr.tutorijal05;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    Float broj = 0f;
    int operacija = 0;

    @FXML
    private Button broj0;

    @FXML
    private Button broj1;

    @FXML
    private Button broj2;

    @FXML
    private Button broj3;

    @FXML
    private Button broj4;

    @FXML
    private Button broj5;

    @FXML
    private Button broj6;

    @FXML
    private Button broj7;

    @FXML
    private Button broj8;

    @FXML
    private Button broj9;

    @FXML
    private Button mod;

    @FXML
    private Button kroz;

    @FXML
    private Button puta;

    @FXML
    private Button minus;

    @FXML
    private Button plus;

    @FXML
    private Button jednako;

    @FXML
    private Button tacka;

    @FXML
    private Label rez = new Label("");

    @FXML
    public void Brojevi(ActionEvent actionEvent) {
        if(actionEvent.getSource()==broj1){
            rez.setText(rez.getText()+"1");
        }
        else if(actionEvent.getSource()==broj0){
            rez.setText(rez.getText()+"0");
        }
        else if(actionEvent.getSource()==broj2){
            rez.setText(rez.getText()+"2");
        }
        else if(actionEvent.getSource()==broj3){
            rez.setText(rez.getText()+"3");
        }
        else if(actionEvent.getSource()==broj7){
            rez.setText(rez.getText()+"7");
        }
        else if(actionEvent.getSource()==broj4){
            rez.setText(rez.getText()+"4");
        }
        else if(actionEvent.getSource()==broj5){
            rez.setText(rez.getText()+"5");
        }
        else if(actionEvent.getSource()==broj6){
            rez.setText(rez.getText()+"6");
        }
        else if(actionEvent.getSource()==broj8){
            rez.setText(rez.getText()+"8");
        }
        else if(actionEvent.getSource()==broj9){
            rez.setText(rez.getText()+"9");
        }
        else if(actionEvent.getSource()==tacka){
            rez.setText(rez.getText()+".");
        }
    }

    @FXML
    public void Operacije(ActionEvent actionEvent) {
        if(actionEvent.getSource()==plus){
            broj = Float.parseFloat(rez.getText());
            rez.setText("");
            operacija = 1;
        }
        else if(actionEvent.getSource()==minus){
            broj = Float.parseFloat(rez.getText());
            rez.setText("");
            operacija = 2;
        }

        else if(actionEvent.getSource()==kroz){
            broj = Float.parseFloat(rez.getText());
            rez.setText("");
            operacija = 3;
        }

        else if(actionEvent.getSource()==puta){
            broj = Float.parseFloat(rez.getText());
            rez.setText("");
            operacija = 4;
        }

        else if(actionEvent.getSource()==mod){
            broj = Float.parseFloat(rez.getText());
            rez.setText("");
            operacija = 5;
        }

        else if(actionEvent.getSource()==jednako){
            Float drugiBroj = Float.parseFloat(rez.getText());
            rez.setText("");
            switch (operacija){
                case 1:
                    rez.setText(String.valueOf(broj+drugiBroj));
                    break;
                case 2:
                    rez.setText(String.valueOf(broj-drugiBroj));
                    break;
                case 3:
                    rez.setText(String.valueOf(broj/drugiBroj));
                    break;
                case 4:
                    rez.setText(String.valueOf(broj*drugiBroj));
                    break;
                case 5:
                    rez.setText(String.valueOf(broj%drugiBroj));
                    break;
            }

        }
    }

}