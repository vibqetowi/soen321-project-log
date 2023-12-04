package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import java.security.MessageDigest;
import jp.wasabeef.glide.transformations.internal.Utils;
/* loaded from: classes4.dex */
public class CropCircleWithBorderTransformation extends BitmapTransformation {
    private static final String ID = "jp.wasabeef.glide.transformations.CropCircleWithBorderTransformation.1";
    private static final int VERSION = 1;
    private final int borderColor;
    private final int borderSize;

    public CropCircleWithBorderTransformation() {
        this.borderSize = Utils.toDp(4);
        this.borderColor = -16777216;
    }

    public CropCircleWithBorderTransformation(int borderSize, int borderColor) {
        this.borderSize = borderSize;
        this.borderColor = borderColor;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation
    protected Bitmap transform(Context context, BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        Bitmap circleCrop = TransformationUtils.circleCrop(pool, toTransform, outWidth, outHeight);
        setCanvasBitmapDensity(toTransform, circleCrop);
        Paint paint = new Paint();
        paint.setColor(this.borderColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.borderSize);
        paint.setAntiAlias(true);
        new Canvas(circleCrop).drawCircle(outWidth / 2.0f, outHeight / 2.0f, (Math.max(outWidth, outHeight) / 2.0f) - (this.borderSize / 2.0f), paint);
        return circleCrop;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update((ID + this.borderSize + this.borderColor).getBytes(CHARSET));
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public boolean equals(Object o) {
        if (o instanceof CropCircleWithBorderTransformation) {
            CropCircleWithBorderTransformation cropCircleWithBorderTransformation = (CropCircleWithBorderTransformation) o;
            if (cropCircleWithBorderTransformation.borderSize == this.borderSize && cropCircleWithBorderTransformation.borderColor == this.borderColor) {
                return true;
            }
        }
        return false;
    }

    @Override // jp.wasabeef.glide.transformations.BitmapTransformation, com.bumptech.glide.load.Key
    public int hashCode() {
        return 882652245 + (this.borderSize * 100) + this.borderColor + 10;
    }
}
