package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;
/* loaded from: classes2.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    private final boolean forceCompactArrangement;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};
    private static final int[] MEDIUM_COUNTS_COMPACT = {0};

    public MultiBrowseCarouselStrategy() {
        this(false);
    }

    public MultiBrowseCarouselStrategy(boolean z) {
        this.forceCompactArrangement = z;
    }

    private float getExtraSmallSize(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    private float getSmallSizeMin(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    private float getSmallSizeMax(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        float containerWidth = carousel.getContainerWidth();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f = layoutParams.leftMargin + layoutParams.rightMargin;
        float smallSizeMin = getSmallSizeMin(view.getContext()) + f;
        float smallSizeMax = getSmallSizeMax(view.getContext()) + f;
        float measuredWidth = view.getMeasuredWidth();
        float min = Math.min(measuredWidth + f, containerWidth);
        float clamp = MathUtils.clamp((measuredWidth / 3.0f) + f, getSmallSizeMin(view.getContext()) + f, getSmallSizeMax(view.getContext()) + f);
        float f2 = (min + clamp) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        int[] iArr2 = this.forceCompactArrangement ? MEDIUM_COUNTS_COMPACT : MEDIUM_COUNTS;
        int max = (int) Math.max(1.0d, Math.floor(((containerWidth - (maxValue(iArr2) * f2)) - (maxValue(iArr) * smallSizeMax)) / min));
        int ceil = (int) Math.ceil(containerWidth / min);
        int i = (ceil - max) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = ceil - i2;
        }
        Arrangement findLowestCostArrangement = findLowestCostArrangement(containerWidth, clamp, smallSizeMin, smallSizeMax, iArr, f2, iArr2, min, iArr3);
        float extraSmallSize = getExtraSmallSize(view.getContext()) + f;
        float f3 = extraSmallSize / 2.0f;
        float f4 = 0.0f - f3;
        float f5 = (findLowestCostArrangement.largeSize / 2.0f) + 0.0f;
        float max2 = f5 + (Math.max(0, findLowestCostArrangement.largeCount - 1) * findLowestCostArrangement.largeSize);
        float f6 = (findLowestCostArrangement.largeSize / 2.0f) + max2;
        if (findLowestCostArrangement.mediumCount > 0) {
            max2 = (findLowestCostArrangement.mediumSize / 2.0f) + f6;
        }
        if (findLowestCostArrangement.mediumCount > 0) {
            f6 = (findLowestCostArrangement.mediumSize / 2.0f) + max2;
        }
        float f7 = findLowestCostArrangement.smallCount > 0 ? f6 + (findLowestCostArrangement.smallSize / 2.0f) : max2;
        float containerWidth2 = carousel.getContainerWidth() + f3;
        float childMaskPercentage = getChildMaskPercentage(extraSmallSize, findLowestCostArrangement.largeSize, f);
        float childMaskPercentage2 = getChildMaskPercentage(findLowestCostArrangement.smallSize, findLowestCostArrangement.largeSize, f);
        float childMaskPercentage3 = getChildMaskPercentage(findLowestCostArrangement.mediumSize, findLowestCostArrangement.largeSize, f);
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(findLowestCostArrangement.largeSize).addKeyline(f4, childMaskPercentage, extraSmallSize).addKeylineRange(f5, 0.0f, findLowestCostArrangement.largeSize, findLowestCostArrangement.largeCount, true);
        if (findLowestCostArrangement.mediumCount > 0) {
            addKeylineRange.addKeyline(max2, childMaskPercentage3, findLowestCostArrangement.mediumSize);
        }
        if (findLowestCostArrangement.smallCount > 0) {
            addKeylineRange.addKeylineRange(f7, childMaskPercentage2, findLowestCostArrangement.smallSize, findLowestCostArrangement.smallCount);
        }
        addKeylineRange.addKeyline(containerWidth2, childMaskPercentage, extraSmallSize);
        return addKeylineRange.build();
    }

    private static Arrangement findLowestCostArrangement(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        Arrangement arrangement = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i5;
                    int i7 = length2;
                    int i8 = i3;
                    int i9 = length;
                    Arrangement arrangement2 = new Arrangement(i, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    i++;
                    i5 = i6 + 1;
                    length2 = i7;
                    i3 = i8;
                    length = i9;
                }
                i3++;
            }
        }
        return arrangement;
    }

    private static int maxValue(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Arrangement {
        final float cost;
        final int largeCount;
        float largeSize;
        final int mediumCount;
        float mediumSize;
        final int priority;
        final int smallCount;
        float smallSize;

        private float calculateLargeSize(float f, int i, float f2, int i2, int i3) {
            if (i <= 0) {
                f2 = 0.0f;
            }
            float f3 = i2 / 2.0f;
            return (f - ((i + f3) * f2)) / (i3 + f3);
        }

        Arrangement(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
            this.priority = i;
            this.smallSize = MathUtils.clamp(f, f2, f3);
            this.smallCount = i2;
            this.mediumSize = f4;
            this.mediumCount = i3;
            this.largeSize = f5;
            this.largeCount = i4;
            fit(f6, f2, f3, f5);
            this.cost = cost(f5);
        }

        public String toString() {
            return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
        }

        private float getSpace() {
            return (this.largeSize * this.largeCount) + (this.mediumSize * this.mediumCount) + (this.smallSize * this.smallCount);
        }

        private void fit(float f, float f2, float f3, float f4) {
            float space = f - getSpace();
            int i = this.smallCount;
            if (i > 0 && space > 0.0f) {
                float f5 = this.smallSize;
                this.smallSize = f5 + Math.min(space / i, f3 - f5);
            } else if (i > 0 && space < 0.0f) {
                float f6 = this.smallSize;
                this.smallSize = f6 + Math.max(space / i, f2 - f6);
            }
            float calculateLargeSize = calculateLargeSize(f, this.smallCount, this.smallSize, this.mediumCount, this.largeCount);
            this.largeSize = calculateLargeSize;
            float f7 = (this.smallSize + calculateLargeSize) / 2.0f;
            this.mediumSize = f7;
            int i2 = this.mediumCount;
            if (i2 <= 0 || calculateLargeSize == f4) {
                return;
            }
            float f8 = (f4 - calculateLargeSize) * this.largeCount;
            float min = Math.min(Math.abs(f8), f7 * 0.1f * i2);
            if (f8 > 0.0f) {
                this.mediumSize -= min / this.mediumCount;
                this.largeSize += min / this.largeCount;
                return;
            }
            this.mediumSize += min / this.mediumCount;
            this.largeSize -= min / this.largeCount;
        }

        private boolean isValid() {
            int i = this.largeCount;
            if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
                return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
            }
            float f = this.largeSize;
            float f2 = this.mediumSize;
            return f > f2 && f2 > this.smallSize;
        }

        private float cost(float f) {
            if (isValid()) {
                return Math.abs(f - this.largeSize) * this.priority;
            }
            return Float.MAX_VALUE;
        }
    }
}
