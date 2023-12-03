package is;

import java.util.Iterator;
/* compiled from: _Collections.kt */
/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.k implements ss.a<Iterator<Object>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Iterable<Object> f20674u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Iterable<Object> iterable) {
        super(0);
        this.f20674u = iterable;
    }

    @Override // ss.a
    public final Iterator<Object> invoke() {
        return this.f20674u.iterator();
    }
}
