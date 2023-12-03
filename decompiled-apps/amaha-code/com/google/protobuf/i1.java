package com.google.protobuf;

import com.google.protobuf.r;
import java.util.Map;
/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public final class i1 extends j1<Object, Object> {
    public i1(int i6) {
        super(i6);
    }

    @Override // com.google.protobuf.j1
    public final void h() {
        if (!this.f9981x) {
            for (int i6 = 0; i6 < d(); i6++) {
                ((r.a) c(i6).getKey()).g();
            }
            for (Map.Entry<Object, Object> entry : f()) {
                ((r.a) entry.getKey()).g();
            }
        }
        super.h();
    }

    @Override // com.google.protobuf.j1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((r.a) obj, obj2);
    }
}
