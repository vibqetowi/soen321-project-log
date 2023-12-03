package kotlinx.coroutines;
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class q0 implements y0 {

    /* renamed from: u  reason: collision with root package name */
    public final boolean f23644u;

    public q0(boolean z10) {
        this.f23644u = z10;
    }

    @Override // kotlinx.coroutines.y0
    public final boolean a() {
        return this.f23644u;
    }

    @Override // kotlinx.coroutines.y0
    public final l1 f() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f23644u) {
            str = "Active";
        } else {
            str = "New";
        }
        return v.g.c(sb2, str, '}');
    }
}
