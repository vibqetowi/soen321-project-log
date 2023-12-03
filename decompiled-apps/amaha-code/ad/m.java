package ad;

import bd.a;
import com.google.android.gms.common.api.internal.b;
/* compiled from: TokenRefreshManager.java */
/* loaded from: classes.dex */
public final class m implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f519a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ bd.a f520b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f521c;

    public m(n nVar, g gVar, a.C0082a c0082a) {
        this.f521c = nVar;
        this.f519a = gVar;
        this.f520b = c0082a;
    }

    @Override // com.google.android.gms.common.api.internal.b.a
    public final void onBackgroundStateChanged(boolean z10) {
        this.f521c.f524c = z10;
        if (z10) {
            this.f519a.a();
        } else if (this.f521c.a()) {
            g gVar = this.f519a;
            long j10 = this.f521c.f526e;
            ((a.C0082a) this.f520b).getClass();
            gVar.b(j10 - System.currentTimeMillis());
        }
    }
}
