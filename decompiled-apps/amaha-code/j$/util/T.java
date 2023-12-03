package j$.util;

import j$.time.AbstractC0689a;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
final class T implements java.util.Iterator, Consumer {

    /* renamed from: a  reason: collision with root package name */
    boolean f21097a = false;

    /* renamed from: b  reason: collision with root package name */
    Object f21098b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ S f21099c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(S s10) {
        this.f21099c = s10;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f21097a = true;
        this.f21098b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f21097a) {
            this.f21099c.tryAdvance(this);
        }
        return this.f21097a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21097a || hasNext()) {
            this.f21097a = false;
            return this.f21098b;
        }
        throw new NoSuchElementException();
    }
}
