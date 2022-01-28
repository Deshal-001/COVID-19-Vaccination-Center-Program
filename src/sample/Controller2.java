package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Date;

public class Controller2 {
    @FXML
    Label mylbl2;

    @FXML
    Label fnlbl;
    @FXML
    Label lnlbl;
    @FXML
    Label citylbl;
    @FXML
    Label niclbl;
    @FXML
    Label vaclbl;

    @FXML
    Label datelbl;

    @FXML
    Label agelbl;

    @FXML
    Label boothlbl;


    public void displayName(String username,String lastname, String myage, String mycity,String mynic,String myvac,String booth) {

        Date date=new Date();

        fnlbl.setText(username);
        lnlbl.setText(lastname);
        agelbl.setText(String.valueOf(myage));
        niclbl.setText(mynic);
        citylbl.setText(mycity);
        vaclbl.setText(myvac);
        boothlbl.setText(booth);

        datelbl.setText(String.valueOf(date));


    }

    @FXML
    public void firstpage(ActionEvent actionEvent) throws Exception{
        Stage newstage=new Stage();
        newstage.setTitle("First Page");
        Parent root= FXMLLoader.load(getClass().getResource("details.fxml"));
        newstage.setScene(new Scene(root, 862, 495));
        newstage.show();}
}
