/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler;

import crawler.codeforces.CodeForcesCrawler;
import crawler.hackerEarth.HackerEarthCrawler;
import crawler.topcoder.TopcoderCrawler;
import hibernate.HibernateUtil;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dhaval
 */
public class FocusedWebCrawler
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
	Logger logger = Logger.getLogger(FocusedWebCrawler.class.getName());

	try
	{
	    TorConncetor.connect();
	    logger.log(Level.INFO, "Connected with Tor.");
	}
	catch (IOException ex)
	{
	    logger.log(Level.SEVERE, "Could not connect with Tor. Crawling Aborted", ex);
	    System.exit(1);
	}
	Crawler crawler = null;

	System.out.println("Please enter platform name.(Codeforces/Topcoder/HackerEarth)");
	do
	{
	    Scanner sc = new Scanner(System.in);
	    String platform = sc.next();

	    if (platform.equalsIgnoreCase("codeforces"))
	    {
		crawler = new CodeForcesCrawler();
	    }
	    else if (platform.equalsIgnoreCase("topcoder"))
	    {
		crawler = new TopcoderCrawler();
	    }
	    else if (platform.equalsIgnoreCase("HackerEarth"))
	    {
		crawler = new HackerEarthCrawler();
	    }
	    else
	    {
		System.out.println("please enter valid option");
	    }
	}
	while (crawler == null);

	crawler.crawl();

	HibernateUtil.close();
    }
}
