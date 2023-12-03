package is;

import java.util.Iterator;
/* compiled from: Iterables.kt */
/* loaded from: classes2.dex */
public final class a0<T> implements Iterable<z<? extends T>>, ts.a {

    /* renamed from: u  reason: collision with root package name */
    public final ss.a<Iterator<T>> f20637u;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(ss.a<? extends Iterator<? extends T>> aVar) {
        this.f20637u = aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<z<T>> iterator() {
        return new b0(this.f20637u.invoke());
    }
}
