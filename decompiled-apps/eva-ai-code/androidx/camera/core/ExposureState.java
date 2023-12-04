package androidx.camera.core;

import android.util.Range;
import android.util.Rational;
/* loaded from: classes.dex */
public interface ExposureState {
    int getExposureCompensationIndex();

    Range<Integer> getExposureCompensationRange();

    Rational getExposureCompensationStep();

    boolean isExposureCompensationSupported();
}
