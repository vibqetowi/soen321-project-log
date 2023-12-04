package androidx.camera.video.internal.encoder;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface EncoderFactory {
    Encoder createEncoder(Executor executor, EncoderConfig encoderConfig) throws InvalidConfigException;
}
