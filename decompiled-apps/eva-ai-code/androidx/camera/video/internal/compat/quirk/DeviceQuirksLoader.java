package androidx.camera.video.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Quirk> loadQuirks() {
        ArrayList arrayList = new ArrayList();
        if (MediaFormatMustNotUseFrameRateToFindEncoderQuirk.load()) {
            arrayList.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        if (MediaCodecInfoReportIncorrectInfoQuirk.load()) {
            arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (DeactivateEncoderSurfaceBeforeStopEncoderQuirk.load()) {
            arrayList.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
        }
        if (CameraUseInconsistentTimebaseQuirk.load()) {
            arrayList.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (ReportedVideoQualityNotSupportedQuirk.load()) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        if (EncoderNotUsePersistentInputSurfaceQuirk.load()) {
            arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
        }
        if (VideoEncoderCrashQuirk.load()) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if (ExcludeStretchedVideoQualityQuirk.load()) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (MediaStoreVideoCannotWrite.load()) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if (AudioEncoderIgnoresInputTimestampQuirk.load()) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.load()) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        return arrayList;
    }
}
