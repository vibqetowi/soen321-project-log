package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;

    private KeylineState(float f, List<Keyline> list, int i, int i2) {
        this.itemSize = f;
        this.keylines = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i;
        this.lastFocalKeylineIndex = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getItemSize() {
        return this.itemSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getLastKeyline() {
        List<Keyline> list = this.keylines;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f) {
        if (keylineState.getItemSize() != keylineState2.getItemSize()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<Keyline> keylines = keylineState.getKeylines();
        List<Keyline> keylines2 = keylineState2.getKeylines();
        if (keylines.size() != keylines2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < keylineState.getKeylines().size(); i++) {
            arrayList.add(Keyline.lerp(keylines.get(i), keylines2.get(i), f));
        }
        return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState reverse(KeylineState keylineState) {
        Builder builder = new Builder(keylineState.getItemSize());
        float f = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex());
            f += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    /* loaded from: classes2.dex */
    static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;

        private static float calculateKeylineLocationForItemPosition(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(float f) {
            this.itemSize = f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder addKeyline(float f, float f2, float f3) {
            return addKeyline(f, f2, f3, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder addKeyline(float f, float f2, float f3, boolean z) {
            if (f3 <= 0.0f) {
                return this;
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f, f2, f3);
            if (z) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.tmpFirstFocalKeyline.maskedItemSize) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.tmpLastFocalKeyline = keyline;
                this.lastFocalKeylineIndex = this.tmpKeylines.size();
            } else if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else {
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder addKeylineRange(float f, float f2, float f3, int i) {
            return addKeylineRange(f, f2, f3, i, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder addKeylineRange(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    addKeyline((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.tmpKeylines.size(); i++) {
                Keyline keyline = this.tmpKeylines.get(i);
                arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i), keyline.locOffset, keyline.mask, keyline.maskedItemSize));
            }
            return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Keyline {
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;

        Keyline(float f, float f2, float f3, float f4) {
            this.loc = f;
            this.locOffset = f2;
            this.mask = f3;
            this.maskedItemSize = f4;
        }

        static Keyline lerp(Keyline keyline, Keyline keyline2, float f) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f), AnimationUtils.lerp(keyline.mask, keyline2.mask, f), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f));
        }
    }
}
