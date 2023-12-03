package yt;

import gt.q0;
import java.util.Map;
/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* loaded from: classes2.dex */
public final class p implements q0 {

    /* renamed from: b  reason: collision with root package name */
    public final tt.m f39054b;

    public p(tt.m packageFragment) {
        kotlin.jvm.internal.i.g(packageFragment, "packageFragment");
        this.f39054b = packageFragment;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        tt.m mVar = this.f39054b;
        sb2.append(mVar);
        sb2.append(": ");
        mVar.getClass();
        sb2.append(((Map) kotlin.jvm.internal.h.C(mVar.C, tt.m.G[0])).keySet());
        return sb2.toString();
    }

    @Override // gt.q0
    public final void a() {
    }
}
