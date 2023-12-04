package coil.transform;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import coil.decode.DecodeUtils;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.Bitmaps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.apache.commons.codec.language.Soundex;
/* compiled from: RoundedCornersTransformation.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0016J!\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcoil/transform/RoundedCornersTransformation;", "Lcoil/transform/Transformation;", "radius", "", "(F)V", "topLeft", "topRight", "bottomLeft", "bottomRight", "(FFFF)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "calculateOutputSize", "Lkotlin/Pair;", "", "input", "Landroid/graphics/Bitmap;", "size", "Lcoil/size/Size;", "equals", "", "other", "", "hashCode", "transform", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedCornersTransformation implements Transformation {
    private final float bottomLeft;
    private final float bottomRight;
    private final String cacheKey;
    private final float topLeft;
    private final float topRight;

    public RoundedCornersTransformation() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public RoundedCornersTransformation(float f, float f2, float f3, float f4) {
        this.topLeft = f;
        this.topRight = f2;
        this.bottomLeft = f3;
        this.bottomRight = f4;
        if (!(f >= 0.0f && f2 >= 0.0f && f3 >= 0.0f && f4 >= 0.0f)) {
            throw new IllegalArgumentException("All radii must be >= 0.".toString());
        }
        this.cacheKey = getClass().getName() + Soundex.SILENT_MARKER + f + ',' + f2 + ',' + f3 + ',' + f4;
    }

    public /* synthetic */ RoundedCornersTransformation(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public RoundedCornersTransformation(float f) {
        this(f, f, f, f);
    }

    @Override // coil.transform.Transformation
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil.transform.Transformation
    public Object transform(Bitmap bitmap, Size size, Continuation<? super Bitmap> continuation) {
        Paint paint = new Paint(3);
        Pair<Integer, Integer> calculateOutputSize = calculateOutputSize(bitmap, size);
        int intValue = calculateOutputSize.component1().intValue();
        int intValue2 = calculateOutputSize.component2().intValue();
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, Bitmaps.getSafeConfig(bitmap));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float computeSizeMultiplier = (float) DecodeUtils.computeSizeMultiplier(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, Scale.FILL);
        float f = 2;
        matrix.setTranslate((intValue - (bitmap.getWidth() * computeSizeMultiplier)) / f, (intValue2 - (bitmap.getHeight() * computeSizeMultiplier)) / f);
        matrix.preScale(computeSizeMultiplier, computeSizeMultiplier);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f2 = this.topLeft;
        float f3 = this.topRight;
        float f4 = this.bottomRight;
        float f5 = this.bottomLeft;
        float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    private final Pair<Integer, Integer> calculateOutputSize(Bitmap bitmap, Size size) {
        if (Sizes.isOriginal(size)) {
            return TuplesKt.to(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        }
        Dimension component1 = size.component1();
        Dimension component2 = size.component2();
        if ((component1 instanceof Dimension.Pixels) && (component2 instanceof Dimension.Pixels)) {
            return TuplesKt.to(Integer.valueOf(((Dimension.Pixels) component1).px), Integer.valueOf(((Dimension.Pixels) component2).px));
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Dimension width2 = size.getWidth();
        int i = width2 instanceof Dimension.Pixels ? ((Dimension.Pixels) width2).px : Integer.MIN_VALUE;
        Dimension height2 = size.getHeight();
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, i, height2 instanceof Dimension.Pixels ? ((Dimension.Pixels) height2).px : Integer.MIN_VALUE, Scale.FILL);
        return TuplesKt.to(Integer.valueOf(MathKt.roundToInt(bitmap.getWidth() * computeSizeMultiplier)), Integer.valueOf(MathKt.roundToInt(computeSizeMultiplier * bitmap.getHeight())));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedCornersTransformation) {
            RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) obj;
            if (this.topLeft == roundedCornersTransformation.topLeft) {
                if (this.topRight == roundedCornersTransformation.topRight) {
                    if (this.bottomLeft == roundedCornersTransformation.bottomLeft) {
                        if (this.bottomRight == roundedCornersTransformation.bottomRight) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.topLeft) * 31) + Float.floatToIntBits(this.topRight)) * 31) + Float.floatToIntBits(this.bottomLeft)) * 31) + Float.floatToIntBits(this.bottomRight);
    }
}
