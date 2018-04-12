package com.greenfoxacademy.redditclone.models;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Component
@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String url;
  private int voteCount;
  private LocalDate publishDate;

  public Post() {
    voteCount = 0;
    publishDate = LocalDate.now();
  }

  public Post(String title) {
    this();
    this.title = title;
  }

  public Post(String title, String url) {
    this(title);
    this.url = url;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getUrl() {
    return url;
  }

  public int getVoteCount() {
    return voteCount;
  }

  public LocalDate getPublishDate() {
    return publishDate;
  }

  public void setVoteCount(int voteCount) {
    this.voteCount = voteCount;
  }
}
