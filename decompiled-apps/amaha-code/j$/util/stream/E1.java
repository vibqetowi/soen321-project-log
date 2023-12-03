package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class E1 extends AbstractC0850z0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f21269h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f21270i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Object f21271j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Object f21272k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E1(EnumC0770h3 enumC0770h3, Object obj, Object obj2, Object obj3, int i6) {
        super(enumC0770h3);
        this.f21269h = i6;
        this.f21270i = obj;
        this.f21272k = obj2;
        this.f21271j = obj3;
    }

    @Override // j$.util.stream.AbstractC0850z0
    public final U1 G0() {
        int i6 = this.f21269h;
        Object obj = this.f21270i;
        Object obj2 = this.f21272k;
        Object obj3 = this.f21271j;
        switch (i6) {
            case 0:
                return new B1((Supplier) obj3, (ObjLongConsumer) obj2, (BinaryOperator) obj);
            case 1:
                return new H1((Supplier) obj3, (ObjDoubleConsumer) obj2, (BinaryOperator) obj);
            case 2:
                return new J1(obj3, (BiFunction) obj2, (BinaryOperator) obj);
            case 3:
                return new N1((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new R1((Supplier) obj3, (ObjIntConsumer) obj2, (BinaryOperator) obj);
        }
    }
}
