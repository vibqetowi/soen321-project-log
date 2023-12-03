package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ProCard.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/theinnerhour/b2b/model/ProCard;", "", "()V", "title", "", "subtitle", "illustration", "", "backgroundColor", "textColor", "(Ljava/lang/String;Ljava/lang/String;III)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getIllustration", "setIllustration", "getSubtitle", "()Ljava/lang/String;", "setSubtitle", "(Ljava/lang/String;)V", "getTextColor", "setTextColor", "getTitle", "setTitle", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProCard {
    private int backgroundColor;
    private int illustration;
    private String subtitle;
    private int textColor;
    private String title;

    public ProCard() {
        this.title = "";
        this.subtitle = "";
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getIllustration() {
        return this.illustration;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBackgroundColor(int i6) {
        this.backgroundColor = i6;
    }

    public final void setIllustration(int i6) {
        this.illustration = i6;
    }

    public final void setSubtitle(String str) {
        i.g(str, "<set-?>");
        this.subtitle = str;
    }

    public final void setTextColor(int i6) {
        this.textColor = i6;
    }

    public final void setTitle(String str) {
        i.g(str, "<set-?>");
        this.title = str;
    }

    public ProCard(String title, String subtitle, int i6, int i10, int i11) {
        i.g(title, "title");
        i.g(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.illustration = i6;
        this.backgroundColor = i10;
        this.textColor = i11;
    }
}
