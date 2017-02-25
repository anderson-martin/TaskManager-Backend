package service.exchange.msg;

import objectModels.basicViews.GroupBasicView;
import objectModels.basicViews.UserBasicView;
import objectModels.msg.TMSIssue;

/**
 * Created by rohan on 2/25/17.
 */
public class IssueView {
    private long id;
    private String title;
    private String description;
    private TMSIssue.STATUS status;

    private UserBasicView sender;
    private GroupBasicView senderGroup;
    private GroupBasicView recipientGroup;

    public IssueView(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TMSIssue.STATUS getStatus() {
        return status;
    }

    public void setStatus(TMSIssue.STATUS status) {
        this.status = status;
    }

    public UserBasicView getSender() {
        return sender;
    }

    public void setSender(UserBasicView sender) {
        this.sender = sender;
    }

    public GroupBasicView getSenderGroup() {
        return senderGroup;
    }

    public void setSenderGroup(GroupBasicView senderGroup) {
        this.senderGroup = senderGroup;
    }

    public GroupBasicView getRecipientGroup() {
        return recipientGroup;
    }

    public void setRecipientGroup(GroupBasicView recipientGroup) {
        this.recipientGroup = recipientGroup;
    }
}