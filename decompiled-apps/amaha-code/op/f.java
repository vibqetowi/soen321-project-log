package op;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import ss.l;
/* compiled from: TeleEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class f extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f27710u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x<com.google.android.material.bottomsheet.f> xVar) {
        super(1);
        this.f27710u = xVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        bool.booleanValue();
        com.google.android.material.bottomsheet.f fVar = this.f27710u.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
