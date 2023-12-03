package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class C1 extends AbstractC0850z0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f21261h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f21262i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1(EnumC0770h3 enumC0770h3, Object obj, int i6) {
        super(enumC0770h3);
        this.f21261h = i6;
        this.f21262i = obj;
    }

    @Override // j$.util.stream.AbstractC0850z0
    public final U1 G0() {
        int i6 = this.f21261h;
        Object obj = this.f21262i;
        switch (i6) {
            case 0:
                return new T1((LongBinaryOperator) obj);
            case 1:
                return new F1((DoubleBinaryOperator) obj);
            case 2:
                return new K1((BinaryOperator) obj);
            default:
                return new Q1((IntBinaryOperator) obj);
        }
    }
}
