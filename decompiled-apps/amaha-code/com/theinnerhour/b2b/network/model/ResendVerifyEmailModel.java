package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: ResendVerifyEmailModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/network/model/ResendVerifyEmailModel;", "", "source", "", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "setSource", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ResendVerifyEmailModel {
    @b(SessionManager.KEY_EMAIL)
    private String source;

    public ResendVerifyEmailModel(String source) {
        i.g(source, "source");
        this.source = source;
    }

    public static /* synthetic */ ResendVerifyEmailModel copy$default(ResendVerifyEmailModel resendVerifyEmailModel, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = resendVerifyEmailModel.source;
        }
        return resendVerifyEmailModel.copy(str);
    }

    public final String component1() {
        return this.source;
    }

    public final ResendVerifyEmailModel copy(String source) {
        i.g(source, "source");
        return new ResendVerifyEmailModel(source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ResendVerifyEmailModel) && i.b(this.source, ((ResendVerifyEmailModel) obj).source)) {
            return true;
        }
        return false;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode();
    }

    public final void setSource(String str) {
        i.g(str, "<set-?>");
        this.source = str;
    }

    public String toString() {
        return g.c(new StringBuilder("ResendVerifyEmailModel(source="), this.source, ')');
    }
}
