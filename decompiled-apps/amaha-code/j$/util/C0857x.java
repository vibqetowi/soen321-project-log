package j$.util;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.x  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0857x implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f21615a;

    public /* synthetic */ C0857x(Consumer consumer) {
        this.f21615a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f21615a.accept(Long.valueOf(j10));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }
}
