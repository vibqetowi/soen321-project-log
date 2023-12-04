package io.sentry.android.core;

import io.sentry.protocol.DebugImage;
import java.util.List;
/* loaded from: classes4.dex */
public interface IDebugImagesLoader {
    void clearDebugImages();

    List<DebugImage> loadDebugImages();
}
