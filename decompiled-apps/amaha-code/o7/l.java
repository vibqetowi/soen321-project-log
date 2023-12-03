package o7;

import c9.j;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.w;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements m.e, j.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27207u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.k f27208v;

    public /* synthetic */ l(com.google.android.exoplayer2.k kVar, int i6) {
        this.f27207u = i6;
        this.f27208v = kVar;
    }

    @Override // c9.j.a
    public final void invoke(Object obj) {
        int i6 = this.f27207u;
        com.google.android.exoplayer2.k kVar = this.f27208v;
        switch (i6) {
            case 1:
                ((w.b) obj).t(kVar.B);
                return;
            default:
                ((w.b) obj).A(kVar.C);
                return;
        }
    }
}
