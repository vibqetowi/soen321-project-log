package j$.util.stream;
/* loaded from: classes3.dex */
abstract class K0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    protected final I0 f21309a;

    /* renamed from: b  reason: collision with root package name */
    protected final I0 f21310b;

    /* renamed from: c  reason: collision with root package name */
    private final long f21311c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K0(I0 i02, I0 i03) {
        this.f21309a = i02;
        this.f21310b = i03;
        this.f21311c = i02.count() + i03.count();
    }

    @Override // j$.util.stream.I0
    public /* bridge */ /* synthetic */ H0 a(int i6) {
        return (H0) a(i6);
    }

    @Override // j$.util.stream.I0
    public final I0 a(int i6) {
        if (i6 == 0) {
            return this.f21309a;
        }
        if (i6 == 1) {
            return this.f21310b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.f21311c;
    }

    @Override // j$.util.stream.I0
    public final int n() {
        return 2;
    }
}
