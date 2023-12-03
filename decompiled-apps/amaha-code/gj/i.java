package gj;

import android.net.Uri;
/* compiled from: RedirectionHandler.kt */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f16566u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Uri f16567v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, Uri uri) {
        super(0);
        this.f16566u = hVar;
        this.f16567v = uri;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f16566u.f16556c + " inflateDeeplink() : Ur: " + this.f16567v;
    }
}
