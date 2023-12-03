package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0831u1 extends AbstractC0835v1 {

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f21557h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0831u1(j$.util.S s10, AbstractC0850z0 abstractC0850z0, Object[] objArr) {
        super(objArr.length, s10, abstractC0850z0);
        this.f21557h = objArr;
    }

    C0831u1(C0831u1 c0831u1, j$.util.S s10, long j10, long j11) {
        super(c0831u1, s10, j10, j11, c0831u1.f21557h.length);
        this.f21557h = c0831u1.f21557h;
    }

    @Override // j$.util.stream.AbstractC0835v1
    final AbstractC0835v1 a(j$.util.S s10, long j10, long j11) {
        return new C0831u1(this, s10, j10, j11);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f;
        if (i6 >= this.f21572g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.f21557h;
        this.f = i6 + 1;
        objArr[i6] = obj;
    }
}
