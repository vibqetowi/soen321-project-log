package com.google.firebase.messaging;

import com.google.firebase.perf.config.RemoteConfigManager;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ya.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9762a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9763b;

    public /* synthetic */ n(int i6, Object obj) {
        this.f9762a = i6;
        this.f9763b = obj;
    }

    @Override // ya.f
    public final void onSuccess(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f9762a) {
            case 0:
                h0 h0Var = (h0) obj;
                c0 c0Var = FirebaseMessaging.f9641m;
                if (((FirebaseMessaging) this.f9763b).f()) {
                    if (h0Var.f9729h.a() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (h0Var) {
                            z11 = h0Var.f9728g;
                        }
                        if (!z11) {
                            h0Var.h(0L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                RemoteConfigManager.a((RemoteConfigManager) this.f9763b, (Boolean) obj);
                return;
        }
    }
}
