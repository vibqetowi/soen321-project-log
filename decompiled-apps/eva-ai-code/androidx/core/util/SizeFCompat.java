package androidx.core.util;

import android.util.SizeF;
import com.facebook.appevents.internal.ViewHierarchyConstants;
/* loaded from: classes3.dex */
public final class SizeFCompat {
    private final float mHeight;
    private final float mWidth;

    public SizeFCompat(float f, float f2) {
        this.mWidth = Preconditions.checkArgumentFinite(f, ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        this.mHeight = Preconditions.checkArgumentFinite(f2, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
    }

    public float getWidth() {
        return this.mWidth;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SizeFCompat) {
            SizeFCompat sizeFCompat = (SizeFCompat) obj;
            return sizeFCompat.mWidth == this.mWidth && sizeFCompat.mHeight == this.mHeight;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.mWidth) ^ Float.floatToIntBits(this.mHeight);
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }

    public SizeF toSizeF() {
        return Api21Impl.toSizeF(this);
    }

    public static SizeFCompat toSizeFCompat(SizeF sizeF) {
        return Api21Impl.toSizeFCompat(sizeF);
    }

    /* loaded from: classes3.dex */
    private static final class Api21Impl {
        private Api21Impl() {
        }

        static SizeFCompat toSizeFCompat(SizeF sizeF) {
            Preconditions.checkNotNull(sizeF);
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }

        static SizeF toSizeF(SizeFCompat sizeFCompat) {
            Preconditions.checkNotNull(sizeFCompat);
            return new SizeF(sizeFCompat.getWidth(), sizeFCompat.getHeight());
        }
    }
}
