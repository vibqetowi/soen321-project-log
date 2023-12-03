package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b!\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001c\u0010\"\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001c\u0010%\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012¨\u0006/"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult21Model;", "Ljava/io/Serializable;", "date", "", "items", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/UrgentImportantModel;", "Lkotlin/collections/ArrayList;", "(JLjava/util/ArrayList;)V", "getDate", "()J", "setDate", "(J)V", "desc1", "", "getDesc1", "()Ljava/lang/String;", "setDesc1", "(Ljava/lang/String;)V", "desc2", "getDesc2", "setDesc2", "desc3", "getDesc3", "setDesc3", "desc4", "getDesc4", "setDesc4", "heading1", "getHeading1", "setHeading1", "heading2", "getHeading2", "setHeading2", "heading3", "getHeading3", "setHeading3", "heading4", "getHeading4", "setHeading4", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "title", "getTitle", "setTitle", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult21Model implements Serializable {
    private long date;
    private String desc1;
    private String desc2;
    private String desc3;
    private String desc4;
    private String heading1;
    private String heading2;
    private String heading3;
    private String heading4;
    private ArrayList<UrgentImportantModel> items;
    private String title;

    public ScreenResult21Model(long j10, ArrayList<UrgentImportantModel> items) {
        i.g(items, "items");
        this.date = j10;
        this.items = items;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getDesc1() {
        return this.desc1;
    }

    public final String getDesc2() {
        return this.desc2;
    }

    public final String getDesc3() {
        return this.desc3;
    }

    public final String getDesc4() {
        return this.desc4;
    }

    public final String getHeading1() {
        return this.heading1;
    }

    public final String getHeading2() {
        return this.heading2;
    }

    public final String getHeading3() {
        return this.heading3;
    }

    public final String getHeading4() {
        return this.heading4;
    }

    public final ArrayList<UrgentImportantModel> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setDesc1(String str) {
        this.desc1 = str;
    }

    public final void setDesc2(String str) {
        this.desc2 = str;
    }

    public final void setDesc3(String str) {
        this.desc3 = str;
    }

    public final void setDesc4(String str) {
        this.desc4 = str;
    }

    public final void setHeading1(String str) {
        this.heading1 = str;
    }

    public final void setHeading2(String str) {
        this.heading2 = str;
    }

    public final void setHeading3(String str) {
        this.heading3 = str;
    }

    public final void setHeading4(String str) {
        this.heading4 = str;
    }

    public final void setItems(ArrayList<UrgentImportantModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.items = arrayList;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
