package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
/* loaded from: classes7.dex */
public class CommonUtils {
    static final String BUILD_IDS_ARCH_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_arch";
    static final String BUILD_IDS_BUILD_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_build_id";
    static final String BUILD_IDS_LIB_NAMES_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_lib";
    static final int BYTES_IN_A_GIGABYTE = 1073741824;
    static final int BYTES_IN_A_KILOBYTE = 1024;
    static final int BYTES_IN_A_MEGABYTE = 1048576;
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    private static final String GOLDFISH = "goldfish";
    static final String LEGACY_MAPPING_FILE_ID_RESOURCE_NAME = "com.crashlytics.android.build_id";
    public static final String LEGACY_SHARED_PREFS_NAME = "com.crashlytics.prefs";
    static final String MAPPING_FILE_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.mapping_file_id";
    private static final String RANCHU = "ranchu";
    private static final String SDK = "sdk";
    private static final String SHA1_INSTANCE = "SHA-1";
    public static final String SHARED_PREFS_NAME = "com.google.firebase.crashlytics";
    private static final long UNCALCULATED_TOTAL_RAM = -1;
    private static final char[] HEX_VALUES = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long totalRamInBytes = -1;

    @Deprecated
    public static boolean isLoggingEnabled(Context context) {
        return false;
    }

