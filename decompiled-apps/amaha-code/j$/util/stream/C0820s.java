package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0820s implements BinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21543a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f21544b;

    public /* synthetic */ C0820s(BiConsumer biConsumer, int i6) {
        this.f21543a = i6;
        this.f21544b = biConsumer;
    }

    public final /* synthetic */ BiFunction a(Function function) {
        switch (this.f21543a) {
            case 0:
                return AbstractC0689a.b(this, function);
            case 1:
                return AbstractC0689a.b(this, function);
            default:
                return AbstractC0689a.b(this, function);
        }
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i6 = this.f21543a;
        BiConsumer biConsumer = this.f21544b;
        switch (i6) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            case 1:
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}
