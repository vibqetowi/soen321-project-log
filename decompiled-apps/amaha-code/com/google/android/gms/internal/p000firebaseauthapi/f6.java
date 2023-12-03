package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f6  reason: invalid package */
/* loaded from: classes.dex */
public final class f6 implements b4 {

    /* renamed from: a  reason: collision with root package name */
    public KeyStore f7850a;

    public f6() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                this.f7850a = keyStore;
                return;
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
        throw new IllegalStateException("need Android Keystore on Android M or newer");
    }

    public final synchronized boolean a(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w("f6", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f7850a = keyStore;
                keyStore.load(null);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            } catch (InterruptedException unused2) {
            }
            return this.f7850a.containsAlias(str2);
        }
        return this.f7850a.containsAlias(mc.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b4
    public final synchronized e6 e(String str) {
        e6 e6Var;
        e6Var = new e6(mc.a(str), this.f7850a);
        byte[] a10 = kc.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a10, e6Var.a(e6Var.b(a10, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return e6Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b4
    public final synchronized boolean f(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return true;
        }
        return false;
    }
}
