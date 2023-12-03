package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.t;
import com.theinnerhour.b2b.utils.LogHelper;
import hc.d;
/* loaded from: classes2.dex */
public class RobertoRadioButton extends t {
    public RobertoRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.H);
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
