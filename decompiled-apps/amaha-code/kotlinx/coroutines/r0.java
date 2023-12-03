package kotlinx.coroutines;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public abstract class r0 extends a0 {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f23645z = 0;

    /* renamed from: w  reason: collision with root package name */
    public long f23646w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f23647x;

    /* renamed from: y  reason: collision with root package name */
    public jg.b f23648y;

    public final void L0(boolean z10) {
        long j10;
        long j11 = this.f23646w;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        long j12 = j11 - j10;
        this.f23646w = j12;
        if (j12 <= 0 && this.f23647x) {
            shutdown();
        }
    }

    public final void M0(m0<?> m0Var) {
        jg.b bVar = this.f23648y;
        if (bVar == null) {
            bVar = new jg.b();
            this.f23648y = bVar;
        }
        Object[] objArr = bVar.f22016d;
        int i6 = bVar.f22015c;
        objArr[i6] = m0Var;
        int length = (objArr.length - 1) & (i6 + 1);
        bVar.f22015c = length;
        int i10 = bVar.f22014b;
        if (length == i10) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            is.i.K1(objArr, objArr2, 0, i10, 0, 10);
            Object[] objArr3 = bVar.f22016d;
            int length3 = objArr3.length;
            int i11 = bVar.f22014b;
            is.i.K1(objArr3, objArr2, length3 - i11, 0, i11, 4);
            bVar.f22016d = objArr2;
            bVar.f22014b = 0;
            bVar.f22015c = length2;
        }
    }

    public final void N0(boolean z10) {
        long j10;
        long j11 = this.f23646w;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.f23646w = j10 + j11;
        if (!z10) {
            this.f23647x = true;
        }
    }

    public long O0() {
        if (!P0()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean P0() {
        jg.b bVar = this.f23648y;
        if (bVar == null) {
            return false;
        }
        int i6 = bVar.f22014b;
        m0 m0Var = null;
        if (i6 != bVar.f22015c) {
            ?? r32 = bVar.f22016d;
            ?? r62 = r32[i6];
            r32[i6] = 0;
            bVar.f22014b = (i6 + 1) & (r32.length - 1);
            if (r62 != 0) {
                m0Var = r62;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
        }
        m0 m0Var2 = m0Var;
        if (m0Var2 == null) {
            return false;
        }
        m0Var2.run();
        return true;
    }

    public void shutdown() {
    }
}
