package j$.util.stream;

import java.util.function.IntBinaryOperator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P1 extends AbstractC0850z0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f21358h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f21359i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(EnumC0770h3 enumC0770h3, IntBinaryOperator intBinaryOperator, int i6) {
        super(enumC0770h3);
        this.f21358h = intBinaryOperator;
        this.f21359i = i6;
    }

    @Override // j$.util.stream.AbstractC0850z0
    public final U1 G0() {
        return new O1(this.f21359i, this.f21358h);
    }
}
