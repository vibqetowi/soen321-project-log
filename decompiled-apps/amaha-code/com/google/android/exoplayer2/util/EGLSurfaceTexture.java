package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
/* loaded from: classes.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] A = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: u  reason: collision with root package name */
    public final Handler f7187u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f7188v = new int[1];

    /* renamed from: w  reason: collision with root package name */
    public EGLDisplay f7189w;

    /* renamed from: x  reason: collision with root package name */
    public EGLContext f7190x;

    /* renamed from: y  reason: collision with root package name */
    public EGLSurface f7191y;

    /* renamed from: z  reason: collision with root package name */
    public SurfaceTexture f7192z;

    /* loaded from: classes.dex */
    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f7187u = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7187u.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f7192z;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
