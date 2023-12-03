package j$.util;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.p  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0728p implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f21244a;

    public /* synthetic */ C0728p(Consumer consumer) {
        this.f21244a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f21244a.accept(Double.valueOf(d10));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }
}
