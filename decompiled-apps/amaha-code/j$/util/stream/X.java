package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class X implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0818r2 f21407a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.f21407a.accept(i6);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }
}
