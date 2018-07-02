package com.domain.model;

import java.util.Date;

public class TvShows {

    private String name;

    private Integer jishu;
    private Date showDate;

    public TvShows() {
    }

    public TvShows(String name, Integer jishu, Date showDate) {
        this.name = name;
        this.jishu = jishu;
        this.showDate = showDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJishu() {
        return jishu;
    }

    public void setJishu(Integer jishu) {
        this.jishu = jishu;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }
}
