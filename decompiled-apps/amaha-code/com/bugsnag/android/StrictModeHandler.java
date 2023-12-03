package com.bugsnag.android;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
class StrictModeHandler {
    private static final int DETECT_CUSTOM = 8;
    private static final int DETECT_DISK_READ = 2;
    private static final int DETECT_DISK_WRITE = 1;
    private static final int DETECT_NETWORK = 4;
    private static final int DETECT_RESOURCE_MISMATCH = 16;
    private static final int DETECT_VM_ACTIVITY_LEAKS = 1024;
    private static final int DETECT_VM_CLEARTEXT_NETWORK = 16384;
    private static final int DETECT_VM_CLOSABLE_LEAKS = 512;
    private static final int DETECT_VM_CURSOR_LEAKS = 256;
    private static final int DETECT_VM_FILE_URI_EXPOSURE = 8192;
    private static final int DETECT_VM_INSTANCE_LEAKS = 2048;
    private static final int DETECT_VM_REGISTRATION_LEAKS = 4096;
    private static final Map<Integer, String> POLICY_CODE_MAP;
    private static final String STRICT_MODE_CLZ_NAME = "android.os.strictmode";

    static {
        HashMap hashMap = new HashMap();
        POLICY_CODE_MAP = hashMap;
        hashMap.put(1, "DiskWrite");
        hashMap.put(2, "DiskRead");
        hashMap.put(4, "NetworkOperation");
        hashMap.put(8, "CustomSlowCall");
        hashMap.put(16, "ResourceMismatch");
        hashMap.put(Integer.valueOf((int) DETECT_VM_CURSOR_LEAKS), "CursorLeak");
        hashMap.put(Integer.valueOf((int) DETECT_VM_CLOSABLE_LEAKS), "CloseableLeak");
        hashMap.put(1024, "ActivityLeak");
        hashMap.put(2048, "InstanceLeak");
        hashMap.put(Integer.valueOf((int) DETECT_VM_REGISTRATION_LEAKS), "RegistrationLeak");
        hashMap.put(Integer.valueOf((int) DETECT_VM_FILE_URI_EXPOSURE), "FileUriLeak");
        hashMap.put(Integer.valueOf((int) DETECT_VM_CLEARTEXT_NETWORK), "CleartextNetwork");
    }

    private Throwable getRootCause(Throwable th2) {
        List<Throwable> safeUnrollCauses = ThrowableUtils.safeUnrollCauses(th2);
        return safeUnrollCauses.get(safeUnrollCauses.size() - 1);
    }

    public String getViolationDescription(String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("violation=");
            if (lastIndexOf != -1) {
                String replace = str.substring(lastIndexOf).replace("violation=", "");
                if (TextUtils.isDigitsOnly(replace)) {
                    return POLICY_CODE_MAP.get(Integer.valueOf(replace));
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException();
    }

    public boolean isStrictModeThrowable(Throwable th2) {
        return getRootCause(th2).getClass().getName().toLowerCase(Locale.US).startsWith(STRICT_MODE_CLZ_NAME);
    }
}
