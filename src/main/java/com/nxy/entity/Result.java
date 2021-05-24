package com.nxy.entity;

import java.io.Serializable;

/**
 * result
 * @author 
 */
public class Result implements Serializable {
    private String stuno;

    private String subjectname;

    private Integer score;

    private Integer age;

    private static final long serialVersionUID = 1L;

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Result other = (Result) that;
        return (this.getStuno() == null ? other.getStuno() == null : this.getStuno().equals(other.getStuno()))
            && (this.getSubjectname() == null ? other.getSubjectname() == null : this.getSubjectname().equals(other.getSubjectname()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStuno() == null) ? 0 : getStuno().hashCode());
        result = prime * result + ((getSubjectname() == null) ? 0 : getSubjectname().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuno=").append(stuno);
        sb.append(", subjectname=").append(subjectname);
        sb.append(", score=").append(score);
        sb.append(", age=").append(age);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}