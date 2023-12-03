package nn;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import c4.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.model.SkuModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.d;
import g0.a;
import hr.ba;
import hr.f8;
import hr.h6;
import hr.t8;
import hr.t9;
import hr.u9;
import hr.z7;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26477u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f26478v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f26479w;

    public /* synthetic */ f(Object obj, int i6, Object obj2) {
        this.f26477u = i6;
        this.f26478v = obj;
        this.f26479w = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x04c6, code lost:
        if (r10 != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04d0, code lost:
        if (r10 != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04d2, code lost:
        r10 = java.lang.Long.valueOf(r10.f4930b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04d9, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0663, code lost:
        if (r8 != null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x066d, code lost:
        if (r8 != null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x066f, code lost:
        r8 = java.lang.Long.valueOf(r8.f4930b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0676, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0681, code lost:
        if (r10 != null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x068b, code lost:
        if (r10 != null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x068d, code lost:
        r10 = java.lang.Long.valueOf(r10.f4930b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0694, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x07f9, code lost:
        if (r8 != null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0803, code lost:
        if (r8 != null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0805, code lost:
        r8 = java.lang.Long.valueOf(r8.f4930b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x080c, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0817, code lost:
        if (r10 != null) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0821, code lost:
        if (r10 != null) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0823, code lost:
        r10 = java.lang.Long.valueOf(r10.f4930b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x082a, code lost:
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        h.d dVar;
        boolean z10;
        boolean z11;
        int hashCode;
        String str3;
        h.b bVar;
        String str4;
        h.b bVar2;
        String str5;
        String str6;
        int i6;
        h.b bVar3;
        Long valueOf;
        int i10;
        h.b bVar4;
        Long valueOf2;
        String str7;
        h.b bVar5;
        String str8;
        String str9;
        int hashCode2;
        String str10;
        h.b bVar6;
        String str11;
        h.b bVar7;
        String str12;
        h.b bVar8;
        String str13;
        String str14;
        int i11;
        h.b bVar9;
        Long valueOf3;
        int i12;
        h.b bVar10;
        Long valueOf4;
        String str15;
        h.b bVar11;
        String str16;
        String str17;
        h.b bVar12;
        String str18;
        h.b bVar13;
        String str19;
        String str20;
        int i13;
        h.b bVar14;
        Long valueOf5;
        h.b bVar15;
        Long valueOf6;
        String str21;
        h.b bVar16;
        String str22;
        String str23;
        h.c cVar;
        int i14;
        Integer num = 0;
        int i15 = this.f26477u;
        Object obj = this.f26479w;
        Object obj2 = this.f26478v;
        ProgressBar progressBar = null;
        switch (i15) {
            case 0:
                h this$0 = (h) obj2;
                String subscriptionPeriod = (String) obj;
                int i16 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(subscriptionPeriod, "$subscriptionPeriod");
                List<c4.h> list = this$0.G;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (kotlin.jvm.internal.i.b(((c4.h) obj3).f4924c, this$0.O())) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Utils.INSTANCE.showCustomToast(this$0.K(), "Connection Error. Please Try Again");
                        this$0.K().finish();
                    }
                    MonetizationActivity K = this$0.K();
                    Object obj4 = g0.a.f16164a;
                    ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton1)).setBackground(a.c.b(K, R.drawable.grey_background_rounded_corners));
                    ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton2)).setBackground(a.c.b(this$0.K(), R.drawable.grey_background_rounded_corners));
                    ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton3)).setBackground(a.c.b(this$0.K(), R.drawable.grey_background_rounded_corners));
                    ArrayList arrayList2 = ((c4.h) arrayList.get(0)).f4927g;
                    kotlin.jvm.internal.i.d(arrayList2);
                    Iterator it = arrayList2.iterator();
                    do {
                        if (it.hasNext()) {
                            dVar = (h.d) it.next();
                            boolean contains = dVar.f4935c.contains("free-intro");
                            cVar = dVar.f4934b;
                            if (contains) {
                                str = ((h.b) cVar.f4932a.get(1)).f4929a;
                                kotlin.jvm.internal.i.f(str, "offerDetails.pricingPhas…aseList[1].formattedPrice");
                                str2 = ((h.b) cVar.f4932a.get(2)).f4929a;
                                kotlin.jvm.internal.i.f(str2, "offerDetails.pricingPhas…aseList[2].formattedPrice");
                                z10 = true;
                            }
                        } else {
                            str = "";
                            str2 = "";
                            dVar = null;
                            z10 = false;
                        }
                        z11 = false;
                        if (dVar == null) {
                            ArrayList arrayList3 = ((c4.h) arrayList.get(0)).f4927g;
                            if (arrayList3 != null) {
                                dVar = (h.d) arrayList3.get(0);
                            } else {
                                dVar = null;
                            }
                            kotlin.jvm.internal.i.d(dVar);
                            str2 = ((h.b) dVar.f4934b.f4932a.get(0)).f4929a;
                            kotlin.jvm.internal.i.f(str2, "selectedOffer!!.pricingP…aseList[0].formattedPrice");
                        }
                        String str24 = dVar.f4933a;
                        kotlin.jvm.internal.i.f(str24, "selectedOffer.offerToken");
                        this$0.f26502y = str24;
                        h.c cVar2 = dVar.f4934b;
                        String str25 = str;
                        String valueOf7 = String.valueOf(((h.b) cVar2.f4932a.get(0)).f4930b / 1000000);
                        kotlin.jvm.internal.i.g(valueOf7, "<set-?>");
                        this$0.f26503z = valueOf7;
                        ArrayList arrayList4 = cVar2.f4932a;
                        String str26 = ((h.b) arrayList4.get(0)).f4931c;
                        kotlin.jvm.internal.i.f(str26, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                        this$0.A = str26;
                        hashCode = subscriptionPeriod.hashCode();
                        if (hashCode == -1412959777) {
                            if (hashCode != -1066027719) {
                                if (hashCode != 1236635661 || !subscriptionPeriod.equals(Constants.PLUS_MONTHLY)) {
                                    str3 = str2;
                                } else {
                                    if (!z10 && !z11) {
                                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setVisibility(8);
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePrice1);
                                        h.b bVar17 = (h.b) arrayList4.get(0);
                                        if (bVar17 != null) {
                                            str23 = bVar17.f4929a;
                                        } else {
                                            str23 = null;
                                        }
                                        robertoTextView.setText(str23);
                                        str3 = str2;
                                    } else {
                                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setVisibility(0);
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext1);
                                        if (!z10 ? (bVar12 = (h.b) arrayList4.get(1)) != null : (bVar12 = (h.b) arrayList4.get(2)) != null) {
                                            str18 = bVar12.f4929a;
                                        } else {
                                            str18 = null;
                                        }
                                        robertoTextView2.setText(str18);
                                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setPaintFlags(((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).getPaintFlags() | 16);
                                        RobertoTextView robertoTextView3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePrice1);
                                        if (!z10 ? (bVar13 = (h.b) arrayList4.get(0)) != null : (bVar13 = (h.b) arrayList4.get(1)) != null) {
                                            str19 = bVar13.f4929a;
                                        } else {
                                            str19 = null;
                                        }
                                        robertoTextView3.setText(str19);
                                        RobertoTextView robertoTextView4 = (RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedMonthlyText);
                                        StringBuilder sb2 = new StringBuilder("Yay! ");
                                        sb2.append(this$0.C);
                                        sb2.append(" has been applied for a ");
                                        SkuModel skuModel = this$0.D;
                                        if (skuModel != null) {
                                            str20 = skuModel.getDiscount();
                                        } else {
                                            str20 = null;
                                        }
                                        sb2.append(str20);
                                        sb2.append("% discount. You've saved ");
                                        PaymentUtils paymentUtils = PaymentUtils.INSTANCE;
                                        if (z10) {
                                            bVar14 = (h.b) arrayList4.get(2);
                                            i13 = 1;
                                            break;
                                        } else {
                                            i13 = 1;
                                            bVar14 = (h.b) arrayList4.get(1);
                                            break;
                                        }
                                        if (!z10 ? (bVar15 = (h.b) arrayList4.get(0)) != null : (bVar15 = (h.b) arrayList4.get(i13)) != null) {
                                            str3 = str2;
                                            valueOf6 = Long.valueOf(bVar15.f4930b);
                                        } else {
                                            str3 = str2;
                                            valueOf6 = null;
                                        }
                                        h.b bVar18 = (h.b) arrayList4.get(0);
                                        if (bVar18 != null) {
                                            str21 = bVar18.f4931c;
                                        } else {
                                            str21 = null;
                                        }
                                        sb2.append(paymentUtils.getPriceDifferenceForPromo(valueOf5, valueOf6, str21));
                                        sb2.append('!');
                                        robertoTextView4.setText(sb2.toString());
                                        RobertoTextView robertoTextView5 = (RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedMonthlyExplanation);
                                        StringBuilder sb3 = new StringBuilder("This discount will apply for the first month only, after which you will be charged ");
                                        if (!z10 ? (bVar16 = (h.b) arrayList4.get(1)) != null : (bVar16 = (h.b) arrayList4.get(2)) != null) {
                                            str22 = bVar16.f4929a;
                                        } else {
                                            str22 = null;
                                        }
                                        sb3.append(str22);
                                        sb3.append("/month through auto-renewal.");
                                        robertoTextView5.setText(sb3.toString());
                                        ((ConstraintLayout) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedMonthly)).setVisibility(0);
                                    }
                                    ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton1)).setBackground(a.c.b(this$0.K(), R.drawable.grey_rounded_corners_purple_stroke));
                                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedMonthlyRemove)).setOnClickListener(new e(this$0, 14));
                                }
                            } else {
                                str3 = str2;
                                if (subscriptionPeriod.equals(Constants.PLUS_QUARTERLY)) {
                                    if (!z10 && !z11) {
                                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setVisibility(8);
                                        RobertoTextView robertoTextView6 = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePrice2);
                                        h.b bVar19 = (h.b) arrayList4.get(0);
                                        if (bVar19 != null) {
                                            str17 = bVar19.f4929a;
                                        } else {
                                            str17 = null;
                                        }
                                        robertoTextView6.setText(str17);
                                    } else {
                                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setVisibility(0);
                                        RobertoTextView robertoTextView7 = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext2);
                                        if (!z10 ? (bVar7 = (h.b) arrayList4.get(1)) != null : (bVar7 = (h.b) arrayList4.get(2)) != null) {
                                            str12 = bVar7.f4929a;
                                        } else {
                                            str12 = null;
                                        }
                                        robertoTextView7.setText(str12);
                                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setPaintFlags(((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).getPaintFlags() | 16);
                                        RobertoTextView robertoTextView8 = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePrice2);
                                        if (!z10 ? (bVar8 = (h.b) arrayList4.get(0)) != null : (bVar8 = (h.b) arrayList4.get(1)) != null) {
                                            str13 = bVar8.f4929a;
                                        } else {
                                            str13 = null;
                                        }
                                        robertoTextView8.setText(str13);
                                        RobertoTextView robertoTextView9 = (RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedQuarterlyText);
                                        StringBuilder sb4 = new StringBuilder("Yay! ");
                                        sb4.append(this$0.C);
                                        sb4.append(" has been applied for a ");
                                        SkuModel skuModel2 = this$0.D;
                                        if (skuModel2 != null) {
                                            str14 = skuModel2.getDiscount();
                                        } else {
                                            str14 = null;
                                        }
                                        sb4.append(str14);
                                        sb4.append("% discount. You've saved ");
                                        PaymentUtils paymentUtils2 = PaymentUtils.INSTANCE;
                                        if (z10) {
                                            bVar9 = (h.b) arrayList4.get(2);
                                            i11 = 1;
                                            break;
                                        } else {
                                            i11 = 1;
                                            bVar9 = (h.b) arrayList4.get(1);
                                            break;
                                        }
                                        if (z10) {
                                            bVar10 = (h.b) arrayList4.get(i11);
                                            i12 = 0;
                                            break;
                                        } else {
                                            i12 = 0;
                                            bVar10 = (h.b) arrayList4.get(0);
                                            break;
                                        }
                                        h.b bVar20 = (h.b) arrayList4.get(i12);
                                        if (bVar20 != null) {
                                            str15 = bVar20.f4931c;
                                        } else {
                                            str15 = null;
                                        }
                                        sb4.append(paymentUtils2.getPriceDifferenceForPromo(valueOf3, valueOf4, str15));
                                        sb4.append('!');
                                        robertoTextView9.setText(sb4.toString());
                                        RobertoTextView robertoTextView10 = (RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedQuarterlyExplanation);
                                        StringBuilder sb5 = new StringBuilder("This discount will apply for the first quarter only, after which you will be charged ");
                                        if (!z10 ? (bVar11 = (h.b) arrayList4.get(1)) != null : (bVar11 = (h.b) arrayList4.get(2)) != null) {
                                            str16 = bVar11.f4929a;
                                        } else {
                                            str16 = null;
                                        }
                                        sb5.append(str16);
                                        sb5.append("/quarter through auto-renewal.");
                                        robertoTextView10.setText(sb5.toString());
                                        ((ConstraintLayout) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedQuarterly)).setVisibility(0);
                                    }
                                    ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton2)).setBackground(a.c.b(this$0.K(), R.drawable.grey_rounded_corners_purple_stroke));
                                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedQuarterlyRemove)).setOnClickListener(new e(this$0, 15));
                                }
                            }
                        } else {
                            str3 = str2;
                            if (subscriptionPeriod.equals(Constants.PLUS_ANNUAL)) {
                                if (!z10 && !z11) {
                                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setVisibility(8);
                                    RobertoTextView robertoTextView11 = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePrice3);
                                    h.b bVar21 = (h.b) arrayList4.get(0);
                                    if (bVar21 != null) {
                                        str9 = bVar21.f4929a;
                                    } else {
                                        str9 = null;
                                    }
                                    robertoTextView11.setText(str9);
                                } else {
                                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setVisibility(0);
                                    RobertoTextView robertoTextView12 = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext3);
                                    if (!z10 ? (bVar = (h.b) arrayList4.get(1)) != null : (bVar = (h.b) arrayList4.get(2)) != null) {
                                        str4 = bVar.f4929a;
                                    } else {
                                        str4 = null;
                                    }
                                    robertoTextView12.setText(str4);
                                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setPaintFlags(((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).getPaintFlags() | 16);
                                    RobertoTextView robertoTextView13 = (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemePrice3);
                                    if (!z10 ? (bVar2 = (h.b) arrayList4.get(0)) != null : (bVar2 = (h.b) arrayList4.get(1)) != null) {
                                        str5 = bVar2.f4929a;
                                    } else {
                                        str5 = null;
                                    }
                                    robertoTextView13.setText(str5);
                                }
                                RobertoTextView robertoTextView14 = (RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedAnnualText);
                                StringBuilder sb6 = new StringBuilder("Yay! ");
                                sb6.append(this$0.C);
                                sb6.append(" has been applied for a ");
                                SkuModel skuModel3 = this$0.D;
                                if (skuModel3 != null) {
                                    str6 = skuModel3.getDiscount();
                                } else {
                                    str6 = null;
                                }
                                sb6.append(str6);
                                sb6.append("% discount. You've saved ");
                                PaymentUtils paymentUtils3 = PaymentUtils.INSTANCE;
                                if (z10) {
                                    bVar3 = (h.b) arrayList4.get(2);
                                    i6 = 1;
                                    break;
                                } else {
                                    i6 = 1;
                                    bVar3 = (h.b) arrayList4.get(1);
                                    break;
                                }
                                if (z10) {
                                    bVar4 = (h.b) arrayList4.get(i6);
                                    i10 = 0;
                                    break;
                                } else {
                                    i10 = 0;
                                    bVar4 = (h.b) arrayList4.get(0);
                                    break;
                                }
                                h.b bVar22 = (h.b) arrayList4.get(i10);
                                if (bVar22 != null) {
                                    str7 = bVar22.f4931c;
                                } else {
                                    str7 = null;
                                }
                                sb6.append(paymentUtils3.getPriceDifferenceForPromo(valueOf, valueOf2, str7));
                                sb6.append('!');
                                robertoTextView14.setText(sb6.toString());
                                RobertoTextView robertoTextView15 = (RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedAnnualExplanation);
                                StringBuilder sb7 = new StringBuilder("This discount will apply for the first year only, after which you will be charged ");
                                if (!z10 ? (bVar5 = (h.b) arrayList4.get(1)) != null : (bVar5 = (h.b) arrayList4.get(2)) != null) {
                                    str8 = bVar5.f4929a;
                                } else {
                                    str8 = null;
                                }
                                sb7.append(str8);
                                sb7.append("/year through auto-renewal.");
                                robertoTextView15.setText(sb7.toString());
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton3)).setBackground(a.c.b(this$0.K(), R.drawable.grey_rounded_corners_purple_stroke));
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedAnnual)).setVisibility(0);
                                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedAnnualRemove)).setOnClickListener(new e(this$0, 16));
                            }
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setVisibility(8);
                        hashCode2 = subscriptionPeriod.hashCode();
                        if (hashCode2 == -1412959777) {
                            if (hashCode2 != -1066027719) {
                                if (hashCode2 == 1236635661) {
                                    subscriptionPeriod.equals(Constants.PLUS_MONTHLY);
                                }
                            } else if (subscriptionPeriod.equals(Constants.PLUS_QUARTERLY)) {
                                str10 = "quarter";
                                RobertoButton robertoButton = (RobertoButton) this$0._$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb8 = new StringBuilder("start at ");
                                if (z10 ? (bVar6 = (h.b) arrayList4.get(0)) != null : (bVar6 = (h.b) arrayList4.get(1)) != null) {
                                    str11 = bVar6.f4929a;
                                }
                                sb8.append(str11);
                                sb8.append('/');
                                sb8.append(str10);
                                robertoButton.setText(sb8.toString());
                                if (!z10) {
                                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationPriceText)).setText(str25 + " for the first " + str10 + " and " + str3 + " every " + str10 + " after that. Auto-renewal, cancel anytime.");
                                    return;
                                }
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationPriceText)).setText(str25 + " for the first " + str10 + " after free trial - and " + str3 + '/' + str10 + " next year onwards. Auto-renewal, cancel anytime.");
                                return;
                            }
                            str10 = "month";
                            RobertoButton robertoButton2 = (RobertoButton) this$0._$_findCachedViewById(R.id.monetizationBuyButton);
                            StringBuilder sb82 = new StringBuilder("start at ");
                            str11 = z10 ? null : null;
                            sb82.append(str11);
                            sb82.append('/');
                            sb82.append(str10);
                            robertoButton2.setText(sb82.toString());
                            if (!z10) {
                            }
                        } else {
                            if (subscriptionPeriod.equals(Constants.PLUS_ANNUAL)) {
                                str10 = "year";
                                RobertoButton robertoButton22 = (RobertoButton) this$0._$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb822 = new StringBuilder("start at ");
                                if (z10) {
                                }
                                sb822.append(str11);
                                sb822.append('/');
                                sb822.append(str10);
                                robertoButton22.setText(sb822.toString());
                                if (!z10) {
                                }
                            }
                            str10 = "month";
                            RobertoButton robertoButton222 = (RobertoButton) this$0._$_findCachedViewById(R.id.monetizationBuyButton);
                            StringBuilder sb8222 = new StringBuilder("start at ");
                            if (z10) {
                            }
                            sb8222.append(str11);
                            sb8222.append('/');
                            sb8222.append(str10);
                            robertoButton222.setText(sb8222.toString());
                            if (!z10) {
                            }
                        }
                    } while (!dVar.f4935c.contains("intro"));
                    str = ((h.b) cVar.f4932a.get(0)).f4929a;
                    kotlin.jvm.internal.i.f(str, "offerDetails.pricingPhas…aseList[0].formattedPrice");
                    str2 = ((h.b) cVar.f4932a.get(1)).f4929a;
                    kotlin.jvm.internal.i.f(str2, "offerDetails.pricingPhas…aseList[1].formattedPrice");
                    z10 = false;
                    z11 = true;
                    if (dVar == null) {
                    }
                    String str242 = dVar.f4933a;
                    kotlin.jvm.internal.i.f(str242, "selectedOffer.offerToken");
                    this$0.f26502y = str242;
                    h.c cVar22 = dVar.f4934b;
                    String str252 = str;
                    String valueOf72 = String.valueOf(((h.b) cVar22.f4932a.get(0)).f4930b / 1000000);
                    kotlin.jvm.internal.i.g(valueOf72, "<set-?>");
                    this$0.f26503z = valueOf72;
                    ArrayList arrayList42 = cVar22.f4932a;
                    String str262 = ((h.b) arrayList42.get(0)).f4931c;
                    kotlin.jvm.internal.i.f(str262, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                    this$0.A = str262;
                    hashCode = subscriptionPeriod.hashCode();
                    if (hashCode == -1412959777) {
                    }
                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setVisibility(8);
                    hashCode2 = subscriptionPeriod.hashCode();
                    if (hashCode2 == -1412959777) {
                    }
                } else {
                    kotlin.jvm.internal.i.q("productDetailsList");
                    throw null;
                }
                break;
            case 1:
                ho.t this$02 = (ho.t) obj2;
                JSONObject options = (JSONObject) obj;
                int i17 = ho.t.f18054z;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(options, "$options");
                ProTakeAssessmentActivity proTakeAssessmentActivity = this$02.f18056v;
                if (proTakeAssessmentActivity != null) {
                    JSONArray jSONArray = proTakeAssessmentActivity.A;
                    if (jSONArray.length() <= proTakeAssessmentActivity.f11522x) {
                        jSONArray.put(options);
                        proTakeAssessmentActivity.t0();
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 2:
                ExperimentProfileActivity this$03 = (ExperimentProfileActivity) obj2;
                View view = (View) obj;
                int i18 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(view, "$view");
                HashMap<View, Integer> hashMap = this$03.f11578z;
                try {
                    Integer num2 = hashMap.get(view);
                    if (num2 == null) {
                        num2 = num;
                    }
                    if (num2.intValue() == 0) {
                        if (view instanceof ProgressBar) {
                            progressBar = (ProgressBar) view;
                        }
                        ProgressBar progressBar2 = progressBar;
                        if (progressBar2 != null) {
                            progressBar2.setProgress(0);
                            return;
                        }
                        return;
                    }
                    int[] iArr = new int[2];
                    iArr[0] = 25;
                    Integer num3 = hashMap.get(view);
                    if (num3 != null) {
                        num = num3;
                    }
                    iArr[1] = num.intValue();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(view, Constants.SCREEN_PROGRESS, iArr);
                    ofInt.setDuration(350L);
                    ofInt.setInterpolator(new LinearInterpolator());
                    ofInt.start();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$03.f11575w, e10);
                    return;
                }
            case 3:
                RecyclerView this_apply = (RecyclerView) obj2;
                op.a this$04 = (op.a) obj;
                int i19 = op.a.D;
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                try {
                    this_apply.h0(5000);
                    this_apply.k0(10, 0, false);
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$04.f27695v, e11);
                    return;
                }
            case 4:
                fq.d this$05 = (fq.d) obj2;
                ArrayList pagerList = (ArrayList) obj;
                int i20 = fq.d.C;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(pagerList, "$pagerList");
                Layout layout = ((RobertoTextView) this$05._$_findCachedViewById(R.id.tvNotifyDescription)).getLayout();
                if (layout != null) {
                    int lineCount = layout.getLineCount();
                    if (lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                        i14 = 0;
                        ((RobertoTextView) this$05._$_findCachedViewById(R.id.tvNotifyReadMore)).setVisibility(0);
                    } else {
                        i14 = 0;
                    }
                    this$05.J(i14, pagerList.size());
                    androidx.fragment.app.p requireActivity = this$05.requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                    ((ViewPager) this$05._$_findCachedViewById(R.id.viewPager)).setAdapter(new d.a(requireActivity, pagerList));
                    ((ViewPager) this$05._$_findCachedViewById(R.id.viewPager)).b(new d.b(pagerList.size()));
                    return;
                }
                return;
            case 5:
                fq.y0 this$06 = (fq.y0) obj2;
                RelativeLayout card = (RelativeLayout) obj;
                int i21 = fq.y0.O;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(card, "$card");
                ((ScrollView) this$06._$_findCachedViewById(R.id.scrollView)).requestChildFocus(card, card);
                return;
            case 6:
                fq.a1 this$07 = (fq.a1) obj2;
                RelativeLayout row = (RelativeLayout) obj;
                int i22 = fq.a1.f15652z;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(row, "$row");
                ((ScrollView) this$07._$_findCachedViewById(R.id.scrollview)).requestChildFocus(row, row);
                return;
            case 7:
                h6 this$08 = (h6) obj2;
                TemplateActivity act = (TemplateActivity) obj;
                int i23 = h6.f18533w;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                Object obj5 = act.F.get("s18_user_data");
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) this$08._$_findCachedViewById(R.id.editText)).setText((String) obj5);
                return;
            case 8:
                z7 this$09 = (z7) obj2;
                RelativeLayout card2 = (RelativeLayout) obj;
                int i24 = z7.K;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(card2, "$card");
                ((ScrollView) this$09._$_findCachedViewById(R.id.scrollView)).requestChildFocus(card2, card2);
                return;
            case 9:
                f8 this$010 = (f8) obj2;
                RelativeLayout row2 = (RelativeLayout) obj;
                int i25 = f8.C;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(row2, "$row");
                ScrollView scrollView = (ScrollView) this$010._$_findCachedViewById(R.id.scrollview);
                if (scrollView != null) {
                    scrollView.requestChildFocus(row2, row2);
                    return;
                }
                return;
            case 10:
                t8 this$011 = (t8) obj2;
                RelativeLayout row3 = (RelativeLayout) obj;
                int i26 = t8.f19209z;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(row3, "$row");
                ScrollView scrollView2 = (ScrollView) this$011._$_findCachedViewById(R.id.scrollview);
                if (scrollView2 != null) {
                    scrollView2.requestChildFocus(row3, row3);
                    return;
                }
                return;
            case 11:
                t9 this$012 = (t9) obj2;
                kotlin.jvm.internal.x calendar = (kotlin.jvm.internal.x) obj;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(calendar, "$calendar");
                ((RobertoTextView) this$012._$_findCachedViewById(R.id.tvS92Time)).setText(new SimpleDateFormat("hh:mm a").format(((Calendar) calendar.f23469u).getTime()));
                return;
            case 12:
                u9 this$013 = (u9) obj2;
                kotlin.jvm.internal.x calendar2 = (kotlin.jvm.internal.x) obj;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(calendar2, "$calendar");
                ((RobertoTextView) this$013._$_findCachedViewById(R.id.tvS92Time)).setText(new SimpleDateFormat("hh:mm a").format(((Calendar) calendar2.f23469u).getTime()));
                return;
            case 13:
                ba this$014 = (ba) obj2;
                TemplateActivity act2 = (TemplateActivity) obj;
                int i27 = ba.f18212w;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(act2, "$act");
                Object obj6 = act2.F.get("age");
                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) this$014._$_findCachedViewById(R.id.editText)).setText((String) obj6);
                return;
            case 14:
                UiUtils.Companion.increaseButtonClickArea$lambda$2((Button) obj2, (View) obj);
                return;
            default:
                UiUtils.Companion.increaseImageClickArea$lambda$0((ImageView) obj2, (View) obj);
                return;
        }
    }
}
