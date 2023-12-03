package pl;

import android.widget.CompoundButton;
/* compiled from: N19ScreenFragment.kt */
/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CompoundButton f28671u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> f28672v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(CompoundButton compoundButton, kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> xVar) {
        super(1);
        this.f28671u = compoundButton;
        this.f28672v = xVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        this.f28671u.setChecked(bool.booleanValue());
        com.google.android.material.bottomsheet.f fVar = this.f28672v.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
