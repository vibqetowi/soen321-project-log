package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ScrollStateListenerCustomNestedScrollView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\n\u001a\u00020\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/theinnerhour/b2b/utils/ScrollStateListenerCustomNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "Lcom/theinnerhour/b2b/utils/ScrollStateListenerCustomNestedScrollView$OnScrollStoppedListener;", "listener", "Lhs/k;", "setOnScrollStoppedListener", "startScrollerTask", "Ljava/lang/Runnable;", "scrollerTask", "Ljava/lang/Runnable;", "", "initialPosition", "I", "isRunnableScheduled", "Z", "", "newCheck", "J", "", "TAG", "Ljava/lang/String;", "onScrollStoppedListener", "Lcom/theinnerhour/b2b/utils/ScrollStateListenerCustomNestedScrollView$OnScrollStoppedListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OnScrollStoppedListener", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ScrollStateListenerCustomNestedScrollView extends NestedScrollView {
    private final String TAG;
    public Map<Integer, View> _$_findViewCache;
    private int initialPosition;
    private boolean isRunnableScheduled;
    private final long newCheck;
    private OnScrollStoppedListener onScrollStoppedListener;
    private Runnable scrollerTask;

    /* compiled from: ScrollStateListenerCustomNestedScrollView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/utils/ScrollStateListenerCustomNestedScrollView$OnScrollStoppedListener;", "", "Lhs/k;", "onScrollStopped", "onScrollViewInteraction", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public interface OnScrollStoppedListener {
        void onScrollStopped();

        void onScrollViewInteraction();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollStateListenerCustomNestedScrollView(Context context) {
        super(context);
        kotlin.jvm.internal.i.g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.newCheck = 100L;
        this.TAG = "MyScrollView";
        this.scrollerTask = new Runnable(this) { // from class: com.theinnerhour.b2b.utils.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ScrollStateListenerCustomNestedScrollView f11818v;

            {
                this.f11818v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = r2;
                ScrollStateListenerCustomNestedScrollView scrollStateListenerCustomNestedScrollView = this.f11818v;
                switch (i6) {
                    case 0:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                    case 1:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                    default:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ScrollStateListenerCustomNestedScrollView this$0) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (this$0.initialPosition - this$0.getScrollY() == 0) {
            OnScrollStoppedListener onScrollStoppedListener = this$0.onScrollStoppedListener;
            if (onScrollStoppedListener != null) {
                onScrollStoppedListener.onScrollStopped();
            }
            this$0.isRunnableScheduled = false;
            return;
        }
        this$0.initialPosition = this$0.getScrollY();
        this$0.postDelayed(this$0.scrollerTask, this$0.newCheck);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i6) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                map.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        kotlin.jvm.internal.i.g(ev2, "ev");
        OnScrollStoppedListener onScrollStoppedListener = this.onScrollStoppedListener;
        if (onScrollStoppedListener != null) {
            if (onScrollStoppedListener != null) {
                onScrollStoppedListener.onScrollViewInteraction();
            }
            startScrollerTask();
        }
        return super.onInterceptTouchEvent(ev2);
    }

    public final void setOnScrollStoppedListener(OnScrollStoppedListener onScrollStoppedListener) {
        this.onScrollStoppedListener = onScrollStoppedListener;
    }

    public final void startScrollerTask() {
        if (!this.isRunnableScheduled) {
            this.isRunnableScheduled = true;
            this.initialPosition = getScrollY();
            postDelayed(this.scrollerTask, this.newCheck);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollStateListenerCustomNestedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(attrs, "attrs");
        this._$_findViewCache = new LinkedHashMap();
        this.newCheck = 100L;
        this.TAG = "MyScrollView";
        this.scrollerTask = new Runnable(this) { // from class: com.theinnerhour.b2b.utils.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ScrollStateListenerCustomNestedScrollView f11818v;

            {
                this.f11818v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = r2;
                ScrollStateListenerCustomNestedScrollView scrollStateListenerCustomNestedScrollView = this.f11818v;
                switch (i6) {
                    case 0:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                    case 1:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                    default:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                }
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollStateListenerCustomNestedScrollView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        kotlin.jvm.internal.i.g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.newCheck = 100L;
        this.TAG = "MyScrollView";
        this.scrollerTask = new Runnable(this) { // from class: com.theinnerhour.b2b.utils.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ScrollStateListenerCustomNestedScrollView f11818v;

            {
                this.f11818v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i62 = r2;
                ScrollStateListenerCustomNestedScrollView scrollStateListenerCustomNestedScrollView = this.f11818v;
                switch (i62) {
                    case 0:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                    case 1:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                    default:
                        ScrollStateListenerCustomNestedScrollView._init_$lambda$0(scrollStateListenerCustomNestedScrollView);
                        return;
                }
            }
        };
    }
}
