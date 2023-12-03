package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResultPleasurableModel;", "Ljava/io/Serializable;", "date", "", "(J)V", "getDate", "()J", "setDate", "letter", "", "getLetter", "()Ljava/lang/String;", "setLetter", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResultPleasurableModel implements Serializable {
    private long date;
    private String letter = "";

    public ScreenResultPleasurableModel(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getLetter() {
        return this.letter;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setLetter(String str) {
        i.g(str, "<set-?>");
        this.letter = str;
    }
}
