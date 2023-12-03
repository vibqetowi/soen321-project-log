package mh;

import kotlin.jvm.internal.i;
import r1.b0;
/* compiled from: DataPointEntity.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f25059a;

    /* renamed from: b  reason: collision with root package name */
    public final long f25060b;

    /* renamed from: c  reason: collision with root package name */
    public final String f25061c;

    public c(long j10, String details, long j11) {
        i.g(details, "details");
        this.f25059a = j10;
        this.f25060b = j11;
        this.f25061c = details;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPoint(id=");
        sb2.append(this.f25059a);
        sb2.append(", time=");
        sb2.append(this.f25060b);
        sb2.append(", details='");
        return b0.b(sb2, this.f25061c, "')");
    }
}
