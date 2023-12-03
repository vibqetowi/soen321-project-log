package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import c4.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SKU1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/r1;", "Lrn/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r1 extends rn.c {
    public static final /* synthetic */ int F = 0;
    public List<c4.h> D;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public final String f26587x = LogHelper.INSTANCE.makeLogTag(r1.class);

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<Map<String, String>> f26588y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public String f26589z = "";
    public String A = "";
    public String B = "";
    public String C = "";

    public r1() {
        new ArrayList();
    }

    @Override // rn.c
    public final void I(String str) {
        try {
            if (kotlin.jvm.internal.i.b(str, Constants.SUBSCRIPTION_BASIC_FREE)) {
                K();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26587x, e10);
        }
    }

    @Override // rn.c
    public final void J() {
        O();
        M();
    }

    public final void K() {
        try {
            int childCount = ((LinearLayout) _$_findCachedViewById(R.id.monetizationSKUContainer)).getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = ((LinearLayout) _$_findCachedViewById(R.id.monetizationSKUContainer)).getChildAt(i6);
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemeType)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemePrice)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemePriceSubtext)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemeUnlock)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemeCycle)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemeSubtextIndia)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((ConstraintLayout) childAt.findViewById(R.id.monetizationSchemeButton)).setBackgroundTintList(g0.a.c(R.color.transparent, requireContext()));
                ((ConstraintLayout) childAt.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(g0.a.c(R.color.transparent, requireContext()));
                childAt.setOnClickListener(new il.g(19));
                childAt.setClickable(false);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26587x, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x027c, code lost:
        if (r2 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022b, code lost:
        if (r6 != null) goto L71;
     */
    /* JADX WARN: Type inference failed for: r1v27, types: [T, c4.h$d] */
    /* JADX WARN: Type inference failed for: r3v38, types: [T, c4.h$d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        boolean z10;
        boolean z11;
        h.b bVar;
        String str;
        h.b bVar2;
        h.c cVar;
        ArrayList arrayList;
        h.c cVar2;
        ArrayList arrayList2;
        h.c cVar3;
        ArrayList arrayList3;
        h.b bVar3;
        ?? r32;
        int i6 = R.id.monetizationSKUContainer;
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.monetizationSKUContainer)).removeAllViews();
            Iterator<Map<String, String>> it = this.f26588y.iterator();
            while (it.hasNext()) {
                Map<String, String> next = it.next();
                List<c4.h> list = this.D;
                kotlin.jvm.internal.i.d(list);
                Iterator<c4.h> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c4.h next2 = it2.next();
                        String str2 = next.get("sku");
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str4 = next2.f4924c;
                        if (kotlin.jvm.internal.i.b(str2, str4)) {
                            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.sku_layout, (ViewGroup) ((LinearLayout) _$_findCachedViewById(i6)), false);
                            inflate.setTag(str4);
                            if (!kotlin.jvm.internal.i.b(str4, this.f26589z)) {
                                ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(g0.a.c(R.color.transparent, requireContext()));
                                if (!kotlin.jvm.internal.i.b(this.A, "")) {
                                    ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeButton)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.A)));
                                }
                            } else {
                                if (!kotlin.jvm.internal.i.b(this.C, "")) {
                                    ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.C)));
                                }
                                ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeButton)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.B)));
                            }
                            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.monetizationSchemeCycle);
                            String str5 = next.get("billing_text");
                            if (str5 == null) {
                                str5 = "";
                            }
                            robertoTextView.setText(str5);
                            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.monetizationSchemeUnlock);
                            String str6 = next.get("desc");
                            if (str6 == null) {
                                str6 = "";
                            }
                            robertoTextView2.setText(str6);
                            RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.monetizationSchemeType);
                            String str7 = next.get("duration");
                            if (str7 != null) {
                                str3 = str7;
                            }
                            robertoTextView3.setText(str3);
                            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                            ArrayList arrayList4 = next2.f4927g;
                            kotlin.jvm.internal.i.d(arrayList4);
                            Iterator it3 = arrayList4.iterator();
                            do {
                                if (it3.hasNext()) {
                                    r32 = (h.d) it3.next();
                                    if (r32.f4935c.contains("free-intro")) {
                                        xVar.f23469u = r32;
                                        z10 = true;
                                    }
                                } else {
                                    z10 = false;
                                }
                                z11 = false;
                                break;
                            } while (!r32.f4935c.contains("intro"));
                            xVar.f23469u = r32;
                            z10 = false;
                            z11 = true;
                            if (xVar.f23469u == 0) {
                                xVar.f23469u = (h.d) arrayList4.get(0);
                            }
                            rn.d F2 = F();
                            kotlin.jvm.internal.i.f(str4, "productDetails.productId");
                            T t3 = xVar.f23469u;
                            kotlin.jvm.internal.i.d(t3);
                            String str8 = ((h.d) t3).f4933a;
                            kotlin.jvm.internal.i.f(str8, "selectedOffer!!.offerToken");
                            String valueOf = String.valueOf(((h.b) ((h.d) xVar.f23469u).f4934b.f4932a.get(0)).f4930b / 1000000);
                            String str9 = ((h.b) ((h.d) xVar.f23469u).f4934b.f4932a.get(0)).f4931c;
                            kotlin.jvm.internal.i.f(str9, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                            F2.M(str4, str8, valueOf, str9);
                            String str10 = null;
                            if (!z10 && !z11) {
                                ((RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext)).setVisibility(8);
                                RobertoTextView robertoTextView4 = (RobertoTextView) inflate.findViewById(R.id.monetizationSchemePrice);
                                h.d dVar = (h.d) xVar.f23469u;
                                if (dVar != null && (cVar3 = dVar.f4934b) != null && (arrayList3 = cVar3.f4932a) != null && (bVar3 = (h.b) arrayList3.get(0)) != null) {
                                    str10 = bVar3.f4929a;
                                }
                                robertoTextView4.setText(str10);
                            } else {
                                ((RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext)).setVisibility(0);
                                ((RobertoTextView) inflate.findViewById(R.id.monetizationSchemeSubtextIndia)).setVisibility(8);
                                RobertoTextView robertoTextView5 = (RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext);
                                if (z10) {
                                    h.d dVar2 = (h.d) xVar.f23469u;
                                    if (dVar2 != null && (cVar2 = dVar2.f4934b) != null && (arrayList2 = cVar2.f4932a) != null && (bVar = (h.b) arrayList2.get(2)) != null) {
                                        str = bVar.f4929a;
                                    }
                                    str = null;
                                } else {
                                    h.d dVar3 = (h.d) xVar.f23469u;
                                    if (dVar3 != null) {
                                        h.c cVar4 = dVar3.f4934b;
                                        if (cVar4 != null) {
                                            ArrayList arrayList5 = cVar4.f4932a;
                                            if (arrayList5 != null) {
                                                bVar = (h.b) arrayList5.get(1);
                                            }
                                        }
                                    }
                                    str = null;
                                }
                                robertoTextView5.setText(str);
                                ((RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext)).setPaintFlags(((RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext)).getPaintFlags() | 16);
                                RobertoTextView robertoTextView6 = (RobertoTextView) inflate.findViewById(R.id.monetizationSchemePrice);
                                if (z10) {
                                    h.d dVar4 = (h.d) xVar.f23469u;
                                    if (dVar4 != null && (cVar = dVar4.f4934b) != null && (arrayList = cVar.f4932a) != null && (bVar2 = (h.b) arrayList.get(1)) != null) {
                                        str10 = bVar2.f4929a;
                                    }
                                    robertoTextView6.setText(str10);
                                } else {
                                    h.d dVar5 = (h.d) xVar.f23469u;
                                    if (dVar5 != null) {
                                        h.c cVar5 = dVar5.f4934b;
                                        if (cVar5 != null) {
                                            ArrayList arrayList6 = cVar5.f4932a;
                                            if (arrayList6 != null) {
                                                bVar2 = (h.b) arrayList6.get(0);
                                            }
                                        }
                                    }
                                    robertoTextView6.setText(str10);
                                }
                            }
                            inflate.setOnClickListener(new tk.q((Object) this, (Object) inflate, (Object) next2, (Object) xVar, 9));
                            i6 = R.id.monetizationSKUContainer;
                            ((LinearLayout) _$_findCachedViewById(R.id.monetizationSKUContainer)).addView(inflate);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26587x, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011f A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0129 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0135 A[Catch: Exception -> 0x0158, TRY_LEAVE, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:38:0x0075, B:41:0x007c, B:43:0x0091, B:45:0x0097, B:48:0x00a1, B:57:0x00b1, B:58:0x00b3, B:60:0x00b9, B:63:0x00c3, B:72:0x00d3, B:73:0x00d5, B:75:0x00db, B:78:0x00e5, B:87:0x00f5, B:88:0x00f7, B:90:0x00fd, B:93:0x0107, B:102:0x0117, B:103:0x0119, B:105:0x011f, B:108:0x0129, B:114:0x0135, B:42:0x0086), top: B:119:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        Serializable serializable;
        ArrayList arrayList;
        String str;
        boolean z10;
        Bundle arguments;
        String str2;
        Bundle arguments2;
        String str3;
        boolean z11;
        Bundle arguments3;
        String str4;
        boolean z12;
        Bundle arguments4;
        String str5;
        boolean z13;
        Bundle arguments5;
        String str6;
        boolean z14;
        Bundle arguments6;
        String str7;
        try {
            F().J();
            this.D = F().I();
            ArrayList<Map<String, String>> arrayList2 = this.f26588y;
            arrayList2.clear();
            Bundle arguments7 = getArguments();
            String str8 = null;
            if (arguments7 != null) {
                serializable = arguments7.getSerializable("sku1_sku_list_android");
            } else {
                serializable = null;
            }
            if (serializable instanceof ArrayList) {
                arrayList = (ArrayList) serializable;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                str = arguments8.getString("sku1_title", "");
            } else {
                str = null;
            }
            boolean z15 = false;
            if (str != null && str.length() != 0) {
                z10 = false;
                if (!z10) {
                    str = null;
                }
                if (str != null) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading)).setText(str);
                }
                arguments = getArguments();
                if (arguments == null) {
                    str2 = arguments.getString("sku1_desc", "");
                } else {
                    str2 = null;
                }
                if (str2 != null && !kotlin.jvm.internal.i.b(str2, "")) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubText)).setText(str2);
                    arguments2 = getArguments();
                    if (arguments2 == null) {
                        str3 = arguments2.getString("sku1_highlighted_sku", "");
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && str3.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            this.f26589z = str3;
                        }
                        arguments3 = getArguments();
                        if (arguments3 == null) {
                            str4 = arguments3.getString("sku1_unselected_bg_color", "");
                        } else {
                            str4 = null;
                        }
                        if (str4 != null && str4.length() != 0) {
                            z12 = false;
                            if (!z12) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                this.A = str4;
                            }
                            arguments4 = getArguments();
                            if (arguments4 == null) {
                                str5 = arguments4.getString("sku1_highlight_bg_color", "");
                            } else {
                                str5 = null;
                            }
                            if (str5 != null && str5.length() != 0) {
                                z13 = false;
                                if (!z13) {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    this.B = str5;
                                }
                                arguments5 = getArguments();
                                if (arguments5 == null) {
                                    str6 = arguments5.getString("sku1_highlight_border_color", "");
                                } else {
                                    str6 = null;
                                }
                                if (str6 != null && str6.length() != 0) {
                                    z14 = false;
                                    if (!z14) {
                                        str6 = null;
                                    }
                                    if (str6 != null) {
                                        this.C = str6;
                                    }
                                    arguments6 = getArguments();
                                    if (arguments6 == null) {
                                        str7 = arguments6.getString("template_colour", "");
                                    } else {
                                        str7 = null;
                                    }
                                    if (!((str7 != null || str7.length() == 0) ? true : true)) {
                                        str8 = str7;
                                    }
                                    if (str8 == null) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading)).setTextColor(ColorStateList.valueOf(Color.parseColor(str8)));
                                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubText)).setTextColor(ColorStateList.valueOf(Color.parseColor(str8)));
                                        return;
                                    }
                                    return;
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (str6 != null) {
                                }
                                arguments6 = getArguments();
                                if (arguments6 == null) {
                                }
                                if (!((str7 != null || str7.length() == 0) ? true : true)) {
                                }
                                if (str8 == null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (str5 != null) {
                            }
                            arguments5 = getArguments();
                            if (arguments5 == null) {
                            }
                            if (str6 != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                if (str6 != null) {
                                }
                                arguments6 = getArguments();
                                if (arguments6 == null) {
                                }
                                if (!((str7 != null || str7.length() == 0) ? true : true)) {
                                }
                                if (str8 == null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (str6 != null) {
                            }
                            arguments6 = getArguments();
                            if (arguments6 == null) {
                            }
                            if (!((str7 != null || str7.length() == 0) ? true : true)) {
                            }
                            if (str8 == null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (str4 != null) {
                        }
                        arguments4 = getArguments();
                        if (arguments4 == null) {
                        }
                        if (str5 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (str5 != null) {
                            }
                            arguments5 = getArguments();
                            if (arguments5 == null) {
                            }
                            if (str6 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (str6 != null) {
                            }
                            arguments6 = getArguments();
                            if (arguments6 == null) {
                            }
                            if (!((str7 != null || str7.length() == 0) ? true : true)) {
                            }
                            if (str8 == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (str5 != null) {
                        }
                        arguments5 = getArguments();
                        if (arguments5 == null) {
                        }
                        if (str6 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (str6 != null) {
                        }
                        arguments6 = getArguments();
                        if (arguments6 == null) {
                        }
                        if (!((str7 != null || str7.length() == 0) ? true : true)) {
                        }
                        if (str8 == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (str3 != null) {
                    }
                    arguments3 = getArguments();
                    if (arguments3 == null) {
                    }
                    if (str4 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (str4 != null) {
                        }
                        arguments4 = getArguments();
                        if (arguments4 == null) {
                        }
                        if (str5 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (str5 != null) {
                        }
                        arguments5 = getArguments();
                        if (arguments5 == null) {
                        }
                        if (str6 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (str6 != null) {
                        }
                        arguments6 = getArguments();
                        if (arguments6 == null) {
                        }
                        if (!((str7 != null || str7.length() == 0) ? true : true)) {
                        }
                        if (str8 == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (str4 != null) {
                    }
                    arguments4 = getArguments();
                    if (arguments4 == null) {
                    }
                    if (str5 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (str5 != null) {
                    }
                    arguments5 = getArguments();
                    if (arguments5 == null) {
                    }
                    if (str6 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (str6 != null) {
                    }
                    arguments6 = getArguments();
                    if (arguments6 == null) {
                    }
                    if (!((str7 != null || str7.length() == 0) ? true : true)) {
                    }
                    if (str8 == null) {
                    }
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubText)).setVisibility(8);
                arguments2 = getArguments();
                if (arguments2 == null) {
                }
                if (str3 != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (str3 != null) {
                    }
                    arguments3 = getArguments();
                    if (arguments3 == null) {
                    }
                    if (str4 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (str4 != null) {
                    }
                    arguments4 = getArguments();
                    if (arguments4 == null) {
                    }
                    if (str5 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (str5 != null) {
                    }
                    arguments5 = getArguments();
                    if (arguments5 == null) {
                    }
                    if (str6 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (str6 != null) {
                    }
                    arguments6 = getArguments();
                    if (arguments6 == null) {
                    }
                    if (!((str7 != null || str7.length() == 0) ? true : true)) {
                    }
                    if (str8 == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (str3 != null) {
                }
                arguments3 = getArguments();
                if (arguments3 == null) {
                }
                if (str4 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (str4 != null) {
                }
                arguments4 = getArguments();
                if (arguments4 == null) {
                }
                if (str5 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (str5 != null) {
                }
                arguments5 = getArguments();
                if (arguments5 == null) {
                }
                if (str6 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (str6 != null) {
                }
                arguments6 = getArguments();
                if (arguments6 == null) {
                }
                if (!((str7 != null || str7.length() == 0) ? true : true)) {
                }
                if (str8 == null) {
                }
            }
            z10 = true;
            if (!z10) {
            }
            if (str != null) {
            }
            arguments = getArguments();
            if (arguments == null) {
            }
            if (str2 != null) {
                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubText)).setText(str2);
                arguments2 = getArguments();
                if (arguments2 == null) {
                }
                if (str3 != null) {
                }
                z11 = true;
                if (!z11) {
                }
                if (str3 != null) {
                }
                arguments3 = getArguments();
                if (arguments3 == null) {
                }
                if (str4 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (str4 != null) {
                }
                arguments4 = getArguments();
                if (arguments4 == null) {
                }
                if (str5 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (str5 != null) {
                }
                arguments5 = getArguments();
                if (arguments5 == null) {
                }
                if (str6 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (str6 != null) {
                }
                arguments6 = getArguments();
                if (arguments6 == null) {
                }
                if (!((str7 != null || str7.length() == 0) ? true : true)) {
                }
                if (str8 == null) {
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubText)).setVisibility(8);
            arguments2 = getArguments();
            if (arguments2 == null) {
            }
            if (str3 != null) {
            }
            z11 = true;
            if (!z11) {
            }
            if (str3 != null) {
            }
            arguments3 = getArguments();
            if (arguments3 == null) {
            }
            if (str4 != null) {
            }
            z12 = true;
            if (!z12) {
            }
            if (str4 != null) {
            }
            arguments4 = getArguments();
            if (arguments4 == null) {
            }
            if (str5 != null) {
            }
            z13 = true;
            if (!z13) {
            }
            if (str5 != null) {
            }
            arguments5 = getArguments();
            if (arguments5 == null) {
            }
            if (str6 != null) {
            }
            z14 = true;
            if (!z14) {
            }
            if (str6 != null) {
            }
            arguments6 = getArguments();
            if (arguments6 == null) {
            }
            if (!((str7 != null || str7.length() == 0) ? true : true)) {
            }
            if (str8 == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26587x, e10);
        }
    }

    @Override // rn.c, rn.b
    public final void _$_clearFindViewByIdCache() {
        this.E.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.E;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_sku1, viewGroup, false);
    }

    @Override // rn.c, rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            O();
            M();
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26587x, e10);
        }
    }
}
