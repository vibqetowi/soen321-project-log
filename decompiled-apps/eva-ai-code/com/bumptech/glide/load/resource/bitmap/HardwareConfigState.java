package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public final class HardwareConfigState {
    public static final boolean BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED;
    private static final File FD_SIZE_LIST;
    public static final boolean HARDWARE_BITMAPS_SUPPORTED;
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_O = 700;
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_P = 20000;
    private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;
    static final int MIN_HARDWARE_DIMENSION_O = 128;
    private static final int MIN_HARDWARE_DIMENSION_P = 0;
    public static final int NO_MAX_FD_COUNT = -1;
    private static final String TAG = "HardwareConfig";
    private static volatile HardwareConfigState instance;
    private static volatile int manualOverrideMaxFdCount;
    private int decodesSinceLastFdCheck;
    private boolean isFdSizeBelowHardwareLimit = true;
    private final AtomicBoolean isHardwareConfigAllowedByAppState = new AtomicBoolean(false);
    private final boolean isHardwareConfigAllowedByDeviceModel = isHardwareConfigAllowedByDeviceModel();
    private final int minHardwareDimension;
    private final int sdkBasedMaxFdCount;

    static {
        BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = Build.VERSION.SDK_INT < 29;
        HARDWARE_BITMAPS_SUPPORTED = Build.VERSION.SDK_INT >= 26;
        FD_SIZE_LIST = new File("/proc/self/fd");
        manualOverrideMaxFdCount = -1;
    }

    public static HardwareConfigState getInstance() {
        if (instance == null) {
            synchronized (HardwareConfigState.class) {
                if (instance == null) {
                    instance = new HardwareConfigState();
                }
            }
        }
        return instance;
    }

    HardwareConfigState() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.sdkBasedMaxFdCount = 20000;
            this.minHardwareDimension = 0;
            return;
        }
        this.sdkBasedMaxFdCount = 700;
        this.minHardwareDimension = 128;
    }

    public boolean areHardwareBitmapsBlocked() {
        Util.assertMainThread();
        return !this.isHardwareConfigAllowedByAppState.get();
    }

    public void blockHardwareBitmaps() {
        Util.assertMainThread();
        this.isHardwareConfigAllowedByAppState.set(false);
    }

    public void unblockHardwareBitmaps() {
        Util.assertMainThread();
        this.isHardwareConfigAllowedByAppState.set(true);
    }

    public boolean isHardwareConfigAllowed(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.isHardwareConfigAllowedByDeviceModel) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Hardware config disallowed by device model");
            }
            return false;
        } else if (!HARDWARE_BITMAPS_SUPPORTED) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Hardware config disallowed by sdk");
            }
            return false;
        } else if (areHardwareBitmapsBlockedByAppState()) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i3 = this.minHardwareDimension;
            if (i < i3) {
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i2 < i3) {
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (isFdSizeBelowHardwareLimit()) {
                return true;
            } else {
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    private boolean areHardwareBitmapsBlockedByAppState() {
        return BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED && !this.isHardwareConfigAllowedByAppState.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setHardwareConfigIfAllowed(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        Bitmap.Config config;
        boolean isHardwareConfigAllowed = isHardwareConfigAllowed(i, i2, z, z2);
        if (isHardwareConfigAllowed) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return isHardwareConfigAllowed;
    }

    private static boolean isHardwareConfigAllowedByDeviceModel() {
        return (isHardwareConfigDisallowedByB112551574() || isHardwareConfigDisallowedByB147430447()) ? false : true;
    }

    private static boolean isHardwareConfigDisallowedByB147430447() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    private static boolean isHardwareConfigDisallowedByB112551574() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private int getMaxFdCount() {
        if (manualOverrideMaxFdCount != -1) {
            return manualOverrideMaxFdCount;
        }
        return this.sdkBasedMaxFdCount;
    }

    private synchronized boolean isFdSizeBelowHardwareLimit() {
        boolean z = true;
        int i = this.decodesSinceLastFdCheck + 1;
        this.decodesSinceLastFdCheck = i;
        if (i >= 50) {
            this.decodesSinceLastFdCheck = 0;
            int length = FD_SIZE_LIST.list().length;
            long maxFdCount = getMaxFdCount();
            if (length >= maxFdCount) {
                z = false;
            }
            this.isFdSizeBelowHardwareLimit = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + maxFdCount);
            }
        }
        return this.isFdSizeBelowHardwareLimit;
    }
}
