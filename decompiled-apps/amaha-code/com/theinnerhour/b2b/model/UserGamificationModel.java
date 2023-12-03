package com.theinnerhour.b2b.model;

import com.google.firebase.database.Exclude;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class UserGamificationModel {
    private int totalGamificationPoints = 0;
    private HashMap<String, String> badges = new HashMap<>();
    private ArrayList<String> assessmenIds = new ArrayList<>();
    private HashMap<String, ArrayList<String>> courseArticleIdMap = new HashMap<>();
    private HashMap<String, ArrayList<Integer>> courseDailyTaskMap = new HashMap<>();

    public ArrayList<String> getAssessmenIds() {
        return this.assessmenIds;
    }

    public HashMap<String, String> getBadges() {
        return this.badges;
    }

    public HashMap<String, ArrayList<String>> getCourseArticleIdMap() {
        return this.courseArticleIdMap;
    }

    @Exclude
    public ArrayList<String> getCourseArticleList() {
        if (getCourseArticleIdMap().get(FirebasePersistence.getInstance().getUser().getCurrentCourse()) == null) {
            getCourseArticleIdMap().put(c.n(), new ArrayList<>());
        }
        return getCourseArticleIdMap().get(FirebasePersistence.getInstance().getUser().getCurrentCourse());
    }

    @Exclude
    public ArrayList<Integer> getCourseDailyTaskList() {
        if (getCourseDailyTaskMap().get(FirebasePersistence.getInstance().getUser().getCurrentCourse()) == null) {
            getCourseDailyTaskMap().put(c.n(), new ArrayList<>());
        }
        return getCourseDailyTaskMap().get(FirebasePersistence.getInstance().getUser().getCurrentCourse());
    }

    public HashMap<String, ArrayList<Integer>> getCourseDailyTaskMap() {
        return this.courseDailyTaskMap;
    }

    public int getTotalGamificationPoints() {
        return this.totalGamificationPoints;
    }

    public void setAssessmenIds(ArrayList<String> arrayList) {
        this.assessmenIds = arrayList;
    }

    public void setBadges(HashMap<String, String> hashMap) {
        this.badges = hashMap;
    }

    public void setCourseArticleIdMap(HashMap<String, ArrayList<String>> hashMap) {
        this.courseArticleIdMap = hashMap;
    }

    public void setCourseDailyTaskMap(HashMap<String, ArrayList<Integer>> hashMap) {
        this.courseDailyTaskMap = hashMap;
    }

    public void setTotalGamificationPoints(int i6) {
        this.totalGamificationPoints = i6;
    }
}
