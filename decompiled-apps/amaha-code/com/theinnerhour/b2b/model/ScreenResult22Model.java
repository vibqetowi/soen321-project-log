package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016¨\u0006&"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult22Model;", "Ljava/io/Serializable;", "date", "", "items", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/TaskIn2Min;", "Lkotlin/collections/ArrayList;", "(JLjava/util/ArrayList;)V", "getDate", "()J", "setDate", "(J)V", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "prefix", "", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "rememberLabel", "getRememberLabel", "setRememberLabel", "rememberText1", "getRememberText1", "setRememberText1", "rememberText2", "getRememberText2", "setRememberText2", "title1", "getTitle1", "setTitle1", "title2", "getTitle2", "setTitle2", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult22Model implements Serializable {
    private long date;
    private ArrayList<TaskIn2Min> items;
    private String prefix;
    private String rememberLabel;
    private String rememberText1;
    private String rememberText2;
    private String title1;
    private String title2;

    public ScreenResult22Model(long j10, ArrayList<TaskIn2Min> items) {
        i.g(items, "items");
        this.date = j10;
        this.items = items;
    }

    public final long getDate() {
        return this.date;
    }

    public final ArrayList<TaskIn2Min> getItems() {
        return this.items;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getRememberLabel() {
        return this.rememberLabel;
    }

    public final String getRememberText1() {
        return this.rememberText1;
    }

    public final String getRememberText2() {
        return this.rememberText2;
    }

    public final String getTitle1() {
        return this.title1;
    }

    public final String getTitle2() {
        return this.title2;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setItems(ArrayList<TaskIn2Min> arrayList) {
        i.g(arrayList, "<set-?>");
        this.items = arrayList;
    }

    public final void setPrefix(String str) {
        this.prefix = str;
    }

    public final void setRememberLabel(String str) {
        this.rememberLabel = str;
    }

    public final void setRememberText1(String str) {
        this.rememberText1 = str;
    }

    public final void setRememberText2(String str) {
        this.rememberText2 = str;
    }

    public final void setTitle1(String str) {
        this.title1 = str;
    }

    public final void setTitle2(String str) {
        this.title2 = str;
    }
}
