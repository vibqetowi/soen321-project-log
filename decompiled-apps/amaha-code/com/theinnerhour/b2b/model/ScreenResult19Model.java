package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult19Model;", "Ljava/io/Serializable;", "date", "", "text1", "", "text2", "text3", "text4", "text5", "text6", "text7", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "getText1", "()Ljava/lang/String;", "setText1", "(Ljava/lang/String;)V", "getText2", "setText2", "getText3", "setText3", "getText4", "setText4", "getText5", "setText5", "getText6", "setText6", "getText7", "setText7", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult19Model implements Serializable {
    private long date;
    private String text1;
    private String text2;
    private String text3;
    private String text4;
    private String text5;
    private String text6;
    private String text7;

    public ScreenResult19Model(long j10, String text1, String text2, String text3, String text4, String text5, String text6, String text7) {
        i.g(text1, "text1");
        i.g(text2, "text2");
        i.g(text3, "text3");
        i.g(text4, "text4");
        i.g(text5, "text5");
        i.g(text6, "text6");
        i.g(text7, "text7");
        this.date = j10;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.text5 = text5;
        this.text6 = text6;
        this.text7 = text7;
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

    public final String getText5() {
        return this.text5;
    }

    public final String getText6() {
        return this.text6;
    }

    public final String getText7() {
        return this.text7;
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

    public final void setText5(String str) {
        i.g(str, "<set-?>");
        this.text5 = str;
    }

    public final void setText6(String str) {
        i.g(str, "<set-?>");
        this.text6 = str;
    }

    public final void setText7(String str) {
        i.g(str, "<set-?>");
        this.text7 = str;
    }
}
