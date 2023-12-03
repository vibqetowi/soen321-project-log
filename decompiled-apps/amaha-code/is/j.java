package is;

import java.util.Iterator;
/* compiled from: Iterables.kt */
/* loaded from: classes2.dex */
public final class j implements Iterable<Object>, ts.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object[] f20669u;

    public j(Object[] objArr) {
        this.f20669u = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return kotlin.jvm.internal.h.N(this.f20669u);
    }
}
