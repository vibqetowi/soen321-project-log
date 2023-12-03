package j$.util.stream;

import java.util.function.LongBinaryOperator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class A1 extends AbstractC0850z0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f21248h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ long f21249i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(EnumC0770h3 enumC0770h3, LongBinaryOperator longBinaryOperator, long j10) {
        super(enumC0770h3);
        this.f21248h = longBinaryOperator;
        this.f21249i = j10;
    }

    @Override // j$.util.stream.AbstractC0850z0
    public final U1 G0() {
        return new S1(this.f21249i, this.f21248h);
    }
}
