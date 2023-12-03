package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import ug.l;
import yb.i;
/* compiled from: RadialViewGroup.java */
/* loaded from: classes.dex */
public class d extends ConstraintLayout {
    public final c K;
    public int L;
    public yb.f M;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            view.setId(d0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            c cVar = this.K;
            handler.removeCallbacks(cVar);
            handler.post(cVar);
        }
    }

    public void l() {
        int i6;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i6 = Math.round(this.L * 0.66f);
            } else {
                i6 = this.L;
            }
            float f = 0.0f;
            for (View view : list) {
                b.C0027b c0027b = bVar.k(view.getId()).f1823e;
                c0027b.A = R.id.circle_center;
                c0027b.B = i6;
                c0027b.C = f;
                f += 360.0f / list.size();
            }
        }
        bVar.b(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            c cVar = this.K;
            handler.removeCallbacks(cVar);
            handler.post(cVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i6) {
        this.M.k(ColorStateList.valueOf(i6));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.c] */
    public d(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        yb.f fVar = new yb.f();
        this.M = fVar;
        yb.g gVar = new yb.g(0.5f);
        i iVar = fVar.f38424u.f38431a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        aVar.f38467e = gVar;
        aVar.f = gVar;
        aVar.f38468g = gVar;
        aVar.f38469h = gVar;
        fVar.setShapeAppearanceModel(new i(aVar));
        this.M.k(ColorStateList.valueOf(-1));
        yb.f fVar2 = this.M;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.F, i6, 0);
        this.L = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.K = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.l();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
