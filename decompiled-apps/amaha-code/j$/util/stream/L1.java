package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
/* loaded from: classes3.dex */
final class L1 extends AbstractC0850z0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f21320h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ BiConsumer f21321i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Supplier f21322j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Collector f21323k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(EnumC0770h3 enumC0770h3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(enumC0770h3);
        this.f21320h = binaryOperator;
        this.f21321i = biConsumer;
        this.f21322j = supplier;
        this.f21323k = collector;
    }

    @Override // j$.util.stream.AbstractC0850z0
    public final U1 G0() {
        return new M1(this.f21322j, this.f21321i, this.f21320h);
    }

    @Override // j$.util.stream.AbstractC0850z0, j$.util.stream.P3
    public final int o() {
        if (this.f21323k.characteristics().contains(EnumC0781k.UNORDERED)) {
            return EnumC0765g3.r;
        }
        return 0;
    }
}
