package com.ws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumModel
{
   private String userId;
   private String id;
   private String title;
  
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


 @Override
 public String toString()
 {
     return "AlbumModel [userId=" + this.userId + ", id=" + this.id + ",title=" + this.title + "]";
 }

}