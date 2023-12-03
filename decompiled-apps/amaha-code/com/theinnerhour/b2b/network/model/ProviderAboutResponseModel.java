package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: ProviderAboutResponseModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/theinnerhour/b2b/network/model/ProviderAboutResponseModel;", "", "data", "Lcom/theinnerhour/b2b/network/model/ProviderData;", "status", "Lcom/theinnerhour/b2b/network/model/Status;", "(Lcom/theinnerhour/b2b/network/model/ProviderData;Lcom/theinnerhour/b2b/network/model/Status;)V", "getData", "()Lcom/theinnerhour/b2b/network/model/ProviderData;", "setData", "(Lcom/theinnerhour/b2b/network/model/ProviderData;)V", "getStatus", "()Lcom/theinnerhour/b2b/network/model/Status;", "setStatus", "(Lcom/theinnerhour/b2b/network/model/Status;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderAboutResponseModel {
    @b("data")
    private ProviderData data;
    @b("status")
    private Status status;

    public ProviderAboutResponseModel(ProviderData data, Status status) {
        i.g(data, "data");
        i.g(status, "status");
        this.data = data;
        this.status = status;
    }

    public static /* synthetic */ ProviderAboutResponseModel copy$default(ProviderAboutResponseModel providerAboutResponseModel, ProviderData providerData, Status status, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            providerData = providerAboutResponseModel.data;
        }
        if ((i6 & 2) != 0) {
            status = providerAboutResponseModel.status;
        }
        return providerAboutResponseModel.copy(providerData, status);
    }

    public final ProviderData component1() {
        return this.data;
    }

    public final Status component2() {
        return this.status;
    }

    public final ProviderAboutResponseModel copy(ProviderData data, Status status) {
        i.g(data, "data");
        i.g(status, "status");
        return new ProviderAboutResponseModel(data, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderAboutResponseModel)) {
            return false;
        }
        ProviderAboutResponseModel providerAboutResponseModel = (ProviderAboutResponseModel) obj;
        if (i.b(this.data, providerAboutResponseModel.data) && i.b(this.status, providerAboutResponseModel.status)) {
            return true;
        }
        return false;
    }

    public final ProviderData getData() {
        return this.data;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.data.hashCode() * 31);
    }

    public final void setData(ProviderData providerData) {
        i.g(providerData, "<set-?>");
        this.data = providerData;
    }

    public final void setStatus(Status status) {
        i.g(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "ProviderAboutResponseModel(data=" + this.data + ", status=" + this.status + ')';
    }
}
