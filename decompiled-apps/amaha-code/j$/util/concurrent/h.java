package j$.util.concurrent;

import j$.util.Iterator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h extends a implements Iterator, Enumeration, j$.util.Iterator {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f21146k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i6, int i10, ConcurrentHashMap concurrentHashMap, int i11) {
        super(lVarArr, i6, i10, concurrentHashMap);
        this.f21146k = i11;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f21146k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        switch (this.f21146k) {
            case 0:
                l lVar = this.f21161b;
                if (lVar != null) {
                    this.f21141j = lVar;
                    a();
                    return lVar.f21153b;
                }
                throw new NoSuchElementException();
            default:
                l lVar2 = this.f21161b;
                if (lVar2 != null) {
                    Object obj = lVar2.f21154c;
                    this.f21141j = lVar2;
                    a();
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f21146k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
