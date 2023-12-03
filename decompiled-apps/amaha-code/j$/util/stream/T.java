package j$.util.stream;

import java.util.function.Consumer;
/* loaded from: classes3.dex */
final class T extends U {

    /* renamed from: b  reason: collision with root package name */
    final Consumer f21386b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(Consumer consumer, boolean z10) {
        super(z10);
        this.f21386b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f21386b.accept(obj);
    }
}
