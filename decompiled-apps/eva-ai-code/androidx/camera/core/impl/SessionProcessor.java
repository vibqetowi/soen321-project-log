package androidx.camera.core.impl;

import androidx.camera.core.CameraInfo;
/* loaded from: classes.dex */
public interface SessionProcessor {

    /* loaded from: classes.dex */
    public interface CaptureCallback {
        void onCaptureFailed(int i);

        void onCaptureProcessStarted(int i);

        void onCaptureSequenceAborted(int i);

        void onCaptureSequenceCompleted(int i);

        void onCaptureStarted(int i, long j);
    }

    void abortCapture(int i);

    void deInitSession();

    SessionConfig initSession(CameraInfo cameraInfo, OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(RequestProcessor requestProcessor);

    void setParameters(Config config);

    int startCapture(CaptureCallback captureCallback);

    int startRepeating(CaptureCallback captureCallback);

    void stopRepeating();
}
