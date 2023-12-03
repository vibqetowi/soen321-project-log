package gd;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.c6;
import com.google.android.gms.internal.p000firebaseauthapi.d6;
import com.google.android.gms.internal.p000firebaseauthapi.j5;
import com.google.android.gms.internal.p000firebaseauthapi.n5;
import com.google.android.gms.internal.p000firebaseauthapi.o3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c  reason: collision with root package name */
    public static c0 f16396c;

    /* renamed from: a  reason: collision with root package name */
    public final String f16397a;

    /* renamed from: b  reason: collision with root package name */
    public final d6 f16398b;

    public c0(Context context, String str) {
        d6 d6Var;
        c6 c6Var;
        String format;
        this.f16397a = str;
        try {
            j5.a();
            c6Var = new c6();
            c6Var.b(context, String.format("com.google.firebase.auth.api.crypto.%s", str));
            c6Var.a(n5.f8004a);
            format = String.format("android-keystore://firebear_master_key_id.%s", str);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e10.getMessage())));
            d6Var = null;
        }
        if (format.startsWith("android-keystore://")) {
            c6Var.f7753b = format;
            d6Var = c6Var.c();
            this.f16398b = d6Var;
            return;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c0 a(Context context, String str) {
        boolean z10;
        c0 c0Var = f16396c;
        if (c0Var != null) {
            String str2 = c0Var.f16397a;
            if (str2 != str && (str2 == null || !str2.equals(str))) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        f16396c = new c0(context, str);
        return f16396c;
    }

    public final String b(String str) {
        String str2;
        d6 d6Var = this.f16398b;
        if (d6Var != null) {
            try {
                synchronized (d6Var) {
                    str2 = new String(((o3) this.f16398b.a().b()).a(Base64.decode(str, 8)), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
                Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e10.getMessage())));
                return null;
            }
        }
        Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
        return null;
    }

    public final String c() {
        if (this.f16398b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g.x xVar = new g.x(15, byteArrayOutputStream);
        try {
            synchronized (this.f16398b) {
                this.f16398b.a().a().d(xVar);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }
}
