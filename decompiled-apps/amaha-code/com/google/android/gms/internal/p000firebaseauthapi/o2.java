package com.google.android.gms.internal.p000firebaseauthapi;

import hc.d;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o2  reason: invalid package */
/* loaded from: classes.dex */
public final class o2 extends v2 {
    public o2(int i6) {
        super(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.v2
    public final void a() {
        Iterable<Map.Entry> entrySet;
        if (!this.f8191x) {
            for (int i6 = 0; i6 < b(); i6++) {
                Map.Entry entry = (Map.Entry) this.f8189v.get(i6);
                if (((v0) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.f8190w.isEmpty()) {
                entrySet = d.T;
            } else {
                entrySet = this.f8190w.entrySet();
            }
            for (Map.Entry entry2 : entrySet) {
                if (((v0) entry2.getKey()).c()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
