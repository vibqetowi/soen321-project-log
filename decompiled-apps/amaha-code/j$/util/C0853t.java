package j$.util;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.t  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0853t implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f21612a;

    public /* synthetic */ C0853t(Consumer consumer) {
        this.f21612a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.f21612a.accept(Integer.valueOf(i6));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }
}
