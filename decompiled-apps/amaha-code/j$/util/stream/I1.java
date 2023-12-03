package j$.util.stream;

import java.util.function.DoubleBinaryOperator;
/* loaded from: classes3.dex */
final class I1 extends AbstractC0850z0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f21296h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ double f21297i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(EnumC0770h3 enumC0770h3, DoubleBinaryOperator doubleBinaryOperator, double d10) {
        super(enumC0770h3);
        this.f21296h = doubleBinaryOperator;
        this.f21297i = d10;
    }

    @Override // j$.util.stream.AbstractC0850z0
    public final U1 G0() {
        return new D1(this.f21297i, this.f21296h);
    }
}
