package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
/* loaded from: classes3.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.createCursorWindow(str, j);
        }
        return Api15Impl.createCursorWindow(str);
    }

    /* loaded from: classes3.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static CursorWindow createCursorWindow(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    /* loaded from: classes3.dex */
    static class Api15Impl {
        private Api15Impl() {
        }

        static CursorWindow createCursorWindow(String str) {
            return new CursorWindow(str);
        }
    }
}