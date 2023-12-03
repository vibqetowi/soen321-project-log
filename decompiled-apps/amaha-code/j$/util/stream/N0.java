package j$.util.stream;

import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N0 extends Q0 {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f21341k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(int i6, j$.util.S s10, AbstractC0850z0 abstractC0850z0) {
        super(abstractC0850z0, s10, new C0736b(27), new C0736b(28));
        if (i6 == 1) {
            super(abstractC0850z0, s10, new C0736b(29), new O0(0));
        } else if (i6 != 2) {
        } else {
            super(abstractC0850z0, s10, new O0(1), new O0(2));
        }
    }

    public /* synthetic */ N0(j$.util.S s10, AbstractC0850z0 abstractC0850z0, IntFunction intFunction) {
        super(abstractC0850z0, s10, new P0(intFunction), new O0(3));
    }
}
