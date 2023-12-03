package qb;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.l1;
import com.theinnerhour.b2b.R;
/* compiled from: ThemeEnforcement.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f29509a = {R.attr.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f29510b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i6, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ug.l.Q, i6, i10);
        boolean z10 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f29510b, "Theme.MaterialComponents");
            }
        }
        c(context, f29509a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i10, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ug.l.Q, i6, i10);
        boolean z10 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i6, i10);
            for (int i11 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i11, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z10 = true;
        }
        obtainStyledAttributes.recycle();
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z10 = false;
        int i6 = 0;
        while (true) {
            if (i6 < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i6)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i6++;
            } else {
                obtainStyledAttributes.recycle();
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(defpackage.b.m("The style on this component requires your app theme to be ", str, " (or a descendant)."));
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i10, int... iArr2) {
        a(context, attributeSet, i6, i10);
        b(context, attributeSet, iArr, i6, i10, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i6, i10);
    }

    public static l1 e(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i10, int... iArr2) {
        a(context, attributeSet, i6, i10);
        b(context, attributeSet, iArr, i6, i10, iArr2);
        return new l1(context, context.obtainStyledAttributes(attributeSet, iArr, i6, i10));
    }
}
