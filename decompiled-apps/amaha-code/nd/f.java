package nd;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
/* compiled from: CommonUtils.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f26050a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static long f26051b = -1;

    /* compiled from: CommonUtils.java */
    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        X86_32,
        /* JADX INFO: Fake field, exist only in values array */
        X86_64,
        /* JADX INFO: Fake field, exist only in values array */
        ARM_UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        PPC,
        /* JADX INFO: Fake field, exist only in values array */
        PPC64,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV6,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7,
        UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7S,
        /* JADX INFO: Fake field, exist only in values array */
        ARM64;
        

        /* renamed from: v  reason: collision with root package name */
        public static final HashMap f26053v;

        static {
            a aVar;
            a aVar2;
            a aVar3;
            a aVar4;
            HashMap hashMap = new HashMap(4);
            f26053v = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    public static long b(int i6, String str, String str2) {
        return Long.parseLong(str.split(str2)[0].trim()) * i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        r3 = r4[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(File file) {
        BufferedReader bufferedReader;
        String str = null;
        str = null;
        str = null;
        BufferedReader bufferedReader2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                            if (split.length > 1 && split[0].equals("MemTotal")) {
                                break;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Log.e("FirebaseCrashlytics", "Error parsing " + file, e);
                            a(bufferedReader, "Failed to close system file reader.");
                            return str;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        a(bufferedReader2, "Failed to close system file reader.");
                        throw th;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                a(bufferedReader2, "Failed to close system file reader.");
                throw th;
            }
            a(bufferedReader, "Failed to close system file reader.");
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int d() {
        boolean z10;
        boolean i6 = i();
        ?? r02 = i6;
        if (j()) {
            r02 = (i6 ? 1 : 0) | true;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return r02 | 4;
        }
        return r02;
    }

    public static String e(Context context) {
        int f = f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (f == 0) {
            f = f(context, "com.crashlytics.android.build_id", "string");
        }
        if (f != 0) {
            return context.getResources().getString(f);
        }
        return null;
    }

    public static int f(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i6 = context.getApplicationContext().getApplicationInfo().icon;
        if (i6 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i6);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static synchronized long g() {
        long j10;
        long j11;
        synchronized (f.class) {
            if (f26051b == -1) {
                String c10 = c(new File("/proc/meminfo"));
                if (!TextUtils.isEmpty(c10)) {
                    String upperCase = c10.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j11 = b(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, upperCase, "KB");
                        } else if (upperCase.endsWith("MB")) {
                            j11 = b(1048576, upperCase, "MB");
                        } else if (upperCase.endsWith("GB")) {
                            j11 = b(1073741824, upperCase, "GB");
                        } else {
                            Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: ".concat(upperCase), null);
                        }
                    } catch (NumberFormatException e10) {
                        Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e10);
                    }
                    f26051b = j11;
                }
                j11 = 0;
                f26051b = j11;
            }
            j10 = f26051b;
        }
        return j10;
    }

    public static String h(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            int i10 = bArr[i6] & 255;
            int i11 = i6 * 2;
            char[] cArr2 = f26050a;
            cArr[i11] = cArr2[i10 >>> 4];
            cArr[i11 + 1] = cArr2[i10 & 15];
        }
        return new String(cArr);
    }

    public static boolean i() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean j() {
        boolean i6 = i();
        String str = Build.TAGS;
        if ((!i6 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!i6 && file.exists()) {
            return true;
        }
        return false;
    }

    public static String k(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return h(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return "";
        }
    }

    public static String l(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }
}
