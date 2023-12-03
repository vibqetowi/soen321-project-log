package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult8Model;", "Ljava/io/Serializable;", "date", "", "(J)V", "getDate", "()J", "setDate", "list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "userAdded", "getUserAdded", "setUserAdded", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult8Model implements Serializable {
    private long date;
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> userAdded = new ArrayList<>();

    public ScreenResult8Model(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final ArrayList<String> getList() {
        return this.list;
    }

    public final ArrayList<String> getUserAdded() {
        return this.userAdded;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setList(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final void setUserAdded(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.userAdded = arrayList;
    }
}
