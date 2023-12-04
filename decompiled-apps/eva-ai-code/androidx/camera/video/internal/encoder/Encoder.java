package androidx.camera.video.internal.encoder;

import android.view.Surface;
import androidx.camera.video.internal.BufferProvider;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface Encoder {

    /* loaded from: classes.dex */
    public interface ByteBufferInput extends EncoderInput, BufferProvider<InputBuffer> {
    }

    /* loaded from: classes.dex */
    public interface EncoderInput {
    }

    /* loaded from: classes.dex */
    public interface SurfaceInput extends EncoderInput {

        /* loaded from: classes.dex */
        public interface OnSurfaceUpdateListener {
            void onSurfaceUpdate(Surface surface);
        }

        void setOnSurfaceUpdateListener(Executor executor, OnSurfaceUpdateListener onSurfaceUpdateListener);
    }

    EncoderInput getInput();

    void pause();

    void release();

    void requestKeyFrame();

    void setEncoderCallback(EncoderCallback encoderCallback, Executor executor);

    void start();

    void stop();

    void stop(long j);
}
