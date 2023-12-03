package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.t  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0825t implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0818r2 f21551a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f21551a.accept(d10);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }
}