    public static SharedPreferences getSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static SharedPreferences getLegacySharedPrefs(Context context) {
        return context.getSharedPreferences(LEGACY_SHARED_PREFS_NAME, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r3[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String extractFieldFromSystemFile(File file, String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        str2 = null;
        str2 = null;
        BufferedReader bufferedReader2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                            if (split.length > 1 && split[0].equals(str)) {
                                break;
                            }
                        } catch (Exception e) {
                            e = e;
                            Logger.getLogger().e("Error parsing " + file, e);
                            closeOrLog(bufferedReader, "Failed to close system file reader.");
                            return str2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        closeOrLog(bufferedReader2, "Failed to close system file reader.");
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                closeOrLog(bufferedReader2, "Failed to close system file reader.");
                throw th;
            }
            closeOrLog(bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    public static int getCpuArchitectureInt() {
        return Architecture.getValue().ordinal();
    }

    /* loaded from: classes7.dex */
    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> matcher;

        static {
            Architecture architecture = X86_32;
            Architecture architecture2 = ARMV6;
            Architecture architecture3 = ARMV7;
            Architecture architecture4 = ARM64;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                Logger.getLogger().v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }
    }

    public static synchronized long getTotalRamInBytes() {
        long j;
        long convertMemInfoToBytes;
        synchronized (CommonUtils.class) {
            if (totalRamInBytes == -1) {
                String extractFieldFromSystemFile = extractFieldFromSystemFile(new File("/proc/meminfo"), "MemTotal");
                long j2 = 0;
                if (!TextUtils.isEmpty(extractFieldFromSystemFile)) {
                    String upperCase = extractFieldFromSystemFile.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            convertMemInfoToBytes = convertMemInfoToBytes(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            convertMemInfoToBytes = convertMemInfoToBytes(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            convertMemInfoToBytes = convertMemInfoToBytes(upperCase, "GB", 1073741824);
                        } else {
                            Logger logger = Logger.getLogger();
                            logger.w("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                        j2 = convertMemInfoToBytes;
                    } catch (NumberFormatException e) {
                        Logger logger2 = Logger.getLogger();
                        logger2.e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                totalRamInBytes = j2;
            }
            j = totalRamInBytes;
        }
        return j;
    }

    static long convertMemInfoToBytes(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * i;
    }

    public static ActivityManager.RunningAppProcessInfo getAppProcessInfo(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static String streamToString(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static String sha1(String str) {
        return hash(str, "SHA-1");
    }

    private static String hash(String str, String str2) {
        return hash(str.getBytes(), str2);
    }

    private static String hash(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return hexify(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Logger logger = Logger.getLogger();
            logger.e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    public static String createInstanceIdFrom(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            sb.append(str2);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return sha1(sb2);
        }
        return null;
    }

    public static long calculateFreeRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long calculateUsedDiskSpaceInBytes(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    public static boolean getProximitySensorEnabled(Context context) {
        return (isEmulator() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static boolean getBooleanResourceValue(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int resourcesIdentifier = getResourcesIdentifier(context, str, "bool");
            if (resourcesIdentifier > 0) {
                return resources.getBoolean(resourcesIdentifier);
            }
            int resourcesIdentifier2 = getResourcesIdentifier(context, str, TypedValues.Custom.S_STRING);
            if (resourcesIdentifier2 > 0) {
                return Boolean.parseBoolean(context.getString(resourcesIdentifier2));
            }
        }
        return z;
    }

    public static int getResourcesIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, getResourcePackageName(context));
    }

    public static boolean isEmulator() {
        return Build.PRODUCT.contains("sdk") || Build.HARDWARE.contains(GOLDFISH) || Build.HARDWARE.contains(RANCHU);
    }

    public static boolean isRooted() {
        boolean isEmulator = isEmulator();
        String str = Build.TAGS;
        if ((isEmulator || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !isEmulator && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean isDebuggerAttached() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int getDeviceState() {
        boolean isEmulator = isEmulator();
        ?? r0 = isEmulator;
        if (isRooted()) {
            r0 = (isEmulator ? 1 : 0) | true;
        }
        return isDebuggerAttached() ? r0 | 4 : r0;
    }

    public static String hexify(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = HEX_VALUES;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static boolean isAppDebuggable(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String getStringsFileValue(Context context, String str) {
        int resourcesIdentifier = getResourcesIdentifier(context, str, TypedValues.Custom.S_STRING);
        return resourcesIdentifier > 0 ? context.getString(resourcesIdentifier) : "";
    }

    public static void closeOrLog(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Logger.getLogger().e(str, e);
            }
        }
    }

    public static String padWithZerosToMaxIntWidth(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i)).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String getResourcePackageName(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static String getMappingFileId(Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, MAPPING_FILE_ID_RESOURCE_NAME, TypedValues.Custom.S_STRING);
        if (resourcesIdentifier == 0) {
            resourcesIdentifier = getResourcesIdentifier(context, LEGACY_MAPPING_FILE_ID_RESOURCE_NAME, TypedValues.Custom.S_STRING);
        }
        if (resourcesIdentifier != 0) {
            return context.getResources().getString(resourcesIdentifier);
        }
        return null;
    }

    public static List<BuildIdInfo> getBuildIdInfo(Context context) {
        ArrayList arrayList = new ArrayList();
        int resourcesIdentifier = getResourcesIdentifier(context, BUILD_IDS_LIB_NAMES_RESOURCE_NAME, "array");
        int resourcesIdentifier2 = getResourcesIdentifier(context, BUILD_IDS_ARCH_RESOURCE_NAME, "array");
        int resourcesIdentifier3 = getResourcesIdentifier(context, BUILD_IDS_BUILD_ID_RESOURCE_NAME, "array");
        if (resourcesIdentifier == 0 || resourcesIdentifier2 == 0 || resourcesIdentifier3 == 0) {
            Logger.getLogger().d(String.format("Could not find resources: %d %d %d", Integer.valueOf(resourcesIdentifier), Integer.valueOf(resourcesIdentifier2), Integer.valueOf(resourcesIdentifier3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(resourcesIdentifier);
        String[] stringArray2 = context.getResources().getStringArray(resourcesIdentifier2);
        String[] stringArray3 = context.getResources().getStringArray(resourcesIdentifier3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            Logger.getLogger().d(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i = 0; i < stringArray3.length; i++) {
            arrayList.add(new BuildIdInfo(stringArray[i], stringArray2[i], stringArray3[i]));
        }
        return arrayList;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean checkPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean canTryConnection(Context context) {
        if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        return true;
    }

    public static boolean nullSafeEquals(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
