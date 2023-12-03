package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import qb.w;
/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.f9186b0 && (view instanceof TabLayout.i)) {
            TabLayout.i iVar = (TabLayout.i) view;
            int contentWidth = iVar.getContentWidth();
            int contentHeight = iVar.getContentHeight();
            int b10 = (int) w.b(24, iVar.getContext());
            if (contentWidth < b10) {
                contentWidth = b10;
            }
            int right = (iVar.getRight() + iVar.getLeft()) / 2;
            int bottom = (iVar.getBottom() + iVar.getTop()) / 2;
            int i6 = contentWidth / 2;
            return new RectF(right - i6, bottom - (contentHeight / 2), i6 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(ab.a.b(f, (int) a10.left, (int) a11.left), drawable.getBounds().top, ab.a.b(f, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
