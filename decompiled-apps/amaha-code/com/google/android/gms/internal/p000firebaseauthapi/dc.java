package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dc  reason: invalid package */
/* loaded from: classes.dex */
public final class dc {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f7778b = Logger.getLogger(dc.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f7779c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7780d;

    /* renamed from: e  reason: collision with root package name */
    public static final dc f7781e;
    public static final dc f;

    /* renamed from: g  reason: collision with root package name */
    public static final dc f7782g;

    /* renamed from: h  reason: collision with root package name */
    public static final dc f7783h;

    /* renamed from: i  reason: collision with root package name */
    public static final dc f7784i;

    /* renamed from: a  reason: collision with root package name */
    public final fc f7785a;

    static {
        if (c5.a()) {
            f7779c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f7780d = false;
        } else if (lc.a()) {
            f7779c = b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f7780d = true;
        } else {
            f7779c = new ArrayList();
            f7780d = true;
        }
        f7781e = new dc(new d7(13));
        f = new dc(new d7(17));
        f7782g = new dc(new d7(14));
        f7783h = new dc(new d7(16));
        f7784i = new dc(new d7(15));
    }

    public dc(d7 d7Var) {
        this.f7785a = d7Var;
    }

    public static ArrayList b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f7778b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        Iterator it = f7779c.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            fc fcVar = this.f7785a;
            if (hasNext) {
                try {
                    return ((d7) fcVar).a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            } else if (f7780d) {
                return ((d7) fcVar).a(str, null);
            } else {
                throw new GeneralSecurityException("No good Provider found.", exc);
            }
        }
    }
}
