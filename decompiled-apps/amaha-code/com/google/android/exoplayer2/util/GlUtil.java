package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import ri.e;
/* loaded from: classes.dex */
public final class GlUtil {

    /* loaded from: classes.dex */
    public static final class GlException extends RuntimeException {
        public GlException() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsupportedEglVersionException extends Exception {
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7193a = GLES20.glCreateProgram();

        public a(String str, String str2) {
            GlUtil.a();
            a(35633, str);
            a(35632, str2);
        }

        public final void a(int i6, String str) {
            int glCreateShader = GLES20.glCreateShader(i6);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                StringBuilder sb2 = new StringBuilder(e.c(str, e.c(glGetShaderInfoLog, 10)));
                sb2.append(glGetShaderInfoLog);
                sb2.append(", source: ");
                sb2.append(str);
                Log.e("GlUtil", sb2.toString());
            }
            GLES20.glAttachShader(this.f7193a, glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            GlUtil.a();
        }

        public final int b(String str) {
            return GLES20.glGetAttribLocation(this.f7193a, str);
        }

        public final void c() {
            String str;
            int i6 = this.f7193a;
            GLES20.glLinkProgram(i6);
            int[] iArr = {0};
            GLES20.glGetProgramiv(i6, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(i6));
                if (valueOf.length() != 0) {
                    str = "Unable to link shader program: \n".concat(valueOf);
                } else {
                    str = new String("Unable to link shader program: \n");
                }
                Log.e("GlUtil", str);
            }
            GlUtil.a();
            GLES20.glUseProgram(i6);
        }
    }

    public static void a() {
        String str;
        String str2;
        int i6 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            if (valueOf.length() != 0) {
                str2 = "glError ".concat(valueOf);
            } else {
                str2 = new String("glError ");
            }
            Log.e("GlUtil", str2);
            i6 = glGetError;
        }
        if (i6 != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i6));
            if (valueOf2.length() != 0) {
                str = "glError ".concat(valueOf2);
            } else {
                str = new String("glError ");
            }
            Log.e("GlUtil", str);
        }
    }

    public static FloatBuffer b(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
