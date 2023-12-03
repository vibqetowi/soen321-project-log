package is;

import java.util.Iterator;
/* compiled from: _Arrays.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.a<Iterator<Object>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object[] f20671u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object[] objArr) {
        super(0);
        this.f20671u = objArr;
    }

    @Override // ss.a
    public final Iterator<Object> invoke() {
        return kotlin.jvm.internal.h.N(this.f20671u);
    }
}
