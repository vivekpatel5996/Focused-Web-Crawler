/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focused.web.crawler;

import java.io.IOException;
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
	boolean connected;
	try
	{
	    connected = TorConncetor.connect();
	    System.err.println(connected);
	}
	catch (IOException ex)
	{
	    Logger.getLogger(FocusedWebCrawler.class.getName()).log(Level.SEVERE, "Could not conntect to tor", ex);
	}

    }
}
