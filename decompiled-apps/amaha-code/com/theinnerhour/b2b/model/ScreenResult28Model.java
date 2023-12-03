package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult28Model;", "Ljava/io/Serializable;", "date", "", "(J)V", "answers", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAnswers", "()Ljava/util/ArrayList;", "setAnswers", "(Ljava/util/ArrayList;)V", "getDate", "()J", "setDate", "list", "getList", "setList", "situation", "getSituation", "()Ljava/lang/String;", "setSituation", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult28Model implements Serializable {
    private long date;
    private String situation;
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();

    public ScreenResult28Model(long j10) {
        this.date = j10;
    }

    public final ArrayList<String> getAnswers() {
        return this.answers;
    }

    public final long getDate() {
        return this.date;
    }

    public final ArrayList<String> getList() {
        return this.list;
    }

    public final String getSituation() {
        return this.situation;
    }

    public final void setAnswers(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.answers = arrayList;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setList(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final void setSituation(String str) {
        this.situation = str;
    }
}
