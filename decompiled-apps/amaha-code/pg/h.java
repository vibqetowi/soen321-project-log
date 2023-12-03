package pg;
/* compiled from: LogConfig.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f28409a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28410b;

    public h(int i6, boolean z10) {
        this.f28409a = i6;
        this.f28410b = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogConfig(level=");
        sb2.append(this.f28409a);
        sb2.append(", isEnabledForReleaseBuild=");
        return defpackage.c.t(sb2, this.f28410b, ')');
    }
}
