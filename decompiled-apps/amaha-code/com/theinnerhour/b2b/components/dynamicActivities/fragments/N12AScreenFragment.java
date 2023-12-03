package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityScreenDataClass;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.n;
import gv.r;
import is.p;
import is.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ql.t;
/* compiled from: N12AScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N12AScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N12AScreenFragment extends rr.d {
    public static final /* synthetic */ int I = 0;
    public int D;
    public Integer E;
    public Integer F;
    public Integer G;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10921w = LogHelper.INSTANCE.makeLogTag("N12AScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f10922x = b0.j(this, y.a(t.class), new b(this), new c(this), new d(this));

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<N12AItemListModel> f10923y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<N12AItemListModel> f10924z = new ArrayList<>();
    public String A = "";
    public String B = "";
    public int C = -1;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            int i6;
            N12AItemListModel n12AItemListModel = (N12AItemListModel) t3;
            N12AScreenFragment n12AScreenFragment = N12AScreenFragment.this;
            Iterator<N12AItemListModel> it = n12AScreenFragment.f10924z.iterator();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i6 = -1;
                if (it.hasNext()) {
                    if (i.b(it.next().getId(), n12AItemListModel.getId())) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i11);
            N12AItemListModel n12AItemListModel2 = (N12AItemListModel) t10;
            Iterator<N12AItemListModel> it2 = n12AScreenFragment.f10924z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (i.b(it2.next().getId(), n12AItemListModel2.getId())) {
                    i6 = i10;
                    break;
                } else {
                    i10++;
                }
            }
            return sp.b.g(valueOf, Integer.valueOf(i6));
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10926u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f10926u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f10926u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10927u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f10927u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f10927u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10928u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f10928u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f10928u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.d
    public final void K() {
        NewDynamicParentActivity newDynamicParentActivity;
        String str;
        String str2;
        String str3;
        try {
            if (U()) {
                ArrayList<N12AItemListModel> arrayList = this.f10923y;
                if (arrayList.size() > 1) {
                    p.P1(arrayList, new a());
                }
                Collections.reverse(arrayList);
                t Q = Q();
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                Iterator<N12AItemListModel> it = arrayList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    N12AItemListModel next = it.next();
                    int i10 = i6 + 1;
                    if (i6 >= 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("n13b_data", next);
                        Object k10 = Q().k(this.C, this.A, "option_cta1");
                        if (k10 instanceof String) {
                            str = (String) k10;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        hashMap.put("n13b_cta_1", str);
                        Iterator<N12AItemListModel> it2 = it;
                        Object k11 = Q().k(this.C, this.A, "option_cta2");
                        if (k11 instanceof String) {
                            str2 = (String) k11;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        hashMap.put("n13b_cta_2", str2);
                        Object k12 = Q().k(this.C, this.A, "option_cta_prompt");
                        if (k12 instanceof String) {
                            str3 = (String) k12;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        hashMap.put("n13b_cta_prompt", str3);
                        hashMap.put("n13b_index", Integer.valueOf((arrayList.size() - 1) - i6));
                        hashMap.put("parentSlug", this.A);
                        hashMap.put("parentScreenId", this.B);
                        hashMap.put("parentDataSlug", "n12a_list_" + this.B);
                        hs.k kVar = hs.k.f19476a;
                        arrayList2.add(new NewDynamicActivityScreenDataClass("", "N13B", "cta_type_3", hashMap));
                        i6 = i10;
                        it = it2;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
                Q.g(arrayList2);
                t Q2 = Q();
                String str4 = this.A;
                String str5 = this.B;
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("n12a_list_" + this.B, arrayList.clone());
                hs.k kVar2 = hs.k.f19476a;
                Q2.t(str4, str5, hashMap2);
                androidx.fragment.app.p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity = null;
                }
                if (newDynamicParentActivity != null) {
                    int i11 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10921w, e10);
        }
    }

    public final void P(N12AItemListModel n12AItemListModel) {
        View findViewById;
        try {
            View inflate = requireActivity().getLayoutInflater().inflate(R.layout.row_n12a_item, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN12BScreenOptionsContainer)), false);
            Glide.i(requireActivity()).p(n12AItemListModel.getImageLink()).B((ImageView) inflate.findViewById(R.id.ivRowN6AImage));
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvRowN6ATitle);
            if (robertoTextView != null) {
                robertoTextView.setText(n12AItemListModel.getHeader());
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvRowN6ASubTitle);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(n12AItemListModel.getSubHeader());
            }
            inflate.setOnClickListener(new dk.t(20, this, inflate, n12AItemListModel));
            if (this.f10923y.contains(n12AItemListModel) && (findViewById = inflate.findViewById(R.id.clRowN6AParentContainer)) != null) {
                findViewById.setBackgroundColor(g0.a.b(requireActivity(), R.color.templateMossGreen));
            }
            ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN12BScreenOptionsContainer)).addView(inflate);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10921w, e10);
        }
    }

    public final t Q() {
        return (t) this.f10922x.getValue();
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
                LogHelper.INSTANCE.e(this.f10921w, "exception", e10);
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
        androidx.fragment.app.p requireActivity = requireActivity();
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
            androidx.fragment.app.p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                newDynamicParentActivity2.M0();
            }
            androidx.fragment.app.p requireActivity3 = requireActivity();
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
        androidx.fragment.app.p requireActivity4 = requireActivity();
        if (requireActivity4 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity4;
        }
        if (newDynamicParentActivity3 != null) {
            newDynamicParentActivity3.y0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r4 != r10.intValue()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U() {
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        try {
            Integer num = this.G;
            String str = null;
            ArrayList<N12AItemListModel> arrayList = this.f10923y;
            if (num != null) {
                int size = arrayList.size();
                Integer num2 = this.G;
                if (num2 != null) {
                }
                Integer num3 = this.G;
                i.d(num3);
                if (num3.intValue() <= 1) {
                    sb4 = new StringBuilder();
                    sb4.append(this.G);
                    sb4.append(" option");
                } else {
                    sb4 = new StringBuilder();
                    sb4.append(this.G);
                    sb4.append(" options");
                }
                String sb5 = sb4.toString();
                Object k10 = Q().k(this.C, this.A, "exact_error");
                if (k10 instanceof String) {
                    str = (String) k10;
                }
                if (str == null) {
                    str = "Please select exactly " + sb5;
                }
                Toast.makeText(requireActivity(), str, 0).show();
                return false;
            }
            if (this.E != null) {
                int size2 = arrayList.size();
                Integer num4 = this.E;
                i.d(num4);
                if (size2 < num4.intValue()) {
                    Integer num5 = this.E;
                    i.d(num5);
                    if (num5.intValue() <= 1) {
                        sb3 = new StringBuilder();
                        sb3.append(this.E);
                        sb3.append(" option");
                    } else {
                        sb3 = new StringBuilder();
                        sb3.append(this.E);
                        sb3.append(" options");
                    }
                    String sb6 = sb3.toString();
                    Object k11 = Q().k(this.C, this.A, "min_error");
                    if (k11 instanceof String) {
                        str = (String) k11;
                    }
                    if (str == null) {
                        str = "Please select at least " + sb6;
                    }
                    Toast.makeText(requireActivity(), str, 0).show();
                    return false;
                }
            }
            if (this.F != null) {
                int size3 = arrayList.size();
                Integer num6 = this.F;
                i.d(num6);
                if (size3 > num6.intValue()) {
                    Integer num7 = this.F;
                    i.d(num7);
                    if (num7.intValue() <= 1) {
                        sb2 = new StringBuilder();
                        sb2.append(this.F);
                        sb2.append(" option");
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(this.F);
                        sb2.append(" options");
                    }
                    String sb7 = sb2.toString();
                    Object k12 = Q().k(this.C, this.A, "max_error");
                    if (k12 instanceof String) {
                        str = (String) k12;
                    }
                    if (str == null) {
                        str = "Please select at most " + sb7;
                    }
                    Toast.makeText(requireActivity(), str, 0).show();
                    return false;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10921w, e10);
        }
        return true;
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.H.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.H;
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
        return inflater.inflate(R.layout.fragment_n12b_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0152 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0158 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0171 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0177 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0198 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bd A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e8 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ee A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ec A[Catch: Exception -> 0x02f6, LOOP:1: B:216:0x02e6->B:218:0x02ec, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124 A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b A[Catch: Exception -> 0x02f6, TryCatch #0 {Exception -> 0x02f6, blocks: (B:3:0x000c, B:6:0x0014, B:12:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0037, B:23:0x0042, B:25:0x0046, B:27:0x005f, B:28:0x006c, B:30:0x0070, B:32:0x0078, B:35:0x007e, B:36:0x0083, B:38:0x008d, B:40:0x0093, B:42:0x0099, B:44:0x00a3, B:46:0x00a9, B:48:0x00b1, B:50:0x00b5, B:53:0x00bb, B:58:0x00c5, B:60:0x00cb, B:62:0x00cf, B:64:0x00d7, B:66:0x00db, B:69:0x00e1, B:74:0x00eb, B:76:0x00f1, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:85:0x0107, B:90:0x0111, B:92:0x0117, B:94:0x0124, B:97:0x012b, B:99:0x013d, B:101:0x0142, B:102:0x014a, B:104:0x0152, B:107:0x0158, B:109:0x015e, B:111:0x0166, B:112:0x0169, B:114:0x0171, B:117:0x0177, B:119:0x017d, B:121:0x0189, B:122:0x018c, B:130:0x01b1, B:138:0x01d6, B:140:0x01e8, B:143:0x01ee, B:144:0x01f7, B:146:0x01fd, B:148:0x0205, B:150:0x0214, B:155:0x021d, B:157:0x022a, B:162:0x0233, B:164:0x0240, B:169:0x0249, B:171:0x0256, B:176:0x025f, B:178:0x026c, B:183:0x0275, B:185:0x0282, B:190:0x028b, B:192:0x0298, B:197:0x02a1, B:199:0x02ae, B:204:0x02b9, B:206:0x02c5, B:209:0x02cb, B:210:0x02d0, B:213:0x02da, B:214:0x02df, B:215:0x02e2, B:216:0x02e6, B:218:0x02ec, B:133:0x01bd, B:135:0x01cf, B:137:0x01d3, B:125:0x0198, B:127:0x01aa, B:129:0x01ae), top: B:223:0x000c }] */
    @Override // rr.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i6;
        String str2;
        String str3;
        Integer num;
        Object obj;
        String str4;
        Integer num2;
        Object obj2;
        String str5;
        Integer num3;
        Object obj3;
        String str6;
        Integer num4;
        androidx.fragment.app.p requireActivity;
        NewDynamicParentActivity newDynamicParentActivity;
        androidx.fragment.app.p requireActivity2;
        NewDynamicParentActivity newDynamicParentActivity2;
        androidx.fragment.app.p requireActivity3;
        NewDynamicParentActivity newDynamicParentActivity3;
        RobertoTextView robertoTextView;
        String str7;
        RobertoTextView robertoTextView2;
        String str8;
        Object k10;
        ArrayList arrayList;
        Iterator<N12AItemListModel> it;
        N12AItemListModel n12AItemListModel;
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
        String str22;
        String str23;
        String str24;
        ArrayList arrayList2;
        Boolean bool;
        String str25;
        String str26;
        NewDynamicParentActivity newDynamicParentActivity4;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("slug");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            this.A = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                i6 = arguments2.getInt(Constants.DAYMODEL_POSITION);
            } else {
                i6 = -1;
            }
            this.C = i6;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str2 = arguments3.getString("screenId");
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            this.B = str2;
            ArrayList<N12AItemListModel> arrayList3 = this.f10924z;
            arrayList3.clear();
            ((LinearLayout) _$_findCachedViewById(R.id.llFragmentN12BScreenOptionsContainer)).removeAllViews();
            if (this.D < Q().M) {
                this.D = Q().M;
                this.f10923y.clear();
            }
            if (this.f30998u) {
                androidx.fragment.app.p requireActivity4 = requireActivity();
                if (requireActivity4 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity4;
                } else {
                    newDynamicParentActivity4 = null;
                }
                if (newDynamicParentActivity4 != null) {
                    newDynamicParentActivity4.C0(this.C);
                }
            }
            t Q = Q();
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                str3 = arguments4.getString("slug");
            } else {
                str3 = null;
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                num = Integer.valueOf(arguments5.getInt(Constants.DAYMODEL_POSITION));
            } else {
                num = null;
            }
            HashMap m10 = Q.m(num, str3);
            if (m10 != null) {
                obj = m10.get("min_selection");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str4 = (String) obj;
            } else {
                str4 = null;
            }
            if (str4 != null) {
                if (n.B0(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    num2 = m.w0(str4);
                    this.E = num2;
                    if (m10 == null) {
                        obj2 = m10.get("max_selection");
                    } else {
                        obj2 = null;
                    }
                    if (!(obj2 instanceof String)) {
                        str5 = (String) obj2;
                    } else {
                        str5 = null;
                    }
                    if (str5 != null) {
                        if (n.B0(str5)) {
                            str5 = null;
                        }
                        if (str5 != null) {
                            num3 = m.w0(str5);
                            this.F = num3;
                            if (m10 != null) {
                                obj3 = m10.get("exact_selection");
                            } else {
                                obj3 = null;
                            }
                            if (obj3 instanceof String) {
                                str6 = (String) obj3;
                            } else {
                                str6 = null;
                            }
                            if (str6 != null) {
                                if (n.B0(str6)) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    num4 = m.w0(str6);
                                    this.G = num4;
                                    S(m10);
                                    requireActivity = requireActivity();
                                    if (!(requireActivity instanceof NewDynamicParentActivity)) {
                                        newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                                    } else {
                                        newDynamicParentActivity = null;
                                    }
                                    if (newDynamicParentActivity != null) {
                                        Object k11 = Q().k(this.C, this.A, "cta");
                                        if (k11 instanceof String) {
                                            str26 = (String) k11;
                                        } else {
                                            str26 = null;
                                        }
                                        NewDynamicParentActivity.F0(newDynamicParentActivity, str26, null, null, null, 14);
                                    }
                                    requireActivity2 = requireActivity();
                                    if (!(requireActivity2 instanceof NewDynamicParentActivity)) {
                                        newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                    } else {
                                        newDynamicParentActivity2 = null;
                                    }
                                    if (newDynamicParentActivity2 != null) {
                                        Bundle arguments6 = getArguments();
                                        if (arguments6 != null) {
                                            str25 = arguments6.getString("cta_slug");
                                        } else {
                                            str25 = null;
                                        }
                                        newDynamicParentActivity2.E0(str25);
                                    }
                                    requireActivity3 = requireActivity();
                                    if (!(requireActivity3 instanceof NewDynamicParentActivity)) {
                                        newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                    } else {
                                        newDynamicParentActivity3 = null;
                                    }
                                    if (newDynamicParentActivity3 != null) {
                                        Bundle arguments7 = getArguments();
                                        if (arguments7 != null) {
                                            bool = Boolean.valueOf(arguments7.getBoolean("show_info_button"));
                                        } else {
                                            bool = null;
                                        }
                                        newDynamicParentActivity3.O0(bool);
                                    }
                                    robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN12BScreenHeader);
                                    if (robertoTextView == null) {
                                        Object k12 = Q().k(this.C, this.A, "question");
                                        if (k12 instanceof String) {
                                            str7 = (String) k12;
                                        } else {
                                            str7 = null;
                                        }
                                        robertoTextView.setText(str7);
                                    }
                                    robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN12BScreenSubHeader);
                                    if (robertoTextView2 == null) {
                                        Object k13 = Q().k(this.C, this.A, "support_text");
                                        if (k13 instanceof String) {
                                            str8 = (String) k13;
                                        } else {
                                            str8 = null;
                                        }
                                        robertoTextView2.setText(str8);
                                    }
                                    k10 = Q().k(this.C, this.A, "options_list");
                                    if (!(k10 instanceof ArrayList)) {
                                        arrayList = (ArrayList) k10;
                                    } else {
                                        arrayList = null;
                                    }
                                    if (arrayList != null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj4 : arrayList) {
                                            if (obj4 instanceof HashMap) {
                                                Object obj5 = ((Map) obj4).get("option_id");
                                                if (obj5 instanceof String) {
                                                    str9 = (String) obj5;
                                                } else {
                                                    str9 = null;
                                                }
                                                if (str9 == null) {
                                                    str10 = "";
                                                } else {
                                                    str10 = str9;
                                                }
                                                Object obj6 = ((Map) obj4).get("option_title");
                                                if (obj6 instanceof String) {
                                                    str11 = (String) obj6;
                                                } else {
                                                    str11 = null;
                                                }
                                                if (str11 == null) {
                                                    str12 = "";
                                                } else {
                                                    str12 = str11;
                                                }
                                                Object obj7 = ((Map) obj4).get("option_description");
                                                if (obj7 instanceof String) {
                                                    str13 = (String) obj7;
                                                } else {
                                                    str13 = null;
                                                }
                                                if (str13 == null) {
                                                    str14 = "";
                                                } else {
                                                    str14 = str13;
                                                }
                                                Object obj8 = ((Map) obj4).get("option_image_title");
                                                if (obj8 instanceof String) {
                                                    str15 = (String) obj8;
                                                } else {
                                                    str15 = null;
                                                }
                                                if (str15 == null) {
                                                    str16 = "";
                                                } else {
                                                    str16 = str15;
                                                }
                                                Object obj9 = ((Map) obj4).get("option_image");
                                                if (obj9 instanceof String) {
                                                    str17 = (String) obj9;
                                                } else {
                                                    str17 = null;
                                                }
                                                if (str17 == null) {
                                                    str18 = "";
                                                } else {
                                                    str18 = str17;
                                                }
                                                Object obj10 = ((Map) obj4).get("option_example_title");
                                                if (obj10 instanceof String) {
                                                    str19 = (String) obj10;
                                                } else {
                                                    str19 = null;
                                                }
                                                if (str19 == null) {
                                                    str20 = "";
                                                } else {
                                                    str20 = str19;
                                                }
                                                Object obj11 = ((Map) obj4).get("option_example_body");
                                                if (obj11 instanceof String) {
                                                    str21 = (String) obj11;
                                                } else {
                                                    str21 = null;
                                                }
                                                if (str21 == null) {
                                                    str22 = "";
                                                } else {
                                                    str22 = str21;
                                                }
                                                Object obj12 = ((Map) obj4).get("option_card_title");
                                                if (obj12 instanceof String) {
                                                    str23 = (String) obj12;
                                                } else {
                                                    str23 = null;
                                                }
                                                if (str23 == null) {
                                                    str24 = "";
                                                } else {
                                                    str24 = str23;
                                                }
                                                Object obj13 = ((Map) obj4).get("option_card_list");
                                                if (obj13 instanceof ArrayList) {
                                                    arrayList2 = (ArrayList) obj13;
                                                } else {
                                                    arrayList2 = null;
                                                }
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                n12AItemListModel = new N12AItemListModel(str10, str12, str14, str16, str18, str20, str22, str24, arrayList2);
                                            } else {
                                                n12AItemListModel = null;
                                            }
                                            if (n12AItemListModel != null) {
                                                arrayList4.add(n12AItemListModel);
                                            }
                                        }
                                        arrayList3.addAll(arrayList4);
                                    }
                                    it = arrayList3.iterator();
                                    while (it.hasNext()) {
                                        P(it.next());
                                    }
                                }
                            }
                            num4 = null;
                            this.G = num4;
                            S(m10);
                            requireActivity = requireActivity();
                            if (!(requireActivity instanceof NewDynamicParentActivity)) {
                            }
                            if (newDynamicParentActivity != null) {
                            }
                            requireActivity2 = requireActivity();
                            if (!(requireActivity2 instanceof NewDynamicParentActivity)) {
                            }
                            if (newDynamicParentActivity2 != null) {
                            }
                            requireActivity3 = requireActivity();
                            if (!(requireActivity3 instanceof NewDynamicParentActivity)) {
                            }
                            if (newDynamicParentActivity3 != null) {
                            }
                            robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN12BScreenHeader);
                            if (robertoTextView == null) {
                            }
                            robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN12BScreenSubHeader);
                            if (robertoTextView2 == null) {
                            }
                            k10 = Q().k(this.C, this.A, "options_list");
                            if (!(k10 instanceof ArrayList)) {
                            }
                            if (arrayList != null) {
                            }
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                        }
                    }
                    num3 = null;
                    this.F = num3;
                    if (m10 != null) {
                    }
                    if (obj3 instanceof String) {
                    }
                    if (str6 != null) {
                    }
                    num4 = null;
                    this.G = num4;
                    S(m10);
                    requireActivity = requireActivity();
                    if (!(requireActivity instanceof NewDynamicParentActivity)) {
                    }
                    if (newDynamicParentActivity != null) {
                    }
                    requireActivity2 = requireActivity();
                    if (!(requireActivity2 instanceof NewDynamicParentActivity)) {
                    }
                    if (newDynamicParentActivity2 != null) {
                    }
                    requireActivity3 = requireActivity();
                    if (!(requireActivity3 instanceof NewDynamicParentActivity)) {
                    }
                    if (newDynamicParentActivity3 != null) {
                    }
                    robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN12BScreenHeader);
                    if (robertoTextView == null) {
                    }
                    robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN12BScreenSubHeader);
                    if (robertoTextView2 == null) {
                    }
                    k10 = Q().k(this.C, this.A, "options_list");
                    if (!(k10 instanceof ArrayList)) {
                    }
                    if (arrayList != null) {
                    }
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                }
            }
            num2 = null;
            this.E = num2;
            if (m10 == null) {
            }
            if (!(obj2 instanceof String)) {
            }
            if (str5 != null) {
            }
            num3 = null;
            this.F = num3;
            if (m10 != null) {
            }
            if (obj3 instanceof String) {
            }
            if (str6 != null) {
            }
            num4 = null;
            this.G = num4;
            S(m10);
            requireActivity = requireActivity();
            if (!(requireActivity instanceof NewDynamicParentActivity)) {
            }
            if (newDynamicParentActivity != null) {
            }
            requireActivity2 = requireActivity();
            if (!(requireActivity2 instanceof NewDynamicParentActivity)) {
            }
            if (newDynamicParentActivity2 != null) {
            }
            requireActivity3 = requireActivity();
            if (!(requireActivity3 instanceof NewDynamicParentActivity)) {
            }
            if (newDynamicParentActivity3 != null) {
            }
            robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN12BScreenHeader);
            if (robertoTextView == null) {
            }
            robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvFragmentN12BScreenSubHeader);
            if (robertoTextView2 == null) {
            }
            k10 = Q().k(this.C, this.A, "options_list");
            if (!(k10 instanceof ArrayList)) {
            }
            if (arrayList != null) {
            }
            it = arrayList3.iterator();
            while (it.hasNext()) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10921w, e10);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
