package androidx.camera.video.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.video.Quality;
/* loaded from: classes.dex */
public interface VideoQualityQuirk extends Quirk {
    boolean isProblematicVideoQuality(Quality quality);
}
