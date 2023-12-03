package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.i5;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z  reason: invalid package */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8263a = 2;

    /* renamed from: b  reason: collision with root package name */
    public int f8264b;

    /* renamed from: c  reason: collision with root package name */
    public long f8265c;

    /* renamed from: d  reason: collision with root package name */
    public Object f8266d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f8267e;

    public z(r0 r0Var) {
        r0Var.getClass();
        this.f8267e = r0Var;
    }

    public final String toString() {
        switch (this.f8263a) {
            case 2:
                return "SyncMeta(id=" + this.f8264b + ", syncInterval=" + this.f8265c + ", syncType='" + ((String) this.f8266d) + "', extras=" + ((PersistableBundle) this.f8267e) + ')';
            default:
                return super.toString();
        }
    }

    public z(i5 i5Var) {
        i5Var.getClass();
        this.f8267e = i5Var;
    }

    public z(int i6, long j10, String str, PersistableBundle persistableBundle) {
        this.f8264b = i6;
        this.f8265c = j10;
        this.f8266d = str;
        this.f8267e = persistableBundle;
    }

    public z(String str, long j10, int i6) {
        this(i6, j10, str, null);
    }
}
