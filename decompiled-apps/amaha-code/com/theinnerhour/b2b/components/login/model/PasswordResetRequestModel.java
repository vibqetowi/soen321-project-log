package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: PasswordResetRequestModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/PasswordResetRequestModel;", "", SessionManager.KEY_EMAIL, "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class PasswordResetRequestModel {
    private final String email;

    public PasswordResetRequestModel(String email) {
        i.g(email, "email");
        this.email = email;
    }

    public static /* synthetic */ PasswordResetRequestModel copy$default(PasswordResetRequestModel passwordResetRequestModel, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = passwordResetRequestModel.email;
        }
        return passwordResetRequestModel.copy(str);
    }

    public final String component1() {
        return this.email;
    }

    public final PasswordResetRequestModel copy(String email) {
        i.g(email, "email");
        return new PasswordResetRequestModel(email);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PasswordResetRequestModel) && i.b(this.email, ((PasswordResetRequestModel) obj).email)) {
            return true;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public String toString() {
        return g.c(new StringBuilder("PasswordResetRequestModel(email="), this.email, ')');
    }
}
