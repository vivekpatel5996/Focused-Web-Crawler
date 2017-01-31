/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focused.web.crawler.codeforces;

import focused.web.crawler.Crawler;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Dhaval
 */
public class CodeForcesCrawler implements Crawler
{

    /**
     *
     * @throws IOException
     */
    @Override
    public void crawl() throws IOException
    {
	Document doc = Jsoup.connect("http://www.codeforces.com/contests").get();
	String title = doc.title();
	System.out.println("title is: " + title);
	Element body = doc.getElementById("body");
	String t = body.text();
	System.out.println(t);
    }

}
