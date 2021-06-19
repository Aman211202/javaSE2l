package lesson7.task1;

import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
    private String userName;
    private String messageText;
    private Date sentData;

    public MessageData() {
    }

    public MessageData(String userName, String messageText, Date sentData) {
        this.userName = userName;
        this.messageText = messageText;
        this.sentData = sentData;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Date getSentData() {
        return sentData;
    }

    public void setSentData(Date sentData) {
        this.sentData = sentData;
    }
    public String toString(){
        return messageText + "From " + " " + userName + "at " + sentData.toString();
    }
}
