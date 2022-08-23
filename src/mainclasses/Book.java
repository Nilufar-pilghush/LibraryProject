package mainclasses;

public class Book {
    private Integer id;
//    private Integer SN;

    private String name;
//    private String Genre;
    private String author;
    private Boolean Status;

    public Book(Integer id, String name, String author, Boolean status) {
        this.id = id;
        this.name = name;
        this.author = author;
        Status = status;
    }

    public Book() {
    }
    //    public Integer getSN() {
//        return SN;
//    }
//
//    public void setSN(Integer SN) {
//        this.SN = SN;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getTitle() {
//        return Title;
//    }
//
//    public void setTitle(String title) {
//        Title = title;
//    }
//
//    public String getGenre() {
//        return Genre;
//    }
//
//    public void setGenre(String genre) {
//        Genre = genre;
//    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

}
