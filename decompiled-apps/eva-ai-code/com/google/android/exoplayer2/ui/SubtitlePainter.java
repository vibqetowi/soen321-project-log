package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private float bottomPaddingFraction;
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private CharSequence cueText;
    private Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final Paint windowPaint;

    public SubtitlePainter(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.spacingAdd = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = round;
        this.shadowRadius = round;
        this.shadowOffset = round;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = cue.bitmap == null;
        if (!z) {
            i5 = -16777216;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i5 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i5 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f && this.cueTextSizePx == f2 && this.bottomPaddingFraction == f3 && this.parentLeft == i && this.parentTop == i2 && this.parentRight == i3 && this.parentBottom == i4) {
            drawLayout(canvas, z);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i5;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f;
        this.cueTextSizePx = f2;
        this.bottomPaddingFraction = f3;
        this.parentLeft = i;
        this.parentTop = i2;
        this.parentRight = i3;
        this.parentBottom = i4;
        if (z) {
            Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    @RequiresNonNull({"cueText"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupTextLayout() {
        SpannableStringBuilder spannableStringBuilder;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        CharSequence charSequence = this.cueText;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(this.cueText);
        }
        int i9 = this.parentRight - this.parentLeft;
        int i10 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i11 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i12 = i11 * 2;
        int i13 = i9 - i12;
        float f = this.cueSize;
        if (f != -3.4028235E38f) {
            i13 = (int) (i13 * f);
        }
        int i14 = i13;
        if (i14 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.backgroundColor) > 0) {
            int i15 = this.edgeType;
            if (i15 == 0 || i15 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i14, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int i16 = 0;
        for (int i17 = 0; i17 < lineCount; i17++) {
            i16 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i17)), i16);
        }
        if (this.cueSize == -3.4028235E38f || i16 >= i14) {
            i14 = i16;
        }
        int i18 = i14 + i12;
        float f2 = this.cuePosition;
        if (f2 != -3.4028235E38f) {
            int round = Math.round(i9 * f2);
            int i19 = this.parentLeft;
            int i20 = round + i19;
            int i21 = this.cuePositionAnchor;
            i = 1;
            if (i21 != 1) {
                i2 = 2;
                if (i21 == 2) {
                    i20 -= i18;
                }
            } else {
                i2 = 2;
                i20 = ((i20 * 2) - i18) / 2;
            }
            i3 = Math.max(i20, i19);
            i4 = Math.min(i18 + i3, this.parentRight);
        } else {
            i = 1;
            i2 = 2;
            i3 = ((i9 - i18) / 2) + this.parentLeft;
            i4 = i3 + i18;
        }
        int i22 = i4 - i3;
        if (i22 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.cueLine;
        if (f3 != -3.4028235E38f) {
            if (this.cueLineType == 0) {
                i5 = Math.round(i10 * f3) + this.parentTop;
                int i23 = this.cueLineAnchor;
                if (i23 != i2) {
                    if (i23 == i) {
                        i5 = ((i5 * 2) - height) / i2;
                    }
                    i7 = i5 + height;
                    i8 = this.parentBottom;
                    if (i7 <= i8) {
                        i5 = i8 - height;
                    } else {
                        int i24 = this.parentTop;
                        if (i5 < i24) {
                            i6 = i24;
                            this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i22, alignment2, this.spacingMult, this.spacingAdd, true);
                            this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i22, alignment2, this.spacingMult, this.spacingAdd, true);
                            this.textLeft = i3;
                            this.textTop = i6;
                            this.textPaddingX = i11;
                        }
                    }
                }
                i5 -= height;
                i7 = i5 + height;
                i8 = this.parentBottom;
                if (i7 <= i8) {
                }
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f4 = this.cueLine;
                if (f4 >= 0.0f) {
                    i5 = Math.round(f4 * lineBottom) + this.parentTop;
                    i7 = i5 + height;
                    i8 = this.parentBottom;
                    if (i7 <= i8) {
                    }
                } else {
                    i5 = Math.round((f4 + 1.0f) * lineBottom) + this.parentBottom;
                    i5 -= height;
                    i7 = i5 + height;
                    i8 = this.parentBottom;
                    if (i7 <= i8) {
                    }
                }
            }
        } else {
            i5 = (this.parentBottom - height) - ((int) (i10 * this.bottomPaddingFraction));
        }
        i6 = i5;
        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i22, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i22, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = i3;
        this.textTop = i6;
        this.textPaddingX = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @RequiresNonNull({"cueBitmap"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupBitmapLayout() {
        int round;
        float f;
        int i;
        float f2;
        Bitmap bitmap = this.cueBitmap;
        int i2 = this.parentRight;
        int i3 = this.parentLeft;
        int i4 = this.parentBottom;
        int i5 = this.parentTop;
        float f3 = i2 - i3;
        float f4 = i3 + (this.cuePosition * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.cueLine * f5);
        int round2 = Math.round(f3 * this.cueSize);
        float f7 = this.cueBitmapHeight;
        if (f7 != -3.4028235E38f) {
            round = Math.round(f5 * f7);
        } else {
            round = Math.round(round2 * (bitmap.getHeight() / bitmap.getWidth()));
        }
        int i6 = this.cuePositionAnchor;
        if (i6 != 2) {
            if (i6 == 1) {
                f = round2 / 2;
            }
            int round3 = Math.round(f4);
            i = this.cueLineAnchor;
            if (i == 2) {
                if (i == 1) {
                    f2 = round / 2;
                }
                int round4 = Math.round(f6);
                this.bitmapRect = new Rect(round3, round4, round2 + round3, round + round4);
            }
            f2 = round;
            f6 -= f2;
            int round42 = Math.round(f6);
            this.bitmapRect = new Rect(round3, round42, round2 + round3, round + round42);
        }
        f = round2;
        f4 -= f;
        int round32 = Math.round(f4);
        i = this.cueLineAnchor;
        if (i == 2) {
        }
        f6 -= f2;
        int round422 = Math.round(f6);
        this.bitmapRect = new Rect(round32, round422, round2 + round32, round + round422);
    }

    private void drawLayout(Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
            return;
        }
        Assertions.checkNotNull(this.bitmapRect);
        Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        }
        int i = this.edgeType;
        if (i == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.textPaint;
            float f = this.shadowRadius;
            float f2 = this.shadowOffset;
            textPaint.setShadowLayer(f, f2, f2, this.edgeColor);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.edgeColor;
            int i3 = z ? this.edgeColor : -1;
            float f3 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.textPaint.setShadowLayer(this.shadowRadius, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.textPaint.setShadowLayer(this.shadowRadius, f3, f3, i3);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private static boolean areCharSequencesEqual(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
