import java.util.List;

public class ResearchPaper {
   String link;
   String title;
   String abstr;
   List<String> authors;
   String conference;
   String doi;

  public ResearchPaper(String link, String title, String abstr, List<String> authors, String conference, String doi){
        this.link = link;
        this.title = title;
        this.abstr = abstr;
        this.authors = authors;
        this.conference = conference;
        this.doi = doi;

   } 
  
}
