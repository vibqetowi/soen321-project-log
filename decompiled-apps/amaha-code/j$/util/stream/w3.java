package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21583a;

    public /* synthetic */ w3(int i6) {
        this.f21583a = i6;
    }

    public final /* synthetic */ DoubleConsumer a(DoubleConsumer doubleConsumer) {
        switch (this.f21583a) {
            case 0:
                return AbstractC0689a.d(this, doubleConsumer);
            default:
                return AbstractC0689a.d(this, doubleConsumer);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
    }
}
