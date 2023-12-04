package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import coil.util.Bitmaps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
/* compiled from: ExifUtils.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcoil/decode/ExifUtils;", "", "()V", "PAINT", "Landroid/graphics/Paint;", "getExifData", "Lcoil/decode/ExifData;", "mimeType", "", "source", "Lokio/BufferedSource;", "policy", "Lcoil/decode/ExifOrientationPolicy;", "reverseTransformations", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExifUtils {
    public static final ExifUtils INSTANCE = new ExifUtils();
    private static final Paint PAINT = new Paint(3);

    private ExifUtils() {
    }

    public final ExifData getExifData(String str, BufferedSource bufferedSource, ExifOrientationPolicy exifOrientationPolicy) {
        if (ExifUtilsKt.supports(exifOrientationPolicy, str)) {
            ExifInterface exifInterface = new ExifInterface(new ExifInterfaceInputStream(bufferedSource.peek().inputStream()));
            return new ExifData(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
        }
        return ExifData.NONE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r1.top == 0.0f) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap reverseTransformations(Bitmap bitmap, ExifData exifData) {
        Bitmap createBitmap;
        if (exifData.isFlipped() || ExifUtilsKt.isRotated(exifData)) {
            Matrix matrix = new Matrix();
            float width = bitmap.getWidth() / 2.0f;
            float height = bitmap.getHeight() / 2.0f;
            if (exifData.isFlipped()) {
                matrix.postScale(-1.0f, 1.0f, width, height);
            }
            if (ExifUtilsKt.isRotated(exifData)) {
                matrix.postRotate(exifData.getRotationDegrees(), width, height);
            }
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectF);
            if (rectF.left == 0.0f) {
            }
            matrix.postTranslate(-rectF.left, -rectF.top);
            if (ExifUtilsKt.isSwapped(exifData)) {
                createBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmaps.getSafeConfig(bitmap));
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
            } else {
                createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmaps.getSafeConfig(bitmap));
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
            }
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, PAINT);
            bitmap.recycle();
            return createBitmap;
        }
        return bitmap;
    }
}
