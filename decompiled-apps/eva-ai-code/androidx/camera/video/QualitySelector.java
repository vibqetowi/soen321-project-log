package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CamcorderProfileProxy;
import androidx.camera.video.FallbackStrategy;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class QualitySelector {
    private static final String TAG = "QualitySelector";
    private final FallbackStrategy mFallbackStrategy;
    private final List<Quality> mPreferredQualityList;

    public static List<Quality> getSupportedQualities(CameraInfo cameraInfo) {
        return VideoCapabilities.from(cameraInfo).getSupportedQualities();
    }

    public static boolean isQualitySupported(CameraInfo cameraInfo, Quality quality) {
        return VideoCapabilities.from(cameraInfo).isQualitySupported(quality);
    }

    public static Size getResolution(CameraInfo cameraInfo, Quality quality) {
        checkQualityConstantsOrThrow(quality);
        CamcorderProfileProxy profile = VideoCapabilities.from(cameraInfo).getProfile(quality);
        if (profile != null) {
            return new Size(profile.getVideoFrameWidth(), profile.getVideoFrameHeight());
        }
        return null;
    }

    QualitySelector(List<Quality> list, FallbackStrategy fallbackStrategy) {
        Preconditions.checkArgument((list.isEmpty() && fallbackStrategy == FallbackStrategy.NONE) ? false : true, "No preferred quality and fallback strategy.");
        this.mPreferredQualityList = Collections.unmodifiableList(new ArrayList(list));
        this.mFallbackStrategy = fallbackStrategy;
    }

    public static QualitySelector from(Quality quality) {
        return from(quality, FallbackStrategy.NONE);
    }

    public static QualitySelector from(Quality quality, FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(quality, "quality cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        checkQualityConstantsOrThrow(quality);
        return new QualitySelector(Arrays.asList(quality), fallbackStrategy);
    }

    public static QualitySelector fromOrderedList(List<Quality> list) {
        return fromOrderedList(list, FallbackStrategy.NONE);
    }

    public static QualitySelector fromOrderedList(List<Quality> list, FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(list, "qualities cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        Preconditions.checkArgument(!list.isEmpty(), "qualities cannot be empty");
        checkQualityConstantsOrThrow(list);
        return new QualitySelector(list, fallbackStrategy);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Quality> getPrioritizedQualities(CameraInfo cameraInfo) {
        List<Quality> supportedQualities = VideoCapabilities.from(cameraInfo).getSupportedQualities();
        if (supportedQualities.isEmpty()) {
            Logger.w(TAG, "No supported quality on the device.");
            return new ArrayList();
        }
        Logger.d(TAG, "supportedQualities = " + supportedQualities);
        Set<Quality> linkedHashSet = new LinkedHashSet<>();
        Iterator<Quality> it = this.mPreferredQualityList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Quality next = it.next();
            if (next == Quality.HIGHEST) {
                linkedHashSet.addAll(supportedQualities);
                break;
            } else if (next == Quality.LOWEST) {
                ArrayList arrayList = new ArrayList(supportedQualities);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            } else if (supportedQualities.contains(next)) {
                linkedHashSet.add(next);
            } else {
                Logger.w(TAG, "quality is not supported and will be ignored: " + next);
            }
        }
        addByFallbackStrategy(supportedQualities, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.mPreferredQualityList + ", fallbackStrategy=" + this.mFallbackStrategy + "}";
    }

    private void addByFallbackStrategy(List<Quality> list, Set<Quality> set) {
        Quality fallbackQuality;
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        Logger.d(TAG, "Select quality by fallbackStrategy = " + this.mFallbackStrategy);
        if (this.mFallbackStrategy == FallbackStrategy.NONE) {
            return;
        }
        Preconditions.checkState(this.mFallbackStrategy instanceof FallbackStrategy.RuleStrategy, "Currently only support type RuleStrategy");
        FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) this.mFallbackStrategy;
        List<Quality> sortedQualities = Quality.getSortedQualities();
        if (ruleStrategy.getFallbackQuality() == Quality.HIGHEST) {
            fallbackQuality = sortedQualities.get(0);
        } else if (ruleStrategy.getFallbackQuality() == Quality.LOWEST) {
            fallbackQuality = sortedQualities.get(sortedQualities.size() - 1);
        } else {
            fallbackQuality = ruleStrategy.getFallbackQuality();
        }
        int indexOf = sortedQualities.indexOf(fallbackQuality);
        Preconditions.checkState(indexOf != -1);
        ArrayList arrayList = new ArrayList();
        for (int i = indexOf - 1; i >= 0; i--) {
            Quality quality = sortedQualities.get(i);
            if (list.contains(quality)) {
                arrayList.add(quality);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = indexOf + 1; i2 < sortedQualities.size(); i2++) {
            Quality quality2 = sortedQualities.get(i2);
            if (list.contains(quality2)) {
                arrayList2.add(quality2);
            }
        }
        Logger.d(TAG, "sizeSortedQualities = " + sortedQualities + ", fallback quality = " + fallbackQuality + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int fallbackRule = ruleStrategy.getFallbackRule();
        if (fallbackRule != 0) {
            if (fallbackRule == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
            } else if (fallbackRule == 2) {
                set.addAll(arrayList);
            } else if (fallbackRule == 3) {
                set.addAll(arrayList2);
                set.addAll(arrayList);
            } else if (fallbackRule == 4) {
                set.addAll(arrayList2);
            } else {
                throw new AssertionError("Unhandled fallback strategy: " + this.mFallbackStrategy);
            }
        }
    }

    private static void checkQualityConstantsOrThrow(List<Quality> list) {
        for (Quality quality : list) {
            boolean containsQuality = Quality.containsQuality(quality);
            Preconditions.checkArgument(containsQuality, "qualities contain invalid quality: " + quality);
        }
    }

    private static void checkQualityConstantsOrThrow(Quality quality) {
        boolean containsQuality = Quality.containsQuality(quality);
        Preconditions.checkArgument(containsQuality, "Invalid quality: " + quality);
    }
}
