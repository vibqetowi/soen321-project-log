package io.sentry.android.core;

import io.sentry.protocol.DebugImage;
import java.util.List;
/* loaded from: classes4.dex */
final class NoOpDebugImagesLoader implements IDebugImagesLoader {
    private static final NoOpDebugImagesLoader instance = new NoOpDebugImagesLoader();

    @Override // io.sentry.android.core.IDebugImagesLoader
    public void clearDebugImages() {
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public List<DebugImage> loadDebugImages() {
        return null;
    }

    private NoOpDebugImagesLoader() {
    }

    public static NoOpDebugImagesLoader getInstance() {
        return instance;
    }
}
