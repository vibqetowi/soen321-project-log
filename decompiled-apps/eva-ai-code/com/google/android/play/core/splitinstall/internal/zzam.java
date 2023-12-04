package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzam {
    private final com.google.android.play.core.splitcompat.zze zza;
    private final zzah zzb;
    private final Context zzc;
    private final zzal zzd;
    private PackageInfo zze;

    public zzam(Context context, com.google.android.play.core.splitcompat.zze zzeVar, zzah zzahVar) {
        zzal zzalVar = new zzal(new com.google.android.play.core.splitcompat.zza(zzeVar));
        this.zza = zzeVar;
        this.zzb = zzahVar;
        this.zzc = context;
        this.zzd = zzalVar;
    }

    private final PackageInfo zzd() {
        if (this.zze == null) {
            try {
                this.zze = this.zzc.getPackageManager().getPackageInfo(this.zzc.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.zze;
    }

    private static X509Certificate zze(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e("SplitCompat", "Cannot decode certificate.", e);
            return null;
        }
    }

    public final boolean zza(File[] fileArr) throws IOException, XmlPullParserException {
        long j;
        PackageInfo zzd = zzd();
        if (Build.VERSION.SDK_INT >= 28) {
            j = zzd.getLongVersionCode();
        } else {
            j = zzd.versionCode;
        }
        AssetManager assetManager = (AssetManager) zzbk.zzc(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.zzd.zzb(assetManager, fileArr[length]);
        } while (j == this.zzd.zza());
        return false;
    }

    public final boolean zzb(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.zza.zzg(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzc(File[] fileArr) {
        PackageInfo zzd = zzd();
        ArrayList<X509Certificate> arrayList = null;
        if (zzd != null && zzd.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : zzd.signatures) {
                X509Certificate zze = zze(signature);
                if (zze != null) {
                    arrayList.add(zze);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                String absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] zza = zzi.zza(absolutePath);
                    if (zza != null && zza.length != 0 && zza[0].length != 0) {
                        if (!arrayList.isEmpty()) {
                            for (X509Certificate x509Certificate : arrayList) {
                                for (X509Certificate[] x509CertificateArr : zza) {
                                    int i = x509CertificateArr[0].equals(x509Certificate) ? 0 : i + 1;
                                }
                                Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                            }
                        } else {
                            Log.e("SplitCompat", "No certificates found for app.");
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e);
                }
            } catch (Exception e2) {
                Log.e("SplitCompat", "Split verification error.", e2);
                return false;
            }
        }
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }
}
