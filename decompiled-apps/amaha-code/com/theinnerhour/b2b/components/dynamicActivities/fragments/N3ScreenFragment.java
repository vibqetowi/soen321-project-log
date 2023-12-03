package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.n;
import gv.r;
import hs.f;
import is.u;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ol.h;
import ol.j;
import ol.m;
import pl.h0;
import pl.i0;
import pl.j0;
import pl.k0;
import pl.l0;
import pl.n0;
import pl.p0;
import ql.t;
import ql.x;
import ri.e;
import ss.l;
import ta.v;
/* compiled from: N3ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N3ScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N3ScreenFragment extends rr.d {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11052w = LogHelper.INSTANCE.makeLogTag("N3ScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f11053x = b0.j(this, y.a(t.class), new b(this), new c(this), new d(this));

    /* renamed from: y  reason: collision with root package name */
    public String f11054y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f11055z;

    /* compiled from: N3ScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<SingleUseEvent<? extends List<? extends HashMap<String, Object>>>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends List<? extends HashMap<String, Object>>> singleUseEvent) {
            String str;
            List<? extends HashMap<String, Object>> contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            N3ScreenFragment n3ScreenFragment = N3ScreenFragment.this;
            if (contentIfNotHandled != null) {
                int i6 = N3ScreenFragment.B;
                t P = n3ScreenFragment.P();
                String str2 = n3ScreenFragment.f11054y;
                i.d(str2);
                Integer num = n3ScreenFragment.f11055z;
                i.d(num);
                Object k10 = P.k(num.intValue(), str2, "display_type");
                if (k10 instanceof String) {
                    str = (String) k10;
                } else {
                    str = null;
                }
                n3ScreenFragment.Q(str, contentIfNotHandled);
            }
            int i10 = N3ScreenFragment.B;
            n3ScreenFragment.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new i0(n3ScreenFragment, 0), 500L);
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11057u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11057u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11057u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11058u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11058u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11058u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11059u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11059u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11059u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.b
    public final boolean I() {
        String str;
        String string;
        try {
            Bundle arguments = getArguments();
            WindowManager.LayoutParams layoutParams = null;
            if (arguments != null && (string = arguments.getString("slug")) != null) {
                Locale ENGLISH = Locale.ENGLISH;
                i.f(ENGLISH, "ENGLISH");
                str = string.toLowerCase(ENGLISH);
                i.f(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (i.b(str, "n3z")) {
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_new_dynamic_exit, requireActivity(), R.style.Theme_Dialog);
                Window window = styledDialog.getWindow();
                if (window != null) {
                    layoutParams = window.getAttributes();
                }
                if (layoutParams != null) {
                    layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                }
                RobertoTextView robertoTextView = (RobertoTextView) styledDialog.findViewById(R.id.yes);
                if (robertoTextView != null) {
                    robertoTextView.setOnClickListener(new h0(this, 1));
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog.findViewById(R.id.f39931no);
                if (robertoTextView2 != null) {
                    robertoTextView2.setOnClickListener(new n(styledDialog, 19));
                }
                styledDialog.show();
                return false;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11052w, "exception", e10);
        }
        return true;
    }

    @Override // rr.d
    public final void K() {
        NewDynamicParentActivity newDynamicParentActivity;
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            int i6 = NewDynamicParentActivity.F;
            newDynamicParentActivity.L0(false);
        }
    }

    public final t P() {
        return (t) this.f11053x.getValue();
    }

    public final void Q(String str, List list) {
        Object obj;
        ArrayList<HashMap> arrayList;
        HashMap hashMap;
        int i6;
        String str2;
        int i10;
        String str3;
        HashMap hashMap2;
        HashMap hashMap3;
        ArrayList<HashMap> arrayList2;
        ArrayList arrayList3;
        int i11;
        String str4;
        int i12;
        String str5;
        f fVar;
        HashMap hashMap4;
        Object obj2;
        ArrayList<String> arrayList4;
        ArrayList arrayList5;
        HashMap hashMap5;
        Object obj3;
        Long l2;
        long j10;
        N12AItemListModel n12AItemListModel;
        Object obj4;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i13;
        String str22;
        int i14;
        String str23;
        HashMap hashMap6;
        ArrayList arrayList8;
        int i15;
        String str24;
        int i16;
        String str25;
        HashMap hashMap7;
        if (list == null) {
            return;
        }
        try {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvN3LogList);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            }
            HashMap m10 = P().m(this.f11055z, this.f11054y);
            HashMap m11 = P().m(this.f11055z, this.f11054y);
            if (m11 != null) {
                obj = m11.get("display_population_data");
            } else {
                obj = null;
            }
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (str != null) {
                String str26 = "";
                switch (str.hashCode()) {
                    case -433452256:
                        if (str.equals("free_text")) {
                            if (arrayList != null && (hashMap = (HashMap) u.i2(arrayList)) != null) {
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj5 : list) {
                                    if ((obj5 instanceof HashMap) && (obj5 instanceof HashMap)) {
                                        hashMap2 = (HashMap) obj5;
                                    } else {
                                        hashMap2 = null;
                                    }
                                    if (hashMap2 != null) {
                                        arrayList9.add(hashMap2);
                                    }
                                }
                                List D2 = u.D2(arrayList9, new j0());
                                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvN3LogList);
                                if (recyclerView2 == null) {
                                    break;
                                } else {
                                    t P = P();
                                    String str27 = this.f11054y;
                                    if (str27 == null) {
                                        str27 = "";
                                    }
                                    Integer num = this.f11055z;
                                    if (num != null) {
                                        i6 = num.intValue();
                                    } else {
                                        i6 = -1;
                                    }
                                    Object k10 = P.k(i6, str27, "card_heading");
                                    if (k10 instanceof String) {
                                        str2 = (String) k10;
                                    } else {
                                        str2 = null;
                                    }
                                    t P2 = P();
                                    String str28 = this.f11054y;
                                    if (str28 != null) {
                                        str26 = str28;
                                    }
                                    Integer num2 = this.f11055z;
                                    if (num2 != null) {
                                        i10 = num2.intValue();
                                    } else {
                                        i10 = -1;
                                    }
                                    Object k11 = P2.k(i10, str26, "card_cta");
                                    if (k11 instanceof String) {
                                        str3 = (String) k11;
                                    } else {
                                        str3 = null;
                                    }
                                    recyclerView2.setAdapter(new ol.i(D2, str2, str3, (String) hashMap.get("item_save_key"), (ZoneOffset) P().f29790z.f16400v, new n0(this, list)));
                                    break;
                                }
                            }
                            return;
                        }
                        break;
                        break;
                    case 1087569232:
                        if (str.equals("bullet_points_user_selected")) {
                            if (arrayList != null && (hashMap3 = (HashMap) u.i2(arrayList)) != null) {
                                t P3 = P();
                                String str29 = (String) hashMap3.get("screen_id");
                                if (str29 == null) {
                                    str29 = "";
                                }
                                String str30 = (String) hashMap3.get("screen_data_slug");
                                if (str30 == null) {
                                    str30 = "";
                                }
                                Object l10 = P3.l(str29, str30);
                                if (l10 instanceof ArrayList) {
                                    arrayList2 = (ArrayList) l10;
                                } else {
                                    arrayList2 = null;
                                }
                                if (arrayList2 != null) {
                                    arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
                                    for (HashMap hashMap8 : arrayList2) {
                                        Object obj6 = hashMap8.get("option_id");
                                        if (obj6 instanceof String) {
                                            str6 = (String) obj6;
                                        } else {
                                            str6 = null;
                                        }
                                        if (str6 == null) {
                                            str7 = "";
                                        } else {
                                            str7 = str6;
                                        }
                                        Object obj7 = hashMap8.get("option_title");
                                        if (obj7 instanceof String) {
                                            str8 = (String) obj7;
                                        } else {
                                            str8 = null;
                                        }
                                        if (str8 == null) {
                                            str9 = "";
                                        } else {
                                            str9 = str8;
                                        }
                                        Object obj8 = hashMap8.get("option_description");
                                        if (obj8 instanceof String) {
                                            str10 = (String) obj8;
                                        } else {
                                            str10 = null;
                                        }
                                        if (str10 == null) {
                                            str11 = "";
                                        } else {
                                            str11 = str10;
                                        }
                                        Object obj9 = hashMap8.get("option_image_title");
                                        if (obj9 instanceof String) {
                                            str12 = (String) obj9;
                                        } else {
                                            str12 = null;
                                        }
                                        if (str12 == null) {
                                            str13 = "";
                                        } else {
                                            str13 = str12;
                                        }
                                        Object obj10 = hashMap8.get("option_image");
                                        if (obj10 instanceof String) {
                                            str14 = (String) obj10;
                                        } else {
                                            str14 = null;
                                        }
                                        if (str14 == null) {
                                            str15 = "";
                                        } else {
                                            str15 = str14;
                                        }
                                        Object obj11 = hashMap8.get("option_example_title");
                                        if (obj11 instanceof String) {
                                            str16 = (String) obj11;
                                        } else {
                                            str16 = null;
                                        }
                                        if (str16 == null) {
                                            str17 = "";
                                        } else {
                                            str17 = str16;
                                        }
                                        Object obj12 = hashMap8.get("option_example_body");
                                        if (obj12 instanceof String) {
                                            str18 = (String) obj12;
                                        } else {
                                            str18 = null;
                                        }
                                        if (str18 == null) {
                                            str19 = "";
                                        } else {
                                            str19 = str18;
                                        }
                                        Object obj13 = hashMap8.get("option_card_title");
                                        if (obj13 instanceof String) {
                                            str20 = (String) obj13;
                                        } else {
                                            str20 = null;
                                        }
                                        if (str20 == null) {
                                            str21 = "";
                                        } else {
                                            str21 = str20;
                                        }
                                        Object obj14 = hashMap8.get("option_card_list");
                                        if (obj14 instanceof ArrayList) {
                                            arrayList6 = (ArrayList) obj14;
                                        } else {
                                            arrayList6 = null;
                                        }
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList3.add(new N12AItemListModel(str7, str9, str11, str13, str15, str17, str19, str21, arrayList6));
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj15 : list) {
                                    if (obj15 instanceof HashMap) {
                                        if (obj15 instanceof HashMap) {
                                            hashMap4 = (HashMap) obj15;
                                        } else {
                                            hashMap4 = null;
                                        }
                                        if (hashMap4 != null) {
                                            String str31 = (String) hashMap3.get("item_save_key");
                                            if (str31 == null) {
                                                str31 = "";
                                            }
                                            obj2 = hashMap4.get(str31);
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 instanceof ArrayList) {
                                            arrayList4 = (ArrayList) obj2;
                                        } else {
                                            arrayList4 = null;
                                        }
                                        if (arrayList4 != null) {
                                            arrayList5 = new ArrayList();
                                            for (String str32 : arrayList4) {
                                                if (arrayList3 != null) {
                                                    Iterator it = arrayList3.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            obj4 = it.next();
                                                            if (i.b(((N12AItemListModel) obj4).getId(), str32)) {
                                                            }
                                                        } else {
                                                            obj4 = null;
                                                        }
                                                    }
                                                    n12AItemListModel = (N12AItemListModel) obj4;
                                                } else {
                                                    n12AItemListModel = null;
                                                }
                                                if (n12AItemListModel != null) {
                                                    arrayList5.add(n12AItemListModel);
                                                }
                                            }
                                        } else {
                                            arrayList5 = null;
                                        }
                                        if (obj15 instanceof HashMap) {
                                            hashMap5 = (HashMap) obj15;
                                        } else {
                                            hashMap5 = null;
                                        }
                                        if (hashMap5 != null) {
                                            obj3 = hashMap5.get("date");
                                        } else {
                                            obj3 = null;
                                        }
                                        if (obj3 instanceof Long) {
                                            l2 = (Long) obj3;
                                        } else {
                                            l2 = null;
                                        }
                                        if (l2 != null) {
                                            j10 = l2.longValue();
                                        } else {
                                            j10 = -1;
                                        }
                                        Long valueOf = Long.valueOf(j10);
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        fVar = new f(valueOf, arrayList5);
                                    } else {
                                        fVar = null;
                                    }
                                    if (fVar != null) {
                                        arrayList10.add(fVar);
                                    }
                                }
                                RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.rvN3LogList);
                                if (recyclerView3 == null) {
                                    break;
                                } else {
                                    List D22 = u.D2(arrayList10, new l0());
                                    t P4 = P();
                                    String str33 = this.f11054y;
                                    if (str33 == null) {
                                        str33 = "";
                                    }
                                    Integer num3 = this.f11055z;
                                    if (num3 != null) {
                                        i11 = num3.intValue();
                                    } else {
                                        i11 = -1;
                                    }
                                    Object k12 = P4.k(i11, str33, "card_heading");
                                    if (k12 instanceof String) {
                                        str4 = (String) k12;
                                    } else {
                                        str4 = null;
                                    }
                                    t P5 = P();
                                    String str34 = this.f11054y;
                                    if (str34 != null) {
                                        str26 = str34;
                                    }
                                    Integer num4 = this.f11055z;
                                    if (num4 != null) {
                                        i12 = num4.intValue();
                                    } else {
                                        i12 = -1;
                                    }
                                    Object k13 = P5.k(i12, str26, "card_cta");
                                    if (k13 instanceof String) {
                                        str5 = (String) k13;
                                    } else {
                                        str5 = null;
                                    }
                                    recyclerView3.setAdapter(new m(D22, str4, str5, (ZoneOffset) P().f29790z.f16400v, new p0(this, list)));
                                    break;
                                }
                            }
                            return;
                        }
                        break;
                    case 1591281698:
                        if (str.equals("bullet_points_user_entered")) {
                            if (arrayList != null) {
                                ArrayList arrayList11 = new ArrayList();
                                for (HashMap hashMap9 : arrayList) {
                                    String str35 = (String) hashMap9.get("item_save_key");
                                    if (str35 != null) {
                                        arrayList11.add(str35);
                                    }
                                }
                                arrayList7 = arrayList11;
                            } else {
                                arrayList7 = null;
                            }
                            ArrayList arrayList12 = new ArrayList();
                            for (Object obj16 : list) {
                                if ((obj16 instanceof HashMap) && (obj16 instanceof HashMap)) {
                                    hashMap6 = (HashMap) obj16;
                                } else {
                                    hashMap6 = null;
                                }
                                if (hashMap6 != null) {
                                    arrayList12.add(hashMap6);
                                }
                            }
                            List D23 = u.D2(arrayList12, new k0());
                            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.rvN3LogList);
                            if (recyclerView4 == null) {
                                break;
                            } else {
                                t P6 = P();
                                String str36 = this.f11054y;
                                if (str36 == null) {
                                    str36 = "";
                                }
                                Integer num5 = this.f11055z;
                                if (num5 != null) {
                                    i13 = num5.intValue();
                                } else {
                                    i13 = -1;
                                }
                                Object k14 = P6.k(i13, str36, "card_heading");
                                if (k14 instanceof String) {
                                    str22 = (String) k14;
                                } else {
                                    str22 = null;
                                }
                                t P7 = P();
                                String str37 = this.f11054y;
                                if (str37 != null) {
                                    str26 = str37;
                                }
                                Integer num6 = this.f11055z;
                                if (num6 != null) {
                                    i14 = num6.intValue();
                                } else {
                                    i14 = -1;
                                }
                                Object k15 = P7.k(i14, str26, "card_cta");
                                if (k15 instanceof String) {
                                    str23 = (String) k15;
                                } else {
                                    str23 = null;
                                }
                                recyclerView4.setAdapter(new h(D23, str22, str23, arrayList7, (ZoneOffset) P().f29790z.f16400v, new pl.o0(this, list)));
                                break;
                            }
                        } else {
                            break;
                        }
                    case 1685614741:
                        if (str.equals("free_text_with_footer")) {
                            if (arrayList != null) {
                                ArrayList arrayList13 = new ArrayList();
                                for (HashMap hashMap10 : arrayList) {
                                    String str38 = (String) hashMap10.get("item_save_key");
                                    if (str38 != null) {
                                        arrayList13.add(str38);
                                    }
                                }
                                arrayList8 = arrayList13;
                            } else {
                                arrayList8 = null;
                            }
                            ArrayList arrayList14 = new ArrayList();
                            for (Object obj17 : list) {
                                if ((obj17 instanceof HashMap) && (obj17 instanceof HashMap)) {
                                    hashMap7 = (HashMap) obj17;
                                } else {
                                    hashMap7 = null;
                                }
                                if (hashMap7 != null) {
                                    arrayList14.add(hashMap7);
                                }
                            }
                            List D24 = u.D2(arrayList14, new pl.m0());
                            RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(R.id.rvN3LogList);
                            if (recyclerView5 == null) {
                                break;
                            } else {
                                t P8 = P();
                                String str39 = this.f11054y;
                                if (str39 == null) {
                                    str39 = "";
                                }
                                Integer num7 = this.f11055z;
                                if (num7 != null) {
                                    i15 = num7.intValue();
                                } else {
                                    i15 = -1;
                                }
                                Object k16 = P8.k(i15, str39, "card_heading");
                                if (k16 instanceof String) {
                                    str24 = (String) k16;
                                } else {
                                    str24 = null;
                                }
                                t P9 = P();
                                String str40 = this.f11054y;
                                if (str40 != null) {
                                    str26 = str40;
                                }
                                Integer num8 = this.f11055z;
                                if (num8 != null) {
                                    i16 = num8.intValue();
                                } else {
                                    i16 = -1;
                                }
                                Object k17 = P9.k(i16, str26, "card_cta");
                                if (k17 instanceof String) {
                                    str25 = (String) k17;
                                } else {
                                    str25 = null;
                                }
                                recyclerView5.setAdapter(new j(D24, str24, str25, arrayList8, (ZoneOffset) P().f29790z.f16400v, new pl.q0(this, list)));
                                break;
                            }
                        } else {
                            break;
                        }
                        break;
                }
            }
            S(m10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11052w, "exception", e10);
        }
    }

    public final void S(HashMap<String, Object> hashMap) {
        Object obj;
        String str;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        int i6;
        Integer w02;
        Integer w03;
        Object obj2;
        String str2;
        NewDynamicParentActivity newDynamicParentActivity3 = null;
        if (hashMap != null) {
            try {
                obj = hashMap.get(Constants.SCREEN_PROGRESS);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11052w, "exception", e10);
                return;
            }
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            if (hashMap != null) {
                obj2 = hashMap.get("heading");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            newDynamicParentActivity.I0(str2);
        }
        if (str != null) {
            int i10 = 0;
            List a12 = r.a1(str, new String[]{"/"}, 0, 6);
            String str3 = (String) u.j2(0, a12);
            String str4 = (String) u.j2(1, a12);
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                newDynamicParentActivity2.M0();
            }
            p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
            }
            if (newDynamicParentActivity3 != null) {
                if (str3 != null && (w03 = gv.m.w0(str3)) != null) {
                    i6 = w03.intValue();
                } else {
                    i6 = 0;
                }
                if (str4 != null && (w02 = gv.m.w0(str4)) != null) {
                    i10 = w02.intValue();
                }
                newDynamicParentActivity3.G0(i6, i10);
                return;
            }
            return;
        }
        p requireActivity4 = requireActivity();
        if (requireActivity4 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity4;
        }
        if (newDynamicParentActivity3 != null) {
            newDynamicParentActivity3.y0();
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.A.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n3_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        String str2;
        String str3;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        NewDynamicParentActivity newDynamicParentActivity3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        i.g(view, "view");
        Bundle arguments = getArguments();
        String str7 = null;
        if (arguments != null) {
            str = arguments.getString("slug");
        } else {
            str = null;
        }
        this.f11054y = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num = Integer.valueOf(arguments2.getInt(Constants.DAYMODEL_POSITION));
        } else {
            num = null;
        }
        this.f11055z = num;
        if (sp.b.K()) {
            t P = P();
            P.getClass();
            v.H(kc.f.H(P), null, 0, new x(P, null), 3);
            P.f29782f0.e(getViewLifecycleOwner(), new hl.p(22, new a()));
        } else {
            if (this.f11054y != null && this.f11055z != null) {
                ArrayList<?> p10 = P().p();
                t P2 = P();
                String str8 = this.f11054y;
                i.d(str8);
                Integer num2 = this.f11055z;
                i.d(num2);
                Object k10 = P2.k(num2.intValue(), str8, "display_type");
                if (k10 instanceof String) {
                    str2 = (String) k10;
                } else {
                    str2 = null;
                }
                Q(str2, p10);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new i0(this, 0), 500L);
        }
        if (i.b(this.f11054y, "n3a")) {
            str3 = "cta1";
        } else {
            str3 = "cta2";
        }
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            t P3 = P();
            String str9 = this.f11054y;
            i.d(str9);
            Integer num3 = this.f11055z;
            i.d(num3);
            Object k11 = P3.k(num3.intValue(), str9, str3);
            if (k11 instanceof String) {
                str6 = (String) k11;
            } else {
                str6 = null;
            }
            NewDynamicParentActivity.F0(newDynamicParentActivity, str6, null, null, null, 14);
        }
        p requireActivity2 = requireActivity();
        if (requireActivity2 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
        } else {
            newDynamicParentActivity2 = null;
        }
        if (newDynamicParentActivity2 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str5 = arguments3.getString("cta_slug");
            } else {
                str5 = null;
            }
            newDynamicParentActivity2.E0(str5);
        }
        p requireActivity3 = requireActivity();
        if (requireActivity3 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
        } else {
            newDynamicParentActivity3 = null;
        }
        if (newDynamicParentActivity3 != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                bool = Boolean.valueOf(arguments4.getBoolean("show_info_button"));
            } else {
                bool = null;
            }
            newDynamicParentActivity3.O0(bool);
        }
        String str10 = this.f11054y;
        if (str10 != null) {
            Locale locale = Locale.ENGLISH;
            str4 = e.e(locale, "ENGLISH", str10, locale, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str4 = null;
        }
        if (i.b(str4, "n3a")) {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN3AddNewCta);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(8);
                return;
            }
            return;
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN3AddNewCta);
        if (robertoTextView2 != null) {
            t P4 = P();
            String str11 = this.f11054y;
            i.d(str11);
            Integer num4 = this.f11055z;
            i.d(num4);
            Object k12 = P4.k(num4.intValue(), str11, "cta1");
            if (k12 instanceof String) {
                str7 = (String) k12;
            }
            robertoTextView2.setText(str7);
        }
        RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN3AddNewCta);
        if (robertoTextView3 != null) {
            robertoTextView3.setOnClickListener(new h0(this, 0));
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
