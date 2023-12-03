package l5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.i;
/* compiled from: ViewIndexingTrigger.kt */
/* loaded from: classes.dex */
public final class f implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public a f24091a;

    /* compiled from: ViewIndexingTrigger.kt */
    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i6) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            i.g(sensor, "sensor");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            i.g(event, "event");
            a aVar = this.f24091a;
            if (aVar != null) {
                float[] fArr = event.values;
                double d10 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d12 * d12) + (d11 * d11) + (d10 * d10)) > 2.3d) {
                    ((dd.a) aVar).d();
                }
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
