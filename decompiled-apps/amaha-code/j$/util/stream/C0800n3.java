package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.n3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0800n3 extends AbstractC0805o3 implements Consumer {

    /* renamed from: b  reason: collision with root package name */
    final Object[] f21520b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0800n3(int i6) {
        this.f21520b = new Object[i6];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f21527a;
        this.f21527a = i6 + 1;
        this.f21520b[i6] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }
}
