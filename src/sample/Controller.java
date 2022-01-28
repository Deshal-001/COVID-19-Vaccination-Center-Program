package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller {


    private Stage stage;
    private Scene scene;
    private Parent root;






    public void secondpage(ActionEvent actionEvent) throws Exception{
        Stage newstage1=((Stage) ((Node)actionEvent.getSource()).getScene().getWindow());
        newstage1.setTitle(" Detail & Receipt");
        Parent root=FXMLLoader.load(getClass().getResource("details.fxml"));
        newstage1.setScene(new Scene(root, 862, 495));
        newstage1.show();


        //close previous tab

        Stage previous=(Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        // previous.close();






    }
    @FXML
     TextField fname;
    @FXML
    TextField lname;
    @FXML
    TextField age;
    @FXML
    TextField city;
    @FXML
    TextField nic;
    @FXML
    TextField vac;


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
    Label boothlbl;

    @FXML
    Label mylable;

    @FXML
    Label agelbl;

    @FXML
    Label datelbl;

    @FXML
    RadioButton zero,one,two,three,four,five;








   private  String firstname;
    private String lastname;
    private  String myage;
    private String mycity;
    private String mynic;
    private String myvac;









    public  void  save(ActionEvent actionEvent) throws Exception {

        Date date=new Date();

        this.firstname=fname.getText();
        this.lastname=lname.getText();
        this.myage=age.getText();
        this.mycity=city.getText();
        this.mynic=nic.getText();
        this.myvac=vac.getText();
        //this.mybooth=booth.getText();







        fnlbl.setText("First Name :"+firstname);
        lnlbl.setText("last Name :"+lastname);
        agelbl.setText(String.valueOf("Age    :"+myage));
        niclbl.setText("NIC or Pass. No :"+mynic);
        citylbl.setText("City   :"+mycity);
        vaclbl.setText("Vaccine Type :"+myvac);
       // boothlbl.setText(mybooth);

        if (zero.isSelected()){
            boothlbl.setText("Booth : 0");
        }
        else if (one.isSelected()){
            boothlbl.setText("Booth : 1");

        }
        else if (two.isSelected()){
            boothlbl.setText("Booth : 2");

        }
        else if (three.isSelected()){
            boothlbl.setText("Booth : 3");

        }
        else if (four.isSelected()){
            boothlbl.setText("Booth : 4");

        }
        else if (five.isSelected()){
            boothlbl.setText("Booth : 5");
        }
        else {
            boothlbl.setText("No Data ");
        }




        datelbl.setText(String.valueOf(date));


        System.out.println(date);









    }

    @FXML
    public void receipt(ActionEvent actionEvent) throws Exception{
        Stage newstage=new Stage();
        newstage.setTitle("First Page");
        Parent root= FXMLLoader.load(getClass().getResource("Receipt.fxml"));
        newstage.setScene(new Scene(root, 300, 275));
        newstage.show();
    }



    public void login(ActionEvent event) throws IOException {

        String username = fname.getText();
        String lastname=lname.getText();
        String myage=age.getText();
        String mycity=city.getText();
        String mynic=nic.getText();
        String myvac=vac.getText();
        String booth=boothlbl.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Receipt.fxml"));
        root = loader.load();

        Controller2 scene2Controller = loader.getController();
        scene2Controller.displayName (username,lastname,myage,mycity,mynic,myvac,booth);



        Stage newstage=new Stage();
        newstage.setTitle("Receipt");
        newstage.setScene(new Scene(root, 426, 485));
        newstage.show();







    }
























}
