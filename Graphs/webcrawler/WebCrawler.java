package webcrawler;
import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.net.*;

public class WebCrawler{

    private ArrayDeque<String> queue;
    private List<String> dicoveredWebsiteList;


    public WebCrawler(){
        this.queue = new ArrayDeque();
        this.dicoveredWebsiteList = new ArrayList<>();
    } 

    public void discoverWeb(String root){

        this.queue.add(root);
        this.dicoveredWebsiteList.add(root);

        while( !queue.isEmpty()){

            String website = this.queue.remove();

            String rawHtml = readUrl(website);

            String regexp = "http[s]*://([a-zA-Z0-9-_?=&]+\\.*/*)*";
            Pattern pattern = Pattern.compile(regexp);

            Matcher matcher = pattern.matcher(rawHtml);

            while(matcher.find()){
                
                String actualUrl = matcher.group();
                if(!this.dicoveredWebsiteList.contains(actualUrl)){
                    this.dicoveredWebsiteList.add(actualUrl);
                    System.out.println("Website has been found with url: "+actualUrl);
                    this.queue.add(actualUrl);
                }
            }
        }
    }

    private String readUrl(String website){
        String rawHtml = "";

        try{
            URL url = new URL(website);

            BufferedReader in = 
                new BufferedReader
                    (new InputStreamReader(url.openStream()));

            String inputLine = "";

            while((inputLine = in.readLine()) !=null ){
                rawHtml += inputLine;
            }
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rawHtml;
    }
}