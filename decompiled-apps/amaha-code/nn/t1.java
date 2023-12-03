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
/* compiled from: SKU4Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/t1;", "Lrn/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t1 extends rn.c {
    public static final /* synthetic */ int F = 0;
    public List<c4.h> D;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public final String f26605x = LogHelper.INSTANCE.makeLogTag(t1.class);

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<Map<String, String>> f26606y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public String f26607z = "";
    public String A = "";
    public String B = "";
    public String C = "";

    public t1() {
        new ArrayList();
    }

    @Override // rn.c
    public final void I(String str) {
        try {
            if (kotlin.jvm.internal.i.b(str, Constants.SUBSCRIPTION_BASIC_FREE)) {
                K();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26605x, e10);
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
                childAt.setOnClickListener(new il.g(21));
                childAt.setClickable(false);
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.sku2Footer)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26605x, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x023c, code lost:
        if (r6 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0281, code lost:
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
            ((LinearLayout) _$_findCachedViewById(R.id.sku2Container)).removeAllViewsInLayout();
            Iterator<Map<String, String>> it = this.f26606y.iterator();
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
                            inflate.setTag(str4);
                            if (!kotlin.jvm.internal.i.b(str4, this.f26607z)) {
                                ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(g0.a.c(R.color.transparent, requireContext()));
                                if (!kotlin.jvm.internal.i.b(this.C, "")) {
                                    ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeBackground)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.C)));
                                }
                            } else {
                                if (!kotlin.jvm.internal.i.b(this.B, "")) {
                                    ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.B)));
                                }
                                ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeBackground)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(requireContext(), R.color.white)));
                            }
                            if (!kotlin.jvm.internal.i.b(this.A, "")) {
                                ((ConstraintLayout) inflate.findViewById(R.id.monetizationSchemeButton)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.A)));
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
                            inflate.setOnClickListener(new tk.q((Object) this, (Object) inflate, (Object) next2, (Object) xVar, 11));
                            i6 = R.id.sku2Container;
                            ((LinearLayout) _$_findCachedViewById(R.id.sku2Container)).addView(inflate);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26605x, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0129 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0131 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014b A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0184 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018e A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a A[Catch: Exception -> 0x01a4, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119 A[Catch: Exception -> 0x01a4, TryCatch #0 {Exception -> 0x01a4, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0036, B:8:0x003e, B:10:0x0042, B:13:0x0048, B:14:0x004b, B:17:0x0053, B:21:0x005e, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:37:0x008a, B:46:0x009a, B:47:0x00a3, B:49:0x00a9, B:52:0x00b3, B:61:0x00c3, B:62:0x00c5, B:64:0x00cb, B:67:0x00d5, B:76:0x00e5, B:77:0x00e7, B:79:0x00ed, B:82:0x00f7, B:91:0x0107, B:92:0x0109, B:94:0x010f, B:97:0x0119, B:106:0x0129, B:107:0x012b, B:109:0x0131, B:112:0x013b, B:121:0x014b, B:122:0x017e, B:124:0x0184, B:127:0x018e, B:133:0x019a), top: B:138:0x0000 }] */
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
        boolean z16;
        Bundle arguments7;
        String str8;
        try {
            F().J();
            this.D = F().I();
            boolean z17 = false;
            ((RobertoTextView) _$_findCachedViewById(R.id.sku2Footer)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.sku2Subheader)).setVisibility(0);
            ArrayList<Map<String, String>> arrayList2 = this.f26606y;
            arrayList2.clear();
            Bundle arguments8 = getArguments();
            String str9 = null;
            if (arguments8 != null) {
                serializable = arguments8.getSerializable("sku4_sku_list_android");
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
            Bundle arguments9 = getArguments();
            if (arguments9 != null) {
                str = arguments9.getString("sku4_title", "");
            } else {
                str = null;
            }
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
                    str2 = arguments.getString("sku4_desc", "");
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    z11 = false;
                    if (!z11) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.sku2Subheader)).setText(str2);
                    }
                    arguments2 = getArguments();
                    if (arguments2 == null) {
                        str3 = arguments2.getString("sku4_highlighted_sku", "");
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && str3.length() != 0) {
                        z12 = false;
                        if (!z12) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            this.f26607z = str3;
                        }
                        arguments3 = getArguments();
                        if (arguments3 == null) {
                            str4 = arguments3.getString("sku4_full_border_color", "");
                        } else {
                            str4 = null;
                        }
                        if (str4 != null && str4.length() != 0) {
                            z13 = false;
                            if (!z13) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                this.A = str4;
                            }
                            arguments4 = getArguments();
                            if (arguments4 == null) {
                                str5 = arguments4.getString("sku4_dotted_border_color", "");
                            } else {
                                str5 = null;
                            }
                            if (str5 != null && str5.length() != 0) {
                                z14 = false;
                                if (!z14) {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    this.B = str5;
                                }
                                arguments5 = getArguments();
                                if (arguments5 == null) {
                                    str6 = arguments5.getString("sku4_unselected_bg_color", "");
                                } else {
                                    str6 = null;
                                }
                                if (str6 != null && str6.length() != 0) {
                                    z15 = false;
                                    if (!z15) {
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
                                    if (str7 != null && str7.length() != 0) {
                                        z16 = false;
                                        if (!z16) {
                                            str7 = null;
                                        }
                                        if (str7 != null) {
                                            ((RobertoTextView) _$_findCachedViewById(R.id.sku2Header)).setTextColor(ColorStateList.valueOf(Color.parseColor(str7)));
                                            ((RobertoTextView) _$_findCachedViewById(R.id.sku2Subheader)).setTextColor(ColorStateList.valueOf(Color.parseColor(str7)));
                                            ((RobertoTextView) _$_findCachedViewById(R.id.sku2Footer)).setTextColor(ColorStateList.valueOf(Color.parseColor(str7)));
                                        }
                                        arguments7 = getArguments();
                                        if (arguments7 == null) {
                                            str8 = arguments7.getString("sku4_validity_text", "");
                                        } else {
                                            str8 = null;
                                        }
                                        if (!((str8 != null || str8.length() == 0) ? true : true)) {
                                            str9 = str8;
                                        }
                                        if (str9 == null) {
                                            ((RobertoTextView) _$_findCachedViewById(R.id.sku2Footer)).setText(str9);
                                            return;
                                        }
                                        return;
                                    }
                                    z16 = true;
                                    if (!z16) {
                                    }
                                    if (str7 != null) {
                                    }
                                    arguments7 = getArguments();
                                    if (arguments7 == null) {
                                    }
                                    if (!((str8 != null || str8.length() == 0) ? true : true)) {
                                    }
                                    if (str9 == null) {
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
                                if (str7 != null) {
                                    z16 = false;
                                    if (!z16) {
                                    }
                                    if (str7 != null) {
                                    }
                                    arguments7 = getArguments();
                                    if (arguments7 == null) {
                                    }
                                    if (!((str8 != null || str8.length() == 0) ? true : true)) {
                                    }
                                    if (str9 == null) {
                                    }
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (str7 != null) {
                                }
                                arguments7 = getArguments();
                                if (arguments7 == null) {
                                }
                                if (!((str8 != null || str8.length() == 0) ? true : true)) {
                                }
                                if (str9 == null) {
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
                                if (str7 != null) {
                                }
                                z16 = true;
                                if (!z16) {
                                }
                                if (str7 != null) {
                                }
                                arguments7 = getArguments();
                                if (arguments7 == null) {
                                }
                                if (!((str8 != null || str8.length() == 0) ? true : true)) {
                                }
                                if (str9 == null) {
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
                            if (str7 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (str7 != null) {
                            }
                            arguments7 = getArguments();
                            if (arguments7 == null) {
                            }
                            if (!((str8 != null || str8.length() == 0) ? true : true)) {
                            }
                            if (str9 == null) {
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
                            if (str7 != null) {
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            if (str7 != null) {
                            }
                            arguments7 = getArguments();
                            if (arguments7 == null) {
                            }
                            if (!((str8 != null || str8.length() == 0) ? true : true)) {
                            }
                            if (str9 == null) {
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
                        if (str7 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (str7 != null) {
                        }
                        arguments7 = getArguments();
                        if (arguments7 == null) {
                        }
                        if (!((str8 != null || str8.length() == 0) ? true : true)) {
                        }
                        if (str9 == null) {
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
                        if (str7 != null) {
                        }
                        z16 = true;
                        if (!z16) {
                        }
                        if (str7 != null) {
                        }
                        arguments7 = getArguments();
                        if (arguments7 == null) {
                        }
                        if (!((str8 != null || str8.length() == 0) ? true : true)) {
                        }
                        if (str9 == null) {
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
                    if (str7 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (str7 != null) {
                    }
                    arguments7 = getArguments();
                    if (arguments7 == null) {
                    }
                    if (!((str8 != null || str8.length() == 0) ? true : true)) {
                    }
                    if (str9 == null) {
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
                    if (str7 != null) {
                    }
                    z16 = true;
                    if (!z16) {
                    }
                    if (str7 != null) {
                    }
                    arguments7 = getArguments();
                    if (arguments7 == null) {
                    }
                    if (!((str8 != null || str8.length() == 0) ? true : true)) {
                    }
                    if (str9 == null) {
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
                if (str7 != null) {
                }
                z16 = true;
                if (!z16) {
                }
                if (str7 != null) {
                }
                arguments7 = getArguments();
                if (arguments7 == null) {
                }
                if (!((str8 != null || str8.length() == 0) ? true : true)) {
                }
                if (str9 == null) {
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
                if (str7 != null) {
                }
                z16 = true;
                if (!z16) {
                }
                if (str7 != null) {
                }
                arguments7 = getArguments();
                if (arguments7 == null) {
                }
                if (!((str8 != null || str8.length() == 0) ? true : true)) {
                }
                if (str9 == null) {
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
            if (str7 != null) {
            }
            z16 = true;
            if (!z16) {
            }
            if (str7 != null) {
            }
            arguments7 = getArguments();
            if (arguments7 == null) {
            }
            if (!((str8 != null || str8.length() == 0) ? true : true)) {
            }
            if (str9 == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26605x, e10);
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
            LogHelper.INSTANCE.e(this.f26605x, e10);
        }
    }
}
