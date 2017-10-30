package webcrawler;

public class App{
    public static void main(String args[]){
        WebCrawler crawl = new WebCrawler();
        String rootUrl = "https://ajaythorve.co.in/";
        crawl.discoverWeb(rootUrl);
    }
}