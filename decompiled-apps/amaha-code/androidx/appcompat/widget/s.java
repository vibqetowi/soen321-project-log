package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: AppCompatProgressBarHelper.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1539c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f1540a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1541b;

    public s(ProgressBar progressBar) {
        this.f1540a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i6) {
        ProgressBar progressBar = this.f1540a;
        l1 m10 = l1.m(progressBar.getContext(), attributeSet, f1539c, i6);
        Drawable f = m10.f(0);
        if (f != null) {
            if (f instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i10 = 0; i10 < numberOfFrames; i10++) {
                    Drawable b10 = b(animationDrawable.getFrame(i10), true);
                    b10.setLevel(Constants.TIMEOUT_MS);
                    animationDrawable2.addFrame(b10, animationDrawable.getDuration(i10));
                }
                animationDrawable2.setLevel(Constants.TIMEOUT_MS);
                f = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f);
        }
        Drawable f2 = m10.f(1);
        if (f2 != null) {
            progressBar.setProgressDrawable(b(f2, false));
        }
        m10.n();
    }

    public final Drawable b(Drawable drawable, boolean z10) {
        int layerGravity;
        int layerWidth;
        int layerHeight;
        int layerInsetLeft;
        int layerInsetRight;
        int layerInsetTop;
        int layerInsetBottom;
        int layerInsetStart;
        int layerInsetEnd;
        boolean z11;
        if (drawable instanceof k0.c) {
            k0.c cVar = (k0.c) drawable;
            Drawable b10 = cVar.b();
            if (b10 != null) {
                cVar.a(b(b10, z10));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i6 = 0; i6 < numberOfLayers; i6++) {
                int id2 = layerDrawable.getId(i6);
                Drawable drawable2 = layerDrawable.getDrawable(i6);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i6] = b(drawable2, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                layerDrawable2.setId(i10, layerDrawable.getId(i10));
                if (Build.VERSION.SDK_INT >= 23) {
                    layerGravity = layerDrawable.getLayerGravity(i10);
                    layerDrawable2.setLayerGravity(i10, layerGravity);
                    layerWidth = layerDrawable.getLayerWidth(i10);
                    layerDrawable2.setLayerWidth(i10, layerWidth);
                    layerHeight = layerDrawable.getLayerHeight(i10);
                    layerDrawable2.setLayerHeight(i10, layerHeight);
                    layerInsetLeft = layerDrawable.getLayerInsetLeft(i10);
                    layerDrawable2.setLayerInsetLeft(i10, layerInsetLeft);
                    layerInsetRight = layerDrawable.getLayerInsetRight(i10);
                    layerDrawable2.setLayerInsetRight(i10, layerInsetRight);
                    layerInsetTop = layerDrawable.getLayerInsetTop(i10);
                    layerDrawable2.setLayerInsetTop(i10, layerInsetTop);
                    layerInsetBottom = layerDrawable.getLayerInsetBottom(i10);
                    layerDrawable2.setLayerInsetBottom(i10, layerInsetBottom);
                    layerInsetStart = layerDrawable.getLayerInsetStart(i10);
                    layerDrawable2.setLayerInsetStart(i10, layerInsetStart);
                    layerInsetEnd = layerDrawable.getLayerInsetEnd(i10);
                    layerDrawable2.setLayerInsetEnd(i10, layerInsetEnd);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1541b == null) {
                this.f1541b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z10) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}
