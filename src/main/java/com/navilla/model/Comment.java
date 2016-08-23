package com.navilla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by mramos on 8/23/2016.
 */
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long parent;
    private Date created;
    private Date modified;
    private String content;
    private String fullname;
    private String profilePictureUrl;
    private Boolean createdByAdmin;
    private Boolean createdByCurrentUser;
    private Long upvoteCount;
    private Boolean userHasUpvoted;

    public Comment(Long id, Long parent, Date created, Date modified, String content, String fullname, String profilePictureUrl, Boolean createdByAdmin, Boolean createdByCurrentUser, Long upvoteCount, Boolean userHasUpvoted) {
        this.id = id;
        this.parent = parent;
        this.created = created;
        this.modified = modified;
        this.content = content;
        this.fullname = fullname;
        this.profilePictureUrl = profilePictureUrl;
        this.createdByAdmin = createdByAdmin;
        this.createdByCurrentUser = createdByCurrentUser;
        this.upvoteCount = upvoteCount;
        this.userHasUpvoted = userHasUpvoted;
    }

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public Boolean getCreatedByAdmin() {
        return createdByAdmin;
    }

    public void setCreatedByAdmin(Boolean createdByAdmin) {
        this.createdByAdmin = createdByAdmin;
    }

    public Boolean getCreatedByCurrentUser() {
        return createdByCurrentUser;
    }

    public void setCreatedByCurrentUser(Boolean createdByCurrentUser) {
        this.createdByCurrentUser = createdByCurrentUser;
    }

    public Long getUpvoteCount() {
        return upvoteCount;
    }

    public void setUpvoteCount(Long upvoteCount) {
        this.upvoteCount = upvoteCount;
    }

    public Boolean getUserHasUpvoted() {
        return userHasUpvoted;
    }

    public void setUserHasUpvoted(Boolean userHasUpvoted) {
        this.userHasUpvoted = userHasUpvoted;
    }
}
