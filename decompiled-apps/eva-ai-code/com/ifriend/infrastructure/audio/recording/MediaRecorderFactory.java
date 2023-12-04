package com.ifriend.infrastructure.audio.recording;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import com.google.android.exoplayer2.audio.AacUtil;
import com.ifriend.ui.utils.UIUtils$$ExternalSyntheticApiModelOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidAudioRecorder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/infrastructure/audio/recording/MediaRecorderFactory;", "", "context", "Landroid/content/Context;", "errorListener", "Landroid/media/MediaRecorder$OnErrorListener;", "(Landroid/content/Context;Landroid/media/MediaRecorder$OnErrorListener;)V", "create", "Landroid/media/MediaRecorder;", "filePath", "", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaRecorderFactory {
    private final Context context;
    private final MediaRecorder.OnErrorListener errorListener;

    public MediaRecorderFactory(Context context, MediaRecorder.OnErrorListener errorListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        this.context = context;
        this.errorListener = errorListener;
    }

    public final MediaRecorder create(String filePath) {
        MediaRecorder mediaRecorder;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (Build.VERSION.SDK_INT >= 31) {
            UIUtils$$ExternalSyntheticApiModelOutline0.m7187m();
            mediaRecorder = UIUtils$$ExternalSyntheticApiModelOutline0.m(this.context);
        } else {
            mediaRecorder = new MediaRecorder();
        }
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setOutputFile(filePath);
        mediaRecorder.setAudioEncodingBitRate(16);
        mediaRecorder.setAudioSamplingRate(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
        mediaRecorder.setAudioEncoder(0);
        mediaRecorder.setOnErrorListener(this.errorListener);
        return mediaRecorder;
    }
}
