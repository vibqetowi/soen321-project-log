package com.google.android.exoplayer2.ui;

import a9.h;
import a9.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import c9.w;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: CanvasSubtitleOutput.java */
/* loaded from: classes.dex */
public final class a extends View implements SubtitleView.a {

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f7077u;

    /* renamed from: v  reason: collision with root package name */
    public List<p8.a> f7078v;

    /* renamed from: w  reason: collision with root package name */
    public int f7079w;

    /* renamed from: x  reason: collision with root package name */
    public float f7080x;

    /* renamed from: y  reason: collision with root package name */
    public a9.b f7081y;

    /* renamed from: z  reason: collision with root package name */
    public float f7082z;

    public a(Context context) {
        super(context, null);
        this.f7077u = new ArrayList();
        this.f7078v = Collections.emptyList();
        this.f7079w = 0;
        this.f7080x = 0.0533f;
        this.f7081y = a9.b.f377g;
        this.f7082z = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public final void a(List<p8.a> list, a9.b bVar, float f, int i6, float f2) {
        this.f7078v = list;
        this.f7081y = bVar;
        this.f7080x = f;
        this.f7079w = i6;
        this.f7082z = f2;
        while (true) {
            ArrayList arrayList = this.f7077u;
            if (arrayList.size() < list.size()) {
                arrayList.add(new h(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0441, code lost:
        if (r6 < r3) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04fa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        List<p8.a> list;
        int i6;
        int i10;
        int i11;
        int i12;
        float f;
        int i13;
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z12;
        boolean z13;
        int round;
        float f2;
        int i20;
        float f10;
        Canvas canvas2;
        boolean z14;
        SpannableStringBuilder spannableStringBuilder;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Canvas canvas3;
        float f11;
        int i28;
        int i29;
        List<p8.a> list2 = this.f7078v;
        if (list2.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom > paddingTop && width > paddingLeft) {
            int i30 = paddingBottom - paddingTop;
            float b10 = i.b(this.f7080x, this.f7079w, height, i30);
            if (b10 <= 0.0f) {
                return;
            }
            int size = list2.size();
            int i31 = 0;
            while (i31 < size) {
                p8.a aVar = list2.get(i31);
                if (aVar.J != Integer.MIN_VALUE) {
                    CharSequence charSequence = aVar.f27983u;
                    Bitmap bitmap = aVar.f27986x;
                    Layout.Alignment alignment = aVar.f27985w;
                    list = list2;
                    int i32 = aVar.H;
                    i13 = size;
                    float f12 = aVar.I;
                    float f13 = aVar.D;
                    i12 = paddingBottom;
                    float f14 = aVar.E;
                    i11 = width;
                    boolean z15 = aVar.F;
                    i10 = paddingTop;
                    int i33 = aVar.G;
                    i6 = paddingLeft;
                    int i34 = aVar.J;
                    f = b10;
                    float f15 = aVar.K;
                    i14 = i31;
                    int i35 = aVar.f27988z;
                    float f16 = aVar.f27987y;
                    if (i35 == 0) {
                        f11 = 1.0f - f16;
                        i28 = 0;
                    } else {
                        f11 = (-f16) - 1.0f;
                        i28 = 1;
                    }
                    int i36 = aVar.A;
                    if (i36 != 0) {
                        if (i36 != 2) {
                            i29 = i36;
                        } else {
                            i29 = 0;
                        }
                    } else {
                        i29 = 2;
                    }
                    aVar = new p8.a(charSequence, null, alignment, bitmap, f11, i28, i29, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, i32, f12, f13, f14, z15, i33, i34, f15);
                } else {
                    list = list2;
                    i6 = paddingLeft;
                    i10 = paddingTop;
                    i11 = width;
                    i12 = paddingBottom;
                    f = b10;
                    i13 = size;
                    i14 = i31;
                }
                float b11 = i.b(aVar.I, aVar.H, height, i30);
                int i37 = i14;
                h hVar = (h) this.f7077u.get(i37);
                a9.b bVar = this.f7081y;
                float f17 = this.f7082z;
                hVar.getClass();
                Bitmap bitmap2 = aVar.f27986x;
                if (bitmap2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                CharSequence charSequence2 = aVar.f27983u;
                if (z10) {
                    if (TextUtils.isEmpty(charSequence2)) {
                        canvas3 = canvas;
                        i16 = height;
                        i17 = i30;
                        i18 = i37;
                        canvas2 = canvas3;
                        i31 = i18 + 1;
                        height = i16;
                        i30 = i17;
                        list2 = list;
                        size = i13;
                        paddingBottom = i12;
                        width = i11;
                        paddingTop = i10;
                        paddingLeft = i6;
                        b10 = f;
                    } else if (aVar.F) {
                        i15 = aVar.G;
                    } else {
                        i15 = bVar.f380c;
                    }
                } else {
                    i15 = -16777216;
                }
                CharSequence charSequence3 = hVar.f424i;
                if (charSequence3 != charSequence2 && (charSequence3 == null || !charSequence3.equals(charSequence2))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                TextPaint textPaint = hVar.f;
                float f18 = aVar.E;
                float f19 = aVar.D;
                i16 = height;
                int i38 = aVar.C;
                i17 = i30;
                float f20 = aVar.B;
                i18 = i37;
                int i39 = aVar.A;
                int i40 = aVar.f27988z;
                boolean z16 = z10;
                float f21 = aVar.f27987y;
                Layout.Alignment alignment2 = aVar.f27984v;
                if (z11 && w.a(hVar.f425j, alignment2) && hVar.f426k == bitmap2 && hVar.f427l == f21 && hVar.f428m == i40) {
                    i19 = i40;
                    if (w.a(Integer.valueOf(hVar.f429n), Integer.valueOf(i39)) && hVar.f430o == f20 && w.a(Integer.valueOf(hVar.f431p), Integer.valueOf(i38)) && hVar.f432q == f19 && hVar.r == f18 && hVar.f433s == bVar.f378a && hVar.f434t == bVar.f379b && hVar.f435u == i15 && hVar.f437w == bVar.f381d && hVar.f436v == bVar.f382e && w.a(textPaint.getTypeface(), bVar.f) && hVar.f438x == f && hVar.f439y == b11 && hVar.f440z == f17) {
                        int i41 = i6;
                        if (hVar.A == i41) {
                            i6 = i41;
                            int i42 = i10;
                            if (hVar.B == i42) {
                                i10 = i42;
                                int i43 = i11;
                                if (hVar.C == i43) {
                                    i11 = i43;
                                    int i44 = i12;
                                    if (hVar.D == i44) {
                                        canvas3 = canvas;
                                        i12 = i44;
                                        hVar.a(canvas3, z16);
                                        canvas2 = canvas3;
                                        i31 = i18 + 1;
                                        height = i16;
                                        i30 = i17;
                                        list2 = list;
                                        size = i13;
                                        paddingBottom = i12;
                                        width = i11;
                                        paddingTop = i10;
                                        paddingLeft = i6;
                                        b10 = f;
                                    } else {
                                        i12 = i44;
                                    }
                                } else {
                                    i11 = i43;
                                }
                            } else {
                                i10 = i42;
                            }
                        } else {
                            i6 = i41;
                        }
                    }
                    z12 = z16;
                } else {
                    i19 = i40;
                    z12 = z16;
                }
                hVar.f424i = charSequence2;
                hVar.f425j = alignment2;
                hVar.f426k = bitmap2;
                hVar.f427l = f21;
                hVar.f428m = i19;
                hVar.f429n = i39;
                hVar.f430o = f20;
                hVar.f431p = i38;
                hVar.f432q = f19;
                hVar.r = f18;
                hVar.f433s = bVar.f378a;
                hVar.f434t = bVar.f379b;
                hVar.f435u = i15;
                hVar.f437w = bVar.f381d;
                hVar.f436v = bVar.f382e;
                textPaint.setTypeface(bVar.f);
                float f22 = f;
                hVar.f438x = f22;
                hVar.f439y = b11;
                hVar.f440z = f17;
                int i45 = i6;
                hVar.A = i45;
                int i46 = i10;
                hVar.B = i46;
                int i47 = i11;
                hVar.C = i47;
                int i48 = i12;
                hVar.D = i48;
                if (z12) {
                    hVar.f424i.getClass();
                    CharSequence charSequence4 = hVar.f424i;
                    if (charSequence4 instanceof SpannableStringBuilder) {
                        spannableStringBuilder = (SpannableStringBuilder) charSequence4;
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(hVar.f424i);
                    }
                    int i49 = hVar.C - hVar.A;
                    int i50 = hVar.D - hVar.B;
                    textPaint.setTextSize(hVar.f438x);
                    int i51 = (int) ((hVar.f438x * 0.125f) + 0.5f);
                    int i52 = i51 * 2;
                    int i53 = i49 - i52;
                    float f23 = hVar.f432q;
                    if (f23 != -3.4028235E38f) {
                        i53 = (int) (i53 * f23);
                    }
                    if (i53 <= 0) {
                        Log.w("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                        i6 = i45;
                        f = f22;
                        i10 = i46;
                        i12 = i48;
                        i11 = i47;
                        z14 = z12;
                        canvas2 = canvas;
                    } else {
                        i6 = i45;
                        if (hVar.f439y > 0.0f) {
                            f = f22;
                            i10 = i46;
                            i21 = 0;
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) hVar.f439y), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            f = f22;
                            i10 = i46;
                            i21 = 0;
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                        if (hVar.f437w == 1) {
                            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i21, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                            int i54 = 0;
                            for (int length = foregroundColorSpanArr.length; i54 < length; length = length) {
                                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i54]);
                                i54++;
                            }
                        }
                        if (Color.alpha(hVar.f434t) > 0) {
                            int i55 = hVar.f437w;
                            if (i55 != 0 && i55 != 2) {
                                i12 = i48;
                                spannableStringBuilder2.setSpan(new BackgroundColorSpan(hVar.f434t), 0, spannableStringBuilder2.length(), 16711680);
                            } else {
                                i12 = i48;
                                spannableStringBuilder.setSpan(new BackgroundColorSpan(hVar.f434t), 0, spannableStringBuilder.length(), 16711680);
                            }
                        } else {
                            i12 = i48;
                        }
                        Layout.Alignment alignment3 = hVar.f425j;
                        if (alignment3 == null) {
                            alignment3 = Layout.Alignment.ALIGN_CENTER;
                        }
                        i11 = i47;
                        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i53, alignment3, hVar.f420d, hVar.f421e, true);
                        hVar.E = staticLayout;
                        int height2 = staticLayout.getHeight();
                        int lineCount = hVar.E.getLineCount();
                        int i56 = 0;
                        int i57 = 0;
                        while (i56 < lineCount) {
                            i57 = Math.max((int) Math.ceil(hVar.E.getLineWidth(i56)), i57);
                            i56++;
                            lineCount = lineCount;
                            z12 = z12;
                            i51 = i51;
                        }
                        int i58 = i51;
                        z13 = z12;
                        if (hVar.f432q == -3.4028235E38f || i57 >= i53) {
                            i53 = i57;
                        }
                        int i59 = i53 + i52;
                        float f24 = hVar.f430o;
                        if (f24 != -3.4028235E38f) {
                            int round2 = Math.round(i49 * f24);
                            int i60 = hVar.A;
                            int i61 = round2 + i60;
                            int i62 = hVar.f431p;
                            if (i62 != 1) {
                                if (i62 == 2) {
                                    i61 -= i59;
                                }
                            } else {
                                i61 = ((i61 * 2) - i59) / 2;
                            }
                            i22 = Math.max(i61, i60);
                            i23 = Math.min(i59 + i22, hVar.C);
                        } else {
                            i22 = hVar.A + ((i49 - i59) / 2);
                            i23 = i22 + i59;
                        }
                        int i63 = i23 - i22;
                        if (i63 <= 0) {
                            Log.w("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                            canvas2 = canvas;
                            z14 = z13;
                        } else {
                            float f25 = hVar.f427l;
                            if (f25 != -3.4028235E38f) {
                                if (hVar.f428m == 0) {
                                    i24 = Math.round(i50 * f25) + hVar.B;
                                    int i64 = hVar.f429n;
                                    if (i64 != 2) {
                                        if (i64 == 1) {
                                            i24 = ((i24 * 2) - height2) / 2;
                                        }
                                        i26 = i24 + height2;
                                        i27 = hVar.D;
                                        if (i26 <= i27) {
                                        }
                                    } else {
                                        i24 -= height2;
                                        i26 = i24 + height2;
                                        i27 = hVar.D;
                                        if (i26 <= i27) {
                                            i24 = i27 - height2;
                                        } else {
                                            i25 = hVar.B;
                                        }
                                    }
                                } else {
                                    int lineBottom = hVar.E.getLineBottom(0) - hVar.E.getLineTop(0);
                                    float f26 = hVar.f427l;
                                    if (f26 >= 0.0f) {
                                        i24 = Math.round(f26 * lineBottom) + hVar.B;
                                        i26 = i24 + height2;
                                        i27 = hVar.D;
                                        if (i26 <= i27) {
                                        }
                                    } else {
                                        i24 = Math.round((f26 + 1.0f) * lineBottom) + hVar.D;
                                        i24 -= height2;
                                        i26 = i24 + height2;
                                        i27 = hVar.D;
                                        if (i26 <= i27) {
                                        }
                                    }
                                }
                            } else {
                                i24 = (hVar.D - height2) - ((int) (i50 * hVar.f440z));
                            }
                            i25 = i24;
                            Layout.Alignment alignment4 = alignment3;
                            hVar.E = new StaticLayout(spannableStringBuilder, textPaint, i63, alignment4, hVar.f420d, hVar.f421e, true);
                            hVar.F = new StaticLayout(spannableStringBuilder2, textPaint, i63, alignment4, hVar.f420d, hVar.f421e, true);
                            hVar.G = i22;
                            hVar.H = i25;
                            hVar.I = i58;
                        }
                    }
                    hVar.a(canvas2, z14);
                    i31 = i18 + 1;
                    height = i16;
                    i30 = i17;
                    list2 = list;
                    size = i13;
                    paddingBottom = i12;
                    width = i11;
                    paddingTop = i10;
                    paddingLeft = i6;
                    b10 = f;
                } else {
                    i6 = i45;
                    f = f22;
                    i10 = i46;
                    i12 = i48;
                    i11 = i47;
                    z13 = z12;
                    hVar.f426k.getClass();
                    Bitmap bitmap3 = hVar.f426k;
                    int i65 = hVar.C;
                    int i66 = hVar.A;
                    int i67 = hVar.D;
                    int i68 = hVar.B;
                    float f27 = i65 - i66;
                    float f28 = (hVar.f430o * f27) + i66;
                    float f29 = i67 - i68;
                    float f30 = (hVar.f427l * f29) + i68;
                    int round3 = Math.round(f27 * hVar.f432q);
                    float f31 = hVar.r;
                    if (f31 != -3.4028235E38f) {
                        round = Math.round(f29 * f31);
                    } else {
                        round = Math.round((bitmap3.getHeight() / bitmap3.getWidth()) * round3);
                    }
                    int i69 = hVar.f431p;
                    if (i69 == 2) {
                        f2 = round3;
                    } else {
                        if (i69 == 1) {
                            f2 = round3 / 2;
                        }
                        int round4 = Math.round(f28);
                        i20 = hVar.f429n;
                        if (i20 != 2) {
                            f10 = round;
                        } else {
                            if (i20 == 1) {
                                f10 = round / 2;
                            }
                            int round5 = Math.round(f30);
                            hVar.J = new Rect(round4, round5, round3 + round4, round + round5);
                        }
                        f30 -= f10;
                        int round52 = Math.round(f30);
                        hVar.J = new Rect(round4, round52, round3 + round4, round + round52);
                    }
                    f28 -= f2;
                    int round42 = Math.round(f28);
                    i20 = hVar.f429n;
                    if (i20 != 2) {
                    }
                    f30 -= f10;
                    int round522 = Math.round(f30);
                    hVar.J = new Rect(round42, round522, round3 + round42, round + round522);
                }
                canvas2 = canvas;
                z14 = z13;
                hVar.a(canvas2, z14);
                i31 = i18 + 1;
                height = i16;
                i30 = i17;
                list2 = list;
                size = i13;
                paddingBottom = i12;
                width = i11;
                paddingTop = i10;
                paddingLeft = i6;
                b10 = f;
            }
        }
    }
}
