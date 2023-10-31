import java.util.ArrayList;
import java.util.Date;


class Comment {
    private User user;
    private String userInput;
    private Date date;
    private ArrayList<Comment> replies;

    public Comment(User user, String userInput) {
        this.user = user;
        this.userInput = userInput;
        this.date = new Date();
        this.replies = new ArrayList<>();
    }

    public Comment(User user, String userInput, Date date, ArrayList<Comment> replies) {
        this.user = user;
        this.userInput = userInput;
        this.date = date;
        this.replies = replies;
    }

    public User getUser() {
        return user;
    }

    public String getUserInput() {
        return userInput;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Comment> getReplies() {
        return replies;
    }

    public void addReply(Comment reply) {
        replies.add(reply);
    }

    public String toString() {
        return "User: " + user.getUsername() +
               "\nComment: " + userInput +
               "\nDate: " + date +
               (replies != null && !replies.isEmpty() ? "\nReplies: " + replies.toString() : "");
    }
}
