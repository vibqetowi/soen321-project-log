package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.bumptech.glide.Glide;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityUploadModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.n;
import gv.r;
import is.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import pl.g;
import ql.h0;
import ql.t;
import ss.l;
/* compiled from: N10ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N10ScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N10ScreenFragment extends rr.d {
    public static final /* synthetic */ int N = 0;
    public boolean B;
    public String C;
    public HashMap<String, Object> D;
    public boolean E;
    public boolean F;
    public Integer G;
    public HashMap<String, Object> H;
    public int I;
    public boolean K;
    public boolean L;
    public final LinkedHashMap M = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10912w = LogHelper.INSTANCE.makeLogTag("N10ScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f10913x = b0.j(this, y.a(t.class), new d(this), new e(this), new f(this));

    /* renamed from: y  reason: collision with root package name */
    public int f10914y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f10915z = -1;
    public ArrayList<HashMap<String, Object>> A = new ArrayList<>();
    public boolean J = true;

    /* compiled from: N10ScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            NewDynamicParentActivity newDynamicParentActivity;
            p requireActivity = N10ScreenFragment.this.requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                int i6 = NewDynamicParentActivity.F;
                newDynamicParentActivity.L0(false);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: N10ScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<h0, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(h0 h0Var) {
            NewDynamicParentActivity newDynamicParentActivity;
            NewDynamicParentActivity newDynamicParentActivity2;
            NewDynamicParentActivity newDynamicParentActivity3;
            Object obj;
            String str;
            Object obj2;
            String str2;
            String str3;
            String str4;
            NewDynamicParentActivity newDynamicParentActivity4;
            Object obj3;
            String str5;
            Object obj4;
            String str6;
            NewDynamicParentActivity newDynamicParentActivity5;
            NewDynamicParentActivity newDynamicParentActivity6;
            String str7;
            String str8;
            h0 h0Var2 = h0Var;
            if (h0Var2 != null) {
                int ordinal = h0Var2.ordinal();
                N10ScreenFragment n10ScreenFragment = N10ScreenFragment.this;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            HashMap<String, Object> hashMap = n10ScreenFragment.H;
                            if (hashMap != null) {
                                obj4 = hashMap.get("upload_failure_subheader");
                            } else {
                                obj4 = null;
                            }
                            if (obj4 instanceof String) {
                                str6 = (String) obj4;
                            } else {
                                str6 = null;
                            }
                            if (str6 != null) {
                                Toast.makeText(n10ScreenFragment.requireContext(), str6, 0).show();
                            }
                            n10ScreenFragment.K = false;
                            p requireActivity = n10ScreenFragment.requireActivity();
                            if (requireActivity instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity5 = (NewDynamicParentActivity) requireActivity;
                            } else {
                                newDynamicParentActivity5 = null;
                            }
                            if (newDynamicParentActivity5 != null) {
                                newDynamicParentActivity5.E0("cta_type_2");
                            }
                            p requireActivity2 = n10ScreenFragment.requireActivity();
                            if (requireActivity2 instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity6 = (NewDynamicParentActivity) requireActivity2;
                            } else {
                                newDynamicParentActivity6 = null;
                            }
                            if (newDynamicParentActivity6 != null) {
                                t h02 = n10ScreenFragment.h0();
                                Bundle arguments = n10ScreenFragment.getArguments();
                                Object k10 = h02.k(n10ScreenFragment.f10915z, (arguments == null || (r3 = arguments.getString("slug")) == null) ? "" : "", "cta1");
                                if (k10 instanceof String) {
                                    str7 = (String) k10;
                                } else {
                                    str7 = null;
                                }
                                t h03 = n10ScreenFragment.h0();
                                Bundle arguments2 = n10ScreenFragment.getArguments();
                                Object k11 = h03.k(n10ScreenFragment.f10915z, (arguments2 == null || (r1 = arguments2.getString("slug")) == null) ? "" : "", "cta2");
                                if (k11 instanceof String) {
                                    str8 = (String) k11;
                                } else {
                                    str8 = null;
                                }
                                NewDynamicParentActivity.F0(newDynamicParentActivity6, str7, str8, null, null, 12);
                            }
                        }
                    } else {
                        n10ScreenFragment.K = false;
                        int i6 = n10ScreenFragment.I + 1;
                        n10ScreenFragment.I = i6;
                        if (i6 >= 3) {
                            p requireActivity3 = n10ScreenFragment.requireActivity();
                            if (requireActivity3 instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity3;
                            } else {
                                newDynamicParentActivity4 = null;
                            }
                            if (newDynamicParentActivity4 != null) {
                                int i10 = NewDynamicParentActivity.F;
                                newDynamicParentActivity4.L0(false);
                            }
                            HashMap<String, Object> hashMap2 = n10ScreenFragment.H;
                            if (hashMap2 != null) {
                                obj3 = hashMap2.get("log_save_failure_toast");
                            } else {
                                obj3 = null;
                            }
                            if (obj3 instanceof String) {
                                str5 = (String) obj3;
                            } else {
                                str5 = null;
                            }
                            if (str5 != null) {
                                Toast.makeText(n10ScreenFragment.requireContext(), str5, 0).show();
                            }
                        } else {
                            p requireActivity4 = n10ScreenFragment.requireActivity();
                            if (requireActivity4 instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                            } else {
                                newDynamicParentActivity2 = null;
                            }
                            if (newDynamicParentActivity2 != null) {
                                newDynamicParentActivity2.E0("cta_type_2");
                            }
                            p requireActivity5 = n10ScreenFragment.requireActivity();
                            if (requireActivity5 instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity5;
                            } else {
                                newDynamicParentActivity3 = null;
                            }
                            if (newDynamicParentActivity3 != null) {
                                t h04 = n10ScreenFragment.h0();
                                Bundle arguments3 = n10ScreenFragment.getArguments();
                                Object k12 = h04.k(n10ScreenFragment.f10915z, (arguments3 == null || (r7 = arguments3.getString("slug")) == null) ? "" : "", "cta1");
                                if (k12 instanceof String) {
                                    str3 = (String) k12;
                                } else {
                                    str3 = null;
                                }
                                t h05 = n10ScreenFragment.h0();
                                Bundle arguments4 = n10ScreenFragment.getArguments();
                                Object k13 = h05.k(n10ScreenFragment.f10915z, (arguments4 == null || (r1 = arguments4.getString("slug")) == null) ? "" : "", "cta2");
                                if (k13 instanceof String) {
                                    str4 = (String) k13;
                                } else {
                                    str4 = null;
                                }
                                NewDynamicParentActivity.F0(newDynamicParentActivity3, str3, str4, null, null, 12);
                            }
                            HashMap<String, Object> hashMap3 = n10ScreenFragment.H;
                            if (hashMap3 != null) {
                                obj = hashMap3.get("upload_failure_header");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof String) {
                                str = (String) obj;
                            } else {
                                str = null;
                            }
                            HashMap<String, Object> hashMap4 = n10ScreenFragment.H;
                            if (hashMap4 != null) {
                                obj2 = hashMap4.get("upload_failure_subheader");
                            } else {
                                obj2 = null;
                            }
                            if (obj2 instanceof String) {
                                str2 = (String) obj2;
                            } else {
                                str2 = null;
                            }
                            n10ScreenFragment.n0(str, str2, true);
                        }
                        String str9 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putString("activity_name", n10ScreenFragment.h0().T);
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle.putBoolean("main_activity", n10ScreenFragment.h0().K);
                        bundle.putBoolean("is_revamped", true);
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "activity_affirm_log_upload_fail");
                    }
                } else {
                    n10ScreenFragment.K = false;
                    n10ScreenFragment.h0().r(sp.b.K());
                    if (!sp.b.K()) {
                        p requireActivity6 = n10ScreenFragment.requireActivity();
                        if (requireActivity6 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity6;
                        } else {
                            newDynamicParentActivity = null;
                        }
                        if (newDynamicParentActivity != null) {
                            int i11 = NewDynamicParentActivity.F;
                            newDynamicParentActivity.L0(false);
                        }
                    } else {
                        n10ScreenFragment.h0().f29783g0.e(n10ScreenFragment.getViewLifecycleOwner(), new hl.p(12, new com.theinnerhour.b2b.components.dynamicActivities.fragments.a(n10ScreenFragment)));
                    }
                    String str10 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("activity_name", n10ScreenFragment.h0().T);
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle2.putBoolean("main_activity", n10ScreenFragment.h0().K);
                    bundle2.putBoolean("is_revamped", true);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "activity_affirm_log_upload_success");
                    n10ScreenFragment.h0().f29779a0.i(h0.IN_PROGRESS);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            Integer num;
            int i6;
            Object obj = ((HashMap) t3).get("order_rank");
            Integer num2 = null;
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            int i10 = 99;
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 99;
            }
            Integer valueOf = Integer.valueOf(i6);
            Object obj2 = ((HashMap) t10).get("order_rank");
            if (obj2 instanceof Integer) {
                num2 = (Integer) obj2;
            }
            if (num2 != null) {
                i10 = num2.intValue();
            }
            return sp.b.g(valueOf, Integer.valueOf(i10));
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10918u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f10918u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f10918u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10919u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f10919u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f10919u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10920u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f10920u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f10920u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.b
    public final boolean I() {
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        try {
            newDynamicParentActivity = null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
        if (this.B) {
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                newDynamicParentActivity2.A0(1);
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
            }
            if (newDynamicParentActivity != null) {
                newDynamicParentActivity.J0();
            }
            return false;
        } else if (this.K) {
            return false;
        } else {
            if (this.f10914y > 0) {
                p requireActivity3 = requireActivity();
                if (requireActivity3 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity3;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.A0(this.f10914y);
                }
                return true;
            }
            return true;
        }
    }

    @Override // rr.d
    public final void K() {
        NewDynamicParentActivity newDynamicParentActivity;
        try {
            if (!this.K) {
                p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity = null;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.B0(h0().D);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    @Override // rr.d
    public final void M() {
        boolean z10;
        String str;
        try {
            NewDynamicParentActivity newDynamicParentActivity = null;
            if (this.F) {
                if (h0().Z != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        str = arguments.getString("slug");
                    } else {
                        str = null;
                    }
                    if (i.b(str, "n10b")) {
                        this.K = true;
                        o0();
                        h0().q();
                        return;
                    }
                }
                h0().r(sp.b.K());
                if (!sp.b.K()) {
                    p requireActivity = requireActivity();
                    if (requireActivity instanceof NewDynamicParentActivity) {
                        newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                    }
                    if (newDynamicParentActivity != null) {
                        int i6 = NewDynamicParentActivity.F;
                        newDynamicParentActivity.L0(false);
                        return;
                    }
                    return;
                }
                h0().f29783g0.e(getViewLifecycleOwner(), new hl.p(10, new a()));
                return;
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
            }
            if (newDynamicParentActivity != null) {
                int i10 = NewDynamicParentActivity.F;
                newDynamicParentActivity.L0(false);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    @Override // rr.d
    public final void O() {
        Integer num;
        NewDynamicParentActivity newDynamicParentActivity;
        if (this.B && (num = this.G) != null && num.intValue() == 0) {
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                newDynamicParentActivity.J0();
            }
        }
    }

    public final void P(HashMap<String, Object> hashMap, HashMap<hs.f<String, String>, HashMap<String, Object>> hashMap2) {
        String str;
        String str2;
        String str3;
        Object obj;
        ArrayList arrayList;
        String str4;
        int i6;
        String str5;
        boolean z10;
        String str6;
        ArrayList arrayList2;
        String str7;
        String str8;
        Integer w02;
        Integer w03;
        try {
            Object obj2 = hashMap.get("user_entered_value_screen_slug");
            String str9 = null;
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            Object obj3 = hashMap.get("user_entered_value_screen_id");
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = null;
            }
            Object obj4 = hashMap.get("user_entered_value_key");
            if (obj4 instanceof String) {
                str3 = (String) obj4;
            } else {
                str3 = null;
            }
            HashMap<String, Object> hashMap3 = hashMap2.get(new hs.f(str, str2));
            if (hashMap3 != null) {
                obj = hashMap3.get(str3);
            } else {
                obj = null;
            }
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Object obj5 = hashMap.get("defined_value1");
                if (obj5 instanceof String) {
                    str4 = (String) obj5;
                } else {
                    str4 = null;
                }
                int i10 = -1;
                if (str4 != null && (w03 = m.w0(str4)) != null) {
                    i6 = w03.intValue();
                } else {
                    i6 = -1;
                }
                Object obj6 = hashMap.get("defined_value2");
                if (obj6 instanceof String) {
                    str5 = (String) obj6;
                } else {
                    str5 = null;
                }
                if (str5 != null && (w02 = m.w0(str5)) != null) {
                    i10 = w02.intValue();
                }
                if (i6 != i10 || arrayList.size() != i6) {
                    if (i6 != i10) {
                        int size = arrayList.size();
                        if (i6 <= size && size < i10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Object obj7 = hashMap.get("title");
                if (obj7 instanceof String) {
                    str6 = (String) obj7;
                } else {
                    str6 = null;
                }
                Object obj8 = hashMap.get("box_content");
                if (obj8 instanceof ArrayList) {
                    arrayList2 = (ArrayList) obj8;
                } else {
                    arrayList2 = null;
                }
                Object obj9 = hashMap.get("title_color");
                if (obj9 instanceof String) {
                    str7 = (String) obj9;
                } else {
                    str7 = null;
                }
                Object obj10 = hashMap.get("background_color");
                if (obj10 instanceof String) {
                    str8 = (String) obj10;
                } else {
                    str8 = null;
                }
                Object obj11 = hashMap.get("image");
                if (obj11 instanceof String) {
                    str9 = (String) obj11;
                }
                S(str6, arrayList2, str7, str8, str9);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    public final void Q(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        int i6;
        String str3;
        boolean z10;
        String str4;
        ArrayList arrayList3;
        String str5;
        String str6;
        Integer w02;
        Integer w03;
        String str7;
        if (hashMap2 == null) {
            return;
        }
        try {
            Object obj = hashMap.get("user_entered_value_key");
            String str8 = null;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            Object obj2 = hashMap2.get(str);
            if (obj2 instanceof ArrayList) {
                arrayList = (ArrayList) obj2;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof String) {
                        str7 = (String) obj3;
                    } else {
                        str7 = null;
                    }
                    if (str7 != null) {
                        arrayList2.add(str7);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                Object obj4 = hashMap.get("defined_value1");
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                } else {
                    str2 = null;
                }
                int i10 = -1;
                if (str2 != null && (w03 = m.w0(str2)) != null) {
                    i6 = w03.intValue();
                } else {
                    i6 = -1;
                }
                Object obj5 = hashMap.get("defined_value2");
                if (obj5 instanceof String) {
                    str3 = (String) obj5;
                } else {
                    str3 = null;
                }
                if (str3 != null && (w02 = m.w0(str3)) != null) {
                    i10 = w02.intValue();
                }
                if (i6 != i10 || arrayList2.size() != i6) {
                    if (i6 != i10) {
                        int size = arrayList2.size();
                        if (i6 <= size && size < i10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Object obj6 = hashMap.get("title");
                if (obj6 instanceof String) {
                    str4 = (String) obj6;
                } else {
                    str4 = null;
                }
                Object obj7 = hashMap.get("box_content");
                if (obj7 instanceof ArrayList) {
                    arrayList3 = (ArrayList) obj7;
                } else {
                    arrayList3 = null;
                }
                Object obj8 = hashMap.get("title_color");
                if (obj8 instanceof String) {
                    str5 = (String) obj8;
                } else {
                    str5 = null;
                }
                Object obj9 = hashMap.get("background_color");
                if (obj9 instanceof String) {
                    str6 = (String) obj9;
                } else {
                    str6 = null;
                }
                Object obj10 = hashMap.get("image");
                if (obj10 instanceof String) {
                    str8 = (String) obj10;
                }
                S(str4, arrayList3, str5, str6, str8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        com.bumptech.glide.Glide.g(r0.getContext()).p(r10).B((android.widget.ImageView) r0.findViewById(com.theinnerhour.b2b.R.id.ivFragmentRowN13BImage));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(String str, ArrayList arrayList, String str2, String str3, String str4) {
        RobertoTextView robertoTextView;
        View findViewById;
        if (arrayList == null) {
            return;
        }
        try {
            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.fragment_n10_screen_n13b_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer)), false);
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentRowN13BHeader);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(str);
                if (str2 != null) {
                    robertoTextView2.setTextColor(ColorStateList.valueOf(Color.parseColor(str2)));
                }
            }
            if (str3 != null && (findViewById = inflate.findViewById(R.id.viewFragmentRowN13BHeaderContainer)) != null) {
                findViewById.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str3)));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                View inflate2 = requireActivity().getLayoutInflater().inflate(R.layout.row_n13b_characteristic_item, (ViewGroup) inflate.findViewById(R.id.llFragmentRowN13BHeaderContainer), false);
                if (inflate2 != null) {
                    robertoTextView = (RobertoTextView) inflate2.findViewById(R.id.tvRowN13BCharacteristicText);
                } else {
                    robertoTextView = null;
                }
                if (robertoTextView != null) {
                    robertoTextView.setText(str5);
                }
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.llFragmentRowN13BHeaderContainer);
                if (linearLayout != null) {
                    linearLayout.addView(inflate2);
                }
            }
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
            if (linearLayout2 != null) {
                linearLayout2.addView(inflate);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    public final void U(String str) {
        try {
            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.fragment_n10_screen_date_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer)), false);
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvRowN10Date);
            if (robertoTextView != null) {
                robertoTextView.setText(str);
            }
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
            if (linearLayout != null) {
                linearLayout.addView(inflate);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
        com.bumptech.glide.Glide.g(r2.getContext()).p(r18).B((android.widget.ImageView) r2.findViewById(com.theinnerhour.b2b.R.id.ivFragmentN10ScreenN5RowImage));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(String str, ArrayList arrayList, String str2, String str3, String str4) {
        View findViewById;
        View findViewById2;
        if (arrayList == null) {
            return;
        }
        try {
            if (!arrayList.isEmpty()) {
                View inflate = requireActivity().getLayoutInflater().inflate(R.layout.fragment_n10_screen_n6a_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer)), false);
                int i6 = 0;
                for (Object obj : arrayList) {
                    int i10 = i6 + 1;
                    if (i6 >= 0) {
                        N12AItemListModel n12AItemListModel = (N12AItemListModel) obj;
                        View inflate2 = requireActivity().getLayoutInflater().inflate(R.layout.row_n6a_item_n10_population, (ViewGroup) inflate.findViewById(R.id.llFragmentN10ScreenN5RowItemContainer), false);
                        Glide.i(requireActivity()).p(n12AItemListModel.getImageLink()).B((ImageView) inflate2.findViewById(R.id.ivRowN6AImage));
                        RobertoTextView robertoTextView = (RobertoTextView) inflate2.findViewById(R.id.tvRowN6ATitle);
                        if (robertoTextView != null) {
                            robertoTextView.setText(n12AItemListModel.getHeader());
                        }
                        RobertoTextView robertoTextView2 = (RobertoTextView) inflate2.findViewById(R.id.tvRowN6ASubTitle);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setText(n12AItemListModel.getSubHeader());
                        }
                        if (i6 == arrayList.size() - 1 && (findViewById2 = inflate2.findViewById(R.id.viewRowN6AFooter)) != null) {
                            findViewById2.setVisibility(8);
                        }
                        ((LinearLayout) inflate.findViewById(R.id.llFragmentN10ScreenN5RowItemContainer)).addView(inflate2);
                        i6 = i10;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN5RowHeader);
                if (robertoTextView3 != null) {
                    robertoTextView3.setText(str);
                    if (str2 != null) {
                        robertoTextView3.setTextColor(ColorStateList.valueOf(Color.parseColor(str2)));
                    }
                }
                if (str3 != null && (findViewById = inflate.findViewById(R.id.viewFragmentN10ScreenN5RowHeaderBg)) != null) {
                    findViewById.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                }
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
                if (linearLayout != null) {
                    linearLayout.addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0102, code lost:
        com.bumptech.glide.Glide.g(r2.getContext()).p(r21).B((android.widget.ImageView) r2.findViewById(com.theinnerhour.b2b.R.id.ivFragmentN10ScreenN5RowImage));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(String str, ArrayList arrayList, String str2, String str3, String str4) {
        View findViewById;
        View findViewById2;
        if (arrayList == null) {
            return;
        }
        try {
            if (!arrayList.isEmpty()) {
                boolean z10 = false;
                View inflate = requireActivity().getLayoutInflater().inflate(R.layout.fragment_n10_screen_n6a_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer)), false);
                int i6 = 0;
                for (Object obj : arrayList) {
                    int i10 = i6 + 1;
                    if (i6 >= 0) {
                        g gVar = (g) obj;
                        View inflate2 = requireActivity().getLayoutInflater().inflate(R.layout.row_n6a_item_n10_population, (ViewGroup) inflate.findViewById(R.id.llFragmentN10ScreenN5RowItemContainer), z10);
                        com.bumptech.glide.f i11 = Glide.i(requireActivity());
                        Object obj2 = gVar.f28596b;
                        if (obj2 == null) {
                            obj2 = gVar.f28595a;
                        }
                        i11.getClass();
                        com.bumptech.glide.e eVar = new com.bumptech.glide.e(i11.f5956u, i11, Drawable.class, i11.f5957v);
                        eVar.Z = obj2;
                        eVar.f5953b0 = true;
                        eVar.B((ImageView) inflate2.findViewById(R.id.ivRowN6AImage));
                        RobertoTextView robertoTextView = (RobertoTextView) inflate2.findViewById(R.id.tvRowN6ATitle);
                        if (robertoTextView != null) {
                            robertoTextView.setText(gVar.f28597c);
                        }
                        RobertoTextView robertoTextView2 = (RobertoTextView) inflate2.findViewById(R.id.tvRowN6ASubTitle);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setVisibility(8);
                        }
                        if (i6 == arrayList.size() - 1 && (findViewById2 = inflate2.findViewById(R.id.viewRowN6AFooter)) != null) {
                            findViewById2.setVisibility(8);
                        }
                        ((LinearLayout) inflate.findViewById(R.id.llFragmentN10ScreenN5RowItemContainer)).addView(inflate2);
                        i6 = i10;
                        z10 = false;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN5RowHeader);
                if (robertoTextView3 != null) {
                    robertoTextView3.setText(str);
                    if (str2 != null) {
                        robertoTextView3.setTextColor(ColorStateList.valueOf(Color.parseColor(str2)));
                    }
                }
                if (str3 != null && (findViewById = inflate.findViewById(R.id.viewFragmentN10ScreenN5RowHeaderBg)) != null) {
                    findViewById.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                }
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
                if (linearLayout != null) {
                    linearLayout.addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        com.bumptech.glide.Glide.g(r0.getContext()).p(r10).B((android.widget.ImageView) r0.findViewById(com.theinnerhour.b2b.R.id.ivFragmentN10ScreenN4RowImage));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(String str, String str2, String str3, String str4, String str5) {
        String str6;
        View findViewById;
        if (str2 == null) {
            return;
        }
        try {
            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.fragment_n10_screen_n4_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer)), false);
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN4RowHeader);
            if (robertoTextView != null) {
                if (str != null) {
                    str6 = str;
                } else {
                    str6 = "";
                }
                robertoTextView.setText(str6);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN4RowHeader);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(str);
                if (str3 != null) {
                    robertoTextView2.setTextColor(ColorStateList.valueOf(Color.parseColor(str3)));
                }
            }
            if (str4 != null && (findViewById = inflate.findViewById(R.id.viewFragmentN10ScreenN4RowHeaderBg)) != null) {
                findViewById.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str4)));
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN4RowBody);
            if (robertoTextView3 != null) {
                robertoTextView3.setText(str2);
            }
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
            if (linearLayout != null) {
                linearLayout.addView(inflate);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.M.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.M;
        Integer valueOf = Integer.valueOf((int) R.id.llFragmentN10ItemContainer);
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.llFragmentN10ItemContainer)) != null) {
                linkedHashMap.put(valueOf, findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        com.bumptech.glide.Glide.g(r0.getContext()).p(r11).B((android.widget.ImageView) r0.findViewById(com.theinnerhour.b2b.R.id.ivFragmentN10ScreenN5RowImage));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(String str, ArrayList<String> arrayList, String str2, String str3, String str4, String str5) {
        View findViewById;
        if (arrayList != null && str2 != null) {
            try {
                View inflate = requireActivity().getLayoutInflater().inflate(R.layout.fragment_n10_screen_n5_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer)), false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN5RowHeader);
                if (robertoTextView != null) {
                    robertoTextView.setText(str);
                    if (str3 != null) {
                        robertoTextView.setTextColor(ColorStateList.valueOf(Color.parseColor(str3)));
                    }
                }
                if (str4 != null && (findViewById = inflate.findViewById(R.id.viewFragmentN10ScreenN5RowHeaderBg)) != null) {
                    findViewById.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str4)));
                }
                if (n.B0(str2)) {
                    RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN5RowBody);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setVisibility(8);
                    }
                } else {
                    RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN5RowBody);
                    if (robertoTextView3 != null) {
                        robertoTextView3.setText(str2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str6 : arrayList) {
                    int i6 = bn.a.f4534a;
                    p requireActivity = requireActivity();
                    i.f(requireActivity, "requireActivity()");
                    View findViewById2 = inflate.findViewById(R.id.cgFragmentN10ScreenN5RowChipGroup);
                    i.f(findViewById2, "findViewById(R.id.cgFrag…tN10ScreenN5RowChipGroup)");
                    Chip h10 = bn.a.h(requireActivity, str6, (ChipGroup) findViewById2, false, null);
                    if (h10 != null) {
                        arrayList2.add(h10);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Chip chip = (Chip) it.next();
                    ChipGroup chipGroup = (ChipGroup) inflate.findViewById(R.id.cgFragmentN10ScreenN5RowChipGroup);
                    if (chipGroup != null) {
                        chipGroup.addView(chip);
                    }
                }
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
                if (linearLayout != null) {
                    linearLayout.addView(inflate);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10912w, e10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
        com.bumptech.glide.Glide.g(r0.getContext()).p(r13).B((android.widget.ImageView) r0.findViewById(com.theinnerhour.b2b.R.id.ivFragmentN10ScreenN5RowImage));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(String str, ArrayList arrayList, String str2, String str3, String str4) {
        View findViewById;
        if (arrayList == null) {
            return;
        }
        try {
            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.fragment_n10_screen_n6a_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer)), false);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                N12AItemListModel n12AItemListModel = (N12AItemListModel) it.next();
                View inflate2 = requireActivity().getLayoutInflater().inflate(R.layout.row_n6a_item_n10_population, (ViewGroup) inflate.findViewById(R.id.llFragmentN10ScreenN5RowItemContainer), false);
                Glide.i(requireActivity()).p(n12AItemListModel.getImageLink()).B((ImageView) inflate2.findViewById(R.id.ivRowN6AImage));
                RobertoTextView robertoTextView = (RobertoTextView) inflate2.findViewById(R.id.tvRowN6ATitle);
                if (robertoTextView != null) {
                    robertoTextView.setText(n12AItemListModel.getHeader());
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) inflate2.findViewById(R.id.tvRowN6ASubTitle);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(n12AItemListModel.getSubHeader());
                }
                ((LinearLayout) inflate.findViewById(R.id.llFragmentN10ScreenN5RowItemContainer)).addView(inflate2);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenN5RowHeader);
            if (robertoTextView3 != null) {
                robertoTextView3.setText(str);
                if (str2 != null) {
                    robertoTextView3.setTextColor(ColorStateList.valueOf(Color.parseColor(str2)));
                }
            }
            if (str3 != null && (findViewById = inflate.findViewById(R.id.viewFragmentN10ScreenN5RowHeaderBg)) != null) {
                findViewById.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str3)));
            }
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
            if (linearLayout != null) {
                linearLayout.addView(inflate);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x0335 A[Catch: Exception -> 0x0400, TryCatch #0 {Exception -> 0x0400, blocks: (B:3:0x0012, B:5:0x002f, B:10:0x0039, B:12:0x0047, B:15:0x005f, B:17:0x0077, B:20:0x007e, B:22:0x0084, B:24:0x0088, B:26:0x008d, B:28:0x0095, B:30:0x009a, B:32:0x00a2, B:34:0x00a7, B:36:0x00af, B:38:0x00b5, B:39:0x00bc, B:41:0x00c8, B:43:0x00ea, B:45:0x00f0, B:47:0x00f4, B:50:0x00fa, B:51:0x0103, B:53:0x0109, B:55:0x0111, B:58:0x0117, B:60:0x011c, B:65:0x0127, B:67:0x012d, B:69:0x0131, B:71:0x0138, B:73:0x0140, B:75:0x0147, B:77:0x014f, B:79:0x0156, B:81:0x015e, B:83:0x0165, B:85:0x016d, B:87:0x0175, B:88:0x017c, B:90:0x0188, B:92:0x019a, B:94:0x01a0, B:96:0x01a4, B:99:0x01aa, B:100:0x01b3, B:102:0x01b9, B:104:0x01c1, B:107:0x01c7, B:110:0x01ce, B:112:0x01d6, B:114:0x01db, B:116:0x01e3, B:118:0x01e8, B:120:0x01f0, B:122:0x01f5, B:124:0x01fd, B:126:0x0203, B:127:0x020a, B:129:0x0216, B:131:0x0228, B:133:0x022e, B:135:0x0232, B:138:0x0238, B:139:0x0241, B:141:0x0247, B:143:0x024f, B:146:0x0255, B:149:0x025c, B:151:0x0264, B:153:0x0269, B:155:0x0271, B:157:0x0276, B:159:0x027e, B:161:0x0283, B:163:0x028b, B:165:0x0291, B:166:0x0298, B:168:0x02a4, B:170:0x02b6, B:172:0x02bc, B:174:0x02c0, B:177:0x02c6, B:178:0x02cf, B:180:0x02d5, B:182:0x02dd, B:184:0x02e4, B:186:0x02ed, B:192:0x02f9, B:194:0x0301, B:196:0x030f, B:204:0x0325, B:206:0x032b, B:207:0x032f, B:209:0x0335, B:214:0x0379, B:216:0x037d, B:221:0x038f, B:222:0x0394, B:225:0x03a9, B:229:0x03bb, B:231:0x03c3, B:233:0x03ca, B:235:0x03d2, B:237:0x03d9, B:239:0x03e1, B:241:0x03e8, B:243:0x03f0, B:245:0x03f8), top: B:250:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x037d A[Catch: Exception -> 0x0400, TryCatch #0 {Exception -> 0x0400, blocks: (B:3:0x0012, B:5:0x002f, B:10:0x0039, B:12:0x0047, B:15:0x005f, B:17:0x0077, B:20:0x007e, B:22:0x0084, B:24:0x0088, B:26:0x008d, B:28:0x0095, B:30:0x009a, B:32:0x00a2, B:34:0x00a7, B:36:0x00af, B:38:0x00b5, B:39:0x00bc, B:41:0x00c8, B:43:0x00ea, B:45:0x00f0, B:47:0x00f4, B:50:0x00fa, B:51:0x0103, B:53:0x0109, B:55:0x0111, B:58:0x0117, B:60:0x011c, B:65:0x0127, B:67:0x012d, B:69:0x0131, B:71:0x0138, B:73:0x0140, B:75:0x0147, B:77:0x014f, B:79:0x0156, B:81:0x015e, B:83:0x0165, B:85:0x016d, B:87:0x0175, B:88:0x017c, B:90:0x0188, B:92:0x019a, B:94:0x01a0, B:96:0x01a4, B:99:0x01aa, B:100:0x01b3, B:102:0x01b9, B:104:0x01c1, B:107:0x01c7, B:110:0x01ce, B:112:0x01d6, B:114:0x01db, B:116:0x01e3, B:118:0x01e8, B:120:0x01f0, B:122:0x01f5, B:124:0x01fd, B:126:0x0203, B:127:0x020a, B:129:0x0216, B:131:0x0228, B:133:0x022e, B:135:0x0232, B:138:0x0238, B:139:0x0241, B:141:0x0247, B:143:0x024f, B:146:0x0255, B:149:0x025c, B:151:0x0264, B:153:0x0269, B:155:0x0271, B:157:0x0276, B:159:0x027e, B:161:0x0283, B:163:0x028b, B:165:0x0291, B:166:0x0298, B:168:0x02a4, B:170:0x02b6, B:172:0x02bc, B:174:0x02c0, B:177:0x02c6, B:178:0x02cf, B:180:0x02d5, B:182:0x02dd, B:184:0x02e4, B:186:0x02ed, B:192:0x02f9, B:194:0x0301, B:196:0x030f, B:204:0x0325, B:206:0x032b, B:207:0x032f, B:209:0x0335, B:214:0x0379, B:216:0x037d, B:221:0x038f, B:222:0x0394, B:225:0x03a9, B:229:0x03bb, B:231:0x03c3, B:233:0x03ca, B:235:0x03d2, B:237:0x03d9, B:239:0x03e1, B:241:0x03e8, B:243:0x03f0, B:245:0x03f8), top: B:250:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0370 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(HashMap<String, Object> hashMap, HashMap<hs.f<String, String>, HashMap<String, Object>> hashMap2) {
        String str;
        String str2;
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        g gVar;
        boolean z10;
        Bitmap bitmap;
        NewDynamicActivityUploadModel newDynamicActivityUploadModel;
        List<hs.f<String, Bitmap>> bitmapList;
        Iterator<T> it;
        Object obj2;
        hs.f fVar;
        Object obj3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str11;
        String str12;
        String str13;
        String str14;
        N12AItemListModel n12AItemListModel;
        Object obj4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str15;
        String str16;
        String str17;
        String str18;
        N12AItemListModel n12AItemListModel2;
        Object obj5;
        ArrayList arrayList7;
        ArrayList<String> arrayList8;
        ArrayList<String> arrayList9;
        Object obj6;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Object obj7;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30 = "slug";
        String str31 = "screen_id";
        try {
            HashMap<String, Object> hashMap3 = hashMap2.get(new hs.f(hashMap.get("slug"), hashMap.get("screen_id")));
            Object obj8 = hashMap.get("slug");
            if (obj8 instanceof String) {
                str = (String) obj8;
            } else {
                str = null;
            }
            if (str != null) {
                Locale ENGLISH = Locale.ENGLISH;
                i.f(ENGLISH, "ENGLISH");
                str2 = str.toLowerCase(ENGLISH);
                i.f(str2, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            String str32 = "this as java.lang.String).toLowerCase(locale)";
            String str33 = "ENGLISH";
            if (is.k.Q1(str2, new String[]{"n4a"})) {
                String str34 = "n4_data_" + hashMap.get("screen_id");
                Object obj9 = hashMap.get("title");
                if (obj9 instanceof String) {
                    str25 = (String) obj9;
                } else {
                    str25 = null;
                }
                if (hashMap3 != null) {
                    obj7 = hashMap3.get(str34);
                } else {
                    obj7 = null;
                }
                if (obj7 instanceof String) {
                    str26 = (String) obj7;
                } else {
                    str26 = null;
                }
                Object obj10 = hashMap.get("title_color");
                if (obj10 instanceof String) {
                    str27 = (String) obj10;
                } else {
                    str27 = null;
                }
                Object obj11 = hashMap.get("background_color");
                if (obj11 instanceof String) {
                    str28 = (String) obj11;
                } else {
                    str28 = null;
                }
                Object obj12 = hashMap.get("image");
                if (obj12 instanceof String) {
                    str29 = (String) obj12;
                } else {
                    str29 = null;
                }
                Z(str25, str26, str27, str28, str29);
            } else if (is.k.Q1(str2, new String[]{"n5a"})) {
                String str35 = "n5_list_" + hashMap.get("screen_id");
                String str36 = "n5_data_" + hashMap.get("screen_id");
                if (hashMap3 != null) {
                    obj5 = hashMap3.get(str35);
                } else {
                    obj5 = null;
                }
                if (obj5 instanceof ArrayList) {
                    arrayList7 = (ArrayList) obj5;
                } else {
                    arrayList7 = null;
                }
                if (arrayList7 != null) {
                    arrayList8 = new ArrayList<>();
                    for (Object obj13 : arrayList7) {
                        if (obj13 instanceof String) {
                            str24 = (String) obj13;
                        } else {
                            str24 = null;
                        }
                        if (str24 != null) {
                            arrayList8.add(str24);
                        }
                    }
                } else {
                    arrayList8 = null;
                }
                if (arrayList8 instanceof ArrayList) {
                    arrayList9 = arrayList8;
                } else {
                    arrayList9 = null;
                }
                if (hashMap3 != null) {
                    obj6 = hashMap3.get(str36);
                } else {
                    obj6 = null;
                }
                if (obj6 instanceof String) {
                    str19 = (String) obj6;
                } else {
                    str19 = null;
                }
                Object obj14 = hashMap.get("title");
                if (obj14 instanceof String) {
                    str20 = (String) obj14;
                } else {
                    str20 = null;
                }
                Object obj15 = hashMap.get("title_color");
                if (obj15 instanceof String) {
                    str21 = (String) obj15;
                } else {
                    str21 = null;
                }
                Object obj16 = hashMap.get("background_color");
                if (obj16 instanceof String) {
                    str22 = (String) obj16;
                } else {
                    str22 = null;
                }
                Object obj17 = hashMap.get("image");
                if (obj17 instanceof String) {
                    str23 = (String) obj17;
                } else {
                    str23 = null;
                }
                a0(str20, arrayList9, str19, str21, str22, str23);
            } else if (is.k.Q1(str2, new String[]{"n6a"})) {
                String str37 = "n6a_list_" + hashMap.get("screen_id");
                if (hashMap3 != null) {
                    obj4 = hashMap3.get(str37);
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof ArrayList) {
                    arrayList5 = (ArrayList) obj4;
                } else {
                    arrayList5 = null;
                }
                if (arrayList5 != null) {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj18 : arrayList5) {
                        if (obj18 instanceof N12AItemListModel) {
                            n12AItemListModel2 = (N12AItemListModel) obj18;
                        } else {
                            n12AItemListModel2 = null;
                        }
                        if (n12AItemListModel2 != null) {
                            arrayList10.add(n12AItemListModel2);
                        }
                    }
                    arrayList6 = arrayList10;
                } else {
                    arrayList6 = null;
                }
                Object obj19 = hashMap.get("title");
                if (obj19 instanceof String) {
                    str15 = (String) obj19;
                } else {
                    str15 = null;
                }
                Object obj20 = hashMap.get("title_color");
                if (obj20 instanceof String) {
                    str16 = (String) obj20;
                } else {
                    str16 = null;
                }
                Object obj21 = hashMap.get("background_color");
                if (obj21 instanceof String) {
                    str17 = (String) obj21;
                } else {
                    str17 = null;
                }
                Object obj22 = hashMap.get("image");
                if (obj22 instanceof String) {
                    str18 = (String) obj22;
                } else {
                    str18 = null;
                }
                b0(str15, arrayList6, str16, str17, str18);
            } else if (is.k.Q1(str2, new String[]{"n12a"})) {
                String str38 = "n12a_list_" + hashMap.get("screen_id");
                if (hashMap3 != null) {
                    obj3 = hashMap3.get(str38);
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof ArrayList) {
                    arrayList3 = (ArrayList) obj3;
                } else {
                    arrayList3 = null;
                }
                if (arrayList3 != null) {
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj23 : arrayList3) {
                        if (obj23 instanceof N12AItemListModel) {
                            n12AItemListModel = (N12AItemListModel) obj23;
                        } else {
                            n12AItemListModel = null;
                        }
                        if (n12AItemListModel != null) {
                            arrayList11.add(n12AItemListModel);
                        }
                    }
                    arrayList4 = arrayList11;
                } else {
                    arrayList4 = null;
                }
                Object obj24 = hashMap.get("title");
                if (obj24 instanceof String) {
                    str11 = (String) obj24;
                } else {
                    str11 = null;
                }
                Object obj25 = hashMap.get("title_color");
                if (obj25 instanceof String) {
                    str12 = (String) obj25;
                } else {
                    str12 = null;
                }
                Object obj26 = hashMap.get("background_color");
                if (obj26 instanceof String) {
                    str13 = (String) obj26;
                } else {
                    str13 = null;
                }
                Object obj27 = hashMap.get("image");
                if (obj27 instanceof String) {
                    str14 = (String) obj27;
                } else {
                    str14 = null;
                }
                X(str11, arrayList4, str12, str13, str14);
            } else if (is.k.Q1(str2, new String[]{"n12c"})) {
                String str39 = "n12c_list_" + hashMap.get("screen_id");
                if (hashMap3 != null) {
                    obj = hashMap3.get(str39);
                } else {
                    obj = null;
                }
                if (obj instanceof ArrayList) {
                    arrayList = (ArrayList) obj;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj28 : arrayList) {
                        if ((obj28 instanceof pl.f) && ((pl.f) obj28).f28590c != null) {
                            String str40 = ((pl.f) obj28).f28589b;
                            boolean z11 = true;
                            if (str40 != null && !n.B0(str40)) {
                                z10 = false;
                                if (z10 && (newDynamicActivityUploadModel = h0().Z) != null) {
                                    if (i.b(newDynamicActivityUploadModel.getScreenSlug(), hashMap.get(str30)) && i.b(newDynamicActivityUploadModel.getScreenId(), hashMap.get(str31))) {
                                        z11 = false;
                                    }
                                    newDynamicActivityUploadModel = null;
                                    if (newDynamicActivityUploadModel != null && (bitmapList = newDynamicActivityUploadModel.getBitmapList()) != null) {
                                        it = bitmapList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj2 = it.next();
                                                Locale locale = Locale.ENGLISH;
                                                str7 = str33;
                                                i.f(locale, str7);
                                                String lowerCase = ((String) ((hs.f) obj2).f19464u).toLowerCase(locale);
                                                str8 = str30;
                                                str9 = str32;
                                                i.f(lowerCase, str9);
                                                str10 = str31;
                                                String lowerCase2 = ((pl.f) obj28).f28590c.toLowerCase(locale);
                                                i.f(lowerCase2, str9);
                                                if (i.b(lowerCase, lowerCase2)) {
                                                    break;
                                                }
                                                str31 = str10;
                                                str32 = str9;
                                                str30 = str8;
                                                str33 = str7;
                                            } else {
                                                str7 = str33;
                                                str8 = str30;
                                                str9 = str32;
                                                str10 = str31;
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                        fVar = (hs.f) obj2;
                                        if (fVar != null) {
                                            bitmap = (Bitmap) fVar.f19465v;
                                            if (str40 == null && bitmap == null) {
                                                str40 = ((pl.f) obj28).f28588a;
                                            }
                                            gVar = new g(bitmap, str40, ((pl.f) obj28).f28590c);
                                        }
                                        bitmap = null;
                                        if (str40 == null) {
                                            str40 = ((pl.f) obj28).f28588a;
                                        }
                                        gVar = new g(bitmap, str40, ((pl.f) obj28).f28590c);
                                    }
                                }
                                str7 = str33;
                                str8 = str30;
                                str9 = str32;
                                str10 = str31;
                                bitmap = null;
                                if (str40 == null) {
                                }
                                gVar = new g(bitmap, str40, ((pl.f) obj28).f28590c);
                            }
                            z10 = true;
                            if (z10) {
                                if (i.b(newDynamicActivityUploadModel.getScreenSlug(), hashMap.get(str30))) {
                                    z11 = false;
                                }
                                newDynamicActivityUploadModel = null;
                                if (newDynamicActivityUploadModel != null) {
                                    it = bitmapList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                        }
                                        str31 = str10;
                                        str32 = str9;
                                        str30 = str8;
                                        str33 = str7;
                                    }
                                    fVar = (hs.f) obj2;
                                    if (fVar != null) {
                                    }
                                    bitmap = null;
                                    if (str40 == null) {
                                    }
                                    gVar = new g(bitmap, str40, ((pl.f) obj28).f28590c);
                                }
                            }
                            str7 = str33;
                            str8 = str30;
                            str9 = str32;
                            str10 = str31;
                            bitmap = null;
                            if (str40 == null) {
                            }
                            gVar = new g(bitmap, str40, ((pl.f) obj28).f28590c);
                        } else {
                            str7 = str33;
                            str8 = str30;
                            str9 = str32;
                            str10 = str31;
                            gVar = null;
                        }
                        if (gVar != null) {
                            arrayList12.add(gVar);
                        }
                        str31 = str10;
                        str32 = str9;
                        str30 = str8;
                        str33 = str7;
                    }
                    arrayList2 = arrayList12;
                } else {
                    arrayList2 = null;
                }
                Object obj29 = hashMap.get("title");
                if (obj29 instanceof String) {
                    str3 = (String) obj29;
                } else {
                    str3 = null;
                }
                Object obj30 = hashMap.get("title_color");
                if (obj30 instanceof String) {
                    str4 = (String) obj30;
                } else {
                    str4 = null;
                }
                Object obj31 = hashMap.get("background_color");
                if (obj31 instanceof String) {
                    str5 = (String) obj31;
                } else {
                    str5 = null;
                }
                Object obj32 = hashMap.get("image");
                if (obj32 instanceof String) {
                    str6 = (String) obj32;
                } else {
                    str6 = null;
                }
                Y(str3, arrayList2, str4, str5, str6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:434:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x057c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        Object obj;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        String str2;
        String str3;
        String str4;
        String str5;
        g gVar;
        String str6;
        String str7;
        Object obj2;
        ArrayList arrayList3;
        ArrayList<String> arrayList4;
        String str8;
        String str9;
        ArrayList arrayList5;
        Object obj3;
        ArrayList arrayList6;
        String str10;
        Object obj4;
        String str11;
        Object obj5;
        String str12;
        String str13;
        Object obj6;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        ArrayList arrayList7;
        String str30;
        Object obj7;
        ArrayList arrayList8;
        ArrayList<String> arrayList9;
        String str31;
        String str32;
        ArrayList arrayList10;
        ArrayList arrayList11;
        String str33;
        Object obj8;
        String str34;
        Object obj9;
        String str35;
        String str36;
        Object obj10;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        ArrayList arrayList12;
        String str53;
        String str54;
        Object obj11;
        ArrayList arrayList13;
        ArrayList<String> arrayList14;
        ArrayList<String> arrayList15;
        Object obj12;
        String str55;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        Object obj13;
        String str61;
        String str62;
        String str63;
        String str64;
        try {
            Object obj14 = hashMap.get("slug");
            if (is.k.Q1(obj14, new String[]{"n4a"})) {
                String str65 = "n4_data_" + hashMap.get("screen_id");
                Object obj15 = hashMap.get("title");
                if (obj15 instanceof String) {
                    str60 = (String) obj15;
                } else {
                    str60 = null;
                }
                if (hashMap2 != null) {
                    obj13 = hashMap2.get(str65);
                } else {
                    obj13 = null;
                }
                if (obj13 instanceof String) {
                    str61 = (String) obj13;
                } else {
                    str61 = null;
                }
                Object obj16 = hashMap.get("title_color");
                if (obj16 instanceof String) {
                    str62 = (String) obj16;
                } else {
                    str62 = null;
                }
                Object obj17 = hashMap.get("background_color");
                if (obj17 instanceof String) {
                    str63 = (String) obj17;
                } else {
                    str63 = null;
                }
                Object obj18 = hashMap.get("image");
                if (obj18 instanceof String) {
                    str64 = (String) obj18;
                } else {
                    str64 = null;
                }
                Z(str60, str61, str62, str63, str64);
            } else if (is.k.Q1(obj14, new String[]{"n5a"})) {
                String str66 = "n5_list_" + hashMap.get("screen_id");
                String str67 = "n5_data_" + hashMap.get("screen_id");
                Object obj19 = hashMap.get("title");
                if (obj19 instanceof String) {
                    str54 = (String) obj19;
                } else {
                    str54 = null;
                }
                if (hashMap2 != null) {
                    obj11 = hashMap2.get(str66);
                } else {
                    obj11 = null;
                }
                if (obj11 instanceof ArrayList) {
                    arrayList13 = (ArrayList) obj11;
                } else {
                    arrayList13 = null;
                }
                if (arrayList13 != null) {
                    arrayList14 = new ArrayList<>();
                    for (Object obj20 : arrayList13) {
                        if (obj20 instanceof String) {
                            str59 = (String) obj20;
                        } else {
                            str59 = null;
                        }
                        if (str59 != null) {
                            arrayList14.add(str59);
                        }
                    }
                } else {
                    arrayList14 = null;
                }
                if (arrayList14 instanceof ArrayList) {
                    arrayList15 = arrayList14;
                } else {
                    arrayList15 = null;
                }
                if (hashMap2 != null) {
                    obj12 = hashMap2.get(str67);
                } else {
                    obj12 = null;
                }
                if (obj12 instanceof String) {
                    str55 = (String) obj12;
                } else {
                    str55 = null;
                }
                Object obj21 = hashMap.get("title_color");
                if (obj21 instanceof String) {
                    str56 = (String) obj21;
                } else {
                    str56 = null;
                }
                Object obj22 = hashMap.get("background_color");
                if (obj22 instanceof String) {
                    str57 = (String) obj22;
                } else {
                    str57 = null;
                }
                Object obj23 = hashMap.get("image");
                if (obj23 instanceof String) {
                    str58 = (String) obj23;
                } else {
                    str58 = null;
                }
                a0(str54, arrayList15, str55, str56, str57, str58);
            } else {
                String str68 = "option_id";
                if (!is.k.Q1(obj14, new String[]{"n6a"})) {
                    Object obj24 = "option_id";
                    Object obj25 = "title_color";
                    if (is.k.Q1(obj14, new String[]{"n12a"})) {
                        String str69 = "n12a_list_" + hashMap.get("screen_id");
                        if (hashMap2 != null) {
                            obj2 = hashMap2.get(str69);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof ArrayList) {
                            arrayList3 = (ArrayList) obj2;
                        } else {
                            arrayList3 = null;
                        }
                        if (arrayList3 != null) {
                            arrayList4 = new ArrayList();
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                Iterator it2 = it;
                                if (next instanceof String) {
                                    str30 = (String) next;
                                } else {
                                    str30 = null;
                                }
                                if (str30 != null) {
                                    arrayList4.add(str30);
                                }
                                it = it2;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        t h02 = h0();
                        Object obj26 = hashMap.get("screen_id");
                        if (obj26 instanceof String) {
                            str8 = (String) obj26;
                        } else {
                            str8 = null;
                        }
                        Object obj27 = hashMap.get("screen_fetched_data_slug");
                        if (obj27 instanceof String) {
                            str9 = (String) obj27;
                        } else {
                            str9 = null;
                        }
                        Object l2 = h02.l(str8, str9);
                        if (l2 instanceof ArrayList) {
                            arrayList5 = (ArrayList) l2;
                        } else {
                            arrayList5 = null;
                        }
                        if (arrayList5 != null) {
                            arrayList6 = new ArrayList(is.i.H1(arrayList5, 10));
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                HashMap hashMap3 = (HashMap) it3.next();
                                Iterator it4 = it3;
                                Object obj28 = obj25;
                                Object obj29 = obj24;
                                Object obj30 = hashMap3.get(obj29);
                                obj24 = obj29;
                                if (obj30 instanceof String) {
                                    str14 = (String) obj30;
                                } else {
                                    str14 = null;
                                }
                                if (str14 == null) {
                                    str15 = "";
                                } else {
                                    str15 = str14;
                                }
                                Object obj31 = hashMap3.get("option_title");
                                if (obj31 instanceof String) {
                                    str16 = (String) obj31;
                                } else {
                                    str16 = null;
                                }
                                if (str16 == null) {
                                    str17 = "";
                                } else {
                                    str17 = str16;
                                }
                                Object obj32 = hashMap3.get("option_description");
                                if (obj32 instanceof String) {
                                    str18 = (String) obj32;
                                } else {
                                    str18 = null;
                                }
                                if (str18 == null) {
                                    str19 = "";
                                } else {
                                    str19 = str18;
                                }
                                Object obj33 = hashMap3.get("option_image_title");
                                if (obj33 instanceof String) {
                                    str20 = (String) obj33;
                                } else {
                                    str20 = null;
                                }
                                if (str20 == null) {
                                    str21 = "";
                                } else {
                                    str21 = str20;
                                }
                                Object obj34 = hashMap3.get("option_image");
                                if (obj34 instanceof String) {
                                    str22 = (String) obj34;
                                } else {
                                    str22 = null;
                                }
                                if (str22 == null) {
                                    str23 = "";
                                } else {
                                    str23 = str22;
                                }
                                Object obj35 = hashMap3.get("option_example_title");
                                if (obj35 instanceof String) {
                                    str24 = (String) obj35;
                                } else {
                                    str24 = null;
                                }
                                if (str24 == null) {
                                    str25 = "";
                                } else {
                                    str25 = str24;
                                }
                                Object obj36 = hashMap3.get("option_example_body");
                                if (obj36 instanceof String) {
                                    str26 = (String) obj36;
                                } else {
                                    str26 = null;
                                }
                                if (str26 == null) {
                                    str27 = "";
                                } else {
                                    str27 = str26;
                                }
                                Object obj37 = hashMap3.get("option_card_title");
                                if (obj37 instanceof String) {
                                    str28 = (String) obj37;
                                } else {
                                    str28 = null;
                                }
                                if (str28 == null) {
                                    str29 = "";
                                } else {
                                    str29 = str28;
                                }
                                Object obj38 = hashMap3.get("option_card_list");
                                if (obj38 instanceof ArrayList) {
                                    arrayList7 = (ArrayList) obj38;
                                } else {
                                    arrayList7 = null;
                                }
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList6.add(new N12AItemListModel(str15, str17, str19, str21, str23, str25, str27, str29, arrayList7));
                                it3 = it4;
                                obj25 = obj28;
                            }
                            obj3 = obj25;
                        } else {
                            obj3 = obj25;
                            arrayList6 = null;
                        }
                        if (arrayList4 != null && arrayList6 != null) {
                            Object obj39 = hashMap.get("title");
                            if (obj39 instanceof String) {
                                str10 = (String) obj39;
                            } else {
                                str10 = null;
                            }
                            ArrayList arrayList16 = new ArrayList();
                            for (String str70 : arrayList4) {
                                Iterator it5 = arrayList6.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj6 = it5.next();
                                        if (i.b(((N12AItemListModel) obj6).getId(), str70)) {
                                            break;
                                        }
                                    } else {
                                        obj6 = null;
                                        break;
                                    }
                                }
                                N12AItemListModel n12AItemListModel = (N12AItemListModel) obj6;
                                if (n12AItemListModel != null) {
                                    arrayList16.add(n12AItemListModel);
                                }
                            }
                            Object obj40 = hashMap.get(obj3);
                            if (!(obj40 instanceof String)) {
                                obj4 = "background_color";
                                str11 = null;
                            } else {
                                str11 = (String) obj40;
                                obj4 = "background_color";
                            }
                            Object obj41 = hashMap.get(obj4);
                            if (!(obj41 instanceof String)) {
                                obj5 = "image";
                                str12 = null;
                            } else {
                                str12 = (String) obj41;
                                obj5 = "image";
                            }
                            Object obj42 = hashMap.get(obj5);
                            if (obj42 instanceof String) {
                                str13 = (String) obj42;
                            } else {
                                str13 = null;
                            }
                            X(str10, arrayList16, str11, str12, str13);
                        }
                    } else if (is.k.Q1(obj14, new String[]{"n12c"})) {
                        String str71 = "n12c_list_" + hashMap.get("screen_id");
                        if (hashMap2 != null) {
                            obj = hashMap2.get(str71);
                        } else {
                            obj = null;
                        }
                        if (obj instanceof ArrayList) {
                            arrayList = (ArrayList) obj;
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            ArrayList arrayList17 = new ArrayList();
                            for (Object obj43 : arrayList) {
                                if (obj43 instanceof HashMap) {
                                    Object obj44 = ((Map) obj43).get("text");
                                    if (obj44 instanceof String) {
                                        str6 = (String) obj44;
                                    } else {
                                        str6 = null;
                                    }
                                    Object obj45 = ((Map) obj43).get("imageLink");
                                    if (obj45 instanceof String) {
                                        str7 = (String) obj45;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 != null && str6 != null) {
                                        gVar = new g(null, str7, str6);
                                        if (gVar == null) {
                                            arrayList17.add(gVar);
                                        }
                                    }
                                }
                                gVar = null;
                                if (gVar == null) {
                                }
                            }
                            str = null;
                            arrayList2 = arrayList17;
                        } else {
                            str = null;
                            arrayList2 = null;
                        }
                        Object obj46 = hashMap.get("title");
                        if (obj46 instanceof String) {
                            str2 = (String) obj46;
                        } else {
                            str2 = str;
                        }
                        Object obj47 = hashMap.get(obj25);
                        if (obj47 instanceof String) {
                            str3 = (String) obj47;
                        } else {
                            str3 = str;
                        }
                        Object obj48 = hashMap.get("background_color");
                        if (obj48 instanceof String) {
                            str4 = (String) obj48;
                        } else {
                            str4 = str;
                        }
                        Object obj49 = hashMap.get("image");
                        if (obj49 instanceof String) {
                            str5 = (String) obj49;
                        } else {
                            str5 = str;
                        }
                        Y(str2, arrayList2, str3, str4, str5);
                    }
                } else {
                    String str72 = "n6a_list_" + hashMap.get("screen_id");
                    if (hashMap2 != null) {
                        obj7 = hashMap2.get(str72);
                    } else {
                        obj7 = null;
                    }
                    if (obj7 instanceof ArrayList) {
                        arrayList8 = (ArrayList) obj7;
                    } else {
                        arrayList8 = null;
                    }
                    if (arrayList8 != null) {
                        arrayList9 = new ArrayList();
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            Object next2 = it6.next();
                            Iterator it7 = it6;
                            if (next2 instanceof String) {
                                str53 = (String) next2;
                            } else {
                                str53 = null;
                            }
                            if (str53 != null) {
                                arrayList9.add(str53);
                            }
                            it6 = it7;
                        }
                    } else {
                        arrayList9 = null;
                    }
                    t h03 = h0();
                    Object obj50 = hashMap.get("screen_id");
                    if (obj50 instanceof String) {
                        str31 = (String) obj50;
                    } else {
                        str31 = null;
                    }
                    Object obj51 = hashMap.get("screen_fetched_data_slug");
                    if (obj51 instanceof String) {
                        str32 = (String) obj51;
                    } else {
                        str32 = null;
                    }
                    Object l10 = h03.l(str31, str32);
                    if (l10 instanceof ArrayList) {
                        arrayList10 = (ArrayList) l10;
                    } else {
                        arrayList10 = null;
                    }
                    if (arrayList10 != null) {
                        arrayList11 = new ArrayList(is.i.H1(arrayList10, 10));
                        Iterator it8 = arrayList10.iterator();
                        while (it8.hasNext()) {
                            HashMap hashMap4 = (HashMap) it8.next();
                            Iterator it9 = it8;
                            Object obj52 = hashMap4.get(str68);
                            String str73 = str68;
                            if (obj52 instanceof String) {
                                str37 = (String) obj52;
                            } else {
                                str37 = null;
                            }
                            if (str37 == null) {
                                str38 = "";
                            } else {
                                str38 = str37;
                            }
                            Object obj53 = hashMap4.get("option_title");
                            if (obj53 instanceof String) {
                                str39 = (String) obj53;
                            } else {
                                str39 = null;
                            }
                            if (str39 == null) {
                                str40 = "";
                            } else {
                                str40 = str39;
                            }
                            Object obj54 = hashMap4.get("option_description");
                            if (obj54 instanceof String) {
                                str41 = (String) obj54;
                            } else {
                                str41 = null;
                            }
                            if (str41 == null) {
                                str42 = "";
                            } else {
                                str42 = str41;
                            }
                            Object obj55 = hashMap4.get("option_image_title");
                            if (obj55 instanceof String) {
                                str43 = (String) obj55;
                            } else {
                                str43 = null;
                            }
                            if (str43 == null) {
                                str44 = "";
                            } else {
                                str44 = str43;
                            }
                            Object obj56 = hashMap4.get("option_image");
                            if (obj56 instanceof String) {
                                str45 = (String) obj56;
                            } else {
                                str45 = null;
                            }
                            if (str45 == null) {
                                str46 = "";
                            } else {
                                str46 = str45;
                            }
                            Object obj57 = hashMap4.get("option_example_title");
                            if (obj57 instanceof String) {
                                str47 = (String) obj57;
                            } else {
                                str47 = null;
                            }
                            if (str47 == null) {
                                str48 = "";
                            } else {
                                str48 = str47;
                            }
                            Object obj58 = hashMap4.get("option_example_body");
                            if (obj58 instanceof String) {
                                str49 = (String) obj58;
                            } else {
                                str49 = null;
                            }
                            if (str49 == null) {
                                str50 = "";
                            } else {
                                str50 = str49;
                            }
                            Object obj59 = hashMap4.get("option_card_title");
                            if (obj59 instanceof String) {
                                str51 = (String) obj59;
                            } else {
                                str51 = null;
                            }
                            if (str51 == null) {
                                str52 = "";
                            } else {
                                str52 = str51;
                            }
                            Object obj60 = hashMap4.get("option_card_list");
                            if (obj60 instanceof ArrayList) {
                                arrayList12 = (ArrayList) obj60;
                            } else {
                                arrayList12 = null;
                            }
                            if (arrayList12 == null) {
                                arrayList12 = new ArrayList();
                            }
                            arrayList11.add(new N12AItemListModel(str38, str40, str42, str44, str46, str48, str50, str52, arrayList12));
                            it8 = it9;
                            str68 = str73;
                        }
                    } else {
                        arrayList11 = null;
                    }
                    if (arrayList9 != null && arrayList11 != null) {
                        Object obj61 = hashMap.get("title");
                        if (obj61 instanceof String) {
                            str33 = (String) obj61;
                        } else {
                            str33 = null;
                        }
                        ArrayList arrayList18 = new ArrayList();
                        for (String str74 : arrayList9) {
                            Iterator it10 = arrayList11.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    obj10 = it10.next();
                                    if (i.b(((N12AItemListModel) obj10).getId(), str74)) {
                                        break;
                                    }
                                } else {
                                    obj10 = null;
                                    break;
                                }
                            }
                            N12AItemListModel n12AItemListModel2 = (N12AItemListModel) obj10;
                            if (n12AItemListModel2 != null) {
                                arrayList18.add(n12AItemListModel2);
                            }
                        }
                        Object obj62 = hashMap.get("title_color");
                        if (!(obj62 instanceof String)) {
                            obj8 = "background_color";
                            str34 = null;
                        } else {
                            str34 = (String) obj62;
                            obj8 = "background_color";
                        }
                        Object obj63 = hashMap.get(obj8);
                        if (!(obj63 instanceof String)) {
                            obj9 = "image";
                            str35 = null;
                        } else {
                            str35 = (String) obj63;
                            obj9 = "image";
                        }
                        Object obj64 = hashMap.get(obj9);
                        if (obj64 instanceof String) {
                            str36 = (String) obj64;
                        } else {
                            str36 = null;
                        }
                        b0(str33, arrayList18, str34, str35, str36);
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    public final t h0() {
        return (t) this.f10913x.getValue();
    }

    public final void j0() {
        Serializable serializable;
        HashMap<String, Object> hashMap;
        String str;
        Object obj;
        Long l2;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("fetchedGoalData");
            } else {
                serializable = null;
            }
            if (serializable instanceof HashMap) {
                hashMap = (HashMap) serializable;
            } else {
                hashMap = null;
            }
            this.D = hashMap;
            if (this.E) {
                if (hashMap != null) {
                    obj = hashMap.get("date");
                } else {
                    obj = null;
                }
                if (obj instanceof Long) {
                    l2 = (Long) obj;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    U(h0().f29790z.d(l2.longValue(), "dd MMMM, hh:mm a"));
                }
            }
            for (HashMap<String, Object> hashMap2 : this.A) {
                Object obj2 = hashMap2.get("item_type");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (i.b(str, "regular")) {
                    g0(hashMap2, this.D);
                } else if (i.b(str, "conditionalSelectionInRange")) {
                    Q(hashMap2, this.D);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    public final void k0() {
        String str;
        Object obj;
        Long l2;
        try {
            HashMap<hs.f<String, String>, HashMap<String, Object>> hashMap = h0().V;
            if (this.E) {
                HashMap<String, Object> hashMap2 = hashMap.get(new hs.f("global_data", "global_data_id"));
                if (hashMap2 != null) {
                    obj = hashMap2.get("date");
                } else {
                    obj = null;
                }
                if (obj instanceof Long) {
                    l2 = (Long) obj;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    U(h0().f29790z.d(l2.longValue(), "dd MMMM, hh:mm a"));
                }
            }
            for (HashMap<String, Object> hashMap3 : this.A) {
                Object obj2 = hashMap3.get("item_type");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (i.b(str, "regular")) {
                    c0(hashMap3, hashMap);
                } else if (i.b(str, "conditionalSelectionInRange")) {
                    P(hashMap3, hashMap);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    public final void m0(ArrayList<HashMap<String, Object>> arrayList) {
        String str;
        try {
            ArrayList arrayList2 = new ArrayList();
            if (this.E) {
                arrayList2.add(new hs.f("global_data", "global_data_id"));
            }
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                HashMap hashMap = (HashMap) it.next();
                Object obj = hashMap.get("slug");
                String str2 = null;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = hashMap.get("screen_id");
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                }
                arrayList2.add(new hs.f(str, str2));
            }
            t h02 = h0();
            h02.getClass();
            h02.F = new ArrayList<>(arrayList2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    public final void n0(String str, String str2, boolean z10) {
        boolean z11 = this.L;
        if (!z11 || !z10) {
            if (!z11 && !z10) {
                return;
            }
            if (z10) {
                View inflate = requireActivity().getLayoutInflater().inflate(R.layout.fragment_n10_screen_upload_failure_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer)), false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenUploadFailureRowHeader);
                if (robertoTextView != null) {
                    robertoTextView.setText(str);
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvFragmentN10ScreenUploadFailureRowSubHeader);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(str2);
                }
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
                if (linearLayout != null) {
                    linearLayout.addView(inflate);
                }
            } else {
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
                if (linearLayout2 != null) {
                    int childCount = linearLayout2.getChildCount();
                    LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R.id.llFragmentN10ItemContainer);
                    if (linearLayout3 != null) {
                        linearLayout3.removeViewAt(childCount - 1);
                    }
                }
            }
            this.L = z10;
        }
    }

    public final void o0() {
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        Object obj;
        String str = null;
        if (!this.J) {
            n0(null, null, false);
        }
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            newDynamicParentActivity.E0("cta_type_5");
        }
        p requireActivity2 = requireActivity();
        if (requireActivity2 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
        } else {
            newDynamicParentActivity2 = null;
        }
        if (newDynamicParentActivity2 != null) {
            HashMap<String, Object> hashMap = this.H;
            if (hashMap != null) {
                obj = hashMap.get("upload_progress");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = obj;
            }
            NewDynamicParentActivity.F0(newDynamicParentActivity2, "", "", null, str, 4);
        }
        if (this.J) {
            this.J = false;
            h0().f29779a0.e(getViewLifecycleOwner(), new hl.p(11, new b()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n10_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        boolean z10;
        String str;
        Boolean bool;
        String str2;
        Boolean bool2;
        boolean z11;
        NewDynamicParentActivity newDynamicParentActivity;
        Boolean bool3;
        NewDynamicParentActivity newDynamicParentActivity2;
        String str3;
        String str4;
        String string;
        String str5;
        Boolean bool4;
        NewDynamicParentActivity newDynamicParentActivity3;
        Integer num;
        NewDynamicParentActivity newDynamicParentActivity4;
        i.g(view, "view");
        try {
            Bundle arguments = getArguments();
            int i10 = -1;
            if (arguments != null) {
                i6 = arguments.getInt("customBackStackPopCount");
            } else {
                i6 = -1;
            }
            this.f10914y = i6;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                i10 = arguments2.getInt(Constants.DAYMODEL_POSITION, -1);
            }
            this.f10915z = i10;
            Bundle arguments3 = getArguments();
            boolean z12 = false;
            if (arguments3 != null) {
                z10 = arguments3.getBoolean("isGoalDataShow", false);
            } else {
                z10 = false;
            }
            this.B = z10;
            NewDynamicParentActivity newDynamicParentActivity5 = null;
            if (z10) {
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    str5 = arguments4.getString("display_n10_id");
                } else {
                    str5 = null;
                }
                this.C = str5;
                Object l2 = h0().l(this.C, "show_date");
                if (l2 instanceof Boolean) {
                    bool4 = (Boolean) l2;
                } else {
                    bool4 = null;
                }
                if (bool4 != null) {
                    z12 = bool4.booleanValue();
                }
                this.E = z12;
                p0();
                p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity3 = null;
                }
                if (newDynamicParentActivity3 != null) {
                    num = newDynamicParentActivity3.x0();
                } else {
                    num = null;
                }
                this.G = num;
                p requireActivity2 = requireActivity();
                if (requireActivity2 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                } else {
                    newDynamicParentActivity4 = null;
                }
                if (newDynamicParentActivity4 != null) {
                    newDynamicParentActivity4.O0(Boolean.FALSE);
                }
                j0();
            } else {
                t h02 = h0();
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    str = arguments5.getString("screenId");
                } else {
                    str = null;
                }
                Object l10 = h02.l(str, "show_date");
                if (l10 instanceof Boolean) {
                    bool = (Boolean) l10;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    z12 = bool.booleanValue();
                }
                this.E = z12;
                t h03 = h0();
                Bundle arguments6 = getArguments();
                if (arguments6 != null) {
                    str2 = arguments6.getString("screenId");
                } else {
                    str2 = null;
                }
                Object l11 = h03.l(str2, "save_logs");
                if (l11 instanceof Boolean) {
                    bool2 = (Boolean) l11;
                } else {
                    bool2 = null;
                }
                if (bool2 != null) {
                    z11 = bool2.booleanValue();
                } else {
                    z11 = true;
                }
                this.F = z11;
                p0();
                k0();
                p requireActivity3 = requireActivity();
                if (requireActivity3 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity3;
                } else {
                    newDynamicParentActivity = null;
                }
                if (newDynamicParentActivity != null) {
                    Bundle arguments7 = getArguments();
                    if (arguments7 != null) {
                        bool3 = Boolean.valueOf(arguments7.getBoolean("show_info_button"));
                    } else {
                        bool3 = null;
                    }
                    newDynamicParentActivity.O0(bool3);
                }
            }
            p requireActivity4 = requireActivity();
            if (requireActivity4 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                t h04 = h0();
                Bundle arguments8 = getArguments();
                String str6 = "";
                Object k10 = h04.k(this.f10915z, (arguments8 == null || (r10 = arguments8.getString("slug")) == null) ? "" : "", "cta1");
                if (k10 instanceof String) {
                    str3 = (String) k10;
                } else {
                    str3 = null;
                }
                t h05 = h0();
                Bundle arguments9 = getArguments();
                if (arguments9 != null && (string = arguments9.getString("slug")) != null) {
                    str6 = string;
                }
                Object k11 = h05.k(this.f10915z, str6, "cta2");
                if (k11 instanceof String) {
                    str4 = (String) k11;
                } else {
                    str4 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity2, str3, str4, null, null, 12);
            }
            p requireActivity5 = requireActivity();
            if (requireActivity5 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity5 = (NewDynamicParentActivity) requireActivity5;
            }
            if (newDynamicParentActivity5 != null) {
                newDynamicParentActivity5.E0("cta_type_2");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    public final void p0() {
        String str;
        Integer num;
        String str2;
        ArrayList<HashMap<String, Object>> arrayList;
        String str3;
        try {
            t h02 = h0();
            Bundle arguments = getArguments();
            ArrayList<HashMap> arrayList2 = null;
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
            HashMap<String, Object> m10 = h02.m(num, str);
            this.H = m10;
            q0(m10);
            if (this.B) {
                Object l2 = h0().l(this.C, "items");
                if (l2 instanceof ArrayList) {
                    arrayList = (ArrayList) l2;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                Object l10 = h0().l(this.C, "conditional_box_selection_in_range");
                if (l10 instanceof ArrayList) {
                    arrayList2 = (ArrayList) l10;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
            } else {
                t h03 = h0();
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    str2 = arguments3.getString("screenId");
                } else {
                    str2 = null;
                }
                Object l11 = h03.l(str2, "items");
                if (l11 instanceof ArrayList) {
                    arrayList = (ArrayList) l11;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                t h04 = h0();
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    str3 = arguments4.getString("screenId");
                } else {
                    str3 = null;
                }
                Object l12 = h04.l(str3, "conditional_box_selection_in_range");
                if (l12 instanceof ArrayList) {
                    arrayList2 = (ArrayList) l12;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
            }
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((HashMap) it.next()).put("item_type", "regular");
            }
            if (this.F) {
                m0(arrayList);
            }
            for (HashMap hashMap : arrayList2) {
                hashMap.put("item_type", "conditionalSelectionInRange");
            }
            ArrayList<HashMap<String, Object>> arrayList3 = new ArrayList<>();
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            if (arrayList3.size() > 1) {
                is.p.P1(arrayList3, new c());
            }
            this.A = arrayList3;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10912w, e10);
        }
    }

    public final void q0(HashMap<String, Object> hashMap) {
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
                LogHelper.INSTANCE.e(this.f10912w, "exception", e10);
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
                if (str3 != null && (w03 = m.w0(str3)) != null) {
                    i6 = w03.intValue();
                } else {
                    i6 = 0;
                }
                if (str4 != null && (w02 = m.w0(str4)) != null) {
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
}
