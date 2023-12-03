package s1;
/* compiled from: NavOptions.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31070a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f31071b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31072c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f31073d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f31074e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f31075g;

    /* renamed from: h  reason: collision with root package name */
    public final int f31076h;

    /* renamed from: i  reason: collision with root package name */
    public final int f31077i;

    /* compiled from: NavOptions.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f31078a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f31079b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f31080c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f31081d = -1;
    }

    public a0(boolean z10, boolean z11, int i6, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this.f31070a = z10;
        this.f31071b = z11;
        this.f31072c = i6;
        this.f31073d = z12;
        this.f31074e = z13;
        this.f = i10;
        this.f31075g = i11;
        this.f31076h = i12;
        this.f31077i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.i.b(a0.class, obj.getClass())) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f31070a == a0Var.f31070a && this.f31071b == a0Var.f31071b && this.f31072c == a0Var.f31072c) {
            a0Var.getClass();
            if (kotlin.jvm.internal.i.b(null, null) && this.f31073d == a0Var.f31073d && this.f31074e == a0Var.f31074e && this.f == a0Var.f && this.f31075g == a0Var.f31075g && this.f31076h == a0Var.f31076h && this.f31077i == a0Var.f31077i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f31070a ? 1 : 0) * 31) + (this.f31071b ? 1 : 0)) * 31) + this.f31072c) * 31) + 0) * 31) + (this.f31073d ? 1 : 0)) * 31) + (this.f31074e ? 1 : 0)) * 31) + this.f) * 31) + this.f31075g) * 31) + this.f31076h) * 31) + this.f31077i;
    }
}
