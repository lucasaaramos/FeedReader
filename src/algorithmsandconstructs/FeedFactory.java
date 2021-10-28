/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class FeedFactory implements FeedFactoryInterface {

    @Override
    public FeedInterface createFeed(BufferedReader in) throws IOException {
        
        FeedInterface feed = new Feed();
        
        String title = in.readLine();
        String content = "";
                
        while(title != null) {
            
            content = in.readLine();
            
            FeedItem item = new FeedItem(title, content);
            feed.addItem(item);
            
            title = in.readLine();
            
        }        
        
        return feed;
        
        
    }
    
}
