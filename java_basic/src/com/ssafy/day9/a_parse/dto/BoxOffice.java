package com.ssafy.day9.a_parse.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//내가 설정한 값들만 읽어오고 나머지는 무시해라
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoxOffice {
    private Integer rank; // 등수
    private String movieNm; // 영화제목
    private Date openDt; // 개봉일
    private Integer audiAcc;// 누적 관객 수

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getMovieNm() {
        return movieNm;
    }

    public void setMovieNm(String movieNm) {
        this.movieNm = movieNm;
    }

    public Date getOpenDt() {
        return openDt;
    }

    public void setOpenDt(Date openDt) {
        this.openDt = openDt;
    }

    public Integer getAudiAcc() {
        return audiAcc;
    }

    public void setAudiAcc(Integer audiAcc) {
        this.audiAcc = audiAcc;
    }

    public Date toDate(String date) {
        Date dateObj = null;
        // TODO: 문자열 형태의 날짜를 Date로 변환해서 반환하시오.
        // SimpleDate Format : date <-> String 
        SimpleDateFormat format = new SimpleDateFormat("");
        try {
			dateObj = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			dateObj = new Date();
		}
        return dateObj;
    }

    @Override
    public String toString() {
        return "[rank=" + rank + ", movieNm=" + movieNm + ", openDt=" + openDt + ", audiAcc="
                + audiAcc + "]";
    }
}
