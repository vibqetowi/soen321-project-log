package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.i0;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.utils.AssetProviderSingleton;
import com.theinnerhour.b2b.utils.LogHelper;
import hc.d;
/* loaded from: classes2.dex */
public class RobertoTextView extends i0 {
    public RobertoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.H);
            try {
                setFont(obtainStyledAttributes.getString(0));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setFont(String str) {
        if (str != null) {
            try {
                setTypeface(AssetProviderSingleton.INSTANCE.getTypeface(getContext(), str));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
        }
    }

    public RobertoTextView(p pVar) {
        super(pVar, null);
    }
}
