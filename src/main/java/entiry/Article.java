package entiry;

import java.util.Date;

public class Article {

    private int id;
    private String title;
    private String brif;
    private String content;
    private Date createDate;
    public boolean isPublished;
    private int user_id;



    //create default contructor :
    public Article()
    {

    }


    public Article(int id, String title, String brif, String content, Date createDate, boolean isPublished, int user_id) {
        this.id = id;
        this.title = title;
        this.brif = brif;
        this.content = content;
        this.createDate = createDate;
        this.isPublished = isPublished;
        this.user_id = user_id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrif() {
        return brif;
    }

    public void setBrif(String brif) {
        this.brif = brif;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
