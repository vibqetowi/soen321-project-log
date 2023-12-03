package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c4.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CTA1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/w0;", "Lrn/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w0 extends rn.a {
    public static final /* synthetic */ int J = 0;
    public String C;

    /* renamed from: y  reason: collision with root package name */
    public List<c4.h> f26638y;
    public final LinkedHashMap I = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public final String f26637x = LogHelper.INSTANCE.makeLogTag(w0.class);

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<String> f26639z = new ArrayList<>();
    public String A = "";
    public String B = "";
    public String D = "";
    public String E = "";
    public String F = "";
    public ArrayList<String> G = new ArrayList<>();
    public ArrayList<String> H = new ArrayList<>();

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
        if (r9 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e4, code lost:
        if (r9 != null) goto L83;
     */
    @Override // rn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(String str) {
        String str2;
        h.d dVar;
        boolean z10;
        boolean z11;
        h.c cVar;
        ArrayList arrayList;
        h.b bVar;
        String str3;
        h.c cVar2;
        ArrayList arrayList2;
        h.b bVar2;
        String str4;
        String str5;
        h.c cVar3;
        ArrayList arrayList3;
        h.b bVar3;
        h.c cVar4;
        ArrayList arrayList4;
        h.b bVar4;
        try {
            this.C = str;
            if (!kotlin.jvm.internal.i.b(str, Constants.SUBSCRIPTION_BASIC_FREE)) {
                List<c4.h> list = this.f26638y;
                kotlin.jvm.internal.i.d(list);
                for (c4.h hVar : list) {
                    if (kotlin.jvm.internal.i.b(hVar.f4924c, str)) {
                        ArrayList arrayList5 = hVar.f4927g;
                        kotlin.jvm.internal.i.d(arrayList5);
                        Iterator it = arrayList5.iterator();
                        do {
                            str2 = null;
                            if (it.hasNext()) {
                                dVar = (h.d) it.next();
                                if (dVar.f4935c.contains("free-intro")) {
                                    z10 = true;
                                }
                            } else {
                                dVar = null;
                                z10 = false;
                            }
                            z11 = false;
                            break;
                        } while (!dVar.f4935c.contains("intro"));
                        z10 = false;
                        z11 = true;
                        if (dVar == null) {
                            dVar = (h.d) arrayList5.get(0);
                        }
                        if (!z10 && !z11) {
                            if (dVar != null && (cVar4 = dVar.f4934b) != null && (arrayList4 = cVar4.f4932a) != null && (bVar4 = (h.b) arrayList4.get(0)) != null) {
                                str5 = bVar4.f4929a;
                            } else {
                                str5 = null;
                            }
                            this.D = String.valueOf(str5);
                            if (dVar != null && (cVar3 = dVar.f4934b) != null && (arrayList3 = cVar3.f4932a) != null && (bVar3 = (h.b) arrayList3.get(0)) != null) {
                                str2 = bVar3.f4929a;
                            }
                            this.E = String.valueOf(str2);
                        } else {
                            if (z10) {
                                if (dVar != null) {
                                    h.c cVar5 = dVar.f4934b;
                                    if (cVar5 != null) {
                                        ArrayList arrayList6 = cVar5.f4932a;
                                        if (arrayList6 != null) {
                                            bVar = (h.b) arrayList6.get(2);
                                        }
                                    }
                                }
                                str3 = null;
                            } else {
                                if (dVar != null && (cVar = dVar.f4934b) != null && (arrayList = cVar.f4932a) != null && (bVar = (h.b) arrayList.get(1)) != null) {
                                    str3 = bVar.f4929a;
                                }
                                str3 = null;
                            }
                            this.E = String.valueOf(str3);
                            if (z10) {
                                if (dVar != null) {
                                    h.c cVar6 = dVar.f4934b;
                                    if (cVar6 != null) {
                                        ArrayList arrayList7 = cVar6.f4932a;
                                        if (arrayList7 != null) {
                                            bVar2 = (h.b) arrayList7.get(1);
                                        }
                                    }
                                }
                                this.D = String.valueOf(str2);
                            } else {
                                if (dVar != null && (cVar2 = dVar.f4934b) != null && (arrayList2 = cVar2.f4932a) != null && (bVar2 = (h.b) arrayList2.get(0)) != null) {
                                    str2 = bVar2.f4929a;
                                }
                                this.D = String.valueOf(str2);
                            }
                        }
                        PaymentUtils paymentUtils = PaymentUtils.INSTANCE;
                        String str6 = hVar.f4924c;
                        kotlin.jvm.internal.i.f(str6, "productDetails.productId");
                        String subscriptionPeriod = paymentUtils.getSubscriptionPeriod(str6);
                        int hashCode = subscriptionPeriod.hashCode();
                        if (hashCode != -1412959777) {
                            if (hashCode != -1066027719) {
                                if (hashCode == 1236635661 && subscriptionPeriod.equals(Constants.PLUS_MONTHLY)) {
                                    str4 = "month";
                                    this.F = str4;
                                    M();
                                    K();
                                    return;
                                }
                                str4 = "";
                                this.F = str4;
                                M();
                                K();
                                return;
                            } else if (subscriptionPeriod.equals(Constants.PLUS_QUARTERLY)) {
                                str4 = "quarter";
                                this.F = str4;
                                M();
                                K();
                                return;
                            } else {
                                str4 = "";
                                this.F = str4;
                                M();
                                K();
                                return;
                            }
                        }
                        if (subscriptionPeriod.equals(Constants.PLUS_ANNUAL)) {
                            str4 = "year";
                            this.F = str4;
                            M();
                            K();
                            return;
                        }
                        str4 = "";
                        this.F = str4;
                        M();
                        K();
                        return;
                    }
                }
                return;
            }
            M();
            K();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26637x, e10);
        }
    }

    public final void J() {
        boolean z10;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f26639z = F().J();
                this.f26638y = F().I();
                String string = arguments.getString("cta1_bottom_text");
                String str = null;
                if (string != null) {
                    if (gv.n.B0(string)) {
                        string = null;
                    }
                    if (string != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText)).setText(string);
                    }
                }
                String string2 = arguments.getString("cta1_text_non_trial");
                if (string2 != null) {
                    if (gv.n.B0(string2)) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        this.A = string2;
                    }
                }
                ArrayList<String> stringArrayList = arguments.getStringArrayList("cta1_conditions");
                boolean z11 = true;
                if (stringArrayList != null) {
                    if (stringArrayList.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        stringArrayList = null;
                    }
                    if (stringArrayList != null) {
                        this.G = stringArrayList;
                    }
                }
                ArrayList<String> stringArrayList2 = arguments.getStringArrayList("cta1_condition_text");
                if (stringArrayList2 != null) {
                    if (!stringArrayList2.isEmpty()) {
                        z11 = false;
                    }
                    if (z11) {
                        stringArrayList2 = null;
                    }
                    if (stringArrayList2 != null) {
                        this.H = stringArrayList2;
                    }
                }
                String string3 = arguments.getString("cta1_condition_color");
                if (string3 != null) {
                    if (gv.n.B0(string3)) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText)).setTextColor(ColorStateList.valueOf(Color.parseColor(string3)));
                    }
                }
                String string4 = arguments.getString("cta1_text_color");
                if (string4 != null) {
                    if (gv.n.B0(string4)) {
                        string4 = null;
                    }
                    if (string4 != null) {
                        ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setTextColor(Color.parseColor(string4));
                    }
                }
                String string5 = arguments.getString("cta1_color");
                if (string5 != null) {
                    if (gv.n.B0(string5)) {
                        string5 = null;
                    }
                    if (string5 != null) {
                        ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(string5)));
                    }
                }
                String string6 = arguments.getString("cta1_trial_tag_bg_color");
                if (string6 != null) {
                    if (gv.n.B0(string6)) {
                        string6 = null;
                    }
                    if (string6 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(string6)));
                    }
                }
                String string7 = arguments.getString("cta1_trial_tag_text_color");
                if (string7 != null) {
                    if (gv.n.B0(string7)) {
                        string7 = null;
                    }
                    if (string7 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setTextColor(ColorStateList.valueOf(Color.parseColor(string7)));
                    }
                }
                String string8 = arguments.getString("cta1_text_trial");
                if (string8 != null) {
                    if (gv.n.B0(string8)) {
                        string8 = null;
                    }
                    if (string8 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setText(string8);
                    }
                }
                String string9 = arguments.getString("cta1_text_price");
                if (string9 != null) {
                    if (!gv.n.B0(string9)) {
                        str = string9;
                    }
                    if (str != null) {
                        this.B = str;
                    }
                }
                if (this.f26639z.isEmpty()) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(0);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26637x, e10);
        }
    }

    public final void K() {
        String F0;
        try {
            String str = this.C;
            if (str != null) {
                if (str != null) {
                    if (kotlin.jvm.internal.i.b(str, Constants.SUBSCRIPTION_BASIC_FREE)) {
                        F0 = "Your access will end on " + new SimpleDateFormat("dd MMMM").format(Long.valueOf((Utils.INSTANCE.getTodayTimeInSeconds() + 5184000) * 1000)) + ", post which you will have to subscribe again to access Plus features.";
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText)).setText(F0);
                    }
                } else {
                    kotlin.jvm.internal.i.q("selected");
                    throw null;
                }
            }
            if (this.f26639z.size() == 0) {
                String str2 = this.H.get(this.G.indexOf("trial"));
                kotlin.jvm.internal.i.f(str2, "conditionTextsList[conditionList.indexOf(\"trial\")]");
                F0 = gv.n.F0(gv.n.F0(gv.n.F0(str2, "<full_price>", this.E), "<introductory_price>", this.D), "<duration>", this.F);
            } else {
                ArrayList<String> arrayList = this.f26639z;
                String str3 = this.C;
                if (str3 != null) {
                    if (arrayList.contains(str3)) {
                        String str4 = this.H.get(this.G.indexOf("purchased"));
                        kotlin.jvm.internal.i.f(str4, "conditionTextsList[condi…ist.indexOf(\"purchased\")]");
                        F0 = gv.n.F0(gv.n.F0(gv.n.F0(str4, "<full_price>", this.E), "<introductory_price>", this.D), "<duration>", this.F);
                    } else {
                        String str5 = this.H.get(this.G.indexOf("non_trial"));
                        kotlin.jvm.internal.i.f(str5, "conditionTextsList[condi…ist.indexOf(\"non_trial\")]");
                        F0 = gv.n.F0(gv.n.F0(gv.n.F0(str5, "<full_price>", this.E), "<introductory_price>", this.D), "<duration>", this.F);
                    }
                } else {
                    kotlin.jvm.internal.i.q("selected");
                    throw null;
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText)).setText(F0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26637x, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        String str;
        try {
            String str2 = this.C;
            if (str2 != null) {
                if (str2 != null) {
                    if (!kotlin.jvm.internal.i.b(str2, Constants.SUBSCRIPTION_BASIC_FREE)) {
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(8);
                    str = this.C;
                    if (str != null) {
                        if (str != null) {
                            if (kotlin.jvm.internal.i.b(str, Constants.SUBSCRIPTION_BASIC_FREE)) {
                                ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setText(this.A);
                                return;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("selected");
                            throw null;
                        }
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setText(gv.n.F0(gv.n.F0(this.B, "<price>", this.D), "<duration>", this.F));
                }
                kotlin.jvm.internal.i.q("selected");
                throw null;
            }
            if (this.f26639z.size() <= 0) {
                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(0);
                str = this.C;
                if (str != null) {
                }
                ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setText(gv.n.F0(gv.n.F0(this.B, "<price>", this.D), "<duration>", this.F));
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(8);
            str = this.C;
            if (str != null) {
            }
            ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setText(gv.n.F0(gv.n.F0(this.B, "<price>", this.D), "<duration>", this.F));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26637x, e10);
        }
    }

    @Override // rn.a, rn.b
    public final void _$_clearFindViewByIdCache() {
        this.I.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.I;
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
        return inflater.inflate(R.layout.fragment_cta1, viewGroup, false);
    }

    @Override // rn.a, rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            J();
            ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setOnClickListener(new v0(0, this));
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26637x, e10);
        }
    }
}
