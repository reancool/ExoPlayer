package com.example.myplayer.bean;

import java.util.List;

/**
 * Created by jack on 16/5/16.
 */
public class DetailsBean {

    /**
     * id : 1
     * title : Something about Kiss
     * introduction : You will learn the kissing culture, kisses in different countries, as well as basic kissing skills in social life. It is an interesting lesson that you will know a lot about kissing knowledge that you won't be told in school.
     * premium : true
     * isLockedToUser : false
     * thumb : http://assets.dev.showmuse.so/lesson/1/kiss_1.jpg
     * viewsTotal : 465
     * likesTotal : 25
     * commentsTotal : 0
     * commentsThreadId : babg0U
     * videoType : mp4
     * videoSource : sm
     * videoUrl : http://api.dev.showmuse.so/v2/watch/babg0U?access_token=NjJjOGE4ZjU4MmNlODMxZTgwYzMxODNmMjA0NDNjYWQxNjdmZjlmODAwMzM4ZTY3ZDRjNzVmNzYxMGVmZGZkYQ
     * videoDuration : 388.032
     * videoDurationTime : 06:28
     * shareUrl : http://web.dev.showmuse.so/s/l/babg0U?ref=32902
     * teacher : {"id":1,"name":"Jessica C","avatar":"http://assets.dev.showmuse.so/teacher/1.png"}
     * relatedCourses : [{"id":153,"title":"What to do if I was claimed \u201cNot Romantic?\u201d?"},{"id":154,"title":"Love between us is fading , what should I do?"},{"id":158,"title":"Girlfriend would not \u201cSatisfied\u201d, what do I do?"},{"id":164,"title":"Make some Love tonight!"}]
     * relatedProducts : []
     * videoQuestions : [{"url":"http://assets.dev.showmuse.so/lesson_question/1_20140818111800.html","time":215},{"url":"http://assets.dev.showmuse.so/lesson_question/1_20140818112100.html","time":250}]
     * isLikedByUser : false
     * userWatchStat : {"bookmarks":[],"playPosition":0,"watchProgress":0}
     * subtitle : http://assets.dev.showmuse.so/lesson/1/zh.srt
     */

    private int id;
    private String title;
    private String introduction;
    private boolean premium;
    private boolean isLockedToUser;
    private String thumb;
    private int viewsTotal;
    private int likesTotal;
    private int commentsTotal;
    private String commentsThreadId;
    private String videoType;
    private String videoSource;
    private String videoUrl;
    private double videoDuration;
    private String videoDurationTime;
    private String shareUrl;

    public String getVideoContent() {
        return videoContent;
    }

    public void setVideoContent(String videoContent) {
        this.videoContent = videoContent;
    }

    private String videoContent;

    public String getShareImg() {
        return shareImg;
    }

    public void setShareImg(String shareImg) {
        this.shareImg = shareImg;
    }

    private String shareImg;
    /**
     * id : 1
     * name : Jessica C
     * avatar : http://assets.dev.showmuse.so/teacher/1.png
     */

    private TeacherBean teacher;
    private boolean isLikedByUser;
    /**
     * bookmarks : []
     * playPosition : 0
     * watchProgress : 0
     */

    private UserWatchStatBean userWatchStat;
    private String subtitle;
    /**
     * id : 153
     * title : What to do if I was claimed “Not Romantic?”?
     */

    private List<RelatedCoursesBean> relatedCourses;
    private List<RelatedProductsBean> relatedProducts;

    public List<RelatedMaterialsBean> getRelatedMaterials() {
        return relatedMaterials;
    }

    public void setRelatedMaterials(List<RelatedMaterialsBean> relatedMaterials) {
        this.relatedMaterials = relatedMaterials;
    }

    private List<RelatedMaterialsBean> relatedMaterials;
    /**
     * url : http://assets.dev.showmuse.so/lesson_question/1_20140818111800.html
     * time : 215
     */

    private List<VideoQuestionsBean> videoQuestions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isIsLockedToUser() {
        return isLockedToUser;
    }

    public void setIsLockedToUser(boolean isLockedToUser) {
        this.isLockedToUser = isLockedToUser;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public int getViewsTotal() {
        return viewsTotal;
    }

    public void setViewsTotal(int viewsTotal) {
        this.viewsTotal = viewsTotal;
    }

    public int getLikesTotal() {
        return likesTotal;
    }

    public void setLikesTotal(int likesTotal) {
        this.likesTotal = likesTotal;
    }

    public int getCommentsTotal() {
        return commentsTotal;
    }

    public void setCommentsTotal(int commentsTotal) {
        this.commentsTotal = commentsTotal;
    }

    public String getCommentsThreadId() {
        return commentsThreadId;
    }

    public void setCommentsThreadId(String commentsThreadId) {
        this.commentsThreadId = commentsThreadId;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoSource() {
        return videoSource;
    }

    public void setVideoSource(String videoSource) {
        this.videoSource = videoSource;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public String getVideoDurationTime() {
        return videoDurationTime;
    }

    public void setVideoDurationTime(String videoDurationTime) {
        this.videoDurationTime = videoDurationTime;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public TeacherBean getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherBean teacher) {
        this.teacher = teacher;
    }

    public boolean isIsLikedByUser() {
        return isLikedByUser;
    }

    public void setIsLikedByUser(boolean isLikedByUser) {
        this.isLikedByUser = isLikedByUser;
    }

    public UserWatchStatBean getUserWatchStat() {
        return userWatchStat;
    }

    public void setUserWatchStat(UserWatchStatBean userWatchStat) {
        this.userWatchStat = userWatchStat;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<RelatedCoursesBean> getRelatedCourses() {
        return relatedCourses;
    }

    public void setRelatedCourses(List<RelatedCoursesBean> relatedCourses) {
        this.relatedCourses = relatedCourses;
    }

    public List<RelatedProductsBean> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(List<RelatedProductsBean> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public List<VideoQuestionsBean> getVideoQuestions() {
        return videoQuestions;
    }

    public void setVideoQuestions(List<VideoQuestionsBean> videoQuestions) {
        this.videoQuestions = videoQuestions;
    }

    public static class TeacherBean {
        private int id;
        private String name;
        private String avatar;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }

    public static class UserWatchStatBean {
        private int playPosition;
        private int watchProgress;
        private List<?> bookmarks;

        public int getPlayPosition() {
            return playPosition;
        }

        public void setPlayPosition(int playPosition) {
            this.playPosition = playPosition;
        }

        public int getWatchProgress() {
            return watchProgress;
        }

        public void setWatchProgress(int watchProgress) {
            this.watchProgress = watchProgress;
        }

        public List<?> getBookmarks() {
            return bookmarks;
        }

        public void setBookmarks(List<?> bookmarks) {
            this.bookmarks = bookmarks;
        }
    }

    public static class RelatedCoursesBean {
        private int id;
        private String title;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class VideoQuestionsBean {
        private String url;
        private int time;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }


    public static class RelatedProductsBean {
        private String url;
        private String title;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
    public static class RelatedMaterialsBean {
        private String url;
        private String title;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}

