package Hashkart.Service;

import Hashkart.Model.Item;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Date;

@Service
public class ItemService {

    public ItemService(){
        System.out.println("**** Item Service ****");
    }

    public ArrayList<Item> getAllItems(){

        ArrayList<Item> items=new ArrayList<>();

        Item item1=new Item();
        item1.setTitle("Item 1");
        item1.setBody("Item 1 Body");
        item1.setDate(new Date());

        Item item2=new Item();
        item2.setTitle("Item 2");
        item2.setBody("Item 2 Body");
        item2.setDate(new Date());

        Item item3=new Item();
        item3.setTitle("Item 3");
        item3.setBody("Item 3 Body");
        item3.setDate(new Date());

        items.add(item1);
        items.add(item2);
        items.add(item3);

        return items;
    }

    public ArrayList<Item> getOneItem() {
        ArrayList<Item> posts = new ArrayList<>();

        Item item1 = new Item();
        item1.setTitle("This is your Post");
        item1.setBody("This is your Post. It has some valid content");
        item1.setDate(new Date());
        posts.add(item1);

        return posts;

    }

}
