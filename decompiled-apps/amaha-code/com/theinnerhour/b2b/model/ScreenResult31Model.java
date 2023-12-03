package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult31Model;", "Ljava/io/Serializable;", "date", "", "(J)V", "getDate", "()J", "setDate", SessionManager.KEY_NAME, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "selection", "getSelection", "setSelection", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult31Model implements Serializable {
    private long date;
    private String name;
    private String selection;

    public ScreenResult31Model(long j10) {
        this.date = j10;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSelection() {
        return this.selection;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSelection(String str) {
        this.selection = str;
    }
}
