package com.theinnerhour.b2b.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;
/* compiled from: CustomTypeFaceSpan.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B!\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/theinnerhour/b2b/utils/CustomTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "Landroid/text/TextPaint;", "ds", "Lhs/k;", "updateDrawState", "paint", "updateMeasureState", "Landroid/graphics/Typeface;", "newType", "Landroid/graphics/Typeface;", "", "color", "I", "", "family", "<init>", "(Ljava/lang/String;Landroid/graphics/Typeface;I)V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CustomTypefaceSpan extends TypefaceSpan {
    public static final Companion Companion = new Companion(null);
    private final int color;
    private final Typeface newType;

    /* compiled from: CustomTypeFaceSpan.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/utils/CustomTypefaceSpan$Companion;", "", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Typeface;", "tf", "", "color", "Lhs/k;", "applyCustomTypeFace", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomTypeFace(Paint paint, Typeface typeface, int i6) {
            Integer num;
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 != null) {
                num = Integer.valueOf(typeface2.getStyle());
            } else {
                num = 1;
            }
            int intValue = num.intValue() & (~typeface.getStyle());
            if ((intValue & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((intValue & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
            if (i6 != -1) {
                paint.setColor(i6);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTypefaceSpan(String str, Typeface newType, int i6) {
        super(str);
        kotlin.jvm.internal.i.g(newType, "newType");
        this.newType = newType;
        this.color = i6;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds2) {
        kotlin.jvm.internal.i.g(ds2, "ds");
        Companion.applyCustomTypeFace(ds2, this.newType, this.color);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        kotlin.jvm.internal.i.g(paint, "paint");
        Companion.applyCustomTypeFace(paint, this.newType, this.color);
    }
}
