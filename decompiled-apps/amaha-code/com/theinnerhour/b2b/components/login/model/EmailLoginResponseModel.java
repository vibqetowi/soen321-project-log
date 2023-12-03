package com.theinnerhour.b2b.components.login.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: EmailLoginResponseModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseModel;", "", "data", "Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseDataModel;", "(Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseDataModel;)V", "getData", "()Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseDataModel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class EmailLoginResponseModel {
    private final EmailLoginResponseDataModel data;

    public EmailLoginResponseModel(EmailLoginResponseDataModel emailLoginResponseDataModel) {
        this.data = emailLoginResponseDataModel;
    }

    public static /* synthetic */ EmailLoginResponseModel copy$default(EmailLoginResponseModel emailLoginResponseModel, EmailLoginResponseDataModel emailLoginResponseDataModel, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            emailLoginResponseDataModel = emailLoginResponseModel.data;
        }
        return emailLoginResponseModel.copy(emailLoginResponseDataModel);
    }

    public final EmailLoginResponseDataModel component1() {
        return this.data;
    }

    public final EmailLoginResponseModel copy(EmailLoginResponseDataModel emailLoginResponseDataModel) {
        return new EmailLoginResponseModel(emailLoginResponseDataModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof EmailLoginResponseModel) && i.b(this.data, ((EmailLoginResponseModel) obj).data)) {
            return true;
        }
        return false;
    }

    public final EmailLoginResponseDataModel getData() {
        return this.data;
    }

    public int hashCode() {
        EmailLoginResponseDataModel emailLoginResponseDataModel = this.data;
        if (emailLoginResponseDataModel == null) {
            return 0;
        }
        return emailLoginResponseDataModel.hashCode();
    }

    public String toString() {
        return "EmailLoginResponseModel(data=" + this.data + ')';
    }
}
