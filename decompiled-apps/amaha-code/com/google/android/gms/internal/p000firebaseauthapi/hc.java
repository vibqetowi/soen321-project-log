package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hc  reason: invalid package */
/* loaded from: classes.dex */
public final class hc extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ic f7878a;

    public hc(ic icVar) {
        this.f7878a = icVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        ic icVar = this.f7878a;
        try {
            Mac mac = (Mac) dc.f.a(icVar.f7890v);
            mac.init(icVar.f7891w);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
