package j$.util.stream;

import java.util.HashSet;
/* renamed from: j$.util.stream.q  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0811q extends AbstractC0799n2 {

    /* renamed from: b  reason: collision with root package name */
    HashSet f21537b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0811q(InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f21537b.contains(obj)) {
            return;
        }
        this.f21537b.add(obj);
        this.f21519a.accept((InterfaceC0818r2) obj);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21537b = new HashSet();
        this.f21519a.c(-1L);
    }

    @Override // j$.util.stream.AbstractC0799n2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        this.f21537b = null;
        this.f21519a.end();
    }
}
