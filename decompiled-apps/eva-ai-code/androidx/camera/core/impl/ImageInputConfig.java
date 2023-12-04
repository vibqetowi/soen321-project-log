package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
/* loaded from: classes.dex */
public interface ImageInputConfig extends ReadableConfig {
    public static final Config.Option<Integer> OPTION_INPUT_FORMAT = Config.Option.create("camerax.core.imageInput.inputFormat", Integer.TYPE);

    int getInputFormat();

    /* renamed from: androidx.camera.core.impl.ImageInputConfig$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
    }
}
