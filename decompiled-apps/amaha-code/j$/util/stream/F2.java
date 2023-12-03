package j$.util.stream;

import java.util.Comparator;
/* loaded from: classes3.dex */
abstract class F2 extends AbstractC0799n2 {

    /* renamed from: b  reason: collision with root package name */
    protected final Comparator f21283b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f21284c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F2(InterfaceC0818r2 interfaceC0818r2, Comparator comparator) {
        super(interfaceC0818r2);
        this.f21283b = comparator;
    }

    @Override // j$.util.stream.AbstractC0799n2, j$.util.stream.InterfaceC0818r2
    public final boolean e() {
        this.f21284c = true;
        return false;
    }
}
