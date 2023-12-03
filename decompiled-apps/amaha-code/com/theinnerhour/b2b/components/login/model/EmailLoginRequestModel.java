package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: EmailLoginRequestModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/EmailLoginRequestModel;", "", SessionManager.KEY_EMAIL, "", SessionManager.KEY_PASS, "setProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "getSetProvider", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class EmailLoginRequestModel {
    private final String email;
    private final String password;
    @b("set_provider")
    private final String setProvider;

    public EmailLoginRequestModel(String email, String password, String str) {
        i.g(email, "email");
        i.g(password, "password");
        this.email = email;
        this.password = password;
        this.setProvider = str;
    }

    public static /* synthetic */ EmailLoginRequestModel copy$default(EmailLoginRequestModel emailLoginRequestModel, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = emailLoginRequestModel.email;
        }
        if ((i6 & 2) != 0) {
            str2 = emailLoginRequestModel.password;
        }
        if ((i6 & 4) != 0) {
            str3 = emailLoginRequestModel.setProvider;
        }
        return emailLoginRequestModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.setProvider;
    }

    public final EmailLoginRequestModel copy(String email, String password, String str) {
        i.g(email, "email");
        i.g(password, "password");
        return new EmailLoginRequestModel(email, password, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailLoginRequestModel)) {
            return false;
        }
        EmailLoginRequestModel emailLoginRequestModel = (EmailLoginRequestModel) obj;
        if (i.b(this.email, emailLoginRequestModel.email) && i.b(this.password, emailLoginRequestModel.password) && i.b(this.setProvider, emailLoginRequestModel.setProvider)) {
            return true;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getSetProvider() {
        return this.setProvider;
    }

    public int hashCode() {
        int hashCode;
        int c10 = a.c(this.password, this.email.hashCode() * 31, 31);
        String str = this.setProvider;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c10 + hashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EmailLoginRequestModel(email=");
        sb2.append(this.email);
        sb2.append(", password=");
        sb2.append(this.password);
        sb2.append(", setProvider=");
        return g.c(sb2, this.setProvider, ')');
    }

    public /* synthetic */ EmailLoginRequestModel(String str, String str2, String str3, int i6, d dVar) {
        this(str, str2, (i6 & 4) != 0 ? null : str3);
    }
}
