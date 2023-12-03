package j$.util.concurrent;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
final class d extends a implements Iterator, j$.util.Iterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(l[] lVarArr, int i6, int i10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i6, i10, concurrentHashMap);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        l lVar = this.f21161b;
        if (lVar != null) {
            Object obj = lVar.f21153b;
            Object obj2 = lVar.f21154c;
            this.f21141j = lVar;
            a();
            return new k(obj, obj2, this.f21140i);
        }
        throw new NoSuchElementException();
    }
}
