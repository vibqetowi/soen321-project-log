package com.google.android.exoplayer2.ui;

import a9.i;
import a9.k;
import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import c9.w;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.exoplayer2.ui.d;
import com.google.common.collect.m0;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes.dex */
public final class f extends FrameLayout implements SubtitleView.a {
    public float A;

    /* renamed from: u  reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.a f7136u;

    /* renamed from: v  reason: collision with root package name */
    public final k f7137v;

    /* renamed from: w  reason: collision with root package name */
    public List<p8.a> f7138w;

    /* renamed from: x  reason: collision with root package name */
    public a9.b f7139x;

    /* renamed from: y  reason: collision with root package name */
    public float f7140y;

    /* renamed from: z  reason: collision with root package name */
    public int f7141z;

    /* compiled from: WebViewSubtitleOutput.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7142a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f7142a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7142a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7142a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context) {
        super(context, null);
        this.f7138w = Collections.emptyList();
        this.f7139x = a9.b.f377g;
        this.f7140y = 0.0533f;
        this.f7141z = 0;
        this.A = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f7136u = aVar;
        k kVar = new k(context);
        this.f7137v = kVar;
        kVar.setBackgroundColor(0);
        addView(aVar);
        addView(kVar);
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public final void a(List<p8.a> list, a9.b bVar, float f, int i6, float f2) {
        this.f7139x = bVar;
        this.f7140y = f;
        this.f7141z = i6;
        this.A = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            p8.a aVar = list.get(i10);
            if (aVar.f27986x != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.f7138w.isEmpty() || !arrayList2.isEmpty()) {
            this.f7138w = arrayList2;
            c();
        }
        this.f7136u.a(arrayList, bVar, f, i6, f2);
        invalidate();
    }

    public final String b(float f, int i6) {
        float b10 = i.b(f, i6, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (b10 == -3.4028235E38f) {
            return "unset";
        }
        return w.k("%.2fpx", Float.valueOf(b10 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0499, code lost:
        if (((android.text.style.TypefaceSpan) r10).getFamily() != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e9, code lost:
        if (r13 != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ec, code lost:
        if (r13 != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ef, code lost:
        r23 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f1, code lost:
        r0 = 2;
        r24 = r23;
        r23 = "top";
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x052e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String k10;
        float f;
        int i6;
        char c10;
        String k11;
        boolean z10;
        int i10;
        String str;
        Object obj;
        int i11;
        Object obj2;
        Object obj3;
        String str2;
        int i12;
        int i13;
        String str3;
        String str4;
        p8.a aVar;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Object obj4;
        d.a aVar2;
        String str11;
        Object obj5;
        float f2;
        String str12;
        String str13;
        int i14;
        String str14;
        String k12;
        String str15;
        float size;
        String str16;
        String str17;
        float f10;
        int i15;
        String str18;
        Layout.Alignment alignment;
        Object obj6;
        String str19;
        boolean z11;
        int i16;
        int i17;
        f fVar = this;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[4];
        char c11 = 0;
        objArr[0] = hc.d.j0(fVar.f7139x.f378a);
        int i18 = 1;
        objArr[1] = fVar.b(fVar.f7140y, fVar.f7141z);
        int i19 = 2;
        objArr[2] = Float.valueOf(1.2f);
        a9.b bVar = fVar.f7139x;
        int i20 = bVar.f381d;
        int i21 = bVar.f382e;
        if (i20 != 1) {
            if (i20 != 2) {
                if (i20 != 3) {
                    if (i20 != 4) {
                        k10 = "unset";
                    } else {
                        k10 = w.k("-0.05em -0.05em 0.15em %s", hc.d.j0(i21));
                    }
                } else {
                    k10 = w.k("0.06em 0.08em 0.15em %s", hc.d.j0(i21));
                }
            } else {
                k10 = w.k("0.1em 0.12em 0.15em %s", hc.d.j0(i21));
            }
        } else {
            k10 = w.k("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", hc.d.j0(i21));
        }
        objArr[3] = k10;
        sb2.append(w.k("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr));
        HashMap hashMap = new HashMap();
        String str20 = "default_bg";
        String str21 = "background-color:%s;";
        hashMap.put(hc.d.o("default_bg"), w.k("background-color:%s;", hc.d.j0(fVar.f7139x.f379b)));
        int i22 = 0;
        while (i22 < fVar.f7138w.size()) {
            p8.a aVar3 = fVar.f7138w.get(i22);
            float f11 = aVar3.B;
            if (f11 != -3.4028235E38f) {
                f = f11 * 100.0f;
            } else {
                f = 50.0f;
            }
            int i23 = aVar3.C;
            if (i23 != i18) {
                if (i23 != i19) {
                    i6 = 0;
                } else {
                    i6 = -100;
                }
            } else {
                i6 = -50;
            }
            int i24 = aVar3.J;
            float f12 = aVar3.f27987y;
            if (f12 != -3.4028235E38f) {
                if (aVar3.f27988z != i18) {
                    Object[] objArr2 = new Object[i18];
                    objArr2[c11] = Float.valueOf(f12 * 100.0f);
                    k11 = w.k("%.2f%%", objArr2);
                    int i25 = aVar3.A;
                    if (i24 == i18) {
                        if (i25 != i18) {
                            if (i25 != 2) {
                                i17 = 0;
                            } else {
                                i17 = -100;
                            }
                        } else {
                            i17 = -50;
                        }
                        i16 = -i17;
                    } else if (i25 != i18) {
                        if (i25 != 2) {
                            i16 = 0;
                        } else {
                            i16 = -100;
                        }
                    } else {
                        i16 = -50;
                    }
                    z10 = false;
                    c10 = 0;
                    i10 = i16;
                } else {
                    if (f12 >= 0.0f) {
                        Object[] objArr3 = new Object[i18];
                        c10 = 0;
                        objArr3[0] = Float.valueOf(f12 * 1.2f);
                        k11 = w.k("%.2fem", objArr3);
                        z10 = false;
                    } else {
                        c10 = 0;
                        Object[] objArr4 = new Object[i18];
                        objArr4[0] = Float.valueOf(((-f12) - 1.0f) * 1.2f);
                        k11 = w.k("%.2fem", objArr4);
                        z10 = true;
                    }
                    i10 = 0;
                }
            } else {
                c10 = 0;
                Object[] objArr5 = new Object[i18];
                objArr5[0] = Float.valueOf((1.0f - fVar.A) * 100.0f);
                k11 = w.k("%.2f%%", objArr5);
                z10 = false;
                i10 = -100;
            }
            float f13 = aVar3.D;
            if (f13 != -3.4028235E38f) {
                Object[] objArr6 = new Object[i18];
                objArr6[c10] = Float.valueOf(f13 * 100.0f);
                str = w.k("%.2f%%", objArr6);
            } else {
                str = "fit-content";
            }
            int i26 = i6;
            Layout.Alignment alignment2 = aVar3.f27984v;
            if (alignment2 == null) {
                i11 = 2;
                obj = "end";
                obj3 = "start";
                obj2 = "center";
            } else {
                int i27 = a.f7142a[alignment2.ordinal()];
                obj = "end";
                if (i27 != 1) {
                    obj3 = "start";
                    if (i27 != 2) {
                        obj2 = "center";
                    } else {
                        obj2 = obj;
                    }
                    i11 = 2;
                } else {
                    i11 = 2;
                    obj2 = "start";
                    obj3 = obj2;
                }
            }
            if (i24 != 1) {
                if (i24 != i11) {
                    str2 = "horizontal-tb";
                } else {
                    str2 = "vertical-lr";
                }
            } else {
                str2 = "vertical-rl";
            }
            String str22 = str20;
            String b10 = fVar.b(aVar3.I, aVar3.H);
            if (aVar3.F) {
                i12 = aVar3.G;
            } else {
                i12 = fVar.f7139x.f380c;
            }
            String j02 = hc.d.j0(i12);
            String str23 = "left";
            String str24 = "top";
            if (i24 != 1) {
                if (i24 != 2) {
                    if (z10) {
                        str24 = "bottom";
                    }
                    i13 = 2;
                }
            }
            if (i24 != i13 && i24 != 1) {
                str3 = "width";
            } else {
                str3 = "height";
                int i28 = i10;
                i10 = i26;
                i26 = i28;
            }
            float f14 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern = d.f7126a;
            StringBuilder sb3 = sb2;
            CharSequence charSequence = aVar3.f27983u;
            if (charSequence != null) {
                str4 = "";
                if (!(charSequence instanceof Spanned)) {
                    aVar2 = new d.a(d.a(charSequence), m0.A);
                } else {
                    Spanned spanned = (Spanned) charSequence;
                    HashSet hashSet = new HashSet();
                    aVar = aVar3;
                    str5 = j02;
                    str6 = b10;
                    BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    int length = backgroundColorSpanArr.length;
                    int i29 = 0;
                    while (i29 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i29].getBackgroundColor()));
                        i29++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    HashMap hashMap2 = new HashMap();
                    for (Iterator it = hashSet.iterator(); it.hasNext(); it = it) {
                        int intValue = ((Integer) it.next()).intValue();
                        StringBuilder sb4 = new StringBuilder(14);
                        sb4.append("bg_");
                        sb4.append(intValue);
                        hashMap2.put(hc.d.o(sb4.toString()), w.k(str21, hc.d.j0(intValue)));
                    }
                    SparseArray sparseArray = new SparseArray();
                    str7 = str21;
                    Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                    int length2 = spans.length;
                    int i30 = 0;
                    while (i30 < length2) {
                        int i31 = length2;
                        Object obj7 = spans[i30];
                        Object[] objArr7 = spans;
                        boolean z12 = obj7 instanceof StrikethroughSpan;
                        String str25 = null;
                        if (z12) {
                            str13 = str3;
                            str12 = str;
                            obj5 = obj2;
                            f2 = f14;
                            k12 = "<span style='text-decoration:line-through;'>";
                            str11 = str2;
                        } else {
                            str11 = str2;
                            if (obj7 instanceof ForegroundColorSpan) {
                                obj5 = obj2;
                                str15 = w.k("<span style='color:%s;'>", hc.d.j0(((ForegroundColorSpan) obj7).getForegroundColor()));
                            } else {
                                obj5 = obj2;
                                if (obj7 instanceof BackgroundColorSpan) {
                                    str15 = w.k("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj7).getBackgroundColor()));
                                } else if (obj7 instanceof t8.a) {
                                    str15 = "<span style='text-combine-upright:all;'>";
                                } else if (obj7 instanceof AbsoluteSizeSpan) {
                                    AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj7;
                                    if (absoluteSizeSpan.getDip()) {
                                        size = absoluteSizeSpan.getSize();
                                    } else {
                                        size = absoluteSizeSpan.getSize() / f14;
                                    }
                                    str15 = w.k("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
                                } else {
                                    if (obj7 instanceof RelativeSizeSpan) {
                                        str15 = w.k("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj7).getSizeChange() * 100.0f));
                                    } else if (obj7 instanceof TypefaceSpan) {
                                        String family = ((TypefaceSpan) obj7).getFamily();
                                        if (family != null) {
                                            str15 = w.k("<span style='font-family:\"%s\";'>", family);
                                        }
                                        str13 = str3;
                                        str12 = str;
                                        f2 = f14;
                                        k12 = null;
                                    } else if (obj7 instanceof StyleSpan) {
                                        int style = ((StyleSpan) obj7).getStyle();
                                        if (style != 1) {
                                            if (style != 2) {
                                                if (style == 3) {
                                                    str15 = "<b><i>";
                                                }
                                                str13 = str3;
                                                str12 = str;
                                                f2 = f14;
                                                k12 = null;
                                            } else {
                                                str15 = "<i>";
                                            }
                                        } else {
                                            str15 = "<b>";
                                        }
                                    } else if (obj7 instanceof t8.c) {
                                        int i32 = ((t8.c) obj7).f32448b;
                                        if (i32 != -1) {
                                            if (i32 != 1) {
                                                if (i32 == 2) {
                                                    str15 = "<ruby style='ruby-position:under;'>";
                                                }
                                                str13 = str3;
                                                str12 = str;
                                                f2 = f14;
                                                k12 = null;
                                            } else {
                                                str15 = "<ruby style='ruby-position:over;'>";
                                            }
                                        } else {
                                            str15 = "<ruby style='ruby-position:unset;'>";
                                        }
                                    } else if (obj7 instanceof UnderlineSpan) {
                                        str15 = "<u>";
                                    } else {
                                        if (obj7 instanceof t8.d) {
                                            t8.d dVar = (t8.d) obj7;
                                            int i33 = dVar.f32449a;
                                            f2 = f14;
                                            StringBuilder sb5 = new StringBuilder();
                                            str12 = str;
                                            int i34 = dVar.f32450b;
                                            str13 = str3;
                                            if (i34 != 1) {
                                                i14 = 2;
                                                if (i34 == 2) {
                                                    sb5.append("open ");
                                                }
                                            } else {
                                                i14 = 2;
                                                sb5.append("filled ");
                                            }
                                            if (i33 != 0) {
                                                if (i33 != 1) {
                                                    if (i33 != i14) {
                                                        if (i33 != 3) {
                                                            sb5.append("unset");
                                                        } else {
                                                            sb5.append("sesame");
                                                        }
                                                    } else {
                                                        sb5.append("dot");
                                                    }
                                                } else {
                                                    sb5.append("circle");
                                                }
                                            } else {
                                                sb5.append(Constants.SUBSCRIPTION_NONE);
                                            }
                                            String sb6 = sb5.toString();
                                            if (dVar.f32451c != 2) {
                                                str14 = "over right";
                                            } else {
                                                str14 = "under left";
                                            }
                                            k12 = w.k("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", sb6, str14);
                                        }
                                        str13 = str3;
                                        str12 = str;
                                        f2 = f14;
                                        k12 = null;
                                    }
                                    str13 = str3;
                                    str12 = str;
                                    k12 = str15;
                                    f2 = f14;
                                }
                            }
                            str13 = str3;
                            str12 = str;
                            k12 = str15;
                            f2 = f14;
                        }
                        if (!z12 && !(obj7 instanceof ForegroundColorSpan) && !(obj7 instanceof BackgroundColorSpan) && !(obj7 instanceof t8.a) && !(obj7 instanceof AbsoluteSizeSpan) && !(obj7 instanceof RelativeSizeSpan) && !(obj7 instanceof t8.d)) {
                            if (!(obj7 instanceof TypefaceSpan)) {
                                if (obj7 instanceof StyleSpan) {
                                    int style2 = ((StyleSpan) obj7).getStyle();
                                    if (style2 != 1) {
                                        if (style2 != 2) {
                                            if (style2 == 3) {
                                                str17 = "</i></b>";
                                            }
                                        } else {
                                            str17 = "</i>";
                                        }
                                    } else {
                                        str17 = "</b>";
                                    }
                                    str25 = str17;
                                } else {
                                    if (obj7 instanceof t8.c) {
                                        String a10 = d.a(((t8.c) obj7).f32447a);
                                        StringBuilder sb7 = new StringBuilder(ri.e.c(a10, 16));
                                        sb7.append("<rt>");
                                        sb7.append(a10);
                                        sb7.append("</rt></ruby>");
                                        str17 = sb7.toString();
                                    } else if (obj7 instanceof UnderlineSpan) {
                                        str17 = "</u>";
                                    }
                                    str25 = str17;
                                }
                            }
                            str16 = str25;
                            int spanStart = spanned.getSpanStart(obj7);
                            int spanEnd = spanned.getSpanEnd(obj7);
                            if (k12 == null) {
                                str16.getClass();
                                d.b bVar2 = new d.b(spanStart, spanEnd, k12, str16);
                                d.c cVar = (d.c) sparseArray.get(spanStart);
                                if (cVar == null) {
                                    cVar = new d.c();
                                    sparseArray.put(spanStart, cVar);
                                }
                                cVar.f7134a.add(bVar2);
                                d.c cVar2 = (d.c) sparseArray.get(spanEnd);
                                if (cVar2 == null) {
                                    cVar2 = new d.c();
                                    sparseArray.put(spanEnd, cVar2);
                                }
                                cVar2.f7135b.add(bVar2);
                            }
                            i30++;
                            length2 = i31;
                            spans = objArr7;
                            str2 = str11;
                            obj2 = obj5;
                            f14 = f2;
                            str = str12;
                            str3 = str13;
                        }
                        str16 = "</span>";
                        int spanStart2 = spanned.getSpanStart(obj7);
                        int spanEnd2 = spanned.getSpanEnd(obj7);
                        if (k12 == null) {
                        }
                        i30++;
                        length2 = i31;
                        spans = objArr7;
                        str2 = str11;
                        obj2 = obj5;
                        f14 = f2;
                        str = str12;
                        str3 = str13;
                    }
                    str8 = str3;
                    str9 = str;
                    str10 = str2;
                    obj4 = obj2;
                    StringBuilder sb8 = new StringBuilder(spanned.length());
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i35);
                        sb8.append(d.a(spanned.subSequence(i36, keyAt)));
                        d.c cVar3 = (d.c) sparseArray.get(keyAt);
                        Collections.sort(cVar3.f7135b, d.b.f);
                        Iterator it2 = cVar3.f7135b.iterator();
                        while (it2.hasNext()) {
                            sb8.append(((d.b) it2.next()).f7133d);
                        }
                        ArrayList arrayList = cVar3.f7134a;
                        Collections.sort(arrayList, d.b.f7129e);
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            sb8.append(((d.b) it3.next()).f7132c);
                        }
                        i35++;
                        i36 = keyAt;
                    }
                    sb8.append(d.a(spanned.subSequence(i36, spanned.length())));
                    aVar2 = new d.a(sb8.toString(), hashMap2);
                    for (String str26 : hashMap.keySet()) {
                        String str27 = (String) hashMap.put(str26, (String) hashMap.get(str26));
                        if (str27 != null && !str27.equals(hashMap.get(str26))) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        sc.b.C(z11);
                    }
                    Object[] objArr8 = new Object[14];
                    objArr8[0] = Integer.valueOf(i22);
                    objArr8[1] = str23;
                    objArr8[2] = Float.valueOf(f);
                    objArr8[3] = str24;
                    objArr8[4] = k11;
                    objArr8[5] = str8;
                    objArr8[6] = str9;
                    objArr8[7] = obj4;
                    objArr8[8] = str10;
                    objArr8[9] = str6;
                    objArr8[10] = str5;
                    objArr8[11] = Integer.valueOf(i26);
                    objArr8[12] = Integer.valueOf(i10);
                    p8.a aVar4 = aVar;
                    f10 = aVar4.K;
                    if (f10 == 0.0f) {
                        i15 = 1;
                        if (i24 != 2 && i24 != 1) {
                            str19 = "skewX";
                        } else {
                            str19 = "skewY";
                        }
                        str18 = w.k("%s(%.2fdeg)", str19, Float.valueOf(f10));
                    } else {
                        i15 = 1;
                        str18 = str4;
                    }
                    objArr8[13] = str18;
                    sb2 = sb3;
                    sb2.append(w.k("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr8));
                    Object[] objArr9 = new Object[i15];
                    objArr9[0] = str22;
                    sb2.append(w.k("<span class='%s'>", objArr9));
                    String str28 = aVar2.f7127a;
                    alignment = aVar4.f27985w;
                    if (alignment == null) {
                        Object[] objArr10 = new Object[i15];
                        int i37 = a.f7142a[alignment.ordinal()];
                        if (i37 != i15) {
                            if (i37 != 2) {
                                obj6 = "center";
                            } else {
                                obj6 = obj;
                            }
                        } else {
                            obj6 = obj3;
                        }
                        objArr10[0] = obj6;
                        sb2.append(w.k("<span style='display:inline-block; text-align:%s;'>", objArr10));
                        sb2.append(str28);
                        sb2.append("</span>");
                    } else {
                        sb2.append(str28);
                    }
                    sb2.append("</span></div>");
                    i22++;
                    i18 = 1;
                    i19 = 2;
                    c11 = 0;
                    fVar = this;
                    str20 = str22;
                    str21 = str7;
                }
            } else {
                aVar2 = new d.a("", m0.A);
                str4 = "";
            }
            str8 = str3;
            str6 = b10;
            str9 = str;
            str10 = str2;
            aVar = aVar3;
            str7 = str21;
            obj4 = obj2;
            str5 = j02;
            while (r0.hasNext()) {
            }
            Object[] objArr82 = new Object[14];
            objArr82[0] = Integer.valueOf(i22);
            objArr82[1] = str23;
            objArr82[2] = Float.valueOf(f);
            objArr82[3] = str24;
            objArr82[4] = k11;
            objArr82[5] = str8;
            objArr82[6] = str9;
            objArr82[7] = obj4;
            objArr82[8] = str10;
            objArr82[9] = str6;
            objArr82[10] = str5;
            objArr82[11] = Integer.valueOf(i26);
            objArr82[12] = Integer.valueOf(i10);
            p8.a aVar42 = aVar;
            f10 = aVar42.K;
            if (f10 == 0.0f) {
            }
            objArr82[13] = str18;
            sb2 = sb3;
            sb2.append(w.k("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr82));
            Object[] objArr92 = new Object[i15];
            objArr92[0] = str22;
            sb2.append(w.k("<span class='%s'>", objArr92));
            String str282 = aVar2.f7127a;
            alignment = aVar42.f27985w;
            if (alignment == null) {
            }
            sb2.append("</span></div>");
            i22++;
            i18 = 1;
            i19 = 2;
            c11 = 0;
            fVar = this;
            str20 = str22;
            str21 = str7;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb9 = new StringBuilder("<html><head><style>");
        for (String str29 : hashMap.keySet()) {
            sb9.append(str29);
            sb9.append("{");
            sb9.append((String) hashMap.get(str29));
            sb9.append("}");
        }
        sb9.append("</style></head>");
        sb2.insert(0, sb9.toString());
        this.f7137v.loadData(Base64.encodeToString(sb2.toString().getBytes(nc.c.f25988c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (z10 && !this.f7138w.isEmpty()) {
            c();
        }
    }
}
