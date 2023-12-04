package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel {
    private static final String TAG = "CarouselLayoutManager";
    private CarouselStrategy carouselStrategy;
    private KeylineState currentKeylineState;
    private int horizontalScrollOffset;
    private KeylineStateList keylineStateList;
    private int maxHorizontalScroll;
    private int minHorizontalScroll;
    private boolean isDebuggingEnabled = false;
    private final DebugItemDecoration debugItemDecoration = new DebugItemDecoration();
    private int currentFillStartPosition = 0;

    private static int calculateShouldHorizontallyScrollBy(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class ChildCalculations {
        View child;
        float locOffset;
        KeylineRange range;

        ChildCalculations(View view, float f, KeylineRange keylineRange) {
            this.child = view;
            this.locOffset = f;
            this.range = keylineRange;
        }
    }

    public CarouselLayoutManager() {
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public void setCarouselStrategy(CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        this.keylineStateList = null;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0) {
            removeAndRecycleAllViews(recycler);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean isLayoutRtl = isLayoutRtl();
        boolean z = this.keylineStateList == null;
        if (z) {
            View viewForPosition = recycler.getViewForPosition(0);
            measureChildWithMargins(viewForPosition, 0, 0);
            KeylineState onFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewForPosition);
            if (isLayoutRtl) {
                onFirstChildMeasuredWithMargins = KeylineState.reverse(onFirstChildMeasuredWithMargins);
            }
            this.keylineStateList = KeylineStateList.from(this, onFirstChildMeasuredWithMargins);
        }
        int calculateStartHorizontalScroll = calculateStartHorizontalScroll(this.keylineStateList);
        int calculateEndHorizontalScroll = calculateEndHorizontalScroll(state, this.keylineStateList);
        int i = isLayoutRtl ? calculateEndHorizontalScroll : calculateStartHorizontalScroll;
        this.minHorizontalScroll = i;
        if (isLayoutRtl) {
            calculateEndHorizontalScroll = calculateStartHorizontalScroll;
        }
        this.maxHorizontalScroll = calculateEndHorizontalScroll;
        if (z) {
            this.horizontalScrollOffset = calculateStartHorizontalScroll;
        } else {
            int i2 = this.horizontalScrollOffset;
            this.horizontalScrollOffset = i2 + calculateShouldHorizontallyScrollBy(0, i2, i, calculateEndHorizontalScroll);
        }
        this.currentFillStartPosition = MathUtils.clamp(this.currentFillStartPosition, 0, state.getItemCount());
        updateCurrentKeylineStateForScrollOffset();
        detachAndScrapAttachedViews(recycler);
        fill(recycler, state);
    }

    private void fill(RecyclerView.Recycler recycler, RecyclerView.State state) {
        removeAndRecycleOutOfBoundsViews(recycler);
        if (getChildCount() == 0) {
            addViewsStart(recycler, this.currentFillStartPosition - 1);
            addViewsEnd(recycler, state, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(recycler, position - 1);
            addViewsEnd(recycler, state, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    private void addViewsStart(RecyclerView.Recycler recycler, int i) {
        int calculateChildStartForFill = calculateChildStartForFill(i);
        while (i >= 0) {
            ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill, i);
            if (isLocOffsetOutOfFillBoundsStart(makeChildCalculations.locOffset, makeChildCalculations.range)) {
                return;
            }
            calculateChildStartForFill = addStart(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.locOffset, makeChildCalculations.range)) {
                addAndLayoutView(makeChildCalculations.child, 0, makeChildCalculations.locOffset);
            }
            i--;
        }
    }

    private void addViewsEnd(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        int calculateChildStartForFill = calculateChildStartForFill(i);
        while (i < state.getItemCount()) {
            ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill, i);
            if (isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.locOffset, makeChildCalculations.range)) {
                return;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.locOffset, makeChildCalculations.range)) {
                addAndLayoutView(makeChildCalculations.child, -1, makeChildCalculations.locOffset);
            }
            i++;
        }
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "internal representation of views on the screen");
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                float decoratedCenterXWithMargins = getDecoratedCenterXWithMargins(childAt);
                Log.d(TAG, "item position " + getPosition(childAt) + ", center:" + decoratedCenterXWithMargins + ", child index:" + i);
            }
            Log.d(TAG, "==============");
        }
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i = 0;
        while (i < getChildCount() - 1) {
            int position = getPosition(getChildAt(i));
            int i2 = i + 1;
            int position2 = getPosition(getChildAt(i2));
            if (position > position2) {
                logChildrenIfDebugging();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + position + "] and child at index [" + i2 + "] had adapter position [" + position2 + "].");
            }
            i = i2;
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.Recycler recycler, float f, int i) {
        View viewForPosition = recycler.getViewForPosition(i);
        measureChildWithMargins(viewForPosition, 0, 0);
        float addEnd = addEnd((int) f, (int) (this.currentKeylineState.getItemSize() / 2.0f));
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(viewForPosition, addEnd, surroundingKeylineRange);
        updateChildMaskForLocation(viewForPosition, addEnd, surroundingKeylineRange);
        return new ChildCalculations(viewForPosition, calculateChildOffsetCenterForLocation, surroundingKeylineRange);
    }

    private void addAndLayoutView(View view, int i, float f) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i);
        layoutDecoratedWithMargins(view, (int) (f - itemSize), getParentTop(), (int) (f + itemSize), getParentBottom());
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f, KeylineRange keylineRange) {
        int addEnd = addEnd((int) f, (int) (getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f));
        if (isLayoutRtl()) {
            if (addEnd > getContainerWidth()) {
                return true;
            }
        } else if (addEnd < 0) {
            return true;
        }
        return false;
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f, KeylineRange keylineRange) {
        int addStart = addStart((int) f, (int) (getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f));
        if (isLayoutRtl()) {
            if (addStart < 0) {
                return true;
            }
        } else if (addStart > getContainerWidth()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - getMaskedItemSizeForLocOffset(centerX, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), centerX, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    private float getDecoratedCenterXWithMargins(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return rect.centerX();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterXWithMargins = getDecoratedCenterXWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterXWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterXWithMargins, true))) {
                break;
            }
            removeAndRecycleView(childAt, recycler);
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterXWithMargins2 = getDecoratedCenterXWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterXWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterXWithMargins2, true))) {
                return;
            }
            removeAndRecycleView(childAt2, recycler);
        }
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            KeylineState.Keyline keyline = list.get(i5);
            float f6 = z ? keyline.locOffset : keyline.loc;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new KeylineRange(list.get(i), list.get(i3));
    }

    private void updateCurrentKeylineStateForScrollOffset() {
        int i = this.maxHorizontalScroll;
        int i2 = this.minHorizontalScroll;
        if (i <= i2) {
            this.currentKeylineState = isLayoutRtl() ? this.keylineStateList.getRightState() : this.keylineStateList.getLeftState();
        } else {
            this.currentKeylineState = this.keylineStateList.getShiftedState(this.horizontalScrollOffset, i2, i);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private int calculateStartHorizontalScroll(KeylineStateList keylineStateList) {
        boolean isLayoutRtl = isLayoutRtl();
        KeylineState rightState = isLayoutRtl ? keylineStateList.getRightState() : keylineStateList.getLeftState();
        return (int) (((getPaddingStart() * (isLayoutRtl ? 1 : -1)) + getParentStart()) - addStart((int) (isLayoutRtl ? rightState.getLastFocalKeyline() : rightState.getFirstFocalKeyline()).loc, (int) (rightState.getItemSize() / 2.0f)));
    }

    private int calculateEndHorizontalScroll(RecyclerView.State state, KeylineStateList keylineStateList) {
        boolean isLayoutRtl = isLayoutRtl();
        KeylineState leftState = isLayoutRtl ? keylineStateList.getLeftState() : keylineStateList.getRightState();
        KeylineState.Keyline firstFocalKeyline = isLayoutRtl ? leftState.getFirstFocalKeyline() : leftState.getLastFocalKeyline();
        float itemCount = (((state.getItemCount() - 1) * leftState.getItemSize()) + getPaddingEnd()) * (isLayoutRtl ? -1.0f : 1.0f);
        float parentStart = firstFocalKeyline.loc - getParentStart();
        float parentEnd = getParentEnd() - firstFocalKeyline.loc;
        if (Math.abs(parentStart) > Math.abs(itemCount)) {
            return 0;
        }
        return (int) ((itemCount - parentStart) + parentEnd);
    }

    private int calculateChildStartForFill(int i) {
        return addEnd(getParentStart() - this.horizontalScrollOffset, (int) (this.currentKeylineState.getItemSize() * i));
    }

    private float calculateChildOffsetCenterForLocation(View view, float f, KeylineRange keylineRange) {
        float lerp = AnimationUtils.lerp(keylineRange.left.locOffset, keylineRange.right.locOffset, keylineRange.left.loc, keylineRange.right.loc, f);
        if (keylineRange.right == this.currentKeylineState.getFirstKeyline() || keylineRange.left == this.currentKeylineState.getLastKeyline()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return lerp + ((f - keylineRange.right.loc) * ((1.0f - keylineRange.right.mask) + ((layoutParams.rightMargin + layoutParams.leftMargin) / this.currentKeylineState.getItemSize())));
        }
        return lerp;
    }

    private float getMaskedItemSizeForLocOffset(float f, KeylineRange keylineRange) {
        return AnimationUtils.lerp(keylineRange.left.maskedItemSize, keylineRange.right.maskedItemSize, keylineRange.left.locOffset, keylineRange.right.locOffset, f);
    }

    private void updateChildMaskForLocation(View view, float f, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            ((Maskable) view).setMaskXPercentage(AnimationUtils.lerp(keylineRange.left.mask, keylineRange.right.mask, keylineRange.left.loc, keylineRange.right.loc, f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i, int i2) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i3 = i + rect.left + rect.right;
        int i4 = i2 + rect.top + rect.bottom;
        KeylineStateList keylineStateList = this.keylineStateList;
        view.measure(getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i3, (int) (keylineStateList != null ? keylineStateList.getDefaultState().getItemSize() : layoutParams.width), canScrollHorizontally()), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, canScrollVertically()));
    }

    private int getParentStart() {
        if (isLayoutRtl()) {
            return getWidth();
        }
        return 0;
    }

    private int getParentEnd() {
        if (isLayoutRtl()) {
            return 0;
        }
        return getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return getPaddingTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return getHeight() - getPaddingBottom();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    private boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    private int addStart(int i, int i2) {
        return isLayoutRtl() ? i + i2 : i - i2;
    }

    private int addEnd(int i, int i2) {
        return isLayoutRtl() ? i - i2 : i + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollOffsetForPosition(KeylineState keylineState, int i) {
        if (isLayoutRtl()) {
            return (int) (((getContainerWidth() - keylineState.getLastFocalKeyline().loc) - (i * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) (((i * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc) + (keylineState.getItemSize() / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        KeylineStateList keylineStateList = this.keylineStateList;
        if (keylineStateList == null) {
            return;
        }
        this.horizontalScrollOffset = getScrollOffsetForPosition(keylineStateList.getDefaultState(), i);
        this.currentFillStartPosition = MathUtils.clamp(i, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i2) {
                if (CarouselLayoutManager.this.keylineStateList == null) {
                    return null;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return new PointF(carouselLayoutManager.getScrollOffsetForPosition(carouselLayoutManager.keylineStateList.getDefaultState(), i2) - CarouselLayoutManager.this.horizontalScrollOffset, 0.0f);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDxToMakeVisible(View view, int i2) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return (int) (CarouselLayoutManager.this.horizontalScrollOffset - carouselLayoutManager.getScrollOffsetForPosition(carouselLayoutManager.keylineStateList.getDefaultState(), CarouselLayoutManager.this.getPosition(view)));
            }
        };
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        KeylineStateList keylineStateList = this.keylineStateList;
        if (keylineStateList == null) {
            return false;
        }
        int scrollOffsetForPosition = getScrollOffsetForPosition(keylineStateList.getDefaultState(), getPosition(view)) - this.horizontalScrollOffset;
        if (z2 || scrollOffsetForPosition == 0) {
            return false;
        }
        recyclerView.scrollBy(scrollOffsetForPosition, 0);
        return true;
    }

    private int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int calculateShouldHorizontallyScrollBy = calculateShouldHorizontallyScrollBy(i, this.horizontalScrollOffset, this.minHorizontalScroll, this.maxHorizontalScroll);
        this.horizontalScrollOffset += calculateShouldHorizontallyScrollBy;
        updateCurrentKeylineStateForScrollOffset();
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        int calculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            offsetChildLeftAndRight(getChildAt(i2), calculateChildStartForFill, itemSize, rect);
            calculateChildStartForFill = addEnd(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
        }
        fill(recycler, state);
        return calculateShouldHorizontallyScrollBy;
    }

    private void offsetChildLeftAndRight(View view, float f, float f2, Rect rect) {
        float addEnd = addEnd((int) f, (int) f2);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, addEnd, surroundingKeylineRange);
        updateChildMaskForLocation(view, addEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        view.offsetLeftAndRight((int) (calculateChildOffsetCenterForLocation - (rect.left + f2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.horizontalScrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return (int) this.keylineStateList.getDefaultState().getItemSize();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.maxHorizontalScroll - this.minHorizontalScroll;
    }

    public void setDebuggingEnabled(RecyclerView recyclerView, boolean z) {
        this.isDebuggingEnabled = z;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class KeylineRange {
        final KeylineState.Keyline left;
        final KeylineState.Keyline right;

        KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            Preconditions.checkArgument(keyline.loc <= keyline2.loc);
            this.left = keyline;
            this.right = keyline2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class DebugItemDecoration extends RecyclerView.ItemDecoration {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(ColorUtils.blendARGB(-65281, -16776961, keyline.mask));
                canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
            }
        }
    }
}
