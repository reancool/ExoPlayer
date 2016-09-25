package com.example.myplayer.bean;

import java.util.List;

/**
 * Created by jack on 16/6/16.
 */
public class SubtitleBean {

    /**
     * number : ﻿1
     * stopTime : 00:00:06,340
     * startTime : 00:00:03,280
     * text : 第一课　接吻二三事
     */

    private List<SubtitlesBean> subtitles;

    public List<SubtitlesBean> getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(List<SubtitlesBean> subtitles) {
        this.subtitles = subtitles;
    }

    public static class SubtitlesBean {
        private String number;
        private String stopTime;
        private String startTime;
        private String text;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getStopTime() {
            return stopTime;
        }

        public void setStopTime(String stopTime) {
            this.stopTime = stopTime;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
