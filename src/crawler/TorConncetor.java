/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Dhaval
 */
public class TorConncetor
{

    public static boolean connect() throws IOException
    {
	System.setProperty("socksProxyHost", "127.0.0.1");
	System.setProperty("socksProxyPort", "9150");

	Document doc = Jsoup.connect("https://check.torproject.org/?lang=en_US").get();
	Element contentDiv = doc.getElementsByClass("content").first();
	String response = contentDiv.getElementsByTag("h1").first().text();

	switch (response)
	{
	    case "Congratulations. This browser is configured to use Tor.":
		return true;
	    case "Sorry. You are not using Tor.":
		throw new RuntimeException("Sorry. You are not using Tor.");
	    default:
		throw new RuntimeException("Auto torrent connection detection failed.");
	}
    }
}
