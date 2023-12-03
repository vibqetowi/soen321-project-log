package hu;
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes2.dex */
public enum a {
    NO_ARGUMENTS(false, 3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(true, 2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: u  reason: collision with root package name */
    public final boolean f19523u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f19524v;

    /* synthetic */ a(boolean z10, int i6) {
        this((i6 & 1) != 0 ? false : z10, false);
    }

    a(boolean z10, boolean z11) {
        this.f19523u = z10;
        this.f19524v = z11;
    }
}
