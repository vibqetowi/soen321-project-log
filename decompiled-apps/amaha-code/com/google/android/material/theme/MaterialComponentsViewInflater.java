package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.i0;
import com.google.android.material.button.MaterialButton;
import dc.q;
import g.t;
import hb.a;
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends t {
    @Override // g.t
    public final d a(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    @Override // g.t
    public final f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.t
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // g.t
    public final androidx.appcompat.widget.t d(Context context, AttributeSet attributeSet) {
        return new tb.a(context, attributeSet);
    }

    @Override // g.t
    public final i0 e(Context context, AttributeSet attributeSet) {
        return new ec.a(context, attributeSet);
    }
}
