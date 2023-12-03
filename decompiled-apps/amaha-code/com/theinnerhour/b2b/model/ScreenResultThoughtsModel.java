package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResultThoughtsModel;", "Ljava/io/Serializable;", "date", "", "(J)V", "getDate", "()J", "setDate", "feelings", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getFeelings", "()Ljava/util/ArrayList;", "setFeelings", "(Ljava/util/ArrayList;)V", "mood", "getMood", "()Ljava/lang/String;", "setMood", "(Ljava/lang/String;)V", "situation", "getSituation", "setSituation", Constants.SCREEN_THOUGHTS, "getThoughts", "setThoughts", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResultThoughtsModel implements Serializable {
    private long date;
    private ArrayList<String> feelings = new ArrayList<>();
    private String situation = "";
    private String thoughts = "";
    private String mood = "";

    public ScreenResultThoughtsModel(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final ArrayList<String> getFeelings() {
        return this.feelings;
    }

    public final String getMood() {
        return this.mood;
    }

    public final String getSituation() {
        return this.situation;
    }

    public final String getThoughts() {
        return this.thoughts;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setFeelings(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.feelings = arrayList;
    }

    public final void setMood(String str) {
        i.g(str, "<set-?>");
        this.mood = str;
    }

    public final void setSituation(String str) {
        i.g(str, "<set-?>");
        this.situation = str;
    }

    public final void setThoughts(String str) {
        i.g(str, "<set-?>");
        this.thoughts = str;
    }
}
