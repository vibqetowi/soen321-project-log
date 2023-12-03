package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.b0;
/* compiled from: GifViewUtils.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f28577a = Arrays.asList("raw", "drawable", "mipmap");

    public static boolean a(ImageView imageView, boolean z10, int i6) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f28577a.contains(resources.getResourceTypeName(i6))) {
                    return false;
                }
                pl.droidsonroids.gif.b bVar = new pl.droidsonroids.gif.b(resources, i6);
                if (z10) {
                    imageView.setImageDrawable(bVar);
                    return true;
                }
                imageView.setBackground(bVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }

    /* compiled from: GifViewUtils.java */
    /* loaded from: classes2.dex */
    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public final int f28578c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28579d;

        public a(ImageView imageView, AttributeSet attributeSet) {
            super(imageView, attributeSet);
            this.f28578c = a(imageView, attributeSet, true);
            this.f28579d = a(imageView, attributeSet, false);
        }

        public static int a(ImageView imageView, AttributeSet attributeSet, boolean z10) {
            String str;
            if (z10) {
                str = "src";
            } else {
                str = "background";
            }
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", str, 0);
            if (attributeResourceValue > 0) {
                if (d.f28577a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !d.a(imageView, z10, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }

        public a() {
            this.f28578c = 0;
            this.f28579d = 0;
        }
    }

    /* compiled from: GifViewUtils.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f28580a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28581b;

        public b(View view, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, b0.f23450v, 0, 0);
            this.f28580a = obtainStyledAttributes.getBoolean(0, false);
            this.f28581b = obtainStyledAttributes.getInt(1, -1);
            obtainStyledAttributes.recycle();
        }

        public b() {
            this.f28580a = false;
            this.f28581b = -1;
        }
    }
}
