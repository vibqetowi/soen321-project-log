package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.r;
import hs.f;
import is.u;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ol.o;
import pl.r0;
import pl.s0;
import ql.t;
import rr.d;
/* compiled from: N5ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N5ScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N5ScreenFragment extends d {
    public static final /* synthetic */ int I = 0;
    public boolean D;
    public boolean E;
    public Calendar F;
    public final ZoneOffset G;

    /* renamed from: y  reason: collision with root package name */
    public String f11070y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f11071z;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11068w = LogHelper.INSTANCE.makeLogTag("N5ScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f11069x = b0.j(this, y.a(t.class), new a(this), new b(this), new c(this));
    public final ArrayList<f<String, ArrayList<String>>> A = new ArrayList<>();
    public String B = "";
    public String C = "";

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11072u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f11072u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11072u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11073u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11073u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11073u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11074u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11074u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11074u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public N5ScreenFragment() {
        Calendar calendar = Calendar.getInstance();
        i.f(calendar, "getInstance()");
        this.F = calendar;
        this.G = ZoneId.systemDefault().getRules().getOffset(Instant.now());
    }

    @Override // rr.d
    public final void K() {
        int i6;
        String str;
        String str2;
        ArrayList<f<String, ArrayList<String>>> arrayList = this.A;
        try {
            String str3 = null;
            NewDynamicParentActivity newDynamicParentActivity = null;
            if (!arrayList.isEmpty()) {
                boolean z10 = true;
                if (!arrayList.isEmpty()) {
                    Iterator<f<String, ArrayList<String>>> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (!it.next().f19465v.isEmpty()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (!z10) {
                    if (this.D) {
                        t P = P();
                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put("date", Long.valueOf(this.F.getTimeInMillis()));
                        hs.k kVar = hs.k.f19476a;
                        P.t("global_data", "global_data_id", hashMap);
                    }
                    HashMap<String, Object> hashMap2 = new HashMap<>();
                    hashMap2.put("n5_data_" + this.B, String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.etN5ScreenUserComment)).getText()));
                    String str4 = "n5_list_" + this.B;
                    ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                    Iterator<f<String, ArrayList<String>>> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().f19465v);
                    }
                    hashMap2.put(str4, is.i.O1(arrayList2));
                    t P2 = P();
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        str = arguments.getString("slug");
                    } else {
                        str = null;
                    }
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        str2 = arguments2.getString("screenId");
                    } else {
                        str2 = null;
                    }
                    P2.t(str, str2, hashMap2);
                    p requireActivity = requireActivity();
                    if (requireActivity instanceof NewDynamicParentActivity) {
                        newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                    }
                    if (newDynamicParentActivity != null) {
                        int i10 = NewDynamicParentActivity.F;
                        newDynamicParentActivity.L0(false);
                        return;
                    }
                    return;
                }
            }
            p requireActivity2 = requireActivity();
            t P3 = P();
            String str5 = this.C;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                i6 = arguments3.getInt(Constants.DAYMODEL_POSITION);
            } else {
                i6 = -1;
            }
            Object k10 = P3.k(i6, str5, "error");
            if (k10 instanceof String) {
                str3 = (String) k10;
            }
            Toast.makeText(requireActivity2, str3, 0).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11068w, e10);
        }
    }

    public final t P() {
        return (t) this.f11069x.getValue();
    }

    public final void Q(String str, String str2) {
        if (str == null) {
            return;
        }
        try {
            int i6 = bn.a.f4534a;
            p requireActivity = requireActivity();
            i.f(requireActivity, "requireActivity()");
            ChipGroup cgN5Screen = (ChipGroup) _$_findCachedViewById(R.id.cgN5Screen);
            i.f(cgN5Screen, "cgN5Screen");
            ((ChipGroup) _$_findCachedViewById(R.id.cgN5Screen)).addView(bn.a.g(requireActivity, str, cgN5Screen, str2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11068w, e10);
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
                LogHelper.INSTANCE.e(this.f11068w, "exception", e10);
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
        return inflater.inflate(R.layout.fragment_n5_screen, viewGroup, false);
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
        Object obj;
        Long l2;
        String str3;
        Integer num;
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        ArrayList arrayList;
        Object obj9;
        Object obj10;
        ArrayList<HashMap> arrayList2;
        ArrayList arrayList3;
        String str4;
        Object obj11;
        ArrayList arrayList4;
        int i6;
        int i10;
        f fVar;
        String str5;
        Object obj12;
        String str6;
        String str7;
        ArrayList arrayList5;
        f fVar2;
        Boolean bool;
        Object obj13;
        String str8;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("screenId");
            } else {
                str = null;
            }
            String str9 = "";
            if (str == null) {
                str = "";
            }
            this.B = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str2 = arguments2.getString("slug");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                str9 = str2;
            }
            this.C = str9;
            HashMap<String, Object> n10 = P().n("global_data", "global_data_id");
            if (n10 != null) {
                obj = n10.get("date");
            } else {
                obj = null;
            }
            if (obj instanceof Long) {
                l2 = (Long) obj;
            } else {
                l2 = null;
            }
            if (l2 != null) {
                long longValue = l2.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(longValue);
                this.F = calendar;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.F.get(5));
                gd.d dVar = P().f29790z;
                int i11 = this.F.get(5);
                dVar.getClass();
                sb2.append(gd.d.b(i11));
                sb2.append(' ');
                sb2.append(P().f29790z.d(this.F.getTimeInMillis(), "MMM, hh:mm a"));
                this.f11070y = sb2.toString();
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN5ScreenDate)).setText(this.f11070y);
            t P = P();
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str3 = arguments3.getString("slug");
            } else {
                str3 = null;
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                num = Integer.valueOf(arguments4.getInt(Constants.DAYMODEL_POSITION));
            } else {
                num = null;
            }
            HashMap m10 = P.m(num, str3);
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                if (m10 != null) {
                    obj13 = m10.get("cta");
                } else {
                    obj13 = null;
                }
                if (obj13 instanceof String) {
                    str8 = (String) obj13;
                } else {
                    str8 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity, str8, null, null, null, 14);
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    bool = Boolean.valueOf(arguments5.getBoolean("show_info_button"));
                } else {
                    bool = null;
                }
                newDynamicParentActivity2.O0(bool);
            }
            if (m10 != null) {
                obj2 = m10.get("edit_time");
            } else {
                obj2 = null;
            }
            Boolean bool2 = Boolean.TRUE;
            this.D = i.b((Boolean) obj2, bool2);
            if (m10 != null) {
                obj3 = m10.get("show_time");
            } else {
                obj3 = null;
            }
            this.E = i.b((Boolean) obj3, bool2);
            if (m10 != null) {
                obj4 = m10.get("edit_flow_begin");
            } else {
                obj4 = null;
            }
            i.b((Boolean) obj4, bool2);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN5ScreenQuestion);
            if (m10 != null) {
                obj5 = m10.get("question");
            } else {
                obj5 = null;
            }
            robertoTextView.setText((String) obj5);
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etN5ScreenUserComment);
            if (m10 != null) {
                obj6 = m10.get("hint1");
            } else {
                obj6 = null;
            }
            robertoEditText.setHint((String) obj6);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN5ScreenUserComment);
            if (m10 != null) {
                obj7 = m10.get("hint2");
            } else {
                obj7 = null;
            }
            robertoTextView2.setText((String) obj7);
            if (m10 != null) {
                obj8 = m10.get("help_text");
            } else {
                obj8 = null;
            }
            if (obj8 instanceof ArrayList) {
                arrayList = (ArrayList) obj8;
            } else {
                arrayList = null;
            }
            if (m10 != null) {
                obj9 = m10.get("help_card_color");
            } else {
                obj9 = null;
            }
            String str10 = (String) obj9;
            S(m10);
            if (m10 != null) {
                obj10 = m10.get("items");
            } else {
                obj10 = null;
            }
            if (obj10 instanceof ArrayList) {
                arrayList2 = (ArrayList) obj10;
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                arrayList3 = new ArrayList();
                for (HashMap hashMap : arrayList2) {
                    Object obj14 = hashMap.get("title");
                    if (obj14 instanceof String) {
                        str7 = (String) obj14;
                    } else {
                        str7 = null;
                    }
                    Object obj15 = hashMap.get("chips");
                    if (obj15 instanceof ArrayList) {
                        arrayList5 = (ArrayList) obj15;
                    } else {
                        arrayList5 = null;
                    }
                    if (str7 != null && arrayList5 != null) {
                        fVar2 = new f(str7, arrayList5);
                    } else {
                        fVar2 = null;
                    }
                    if (fVar2 != null) {
                        arrayList3.add(fVar2);
                    }
                }
            } else {
                arrayList3 = null;
            }
            this.f11071z = arrayList3;
            t P2 = P();
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                str4 = arguments6.getString("slug");
            } else {
                str4 = null;
            }
            HashMap<String, Object> n11 = P2.n(str4, this.B);
            if (n11 != null) {
                obj11 = n11.get("n5_list_" + this.B);
            } else {
                obj11 = null;
            }
            if (obj11 instanceof ArrayList) {
                arrayList4 = (ArrayList) obj11;
            } else {
                arrayList4 = null;
            }
            ArrayList<f<String, ArrayList<String>>> arrayList6 = this.A;
            if (arrayList4 != null) {
                ArrayList arrayList7 = new ArrayList();
                for (Object obj16 : arrayList4) {
                    if (obj16 instanceof String) {
                        str6 = (String) obj16;
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        arrayList7.add(str6);
                    }
                }
                Iterator it = arrayList7.iterator();
                while (it.hasNext()) {
                    String str11 = (String) it.next();
                    ArrayList arrayList8 = this.f11071z;
                    if (arrayList8 != null) {
                        Iterator it2 = arrayList8.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj12 = it2.next();
                                if (((ArrayList) ((f) obj12).f19465v).contains(str11)) {
                                    break;
                                }
                            } else {
                                obj12 = null;
                                break;
                            }
                        }
                        fVar = (f) obj12;
                    } else {
                        fVar = null;
                    }
                    Iterator<f<String, ArrayList<String>>> it3 = arrayList6.iterator();
                    int i12 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            String str12 = it3.next().f19464u;
                            if (fVar != null) {
                                str5 = (String) fVar.f19464u;
                            } else {
                                str5 = null;
                            }
                            if (i.b(str12, str5)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 == -1 && fVar != null) {
                        arrayList6.add(new f<>(fVar.f19464u, ca.a.k(str11)));
                    } else if (i12 != -1) {
                        arrayList6.get(i12).f19465v.add(str11);
                    }
                }
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN5ScreenDate);
            if (this.D) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            appCompatImageView.setVisibility(i6);
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN5ScreenDate);
            if (this.E) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            robertoTextView3.setVisibility(i10);
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etN5ScreenUserComment);
            if (robertoEditText2 != null) {
                robertoEditText2.addTextChangedListener(new r0(this));
            }
            if (arrayList != null) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Q((String) ((HashMap) it4.next()).get("list_key"), str10);
                }
            }
            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new pl.b(this, 2), this.F.get(11), this.F.get(12), false);
            timePickerDialog.setTitle("Pick time");
            DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 3), this.F.get(1), this.F.get(2), this.F.get(5));
            DatePicker datePicker = datePickerDialog.getDatePicker();
            Utils utils = Utils.INSTANCE;
            datePicker.setMaxDate(utils.getTodayTimeInSeconds() * 1000);
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivN5ScreenDate)).setOnClickListener(new pl.d(datePickerDialog, 2));
            _$_findCachedViewById(R.id.viewN5ScreenQuestion).setOnClickListener(new ol.k(6, this));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivN5ScreenArrow)).startAnimation(utils.rotateBy180(0.0f, 180.0f));
            ((RecyclerView) _$_findCachedViewById(R.id.rvN5ScreenListView)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            ArrayList arrayList9 = this.f11071z;
            if (arrayList9 != null) {
                p requireActivity3 = requireActivity();
                i.f(requireActivity3, "requireActivity()");
                ((RecyclerView) _$_findCachedViewById(R.id.rvN5ScreenListView)).setAdapter(new o(arrayList9, arrayList6, requireActivity3, new s0(this)));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11068w, e10);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
