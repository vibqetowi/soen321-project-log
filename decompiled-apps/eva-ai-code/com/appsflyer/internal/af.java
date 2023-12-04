package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
/* loaded from: classes2.dex */
public final class af {
    private static String values;

    public static synchronized String valueOf(WeakReference<Context> weakReference) {
        synchronized (af.class) {
            if (weakReference.get() == null) {
                return values;
            }
            if (values == null) {
                String str = null;
                if (weakReference.get() != null) {
                    str = ac.AFInAppEventType(weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str != null) {
                    values = str;
                } else {
                    try {
                        File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            values = values(file);
                            file.delete();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append("-");
                            sb.append(Math.abs(new SecureRandom().nextLong()));
                            values = sb.toString();
                        }
                        String str2 = values;
                        SharedPreferences.Editor edit = ac.AFInAppEventType(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str2);
                        edit.apply();
                    } catch (Exception e) {
                        AFLogger.valueOf("Error getting AF unique ID", e);
                    }
                }
                if (values != null) {
                    AppsFlyerProperties.getInstance().set("uid", values);
                }
            }
            return values;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String values(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        byte[] bArr2 = null;
        randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                e = e;
                bArr = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bArr2 = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr2);
            randomAccessFile.close();
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                AFLogger.valueOf("Exception while trying to close the InstallationFile", e2);
            }
        } catch (IOException e3) {
            e = e3;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            AFLogger.valueOf("Exception while reading InstallationFile: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e4) {
                    AFLogger.valueOf("Exception while trying to close the InstallationFile", e4);
                }
            }
            bArr2 = bArr;
            if (bArr2 == null) {
            }
            return new String(bArr2);
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e5) {
                    AFLogger.valueOf("Exception while trying to close the InstallationFile", e5);
                }
            }
            throw th;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return new String(bArr2);
    }
}
