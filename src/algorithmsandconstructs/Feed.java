/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author lucas
 */
public class Feed implements FeedInterface {
    
    
    
    ArrayList<FeedItem> items;
    
    public Feed(){
     
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(FeedItem item) {
    
        this.items.add(item);    
        
    }

    @Override
    public Collection<String> listTitles() {
    
        Collection<String> titles = new ArrayList<>();
        
        for (FeedItem i : items) {
            titles.add(i.getTitle());
        }
        
        return titles;
    
    }

    @Override
    public FeedItem getItem(String title) {
    
        for (FeedItem i : items) {
            if(i.getTitle().equalsIgnoreCase(title)){
                return i;
            }
        }
    return null;
    
    }

    @Override
    public int numItems() {
    
        return this.items.size();
    
    }

    @Override
    public Collection<FeedItem> findItems(String keyword) {
    
        Collection<FeedItem> foundItems = new ArrayList<>();
        
        keyword = keyword.toLowerCase();
        
        for (FeedItem i : items) {
            
            if(i.getTitle().toLowerCase().contains(keyword) || i.getContent().toLowerCase().contains(keyword)){
                
                foundItems.add(i);
                                
            }
        }
        
        
        return foundItems;
    
    }
    
}
