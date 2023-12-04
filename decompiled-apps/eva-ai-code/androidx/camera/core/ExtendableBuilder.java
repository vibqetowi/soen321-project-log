package androidx.camera.core;

import androidx.camera.core.impl.MutableConfig;
/* loaded from: classes.dex */
public interface ExtendableBuilder<T> {
    T build();

    MutableConfig getMutableConfig();
}
