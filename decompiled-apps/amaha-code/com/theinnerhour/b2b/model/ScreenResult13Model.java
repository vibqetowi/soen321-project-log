package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult13Model;", "Ljava/io/Serializable;", "date", "", "(J)V", "ans1", "", "getAns1", "()Ljava/lang/String;", "setAns1", "(Ljava/lang/String;)V", "ans2", "getAns2", "setAns2", "getDate", "()J", "setDate", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult13Model implements Serializable {
    private String ans1;
    private String ans2;
    private long date;

    public ScreenResult13Model(long j10) {
        this.date = j10;
    }

    public final String getAns1() {
        return this.ans1;
    }

    public final String getAns2() {
        return this.ans2;
    }

    public final long getDate() {
        return this.date;
    }

    public final void setAns1(String str) {
        this.ans1 = str;
    }

    public final void setAns2(String str) {
        this.ans2 = str;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }
}
