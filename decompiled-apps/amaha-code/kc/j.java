package kc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import mc.l;
import mc.m;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final mc.g f23246a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23247b;

    /* renamed from: c  reason: collision with root package name */
    public final l f23248c;

    public j(Context context, mc.g gVar) {
        boolean z10;
        String str;
        this.f23247b = context.getPackageName();
        this.f23246a = gVar;
        mc.g gVar2 = m.f25035a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (r3 = signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    Object[] objArr = new Object[0];
                    mc.g gVar3 = m.f25035a;
                    gVar3.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", mc.g.b(gVar3.f25015a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        z10 = false;
        if (!z10) {
            Object[] objArr2 = new Object[0];
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", mc.g.b(gVar.f25015a, "Phonesky is not installed.", objArr2));
            }
            this.f23248c = null;
            return;
        }
        this.f23248c = new l(context, gVar, k.f23249a);
    }
}
