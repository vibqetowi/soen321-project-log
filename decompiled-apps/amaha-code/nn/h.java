package nn;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import c4.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.model.SkuModel;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.model.Testimonial;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
/* compiled from: BasicMonetizationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lnn/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h extends Fragment {
    public static final /* synthetic */ int L = 0;
    public String A;
    public boolean B;
    public SkuModel D;
    public String E;
    public String F;
    public List<c4.h> G;
    public ArrayList<String> H;
    public final boolean I;
    public MonetizationViewModel J;

    /* renamed from: v  reason: collision with root package name */
    public LayoutInflater f26499v;

    /* renamed from: w  reason: collision with root package name */
    public MonetizationActivity f26500w;

    /* renamed from: x  reason: collision with root package name */
    public String f26501x;

    /* renamed from: y  reason: collision with root package name */
    public String f26502y;

    /* renamed from: z  reason: collision with root package name */
    public String f26503z;
    public final LinkedHashMap K = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26498u = LogHelper.INSTANCE.makeLogTag("BasicMonetizationFragment");
    public String C = "";

    /* compiled from: BasicMonetizationFragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f26504c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<Testimonial> f26505d;

        public a(MonetizationActivity monetizationActivity, ArrayList arrayList) {
            this.f26504c = monetizationActivity;
            this.f26505d = new ArrayList<>();
            this.f26505d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            kotlin.jvm.internal.i.g(collection, "collection");
            kotlin.jvm.internal.i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return 100;
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            kotlin.jvm.internal.i.g(collection, "collection");
            if (i6 > 5) {
                i6 %= 6;
            }
            View inflate = LayoutInflater.from(this.f26504c).inflate(R.layout.row_testimonials, collection, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            ArrayList<Testimonial> arrayList = this.f26505d;
            ((RobertoTextView) viewGroup.findViewById(R.id.testimonialText)).setText(arrayList.get(i6).getText());
            ((RobertoTextView) viewGroup.findViewById(R.id.testimonialDetails)).setText(arrayList.get(i6).getUserName() + ' ' + arrayList.get(i6).getDate());
            collection.addView(viewGroup);
            return viewGroup;
        }

        @Override // k2.a
        public final boolean j(View view, Object object) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(object, "object");
            if (view == object) {
                return true;
            }
            return false;
        }
    }

    public h() {
        boolean z10;
        new JSONObject();
        this.H = new ArrayList<>();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && user.getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && !kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I = z10;
    }

    public final void F(String str) {
        requireActivity().runOnUiThread(new f(this, 0, str));
    }

    public final void I(int i6, int i10) {
        try {
            View[] viewArr = new View[i10];
            ((LinearLayout) _$_findCachedViewById(R.id.monetizationTestimonialsLayoutDots)).removeAllViews();
            boolean z10 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                View inflate = K().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.monetizationTestimonialsLayoutDots)), false);
                viewArr[i11] = inflate;
                kotlin.jvm.internal.i.d(inflate);
                MonetizationActivity K = K();
                Object obj = g0.a.f16164a;
                inflate.setBackground(a.c.b(K, R.drawable.circle_filled_grey));
                ((LinearLayout) _$_findCachedViewById(R.id.monetizationTestimonialsLayoutDots)).addView(viewArr[i11]);
            }
            if (i10 == 0) {
                z10 = true;
            }
            if (!z10) {
                View view = viewArr[i6];
                kotlin.jvm.internal.i.d(view);
                MonetizationActivity K2 = K();
                Object obj2 = g0.a.f16164a;
                view.setBackground(a.c.b(K2, R.drawable.thumb));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:511:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0c88  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(boolean z10) {
        boolean z11;
        h.d dVar;
        boolean z12;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList a10;
        h.b bVar;
        ArrayList a11;
        ArrayList a12;
        h.b bVar2;
        ArrayList a13;
        h.b bVar3;
        ArrayList a14;
        h.b bVar4;
        ArrayList a15;
        h.b bVar5;
        ArrayList a16;
        h.b bVar6;
        ArrayList a17;
        h.b bVar7;
        ArrayList a18;
        h.b bVar8;
        ArrayList a19;
        h.b bVar9;
        ArrayList a20;
        h.b bVar10;
        ArrayList a21;
        h.b bVar11;
        ArrayList a22;
        h.b bVar12;
        ArrayList a23;
        h.b bVar13;
        ArrayList a24;
        h.b bVar14;
        ArrayList a25;
        h.b bVar15;
        ArrayList a26;
        h.b bVar16;
        ArrayList a27;
        h.b bVar17;
        ArrayList a28;
        h.b bVar18;
        ArrayList a29;
        h.b bVar19;
        ArrayList a30;
        h.b bVar20;
        ArrayList a31;
        h.b bVar21;
        ArrayList a32;
        h.b bVar22;
        ArrayList a33;
        h.b bVar23;
        ArrayList a34;
        h.b bVar24;
        ArrayList a35;
        h.b bVar25;
        ArrayList a36;
        h.b bVar26;
        ArrayList a37;
        h.b bVar27;
        ArrayList a38;
        h.b bVar28;
        ArrayList a39;
        h.b bVar29;
        ArrayList a40;
        h.b bVar30;
        ArrayList a41;
        h.b bVar31;
        ArrayList a42;
        h.b bVar32;
        ArrayList a43;
        h.b bVar33;
        ArrayList a44;
        h.b bVar34;
        ArrayList a45;
        h.b bVar35;
        ArrayList a46;
        h.b bVar36;
        ArrayList a47;
        h.b bVar37;
        ArrayList a48;
        h.b bVar38;
        ArrayList a49;
        h.b bVar39;
        ArrayList a50;
        h.b bVar40;
        ArrayList a51;
        h.b bVar41;
        ArrayList a52;
        h.b bVar42;
        ArrayList a53;
        h.b bVar43;
        ArrayList a54;
        h.b bVar44;
        ArrayList a55;
        h.b bVar45;
        ArrayList a56;
        h.b bVar46;
        ArrayList a57;
        h.b bVar47;
        try {
            if (isAdded()) {
                androidx.fragment.app.p requireActivity = requireActivity();
                kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity");
                U((MonetizationActivity) requireActivity);
                if (z10) {
                    String str6 = this.F;
                    if (str6 == null) {
                        str6 = "";
                    }
                    X(str6);
                }
                List<c4.h> list = this.G;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (kotlin.jvm.internal.i.b(((c4.h) obj).b(), O())) {
                            arrayList.add(obj);
                        }
                    }
                    c4.h hVar = (c4.h) is.u.i2(arrayList);
                    if (hVar == null) {
                        Utils.INSTANCE.showCustomToast(K(), "Connection Error. Please Try Again");
                        K().finish();
                        return;
                    }
                    ArrayList c10 = hVar.c();
                    kotlin.jvm.internal.i.d(c10);
                    Iterator it = c10.iterator();
                    do {
                        if (it.hasNext()) {
                            dVar = (h.d) it.next();
                            if (dVar.a().contains("free-intro")) {
                                z11 = true;
                            }
                        } else {
                            z11 = false;
                            dVar = null;
                        }
                        z12 = false;
                        break;
                    } while (!dVar.a().contains("intro"));
                    z11 = false;
                    z12 = true;
                    if (dVar == null) {
                        ArrayList c11 = hVar.c();
                        dVar = c11 != null ? (h.d) c11.get(0) : null;
                    }
                    kotlin.jvm.internal.i.d(dVar);
                    String b10 = dVar.b();
                    kotlin.jvm.internal.i.f(b10, "selectedOffer!!.offerToken");
                    Z(b10);
                    String valueOf = String.valueOf(((h.b) dVar.c().a().get(0)).b() / 1000000);
                    kotlin.jvm.internal.i.g(valueOf, "<set-?>");
                    this.f26503z = valueOf;
                    String c12 = ((h.b) dVar.c().a().get(0)).c();
                    kotlin.jvm.internal.i.f(c12, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                    Y(c12);
                    String O = O();
                    int hashCode = O.hashCode();
                    if (hashCode == -974739188) {
                        str = " every quarter after that. Auto-renewal, cancel anytime.";
                        str2 = " for the first quarter and ";
                        str3 = "/quarter next quarter onwards. Auto-renewal, cancel anytime.";
                        str4 = "/quarter";
                        if (O.equals(Constants.SUBSCRIPTION_BASIC_3)) {
                            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton1)).setBackground(g0.a.d(K(), R.drawable.grey_background_rounded_corners));
                            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton2)).setBackground(g0.a.d(K(), R.drawable.grey_background_rounded_corners));
                            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton3)).setBackground(g0.a.d(K(), R.drawable.grey_rounded_corners_purple_stroke));
                            if (!z11 && !z12) {
                                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb2 = new StringBuilder();
                                h.c c13 = dVar.c();
                                sb2.append((c13 == null || (a17 = c13.a()) == null || (bVar7 = (h.b) a17.get(0)) == null) ? null : bVar7.a());
                                sb2.append("/year. Your subscription will be auto-renewed and you can cancel it anytime.");
                                robertoTextView.setText(sb2.toString());
                                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("start at ");
                                h.c c14 = dVar.c();
                                sb3.append((c14 == null || (a16 = c14.a()) == null || (bVar6 = (h.b) a16.get(0)) == null) ? null : bVar6.a());
                                sb3.append("/year");
                                robertoButton.setText(sb3.toString());
                            } else if (z11) {
                                RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("start at ");
                                h.c c15 = dVar.c();
                                sb4.append((c15 == null || (a15 = c15.a()) == null || (bVar5 = (h.b) a15.get(1)) == null) ? null : bVar5.a());
                                sb4.append("/year");
                                robertoButton2.setText(sb4.toString());
                                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb5 = new StringBuilder();
                                h.c c16 = dVar.c();
                                sb5.append((c16 == null || (a14 = c16.a()) == null || (bVar4 = (h.b) a14.get(1)) == null) ? null : bVar4.a());
                                sb5.append(" for the first year after free trial - and ");
                                h.c c17 = dVar.c();
                                sb5.append((c17 == null || (a13 = c17.a()) == null || (bVar3 = (h.b) a13.get(2)) == null) ? null : bVar3.a());
                                sb5.append("/year next year onwards. Auto-renewal, cancel anytime.");
                                robertoTextView2.setText(sb5.toString());
                            } else {
                                RobertoButton robertoButton3 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("start at ");
                                h.c c18 = dVar.c();
                                sb6.append((c18 == null || (a12 = c18.a()) == null || (bVar2 = (h.b) a12.get(0)) == null) ? null : bVar2.a());
                                sb6.append("/year");
                                robertoButton3.setText(sb6.toString());
                                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb7 = new StringBuilder();
                                h.c c19 = dVar.c();
                                if (c19 != null && (a11 = c19.a()) != null) {
                                    h.b bVar48 = (h.b) a11.get(0);
                                    if (bVar48 != null) {
                                        str5 = bVar48.a();
                                        sb7.append(str5);
                                        sb7.append(" for the first year and ");
                                        h.c c20 = dVar.c();
                                        sb7.append((c20 != null || (a10 = c20.a()) == null || (bVar = (h.b) a10.get(1)) == null) ? null : bVar.a());
                                        sb7.append(" every year after that. Auto-renewal, cancel anytime.");
                                        robertoTextView3.setText(sb7.toString());
                                        hs.k kVar = hs.k.f19476a;
                                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(z11 ? 0 : 8);
                                        return;
                                    }
                                }
                                str5 = null;
                                sb7.append(str5);
                                sb7.append(" for the first year and ");
                                h.c c202 = dVar.c();
                                sb7.append((c202 != null || (a10 = c202.a()) == null || (bVar = (h.b) a10.get(1)) == null) ? null : bVar.a());
                                sb7.append(" every year after that. Auto-renewal, cancel anytime.");
                                robertoTextView3.setText(sb7.toString());
                                hs.k kVar2 = hs.k.f19476a;
                                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(z11 ? 0 : 8);
                                return;
                            }
                            hs.k kVar22 = hs.k.f19476a;
                            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(z11 ? 0 : 8);
                            return;
                        }
                    } else {
                        if (hashCode != 1557926636) {
                            if (hashCode == 1936572032 && O.equals(Constants.SUBSCRIPTION_BASIC_1)) {
                                ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton1)).setBackground(g0.a.d(K(), R.drawable.grey_rounded_corners_purple_stroke));
                                ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton2)).setBackground(g0.a.d(K(), R.drawable.grey_background_rounded_corners));
                                ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton3)).setBackground(g0.a.d(K(), R.drawable.grey_background_rounded_corners));
                                if (!z11 && !z12) {
                                    RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                    StringBuilder sb8 = new StringBuilder();
                                    h.c c21 = dVar.c();
                                    sb8.append((c21 == null || (a57 = c21.a()) == null || (bVar47 = (h.b) a57.get(0)) == null) ? null : bVar47.a());
                                    sb8.append("/month. Your subscription will be auto-renewed and you can cancel it anytime.");
                                    robertoTextView4.setText(sb8.toString());
                                    RobertoButton robertoButton4 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append("start at ");
                                    h.c c22 = dVar.c();
                                    sb9.append((c22 == null || (a56 = c22.a()) == null || (bVar46 = (h.b) a56.get(0)) == null) ? null : bVar46.a());
                                    sb9.append("/month");
                                    robertoButton4.setText(sb9.toString());
                                } else if (z11) {
                                    RobertoButton robertoButton5 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append("start at ");
                                    h.c c23 = dVar.c();
                                    sb10.append((c23 == null || (a55 = c23.a()) == null || (bVar45 = (h.b) a55.get(1)) == null) ? null : bVar45.a());
                                    sb10.append("/month");
                                    robertoButton5.setText(sb10.toString());
                                    RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                    StringBuilder sb11 = new StringBuilder();
                                    h.c c24 = dVar.c();
                                    sb11.append((c24 == null || (a54 = c24.a()) == null || (bVar44 = (h.b) a54.get(1)) == null) ? null : bVar44.a());
                                    sb11.append(" for the first month after free trial - and ");
                                    h.c c25 = dVar.c();
                                    sb11.append((c25 == null || (a53 = c25.a()) == null || (bVar43 = (h.b) a53.get(2)) == null) ? null : bVar43.a());
                                    sb11.append("/month next month onwards. Auto-renewal, cancel anytime.");
                                    robertoTextView5.setText(sb11.toString());
                                } else {
                                    RobertoButton robertoButton6 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                    StringBuilder sb12 = new StringBuilder();
                                    sb12.append("start at ");
                                    h.c c26 = dVar.c();
                                    sb12.append((c26 == null || (a52 = c26.a()) == null || (bVar42 = (h.b) a52.get(0)) == null) ? null : bVar42.a());
                                    sb12.append("/month");
                                    robertoButton6.setText(sb12.toString());
                                    RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                    StringBuilder sb13 = new StringBuilder();
                                    h.c c27 = dVar.c();
                                    sb13.append((c27 == null || (a51 = c27.a()) == null || (bVar41 = (h.b) a51.get(0)) == null) ? null : bVar41.a());
                                    sb13.append(" for the first month and ");
                                    h.c c28 = dVar.c();
                                    sb13.append((c28 == null || (a50 = c28.a()) == null || (bVar40 = (h.b) a50.get(1)) == null) ? null : bVar40.a());
                                    sb13.append(" every month after that. Auto-renewal, cancel anytime.");
                                    robertoTextView6.setText(sb13.toString());
                                }
                                hs.k kVar3 = hs.k.f19476a;
                            }
                            str = " every quarter after that. Auto-renewal, cancel anytime.";
                            str2 = " for the first quarter and ";
                            str3 = "/quarter next quarter onwards. Auto-renewal, cancel anytime.";
                            str4 = "/quarter";
                        } else if (O.equals(Constants.SUBSCRIPTION_BASIC_2)) {
                            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton1)).setBackground(g0.a.d(K(), R.drawable.grey_background_rounded_corners));
                            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton2)).setBackground(g0.a.d(K(), R.drawable.grey_rounded_corners_purple_stroke));
                            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton3)).setBackground(g0.a.d(K(), R.drawable.grey_background_rounded_corners));
                            if (!z11 && !z12) {
                                RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb14 = new StringBuilder();
                                h.c c29 = dVar.c();
                                sb14.append((c29 == null || (a49 = c29.a()) == null || (bVar39 = (h.b) a49.get(0)) == null) ? null : bVar39.a());
                                sb14.append("/quarter. Your subscription will be auto-renewed and you can cancel it anytime.");
                                robertoTextView7.setText(sb14.toString());
                                RobertoButton robertoButton7 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb15 = new StringBuilder();
                                sb15.append("start at ");
                                h.c c30 = dVar.c();
                                sb15.append((c30 == null || (a48 = c30.a()) == null || (bVar38 = (h.b) a48.get(0)) == null) ? null : bVar38.a());
                                sb15.append("/quarter");
                                robertoButton7.setText(sb15.toString());
                            } else if (z11) {
                                RobertoButton robertoButton8 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb16 = new StringBuilder();
                                sb16.append("start at ");
                                h.c c31 = dVar.c();
                                sb16.append((c31 == null || (a47 = c31.a()) == null || (bVar37 = (h.b) a47.get(1)) == null) ? null : bVar37.a());
                                sb16.append("/quarter");
                                robertoButton8.setText(sb16.toString());
                                RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb17 = new StringBuilder();
                                h.c c32 = dVar.c();
                                sb17.append((c32 == null || (a46 = c32.a()) == null || (bVar36 = (h.b) a46.get(1)) == null) ? null : bVar36.a());
                                sb17.append(" for the first quarter after free trial - and ");
                                h.c c33 = dVar.c();
                                sb17.append((c33 == null || (a45 = c33.a()) == null || (bVar35 = (h.b) a45.get(2)) == null) ? null : bVar35.a());
                                sb17.append("/quarter next quarter onwards. Auto-renewal, cancel anytime.");
                                robertoTextView8.setText(sb17.toString());
                            } else {
                                RobertoButton robertoButton9 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb18 = new StringBuilder();
                                sb18.append("start at ");
                                h.c c34 = dVar.c();
                                sb18.append((c34 == null || (a44 = c34.a()) == null || (bVar34 = (h.b) a44.get(0)) == null) ? null : bVar34.a());
                                sb18.append("/quarter");
                                robertoButton9.setText(sb18.toString());
                                RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb19 = new StringBuilder();
                                h.c c35 = dVar.c();
                                sb19.append((c35 == null || (a43 = c35.a()) == null || (bVar33 = (h.b) a43.get(0)) == null) ? null : bVar33.a());
                                sb19.append(" for the first quarter and ");
                                h.c c36 = dVar.c();
                                sb19.append((c36 == null || (a42 = c36.a()) == null || (bVar32 = (h.b) a42.get(1)) == null) ? null : bVar32.a());
                                sb19.append(" every quarter after that. Auto-renewal, cancel anytime.");
                                robertoTextView9.setText(sb19.toString());
                            }
                            hs.k kVar4 = hs.k.f19476a;
                        } else {
                            str = " every quarter after that. Auto-renewal, cancel anytime.";
                            str2 = " for the first quarter and ";
                            str3 = "/quarter next quarter onwards. Auto-renewal, cancel anytime.";
                            str4 = "/quarter";
                        }
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(z11 ? 0 : 8);
                        return;
                    }
                    String subscriptionPeriod = PaymentUtils.INSTANCE.getSubscriptionPeriod(O());
                    int hashCode2 = subscriptionPeriod.hashCode();
                    String str7 = str4;
                    if (hashCode2 != -1412959777) {
                        if (hashCode2 != -1066027719) {
                            if (hashCode2 == 1236635661 && subscriptionPeriod.equals(Constants.PLUS_MONTHLY)) {
                                if (!z11 && !z12) {
                                    RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                    StringBuilder sb20 = new StringBuilder();
                                    h.c c37 = dVar.c();
                                    sb20.append((c37 == null || (a41 = c37.a()) == null || (bVar31 = (h.b) a41.get(0)) == null) ? null : bVar31.a());
                                    sb20.append("/month. Your subscription will be auto-renewed and you can cancel it anytime.");
                                    robertoTextView10.setText(sb20.toString());
                                    RobertoButton robertoButton10 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                    StringBuilder sb21 = new StringBuilder();
                                    sb21.append("start at ");
                                    h.c c38 = dVar.c();
                                    sb21.append((c38 == null || (a40 = c38.a()) == null || (bVar30 = (h.b) a40.get(0)) == null) ? null : bVar30.a());
                                    sb21.append("/month");
                                    robertoButton10.setText(sb21.toString());
                                } else if (z11) {
                                    RobertoButton robertoButton11 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                    StringBuilder sb22 = new StringBuilder();
                                    sb22.append("start at ");
                                    h.c c39 = dVar.c();
                                    sb22.append((c39 == null || (a39 = c39.a()) == null || (bVar29 = (h.b) a39.get(1)) == null) ? null : bVar29.a());
                                    sb22.append("/month");
                                    robertoButton11.setText(sb22.toString());
                                    RobertoTextView robertoTextView11 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                    StringBuilder sb23 = new StringBuilder();
                                    h.c c40 = dVar.c();
                                    sb23.append((c40 == null || (a38 = c40.a()) == null || (bVar28 = (h.b) a38.get(1)) == null) ? null : bVar28.a());
                                    sb23.append(" for the first month after free trial - and ");
                                    h.c c41 = dVar.c();
                                    sb23.append((c41 == null || (a37 = c41.a()) == null || (bVar27 = (h.b) a37.get(2)) == null) ? null : bVar27.a());
                                    sb23.append("/month next month onwards. Auto-renewal, cancel anytime.");
                                    robertoTextView11.setText(sb23.toString());
                                } else {
                                    RobertoButton robertoButton12 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                    StringBuilder sb24 = new StringBuilder();
                                    sb24.append("start at ");
                                    h.c c42 = dVar.c();
                                    sb24.append((c42 == null || (a36 = c42.a()) == null || (bVar26 = (h.b) a36.get(0)) == null) ? null : bVar26.a());
                                    sb24.append("/month");
                                    robertoButton12.setText(sb24.toString());
                                    RobertoTextView robertoTextView12 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                    StringBuilder sb25 = new StringBuilder();
                                    h.c c43 = dVar.c();
                                    sb25.append((c43 == null || (a35 = c43.a()) == null || (bVar25 = (h.b) a35.get(0)) == null) ? null : bVar25.a());
                                    sb25.append(" for the first month and ");
                                    h.c c44 = dVar.c();
                                    sb25.append((c44 == null || (a34 = c44.a()) == null || (bVar24 = (h.b) a34.get(1)) == null) ? null : bVar24.a());
                                    sb25.append(" every month after that. Auto-renewal, cancel anytime.");
                                    robertoTextView12.setText(sb25.toString());
                                }
                                if (z10) {
                                    F(Constants.PLUS_MONTHLY);
                                }
                            }
                        } else if (subscriptionPeriod.equals(Constants.PLUS_QUARTERLY)) {
                            if (!z11 && !z12) {
                                RobertoTextView robertoTextView13 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb26 = new StringBuilder();
                                h.c c45 = dVar.c();
                                sb26.append((c45 == null || (a33 = c45.a()) == null || (bVar23 = (h.b) a33.get(0)) == null) ? null : bVar23.a());
                                sb26.append("/quarter. Your subscription will be auto-renewed and you can cancel it anytime.");
                                robertoTextView13.setText(sb26.toString());
                                RobertoButton robertoButton13 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb27 = new StringBuilder();
                                sb27.append("start at ");
                                h.c c46 = dVar.c();
                                sb27.append((c46 == null || (a32 = c46.a()) == null || (bVar22 = (h.b) a32.get(0)) == null) ? null : bVar22.a());
                                sb27.append(str7);
                                robertoButton13.setText(sb27.toString());
                            } else if (z11) {
                                RobertoButton robertoButton14 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb28 = new StringBuilder();
                                sb28.append("start at ");
                                h.c c47 = dVar.c();
                                sb28.append((c47 == null || (a31 = c47.a()) == null || (bVar21 = (h.b) a31.get(1)) == null) ? null : bVar21.a());
                                sb28.append(str7);
                                robertoButton14.setText(sb28.toString());
                                RobertoTextView robertoTextView14 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb29 = new StringBuilder();
                                h.c c48 = dVar.c();
                                sb29.append((c48 == null || (a30 = c48.a()) == null || (bVar20 = (h.b) a30.get(1)) == null) ? null : bVar20.a());
                                sb29.append(" for the first quarter after free trial - and ");
                                h.c c49 = dVar.c();
                                sb29.append((c49 == null || (a29 = c49.a()) == null || (bVar19 = (h.b) a29.get(2)) == null) ? null : bVar19.a());
                                sb29.append(str3);
                                robertoTextView14.setText(sb29.toString());
                            } else {
                                RobertoButton robertoButton15 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                                StringBuilder sb30 = new StringBuilder();
                                sb30.append("start at ");
                                h.c c50 = dVar.c();
                                sb30.append((c50 == null || (a28 = c50.a()) == null || (bVar18 = (h.b) a28.get(0)) == null) ? null : bVar18.a());
                                sb30.append(str7);
                                robertoButton15.setText(sb30.toString());
                                RobertoTextView robertoTextView15 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                                StringBuilder sb31 = new StringBuilder();
                                h.c c51 = dVar.c();
                                sb31.append((c51 == null || (a27 = c51.a()) == null || (bVar17 = (h.b) a27.get(0)) == null) ? null : bVar17.a());
                                sb31.append(str2);
                                h.c c52 = dVar.c();
                                sb31.append((c52 == null || (a26 = c52.a()) == null || (bVar16 = (h.b) a26.get(1)) == null) ? null : bVar16.a());
                                sb31.append(str);
                                robertoTextView15.setText(sb31.toString());
                            }
                            if (z10) {
                                F(Constants.PLUS_QUARTERLY);
                            }
                        }
                    } else if (subscriptionPeriod.equals(Constants.PLUS_ANNUAL)) {
                        if (!z11 && !z12) {
                            RobertoTextView robertoTextView16 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                            StringBuilder sb32 = new StringBuilder();
                            h.c c53 = dVar.c();
                            sb32.append((c53 == null || (a25 = c53.a()) == null || (bVar15 = (h.b) a25.get(0)) == null) ? null : bVar15.a());
                            sb32.append("/year. Your subscription will be auto-renewed and you can cancel it anytime.");
                            robertoTextView16.setText(sb32.toString());
                            RobertoButton robertoButton16 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                            StringBuilder sb33 = new StringBuilder();
                            sb33.append("start at ");
                            h.c c54 = dVar.c();
                            sb33.append((c54 == null || (a24 = c54.a()) == null || (bVar14 = (h.b) a24.get(0)) == null) ? null : bVar14.a());
                            sb33.append("/year");
                            robertoButton16.setText(sb33.toString());
                        } else if (z11) {
                            RobertoButton robertoButton17 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                            StringBuilder sb34 = new StringBuilder();
                            sb34.append("start at ");
                            h.c c55 = dVar.c();
                            sb34.append((c55 == null || (a23 = c55.a()) == null || (bVar13 = (h.b) a23.get(1)) == null) ? null : bVar13.a());
                            sb34.append("/year");
                            robertoButton17.setText(sb34.toString());
                            RobertoTextView robertoTextView17 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                            StringBuilder sb35 = new StringBuilder();
                            h.c c56 = dVar.c();
                            sb35.append((c56 == null || (a22 = c56.a()) == null || (bVar12 = (h.b) a22.get(1)) == null) ? null : bVar12.a());
                            sb35.append(" for the first year after free trial - and ");
                            h.c c57 = dVar.c();
                            sb35.append((c57 == null || (a21 = c57.a()) == null || (bVar11 = (h.b) a21.get(2)) == null) ? null : bVar11.a());
                            sb35.append("/year next year onwards. Auto-renewal, cancel anytime.");
                            robertoTextView17.setText(sb35.toString());
                        } else {
                            RobertoButton robertoButton18 = (RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton);
                            StringBuilder sb36 = new StringBuilder();
                            sb36.append("start at ");
                            h.c c58 = dVar.c();
                            sb36.append((c58 == null || (a20 = c58.a()) == null || (bVar10 = (h.b) a20.get(0)) == null) ? null : bVar10.a());
                            sb36.append("/year");
                            robertoButton18.setText(sb36.toString());
                            RobertoTextView robertoTextView18 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText);
                            StringBuilder sb37 = new StringBuilder();
                            h.c c59 = dVar.c();
                            sb37.append((c59 == null || (a19 = c59.a()) == null || (bVar9 = (h.b) a19.get(0)) == null) ? null : bVar9.a());
                            sb37.append(" for the first year and ");
                            h.c c60 = dVar.c();
                            sb37.append((c60 == null || (a18 = c60.a()) == null || (bVar8 = (h.b) a18.get(1)) == null) ? null : bVar8.a());
                            sb37.append(" every year after that. Auto-renewal, cancel anytime.");
                            robertoTextView18.setText(sb37.toString());
                        }
                        if (z10) {
                            F(Constants.PLUS_ANNUAL);
                        }
                    }
                    hs.k kVar5 = hs.k.f19476a;
                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag)).setVisibility(z11 ? 0 : 8);
                    return;
                }
                kotlin.jvm.internal.i.q("productDetailsList");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26498u, e10);
        }
    }

    public final MonetizationActivity K() {
        MonetizationActivity monetizationActivity = this.f26500w;
        if (monetizationActivity != null) {
            return monetizationActivity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    public final MonetizationViewModel M() {
        MonetizationViewModel monetizationViewModel = this.J;
        if (monetizationViewModel != null) {
            return monetizationViewModel;
        }
        kotlin.jvm.internal.i.q("monetizationViewModel");
        throw null;
    }

    public final String O() {
        String str = this.f26501x;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("selected");
        throw null;
    }

    public final void P() {
        String str;
        ArrayList arrayList;
        h.d dVar;
        boolean z10;
        boolean z11;
        h.b bVar;
        String str2;
        h.b bVar2;
        h.b bVar3;
        h.b bVar4;
        String str3;
        h.b bVar5;
        h.b bVar6;
        h.b bVar7;
        String str4;
        h.b bVar8;
        h.b bVar9;
        SkuModel skuModel = this.D;
        if (skuModel != null) {
            String subscriptionPeriod = skuModel.getSubscriptionPeriod();
            int hashCode = subscriptionPeriod.hashCode();
            String str5 = null;
            if (hashCode != -1412959777) {
                if (hashCode != -1066027719) {
                    if (hashCode == 1236635661 && subscriptionPeriod.equals(Constants.PLUS_MONTHLY)) {
                        str = Constants.SUBSCRIPTION_BASIC_1;
                    }
                    str = null;
                } else {
                    if (subscriptionPeriod.equals(Constants.PLUS_QUARTERLY)) {
                        str = Constants.SUBSCRIPTION_BASIC_2;
                    }
                    str = null;
                }
            } else {
                if (subscriptionPeriod.equals(Constants.PLUS_ANNUAL)) {
                    str = Constants.SUBSCRIPTION_BASIC_3;
                }
                str = null;
            }
            List<c4.h> list = this.G;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (kotlin.jvm.internal.i.b(((c4.h) obj).f4924c, str)) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.isEmpty()) {
                    Utils.INSTANCE.showCustomToast(K(), "Connection Error. Please Try Again");
                    K().finish();
                }
                c4.h hVar = (c4.h) is.u.i2(arrayList2);
                if (hVar != null) {
                    arrayList = hVar.f4927g;
                } else {
                    arrayList = null;
                }
                kotlin.jvm.internal.i.d(arrayList);
                Iterator it = arrayList.iterator();
                do {
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
                    ArrayList arrayList3 = hVar.f4927g;
                    if (arrayList3 != null) {
                        dVar = (h.d) arrayList3.get(0);
                    } else {
                        dVar = null;
                    }
                }
                kotlin.jvm.internal.i.d(dVar);
                String str6 = dVar.f4933a;
                kotlin.jvm.internal.i.f(str6, "selectedOffer!!.offerToken");
                this.f26502y = str6;
                h.c cVar = dVar.f4934b;
                String valueOf = String.valueOf(((h.b) cVar.f4932a.get(0)).f4930b / 1000000);
                kotlin.jvm.internal.i.g(valueOf, "<set-?>");
                this.f26503z = valueOf;
                ArrayList arrayList4 = cVar.f4932a;
                String str7 = ((h.b) arrayList4.get(0)).f4931c;
                kotlin.jvm.internal.i.f(str7, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                this.A = str7;
                if (str != null) {
                    int hashCode2 = str.hashCode();
                    if (hashCode2 != -974739188) {
                        if (hashCode2 != 1557926636) {
                            if (hashCode2 == 1936572032 && str.equals(Constants.SUBSCRIPTION_BASIC_1)) {
                                MonetizationActivity K = K();
                                Object obj2 = g0.a.f16164a;
                                ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton1)).setBackground(a.c.b(K, R.drawable.grey_background_rounded_corners));
                                ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedMonthly)).setVisibility(8);
                                if (!z10 && !z11) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setVisibility(8);
                                    RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice1);
                                    if (arrayList4 != null && (bVar9 = (h.b) arrayList4.get(0)) != null) {
                                        str5 = bVar9.f4929a;
                                    }
                                    robertoTextView.setText(str5);
                                    return;
                                }
                                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setVisibility(0);
                                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1);
                                if (!z10 ? !(arrayList4 == null || (bVar7 = (h.b) arrayList4.get(1)) == null) : !(arrayList4 == null || (bVar7 = (h.b) arrayList4.get(2)) == null)) {
                                    str4 = bVar7.f4929a;
                                } else {
                                    str4 = null;
                                }
                                robertoTextView2.setText(str4);
                                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).getPaintFlags() | 16);
                                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice1);
                                if (!z10 ? !(arrayList4 == null || (bVar8 = (h.b) arrayList4.get(0)) == null) : !(arrayList4 == null || (bVar8 = (h.b) arrayList4.get(1)) == null)) {
                                    str5 = bVar8.f4929a;
                                }
                                robertoTextView3.setText(str5);
                                return;
                            }
                            return;
                        } else if (str.equals(Constants.SUBSCRIPTION_BASIC_2)) {
                            MonetizationActivity K2 = K();
                            Object obj3 = g0.a.f16164a;
                            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton2)).setBackground(a.c.b(K2, R.drawable.grey_background_rounded_corners));
                            ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedQuarterly)).setVisibility(8);
                            if (!z10 && !z11) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setVisibility(8);
                                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice2);
                                if (arrayList4 != null && (bVar6 = (h.b) arrayList4.get(0)) != null) {
                                    str5 = bVar6.f4929a;
                                }
                                robertoTextView4.setText(str5);
                                return;
                            }
                            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setVisibility(0);
                            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2);
                            if (!z10 ? !(arrayList4 == null || (bVar4 = (h.b) arrayList4.get(1)) == null) : !(arrayList4 == null || (bVar4 = (h.b) arrayList4.get(2)) == null)) {
                                str3 = bVar4.f4929a;
                            } else {
                                str3 = null;
                            }
                            robertoTextView5.setText(str3);
                            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).getPaintFlags() | 16);
                            RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice2);
                            if (!z10 ? !(arrayList4 == null || (bVar5 = (h.b) arrayList4.get(0)) == null) : !(arrayList4 == null || (bVar5 = (h.b) arrayList4.get(1)) == null)) {
                                str5 = bVar5.f4929a;
                            }
                            robertoTextView6.setText(str5);
                            return;
                        } else {
                            return;
                        }
                    } else if (str.equals(Constants.SUBSCRIPTION_BASIC_3)) {
                        MonetizationActivity K3 = K();
                        Object obj4 = g0.a.f16164a;
                        ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton3)).setBackground(a.c.b(K3, R.drawable.grey_background_rounded_corners));
                        ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedAnnual)).setVisibility(8);
                        if (!z10 && !z11) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setVisibility(8);
                            RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice3);
                            if (arrayList4 != null && (bVar3 = (h.b) arrayList4.get(0)) != null) {
                                str5 = bVar3.f4929a;
                            }
                            robertoTextView7.setText(str5);
                            return;
                        }
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setVisibility(0);
                        RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3);
                        if (!z10 ? !(arrayList4 == null || (bVar = (h.b) arrayList4.get(1)) == null) : !(arrayList4 == null || (bVar = (h.b) arrayList4.get(2)) == null)) {
                            str2 = bVar.f4929a;
                        } else {
                            str2 = null;
                        }
                        robertoTextView8.setText(str2);
                        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).getPaintFlags() | 16);
                        RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice3);
                        if (!z10 ? !(arrayList4 == null || (bVar2 = (h.b) arrayList4.get(0)) == null) : !(arrayList4 == null || (bVar2 = (h.b) arrayList4.get(1)) == null)) {
                            str5 = bVar2.f4929a;
                        }
                        robertoTextView9.setText(str5);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            kotlin.jvm.internal.i.q("productDetailsList");
            throw null;
        }
    }

    public final void Q() {
        RobertoTextView robertoTextView;
        if (kotlin.jvm.internal.i.b(M().F, Constants.HOLD_PLUS_SELLING_SCREEN)) {
            SubscriptionModel currentSubscriptionModel = SubscriptionPersistence.INSTANCE.getCurrentSubscriptionModel();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentSubscriptionModel.getExpiryTime());
            String obj = DateFormat.format("dd-MM-yyyy", calendar).toString();
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationTopBannerBGHeader)).setText(R.string.sellingScreenHoldPlusBannerTitle);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationTopBannerBGSubheader)).setText(R.string.sellingScreenHoldPlusBannerText);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading0)).setText(R.string.sellingScreenHoldPlusTitle);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubTextMessaging)).setText(requireActivity().getString(R.string.sellingScreenHoldPlusText, obj));
            ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setText(R.string.sellingScreenHoldPlusCTA1);
            ((RobertoButton) _$_findCachedViewById(R.id.monetizationMessagingCTA2)).setText(R.string.sellingScreenHoldPlusCTA2);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubTextMessaging)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.monetizationMessagingCTA2)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPriceText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPolicyText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationTermsText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeedbackText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationDisclaimerText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading6)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPaymentExplanationCTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.monetizationFAQButton)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFAQHeading)).setVisibility(8);
            ((LinearLayout) _$_findCachedViewById(R.id.monetizationTestimonialsLayoutDots)).setVisibility(8);
            ((ViewPager) _$_findCachedViewById(R.id.monetizationTestimonialsViewPager)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading4)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPromotionCardImageFooter)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPromotionCardImageSubheader)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPromotionCardImageHeader)).setVisibility(8);
            ((AppCompatImageView) _$_findCachedViewById(R.id.monetizationPromotionCardImage)).setVisibility(8);
            ((CardView) _$_findCachedViewById(R.id.monetizationFeatures4)).setVisibility(8);
            ((CardView) _$_findCachedViewById(R.id.monetizationFeatures3)).setVisibility(8);
            ((CardView) _$_findCachedViewById(R.id.monetizationFeatures2)).setVisibility(8);
            ((CardView) _$_findCachedViewById(R.id.monetizationFeatures1)).setVisibility(8);
            ((CardView) _$_findCachedViewById(R.id.monetizationFeaturesMiniCourses)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading2)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.rowMonetizationText3)).setVisibility(8);
            ((AppCompatImageView) _$_findCachedViewById(R.id.rowMonetizationCheck3)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.rowMonetizationText2)).setVisibility(8);
            ((AppCompatImageView) _$_findCachedViewById(R.id.rowMonetizationCheck2)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.rowMonetizationText1)).setVisibility(8);
            ((AppCompatImageView) _$_findCachedViewById(R.id.rowMonetizationCheck1)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading1)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedFree)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton4)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedAnnual)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton3)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedQuarterly)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton2)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedMonthly)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton1)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.offerMonetizationButton)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubText0)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setOnClickListener(new e(this, 12));
            ((RobertoButton) _$_findCachedViewById(R.id.monetizationMessagingCTA2)).setOnClickListener(new e(this, 13));
            return;
        }
        if (is.u.Z1(ca.a.k("assessment", "locked_card"), K().B)) {
            ((AppCompatImageView) _$_findCachedViewById(R.id.monetizationTopBannerBG)).setImageResource(R.drawable.ic_basic_banner);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading0)).setText(getString(R.string.monetization_heading_0_alt));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSubText0)).setText(getString(R.string.monetization_subtext_0_alt));
        }
        this.f26501x = Constants.SUBSCRIPTION_BASIC_1;
        if (this.I && (robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesText1)) != null) {
            robertoTextView.setText(getString(R.string.monetization_heading_2_subtext_1_notv4));
        }
        if (defpackage.d.q("v2.2") || defpackage.d.q("v2.21")) {
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading0)).setText(getString(R.string.basicMonetizationHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationHeading2)).setText(getString(R.string.basicMonetizationSubheader));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesTitle1)).setText(getString(R.string.basicMonetizationAc));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesText1)).setText(getString(R.string.basicMonetizationAcText));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesTitle2)).setText(getString(R.string.basicMonetizationFp));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesText2)).setText(getString(R.string.basicMonetizationFpText));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesTitle3)).setText(getString(R.string.basicMonetizationSa));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesText3)).setText(getString(R.string.basicMonetizationSaText));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesTitle4)).setText(getString(R.string.basicMonetizationEc));
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeaturesText4)).setText(getString(R.string.basicMonetizationEcText));
            ViewGroup.LayoutParams layoutParams = ((AppCompatImageView) _$_findCachedViewById(R.id.monetizationTopBannerBG)).getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            ((AppCompatImageView) _$_findCachedViewById(R.id.monetizationTopBannerBG)).setLayoutParams(marginLayoutParams);
            ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new e(this, 0));
            ((AppCompatImageView) _$_findCachedViewById(R.id.monetizationTopBannerBG)).setImageResource(R.drawable.ic_basic_banner_blank);
        }
        a0();
        if (!is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.21", "v2.2"})) {
            ((CardView) _$_findCachedViewById(R.id.monetizationFeaturesMiniCourses)).setVisibility(0);
        }
        ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton1)).setOnClickListener(new e(this, 2));
        ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton2)).setOnClickListener(new e(this, 3));
        ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton3)).setOnClickListener(new e(this, 4));
        ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setOnClickListener(new e(this, 5));
        ArrayList<Testimonial> testimonialList = Constants.getTestimonials();
        MonetizationActivity K = K();
        kotlin.jvm.internal.i.f(testimonialList, "testimonialList");
        ((ViewPager) _$_findCachedViewById(R.id.monetizationTestimonialsViewPager)).setAdapter(new a(K, testimonialList));
        ((ViewPager) _$_findCachedViewById(R.id.monetizationTestimonialsViewPager)).b(new b(testimonialList.size()));
        I(0, testimonialList.size());
        ((ViewPager) _$_findCachedViewById(R.id.monetizationTestimonialsViewPager)).v(48);
        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFeedbackText)).setOnClickListener(new e(this, 6));
        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationTermsText)).setOnClickListener(new e(this, 7));
        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPolicyText)).setOnClickListener(new e(this, 8));
        ((RobertoButton) _$_findCachedViewById(R.id.monetizationFAQButton)).setOnClickListener(new e(this, 9));
        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPaymentExplanationCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationPaymentExplanationCTA)).getPaintFlags() | 8);
        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPaymentExplanationCTA)).setOnClickListener(new e(this, 10));
        ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).getPaintFlags() | 8);
        ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setOnClickListener(new e(this, 1));
        J(this.B);
    }

    public final void S(String str) {
        this.B = false;
        this.D = null;
        this.E = null;
        this.F = null;
        this.C = "";
        new JSONObject();
        MonetizationViewModel M = M();
        M.Z = null;
        M.X = null;
        M.Y = null;
        M.h().l(Boolean.FALSE);
        M.f11451a0 = new JSONObject();
        int hashCode = str.hashCode();
        if (hashCode != -1412959777) {
            if (hashCode != -1066027719) {
                if (hashCode == 1236635661 && str.equals(Constants.PLUS_MONTHLY)) {
                    ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedMonthly)).setVisibility(8);
                }
            } else if (str.equals(Constants.PLUS_QUARTERLY)) {
                ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedQuarterly)).setVisibility(8);
            }
        } else if (str.equals(Constants.PLUS_ANNUAL)) {
            ((ConstraintLayout) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedAnnual)).setVisibility(8);
        }
        ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setVisibility(0);
        this.f26501x = Constants.SUBSCRIPTION_BASIC_1;
        J(false);
        a0();
    }

    public final void U(MonetizationActivity monetizationActivity) {
        this.f26500w = monetizationActivity;
    }

    public final void X(String str) {
        this.f26501x = str;
    }

    public final void Y(String str) {
        this.A = str;
    }

    public final void Z(String str) {
        this.f26502y = str;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.K;
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

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a6, code lost:
        if (r9 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ef, code lost:
        if (r3 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0274, code lost:
        if (r8 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02bd, code lost:
        if (r3 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
        if (r9 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0129, code lost:
        if (r3 != null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        int i6;
        h.d dVar;
        boolean z10;
        boolean z11;
        h.b bVar;
        String str;
        h.b bVar2;
        String str2;
        h.c cVar;
        ArrayList arrayList;
        h.c cVar2;
        ArrayList arrayList2;
        String str3;
        h.d dVar2;
        h.c cVar3;
        ArrayList arrayList3;
        h.b bVar3;
        h.b bVar4;
        String str4;
        h.b bVar5;
        String str5;
        h.c cVar4;
        ArrayList arrayList4;
        h.c cVar5;
        ArrayList arrayList5;
        String str6;
        h.c cVar6;
        ArrayList arrayList6;
        h.b bVar6;
        h.b bVar7;
        String str7;
        h.b bVar8;
        String str8;
        h.c cVar7;
        ArrayList arrayList7;
        h.c cVar8;
        ArrayList arrayList8;
        String str9;
        h.c cVar9;
        ArrayList arrayList9;
        h.b bVar9;
        try {
            List<c4.h> list = this.G;
            if (list != null) {
                for (c4.h hVar : list) {
                    ArrayList arrayList10 = hVar.f4927g;
                    kotlin.jvm.internal.i.d(arrayList10);
                    Iterator it = arrayList10.iterator();
                    do {
                        i6 = 0;
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
                    ArrayList arrayList11 = hVar.f4927g;
                    if (dVar == null) {
                        if (arrayList11 != null) {
                            dVar = (h.d) arrayList11.get(0);
                        } else {
                            dVar = null;
                        }
                    }
                    String str10 = hVar.f4924c;
                    int hashCode = str10.hashCode();
                    if (hashCode != -974739188) {
                        if (hashCode != 1557926636) {
                            if (hashCode == 1936572032 && str10.equals(Constants.SUBSCRIPTION_BASIC_1)) {
                                if (!z10 && !z11) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setVisibility(8);
                                    RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice1);
                                    if (dVar != null && (cVar9 = dVar.f4934b) != null && (arrayList9 = cVar9.f4932a) != null && (bVar9 = (h.b) arrayList9.get(0)) != null) {
                                        str9 = bVar9.f4929a;
                                    } else {
                                        str9 = null;
                                    }
                                    robertoTextView.setText(str9);
                                } else {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setVisibility(0);
                                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1);
                                    if (z10) {
                                        if (dVar != null && (cVar8 = dVar.f4934b) != null && (arrayList8 = cVar8.f4932a) != null && (bVar7 = (h.b) arrayList8.get(2)) != null) {
                                            str7 = bVar7.f4929a;
                                        }
                                        str7 = null;
                                    } else {
                                        if (dVar != null) {
                                            h.c cVar10 = dVar.f4934b;
                                            if (cVar10 != null) {
                                                ArrayList arrayList12 = cVar10.f4932a;
                                                if (arrayList12 != null) {
                                                    bVar7 = (h.b) arrayList12.get(1);
                                                }
                                            }
                                        }
                                        str7 = null;
                                    }
                                    robertoTextView2.setText(str7);
                                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext1)).getPaintFlags() | 16);
                                    RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice1);
                                    if (z10) {
                                        if (dVar != null && (cVar7 = dVar.f4934b) != null && (arrayList7 = cVar7.f4932a) != null && (bVar8 = (h.b) arrayList7.get(1)) != null) {
                                            str8 = bVar8.f4929a;
                                        }
                                        str8 = null;
                                    } else {
                                        if (dVar != null) {
                                            h.c cVar11 = dVar.f4934b;
                                            if (cVar11 != null) {
                                                ArrayList arrayList13 = cVar11.f4932a;
                                                if (arrayList13 != null) {
                                                    bVar8 = (h.b) arrayList13.get(0);
                                                }
                                            }
                                        }
                                        str8 = null;
                                    }
                                    robertoTextView3.setText(str8);
                                }
                            }
                        } else if (str10.equals(Constants.SUBSCRIPTION_BASIC_2)) {
                            if (!z10 && !z11) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setVisibility(8);
                                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice2);
                                if (dVar != null && (cVar6 = dVar.f4934b) != null && (arrayList6 = cVar6.f4932a) != null && (bVar6 = (h.b) arrayList6.get(0)) != null) {
                                    str6 = bVar6.f4929a;
                                } else {
                                    str6 = null;
                                }
                                robertoTextView4.setText(str6);
                            } else {
                                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setVisibility(0);
                                RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2);
                                if (z10) {
                                    if (dVar != null && (cVar5 = dVar.f4934b) != null && (arrayList5 = cVar5.f4932a) != null && (bVar4 = (h.b) arrayList5.get(2)) != null) {
                                        str4 = bVar4.f4929a;
                                    }
                                    str4 = null;
                                } else {
                                    if (dVar != null) {
                                        h.c cVar12 = dVar.f4934b;
                                        if (cVar12 != null) {
                                            ArrayList arrayList14 = cVar12.f4932a;
                                            if (arrayList14 != null) {
                                                bVar4 = (h.b) arrayList14.get(1);
                                            }
                                        }
                                    }
                                    str4 = null;
                                }
                                robertoTextView5.setText(str4);
                                ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext2)).getPaintFlags() | 16);
                                RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice2);
                                if (z10) {
                                    if (dVar != null && (cVar4 = dVar.f4934b) != null && (arrayList4 = cVar4.f4932a) != null && (bVar5 = (h.b) arrayList4.get(1)) != null) {
                                        str5 = bVar5.f4929a;
                                    }
                                    str5 = null;
                                } else {
                                    if (dVar != null) {
                                        h.c cVar13 = dVar.f4934b;
                                        if (cVar13 != null) {
                                            ArrayList arrayList15 = cVar13.f4932a;
                                            if (arrayList15 != null) {
                                                bVar5 = (h.b) arrayList15.get(0);
                                            }
                                        }
                                    }
                                    str5 = null;
                                }
                                robertoTextView6.setText(str5);
                            }
                        }
                    } else if (str10.equals(Constants.SUBSCRIPTION_BASIC_3)) {
                        if (!z10 && !z11) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setVisibility(8);
                            RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice3);
                            if (arrayList11 != null && (dVar2 = (h.d) arrayList11.get(0)) != null && (cVar3 = dVar2.f4934b) != null && (arrayList3 = cVar3.f4932a) != null && (bVar3 = (h.b) arrayList3.get(0)) != null) {
                                str3 = bVar3.f4929a;
                            } else {
                                str3 = null;
                            }
                            robertoTextView7.setText(str3);
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setVisibility(0);
                            RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3);
                            if (z10) {
                                if (dVar != null && (cVar2 = dVar.f4934b) != null && (arrayList2 = cVar2.f4932a) != null && (bVar = (h.b) arrayList2.get(2)) != null) {
                                    str = bVar.f4929a;
                                }
                                str = null;
                            } else {
                                if (dVar != null) {
                                    h.c cVar14 = dVar.f4934b;
                                    if (cVar14 != null) {
                                        ArrayList arrayList16 = cVar14.f4932a;
                                        if (arrayList16 != null) {
                                            bVar = (h.b) arrayList16.get(1);
                                        }
                                    }
                                }
                                str = null;
                            }
                            robertoTextView8.setText(str);
                            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtext3)).getPaintFlags() | 16);
                            RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePrice3);
                            if (z10) {
                                if (dVar != null && (cVar = dVar.f4934b) != null && (arrayList = cVar.f4932a) != null && (bVar2 = (h.b) arrayList.get(1)) != null) {
                                    str2 = bVar2.f4929a;
                                }
                                str2 = null;
                            } else {
                                if (dVar != null) {
                                    h.c cVar15 = dVar.f4934b;
                                    if (cVar15 != null) {
                                        ArrayList arrayList17 = cVar15.f4932a;
                                        if (arrayList17 != null) {
                                            bVar2 = (h.b) arrayList17.get(0);
                                        }
                                    }
                                }
                                str2 = null;
                            }
                            robertoTextView9.setText(str2);
                        }
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemeType1)).setText("Monthly");
                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemeType2)).setText("Quarterly");
                    ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemeType3)).setText("Annual");
                    RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeTrialTag);
                    if (!this.H.isEmpty()) {
                        i6 = 8;
                    }
                    robertoTextView10.setVisibility(i6);
                }
                return;
            }
            kotlin.jvm.internal.i.q("productDetailsList");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26498u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_basic_monetization, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.K.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity");
        this.f26500w = (MonetizationActivity) requireActivity;
        Object systemService = K().getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f26499v = (LayoutInflater) systemService;
        androidx.fragment.app.p requireActivity2 = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
        MonetizationViewModel monetizationViewModel = (MonetizationViewModel) new androidx.lifecycle.o0(requireActivity2).a(MonetizationViewModel.class);
        kotlin.jvm.internal.i.g(monetizationViewModel, "<set-?>");
        this.J = monetizationViewModel;
        MonetizationViewModel M = M();
        M.j().e(getViewLifecycleOwner(), new gn.l(27, new i(this)));
        M.i().e(getViewLifecycleOwner(), new gn.l(28, new j(this)));
        M.h().e(getViewLifecycleOwner(), new gn.l(29, new m(M, this)));
    }

    /* compiled from: BasicMonetizationFragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f26506a;

        public b(int i6) {
            this.f26506a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            if (i6 > 5) {
                i6 %= 6;
            }
            int i10 = h.L;
            h.this.I(i6, this.f26506a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
