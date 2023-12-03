package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: u  reason: collision with root package name */
    public final Calendar f8921u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f8922v;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8921u = e0.d(null);
        if (r.J(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f8922v = r.K(R.attr.nestedScrollable, getContext());
        t0.d0.q(this, new q());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public final x getAdapter2() {
        return (x) super.getAdapter();
    }

    public final View b(int i6) {
        return getChildAt(i6 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int b10;
        int width;
        int b11;
        int width2;
        int i6;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        x adapter2 = getAdapter2();
        d<?> dVar = adapter2.f9008v;
        c cVar = adapter2.f9010x;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int b12 = adapter2.b();
        w wVar = adapter2.f9007u;
        int min = Math.min((b12 + wVar.f9005y) - 1, getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<s0.c<Long, Long>> it = dVar.z().iterator();
        while (it.hasNext()) {
            s0.c<Long, Long> next = it.next();
            Long l2 = next.f31064a;
            if (l2 != null) {
                Long l10 = next.f31065b;
                if (l10 != null) {
                    long longValue = l2.longValue();
                    long longValue2 = l10.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (item != null && item2 != null && valueOf != null && valueOf2 != null && valueOf.longValue() <= item2.longValue() && valueOf2.longValue() >= item.longValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        boolean c10 = qb.w.c(this);
                        long longValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f8921u;
                        if (longValue < longValue3) {
                            if (max % wVar.f9004x == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                width = 0;
                            } else if (!c10) {
                                width = materialCalendarGridView.b(max - 1).getRight();
                            } else {
                                width = materialCalendarGridView.b(max - 1).getLeft();
                            }
                            b10 = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            b10 = adapter2.b() + (calendar.get(5) - 1);
                            View b13 = materialCalendarGridView.b(b10);
                            width = (b13.getWidth() / 2) + b13.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            if ((min + 1) % wVar.f9004x == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                width2 = getWidth();
                            } else if (!c10) {
                                width2 = materialCalendarGridView.b(min).getRight();
                            } else {
                                width2 = materialCalendarGridView.b(min).getLeft();
                            }
                            b11 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            b11 = adapter2.b() + (calendar.get(5) - 1);
                            View b14 = materialCalendarGridView.b(b11);
                            width2 = (b14.getWidth() / 2) + b14.getLeft();
                        }
                        int itemId = (int) adapter2.getItemId(b10);
                        int i13 = max;
                        int i14 = min;
                        int itemId2 = (int) adapter2.getItemId(b11);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            x xVar = adapter2;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View b15 = materialCalendarGridView.b(numColumns);
                            int top = b15.getTop() + ((b) cVar.f8941a).f8935a.top;
                            Iterator<s0.c<Long, Long>> it2 = it;
                            int bottom = b15.getBottom() - ((b) cVar.f8941a).f8935a.bottom;
                            if (!c10) {
                                if (numColumns > b10) {
                                    i11 = 0;
                                } else {
                                    i11 = width;
                                }
                                if (b11 > numColumns2) {
                                    i12 = getWidth();
                                } else {
                                    i12 = width2;
                                }
                            } else {
                                if (b11 > numColumns2) {
                                    i6 = 0;
                                } else {
                                    i6 = width2;
                                }
                                if (numColumns > b10) {
                                    i10 = getWidth();
                                } else {
                                    i10 = width;
                                }
                                int i15 = i10;
                                i11 = i6;
                                i12 = i15;
                            }
                            canvas.drawRect(i11, top, i12, bottom, (Paint) cVar.f8947h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter2 = xVar;
                            it = it2;
                        }
                        materialCalendarGridView = this;
                        max = i13;
                        min = i14;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i6, Rect rect) {
        if (z10) {
            if (i6 == 33) {
                x adapter2 = getAdapter2();
                setSelection((adapter2.b() + adapter2.f9007u.f9005y) - 1);
                return;
            } else if (i6 == 130) {
                setSelection(getAdapter2().b());
                return;
            } else {
                super.onFocusChanged(true, i6, rect);
                return;
            }
        }
        super.onFocusChanged(false, i6, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (!super.onKeyDown(i6, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
            return true;
        }
        if (19 != i6) {
            return false;
        }
        setSelection(getAdapter2().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i6, int i10) {
        if (this.f8922v) {
            super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i6, i10);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i6) {
        if (i6 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i6);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof x) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), x.class.getCanonicalName()));
    }
}
