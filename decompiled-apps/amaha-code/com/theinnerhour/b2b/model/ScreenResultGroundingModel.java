package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR*\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResultGroundingModel;", "Ljava/io/Serializable;", "date", "", "(J)V", "getDate", "()J", "setDate", "feelList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getFeelList", "()Ljava/util/ArrayList;", "setFeelList", "(Ljava/util/ArrayList;)V", "hearList", "getHearList", "setHearList", "location", "getLocation", "()Ljava/lang/String;", "setLocation", "(Ljava/lang/String;)V", "seeList", "getSeeList", "setSeeList", "smellList", "getSmellList", "setSmellList", Constants.GOAL_TYPE_THOUGHT, "getThought", "setThought", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResultGroundingModel implements Serializable {
    private long date;
    private String location = "";
    private ArrayList<String> seeList = new ArrayList<>();
    private ArrayList<String> feelList = new ArrayList<>();
    private ArrayList<String> hearList = new ArrayList<>();
    private ArrayList<String> smellList = new ArrayList<>();
    private String thought = "";

    public ScreenResultGroundingModel(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final ArrayList<String> getFeelList() {
        return this.feelList;
    }

    public final ArrayList<String> getHearList() {
        return this.hearList;
    }

    public final String getLocation() {
        return this.location;
    }

    public final ArrayList<String> getSeeList() {
        return this.seeList;
    }

    public final ArrayList<String> getSmellList() {
        return this.smellList;
    }

    public final String getThought() {
        return this.thought;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setFeelList(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.feelList = arrayList;
    }

    public final void setHearList(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.hearList = arrayList;
    }

    public final void setLocation(String str) {
        i.g(str, "<set-?>");
        this.location = str;
    }

    public final void setSeeList(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.seeList = arrayList;
    }

    public final void setSmellList(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.smellList = arrayList;
    }

    public final void setThought(String str) {
        i.g(str, "<set-?>");
        this.thought = str;
    }
}
