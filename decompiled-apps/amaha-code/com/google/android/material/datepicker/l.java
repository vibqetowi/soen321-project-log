package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class l extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f8973a = e0.d(null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f8974b = e0.d(null);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f8975c;

    public l(j jVar) {
        this.f8975c = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        Long l2;
        int i6;
        int width;
        if ((recyclerView.getAdapter() instanceof g0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            g0 g0Var = (g0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            j jVar = this.f8975c;
            for (s0.c<Long, Long> cVar : jVar.f8966w.z()) {
                Long l10 = cVar.f31064a;
                if (l10 != null && (l2 = cVar.f31065b) != null) {
                    long longValue = l10.longValue();
                    Calendar calendar = this.f8973a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = l2.longValue();
                    Calendar calendar2 = this.f8974b;
                    calendar2.setTimeInMillis(longValue2);
                    int i10 = calendar.get(1) - g0Var.f8959x.f8967x.f8923u.f9003w;
                    int i11 = calendar2.get(1) - g0Var.f8959x.f8967x.f8923u.f9003w;
                    View findViewByPosition = gridLayoutManager.findViewByPosition(i10);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(i11);
                    int i12 = gridLayoutManager.f2678b;
                    int i13 = i10 / i12;
                    int i14 = i11 / i12;
                    for (int i15 = i13; i15 <= i14; i15++) {
                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.f2678b * i15);
                        if (findViewByPosition3 != null) {
                            int top = findViewByPosition3.getTop() + ((b) jVar.B.f8944d).f8935a.top;
                            int bottom = findViewByPosition3.getBottom() - ((b) jVar.B.f8944d).f8935a.bottom;
                            if (i15 == i13) {
                                i6 = (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft();
                            } else {
                                i6 = 0;
                            }
                            if (i15 == i14) {
                                width = (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft();
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(i6, top, width, bottom, (Paint) jVar.B.f8947h);
                        }
                    }
                }
            }
        }
    }
}
