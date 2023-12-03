package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/model/Screen136Model;", "Ljava/io/Serializable;", "()V", "headingTxt", "", "getHeadingTxt", "()Ljava/lang/String;", "setHeadingTxt", "(Ljava/lang/String;)V", "included", "", "getIncluded", "()Z", "setIncluded", "(Z)V", "rank", "", "getRank", "()I", "setRank", "(I)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Screen136Model implements Serializable {
    private boolean included;
    private String headingTxt = "";
    private int rank = 5;

    public final String getHeadingTxt() {
        return this.headingTxt;
    }

    public final boolean getIncluded() {
        return this.included;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setHeadingTxt(String str) {
        i.g(str, "<set-?>");
        this.headingTxt = str;
    }

    public final void setIncluded(boolean z10) {
        this.included = z10;
    }

    public final void setRank(int i6) {
        this.rank = i6;
    }
}
