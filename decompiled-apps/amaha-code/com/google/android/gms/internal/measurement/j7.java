package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class j7 extends p7 {
    public j7(int i6) {
        super(i6);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void a() {
        Iterable<Map.Entry> entrySet;
        if (!this.f8554x) {
            for (int i6 = 0; i6 < b(); i6++) {
                Map.Entry entry = (Map.Entry) this.f8552v.get(i6);
                if (((m5) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.f8553w.isEmpty()) {
                entrySet = kc.f.f23235y;
            } else {
                entrySet = this.f8553w.entrySet();
            }
            for (Map.Entry entry2 : entrySet) {
                if (((m5) entry2.getKey()).c()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
