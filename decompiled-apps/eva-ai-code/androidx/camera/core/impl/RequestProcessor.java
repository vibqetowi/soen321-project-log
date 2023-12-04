package androidx.camera.core.impl;

import java.util.List;
/* loaded from: classes.dex */
public interface RequestProcessor {

    /* loaded from: classes.dex */
    public interface Callback {
        void onCaptureBufferLost(Request request, long j, int i);

        void onCaptureCompleted(Request request, CameraCaptureResult cameraCaptureResult);

        void onCaptureFailed(Request request, CameraCaptureFailure cameraCaptureFailure);

        void onCaptureProgressed(Request request, CameraCaptureResult cameraCaptureResult);

        void onCaptureSequenceAborted(int i);

        void onCaptureSequenceCompleted(int i, long j);

        void onCaptureStarted(Request request, long j, long j2);
    }

    /* loaded from: classes.dex */
    public interface Request {
        Config getParameters();

        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(Request request, Callback callback);

    void stopRepeating();

    int submit(Request request, Callback callback);

    int submit(List<Request> list, Callback callback);
}
