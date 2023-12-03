package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class q4 extends w4 {
    public q4(int i6) {
        super(i6);
    }

    @Override // com.google.android.gms.internal.cast.w4
    public final void a() {
        Iterable<Map.Entry> entrySet;
        if (!this.f7676x) {
            for (int i6 = 0; i6 < this.f7674v.size(); i6++) {
                t4 t4Var = this.f7674v.get(i6);
                if (((w2) t4Var.getKey()).c()) {
                    t4Var.setValue(Collections.unmodifiableList((List) t4Var.getValue()));
                }
            }
            if (this.f7675w.isEmpty()) {
                entrySet = kotlin.jvm.internal.h.F;
            } else {
                entrySet = this.f7675w.entrySet();
            }
            for (Map.Entry entry : entrySet) {
                if (((w2) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
