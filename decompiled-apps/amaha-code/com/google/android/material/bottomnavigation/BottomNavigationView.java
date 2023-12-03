package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.l1;
import com.theinnerhour.b2b.R;
import eb.c;
import qb.t;
import qb.w;
import sb.g;
import ug.l;
/* loaded from: classes.dex */
public class BottomNavigationView extends g {

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends g.a {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends g.b {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l1 e10 = t.e(getContext(), attributeSet, l.f34123e, R.attr.bottomNavigationStyle, 2132083617, new int[0]);
        setItemHorizontalTranslationEnabled(e10.a(2, true));
        if (e10.l(0)) {
            setMinimumHeight(e10.d(0, 0));
        }
        e10.a(1, true);
        e10.n();
        w.a(this, new c());
    }

    @Override // sb.g
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i6, i10);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        eb.b bVar = (eb.b) getMenuView();
        if (bVar.f13933g0 != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
