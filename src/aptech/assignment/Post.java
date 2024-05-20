package aptech.assignment;

public class Post {
    private long id;
    private String tittle;
    private String describe;
    private String avatar;
    private String content;
    private String nameOfAuthor;
    private String dateOfWriting;

    public Post() {
    }

    public Post(long id, String tittle, String describe, String avatar, String content, String nameOfAuthor, String dateOfWriting) {
        this.id = id;
        this.tittle = tittle;
        this.describe = describe;
        this.avatar = avatar;
        this.content = content;
        this.nameOfAuthor = nameOfAuthor;
        this.dateOfWriting = dateOfWriting;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public String getDateOfWriting() {
        return dateOfWriting;
    }

    public void setDateOfWriting(String dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }
}
