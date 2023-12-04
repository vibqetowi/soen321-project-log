package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.AutoValue_VideoSpec;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class VideoSpec {
    static final int ASPECT_RATIO_16_9 = 1;
    static final int ASPECT_RATIO_4_3 = 0;
    static final int ASPECT_RATIO_AUTO = -1;
    public static final Range<Integer> FRAME_RATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);
    public static final Range<Integer> BITRATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);
    public static final QualitySelector QUALITY_SELECTOR_AUTO = QualitySelector.fromOrderedList(Arrays.asList(Quality.FHD, Quality.HD, Quality.SD), FallbackStrategy.higherQualityOrLowerThan(Quality.FHD));

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract VideoSpec build();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Builder setAspectRatio(int i);

        public abstract Builder setBitrate(Range<Integer> range);

        public abstract Builder setFrameRate(Range<Integer> range);

        public abstract Builder setQualitySelector(QualitySelector qualitySelector);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getAspectRatio();

    public abstract Range<Integer> getBitrate();

    public abstract Range<Integer> getFrameRate();

    public abstract QualitySelector getQualitySelector();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoValue_VideoSpec.Builder().setQualitySelector(QUALITY_SELECTOR_AUTO).setFrameRate(FRAME_RATE_RANGE_AUTO).setBitrate(BITRATE_RANGE_AUTO).setAspectRatio(-1);
    }
}
