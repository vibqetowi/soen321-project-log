package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult4Model;", "Ljava/io/Serializable;", "date", "", "(J)V", "text1", "", "(JLjava/lang/String;)V", "getDate", "()J", "setDate", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult4Model implements Serializable {
    private long date;
    private String text;

    public ScreenResult4Model(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getText() {
        return this.text;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public ScreenResult4Model(long j10, String text1) {
        i.g(text1, "text1");
        this.date = j10;
        this.text = text1;
    }
}
