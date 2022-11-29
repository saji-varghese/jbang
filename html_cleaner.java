///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.jsoup:jsoup:1.14.3


import org.jsoup.Jsoup;

public class html_cleaner {
    public static  void main(String [] arg) {
        String html = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n"
            + "        \"http://www.w3.org/TR/html4/loose.dtd\">\n"
            + "<html>\n"
            + "<head>\n"
            + "    <title>This is the page title</title>\n"
            + "</head>\n"
            + "<script>\n"
            + "    // some interesting script functions\n"
            + "</script>\n"
            + "<body>\n"
            + "    <p>\n"
            + "        If the application X doesn't start, the possible causes could be:<br/>\n"
            + "        1. <a\n"
            + "            id=\"link\"\n"
            + "            href=\"http://maven.apache.org/\">\n"
            + "            Maven\n"
            + "            </a> is not installed.<br/>\n"
            + "        2. Not enough (<1G) disk space.<br/>\n"
            + "        3. Not enough (<64MB) memory.<br/>\n"
            + "    </p>\n"
            + "</body>\n"
            + "</html>\n";

        System.out.println(Jsoup.parse(html).text());
        
    }

    
}
