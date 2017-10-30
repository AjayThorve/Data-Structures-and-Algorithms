package webcrawler;
import java.util.*;

public class App{
    public static void main(String args[]){
        WebCrawler crawl = new WebCrawler();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter url to crawl for links: ");
        
        String rootUrl = sc.nextLine();
        crawl.discoverWeb(rootUrl);
    }
}