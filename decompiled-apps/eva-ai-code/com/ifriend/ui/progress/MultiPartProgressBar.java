package com.ifriend.ui.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* compiled from: MultiPartProgressBar.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\u000e\u001a\u00020\u000f*\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/ui/progress/MultiPartProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "state", "Lcom/ifriend/ui/progress/MultiPartProgressBar$State;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setState", "dpToPx", "", "State", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultiPartProgressBar extends View {
    public static final int $stable = 8;
    private State state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPartProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = new State(new ArrayList(), 0);
    }

    public /* synthetic */ MultiPartProgressBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Iterator<T> it;
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int dpToPx = dpToPx(this.state.getDistanceBetweenPartsInDp());
        int i2 = 1;
        int width = (getWidth() - (getPaddingStart() + getPaddingEnd())) - ((this.state.getParts().size() - 1) * dpToPx);
        int height = getHeight() - (getPaddingTop() + getPaddingBottom());
        double d = 0.0d;
        while (this.state.getParts().iterator().hasNext()) {
            d += ((State.Part) it.next()).getWeight();
        }
        List<State.Part> parts = this.state.getParts();
        int i3 = 0;
        if ((parts instanceof Collection) && parts.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it2 = parts.iterator();
            i = 0;
            while (it2.hasNext()) {
                if ((((State.Part) it2.next()).getWeight() == 0.0f) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        int i4 = width - (i * height);
        int paddingStart = getPaddingStart();
        for (State.Part part : this.state.getParts()) {
            int weight = ((part.getWeight() > 0.0f ? 1 : (part.getWeight() == 0.0f ? 0 : -1)) == 0 ? i2 : i3) != 0 ? height : (int) ((part.getWeight() / d) * i4);
            int i5 = paddingStart + weight;
            int paddingTop = getPaddingTop();
            int coerceIn = RangesKt.coerceIn((int) ((part.getProgress() / part.getMaxProgress()) * weight), i3, weight);
            float f = paddingStart;
            float f2 = paddingTop;
            float paddingTop2 = getPaddingTop() + height;
            float f3 = height / 2;
            canvas.drawRoundRect(f, f2, i5, paddingTop2, f3, f3, part.getBackgroundPaint());
            float f4 = f + coerceIn;
            canvas.drawRoundRect(f, f2, f4, paddingTop2, f3, f3, part.getGlowingPaint());
            canvas.drawRoundRect(f, f2, f4, paddingTop2, f3, f3, part.getProgressPaint());
            paddingStart = i5 + dpToPx;
            i3 = 0;
            i4 = i4;
            i2 = 1;
        }
    }

    private final int dpToPx(int i) {
        return MathKt.roundToInt(i * getResources().getDisplayMetrics().density);
    }

    /* compiled from: MultiPartProgressBar.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ifriend/ui/progress/MultiPartProgressBar$State;", "", "parts", "", "Lcom/ifriend/ui/progress/MultiPartProgressBar$State$Part;", "distanceBetweenPartsInDp", "", "(Ljava/util/List;I)V", "getDistanceBetweenPartsInDp", "()I", "getParts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Part", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class State {
        public static final int $stable = 8;
        private final int distanceBetweenPartsInDp;
        private final List<Part> parts;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = state.parts;
            }
            if ((i2 & 2) != 0) {
                i = state.distanceBetweenPartsInDp;
            }
            return state.copy(list, i);
        }

        public final List<Part> component1() {
            return this.parts;
        }

        public final int component2() {
            return this.distanceBetweenPartsInDp;
        }

        public final State copy(List<Part> parts, int i) {
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new State(parts, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof State) {
                State state = (State) obj;
                return Intrinsics.areEqual(this.parts, state.parts) && this.distanceBetweenPartsInDp == state.distanceBetweenPartsInDp;
            }
            return false;
        }

        public int hashCode() {
            return (this.parts.hashCode() * 31) + this.distanceBetweenPartsInDp;
        }

        public String toString() {
            List<Part> list = this.parts;
            int i = this.distanceBetweenPartsInDp;
            return "State(parts=" + list + ", distanceBetweenPartsInDp=" + i + ")";
        }

        public State(List<Part> parts, int i) {
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.parts = parts;
            this.distanceBetweenPartsInDp = i;
        }

        public final List<Part> getParts() {
            return this.parts;
        }

        public final int getDistanceBetweenPartsInDp() {
            return this.distanceBetweenPartsInDp;
        }

        /* compiled from: MultiPartProgressBar.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0011\u0010\u0018\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/ifriend/ui/progress/MultiPartProgressBar$State$Part;", "", "weight", "", "maxProgress", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "foregroundColor", "glowingRadius", "progress", "(FIIIFI)V", "getBackgroundColor", "()I", "backgroundPaint", "Landroid/graphics/Paint;", "getBackgroundPaint", "()Landroid/graphics/Paint;", "getForegroundColor", "glowingPaint", "getGlowingPaint", "getGlowingRadius", "()F", "getMaxProgress", "getProgress", "progressPaint", "getProgressPaint", "getWeight", "setWeight", "(F)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Part {
            public static final int $stable = 8;
            private final int backgroundColor;
            private final Paint backgroundPaint;
            private final int foregroundColor;
            private final Paint glowingPaint;
            private final float glowingRadius;
            private final int maxProgress;
            private final int progress;
            private final Paint progressPaint;
            private float weight;

            public static /* synthetic */ Part copy$default(Part part, float f, int i, int i2, int i3, float f2, int i4, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    f = part.weight;
                }
                if ((i5 & 2) != 0) {
                    i = part.maxProgress;
                }
                int i6 = i;
                if ((i5 & 4) != 0) {
                    i2 = part.backgroundColor;
                }
                int i7 = i2;
                if ((i5 & 8) != 0) {
                    i3 = part.foregroundColor;
                }
                int i8 = i3;
                if ((i5 & 16) != 0) {
                    f2 = part.glowingRadius;
                }
                float f3 = f2;
                if ((i5 & 32) != 0) {
                    i4 = part.progress;
                }
                return part.copy(f, i6, i7, i8, f3, i4);
            }

            public final float component1() {
                return this.weight;
            }

            public final int component2() {
                return this.maxProgress;
            }

            public final int component3() {
                return this.backgroundColor;
            }

            public final int component4() {
                return this.foregroundColor;
            }

            public final float component5() {
                return this.glowingRadius;
            }

            public final int component6() {
                return this.progress;
            }

            public final Part copy(float f, int i, int i2, int i3, float f2, int i4) {
                return new Part(f, i, i2, i3, f2, i4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Part) {
                    Part part = (Part) obj;
                    return Float.compare(this.weight, part.weight) == 0 && this.maxProgress == part.maxProgress && this.backgroundColor == part.backgroundColor && this.foregroundColor == part.foregroundColor && Float.compare(this.glowingRadius, part.glowingRadius) == 0 && this.progress == part.progress;
                }
                return false;
            }

            public int hashCode() {
                return (((((((((Float.floatToIntBits(this.weight) * 31) + this.maxProgress) * 31) + this.backgroundColor) * 31) + this.foregroundColor) * 31) + Float.floatToIntBits(this.glowingRadius)) * 31) + this.progress;
            }

            public String toString() {
                float f = this.weight;
                int i = this.maxProgress;
                int i2 = this.backgroundColor;
                int i3 = this.foregroundColor;
                float f2 = this.glowingRadius;
                int i4 = this.progress;
                return "Part(weight=" + f + ", maxProgress=" + i + ", backgroundColor=" + i2 + ", foregroundColor=" + i3 + ", glowingRadius=" + f2 + ", progress=" + i4 + ")";
            }

            public Part(float f, int i, int i2, int i3, float f2, int i4) {
                this.weight = f;
                this.maxProgress = i;
                this.backgroundColor = i2;
                this.foregroundColor = i3;
                this.glowingRadius = f2;
                this.progress = i4;
                Paint paint = new Paint(1);
                paint.setColor(i2);
                this.backgroundPaint = paint;
                Paint paint2 = new Paint(1);
                paint2.setColor(i3);
                this.progressPaint = paint2;
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setAlpha(255);
                paint3.setColor(i3);
                paint3.setStyle(Paint.Style.FILL);
                paint3.setShadowLayer(f2 * 2, 0.0f, 0.0f, i3);
                this.glowingPaint = paint3;
            }

            public final float getWeight() {
                return this.weight;
            }

            public final void setWeight(float f) {
                this.weight = f;
            }

            public final int getMaxProgress() {
                return this.maxProgress;
            }

            public final int getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getForegroundColor() {
                return this.foregroundColor;
            }

            public final float getGlowingRadius() {
                return this.glowingRadius;
            }

            public final int getProgress() {
                return this.progress;
            }

            public final Paint getBackgroundPaint() {
                return this.backgroundPaint;
            }

            public final Paint getProgressPaint() {
                return this.progressPaint;
            }

            public final Paint getGlowingPaint() {
                return this.glowingPaint;
            }
        }
    }
}
