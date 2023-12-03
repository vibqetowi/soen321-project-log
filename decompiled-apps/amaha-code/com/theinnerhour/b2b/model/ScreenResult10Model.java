package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult10Model;", "Ljava/io/Serializable;", "()V", "date", "", "getDate", "()J", "setDate", "(J)V", "logDate", "getLogDate", "()Ljava/lang/Long;", "setLogDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult10Model implements Serializable {
    private long date;
    private Long logDate;
    private String text;

    public final long getDate() {
        return this.date;
    }

    public final Long getLogDate() {
        return this.logDate;
    }

    public final String getText() {
        return this.text;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setLogDate(Long l2) {
        this.logDate = l2;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
