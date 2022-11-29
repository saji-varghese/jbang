///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.jsoup:jsoup:1.14.3


import org.jsoup.Jsoup;

public class html_cleaner {
    public static  void main(String [] arg) {
        String html = "Hello <br /> World!";

        System.out.println(Jsoup.parse(html).text());
        
    }

    
}
