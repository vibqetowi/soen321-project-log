package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult18Model;", "Ljava/io/Serializable;", "date", "", "text1", "", "text2", "text3", "text4", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "getText1", "()Ljava/lang/String;", "setText1", "(Ljava/lang/String;)V", "getText2", "setText2", "getText3", "setText3", "getText4", "setText4", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult18Model implements Serializable {
    private long date;
    private String text1;
    private String text2;
    private String text3;
    private String text4;

    public ScreenResult18Model(long j10, String text1, String text2, String text3, String text4) {
        i.g(text1, "text1");
        i.g(text2, "text2");
        i.g(text3, "text3");
        i.g(text4, "text4");
        this.date = j10;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getText1() {
        return this.text1;
    }

    public final String getText2() {
        return this.text2;
    }

    public final String getText3() {
        return this.text3;
    }

    public final String getText4() {
        return this.text4;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setText1(String str) {
        i.g(str, "<set-?>");
        this.text1 = str;
    }

    public final void setText2(String str) {
        i.g(str, "<set-?>");
        this.text2 = str;
    }

    public final void setText3(String str) {
        i.g(str, "<set-?>");
        this.text3 = str;
    }

    public final void setText4(String str) {
        i.g(str, "<set-?>");
        this.text4 = str;
    }
}
