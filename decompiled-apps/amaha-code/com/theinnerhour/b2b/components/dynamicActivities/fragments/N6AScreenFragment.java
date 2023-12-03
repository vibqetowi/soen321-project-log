package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityScreenDataClass;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.n;
import gv.r;
import is.u;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ql.t;
import ss.l;
import ss.p;
/* compiled from: N6AScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N6AScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N6AScreenFragment extends rr.d {
    public static final /* synthetic */ int M = 0;
    public int D;
    public boolean E;
    public boolean F;
    public Integer G;
    public Integer H;
    public Integer I;
    public Calendar J;
    public final ZoneOffset K;

    /* renamed from: z  reason: collision with root package name */
    public String f11078z;
    public final LinkedHashMap L = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11075w = LogHelper.INSTANCE.makeLogTag("N6AScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f11076x = b0.j(this, y.a(t.class), new c(this), new d(this), new e(this));

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<N12AItemListModel> f11077y = new ArrayList<>();
    public String A = "";
    public String B = "";
    public int C = -1;

    /* compiled from: N6AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements p<N12AItemListModel, Boolean, hs.k> {
        public a() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(N12AItemListModel n12AItemListModel, Boolean bool) {
            N12AItemListModel tempN12AItemListModel = n12AItemListModel;
            boolean booleanValue = bool.booleanValue();
            i.g(tempN12AItemListModel, "tempN12AItemListModel");
            N6AScreenFragment n6AScreenFragment = N6AScreenFragment.this;
            if (booleanValue) {
                if (n6AScreenFragment.f11077y.contains(tempN12AItemListModel)) {
                    n6AScreenFragment.f11077y.remove(tempN12AItemListModel);
                }
                RecyclerView.e adapter = ((RecyclerView) n6AScreenFragment._$_findCachedViewById(R.id.rvN6AScreenListView)).getAdapter();
                i.e(adapter, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dynamicActivities.adapter.N6AScreenListAdapter");
                ol.p pVar = (ol.p) adapter;
                ArrayList<N12AItemListModel> selectedOptionList = n6AScreenFragment.f11077y;
                i.g(selectedOptionList, "selectedOptionList");
                pVar.f27677y = selectedOptionList;
                pVar.i();
            } else {
                if (!n6AScreenFragment.f11077y.contains(tempN12AItemListModel)) {
                    n6AScreenFragment.f11077y.add(tempN12AItemListModel);
                }
                RecyclerView.e adapter2 = ((RecyclerView) n6AScreenFragment._$_findCachedViewById(R.id.rvN6AScreenListView)).getAdapter();
                i.e(adapter2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dynamicActivities.adapter.N6AScreenListAdapter");
                ol.p pVar2 = (ol.p) adapter2;
                ArrayList<N12AItemListModel> selectedOptionList2 = n6AScreenFragment.f11077y;
                i.g(selectedOptionList2, "selectedOptionList");
                pVar2.f27677y = selectedOptionList2;
                pVar2.i();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: N6AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<N12AItemListModel, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(N12AItemListModel n12AItemListModel) {
            String str;
            String str2;
            String str3;
            N12AItemListModel tempN12AItemListModel = n12AItemListModel;
            i.g(tempN12AItemListModel, "tempN12AItemListModel");
            int i6 = N6AScreenFragment.M;
            N6AScreenFragment n6AScreenFragment = N6AScreenFragment.this;
            n6AScreenFragment.getClass();
            try {
                t P = n6AScreenFragment.P();
                String str4 = n6AScreenFragment.A;
                String str5 = n6AScreenFragment.B;
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("n6a_list_" + n6AScreenFragment.B, n6AScreenFragment.f11077y);
                hs.k kVar = hs.k.f19476a;
                P.t(str4, str5, hashMap);
                t P2 = n6AScreenFragment.P();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("n13b_data", tempN12AItemListModel);
                Object k10 = n6AScreenFragment.P().k(n6AScreenFragment.C, n6AScreenFragment.A, "option_cta1");
                NewDynamicParentActivity newDynamicParentActivity = null;
                if (k10 instanceof String) {
                    str = (String) k10;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                hashMap2.put("n13b_cta_1", str);
                Object k11 = n6AScreenFragment.P().k(n6AScreenFragment.C, n6AScreenFragment.A, "option_cta2");
                if (k11 instanceof String) {
                    str2 = (String) k11;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                hashMap2.put("n13b_cta_2", str2);
                Object k12 = n6AScreenFragment.P().k(n6AScreenFragment.C, n6AScreenFragment.A, "option_cta_prompt");
                if (k12 instanceof String) {
                    str3 = (String) k12;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                hashMap2.put("n13b_cta_prompt", str3);
                hashMap2.put("parentSlug", n6AScreenFragment.A);
                hashMap2.put("parentScreenId", n6AScreenFragment.B);
                hashMap2.put("parentDataSlug", "n6a_list_" + n6AScreenFragment.B);
                P2.g(ca.a.O0(new NewDynamicActivityScreenDataClass("", "N13B", "cta_type_3", hashMap2)));
                androidx.fragment.app.p requireActivity = n6AScreenFragment.requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                }
                if (newDynamicParentActivity != null) {
                    int i10 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(n6AScreenFragment.f11075w, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11081u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11081u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f11081u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11082u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11082u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11082u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11083u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f11083u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11083u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public N6AScreenFragment() {
        Calendar calendar = Calendar.getInstance();
        i.f(calendar, "getInstance()");
        this.J = calendar;
        this.K = ZoneId.systemDefault().getRules().getOffset(Instant.now());
    }

    @Override // rr.d
    public final void K() {
        NewDynamicParentActivity newDynamicParentActivity;
        try {
            if (U()) {
                if (this.E) {
                    t P = P();
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("date", Long.valueOf(this.J.getTimeInMillis()));
                    hs.k kVar = hs.k.f19476a;
                    P.t("global_data", "global_data_id", hashMap);
                }
                t P2 = P();
                String str = this.A;
                String str2 = this.B;
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("n6a_list_" + this.B, this.f11077y);
                hs.k kVar2 = hs.k.f19476a;
                P2.t(str, str2, hashMap2);
                androidx.fragment.app.p requireActivity = requireActivity();
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11075w, e10);
        }
    }

    public final t P() {
        return (t) this.f11076x.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ba A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c6 A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cc A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0212 A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022a A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0239 A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0245 A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024b A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0330 A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194 A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0 A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6 A[Catch: Exception -> 0x03e0, TryCatch #0 {Exception -> 0x03e0, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0013, B:10:0x0025, B:12:0x002a, B:13:0x0032, B:15:0x003a, B:18:0x0040, B:20:0x0046, B:22:0x004e, B:23:0x0051, B:25:0x0059, B:28:0x005f, B:30:0x0065, B:32:0x0071, B:33:0x0074, B:35:0x0082, B:37:0x0096, B:39:0x009a, B:42:0x00a0, B:43:0x00a2, B:45:0x00b0, B:47:0x00b8, B:49:0x00bc, B:53:0x00c6, B:54:0x011e, B:56:0x0128, B:58:0x0130, B:60:0x0136, B:62:0x0142, B:64:0x0148, B:66:0x0150, B:68:0x015c, B:70:0x0164, B:72:0x016e, B:74:0x0176, B:76:0x017a, B:79:0x0180, B:84:0x018a, B:86:0x0190, B:88:0x0194, B:90:0x019c, B:92:0x01a0, B:95:0x01a6, B:100:0x01b0, B:102:0x01b6, B:104:0x01ba, B:106:0x01c2, B:108:0x01c6, B:111:0x01cc, B:116:0x01d6, B:118:0x01dc, B:122:0x01f0, B:126:0x0201, B:128:0x0212, B:130:0x021a, B:132:0x022a, B:134:0x0232, B:136:0x0239, B:138:0x0241, B:140:0x0245, B:143:0x024b, B:144:0x025a, B:146:0x0260, B:148:0x0272, B:155:0x027d, B:157:0x0287, B:162:0x0290, B:164:0x029a, B:169:0x02a3, B:171:0x02ad, B:176:0x02b6, B:178:0x02c0, B:183:0x02c9, B:185:0x02d3, B:190:0x02de, B:192:0x02e8, B:197:0x02f3, B:199:0x02fd, B:204:0x0308, B:206:0x0312, B:209:0x0318, B:210:0x031d, B:212:0x0335, B:211:0x0330), top: B:217:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        NewDynamicParentActivity newDynamicParentActivity3;
        Object obj;
        ArrayList<N12AItemListModel> arrayList;
        Object obj2;
        Long l2;
        String str;
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        String str2;
        Integer num2;
        Object obj6;
        String str3;
        Integer num3;
        Object obj7;
        String str4;
        Integer num4;
        int i6;
        int i10;
        Object obj8;
        Object obj9;
        Object obj10;
        ArrayList<HashMap> arrayList2;
        ArrayList arrayList3;
        String str5;
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
        ArrayList arrayList4;
        Boolean bool;
        String str21;
        String str22;
        try {
            androidx.fragment.app.p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                Object k10 = P().k(this.C, this.A, "cta");
                if (k10 instanceof String) {
                    str22 = (String) k10;
                } else {
                    str22 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity, str22, null, null, null, 14);
            }
            androidx.fragment.app.p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str21 = arguments.getString("cta_slug");
                } else {
                    str21 = null;
                }
                newDynamicParentActivity2.E0(str21);
            }
            androidx.fragment.app.p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
            } else {
                newDynamicParentActivity3 = null;
            }
            if (newDynamicParentActivity3 != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    bool = Boolean.valueOf(arguments2.getBoolean("show_info_button"));
                } else {
                    bool = null;
                }
                newDynamicParentActivity3.O0(bool);
            }
            HashMap<String, Object> n10 = P().n(this.A, this.B);
            if (n10 != null) {
                obj = n10.get("n6a_list_" + this.B);
            } else {
                obj = null;
            }
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                this.f11077y = arrayList;
            }
            HashMap<String, Object> n11 = P().n("global_data", "global_data_id");
            if (n11 != null) {
                obj2 = n11.get("date");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Long) {
                l2 = (Long) obj2;
            } else {
                l2 = null;
            }
            if (l2 != null) {
                long longValue = l2.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(longValue);
                this.J = calendar;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.J.get(5));
                gd.d dVar = P().f29790z;
                int i11 = this.J.get(5);
                dVar.getClass();
                sb2.append(gd.d.b(i11));
                sb2.append(' ');
                sb2.append(P().f29790z.d(this.J.getTimeInMillis(), "MMM, hh:mm a"));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDate)).setText(sb2.toString());
            }
            t P = P();
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str = arguments3.getString("slug");
            } else {
                str = null;
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                num = Integer.valueOf(arguments4.getInt(Constants.DAYMODEL_POSITION));
            } else {
                num = null;
            }
            HashMap m10 = P.m(num, str);
            if (m10 != null) {
                obj3 = m10.get("edit_time");
            } else {
                obj3 = null;
            }
            Boolean bool2 = Boolean.TRUE;
            this.E = i.b((Boolean) obj3, bool2);
            if (m10 != null) {
                obj4 = m10.get("show_time");
            } else {
                obj4 = null;
            }
            this.F = i.b((Boolean) obj4, bool2);
            if (m10 != null) {
                obj5 = m10.get("min_selection");
            } else {
                obj5 = null;
            }
            if (obj5 instanceof String) {
                str2 = (String) obj5;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                if (n.B0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    num2 = m.w0(str2);
                    this.G = num2;
                    if (m10 == null) {
                        obj6 = m10.get("max_selection");
                    } else {
                        obj6 = null;
                    }
                    if (!(obj6 instanceof String)) {
                        str3 = (String) obj6;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        if (n.B0(str3)) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            num3 = m.w0(str3);
                            this.H = num3;
                            if (m10 != null) {
                                obj7 = m10.get("exact_selection");
                            } else {
                                obj7 = null;
                            }
                            if (obj7 instanceof String) {
                                str4 = (String) obj7;
                            } else {
                                str4 = null;
                            }
                            if (str4 != null) {
                                if (n.B0(str4)) {
                                    str4 = null;
                                }
                                if (str4 != null) {
                                    num4 = m.w0(str4);
                                    this.I = num4;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN6AScreenDate);
                                    if (!this.E) {
                                        i6 = 0;
                                    } else {
                                        i6 = 4;
                                    }
                                    appCompatImageView.setVisibility(i6);
                                    RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDate);
                                    if (!this.F) {
                                        i10 = 0;
                                    } else {
                                        i10 = 8;
                                    }
                                    robertoTextView.setVisibility(i10);
                                    S(m10);
                                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenHeading);
                                    if (m10 == null) {
                                        obj8 = m10.get("question");
                                    } else {
                                        obj8 = null;
                                    }
                                    robertoTextView2.setText((String) obj8);
                                    RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDescription);
                                    if (m10 == null) {
                                        obj9 = m10.get("support_text");
                                    } else {
                                        obj9 = null;
                                    }
                                    robertoTextView3.setText((String) obj9);
                                    if (m10 == null) {
                                        obj10 = m10.get("options_list");
                                    } else {
                                        obj10 = null;
                                    }
                                    if (!(obj10 instanceof ArrayList)) {
                                        arrayList2 = (ArrayList) obj10;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 == null) {
                                        arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
                                        for (HashMap hashMap : arrayList2) {
                                            Object obj11 = hashMap.get("option_id");
                                            if (obj11 instanceof String) {
                                                str5 = (String) obj11;
                                            } else {
                                                str5 = null;
                                            }
                                            if (str5 == null) {
                                                str6 = "";
                                            } else {
                                                str6 = str5;
                                            }
                                            Object obj12 = hashMap.get("option_title");
                                            if (obj12 instanceof String) {
                                                str7 = (String) obj12;
                                            } else {
                                                str7 = null;
                                            }
                                            if (str7 == null) {
                                                str8 = "";
                                            } else {
                                                str8 = str7;
                                            }
                                            Object obj13 = hashMap.get("option_description");
                                            if (obj13 instanceof String) {
                                                str9 = (String) obj13;
                                            } else {
                                                str9 = null;
                                            }
                                            if (str9 == null) {
                                                str10 = "";
                                            } else {
                                                str10 = str9;
                                            }
                                            Object obj14 = hashMap.get("option_image_title");
                                            if (obj14 instanceof String) {
                                                str11 = (String) obj14;
                                            } else {
                                                str11 = null;
                                            }
                                            if (str11 == null) {
                                                str12 = "";
                                            } else {
                                                str12 = str11;
                                            }
                                            Object obj15 = hashMap.get("option_image");
                                            if (obj15 instanceof String) {
                                                str13 = (String) obj15;
                                            } else {
                                                str13 = null;
                                            }
                                            if (str13 == null) {
                                                str14 = "";
                                            } else {
                                                str14 = str13;
                                            }
                                            Object obj16 = hashMap.get("option_example_title");
                                            if (obj16 instanceof String) {
                                                str15 = (String) obj16;
                                            } else {
                                                str15 = null;
                                            }
                                            if (str15 == null) {
                                                str16 = "";
                                            } else {
                                                str16 = str15;
                                            }
                                            Object obj17 = hashMap.get("option_example_body");
                                            if (obj17 instanceof String) {
                                                str17 = (String) obj17;
                                            } else {
                                                str17 = null;
                                            }
                                            if (str17 == null) {
                                                str18 = "";
                                            } else {
                                                str18 = str17;
                                            }
                                            Object obj18 = hashMap.get("option_card_title");
                                            if (obj18 instanceof String) {
                                                str19 = (String) obj18;
                                            } else {
                                                str19 = null;
                                            }
                                            if (str19 == null) {
                                                str20 = "";
                                            } else {
                                                str20 = str19;
                                            }
                                            Object obj19 = hashMap.get("option_card_list");
                                            if (obj19 instanceof ArrayList) {
                                                arrayList4 = (ArrayList) obj19;
                                            } else {
                                                arrayList4 = null;
                                            }
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList3.add(new N12AItemListModel(str6, str8, str10, str12, str14, str16, str18, str20, arrayList4));
                                        }
                                    } else {
                                        arrayList3 = new ArrayList();
                                    }
                                    ((RecyclerView) _$_findCachedViewById(R.id.rvN6AScreenListView)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
                                    ArrayList<N12AItemListModel> arrayList5 = this.f11077y;
                                    androidx.fragment.app.p requireActivity4 = requireActivity();
                                    i.f(requireActivity4, "requireActivity()");
                                    ((RecyclerView) _$_findCachedViewById(R.id.rvN6AScreenListView)).setAdapter(new ol.p(arrayList3, arrayList5, requireActivity4, new a(), new b()));
                                    TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new pl.b(this, 3), this.J.get(11), this.J.get(12), false);
                                    timePickerDialog.setTitle("Pick time");
                                    DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 4), this.J.get(1), this.J.get(2), this.J.get(5));
                                    datePickerDialog.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
                                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivN6AScreenDate)).setOnClickListener(new pl.d(datePickerDialog, 3));
                                }
                            }
                            num4 = null;
                            this.I = num4;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN6AScreenDate);
                            if (!this.E) {
                            }
                            appCompatImageView2.setVisibility(i6);
                            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDate);
                            if (!this.F) {
                            }
                            robertoTextView4.setVisibility(i10);
                            S(m10);
                            RobertoTextView robertoTextView22 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenHeading);
                            if (m10 == null) {
                            }
                            robertoTextView22.setText((String) obj8);
                            RobertoTextView robertoTextView32 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDescription);
                            if (m10 == null) {
                            }
                            robertoTextView32.setText((String) obj9);
                            if (m10 == null) {
                            }
                            if (!(obj10 instanceof ArrayList)) {
                            }
                            if (arrayList2 == null) {
                            }
                            ((RecyclerView) _$_findCachedViewById(R.id.rvN6AScreenListView)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
                            ArrayList<N12AItemListModel> arrayList52 = this.f11077y;
                            androidx.fragment.app.p requireActivity42 = requireActivity();
                            i.f(requireActivity42, "requireActivity()");
                            ((RecyclerView) _$_findCachedViewById(R.id.rvN6AScreenListView)).setAdapter(new ol.p(arrayList3, arrayList52, requireActivity42, new a(), new b()));
                            TimePickerDialog timePickerDialog2 = new TimePickerDialog(getActivity(), new pl.b(this, 3), this.J.get(11), this.J.get(12), false);
                            timePickerDialog2.setTitle("Pick time");
                            DatePickerDialog datePickerDialog2 = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog2, 4), this.J.get(1), this.J.get(2), this.J.get(5));
                            datePickerDialog2.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
                            ((AppCompatImageView) _$_findCachedViewById(R.id.ivN6AScreenDate)).setOnClickListener(new pl.d(datePickerDialog2, 3));
                        }
                    }
                    num3 = null;
                    this.H = num3;
                    if (m10 != null) {
                    }
                    if (obj7 instanceof String) {
                    }
                    if (str4 != null) {
                    }
                    num4 = null;
                    this.I = num4;
                    AppCompatImageView appCompatImageView22 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN6AScreenDate);
                    if (!this.E) {
                    }
                    appCompatImageView22.setVisibility(i6);
                    RobertoTextView robertoTextView42 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDate);
                    if (!this.F) {
                    }
                    robertoTextView42.setVisibility(i10);
                    S(m10);
                    RobertoTextView robertoTextView222 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenHeading);
                    if (m10 == null) {
                    }
                    robertoTextView222.setText((String) obj8);
                    RobertoTextView robertoTextView322 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDescription);
                    if (m10 == null) {
                    }
                    robertoTextView322.setText((String) obj9);
                    if (m10 == null) {
                    }
                    if (!(obj10 instanceof ArrayList)) {
                    }
                    if (arrayList2 == null) {
                    }
                    ((RecyclerView) _$_findCachedViewById(R.id.rvN6AScreenListView)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
                    ArrayList<N12AItemListModel> arrayList522 = this.f11077y;
                    androidx.fragment.app.p requireActivity422 = requireActivity();
                    i.f(requireActivity422, "requireActivity()");
                    ((RecyclerView) _$_findCachedViewById(R.id.rvN6AScreenListView)).setAdapter(new ol.p(arrayList3, arrayList522, requireActivity422, new a(), new b()));
                    TimePickerDialog timePickerDialog22 = new TimePickerDialog(getActivity(), new pl.b(this, 3), this.J.get(11), this.J.get(12), false);
                    timePickerDialog22.setTitle("Pick time");
                    DatePickerDialog datePickerDialog22 = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog22, 4), this.J.get(1), this.J.get(2), this.J.get(5));
                    datePickerDialog22.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivN6AScreenDate)).setOnClickListener(new pl.d(datePickerDialog22, 3));
                }
            }
            num2 = null;
            this.G = num2;
            if (m10 == null) {
            }
            if (!(obj6 instanceof String)) {
            }
            if (str3 != null) {
            }
            num3 = null;
            this.H = num3;
            if (m10 != null) {
            }
            if (obj7 instanceof String) {
            }
            if (str4 != null) {
            }
            num4 = null;
            this.I = num4;
            AppCompatImageView appCompatImageView222 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN6AScreenDate);
            if (!this.E) {
            }
            appCompatImageView222.setVisibility(i6);
            RobertoTextView robertoTextView422 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDate);
            if (!this.F) {
            }
            robertoTextView422.setVisibility(i10);
            S(m10);
            RobertoTextView robertoTextView2222 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenHeading);
            if (m10 == null) {
            }
            robertoTextView2222.setText((String) obj8);
            RobertoTextView robertoTextView3222 = (RobertoTextView) _$_findCachedViewById(R.id.tvN6AScreenDescription);
            if (m10 == null) {
            }
            robertoTextView3222.setText((String) obj9);
            if (m10 == null) {
            }
            if (!(obj10 instanceof ArrayList)) {
            }
            if (arrayList2 == null) {
            }
            ((RecyclerView) _$_findCachedViewById(R.id.rvN6AScreenListView)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            ArrayList<N12AItemListModel> arrayList5222 = this.f11077y;
            androidx.fragment.app.p requireActivity4222 = requireActivity();
            i.f(requireActivity4222, "requireActivity()");
            ((RecyclerView) _$_findCachedViewById(R.id.rvN6AScreenListView)).setAdapter(new ol.p(arrayList3, arrayList5222, requireActivity4222, new a(), new b()));
            TimePickerDialog timePickerDialog222 = new TimePickerDialog(getActivity(), new pl.b(this, 3), this.J.get(11), this.J.get(12), false);
            timePickerDialog222.setTitle("Pick time");
            DatePickerDialog datePickerDialog222 = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog222, 4), this.J.get(1), this.J.get(2), this.J.get(5));
            datePickerDialog222.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivN6AScreenDate)).setOnClickListener(new pl.d(datePickerDialog222, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11075w, e10);
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
                LogHelper.INSTANCE.e(this.f11075w, "exception", e10);
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

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 != r3.intValue()) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U() {
        try {
            String str = null;
            if (this.I != null) {
                int size = this.f11077y.size();
                Integer num = this.I;
                if (num != null) {
                }
                androidx.fragment.app.p requireActivity = requireActivity();
                Object k10 = P().k(this.C, this.A, "exact_error");
                if (k10 instanceof String) {
                    str = (String) k10;
                }
                Toast.makeText(requireActivity, str, 0).show();
                return false;
            }
            if (this.G != null) {
                int size2 = this.f11077y.size();
                Integer num2 = this.G;
                i.d(num2);
                if (size2 < num2.intValue()) {
                    androidx.fragment.app.p requireActivity2 = requireActivity();
                    Object k11 = P().k(this.C, this.A, "min_error");
                    if (k11 instanceof String) {
                        str = (String) k11;
                    }
                    Toast.makeText(requireActivity2, str, 0).show();
                    return false;
                }
            }
            if (this.H != null) {
                int size3 = this.f11077y.size();
                Integer num3 = this.H;
                i.d(num3);
                if (size3 > num3.intValue()) {
                    androidx.fragment.app.p requireActivity3 = requireActivity();
                    Object k12 = P().k(this.C, this.A, "max_error");
                    if (k12 instanceof String) {
                        str = (String) k12;
                    }
                    Toast.makeText(requireActivity3, str, 0).show();
                    return false;
                }
                return true;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11075w, e10);
            return true;
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.L.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.L;
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
        return inflater.inflate(R.layout.fragment_n6_a_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        int i6;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            NewDynamicParentActivity newDynamicParentActivity = null;
            if (arguments != null) {
                str = arguments.getString("slug");
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            this.A = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str2 = arguments2.getString("screenId");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                str3 = str2;
            }
            this.B = str3;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                i6 = arguments3.getInt(Constants.DAYMODEL_POSITION);
            } else {
                i6 = -1;
            }
            this.C = i6;
            if (this.f30998u) {
                androidx.fragment.app.p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.C0(this.C);
                }
            }
            if (this.D < P().M) {
                this.D = P().M;
                this.f11077y.clear();
            }
            Q();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11075w, e10);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
