package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements m4 {

    /* renamed from: u  reason: collision with root package name */
    public Context f8726u;

    public /* synthetic */ z3() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|(2:10|11)|17|(1:19)(1:83)|(2:21|(1:23))|24|25|26|27|28|(1:30)(1:79)|31|(9:33|34|35|36|37|(2:38|(3:40|(3:55|56|57)(7:42|43|(2:45|(1:48))|49|(1:51)|52|53)|54)(1:58))|59|60|61)(1:78)|62|11) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r6 = com.google.android.gms.internal.measurement.j4.f8443u;
     */
    @Override // com.google.android.gms.internal.measurement.m4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        k4 k4Var;
        boolean z10;
        k4 k4Var2;
        k4 k4Var3;
        boolean isDeviceProtectedStorage;
        Context context = this.f8726u;
        Object obj = h4.f;
        synchronized (v3.class) {
            k4Var = v3.f8631a;
            if (k4Var == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                    k4Var = j4.f8443u;
                    v3.f8631a = k4Var;
                }
                UserManager userManager = n3.f8482a;
                if (Build.VERSION.SDK_INT >= 24) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                    if (!isDeviceProtectedStorage) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                }
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (file.exists()) {
                    k4Var2 = new l4(file);
                } else {
                    k4Var2 = j4.f8443u;
                }
                if (k4Var2.b()) {
                    File file2 = (File) k4Var2.a();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                        try {
                            t.h hVar = new t.h();
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
                                    if (!hVar.containsKey(str3)) {
                                        hVar.put(str3, new t.h());
                                    }
                                    ((t.h) hVar.getOrDefault(str3, null)).put(decode, str4);
                                }
                            }
                            String obj2 = file2.toString();
                            String packageName = context.getPackageName();
                            Log.w("HermeticFileOverrides", "Parsed " + obj2 + " for Android package " + packageName);
                            s3 s3Var = new s3(hVar);
                            bufferedReader.close();
                            k4Var3 = new l4(s3Var);
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                } catch (Exception unused) {
                                }
                            }
                            throw th2;
                        }
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    k4Var3 = j4.f8443u;
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                k4Var = k4Var3;
                v3.f8631a = k4Var;
            }
        }
        return k4Var;
    }

    public /* synthetic */ z3(Context context) {
        this.f8726u = context;
    }
}
