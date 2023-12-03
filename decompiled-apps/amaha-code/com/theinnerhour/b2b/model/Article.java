package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: Article.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/theinnerhour/b2b/model/Article;", "", "()V", "_id", "", "get_id", "()Ljava/lang/String;", "set_id", "(Ljava/lang/String;)V", "body", "getBody", "setBody", "created_at", "getCreated_at", "setCreated_at", "day", "", "getDay", "()I", "setDay", "(I)V", "icon2", "getIcon2", "setIcon2", "isAlive", "", "()Z", "setAlive", "(Z)V", "thumb", "getThumb", "setThumb", "title", "getTitle", "setTitle", "visibility", "Ljava/util/ArrayList;", "getVisibility", "()Ljava/util/ArrayList;", "setVisibility", "(Ljava/util/ArrayList;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Article {
    private String _id;
    private String body;
    private String created_at;
    private int day;
    private String icon2;
    @b("isalive")
    private boolean isAlive;
    private String thumb;
    private String title;
    private ArrayList<String> visibility = new ArrayList<>();

    public final String getBody() {
        return this.body;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final int getDay() {
        return this.day;
    }

    public final String getIcon2() {
        return this.icon2;
    }

    public final String getThumb() {
        return this.thumb;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ArrayList<String> getVisibility() {
        return this.visibility;
    }

    public final String get_id() {
        return this._id;
    }

    public final boolean isAlive() {
        return this.isAlive;
    }

    public final void setAlive(boolean z10) {
        this.isAlive = z10;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setCreated_at(String str) {
        this.created_at = str;
    }

    public final void setDay(int i6) {
        this.day = i6;
    }

    public final void setIcon2(String str) {
        this.icon2 = str;
    }

    public final void setThumb(String str) {
        this.thumb = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setVisibility(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.visibility = arrayList;
    }

    public final void set_id(String str) {
        this._id = str;
    }
}
