package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0012j\b\u0012\u0004\u0012\u00020\t`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\rR*\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0012j\b\u0012\u0004\u0012\u00020\t`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResultMasteryModel;", "Ljava/io/Serializable;", "date", "", "(J)V", "getDate", "()J", "setDate", "day", "", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "masteryActivity", "getMasteryActivity", "setMasteryActivity", "pebble", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getPebble", "()Ljava/util/ArrayList;", "setPebble", "(Ljava/util/ArrayList;)V", "rock", "getRock", "setRock", "sand", "getSand", "setSand", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResultMasteryModel implements Serializable {
    private long date;
    private String day = "";
    private String rock = "";
    private ArrayList<String> pebble = new ArrayList<>();
    private ArrayList<String> sand = new ArrayList<>();
    private String masteryActivity = "";

    public ScreenResultMasteryModel(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getDay() {
        return this.day;
    }

    public final String getMasteryActivity() {
        return this.masteryActivity;
    }

    public final ArrayList<String> getPebble() {
        return this.pebble;
    }

    public final String getRock() {
        return this.rock;
    }

    public final ArrayList<String> getSand() {
        return this.sand;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setDay(String str) {
        i.g(str, "<set-?>");
        this.day = str;
    }

    public final void setMasteryActivity(String str) {
        i.g(str, "<set-?>");
        this.masteryActivity = str;
    }

    public final void setPebble(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.pebble = arrayList;
    }

    public final void setRock(String str) {
        i.g(str, "<set-?>");
        this.rock = str;
    }

    public final void setSand(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.sand = arrayList;
    }
}
