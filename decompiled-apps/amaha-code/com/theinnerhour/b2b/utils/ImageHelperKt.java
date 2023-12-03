package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import com.appsflyer.R;
import java.io.FileInputStream;
import kotlin.Metadata;
/* compiled from: ImageHelper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0000¨\u0006\n"}, d2 = {"getRoundedCornerBitmap", "Landroid/graphics/Bitmap;", "bitmap", "pixelsInDp", "", "context", "Landroid/content/Context;", "loadImageBitmap", "imageName", "", "app_productionRelease"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ImageHelperKt {
    public static final Bitmap getRoundedCornerBitmap(Bitmap bitmap, float f, Context context) {
        kotlin.jvm.internal.i.g(bitmap, "bitmap");
        kotlin.jvm.internal.i.g(context, "context");
        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float applyDimension = TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, applyDimension, applyDimension, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        kotlin.jvm.internal.i.f(output, "output");
        return output;
    }

    public static final Bitmap loadImageBitmap(Context context, String imageName) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(imageName, "imageName");
        Bitmap bitmap = null;
        try {
            FileInputStream openFileInput = context.openFileInput(imageName);
            kotlin.jvm.internal.i.f(openFileInput, "context.openFileInput(imageName)");
            bitmap = BitmapFactory.decodeStream(openFileInput);
            openFileInput.close();
            return bitmap;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("saveImage", "Exception 3, Something went wrong!", e10);
            return bitmap;
        }
    }
}
