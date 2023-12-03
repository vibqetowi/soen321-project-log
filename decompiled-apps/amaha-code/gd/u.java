package gd;

import com.google.android.gms.common.api.internal.b;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class u implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f16446a;

    public u(v vVar) {
        this.f16446a = vVar;
    }

    @Override // com.google.android.gms.common.api.internal.b.a
    public final void onBackgroundStateChanged(boolean z10) {
        boolean z11 = true;
        if (z10) {
            this.f16446a.f16449c = true;
            l lVar = this.f16446a.f16448b;
            lVar.f16434d.removeCallbacks(lVar.f16435e);
            return;
        }
        this.f16446a.f16449c = false;
        v vVar = this.f16446a;
        if ((vVar.f16447a <= 0 || vVar.f16449c) ? false : false) {
            this.f16446a.f16448b.a();
        }
    }
}
