package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import com.theinnerhour.b2b.utils.LogHelper;
import hc.d;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: LatoMaterialEditText.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/theinnerhour/b2b/widgets/LatoMaterialEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LatoMaterialEditText extends TextInputEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatoMaterialEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        i.d(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.H);
            i.f(obtainStyledAttributes, "context.obtainStyledAttr…styleable.CustomTextView)");
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                try {
                    setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/".concat(string)));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e10);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
