package p9;

import com.google.android.gms.common.api.Status;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class u implements e.a {

    /* renamed from: u  reason: collision with root package name */
    public final Status f28052u;

    /* renamed from: v  reason: collision with root package name */
    public final k9.d f28053v;

    /* renamed from: w  reason: collision with root package name */
    public final String f28054w;

    /* renamed from: x  reason: collision with root package name */
    public final String f28055x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f28056y;

    public u(Status status, k9.d dVar, String str, String str2, boolean z10) {
        this.f28052u = status;
        this.f28053v = dVar;
        this.f28054w = str;
        this.f28055x = str2;
        this.f28056y = z10;
    }

    @Override // k9.e.a
    public final k9.d L() {
        return this.f28053v;
    }

    @Override // t9.c
    public final Status X() {
        return this.f28052u;
    }

    @Override // k9.e.a
    public final String Z() {
        return this.f28055x;
    }

    @Override // k9.e.a
    public final boolean m() {
        return this.f28056y;
    }

    @Override // k9.e.a
    public final String q() {
        return this.f28054w;
    }
}
