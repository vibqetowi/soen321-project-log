package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;
/* loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements Quirk {
    private final Range<Integer> mAeFpsRange;

    public AeFpsRangeLegacyQuirk(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mAeFpsRange = pickSuitableFpsRange((Range[]) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public Range<Integer> getRange() {
        return this.mAeFpsRange;
    }

    private Range<Integer> pickSuitableFpsRange(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> correctedFpsRange = getCorrectedFpsRange(range2);
                if (correctedFpsRange.getUpper().intValue() == 30 && (range == null || correctedFpsRange.getLower().intValue() < range.getLower().intValue())) {
                    range = correctedFpsRange;
                }
            }
        }
        return range;
    }

    private Range<Integer> getCorrectedFpsRange(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }
}
