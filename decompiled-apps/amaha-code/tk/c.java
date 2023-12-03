package tk;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Timer;
import kotlin.Metadata;
import kotlinx.coroutines.e0;
import tk.c;
/* compiled from: CommunityEntryPointFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltk/c;", "Lrr/b;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rr.b {
    public static final /* synthetic */ int J = 0;
    public Boolean C;
    public boolean E;
    public el.b F;
    public int G;
    public xk.a H;

    /* renamed from: v  reason: collision with root package name */
    public yk.e f33172v;

    /* renamed from: w  reason: collision with root package name */
    public int f33173w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f33174x;
    public final LinkedHashMap I = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f33171u = LogHelper.INSTANCE.makeLogTag("CommunityVariantFragment");

    /* renamed from: y  reason: collision with root package name */
    public Timer f33175y = new Timer();

    /* renamed from: z  reason: collision with root package name */
    public String f33176z = "";
    public String A = "";
    public final String B = e0.n();
    public ArrayList<String> D = new ArrayList<>();

    /* compiled from: CommunityEntryPointFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e<C0549a> {

        /* renamed from: x  reason: collision with root package name */
        public final boolean f33177x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f33178y;

        /* compiled from: CommunityEntryPointFragment.kt */
        /* renamed from: tk.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0549a extends RecyclerView.c0 {
            public C0549a(View view) {
                super(view);
            }
        }

        public a(boolean z10, boolean z11) {
            this.f33177x = z10;
            this.f33178y = z11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return 4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int h(int i6) {
            if (i6 == 3) {
                return 1;
            }
            return 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(C0549a c0549a, final int i6) {
            String string;
            int i10;
            TextView textView;
            TextView textView2;
            AppCompatImageView appCompatImageView;
            View findViewById;
            View view = c0549a.f2751a;
            if (i6 == 3) {
                TextView textView3 = (TextView) view.findViewById(R.id.tvCardV2Title);
                if (textView3 != null) {
                    textView3.setText(view.getContext().getString(R.string.community_card_V2_title4));
                }
                View findViewById2 = view.findViewById(R.id.clCardV2ContainerType2);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new View.OnClickListener() { // from class: tk.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            String str;
                            String str2;
                            String str3;
                            String str4;
                            int i11 = r3;
                            int i12 = i6;
                            c.a this$0 = this;
                            switch (i11) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    String str5 = gk.a.f16573a;
                                    Bundle f = defpackage.e.f("variant", "variant_b", "experiment", "comm_acquisition");
                                    User f2 = defpackage.b.f(f, "platform", "android_app");
                                    if (f2 != null) {
                                        str3 = f2.getCurrentCourseName();
                                    } else {
                                        str3 = null;
                                    }
                                    User f10 = defpackage.b.f(f, "domain", str3);
                                    if (f10 != null) {
                                        str4 = f10.getCurrentCourseName();
                                    } else {
                                        str4 = null;
                                    }
                                    f.putString("course", str4);
                                    f.putInt("carousel_view_card", i12 + 1);
                                    f.putBoolean("onboarding_completed", this$0.f33177x);
                                    f.putBoolean("group_joined", this$0.f33178y);
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(f, "comm_db_carousel_post_click");
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    String str6 = gk.a.f16573a;
                                    Bundle f11 = defpackage.e.f("variant", "variant_b", "experiment", "comm_acquisition");
                                    User f12 = defpackage.b.f(f11, "platform", "android_app");
                                    if (f12 != null) {
                                        str = f12.getCurrentCourseName();
                                    } else {
                                        str = null;
                                    }
                                    User f13 = defpackage.b.f(f11, "domain", str);
                                    if (f13 != null) {
                                        str2 = f13.getCurrentCourseName();
                                    } else {
                                        str2 = null;
                                    }
                                    f11.putString("course", str2);
                                    f11.putInt("carousel_view_card", i12 + 1);
                                    f11.putBoolean("onboarding_completed", this$0.f33177x);
                                    f11.putBoolean("group_joined", this$0.f33178y);
                                    hs.k kVar2 = hs.k.f19476a;
                                    gk.a.b(f11, "comm_db_carousel_post_click");
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            String str = "";
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        string = "";
                    } else {
                        string = view.getContext().getString(R.string.community_card_V2_title3);
                    }
                } else {
                    string = view.getContext().getString(R.string.community_card_V2_title2);
                }
            } else {
                string = view.getContext().getString(R.string.community_card_V2_title1);
            }
            kotlin.jvm.internal.i.f(string, "when (position) {\n      …e -> \"\"\n                }");
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        str = view.getContext().getString(R.string.community_card_V2_description3);
                    }
                } else {
                    str = view.getContext().getString(R.string.community_card_V2_description2);
                }
            } else {
                str = view.getContext().getString(R.string.community_card_V2_description1);
            }
            kotlin.jvm.internal.i.f(str, "when (position) {\n      …e -> \"\"\n                }");
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        i10 = R.drawable.ic_community_v2_image3;
                    }
                } else {
                    i10 = R.drawable.ic_community_v2_image2;
                }
                textView = (TextView) view.findViewById(R.id.tvCardV2Title);
                if (textView != null) {
                    textView.setText(string);
                }
                textView2 = (TextView) view.findViewById(R.id.tvCardV2Description);
                if (textView2 != null) {
                    textView2.setText(str);
                }
                appCompatImageView = (AppCompatImageView) view.findViewById(R.id.civCardV2Image);
                if (appCompatImageView != null) {
                    Glide.g(view.getContext()).o(Integer.valueOf(i10)).B(appCompatImageView);
                }
                findViewById = view.findViewById(R.id.clCardV2ContainerType1);
                if (findViewById == null) {
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: tk.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            String str2;
                            String str22;
                            String str3;
                            String str4;
                            int i11 = r3;
                            int i12 = i6;
                            c.a this$0 = this;
                            switch (i11) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    String str5 = gk.a.f16573a;
                                    Bundle f = defpackage.e.f("variant", "variant_b", "experiment", "comm_acquisition");
                                    User f2 = defpackage.b.f(f, "platform", "android_app");
                                    if (f2 != null) {
                                        str3 = f2.getCurrentCourseName();
                                    } else {
                                        str3 = null;
                                    }
                                    User f10 = defpackage.b.f(f, "domain", str3);
                                    if (f10 != null) {
                                        str4 = f10.getCurrentCourseName();
                                    } else {
                                        str4 = null;
                                    }
                                    f.putString("course", str4);
                                    f.putInt("carousel_view_card", i12 + 1);
                                    f.putBoolean("onboarding_completed", this$0.f33177x);
                                    f.putBoolean("group_joined", this$0.f33178y);
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(f, "comm_db_carousel_post_click");
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    String str6 = gk.a.f16573a;
                                    Bundle f11 = defpackage.e.f("variant", "variant_b", "experiment", "comm_acquisition");
                                    User f12 = defpackage.b.f(f11, "platform", "android_app");
                                    if (f12 != null) {
                                        str2 = f12.getCurrentCourseName();
                                    } else {
                                        str2 = null;
                                    }
                                    User f13 = defpackage.b.f(f11, "domain", str2);
                                    if (f13 != null) {
                                        str22 = f13.getCurrentCourseName();
                                    } else {
                                        str22 = null;
                                    }
                                    f11.putString("course", str22);
                                    f11.putInt("carousel_view_card", i12 + 1);
                                    f11.putBoolean("onboarding_completed", this$0.f33177x);
                                    f11.putBoolean("group_joined", this$0.f33178y);
                                    hs.k kVar2 = hs.k.f19476a;
                                    gk.a.b(f11, "comm_db_carousel_post_click");
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            i10 = R.drawable.ic_community_v2_image1;
            textView = (TextView) view.findViewById(R.id.tvCardV2Title);
            if (textView != null) {
            }
            textView2 = (TextView) view.findViewById(R.id.tvCardV2Description);
            if (textView2 != null) {
            }
            appCompatImageView = (AppCompatImageView) view.findViewById(R.id.civCardV2Image);
            if (appCompatImageView != null) {
            }
            findViewById = view.findViewById(R.id.clCardV2ContainerType1);
            if (findViewById == null) {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView parent) {
            int i10;
            kotlin.jvm.internal.i.g(parent, "parent");
            LayoutInflater from = LayoutInflater.from(parent.getContext());
            if (i6 == 1) {
                i10 = R.layout.layout_community_v2_card_type2_item;
            } else {
                i10 = R.layout.layout_community_v2_card_type1_item;
            }
            View inflate = from.inflate(i10, (ViewGroup) parent, false);
            kotlin.jvm.internal.i.f(inflate, "from(parent.context).inf…      false\n            )");
            return new C0549a(inflate);
        }
    }

    /* compiled from: CommunityEntryPointFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Context, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Context context) {
            Context checkIfFragmentAttached = context;
            kotlin.jvm.internal.i.g(checkIfFragmentAttached, "$this$checkIfFragmentAttached");
            p.a aVar = new p.a(checkIfFragmentAttached);
            c cVar = c.this;
            aVar.a(R.layout.communities_experiment_layout_existing, (ViewGroup) cVar.requireView().findViewById(R.id.llCommunityVariantContainer), new d(cVar, 0));
            return hs.k.f19476a;
        }
    }

    public static final void J(c cVar, int i6) {
        LinearLayout linearLayout;
        View childAt;
        cVar.getClass();
        if (i6 != -1) {
            try {
                FrameLayout frameLayout = (FrameLayout) cVar.requireView().findViewById(R.id.llCommunityVariantContainer);
                if (frameLayout != null && (childAt = frameLayout.getChildAt(0)) != null) {
                    linearLayout = (LinearLayout) childAt.findViewById(R.id.llCardV2);
                } else {
                    linearLayout = null;
                }
                if (linearLayout != null) {
                    View[] viewArr = new View[4];
                    linearLayout.removeAllViews();
                    for (int i10 = 0; i10 < 4; i10++) {
                        View inflate = cVar.getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) linearLayout, false);
                        viewArr[i10] = inflate;
                        kotlin.jvm.internal.i.d(inflate);
                        Context requireContext = cVar.requireContext();
                        Object obj = g0.a.f16164a;
                        inflate.setBackground(a.c.b(requireContext, R.drawable.circle_filled_white));
                        linearLayout.addView(viewArr[i10]);
                    }
                    View view = viewArr[i6];
                    kotlin.jvm.internal.i.d(view);
                    Context requireContext2 = cVar.requireContext();
                    Object obj2 = g0.a.f16164a;
                    view.setBackground(a.c.b(requireContext2, R.drawable.thumb));
                    View view2 = viewArr[i6];
                    kotlin.jvm.internal.i.d(view2);
                    view2.setBackgroundTintList(g0.a.c(R.color.brickTerracota, cVar.requireContext()));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
        }
    }

    public final void K(ss.l<? super Context, hs.k> lVar) {
        if (isAdded() && getContext() != null) {
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            lVar.invoke(requireContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        FrameLayout frameLayout;
        boolean z10;
        androidx.lifecycle.w<vk.a> wVar;
        vk.a d10;
        ArrayList<vk.b> a10;
        boolean z11;
        String str;
        yk.e eVar;
        androidx.lifecycle.w<vk.a> wVar2;
        vk.a d11;
        ArrayList<vk.b> a11;
        yk.e eVar2;
        androidx.lifecycle.w<vk.a> wVar3;
        vk.a d12;
        ArrayList<vk.b> a12;
        if (getView() != null && (frameLayout = (FrameLayout) requireView().findViewById(R.id.llCommunityVariantContainer)) != null && defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") && kotlin.jvm.internal.i.b(this.C, Boolean.FALSE) && kotlin.jvm.internal.i.b(this.B, "variant_d") && frameLayout.getChildCount() > 0) {
            if (this.f33176z.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object obj = null;
            if (z10) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2114782937:
                            if (!str.equals(Constants.COURSE_HAPPINESS)) {
                                return;
                            }
                            eVar2 = this.f33172v;
                            if (eVar2 == null && (wVar3 = eVar2.A) != null && (d12 = wVar3.d()) != null && (a12 = d12.a()) != null) {
                                Iterator<T> it = a12.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (kotlin.jvm.internal.i.b(((vk.b) next).c(), "coping-with-anxiety")) {
                                            obj = next;
                                        }
                                    }
                                }
                                vk.b bVar = (vk.b) obj;
                                if (bVar != null) {
                                    View findViewById = frameLayout.findViewById(R.id.tvCardV4DomainName);
                                    kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                    ((RobertoTextView) findViewById).setText(bVar.b());
                                    com.bumptech.glide.e<Bitmap> a13 = Glide.g(requireContext()).a();
                                    a13.Z = bVar.a();
                                    a13.f5953b0 = true;
                                    View findViewById2 = frameLayout.findViewById(R.id.ivCardV4DomainImage);
                                    kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                                    a13.B((AppCompatImageView) findViewById2);
                                    return;
                                }
                                return;
                            }
                            return;
                        case -1617042330:
                            if (!str.equals(Constants.COURSE_DEPRESSION)) {
                                return;
                            }
                            eVar = this.f33172v;
                            if (eVar == null && (wVar2 = eVar.A) != null && (d11 = wVar2.d()) != null && (a11 = d11.a()) != null) {
                                Iterator<T> it2 = a11.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        if (kotlin.jvm.internal.i.b(((vk.b) next2).c(), "living-with-depression")) {
                                            obj = next2;
                                        }
                                    }
                                }
                                vk.b bVar2 = (vk.b) obj;
                                if (bVar2 != null) {
                                    View findViewById3 = frameLayout.findViewById(R.id.tvCardV4DomainName);
                                    kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                    ((RobertoTextView) findViewById3).setText(bVar2.b());
                                    com.bumptech.glide.e<Bitmap> a14 = Glide.g(requireContext()).a();
                                    a14.Z = bVar2.a();
                                    a14.f5953b0 = true;
                                    View findViewById4 = frameLayout.findViewById(R.id.ivCardV4DomainImage);
                                    kotlin.jvm.internal.i.e(findViewById4, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                                    a14.B((AppCompatImageView) findViewById4);
                                    return;
                                }
                                return;
                            }
                            return;
                        case -891989580:
                            if (!str.equals(Constants.COURSE_STRESS)) {
                                return;
                            }
                            eVar2 = this.f33172v;
                            if (eVar2 == null) {
                                return;
                            }
                            return;
                        case 92960775:
                            if (!str.equals(Constants.COURSE_ANGER)) {
                                return;
                            }
                            eVar2 = this.f33172v;
                            if (eVar2 == null) {
                            }
                            break;
                        case 109522647:
                            if (!str.equals(Constants.COURSE_SLEEP)) {
                                return;
                            }
                            eVar = this.f33172v;
                            if (eVar == null) {
                                return;
                            }
                            return;
                        case 113319009:
                            if (!str.equals(Constants.COURSE_WORRY)) {
                                return;
                            }
                            eVar2 = this.f33172v;
                            if (eVar2 == null) {
                            }
                            break;
                        default:
                            return;
                    }
                }
            } else {
                yk.e eVar3 = this.f33172v;
                if (eVar3 != null && (wVar = eVar3.A) != null && (d10 = wVar.d()) != null && (a10 = d10.a()) != null) {
                    Iterator<T> it3 = a10.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        if (kotlin.jvm.internal.i.b(((vk.b) next3).b(), this.f33176z)) {
                            obj = next3;
                            break;
                        }
                    }
                    vk.b bVar3 = (vk.b) obj;
                    if (bVar3 != null) {
                        View findViewById5 = frameLayout.findViewById(R.id.tvCardV4DomainName);
                        kotlin.jvm.internal.i.e(findViewById5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        RobertoTextView robertoTextView = (RobertoTextView) findViewById5;
                        String valueOf = String.valueOf(bVar3.b());
                        if (valueOf.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            StringBuilder sb2 = new StringBuilder();
                            String valueOf2 = String.valueOf(valueOf.charAt(0));
                            kotlin.jvm.internal.i.e(valueOf2, "null cannot be cast to non-null type java.lang.String");
                            String upperCase = valueOf2.toUpperCase(Locale.ROOT);
                            kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            sb2.append((Object) upperCase);
                            String substring = valueOf.substring(1);
                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                            sb2.append(substring);
                            valueOf = sb2.toString();
                        }
                        robertoTextView.setText(valueOf);
                        com.bumptech.glide.e<Bitmap> a15 = Glide.g(requireContext()).a();
                        a15.Z = bVar3.a();
                        a15.f5953b0 = true;
                        View findViewById6 = frameLayout.findViewById(R.id.ivCardV4DomainImage);
                        kotlin.jvm.internal.i.e(findViewById6, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                        a15.B((AppCompatImageView) findViewById6);
                    }
                }
            }
        }
    }

    public final void O(ArrayList<String> newList) {
        RecyclerView.e eVar;
        boolean z10;
        View childAt;
        RecyclerView recyclerView;
        kotlin.jvm.internal.i.g(newList, "newList");
        try {
            this.D = newList;
            FrameLayout frameLayout = (FrameLayout) requireView().findViewById(R.id.llCommunityVariantContainer);
            a aVar = null;
            boolean z11 = false;
            if (frameLayout != null && (childAt = frameLayout.getChildAt(0)) != null && (recyclerView = (RecyclerView) childAt.findViewById(R.id.rvCardV2)) != null) {
                eVar = recyclerView.getAdapter();
            } else {
                eVar = null;
            }
            if (eVar instanceof a) {
                aVar = eVar;
            }
            if (aVar != null) {
                if (!newList.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.f33178y = z10;
            }
            el.b bVar = this.F;
            if (bVar != null) {
                if (!newList.isEmpty()) {
                    z11 = true;
                }
                bVar.f14373z = z11;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33171u, e10);
        }
    }

    public final void P(boolean z10) {
        Boolean bool = this.C;
        if (bool != null && kotlin.jvm.internal.i.b(bool, Boolean.valueOf(z10))) {
            return;
        }
        this.C = Boolean.valueOf(z10);
        FrameLayout frameLayout = (FrameLayout) requireView().findViewById(R.id.llCommunityVariantContainer);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        boolean u10 = defpackage.b.u(SessionManager.KEY_USERTYPE, "patient");
        String str = this.f33171u;
        if (!u10) {
            if (this.E) {
                try {
                    K(new u(this, this.D));
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, "Community B2BViewForNotV4Dashboard exception", e10);
                    return;
                }
            }
            try {
                K(new w(this, this.D));
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str, "Community B2BViewForV3Dashboard exception", e11);
            }
        } else if (!z10) {
            String str2 = this.B;
            switch (str2.hashCode()) {
                case -82112729:
                    if (str2.equals("variant_a")) {
                        try {
                            K(new f(this));
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(str, "Community Card 1 creation exception", e12);
                            return;
                        }
                    }
                    return;
                case -82112728:
                    if (str2.equals("variant_b")) {
                        try {
                            K(new k(this));
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(str, "Community Card 2 creation exception", e13);
                            return;
                        }
                    }
                    return;
                case -82112727:
                    if (str2.equals("variant_c")) {
                        this.f33172v = (yk.e) new o0(this, new ok.c(new kc.f())).a(yk.e.class);
                        try {
                            K(new p(this));
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(str, "Community Card 3 creation exception", e14);
                            return;
                        }
                    }
                    return;
                case -82112726:
                    if (str2.equals("variant_d")) {
                        this.f33172v = (yk.e) new o0(this, new ok.c(new kc.f())).a(yk.e.class);
                        try {
                            K(new t(this));
                            return;
                        } catch (Exception e15) {
                            LogHelper.INSTANCE.e(str, "Community card 4 creation exception", e15);
                            return;
                        }
                    }
                    return;
                default:
                    return;
            }
        } else {
            try {
                K(new b());
            } catch (Exception e16) {
                LogHelper.INSTANCE.e(str, "refresh communities exception", e16);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof xk.a) {
            this.H = (xk.a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_community_variant, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Timer timer = this.f33175y;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.f33175y;
        if (timer2 != null) {
            timer2.purge();
        }
        this.f33175y = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.I.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList = arguments.getStringArrayList("communities_joined_list");
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.D = arrayList;
        Bundle arguments2 = getArguments();
        boolean z12 = false;
        if (arguments2 != null) {
            z10 = arguments2.getBoolean("onboarding_complete", false);
        } else {
            z10 = false;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z11 = arguments3.getBoolean("isNotV4User", false);
        } else {
            z11 = false;
        }
        this.E = z11;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && arguments4.getBoolean("stop_auto_init", false)) {
            z12 = true;
        }
        if (!z12) {
            P(z10);
        }
    }
}
