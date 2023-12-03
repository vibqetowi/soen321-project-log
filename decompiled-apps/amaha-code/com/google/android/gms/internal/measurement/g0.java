package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class g0 extends m0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f8389a = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    public boolean f8390b;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle != null && obj != null) {
            try {
                return cls.cast(obj);
            } catch (ClassCastException e10) {
                Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
                throw e10;
            }
        }
        return null;
    }

    public final String c1(long j10) {
        return (String) R1(z(j10), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final void t(Bundle bundle) {
        synchronized (this.f8389a) {
            this.f8389a.set(bundle);
            this.f8390b = true;
            this.f8389a.notify();
        }
    }

    public final Bundle z(long j10) {
        Bundle bundle;
        synchronized (this.f8389a) {
            if (!this.f8390b) {
                try {
                    this.f8389a.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f8389a.get();
        }
        return bundle;
    }
}
