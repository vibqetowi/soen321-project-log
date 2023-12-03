package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.h0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0767h0 implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0818r2 f21484a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f21484a.accept(j10);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }
}
