package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;
/* loaded from: classes2.dex */
final class GifInfoHandle {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f28565b = 0;

    /* renamed from: a  reason: collision with root package name */
    public volatile long f28566a;

    static {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (hc.d.V == null) {
                try {
                    hc.d.V = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e10);
                }
            }
            new cw.e().b(hc.d.V);
        }
    }

    public GifInfoHandle(String str) {
        this.f28566a = openFile(str);
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z10);

    private static native void free(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native int getWidth(long j10);

    private static native boolean isOpaque(long j10);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i6, long j10);

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToTime(long j10, int i6, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    public final synchronized int a() {
        return getCurrentFrameIndex(this.f28566a);
    }

    public final synchronized int b() {
        return getCurrentLoop(this.f28566a);
    }

    public final synchronized int c() {
        return getCurrentPosition(this.f28566a);
    }

    public final synchronized int d() {
        return getDuration(this.f28566a);
    }

    public final synchronized int e() {
        return getHeight(this.f28566a);
    }

    public final synchronized int f() {
        return getLoopCount(this.f28566a);
    }

    public final void finalize() {
        try {
            m();
        } finally {
            super.finalize();
        }
    }

    public final synchronized int g() {
        return getNativeErrorCode(this.f28566a);
    }

    public final synchronized int h() {
        return getNumberOfFrames(this.f28566a);
    }

    public final synchronized long[] i() {
        return getSavedState(this.f28566a);
    }

    public final synchronized int j() {
        return getWidth(this.f28566a);
    }

    public final synchronized boolean k() {
        return isOpaque(this.f28566a);
    }

    public final synchronized boolean l() {
        boolean z10;
        if (this.f28566a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void m() {
        free(this.f28566a);
        this.f28566a = 0L;
    }

    public final synchronized long n(Bitmap bitmap) {
        return renderFrame(this.f28566a, bitmap);
    }

    public final synchronized boolean o() {
        return reset(this.f28566a);
    }

    public final synchronized long p() {
        return restoreRemainder(this.f28566a);
    }

    public final synchronized int q(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f28566a, jArr, bitmap);
    }

    public final synchronized void r() {
        saveRemainder(this.f28566a);
    }

    public final synchronized void s(int i6, Bitmap bitmap) {
        seekToTime(this.f28566a, i6, bitmap);
    }

    public final void t(int i6) {
        if (i6 >= 0 && i6 <= 65535) {
            synchronized (this) {
                setLoopCount(this.f28566a, (char) i6);
            }
            return;
        }
        throw new IllegalArgumentException("Loop count of range <0, 65535>");
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        int extractNativeFileDescriptor;
        try {
            FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
            long startOffset = assetFileDescriptor.getStartOffset();
            if (Build.VERSION.SDK_INT > 27) {
                extractNativeFileDescriptor = createTempNativeFileDescriptor();
                Os.dup2(fileDescriptor, extractNativeFileDescriptor);
            } else {
                extractNativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, false);
            }
            this.f28566a = openNativeFileDescriptor(extractNativeFileDescriptor, startOffset);
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }
}
