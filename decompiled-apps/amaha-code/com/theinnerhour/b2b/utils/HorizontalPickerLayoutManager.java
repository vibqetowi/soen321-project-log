package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import kotlin.Metadata;
/* compiled from: HorizontalPickerLayoutManager.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001e\u0010\r\u001a\u00020\u00022\f\u0010\n\u001a\b\u0018\u00010\tR\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\n\u001a\b\u0018\u00010\tR\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/theinnerhour/b2b/utils/HorizontalPickerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lhs/k;", "scaleDownView", "", "getRecyclerViewCenterX", "Landroidx/recyclerview/widget/RecyclerView;", "view", "onAttachedToWindow", "Landroidx/recyclerview/widget/RecyclerView$t;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$y;", "state", "onLayoutChildren", "dx", "scrollHorizontallyBy", "onScrollStateChanged", "Lcom/theinnerhour/b2b/utils/HorizontalPickerLayoutManager$OnItemSelectedListener;", "callback", "Lcom/theinnerhour/b2b/utils/HorizontalPickerLayoutManager$OnItemSelectedListener;", "getCallback", "()Lcom/theinnerhour/b2b/utils/HorizontalPickerLayoutManager$OnItemSelectedListener;", "setCallback", "(Lcom/theinnerhour/b2b/utils/HorizontalPickerLayoutManager$OnItemSelectedListener;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "OnItemSelectedListener", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class HorizontalPickerLayoutManager extends LinearLayoutManager {
    private OnItemSelectedListener callback;
    private RecyclerView recyclerView;

    /* compiled from: HorizontalPickerLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/utils/HorizontalPickerLayoutManager$OnItemSelectedListener;", "", "", "layoutPosition", "Lhs/k;", "onItemSelected", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public interface OnItemSelectedListener {
        void onItemSelected(int i6);
    }

    public HorizontalPickerLayoutManager(Context context) {
        super(context);
        setOrientation(0);
    }

    private final int getRecyclerViewCenterX() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            int right = recyclerView.getRight();
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 != null) {
                return (right - recyclerView2.getLeft()) / 2;
            }
            kotlin.jvm.internal.i.q("recyclerView");
            throw null;
        }
        kotlin.jvm.internal.i.q("recyclerView");
        throw null;
    }

    private final void scaleDownView() {
        float width = getWidth() / 2.0f;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            kotlin.jvm.internal.i.d(childAt);
            float sqrt = 1 - (((float) Math.sqrt(Math.abs(width - ((getDecoratedRight(childAt) + getDecoratedLeft(childAt)) / 2.0f)) / getWidth())) * 0.66f);
            childAt.setScaleX(sqrt);
            childAt.setScaleY(sqrt);
            childAt.setAlpha(sqrt);
        }
    }

    public final OnItemSelectedListener getCallback() {
        return this.callback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        kotlin.jvm.internal.i.d(recyclerView);
        this.recyclerView = recyclerView;
        r rVar = new r();
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            rVar.a(recyclerView2);
        } else {
            kotlin.jvm.internal.i.q("recyclerView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void onLayoutChildren(RecyclerView.t tVar, RecyclerView.y state) {
        kotlin.jvm.internal.i.g(state, "state");
        super.onLayoutChildren(tVar, state);
        scaleDownView();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onScrollStateChanged(int i6) {
        super.onScrollStateChanged(i6);
        if (i6 == 0) {
            int recyclerViewCenterX = getRecyclerViewCenterX();
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null) {
                int width = recyclerView.getWidth();
                RecyclerView recyclerView2 = this.recyclerView;
                if (recyclerView2 != null) {
                    int childCount = recyclerView2.getChildCount();
                    int i10 = -1;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        RecyclerView recyclerView3 = this.recyclerView;
                        if (recyclerView3 != null) {
                            View childAt = recyclerView3.getChildAt(i11);
                            int abs = Math.abs((((getDecoratedRight(childAt) - getDecoratedLeft(childAt)) / 2) + getDecoratedLeft(childAt)) - recyclerViewCenterX);
                            if (abs < width) {
                                if (this.recyclerView != null) {
                                    RecyclerView.c0 L = RecyclerView.L(childAt);
                                    if (L != null) {
                                        i10 = L.h();
                                    } else {
                                        i10 = -1;
                                    }
                                    width = abs;
                                } else {
                                    kotlin.jvm.internal.i.q("recyclerView");
                                    throw null;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("recyclerView");
                            throw null;
                        }
                    }
                    OnItemSelectedListener onItemSelectedListener = this.callback;
                    if (onItemSelectedListener != null) {
                        onItemSelectedListener.onItemSelected(i10);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("recyclerView");
                throw null;
            }
            kotlin.jvm.internal.i.q("recyclerView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int scrollHorizontallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (getOrientation() == 0) {
            int scrollHorizontallyBy = super.scrollHorizontallyBy(i6, tVar, yVar);
            scaleDownView();
            return scrollHorizontallyBy;
        }
        return 0;
    }

    public final void setCallback(OnItemSelectedListener onItemSelectedListener) {
        this.callback = onItemSelectedListener;
    }
}
