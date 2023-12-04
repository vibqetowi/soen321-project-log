package com.ifriend.ui.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.ifriend.ui.R;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\u001a\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ifriend/ui/progress/TextFlashingDotsView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_enabled", "", "flashingDotColor", "frameIndex", "frames", "", "Landroid/text/SpannableString;", "createFrame", "flashingDotIndex", "createFrames", "onAttachedToWindow", "", "onDetachedFromWindow", "parseAttrs", "startFlashing", "stopFlashing", "updateFrames", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextFlashingDotsView extends AppCompatTextView {
    @Deprecated
    public static final String BASE = "...";
    private boolean _enabled;
    private int flashingDotColor;
    private int frameIndex;
    private List<? extends SpannableString> frames;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFlashingDotsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFlashingDotsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextFlashingDotsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFlashingDotsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.flashingDotColor = -1;
        this.frames = createFrames();
        parseAttrs(context, attributeSet);
        updateFrames();
        setText((CharSequence) CollectionsKt.first((List<? extends Object>) this.frames));
    }

    /* compiled from: TextFlashingDotsView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/progress/TextFlashingDotsView$Companion;", "", "()V", "BASE", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void updateFrames() {
        this.frames = createFrames();
    }

    private final List<SpannableString> createFrames() {
        IntRange indices = StringsKt.getIndices("...");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(createFrame(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    private final SpannableString createFrame(int i) {
        SpannableString spannableString = new SpannableString("...");
        spannableString.setSpan(new ForegroundColorSpan(this.flashingDotColor), i, i + 1, 33);
        return spannableString;
    }

    private final void parseAttrs(Context context, AttributeSet attributeSet) {
        int[] FlashingDotsView = R.styleable.FlashingDotsView;
        Intrinsics.checkNotNullExpressionValue(FlashingDotsView, "FlashingDotsView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FlashingDotsView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.flashingDotColor = obtainStyledAttributes.getColor(R.styleable.FlashingDotsView_flashingDotColor, ContextCompat.getColor(context, R.color.default_flashing_dot_color));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startFlashing();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopFlashing();
    }

    private final void startFlashing() {
        if (this._enabled) {
            return;
        }
        this._enabled = true;
        getHandler().post(new Runnable() { // from class: com.ifriend.ui.progress.TextFlashingDotsView$startFlashing$1
            @Override // java.lang.Runnable
            public void run() {
                int i;
                int i2;
                List list;
                List list2;
                int i3;
                boolean z;
                TextFlashingDotsView textFlashingDotsView = TextFlashingDotsView.this;
                i = textFlashingDotsView.frameIndex;
                textFlashingDotsView.frameIndex = i + 1;
                i2 = TextFlashingDotsView.this.frameIndex;
                list = TextFlashingDotsView.this.frames;
                if (i2 >= list.size()) {
                    TextFlashingDotsView.this.frameIndex = 0;
                }
                TextFlashingDotsView textFlashingDotsView2 = TextFlashingDotsView.this;
                list2 = textFlashingDotsView2.frames;
                i3 = TextFlashingDotsView.this.frameIndex;
                textFlashingDotsView2.setText((CharSequence) list2.get(i3));
                z = TextFlashingDotsView.this._enabled;
                if (z) {
                    TextFlashingDotsView.this.getHandler().postDelayed(this, 400L);
                }
            }
        });
    }

    private final void stopFlashing() {
        this._enabled = false;
        getHandler().removeCallbacksAndMessages(null);
    }
}
