import java.util.List;

public class ResearchPaper {
   String link;
   String title;
   String abstract;
   List<String> authors;
   String conference;
   String doi;

  public ResearchPaper(String link, String title, String abstract, List<String> authors, String conference, String doi){
        this.link = link
        this.title = title;
        this.abstract = abstract;
        this.authors = authors;
        this.conference = conference;
        this.doi = doi;

   } 
  
}
