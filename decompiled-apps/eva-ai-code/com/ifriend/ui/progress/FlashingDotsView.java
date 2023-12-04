package com.ifriend.ui.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.UIUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
/* compiled from: TextFlashingDotsView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00070\u0010j\u0002`\u00112\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0018\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0010j\u0002`\u00110\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u0018\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007H\u0014J\u001a\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0010j\u0002`\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ifriend/ui/progress/FlashingDotsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_enabled", "", "_handler", "Landroid/os/Handler;", "activeDotImage", "frameIndex", "frames", "", "Lcom/ifriend/ui/progress/FlashingDotsFrame;", "imageSize", "images", "Landroid/widget/ImageView;", "inactiveDotImage", "marginBetweenImages", "createFrame", "flashingDotIndex", "createFrames", "createImage", "onAttachedToWindow", "", "onDetachedFromWindow", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "parseAttrs", "startFlashing", "stopFlashing", "updateFrames", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashingDotsView extends LinearLayout {
    @Deprecated
    public static final String BASE = "...";
    private boolean _enabled;
    private final Handler _handler;
    private int activeDotImage;
    private int frameIndex;
    private List<? extends List<Integer>> frames;
    private int imageSize;
    private final List<ImageView> images;
    private int inactiveDotImage;
    private int marginBetweenImages;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlashingDotsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlashingDotsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlashingDotsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashingDotsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this._handler = new Handler(Looper.getMainLooper());
        this.activeDotImage = R.drawable.flasing_dot_active;
        this.inactiveDotImage = R.drawable.flasing_dot_inactive;
        this.frames = createFrames();
        this.imageSize = UIUtils.INSTANCE.getToPxInt((Number) 6);
        this.marginBetweenImages = UIUtils.INSTANCE.getToPxInt((Number) 4);
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(createImage());
        }
        ArrayList<View> arrayList2 = arrayList;
        this.images = arrayList2;
        parseAttrs(context, attributeSet);
        setOrientation(0);
        for (View view : arrayList2) {
            addView(view);
        }
        int i3 = 0;
        for (Object obj : this.images) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ImageView imageView = (ImageView) obj;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            LinearLayout.LayoutParams layoutParams3 = layoutParams2;
            layoutParams3.height = this.imageSize;
            layoutParams3.width = this.imageSize;
            if (i3 == 1) {
                layoutParams3.setMarginStart(this.marginBetweenImages);
                layoutParams3.setMarginEnd(this.marginBetweenImages);
            }
            imageView.setLayoutParams(layoutParams2);
            i3 = i4;
        }
        updateFrames();
    }

    /* compiled from: TextFlashingDotsView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/progress/FlashingDotsView$Companion;", "", "()V", "BASE", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final ImageView createImage() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(this.inactiveDotImage);
        return imageView;
    }

    private final void updateFrames() {
        this.frames = createFrames();
    }

    private final List<List<Integer>> createFrames() {
        IntRange indices = StringsKt.getIndices("...");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(createFrame(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    private final List<Integer> createFrame(int i) {
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(Integer.valueOf(this.inactiveDotImage));
        }
        List<Integer> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.set(i, Integer.valueOf(this.activeDotImage));
        return mutableList;
    }

    private final void parseAttrs(Context context, AttributeSet attributeSet) {
        int[] FlashingDotsView = R.styleable.FlashingDotsView;
        Intrinsics.checkNotNullExpressionValue(FlashingDotsView, "FlashingDotsView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FlashingDotsView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (isAttachedToWindow()) {
            startFlashing();
        } else if (isAttachedToWindow()) {
        } else {
            stopFlashing();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startFlashing();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopFlashing();
    }

    private final void startFlashing() {
        if (getVisibility() == 0 && !this._enabled) {
            this._enabled = true;
            this._handler.post(new Runnable() { // from class: com.ifriend.ui.progress.FlashingDotsView$startFlashing$1
                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    int i2;
                    List list;
                    List list2;
                    int i3;
                    List list3;
                    boolean z;
                    Handler handler;
                    FlashingDotsView flashingDotsView = FlashingDotsView.this;
                    i = flashingDotsView.frameIndex;
                    flashingDotsView.frameIndex = i + 1;
                    i2 = FlashingDotsView.this.frameIndex;
                    list = FlashingDotsView.this.frames;
                    int i4 = 0;
                    if (i2 >= list.size()) {
                        FlashingDotsView.this.frameIndex = 0;
                    }
                    list2 = FlashingDotsView.this.frames;
                    i3 = FlashingDotsView.this.frameIndex;
                    List list4 = (List) list2.get(i3);
                    list3 = FlashingDotsView.this.images;
                    for (Object obj : list3) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        ((ImageView) obj).setImageResource(((Number) list4.get(i4)).intValue());
                        i4 = i5;
                    }
                    z = FlashingDotsView.this._enabled;
                    if (z) {
                        handler = FlashingDotsView.this._handler;
                        handler.postDelayed(this, 400L);
                    }
                }
            });
        }
    }

    private final void stopFlashing() {
        this._enabled = false;
        this._handler.removeCallbacksAndMessages(null);
    }
}
