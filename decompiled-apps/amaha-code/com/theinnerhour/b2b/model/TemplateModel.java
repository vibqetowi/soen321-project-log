package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR6\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+0*j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+`,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001c\u00107\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR*\u0010:\u001a\u0012\u0012\u0004\u0012\u00020;0\u0010j\b\u0012\u0004\u0012\u00020;`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0014\"\u0004\b=\u0010\u0016¨\u0006>"}, d2 = {"Lcom/theinnerhour/b2b/model/TemplateModel;", "Ljava/io/Serializable;", "()V", "activityDescription", "", "getActivityDescription", "()Ljava/lang/String;", "setActivityDescription", "(Ljava/lang/String;)V", "duration", "getDuration", "setDuration", "goalName", "getGoalName", "setGoalName", "goalScreens", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getGoalScreens", "()Ljava/util/ArrayList;", "setGoalScreens", "(Ljava/util/ArrayList;)V", Constants.GOAL_TYPE, "getGoal_type", "setGoal_type", "label", "getLabel", "setLabel", "language", "getLanguage", "setLanguage", "logScreenTitle", "getLogScreenTitle", "setLogScreenTitle", "notificationBody", "getNotificationBody", "setNotificationBody", "notificationTitle", "getNotificationTitle", "setNotificationTitle", "params", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "reminderBody", "getReminderBody", "setReminderBody", "reminderTitle", "getReminderTitle", "setReminderTitle", "sneakPeekText", "getSneakPeekText", "setSneakPeekText", "template", "Lcom/theinnerhour/b2b/model/ScreenModel;", "getTemplate", "setTemplate", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class TemplateModel implements Serializable {
    private String activityDescription;
    private String duration;
    private String goalName;
    private String goal_type;
    private String logScreenTitle;
    private String notificationBody;
    private String notificationTitle;
    private String reminderBody;
    private String reminderTitle;
    private String sneakPeekText;
    private String label = "";
    private String language = "en";
    private ArrayList<ScreenModel> template = new ArrayList<>();
    private HashMap<String, Object> params = new HashMap<>();
    private ArrayList<Integer> goalScreens = new ArrayList<>();

    public final String getActivityDescription() {
        return this.activityDescription;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getGoalName() {
        return this.goalName;
    }

    public final ArrayList<Integer> getGoalScreens() {
        return this.goalScreens;
    }

    public final String getGoal_type() {
        return this.goal_type;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLogScreenTitle() {
        return this.logScreenTitle;
    }

    public final String getNotificationBody() {
        return this.notificationBody;
    }

    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    public final HashMap<String, Object> getParams() {
        return this.params;
    }

    public final String getReminderBody() {
        return this.reminderBody;
    }

    public final String getReminderTitle() {
        return this.reminderTitle;
    }

    public final String getSneakPeekText() {
        return this.sneakPeekText;
    }

    public final ArrayList<ScreenModel> getTemplate() {
        return this.template;
    }

    public final void setActivityDescription(String str) {
        this.activityDescription = str;
    }

    public final void setDuration(String str) {
        this.duration = str;
    }

    public final void setGoalName(String str) {
        this.goalName = str;
    }

    public final void setGoalScreens(ArrayList<Integer> arrayList) {
        i.g(arrayList, "<set-?>");
        this.goalScreens = arrayList;
    }

    public final void setGoal_type(String str) {
        this.goal_type = str;
    }

    public final void setLabel(String str) {
        i.g(str, "<set-?>");
        this.label = str;
    }

    public final void setLanguage(String str) {
        i.g(str, "<set-?>");
        this.language = str;
    }

    public final void setLogScreenTitle(String str) {
        this.logScreenTitle = str;
    }

    public final void setNotificationBody(String str) {
        this.notificationBody = str;
    }

    public final void setNotificationTitle(String str) {
        this.notificationTitle = str;
    }

    public final void setParams(HashMap<String, Object> hashMap) {
        i.g(hashMap, "<set-?>");
        this.params = hashMap;
    }

    public final void setReminderBody(String str) {
        this.reminderBody = str;
    }

    public final void setReminderTitle(String str) {
        this.reminderTitle = str;
    }

    public final void setSneakPeekText(String str) {
        this.sneakPeekText = str;
    }

    public final void setTemplate(ArrayList<ScreenModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.template = arrayList;
    }
}
