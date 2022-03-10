package Generate;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import Parsing.Parsing;

public class GenerateAccueil {

    public static void generateHtmlFileAccueil() throws Exception {

        List<String> listEmployes = Parsing.StaffParsing();

        // HTML
        File htmlSortant = new File("HTML/accueil.html");

        htmlSortant.getParentFile().mkdirs();

        FileWriter htmlWriter = new FileWriter(htmlSortant);

        System.out.println("Fichier écrit : " + htmlSortant.getAbsolutePath());

        htmlWriter.write("<html>");
        htmlWriter.write("\n");
        htmlWriter.write("<head>");
        htmlWriter.write("\n");
        htmlWriter.write("<title>Go Secury | Accueil gestion des agents");
        htmlWriter.write("</title>");
        htmlWriter.write("\n");
        htmlWriter.write("<link rel='icon' href='../assets/icon.png' type='image/x-icon'>");
        htmlWriter.write("\n");
        htmlWriter.write("<link href='../CSS/style.css' rel='stylesheet'>");
        htmlWriter.write("\n");
        htmlWriter.write("<link rel='preconnect' href='https://fonts.googleapis.com'>");
        htmlWriter.write("\n");
        htmlWriter.write("<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>");
        htmlWriter.write("\n");
        htmlWriter.write("<link href='https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap' rel='stylesheet'>");
        htmlWriter.write("\n");
        htmlWriter.write("</head>");
        htmlWriter.write("\n");
        htmlWriter.write("<body>");
        htmlWriter.write("\n");
        htmlWriter.write("<ul>");
        htmlWriter.write("\n");
        htmlWriter.write("<li><img src='../assets/logo.png' alt='Logo'></li>");
        htmlWriter.write("\n");
        htmlWriter.write("</ul>");
        htmlWriter.write("\n");
        htmlWriter.write("<div class='Entete'>");
        htmlWriter.write("\n");
        htmlWriter.write("<img src='../assets/logo.png' alt='Logo'>");
        htmlWriter.write("\n");
        htmlWriter.write("<h1>Portail de gestion des agents");
        htmlWriter.write("</h1>");
        htmlWriter.write("\n");
        htmlWriter.write("<h1>Accueil");
        htmlWriter.write("</h1>");
        htmlWriter.write("\n");
        htmlWriter.write("</div>");
        htmlWriter.write("\n");
        htmlWriter.write("<div class='listeEmployes'>");
        htmlWriter.write("\n");

        for(int i = 0; i < listEmployes.size(); i++){
            List<String> listAgent = Parsing.personalParsing(listEmployes.get(i));
            htmlWriter.write("<a href='fiche_employe_" + listEmployes.get(i) + ".html' class='texte'>" + listAgent.get(1) + " " + listAgent.get(0) + "</a></br></br>");
            htmlWriter.write("\n");
        }

        htmlWriter.write("</div>");
        htmlWriter.write("\n");
        htmlWriter.write("</body>");
        htmlWriter.write("\n");
        htmlWriter.write("</html>");

        htmlWriter.close();


        // CSS
        File cssSortant = new File("CSS/style.css");

        cssSortant.getParentFile().mkdirs();

        FileWriter cssWriter = new FileWriter(cssSortant);

        System.out.println("Fichier écrit : " + cssSortant.getAbsolutePath());

        cssWriter.write("* {");
        cssWriter.write("\n");
        cssWriter.write("font-family: 'Roboto', sans-serif;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write(".Entete {");
        cssWriter.write("\n");
        cssWriter.write("text-align: center;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write("h1 {");
        cssWriter.write("\n");
        cssWriter.write("font-weight: lighter;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write("h3 {");
        cssWriter.write("\n");
        cssWriter.write("font-weight: lighter;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write("a {");
        cssWriter.write("\n");
        cssWriter.write("font-weight: lighter;");
        cssWriter.write("\n");
        cssWriter.write("color: black;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write("a:hover {");
        cssWriter.write("\n");
        cssWriter.write("color: #659224;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write(".listeEmployes {");
        cssWriter.write("\n");
        cssWriter.write("text-align: center;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write("ul {");
        cssWriter.write("\n");
        cssWriter.write("background-color: #379EC1;");
        cssWriter.write("\n");
        cssWriter.write("position: fixed;");
        cssWriter.write("\n");
        cssWriter.write("top: 0;");
        cssWriter.write("\n");
        cssWriter.write("left: 0;");
        cssWriter.write("\n");
        cssWriter.write("width: 100%;");
        cssWriter.write("\n");
        cssWriter.write("display: flex;");
        cssWriter.write("\n");
        cssWriter.write("margin-top: 0;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write("li {");
        cssWriter.write("\n");
        cssWriter.write("display: flex;");
        cssWriter.write("\n");
        cssWriter.write("align-items: center;");
        cssWriter.write("\n");
        cssWriter.write("padding-left: 2rem;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write(".accueil {");
        cssWriter.write("\n");
        cssWriter.write("text-decoration: none;");
        cssWriter.write("\n");
        cssWriter.write("font-size: 30px;");
        cssWriter.write("\n");
        cssWriter.write("top: 3rem;");
        cssWriter.write("\n");
        cssWriter.write("position: absolute;");
        cssWriter.write("\n");
        cssWriter.write("border: solid 2px #379EC1;");
        cssWriter.write("\n");
        cssWriter.write("box-shadow: 1px 1px 1px 1px #659224;");
        cssWriter.write("\n");
        cssWriter.write("border-radius: 10px;");
        cssWriter.write("\n");
        cssWriter.write("padding: 0.3rem;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write(".texte {");
        cssWriter.write("\n");
        cssWriter.write("font-size: 25px;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write(".liste {");
        cssWriter.write("\n");
        cssWriter.write("margin: 0;");
        cssWriter.write("\n");
        cssWriter.write("}");
        cssWriter.write("\n");
        cssWriter.write(".checkbox {");
        cssWriter.write("\n");
        cssWriter.write("color: #379EC1;");
        cssWriter.write("\n");
        cssWriter.write("}");

        cssWriter.close();
    }
}