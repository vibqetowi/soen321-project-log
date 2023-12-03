package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000fj\b\u0012\u0004\u0012\u00020\u0005`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult16Model;", "Ljava/io/Serializable;", "date", "", "text", "", "(JLjava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "fromTime", "getFromTime", "setFromTime", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "tillTime", "getTillTime", "setTillTime", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult16Model implements Serializable {
    private long date;
    private long fromTime;
    private ArrayList<String> list;
    private String text;
    private long tillTime;

    public ScreenResult16Model(long j10, String text) {
        i.g(text, "text");
        this.date = j10;
        this.text = text;
        this.list = new ArrayList<>();
    }

    public final long getDate() {
        return this.date;
    }

    public final long getFromTime() {
        return this.fromTime;
    }

    public final ArrayList<String> getList() {
        return this.list;
    }

    public final String getText() {
        return this.text;
    }

    public final long getTillTime() {
        return this.tillTime;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setFromTime(long j10) {
        this.fromTime = j10;
    }

    public final void setList(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final void setText(String str) {
        i.g(str, "<set-?>");
        this.text = str;
    }

    public final void setTillTime(long j10) {
        this.tillTime = j10;
    }
}
