package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult12Model;", "Ljava/io/Serializable;", "date", "", "text1", "", "text2", "text3", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "getText1", "()Ljava/lang/String;", "setText1", "(Ljava/lang/String;)V", "getText2", "setText2", "getText3", "setText3", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult12Model implements Serializable {
    private long date;
    private String text1;
    private String text2;
    private String text3;

    public ScreenResult12Model(long j10, String str, String str2, String str3) {
        e.u(str, "text1", str2, "text2", str3, "text3");
        this.date = j10;
        this.text1 = str;
        this.text2 = str2;
        this.text3 = str3;
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
}
