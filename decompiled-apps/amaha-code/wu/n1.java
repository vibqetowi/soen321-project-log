package wu;
/* compiled from: Variance.kt */
/* loaded from: classes2.dex */
public enum n1 {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);
    

    /* renamed from: u  reason: collision with root package name */
    public final String f37278u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f37279v;

    n1(String str, boolean z10) {
        this.f37278u = str;
        this.f37279v = z10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37278u;
    }
}
