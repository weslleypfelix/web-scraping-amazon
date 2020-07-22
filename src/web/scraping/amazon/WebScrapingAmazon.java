package web.scraping.amazon;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebScrapingAmazon {

    public static void main(String[] args) {
        
          try {
            Document docName = Jsoup.connect("https://www.amazon.com.br/s?k=Iphone&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&ref=nb_sb_noss_2").userAgent("\"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/84.0.4147.89 Safari/537.31\"").get();
            Elements tempName = docName.select("h2.a-size-mini.a-spacing-none.a-color-base.s-line-clamp-4");
            
            System.out.println();
            for(Element iphoneName: tempName){
                System.out.println(iphoneName.getElementsByTag("a").first().text() );
            }
            
              System.out.println();
              System.out.println();
              System.out.println();
              
              
              
            Document doc2 = Jsoup.connect("https://www.amazon.com.br/s?k=Iphone&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&ref=nb_sb_noss_2").userAgent("\"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/84.0.4147.89 Safari/537.31\"").get();
            Elements temp2 = doc2.select("span:nth-of-type(2) > .a-price-whole");
           
               for(Element iphonePrice: temp2){
                System.out.println(iphonePrice.getElementsByTag("span").first().text() );
            }
        
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
