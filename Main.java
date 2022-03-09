import java.io.File;
import java.util.ArrayList;
import Generate.GenerateAccueil;
import Generate.GenerateFicheEmploye;
import java.awt.*;
import Parsing.Parsing;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<String> listEmployes = Parsing.StaffParsing();
        
        for (int i = 0; i < listEmployes.size(); i++) {
            GenerateFicheEmploye.generateHtmlFileEmploye(listEmployes.get(i));
        }

        GenerateAccueil.generateHtmlFileAccueil();
        
        File htmlAccueilFile = new File("HTML/accueil.html");
        Desktop.getDesktop().browse(htmlAccueilFile.toURI());
    }
}