package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: Testimonial.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/model/Testimonial;", "", "text", "", "date", "userName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getText", "setText", "getUserName", "setUserName", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Testimonial {
    private String date;
    private String text;
    private String userName;

    public Testimonial(String str, String str2, String str3) {
        e.u(str, "text", str2, "date", str3, "userName");
        this.text = str;
        this.date = str2;
        this.userName = str3;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setDate(String str) {
        i.g(str, "<set-?>");
        this.date = str;
    }

    public final void setText(String str) {
        i.g(str, "<set-?>");
        this.text = str;
    }

    public final void setUserName(String str) {
        i.g(str, "<set-?>");
        this.userName = str;
    }
}
