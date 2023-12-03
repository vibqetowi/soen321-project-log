package j$.util.stream;
/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0751e {

    /* renamed from: a  reason: collision with root package name */
    protected final int f21444a;

    /* renamed from: b  reason: collision with root package name */
    protected int f21445b;

    /* renamed from: c  reason: collision with root package name */
    protected int f21446c;

    /* renamed from: d  reason: collision with root package name */
    protected long[] f21447d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0751e() {
        this.f21444a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0751e(int i6) {
        if (i6 >= 0) {
            this.f21444a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i6 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i6);
    }

    public abstract void clear();

    public final long count() {
        int i6 = this.f21446c;
        return i6 == 0 ? this.f21445b : this.f21447d[i6] + this.f21445b;
    }
}
