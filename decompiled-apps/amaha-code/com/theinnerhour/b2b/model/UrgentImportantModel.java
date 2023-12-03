package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/model/UrgentImportantModel;", "Ljava/io/Serializable;", "text", "", "urgent", "", "important", "(Ljava/lang/String;ZZ)V", "getImportant", "()Z", "setImportant", "(Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getUrgent", "setUrgent", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UrgentImportantModel implements Serializable {
    private boolean important;
    private String text;
    private boolean urgent;

    public UrgentImportantModel(String text, boolean z10, boolean z11) {
        i.g(text, "text");
        this.text = text;
        this.urgent = z10;
        this.important = z11;
    }

    public final boolean getImportant() {
        return this.important;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getUrgent() {
        return this.urgent;
    }

    public final void setImportant(boolean z10) {
        this.important = z10;
    }

    public final void setText(String str) {
        i.g(str, "<set-?>");
        this.text = str;
    }

    public final void setUrgent(boolean z10) {
        this.urgent = z10;
    }

    public /* synthetic */ UrgentImportantModel(String str, boolean z10, boolean z11, int i6, d dVar) {
        this(str, (i6 & 2) != 0 ? false : z10, (i6 & 4) != 0 ? false : z11);
    }
}
