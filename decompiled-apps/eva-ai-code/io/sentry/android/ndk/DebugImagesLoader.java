package io.sentry.android.ndk;

import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.IDebugImagesLoader;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.DebugImage;
import io.sentry.util.Objects;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes4.dex */
final class DebugImagesLoader implements IDebugImagesLoader {
    private static List<DebugImage> debugImages;
    private static final Object debugImagesLock = new Object();
    private final NativeModuleListLoader moduleListLoader;
    private final SentryOptions options;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DebugImagesLoader(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.moduleListLoader = (NativeModuleListLoader) Objects.requireNonNull(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public List<DebugImage> loadDebugImages() {
        DebugImage[] loadModuleList;
        synchronized (debugImagesLock) {
            if (debugImages == null && (loadModuleList = this.moduleListLoader.loadModuleList()) != null) {
                debugImages = Arrays.asList(loadModuleList);
                this.options.getLogger().log(SentryLevel.DEBUG, "Debug images loaded: %d", Integer.valueOf(debugImages.size()));
            }
        }
        return debugImages;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public void clearDebugImages() {
        synchronized (debugImagesLock) {
            try {
                this.moduleListLoader.clearModuleList();
                this.options.getLogger().log(SentryLevel.INFO, "Debug images cleared.", new Object[0]);
                debugImages = null;
            }
        }
    }

    List<DebugImage> getCachedDebugImages() {
        return debugImages;
    }
}
