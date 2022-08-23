package mainclasses;

import java.time.LocalDate;

public class Borrow {
    public int getus;
    private LocalDate createDate;

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    private Integer id;
    private Integer bookId;
    private Integer memberId ;
    private Integer userId ;
    private  Status status;

    public Borrow(){

    }

    public Borrow(LocalDate createDate, Integer id, Integer bookId, Integer userId, Status status) {
        this.createDate = createDate;
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
        this.status = status;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
