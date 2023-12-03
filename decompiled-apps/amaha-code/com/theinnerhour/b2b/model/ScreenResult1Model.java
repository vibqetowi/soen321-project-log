package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult1Model;", "Ljava/io/Serializable;", "date", "", "(J)V", "getDate", "()J", "setDate", "headings", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getHeadings", "()Ljava/util/ArrayList;", "setHeadings", "(Ljava/util/ArrayList;)V", "list", "getList", "setList", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult1Model implements Serializable {
    private long date;
    private String title;
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> headings = new ArrayList<>();

    public ScreenResult1Model(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final ArrayList<String> getHeadings() {
        return this.headings;
    }

    public final ArrayList<String> getList() {
        return this.list;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setHeadings(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.headings = arrayList;
    }

    public final void setList(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
