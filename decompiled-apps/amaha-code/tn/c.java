package tn;

import kotlin.jvm.internal.x;
/* compiled from: MoodTrackerFragment.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f33335u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x<com.google.android.material.bottomsheet.f> xVar) {
        super(1);
        this.f33335u = xVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        bool.booleanValue();
        com.google.android.material.bottomsheet.f fVar = this.f33335u.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
