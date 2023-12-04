package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzcp {
    private static volatile zzdh zza;

    private zzcp() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:6|(3:10|11|12)|18|(2:20|(1:22))|23|24|25|26|27|28|(1:30)(1:80)|31|(10:33|34|35|36|37|38|(2:39|(3:41|(3:56|57|58)(7:43|44|(2:46|(1:49))|50|(1:52)|53|54)|55)(1:59))|60|61|62)(1:79)|63|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = com.google.android.gms.internal.auth.zzdh.zzc();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzdh zza(Context context) {
        zzdh zzdhVar;
        zzdh zzc;
        boolean isDeviceProtectedStorage;
        synchronized (zzcp.class) {
            zzdhVar = zza;
            if (zzdhVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                    zzc = zzdh.zzc();
                    zzdhVar = zzc;
                    zza = zzdhVar;
                }
                if (zzcc.zzb()) {
                    isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                    if (!isDeviceProtectedStorage) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                }
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                zzdh zzc2 = file.exists() ? zzdh.zzd(file) : zzdh.zzc();
                if (zzc2.zzb()) {
                    File file2 = (File) zzc2.zza();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                        try {
                            SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                            HashMap hashMap = new HashMap();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String[] split = readLine.split(" ", 3);
                                if (split.length != 3) {
                                    Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                } else {
                                    String str3 = new String(split[0]);
                                    String decode = Uri.decode(new String(split[1]));
                                    String str4 = (String) hashMap.get(split[2]);
                                    if (str4 == null) {
                                        String str5 = new String(split[2]);
                                        str4 = Uri.decode(str5);
                                        if (str4.length() < 1024 || str4 == str5) {
                                            hashMap.put(str5, str4);
                                        }
                                    }
                                    if (!simpleArrayMap.containsKey(str3)) {
                                        simpleArrayMap.put(str3, new SimpleArrayMap());
                                    }
                                    ((SimpleArrayMap) simpleArrayMap.get(str3)).put(decode, str4);
                                }
                            }
                            String obj = file2.toString();
                            String packageName = context.getPackageName();
                            Log.w("HermeticFileOverrides", "Parsed " + obj + " for Android package " + packageName);
                            zzci zzciVar = new zzci(simpleArrayMap);
                            bufferedReader.close();
                            zzc = zzdh.zzd(zzciVar);
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    zzc = zzdh.zzc();
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                zzdhVar = zzc;
                zza = zzdhVar;
            }
        }
        return zzdhVar;
    }
}
