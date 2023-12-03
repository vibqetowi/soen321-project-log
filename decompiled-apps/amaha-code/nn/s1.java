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
/* compiled from: SKU2Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/s1;", "Lrn/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s1 extends rn.c {
    public static final /* synthetic */ int F = 0;
    public List<c4.h> D;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public final String f26598x = LogHelper.INSTANCE.makeLogTag(s1.class);

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<Map<String, String>> f26599y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public String f26600z = "";
    public String A = "";
    public String B = "";
    public String C = "";

    public s1() {
        new ArrayList();
    }

    @Override // rn.c
    public final void I(String str) {
        try {
            if (kotlin.jvm.internal.i.b(str, Constants.SUBSCRIPTION_BASIC_FREE)) {
                K();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26598x, e10);
        }
    }

    @Override // rn.c
    public final void J() {
        O();
        M();
    }

    public final void K() {
        try {
            int childCount = ((LinearLayout) _$_findCachedViewById(R.id.sku2Container)).getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = ((LinearLayout) _$_findCachedViewById(R.id.sku2Container)).getChildAt(i6);
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemeType)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemePrice)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemePriceSubtext)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemeUnlock)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemeCycle)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((RobertoTextView) childAt.findViewById(R.id.monetizationSchemeSubtextIndia)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
                ((ConstraintLayout) childAt.findViewById(R.id.monetizationSchemeButton)).setBackgroundTintList(g0.a.c(R.color.transparent, requireContext()));
                ((ConstraintLayout) childAt.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(g0.a.c(R.color.transparent, requireContext()));
                childAt.setOnClickListener(new il.g(20));
                childAt.setClickable(false);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26598x, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0221, code lost:
        if (r6 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0266, code lost:
        if (r2 != null) goto L68;
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
        ?? r32;
        int i6 = R.id.sku2Container;
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.sku2Container)).removeAllViews();
            Iterator<Map<String, String>> it = this.f26599y.iterator();
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
                            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.sku_layout_2, (ViewGroup) ((LinearLayout) _$_findCachedViewById(i6)), false);
                            if (!kotlin.jvm.internal.i.b(str4, this.f26600z)) {
                                ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(g0.a.c(R.color.transparent, requireActivity()));
                                if (!kotlin.jvm.internal.i.b(this.A, "")) {
                                    ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeBackground)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.A)));
                                }
                            } else if (!kotlin.jvm.internal.i.b(this.C, "")) {
                                ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.C)));
                            }
                            if (!kotlin.jvm.internal.i.b(this.B, "")) {
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
                            ArrayList arrayList = next2.f4927g;
                            kotlin.jvm.internal.i.d(arrayList);
                            Iterator it3 = arrayList.iterator();
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
                                xVar.f23469u = (h.d) arrayList.get(0);
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
                                h.b bVar3 = (h.b) ((h.d) xVar.f23469u).f4934b.f4932a.get(0);
                                if (bVar3 != null) {
                                    str10 = bVar3.f4929a;
                                }
                                robertoTextView4.setText(str10);
                            } else {
                                ((RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext)).setVisibility(0);
                                ((RobertoTextView) inflate.findViewById(R.id.monetizationSchemeSubtextIndia)).setVisibility(8);
                                RobertoTextView robertoTextView5 = (RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext);
                                if (z10) {
                                    bVar = (h.b) ((h.d) xVar.f23469u).f4934b.f4932a.get(2);
                                    if (bVar != null) {
                                        str = bVar.f4929a;
                                    }
                                    str = null;
                                } else {
                                    bVar = (h.b) ((h.d) xVar.f23469u).f4934b.f4932a.get(1);
                                }
                                robertoTextView5.setText(str);
                                ((RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext)).setPaintFlags(((RobertoTextView) inflate.findViewById(R.id.monetizationSchemePriceSubtext)).getPaintFlags() | 16);
                                RobertoTextView robertoTextView6 = (RobertoTextView) inflate.findViewById(R.id.monetizationSchemePrice);
                                if (z10) {
                                    bVar2 = (h.b) ((h.d) xVar.f23469u).f4934b.f4932a.get(1);
                                    if (bVar2 != null) {
                                        str10 = bVar2.f4929a;
                                    }
                                    robertoTextView6.setText(str10);
                                } else {
                                    bVar2 = (h.b) ((h.d) xVar.f23469u).f4934b.f4932a.get(0);
                                }
                            }
                            inflate.setOnClickListener(new tk.q((Object) this, (Object) inflate, (Object) next2, (Object) xVar, 10));
                            i6 = R.id.sku2Container;
                            ((LinearLayout) _$_findCachedViewById(R.id.sku2Container)).addView(inflate);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26598x, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0114 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011c A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0126 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0132 A[Catch: Exception -> 0x0169, TRY_LEAVE, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f2 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fa A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:2:0x0000, B:4:0x0013, B:6:0x001d, B:8:0x0025, B:10:0x0029, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:21:0x0046, B:31:0x0059, B:32:0x0062, B:34:0x0068, B:37:0x0072, B:47:0x0085, B:48:0x008e, B:50:0x0094, B:53:0x009e, B:62:0x00ae, B:63:0x00b0, B:65:0x00b6, B:68:0x00c0, B:77:0x00d0, B:78:0x00d2, B:80:0x00d8, B:83:0x00e2, B:92:0x00f2, B:93:0x00f4, B:95:0x00fa, B:98:0x0104, B:107:0x0114, B:108:0x0116, B:110:0x011c, B:113:0x0126, B:119:0x0132), top: B:124:0x0000 }] */
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
        boolean z11;
        Bundle arguments2;
        String str3;
        boolean z12;
        Bundle arguments3;
        String str4;
        boolean z13;
        Bundle arguments4;
        String str5;
        boolean z14;
        Bundle arguments5;
        String str6;
        boolean z15;
        Bundle arguments6;
        String str7;
        try {
            F().J();
            this.D = F().I();
            ArrayList<Map<String, String>> arrayList2 = this.f26599y;
            arrayList2.clear();
            Bundle arguments7 = getArguments();
            String str8 = null;
            if (arguments7 != null) {
                serializable = arguments7.getSerializable("sku2_sku_list_android");
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
                str = arguments8.getString("sku2_title", "");
            } else {
                str = null;
            }
            boolean z16 = false;
            if (str != null && str.length() != 0) {
                z10 = false;
                if (!z10) {
                    str = null;
                }
                if (str != null) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.sku2Header)).setText(str);
                }
                arguments = getArguments();
                if (arguments == null) {
                    str2 = arguments.getString("sku2_validity_text", "");
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    z11 = false;
                    if (!z11) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.sku2Footer)).setText(str2);
                    }
                    arguments2 = getArguments();
                    if (arguments2 == null) {
                        str3 = arguments2.getString("sku2_highlighted_sku", "");
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && str3.length() != 0) {
                        z12 = false;
                        if (!z12) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            this.f26600z = str3;
                        }
                        arguments3 = getArguments();
                        if (arguments3 == null) {
                            str4 = arguments3.getString("sku2_full_border_color", "");
                        } else {
                            str4 = null;
                        }
                        if (str4 != null && str4.length() != 0) {
                            z13 = false;
                            if (!z13) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                this.B = str4;
                            }
                            arguments4 = getArguments();
                            if (arguments4 == null) {
                                str5 = arguments4.getString("sku2_dotted_border_color", "");
                            } else {
                                str5 = null;
                            }
                            if (str5 != null && str5.length() != 0) {
                                z14 = false;
                                if (!z14) {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    this.C = str5;
                                }
                                arguments5 = getArguments();
                                if (arguments5 == null) {
                                    str6 = arguments5.getString("sku2_unselected_bg_color", "");
                                } else {
                                    str6 = null;
                                }
                                if (str6 != null && str6.length() != 0) {
                                    z15 = false;
                                    if (!z15) {
                                        str6 = null;
                                    }
                                    if (str6 != null) {
                                        this.A = str6;
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
                                        ((RobertoTextView) _$_findCachedViewById(R.id.sku2Header)).setTextColor(ColorStateList.valueOf(Color.parseColor(str8)));
                                        ((RobertoTextView) _$_findCachedViewById(R.id.sku2Subheader)).setTextColor(ColorStateList.valueOf(Color.parseColor(str8)));
                                        ((RobertoTextView) _$_findCachedViewById(R.id.sku2Footer)).setTextColor(ColorStateList.valueOf(Color.parseColor(str8)));
                                        return;
                                    }
                                    return;
                                }
                                z15 = true;
                                if (!z15) {
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
                            if (str5 != null) {
                            }
                            arguments5 = getArguments();
                            if (arguments5 == null) {
                            }
                            if (str6 != null) {
                                z15 = false;
                                if (!z15) {
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
                            z15 = true;
                            if (!z15) {
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
                        if (str4 != null) {
                        }
                        arguments4 = getArguments();
                        if (arguments4 == null) {
                        }
                        if (str5 != null) {
                            z14 = false;
                            if (!z14) {
                            }
                            if (str5 != null) {
                            }
                            arguments5 = getArguments();
                            if (arguments5 == null) {
                            }
                            if (str6 != null) {
                            }
                            z15 = true;
                            if (!z15) {
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
                        if (str5 != null) {
                        }
                        arguments5 = getArguments();
                        if (arguments5 == null) {
                        }
                        if (str6 != null) {
                        }
                        z15 = true;
                        if (!z15) {
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
                    if (str3 != null) {
                    }
                    arguments3 = getArguments();
                    if (arguments3 == null) {
                    }
                    if (str4 != null) {
                        z13 = false;
                        if (!z13) {
                        }
                        if (str4 != null) {
                        }
                        arguments4 = getArguments();
                        if (arguments4 == null) {
                        }
                        if (str5 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (str5 != null) {
                        }
                        arguments5 = getArguments();
                        if (arguments5 == null) {
                        }
                        if (str6 != null) {
                        }
                        z15 = true;
                        if (!z15) {
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
                    if (str4 != null) {
                    }
                    arguments4 = getArguments();
                    if (arguments4 == null) {
                    }
                    if (str5 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (str5 != null) {
                    }
                    arguments5 = getArguments();
                    if (arguments5 == null) {
                    }
                    if (str6 != null) {
                    }
                    z15 = true;
                    if (!z15) {
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
                if (str2 != null) {
                }
                arguments2 = getArguments();
                if (arguments2 == null) {
                }
                if (str3 != null) {
                    z12 = false;
                    if (!z12) {
                    }
                    if (str3 != null) {
                    }
                    arguments3 = getArguments();
                    if (arguments3 == null) {
                    }
                    if (str4 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (str4 != null) {
                    }
                    arguments4 = getArguments();
                    if (arguments4 == null) {
                    }
                    if (str5 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (str5 != null) {
                    }
                    arguments5 = getArguments();
                    if (arguments5 == null) {
                    }
                    if (str6 != null) {
                    }
                    z15 = true;
                    if (!z15) {
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
                if (str3 != null) {
                }
                arguments3 = getArguments();
                if (arguments3 == null) {
                }
                if (str4 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (str4 != null) {
                }
                arguments4 = getArguments();
                if (arguments4 == null) {
                }
                if (str5 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (str5 != null) {
                }
                arguments5 = getArguments();
                if (arguments5 == null) {
                }
                if (str6 != null) {
                }
                z15 = true;
                if (!z15) {
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
                z11 = false;
                if (!z11) {
                }
                if (str2 != null) {
                }
                arguments2 = getArguments();
                if (arguments2 == null) {
                }
                if (str3 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (str3 != null) {
                }
                arguments3 = getArguments();
                if (arguments3 == null) {
                }
                if (str4 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (str4 != null) {
                }
                arguments4 = getArguments();
                if (arguments4 == null) {
                }
                if (str5 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (str5 != null) {
                }
                arguments5 = getArguments();
                if (arguments5 == null) {
                }
                if (str6 != null) {
                }
                z15 = true;
                if (!z15) {
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
            if (str2 != null) {
            }
            arguments2 = getArguments();
            if (arguments2 == null) {
            }
            if (str3 != null) {
            }
            z12 = true;
            if (!z12) {
            }
            if (str3 != null) {
            }
            arguments3 = getArguments();
            if (arguments3 == null) {
            }
            if (str4 != null) {
            }
            z13 = true;
            if (!z13) {
            }
            if (str4 != null) {
            }
            arguments4 = getArguments();
            if (arguments4 == null) {
            }
            if (str5 != null) {
            }
            z14 = true;
            if (!z14) {
            }
            if (str5 != null) {
            }
            arguments5 = getArguments();
            if (arguments5 == null) {
            }
            if (str6 != null) {
            }
            z15 = true;
            if (!z15) {
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
            LogHelper.INSTANCE.e(this.f26598x, e10);
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
        return inflater.inflate(R.layout.fragment_sku2, viewGroup, false);
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
            LogHelper.INSTANCE.e(this.f26598x, e10);
        }
    }
}
