package com.vkonex.onlyxml;

public class FAQ {
    private String que, description;
    private boolean expandable;

    public FAQ(String que, String description) {
        this.que = que;
        this.description = description;
        this.expandable=false;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //toString method

    @Override
    public String toString() {
        return "FAQ{" +
                "que='" + que + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
