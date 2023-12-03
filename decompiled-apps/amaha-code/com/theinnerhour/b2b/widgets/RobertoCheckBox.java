package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.theinnerhour.b2b.utils.LogHelper;
import hc.d;
/* loaded from: classes2.dex */
public class RobertoCheckBox extends AppCompatCheckBox {
    public RobertoCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.H);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                try {
                    setFont(string);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e10);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    private void setFont(String str) {
        try {
            AssetManager assets = getContext().getAssets();
            setTypeface(Typeface.createFromAsset(assets, "fonts/" + str));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
