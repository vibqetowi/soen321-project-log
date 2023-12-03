package wu;

import java.util.ArrayList;
import java.util.List;
/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes2.dex */
public final class o0 extends z0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<x0> f37282c;

    public o0(ArrayList arrayList) {
        this.f37282c = arrayList;
    }

    @Override // wu.z0
    public final d1 g(x0 key) {
        kotlin.jvm.internal.i.g(key, "key");
        if (this.f37282c.contains(key)) {
            gt.g a10 = key.a();
            kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return k1.m((gt.v0) a10);
        }
        return null;
    }
}
