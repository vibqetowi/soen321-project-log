package nn;

import c4.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: BasicMonetizationMiniFragment.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.l<List<? extends c4.h>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q f26567u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(1);
        this.f26567u = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ss.l
    public final hs.k invoke(List<? extends c4.h> list) {
        String str;
        h.d dVar;
        boolean z10;
        boolean z11;
        String str2;
        String str3;
        String str4;
        String str5;
        h.b bVar;
        h.b bVar2;
        h.b bVar3;
        h.b bVar4;
        h.b bVar5;
        String str6;
        String str7;
        String str8;
        String str9;
        h.b bVar6;
        h.b bVar7;
        h.b bVar8;
        h.b bVar9;
        h.b bVar10;
        String str10;
        String str11;
        h.b bVar11;
        h.b bVar12;
        h.b bVar13;
        List<? extends c4.h> list2 = list;
        if (list2 != null) {
            q qVar = this.f26567u;
            qVar.getClass();
            qVar.A = list2;
            try {
                Iterator<c4.h> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    c4.h next = it.next();
                    if (kotlin.jvm.internal.i.b(next.f4924c, Constants.SUBSCRIPTION_BASIC_1)) {
                        ArrayList arrayList = next.f4927g;
                        kotlin.jvm.internal.i.d(arrayList);
                        Iterator it2 = arrayList.iterator();
                        do {
                            str = null;
                            if (it2.hasNext()) {
                                dVar = (h.d) it2.next();
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
                            dVar = (h.d) arrayList.get(0);
                        }
                        kotlin.jvm.internal.i.d(dVar);
                        h.c cVar = dVar.f4934b;
                        String str12 = dVar.f4933a;
                        kotlin.jvm.internal.i.f(str12, "selectedOffer!!.offerToken");
                        qVar.f26576x = str12;
                        String valueOf = String.valueOf(((h.b) cVar.f4932a.get(0)).f4930b / 1000000);
                        kotlin.jvm.internal.i.g(valueOf, "<set-?>");
                        qVar.f26577y = valueOf;
                        ArrayList arrayList2 = cVar.f4932a;
                        String str13 = ((h.b) arrayList2.get(0)).f4931c;
                        kotlin.jvm.internal.i.f(str13, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                        qVar.f26578z = str13;
                        if (!z10 && !z11) {
                            RobertoTextView robertoTextView = (RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationPriceText);
                            StringBuilder sb2 = new StringBuilder();
                            if (arrayList2 != null && (bVar13 = (h.b) arrayList2.get(0)) != null) {
                                str10 = bVar13.f4929a;
                            } else {
                                str10 = null;
                            }
                            sb2.append(str10);
                            sb2.append("/month. Your subscription will be auto-renewed and you can cancel it anytime.");
                            robertoTextView.setText(sb2.toString());
                            ((RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationSchemePriceSubtextOffer)).setVisibility(8);
                            RobertoTextView robertoTextView2 = (RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationSchemePriceOffer);
                            StringBuilder sb3 = new StringBuilder();
                            if (arrayList2 != null && (bVar12 = (h.b) arrayList2.get(0)) != null) {
                                str11 = bVar12.f4929a;
                            } else {
                                str11 = null;
                            }
                            sb3.append(str11);
                            sb3.append("/month");
                            robertoTextView2.setText(sb3.toString());
                            RobertoButton robertoButton = (RobertoButton) qVar._$_findCachedViewById(R.id.monetizationBuyButton);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("start at ");
                            if (arrayList2 != null && (bVar11 = (h.b) arrayList2.get(0)) != null) {
                                str = bVar11.f4929a;
                            }
                            sb4.append(str);
                            sb4.append("/month");
                            robertoButton.setText(sb4.toString());
                            ((RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(8);
                        } else if (z10) {
                            RobertoTextView robertoTextView3 = (RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationPriceText);
                            StringBuilder sb5 = new StringBuilder();
                            if (arrayList2 != null && (bVar10 = (h.b) arrayList2.get(1)) != null) {
                                str6 = bVar10.f4929a;
                            } else {
                                str6 = null;
                            }
                            sb5.append(str6);
                            sb5.append(" for the first month after free trial - and ");
                            if (arrayList2 != null && (bVar9 = (h.b) arrayList2.get(2)) != null) {
                                str7 = bVar9.f4929a;
                            } else {
                                str7 = null;
                            }
                            sb5.append(str7);
                            sb5.append("/month next month onwards. Auto-renewal, cancel anytime.");
                            robertoTextView3.setText(sb5.toString());
                            RobertoButton robertoButton2 = (RobertoButton) qVar._$_findCachedViewById(R.id.monetizationBuyButton);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("start at ");
                            if (arrayList2 != null && (bVar8 = (h.b) arrayList2.get(1)) != null) {
                                str8 = bVar8.f4929a;
                            } else {
                                str8 = null;
                            }
                            sb6.append(str8);
                            sb6.append("/month");
                            robertoButton2.setText(sb6.toString());
                            RobertoTextView robertoTextView4 = (RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationSchemePriceSubtextOffer);
                            StringBuilder sb7 = new StringBuilder();
                            if (arrayList2 != null && (bVar7 = (h.b) arrayList2.get(2)) != null) {
                                str9 = bVar7.f4929a;
                            } else {
                                str9 = null;
                            }
                            sb7.append(str9);
                            sb7.append("/month");
                            robertoTextView4.setText(sb7.toString());
                            RobertoTextView robertoTextView5 = (RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationSchemePriceOffer);
                            StringBuilder sb8 = new StringBuilder();
                            if (arrayList2 != null && (bVar6 = (h.b) arrayList2.get(1)) != null) {
                                str = bVar6.f4929a;
                            }
                            sb8.append(str);
                            sb8.append("/month");
                            robertoTextView5.setText(sb8.toString());
                            ((RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(0);
                        } else {
                            RobertoTextView robertoTextView6 = (RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationPriceText);
                            StringBuilder sb9 = new StringBuilder();
                            if (arrayList2 != null && (bVar5 = (h.b) arrayList2.get(0)) != null) {
                                str2 = bVar5.f4929a;
                            } else {
                                str2 = null;
                            }
                            sb9.append(str2);
                            sb9.append(" for the first month and ");
                            if (arrayList2 != null && (bVar4 = (h.b) arrayList2.get(1)) != null) {
                                str3 = bVar4.f4929a;
                            } else {
                                str3 = null;
                            }
                            sb9.append(str3);
                            sb9.append(" every month after that. Auto-renewal, cancel anytime.");
                            robertoTextView6.setText(sb9.toString());
                            RobertoButton robertoButton3 = (RobertoButton) qVar._$_findCachedViewById(R.id.monetizationBuyButton);
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append("start at ");
                            if (arrayList2 != null && (bVar3 = (h.b) arrayList2.get(0)) != null) {
                                str4 = bVar3.f4929a;
                            } else {
                                str4 = null;
                            }
                            sb10.append(str4);
                            sb10.append("/month");
                            robertoButton3.setText(sb10.toString());
                            RobertoTextView robertoTextView7 = (RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationSchemePriceSubtextOffer);
                            StringBuilder sb11 = new StringBuilder();
                            if (arrayList2 != null && (bVar2 = (h.b) arrayList2.get(1)) != null) {
                                str5 = bVar2.f4929a;
                            } else {
                                str5 = null;
                            }
                            sb11.append(str5);
                            sb11.append("/month");
                            robertoTextView7.setText(sb11.toString());
                            RobertoTextView robertoTextView8 = (RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationSchemePriceOffer);
                            StringBuilder sb12 = new StringBuilder();
                            if (arrayList2 != null && (bVar = (h.b) arrayList2.get(0)) != null) {
                                str = bVar.f4929a;
                            }
                            sb12.append(str);
                            sb12.append("/month");
                            robertoTextView8.setText(sb12.toString());
                            ((RobertoTextView) qVar._$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(8);
                        }
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(qVar.f26574v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
