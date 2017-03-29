package com.ws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class UserModel
{
   private String userId;
   private String id;
   private String title;
   private String body;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}


 @Override
 public String toString()
 {
     return "UserModel [userId=" + this.userId + ", id=" + this.id + ", body=" + this.body + ", title=" + this.title + "]";
 }

}