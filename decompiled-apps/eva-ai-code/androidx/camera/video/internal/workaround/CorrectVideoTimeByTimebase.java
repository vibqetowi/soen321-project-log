package androidx.camera.video.internal.workaround;

import android.media.MediaCodec;
import android.os.SystemClock;
import androidx.camera.core.Logger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class CorrectVideoTimeByTimebase {
    private static final String TAG = "CorrectVideoTimeByTimebase";
    private AtomicBoolean mNeedToCorrectVideoTimebase = null;

    public void correctTimestamp(MediaCodec.BufferInfo bufferInfo) {
        if (this.mNeedToCorrectVideoTimebase == null) {
            if (bufferInfo.size <= 0 || bufferInfo.presentationTimeUs <= 0 || (bufferInfo.flags & 2) != 0) {
                return;
            }
            boolean z = Math.abs(bufferInfo.presentationTimeUs - TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime())) < Math.abs(bufferInfo.presentationTimeUs - TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis()));
            if (z) {
                Logger.w(TAG, "Detected video buffer timestamp is close to real time.");
            }
            this.mNeedToCorrectVideoTimebase = new AtomicBoolean(z);
        }
        if (this.mNeedToCorrectVideoTimebase.get()) {
            bufferInfo.presentationTimeUs -= TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - SystemClock.uptimeMillis());
        }
    }
}
