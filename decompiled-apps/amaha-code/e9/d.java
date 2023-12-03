package e9;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
/* compiled from: OrientationListener.java */
/* loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f13872a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f13873b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    public final float[] f13874c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    public final float[] f13875d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    public final Display f13876e;
    public final a[] f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13877g;

    /* compiled from: OrientationListener.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(float f, float[] fArr);
    }

    public d(Display display, a... aVarArr) {
        this.f13876e = display;
        this.f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i6;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f13872a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f13876e.getRotation();
        float[] fArr3 = this.f13873b;
        if (rotation != 0) {
            int i10 = 129;
            if (rotation != 1) {
                i6 = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i10 = 130;
                        i6 = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i10 = 2;
                i6 = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i10, i6, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f13875d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(this.f13872a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr5 = this.f13872a;
        if (!this.f13877g) {
            c.a(this.f13874c, fArr5);
            this.f13877g = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f13873b, 0, this.f13874c, 0);
        for (a aVar : this.f) {
            aVar.a(f, fArr2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i6) {
    }
}
