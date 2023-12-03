package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Utils;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/theinnerhour/b2b/model/CompassionLetterModel;", "Ljava/io/Serializable;", "letter", "", "(Ljava/lang/String;)V", "date", "", "getDate", "()J", "setDate", "(J)V", "getLetter", "()Ljava/lang/String;", "setLetter", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CompassionLetterModel implements Serializable {
    private long date;
    private String letter;

    public CompassionLetterModel(String letter) {
        i.g(letter, "letter");
        this.letter = letter;
        this.date = Utils.INSTANCE.getTimeInSeconds();
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
