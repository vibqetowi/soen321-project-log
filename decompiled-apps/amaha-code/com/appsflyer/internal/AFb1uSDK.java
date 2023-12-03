package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
/* loaded from: classes.dex */
public final class AFb1uSDK {
    private static String values;

    public static synchronized String values(WeakReference<Context> weakReference) {
        synchronized (AFb1uSDK.class) {
            if (weakReference.get() == null) {
                return values;
            }
            if (values == null) {
                String str = null;
                if (weakReference.get() != null) {
                    str = AFb1xSDK.valueOf(weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str != null) {
                    values = str;
                } else {
                    try {
                        File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                        if (!file.exists()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(currentTimeMillis);
                            sb2.append("-");
                            sb2.append(Math.abs(new SecureRandom().nextLong()));
                            values = sb2.toString();
                        } else {
                            values = values(file);
                            file.delete();
                        }
                        String str2 = values;
                        SharedPreferences.Editor edit = AFb1xSDK.valueOf(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str2);
                        edit.apply();
                    } catch (Exception e10) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e10);
                    }
                }
                if (values != null) {
                    AppsFlyerProperties.getInstance().set(SessionManager.KEY_UID, values);
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
            } catch (IOException e10) {
                e = e10;
                bArr = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bArr2 = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr2);
            randomAccessFile.close();
            try {
                randomAccessFile.close();
            } catch (IOException e11) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e11);
            }
        } catch (IOException e12) {
            e = e12;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e13) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e13);
                }
            }
            bArr2 = bArr;
            if (bArr2 == null) {
            }
            return new String(bArr2);
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e14) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e14);
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
