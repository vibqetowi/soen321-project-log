package com.google.android.gms.common.api.internal;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class i<L> {

    /* renamed from: a  reason: collision with root package name */
    public volatile L f7385a;

    /* renamed from: b  reason: collision with root package name */
    public volatile a<L> f7386b;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        public final L f7387a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7388b = "castDeviceControllerListenerKey";

        /* JADX WARN: Multi-variable type inference failed */
        public a(k9.e0 e0Var) {
            this.f7387a = e0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7387a == aVar.f7387a && this.f7388b.equals(aVar.f7388b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f7388b.hashCode() + (System.identityHashCode(this.f7387a) * 31);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(Looper looper, k9.e0 e0Var) {
        new ma.c(looper);
        if (e0Var != 0) {
            this.f7385a = e0Var;
            v9.o.e("castDeviceControllerListenerKey");
            this.f7386b = new a<>(e0Var);
            return;
        }
        throw new NullPointerException("Listener must not be null");
    }
}
