package com.automationpractiveframework.tasks;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import com.automationpractiveframework.tasks.*;

public class taskforSergey {



    public static void main(String[] args) {
        DataValues.LOGIN_PATH;
        DataValues str = DataValues.LOGIN_PATH;
        try {
            String url = "https://rutracker.org/forum/login.php";
            Connection.Response response = Jsoup.connect(url)
                    .method(Connection.Method.GET)
                    .execute();
            response = Jsoup.connect(url)
                    .data("login_username", "login")
                    .data("login_password", "password")
                    .data("login", "")
                    .cookies(response.cookies())
                    .method(Connection.Method.POST)
                    .execute();
            Document doc = Jsoup.connect("https://rutracker.org/forum/index.php").cookies(response.cookies()).get();
            System.out.println(doc.outerHtml().contains("Профиль"));
        }catch(Exception e){e.printStackTrace();}


    }
    public static Document connectToPage(DataValues.){

        try {

            Connection.Response response = Jsoup.connect(loginURL)
                    .method(Connection.Method.GET)
                    .execute();

            response = Jsoup.connect(loginURL)
                    .data(loginPath, login)
                    .data(passPath, password)
                    .data("login", "")
                    .cookies(response.cookies())
                    .method(Connection.Method.POST)
                    .execute();
            Document doc = Jsoup.connect(indexPage).cookies(response.cookies()).get();
            System.out.println(doc.outerHtml().contains(elementForAutoUser));
            return doc;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}