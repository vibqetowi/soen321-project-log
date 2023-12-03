package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class A3 implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21251a;

    public /* synthetic */ A3(int i6) {
        this.f21251a = i6;
    }

    public final /* synthetic */ LongConsumer a(LongConsumer longConsumer) {
        switch (this.f21251a) {
            case 0:
                return AbstractC0689a.f(this, longConsumer);
            default:
                return AbstractC0689a.f(this, longConsumer);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
    }
}
