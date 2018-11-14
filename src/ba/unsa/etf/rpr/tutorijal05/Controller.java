package ba.unsa.etf.rpr.tutorijal05;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Label;

public class Controller {
    private SimpleStringProperty rezultat;
    private String brojJedan="";
    private String brojDva="";
    private String operacija="";

    public Label display;

    public Controller() {
        rezultat = new SimpleStringProperty();
        rezultat.set("0");
    }

    public String getRezultat() {
        return rezultat.get();
    }

    public SimpleStringProperty rezultatProperty() {
        return rezultat;
    }

    public void btn1(ActionEvent actionEvent) {
        brojJedan+="1";
        rezultat.set(brojJedan);
    }

    public void btn2(ActionEvent actionEvent) {
        brojJedan+="2";
        rezultat.set(brojJedan);
    }

    public void btn3(ActionEvent actionEvent) {
        brojJedan+="3";
        rezultat.set(brojJedan);
    }

    public void btn4(ActionEvent actionEvent) {
        brojJedan+="4";
        rezultat.set(brojJedan);
    }

    public void btn5(ActionEvent actionEvent) {
        brojJedan+="5";
        rezultat.set(brojJedan);
    }

    public void btn6(ActionEvent actionEvent) {
        brojJedan+="6";
        rezultat.set(brojJedan);
    }

    public void btn7(ActionEvent actionEvent) {
        brojJedan+="7";
        rezultat.set(brojJedan);
    }

    public void btn8(ActionEvent actionEvent) {
        brojJedan+="8";
        rezultat.set(brojJedan);
    }

    public void btn9(ActionEvent actionEvent) {
        brojJedan+="9";
        rezultat.set(brojJedan);
    }

    public void btn0(ActionEvent actionEvent) {
        if (!brojJedan.equals("")) {
            brojJedan += "0";
            rezultat.set(brojJedan);
        }
    }

    public void dotBtn(ActionEvent actionEvent) {
        brojJedan=brojJedan+".";
        rezultat.set(brojJedan);
    }

    public void plusBtn(ActionEvent actionEvent) {
        brojDva=getRezultat();
        brojJedan="";
        operacija="+";
    }

    public void minusBtn(ActionEvent actionEvent) {
        brojDva=getRezultat();
        brojJedan="";
        operacija="-";
    }

    public void multiplyBtn(ActionEvent actionEvent) {
        brojDva=getRezultat();
        brojJedan="";
        operacija="*";
    }

    public void divideBtn(ActionEvent actionEvent) {
        brojDva=getRezultat();
        brojJedan="";
        operacija="/";
    }

    public void modulBtn(ActionEvent actionEvent) {
        brojDva=getRezultat();
        brojJedan="";
        operacija="%";
    }

    public void equals(ActionEvent actionEvent) {
        if (operacija.equals("+")) {
            rezultat.set(Double.toString(Double.parseDouble(brojDva) + Double.parseDouble(brojJedan)));
        }
        else if (operacija.equals("-")) {
            rezultat.set(Double.toString(Double.parseDouble(brojDva) - Double.parseDouble(brojJedan)));
        }
        else if (operacija.equals("*")) {
            rezultat.set(Double.toString(Double.parseDouble(brojDva) * Double.parseDouble(brojJedan)));
        }
        else if (operacija.equals("/")) {
            rezultat.set(Double.toString(Double.parseDouble(brojDva) / Double.parseDouble(brojJedan)));
        }
        else if (operacija.equals("%")) {
            rezultat.set(Double.toString(Double.parseDouble(brojDva) % Double.parseDouble(brojJedan)));
        }
        operacija="=";
        brojJedan="";
        brojDva="";
    }




}