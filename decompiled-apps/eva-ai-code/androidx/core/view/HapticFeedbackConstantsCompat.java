package androidx.core.view;

import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes3.dex */
public final class HapticFeedbackConstantsCompat {
    public static final int CLOCK_TICK = 4;
    public static final int CONFIRM = 16;
    public static final int CONTEXT_CLICK = 6;
    public static final int DRAG_START = 25;
    static final int FIRST_CONSTANT_INT = 0;
    public static final int FLAG_IGNORE_VIEW_SETTING = 1;
    public static final int GESTURE_END = 13;
    public static final int GESTURE_START = 12;
    public static final int GESTURE_THRESHOLD_ACTIVATE = 23;
    public static final int GESTURE_THRESHOLD_DEACTIVATE = 24;
    public static final int KEYBOARD_PRESS = 3;
    public static final int KEYBOARD_RELEASE = 7;
    public static final int KEYBOARD_TAP = 3;
    static final int LAST_CONSTANT_INT = 27;
    public static final int LONG_PRESS = 0;
    public static final int NO_HAPTICS = -1;
    public static final int REJECT = 17;
    public static final int SEGMENT_FREQUENT_TICK = 27;
    public static final int SEGMENT_TICK = 26;
    public static final int TEXT_HANDLE_MOVE = 9;
    public static final int TOGGLE_OFF = 22;
    public static final int TOGGLE_ON = 21;
    public static final int VIRTUAL_KEY = 1;
    public static final int VIRTUAL_KEY_RELEASE = 8;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface HapticFeedbackFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface HapticFeedbackType {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        if (r5 != 17) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getFeedbackConstantOrFallback(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 34) {
            switch (i) {
                case 21:
                case 23:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            if (i != 12) {
                if (i == 13) {
                    i2 = 6;
                } else if (i != 16) {
                }
                if (Build.VERSION.SDK_INT < 27 || !(i2 == 7 || i2 == 8 || i2 == 9)) {
                    return i2;
                }
                return -1;
            }
            i2 = 1;
            if (Build.VERSION.SDK_INT < 27) {
            }
            return i2;
        }
        i2 = i;
        if (Build.VERSION.SDK_INT < 27) {
        }
        return i2;
    }

    private HapticFeedbackConstantsCompat() {
    }
}
