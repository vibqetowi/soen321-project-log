package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N18AListModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.n;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import pl.f;
import pl.v;
import ql.t;
import ri.e;
import ss.l;
/* compiled from: N18BScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N18BScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N18BScreenFragment extends rr.d {

    /* renamed from: x  reason: collision with root package name */
    public N18AListModel f11003x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f11004y = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final m0 f11002w = b0.j(this, y.a(t.class), new b(this), new c(this), new d(this));

    /* compiled from: N18BScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<N18AListModel, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(N18AListModel n18AListModel) {
            RecyclerView.e eVar;
            N18AListModel model = n18AListModel;
            i.g(model, "model");
            N18BScreenFragment n18BScreenFragment = N18BScreenFragment.this;
            n18BScreenFragment.f11003x = model;
            RecyclerView recyclerView = (RecyclerView) n18BScreenFragment._$_findCachedViewById(R.id.rVN18BScreenTimeSelector);
            ol.d dVar = null;
            if (recyclerView != null) {
                eVar = recyclerView.getAdapter();
            } else {
                eVar = null;
            }
            if (eVar instanceof ol.d) {
                dVar = (ol.d) eVar;
            }
            if (dVar != null) {
                N18AListModel n18AListModel2 = n18BScreenFragment.f11003x;
                i.d(n18AListModel2);
                dVar.f27621z = n18AListModel2;
                dVar.i();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11006u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11006u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11006u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11007u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11007u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11007u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11008u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11008u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11008u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.d
    public final void K() {
        String str;
        String str2;
        int i6;
        int i10;
        String noOfLoops;
        Integer w02;
        String noOfLoops2;
        Integer w03;
        Bundle arguments = getArguments();
        NewDynamicParentActivity newDynamicParentActivity = null;
        if (arguments != null) {
            str = arguments.getString("screenId");
        } else {
            str = null;
        }
        t P = P();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("slug");
        } else {
            str2 = null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        String r = defpackage.c.r("n18b_data_", str);
        N18AListModel n18AListModel = this.f11003x;
        if (n18AListModel != null && (noOfLoops2 = n18AListModel.getNoOfLoops()) != null && (w03 = m.w0(noOfLoops2)) != null) {
            i6 = w03.intValue();
        } else {
            i6 = 1;
        }
        hashMap.put(r, Integer.valueOf(i6));
        hs.k kVar = hs.k.f19476a;
        P.s(str2, str, hashMap);
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        }
        if (newDynamicParentActivity != null) {
            int i11 = NewDynamicParentActivity.F;
            newDynamicParentActivity.L0(false);
        }
        String str3 = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putString("activity_name", P().T);
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putBoolean("main_activity", P().K);
        bundle.putBoolean("is_revamped", true);
        N18AListModel n18AListModel2 = this.f11003x;
        if (n18AListModel2 != null && (noOfLoops = n18AListModel2.getNoOfLoops()) != null && (w02 = m.w0(noOfLoops)) != null) {
            i10 = w02.intValue();
        } else {
            i10 = -1;
        }
        bundle.putInt("count", i10);
        gk.a.b(bundle, "activity_affirm_repeat_number");
    }

    public final t P() {
        return (t) this.f11002w.getValue();
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.f11004y.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f11004y;
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
        return inflater.inflate(R.layout.fragment_n18b_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0158, code lost:
        if (r1 == null) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ba  */
    @Override // rr.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        NewDynamicParentActivity newDynamicParentActivity3;
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj2;
        ArrayList arrayList3;
        Object obj3;
        Object obj4;
        String str2;
        N18AListModel n18AListModel;
        String str3;
        String str4;
        String str5;
        HashMap hashMap;
        String str6;
        String str7;
        String str8;
        ArrayList arrayList4;
        Object i22;
        String str9;
        String str10;
        v vVar;
        String str11;
        int i6;
        String str12;
        RobertoTextView robertoTextView;
        String str13;
        String str14;
        f fVar;
        boolean z10;
        String str15;
        String str16;
        HashMap hashMap2;
        Boolean bool;
        Object obj5;
        String str17;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        t P = P();
        Bundle arguments = getArguments();
        String str18 = null;
        if (arguments != null) {
            str = arguments.getString("slug");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num = Integer.valueOf(arguments2.getInt(Constants.DAYMODEL_POSITION));
        } else {
            num = null;
        }
        HashMap m10 = P.m(num, str);
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            newDynamicParentActivity.E0("cta_type_1");
        }
        p requireActivity2 = requireActivity();
        if (requireActivity2 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
        } else {
            newDynamicParentActivity2 = null;
        }
        if (newDynamicParentActivity2 != null) {
            if (m10 != null) {
                obj5 = m10.get("cta1");
            } else {
                obj5 = null;
            }
            if (obj5 instanceof String) {
                str17 = (String) obj5;
            } else {
                str17 = null;
            }
            NewDynamicParentActivity.F0(newDynamicParentActivity2, str17, null, null, null, 14);
        }
        p requireActivity3 = requireActivity();
        if (requireActivity3 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
        } else {
            newDynamicParentActivity3 = null;
        }
        if (newDynamicParentActivity3 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                bool = Boolean.valueOf(arguments3.getBoolean("show_info_button"));
            } else {
                bool = null;
            }
            newDynamicParentActivity3.O0(bool);
        }
        if (m10 != null) {
            obj = m10.get("local_data");
        } else {
            obj = null;
        }
        if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            for (Object obj6 : arrayList) {
                if (obj6 instanceof HashMap) {
                    hashMap2 = (HashMap) obj6;
                } else {
                    hashMap2 = null;
                }
                if (hashMap2 != null) {
                    arrayList2.add(hashMap2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && (hashMap = (HashMap) u.i2(arrayList2)) != null) {
            t P2 = P();
            Object obj7 = hashMap.get("screen_slug");
            if (obj7 instanceof String) {
                str6 = (String) obj7;
            } else {
                str6 = null;
            }
            Object obj8 = hashMap.get("screen_id");
            if (obj8 instanceof String) {
                str7 = (String) obj8;
            } else {
                str7 = null;
            }
            Object obj9 = hashMap.get("screen_data_key");
            if (obj9 instanceof String) {
                str8 = (String) obj9;
            } else {
                str8 = null;
            }
            Object o10 = P2.o(str6, str7, str8);
            if (o10 instanceof ArrayList) {
                arrayList4 = (ArrayList) o10;
            } else {
                arrayList4 = null;
            }
            if (arrayList4 != null && (i22 = u.i2(arrayList4)) != null) {
                gd.d dVar = P().f29790z;
                Object obj10 = hashMap.get("screen_slug");
                if (obj10 instanceof String) {
                    str9 = (String) obj10;
                } else {
                    str9 = null;
                }
                dVar.getClass();
                if (str9 != null) {
                    Locale locale = Locale.ENGLISH;
                    str10 = e.e(locale, "ENGLISH", str9, locale, "this as java.lang.String).toLowerCase(locale)");
                } else {
                    str10 = null;
                }
                if (i.b(str10, "n12c")) {
                    if (i22 instanceof f) {
                        fVar = (f) i22;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        String str19 = fVar.f28589b;
                        if (str19 != null) {
                            if (n.B0(str19)) {
                                str19 = null;
                            }
                        }
                        str19 = fVar.f28588a;
                        String str20 = fVar.f28589b;
                        boolean z11 = true;
                        if (str20 != null && !n.B0(str20)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            str15 = "";
                        } else {
                            str15 = fVar.f28590c;
                        }
                        String str21 = fVar.f28589b;
                        if (str21 != null && !n.B0(str21)) {
                            z11 = false;
                        }
                        if (z11) {
                            str16 = fVar.f28591d;
                        } else {
                            str16 = null;
                        }
                        vVar = new v(str19, str15, str16);
                        if (vVar == null) {
                            str11 = vVar.f28646a;
                        } else {
                            str11 = null;
                        }
                        if (str11 != null) {
                            Glide.g(requireContext()).p(vVar.f28646a).B((ShapeableImageView) _$_findCachedViewById(R.id.ivN18BScreenImage));
                        }
                        if (vVar == null && (str14 = vVar.f28647b) != null) {
                            i6 = str14.length();
                        } else {
                            i6 = -1;
                        }
                        if (i6 > 0) {
                            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN18BScreenImageOverlayText);
                            if (robertoTextView2 != null) {
                                robertoTextView2.setVisibility(0);
                            }
                            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN18BScreenImageOverlayText);
                            if (robertoTextView3 != null) {
                                if (vVar != null) {
                                    str13 = vVar.f28647b;
                                } else {
                                    str13 = null;
                                }
                                robertoTextView3.setText(str13);
                            }
                            if (vVar != null) {
                                str12 = vVar.f28648c;
                            } else {
                                str12 = null;
                            }
                            if (str12 != null && (robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN18BScreenImageOverlayText)) != null) {
                                robertoTextView.setTextColor(Color.parseColor(vVar.f28648c));
                            }
                        }
                    }
                }
                vVar = null;
                if (vVar == null) {
                }
                if (str11 != null) {
                }
                if (vVar == null) {
                }
                i6 = -1;
                if (i6 > 0) {
                }
            }
        }
        if (m10 != null) {
            obj2 = m10.get("item_list");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof ArrayList) {
            arrayList3 = (ArrayList) obj2;
        } else {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj11 : arrayList3) {
                if (obj11 instanceof HashMap) {
                    Map map = (Map) obj11;
                    Object obj12 = map.get("loop_count");
                    if (obj12 instanceof String) {
                        str3 = (String) obj12;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "1";
                    }
                    Object obj13 = map.get("duration");
                    if (obj13 instanceof String) {
                        str4 = (String) obj13;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    Object obj14 = map.get("subtext");
                    if (obj14 instanceof String) {
                        str5 = (String) obj14;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    n18AListModel = new N18AListModel(str3, str4, str5);
                } else {
                    n18AListModel = null;
                }
                if (n18AListModel != null) {
                    arrayList5.add(n18AListModel);
                }
            }
            if (this.f11003x == null) {
                this.f11003x = (N18AListModel) u.i2(arrayList5);
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rVN18BScreenTimeSelector);
            if (recyclerView != null) {
                recyclerView.setAdapter(new ol.d(arrayList5, new a(), this.f11003x));
            }
        }
        RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN18BScreenImageHeader);
        if (robertoTextView4 != null) {
            if (m10 != null) {
                obj4 = m10.get("image_header");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof String) {
                str2 = (String) obj4;
            } else {
                str2 = null;
            }
            robertoTextView4.setText(str2);
        }
        RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvN18BScreenImageFooter);
        if (robertoTextView5 != null) {
            if (m10 != null) {
                obj3 = m10.get("image_footer");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str18 = (String) obj3;
            }
            robertoTextView5.setText(str18);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
