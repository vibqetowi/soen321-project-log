package hc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import ic.r;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final ic.k f17387e = new ic.k("AppUpdateService");
    public static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    public final r f17388a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17389b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f17390c;

    /* renamed from: d  reason: collision with root package name */
    public final l f17391d;

    public k(Context context, l lVar) {
        String str;
        this.f17389b = context.getPackageName();
        this.f17390c = context;
        this.f17391d = lVar;
        ic.k kVar = ic.a.f19924a;
        boolean z10 = false;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (r1 = signatureArr.length) != 0) {
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
                    ic.k kVar2 = ic.a.f19924a;
                    kVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", ic.k.b(kVar2.f19932a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (z10) {
            Context applicationContext = context.getApplicationContext();
            this.f17388a = new r(applicationContext != null ? applicationContext : context, f17387e, f);
        }
    }

    public static Bundle a(k kVar, String str) {
        Map map;
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        HashMap hashMap = ic.i.f19931a;
        Bundle bundle3 = new Bundle();
        synchronized (ic.i.class) {
            HashMap hashMap2 = ic.i.f19931a;
            if (!hashMap2.containsKey("app_update")) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("java", 11004);
                hashMap2.put("app_update", hashMap3);
            }
            map = (Map) hashMap2.get("app_update");
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(kVar.f17390c.getPackageManager().getPackageInfo(kVar.f17390c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            ic.k kVar2 = f17387e;
            Object[] objArr = new Object[0];
            kVar2.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ic.k.b(kVar2.f19932a, "The current version of the app could not be retrieved", objArr));
            }
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }
}
