package com.google.common.collect;

import com.google.common.collect.k;
import java.util.Map;
/* compiled from: CompactHashMap.java */
/* loaded from: classes.dex */
public final class i extends k<Object, Object>.b<Map.Entry<Object, Object>> {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ k f9392y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super();
        this.f9392y = kVar;
    }

    @Override // com.google.common.collect.k.b
    public final Map.Entry<Object, Object> a(int i6) {
        return new k.d(i6);
    }
}
