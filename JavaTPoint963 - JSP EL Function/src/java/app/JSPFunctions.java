package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JSPFunctions {

  private static String hostUrl = "";
  private static String fullDrawingURL="";
  public static void setHostUrl(String hostUrl) {
    JSPFunctions.hostUrl = hostUrl;
    
  }

  public static String drawCircle(int xPos, int yPos, int radius, String color) {
      fullDrawingURL=readURL("svgCircle.jsp", "xPos=" + String.valueOf(xPos)
            + "&yPos=" + String.valueOf(yPos)
            + "&radius=" + String.valueOf(radius) + "&color=" + color);
      return fullDrawingURL;
  }

  private static String readURL(String file, String params) {
    URL url = null;;
    BufferedReader reader = null;
    StringBuilder stringBuilder = new StringBuilder();
    try {
      url = new URL(hostUrl + file + "?" + params);
      reader = new BufferedReader(new InputStreamReader(url.openStream()));
      String line = null;
      String ls = System.getProperty("line.separator");
      while ((line = reader.readLine()) != null) {
        stringBuilder.append(line);
        stringBuilder.append(ls);
      }
      reader.close();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(JSPFunctions.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MalformedURLException ex) {
      Logger.getLogger(JSPFunctions.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(JSPFunctions.class.getName()).log(Level.SEVERE, null, ex);
    } 
    return stringBuilder.toString();
  }

  public static String printFullDrawingURL(){
     fullDrawingURL= fullDrawingURL.replaceAll("svg", "");
      return fullDrawingURL;
  }
}
