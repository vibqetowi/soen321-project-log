package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class y9 extends i {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f8722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9() {
        super("internal.platform");
        this.f8722w = 3;
        this.f8420v.put("getVersion", new y9((Object) null));
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final o a(v.c cVar, List list) {
        switch (this.f8722w) {
            case 0:
            case 1:
                return this;
            case 2:
                return new h(Double.valueOf(0.0d));
            default:
                return o.f8520d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(int i6) {
        super("silent");
        this.f8722w = i6;
        if (i6 != 1) {
        } else {
            super("unmonitored");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(Object obj) {
        super("getVersion");
        this.f8722w = 2;
    }
}
