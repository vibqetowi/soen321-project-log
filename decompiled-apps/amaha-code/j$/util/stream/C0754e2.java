package j$.util.stream;

import java.util.function.Function;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0754e2 extends AbstractC0774i2 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f21448s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Function f21449t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0754e2(AbstractC0741c abstractC0741c, int i6, Function function, int i10) {
        super(abstractC0741c, i6);
        this.f21448s = i10;
        this.f21449t = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        switch (this.f21448s) {
            case 0:
                return new C0744c2(this, interfaceC0818r2, 2);
            default:
                return new C0759f2(this, interfaceC0818r2);
        }
    }
}
