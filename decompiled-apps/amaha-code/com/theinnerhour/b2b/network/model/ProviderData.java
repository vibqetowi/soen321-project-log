package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: ProviderAboutResponseModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/theinnerhour/b2b/network/model/ProviderData;", "", "about", "", "id", "", "(Ljava/lang/String;I)V", "getAbout", "()Ljava/lang/String;", "setAbout", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderData {
    @b("about")
    private String about;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private int f11775id;

    public ProviderData(String about, int i6) {
        i.g(about, "about");
        this.about = about;
        this.f11775id = i6;
    }

    public static /* synthetic */ ProviderData copy$default(ProviderData providerData, String str, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = providerData.about;
        }
        if ((i10 & 2) != 0) {
            i6 = providerData.f11775id;
        }
        return providerData.copy(str, i6);
    }

    public final String component1() {
        return this.about;
    }

    public final int component2() {
        return this.f11775id;
    }

    public final ProviderData copy(String about, int i6) {
        i.g(about, "about");
        return new ProviderData(about, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderData)) {
            return false;
        }
        ProviderData providerData = (ProviderData) obj;
        if (i.b(this.about, providerData.about) && this.f11775id == providerData.f11775id) {
            return true;
        }
        return false;
    }

    public final String getAbout() {
        return this.about;
    }

    public final int getId() {
        return this.f11775id;
    }

    public int hashCode() {
        return (this.about.hashCode() * 31) + this.f11775id;
    }

    public final void setAbout(String str) {
        i.g(str, "<set-?>");
        this.about = str;
    }

    public final void setId(int i6) {
        this.f11775id = i6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProviderData(about=");
        sb2.append(this.about);
        sb2.append(", id=");
        return c.s(sb2, this.f11775id, ')');
    }
}
