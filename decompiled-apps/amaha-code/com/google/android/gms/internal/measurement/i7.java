package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class i7 extends i {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f8427w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.appcompat.widget.l f8428x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(androidx.appcompat.widget.l lVar) {
        super("getValue");
        this.f8428x = lVar;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final o a(v.c cVar, List list) {
        switch (this.f8427w) {
            case 0:
                l3.h(2, "getValue", list);
                o i6 = cVar.i((o) list.get(0));
                o i10 = cVar.i((o) list.get(1));
                String g5 = i6.g();
                androidx.appcompat.widget.l lVar = this.f8428x;
                String str = null;
                Map map = (Map) ((ta.r3) lVar.f1472w).f32843x.getOrDefault((String) lVar.f1471v, null);
                if (map != null && map.containsKey(g5)) {
                    str = (String) map.get(g5);
                }
                if (str != null) {
                    return new r(str);
                }
                return i10;
            default:
                return o.f8520d;
        }
    }

    public i7(androidx.appcompat.widget.l lVar, int i6) {
        super("internal.remoteConfig");
        this.f8428x = lVar;
        this.f8420v.put("getValue", new i7(lVar));
    }
}
