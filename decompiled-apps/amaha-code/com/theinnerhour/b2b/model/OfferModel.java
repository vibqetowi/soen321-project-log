package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: OfferModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/model/OfferModel;", "", "slug", "", "time", "", "used", "", "reusable", "(Ljava/lang/String;JZZ)V", "getReusable", "()Z", "setReusable", "(Z)V", "getSlug", "()Ljava/lang/String;", "setSlug", "(Ljava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getUsed", "setUsed", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class OfferModel {
    private boolean reusable;
    private String slug;
    private long time;
    private boolean used;

    public OfferModel(String slug, long j10, boolean z10, boolean z11) {
        i.g(slug, "slug");
        this.slug = slug;
        this.time = j10;
        this.used = z10;
        this.reusable = z11;
    }

    public final boolean getReusable() {
        return this.reusable;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final long getTime() {
        return this.time;
    }

    public final boolean getUsed() {
        return this.used;
    }

    public final void setReusable(boolean z10) {
        this.reusable = z10;
    }

    public final void setSlug(String str) {
        i.g(str, "<set-?>");
        this.slug = str;
    }

    public final void setTime(long j10) {
        this.time = j10;
    }

    public final void setUsed(boolean z10) {
        this.used = z10;
    }
}
