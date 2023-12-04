package io.sentry.android.ndk;

import io.sentry.protocol.DebugImage;
/* loaded from: classes4.dex */
final class NativeModuleListLoader {
    public static native void nativeClearModuleList();

    public static native DebugImage[] nativeLoadModuleList();

    public DebugImage[] loadModuleList() {
        return nativeLoadModuleList();
    }

    public void clearModuleList() {
        nativeClearModuleList();
    }
}
