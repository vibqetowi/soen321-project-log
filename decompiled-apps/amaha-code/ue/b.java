package ue;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.R;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import sc.e;
import sc.f;
/* compiled from: IidStore.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f34038c = {"*", "FCM", "GCM", ""};

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f34039a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34040b;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r1.isEmpty() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(e eVar) {
        eVar.b();
        this.f34039a = eVar.f31432a.getSharedPreferences("com.google.android.gms.appid", 0);
        eVar.b();
        f fVar = eVar.f31434c;
        String str = fVar.f31448e;
        if (str == null) {
            eVar.b();
            str = fVar.f31445b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.f34040b = str;
    }

    public final String a() {
        String string;
        synchronized (this.f34039a) {
            string = this.f34039a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKey;
        synchronized (this.f34039a) {
            String str = null;
            String string = this.f34039a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
