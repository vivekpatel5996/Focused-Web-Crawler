/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler.codeforces;

import crawler.Crawler;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Dhaval
 */
public class CodeForcesCrawler implements Crawler
{

    @Override
    public void crawl()
    {
	try
	{
	    Document doc = Jsoup.connect("http://www.codeforces.com/contests").get();
	}
	catch (IOException e)
	{
	}
    }
}
