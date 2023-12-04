package com.ifriend.ui.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CustomTypefaceSpan.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/ui/utils/CustomTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "type", "Landroid/graphics/Typeface;", "(Landroid/graphics/Typeface;)V", "family", "", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "mNewType", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "paint", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomTypefaceSpan extends TypefaceSpan {
    private final Typeface mNewType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTypefaceSpan(Typeface type) {
        super("");
        Intrinsics.checkNotNullParameter(type, "type");
        this.mNewType = type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTypefaceSpan(String str, Typeface type) {
        super(str);
        Intrinsics.checkNotNullParameter(type, "type");
        this.mNewType = type;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        Companion.applyCustomTypeFace(ds, this.mNewType);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Companion.applyCustomTypeFace(paint, this.mNewType);
    }

    /* compiled from: CustomTypefaceSpan.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, d2 = {"Lcom/ifriend/ui/utils/CustomTypefaceSpan$Companion;", "", "()V", "applyCustomTypeFace", "", "paint", "Landroid/graphics/Paint;", "tf", "Landroid/graphics/Typeface;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomTypeFace(Paint paint, Typeface typeface) {
            Typeface typeface2 = paint.getTypeface();
            Intrinsics.checkNotNullExpressionValue(typeface2, "getTypeface(...)");
            int style = typeface2.getStyle() & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }
    }
}
