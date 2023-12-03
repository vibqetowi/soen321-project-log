package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.n;
import gv.r;
import is.u;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
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
import ql.t;
/* compiled from: N4ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N4ScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N4ScreenFragment extends rr.d {
    public static final /* synthetic */ int I = 0;
    public String A;
    public int E;
    public Calendar F;
    public final ZoneOffset G;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11062y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f11063z;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11060w = LogHelper.INSTANCE.makeLogTag("N4ScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f11061x = b0.j(this, y.a(t.class), new b(this), new c(this), new d(this));
    public String B = "";
    public String C = "";
    public int D = -1;

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11065u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11065u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11065u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11066u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11066u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11066u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11067u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11067u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11067u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public N4ScreenFragment() {
        Calendar calendar = Calendar.getInstance();
        i.f(calendar, "getInstance()");
        this.F = calendar;
        this.G = ZoneId.systemDefault().getRules().getOffset(Instant.now());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:3:0x0005, B:5:0x0012, B:12:0x001f, B:14:0x0035, B:15:0x0038, B:16:0x0041, B:18:0x004b, B:20:0x0053, B:22:0x00a5, B:24:0x00aa), top: B:29:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:3:0x0005, B:5:0x0012, B:12:0x001f, B:14:0x0035, B:15:0x0038, B:16:0x0041, B:18:0x004b, B:20:0x0053, B:22:0x00a5, B:24:0x00aa), top: B:29:0x0005 }] */
    @Override // rr.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        boolean z10;
        String str;
        try {
            Editable text = ((RobertoEditText) _$_findCachedViewById(R.id.etN4ScreenUserComment)).getText();
            if (text != null && !n.B0(text)) {
                z10 = false;
                NewDynamicParentActivity newDynamicParentActivity = null;
                String str2 = null;
                if (!z10) {
                    p requireActivity = requireActivity();
                    Object k10 = Q().k(this.D, this.B, "error");
                    if (k10 instanceof String) {
                        str2 = (String) k10;
                    }
                    Toast.makeText(requireActivity, str2, 0).show();
                    return;
                }
                t Q = Q();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str = arguments.getString("slug");
                } else {
                    str = null;
                }
                String str3 = this.C;
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("n4_data_" + this.C, String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.etN4ScreenUserComment)).getText()));
                hs.k kVar = hs.k.f19476a;
                Q.t(str, str3, hashMap);
                t Q2 = Q();
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("date", Long.valueOf(this.F.getTimeInMillis()));
                Q2.t("global_data", "global_data_id", hashMap2);
                p requireActivity2 = requireActivity();
                if (requireActivity2 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
                }
                if (newDynamicParentActivity != null) {
                    int i6 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                    return;
                }
                return;
            }
            z10 = true;
            NewDynamicParentActivity newDynamicParentActivity2 = null;
            String str22 = null;
            if (!z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11060w, e10);
        }
    }

    public final String P(int i6) {
        if (is.k.Q1(Integer.valueOf(i6), new Integer[]{11, 12, 13})) {
            return "th";
        }
        int i10 = i6 % 10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "th";
                }
                return "rd";
            }
            return "nd";
        }
        return "st";
    }

    public final t Q() {
        return (t) this.f11061x.getValue();
    }

    public final void S(String str, String str2) {
        if (str == null) {
            return;
        }
        try {
            int i6 = bn.a.f4534a;
            p requireActivity = requireActivity();
            i.f(requireActivity, "requireActivity()");
            ChipGroup cgN4Screen = (ChipGroup) _$_findCachedViewById(R.id.cgN4Screen);
            i.f(cgN4Screen, "cgN4Screen");
            ((ChipGroup) _$_findCachedViewById(R.id.cgN4Screen)).addView(bn.a.g(requireActivity, str, cgN4Screen, str2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11060w, e10);
        }
    }

    public final void U() {
        NewDynamicParentActivity newDynamicParentActivity;
        NewDynamicParentActivity newDynamicParentActivity2;
        NewDynamicParentActivity newDynamicParentActivity3;
        Object obj;
        Long l2;
        String str;
        Integer num;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        ArrayList arrayList;
        Object obj9;
        int i6;
        int i10;
        String str2;
        Object obj10;
        String str3;
        RobertoEditText robertoEditText;
        Boolean bool;
        String str4;
        String str5;
        try {
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                Object k10 = Q().k(this.D, this.B, "cta");
                if (k10 instanceof String) {
                    str5 = (String) k10;
                } else {
                    str5 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity, str5, null, null, null, 14);
            }
            p requireActivity2 = requireActivity();
            if (requireActivity2 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
            } else {
                newDynamicParentActivity2 = null;
            }
            if (newDynamicParentActivity2 != null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str4 = arguments.getString("cta_slug");
                } else {
                    str4 = null;
                }
                newDynamicParentActivity2.E0(str4);
            }
            p requireActivity3 = requireActivity();
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
            HashMap<String, Object> n10 = Q().n("global_data", "global_data_id");
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
                gd.d dVar = Q().f29790z;
                int i11 = this.F.get(5);
                dVar.getClass();
                sb2.append(gd.d.b(i11));
                sb2.append(' ');
                sb2.append(Q().f29790z.d(this.F.getTimeInMillis(), "MMM, hh:mm a"));
                this.A = sb2.toString();
            }
            t Q = Q();
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
            HashMap m10 = Q.m(num, str);
            if (m10 != null) {
                obj2 = m10.get("edit_time");
            } else {
                obj2 = null;
            }
            Boolean bool2 = Boolean.TRUE;
            this.f11062y = i.b((Boolean) obj2, bool2);
            if (m10 != null) {
                obj3 = m10.get("show_time");
            } else {
                obj3 = null;
            }
            this.f11063z = i.b((Boolean) obj3, bool2);
            if (m10 != null) {
                obj4 = m10.get("edit_flow_begin");
            } else {
                obj4 = null;
            }
            i.b((Boolean) obj4, bool2);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN4ScreenQuestion);
            if (m10 != null) {
                obj5 = m10.get("question");
            } else {
                obj5 = null;
            }
            robertoTextView.setText((String) obj5);
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.etN4ScreenUserComment);
            if (m10 != null) {
                obj6 = m10.get("hint1");
            } else {
                obj6 = null;
            }
            robertoEditText2.setHint((String) obj6);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN4ScreenUserComment);
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
            String str6 = (String) obj9;
            X(m10);
            RobertoEditText robertoEditText3 = (RobertoEditText) _$_findCachedViewById(R.id.etN4ScreenUserComment);
            if (robertoEditText3 != null) {
                robertoEditText3.addTextChangedListener(new a());
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    S((String) ((HashMap) it.next()).get("list_key"), str6);
                }
            }
            this.f11063z = true;
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN4ScreenDate);
            if (this.f11062y) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            appCompatImageView.setVisibility(i6);
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN4ScreenDate);
            if (this.f11063z) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            robertoTextView3.setVisibility(i10);
            if (this.A == null) {
                this.A = this.F.get(5) + P(this.F.get(5)) + ' ' + LocalDateTime.ofEpochSecond(this.F.getTimeInMillis() / 1000, 0, this.G).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH));
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN4ScreenDate)).setText(this.A);
            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new pl.b(this, 1), this.F.get(11), this.F.get(12), false);
            timePickerDialog.setTitle("Pick time");
            DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 2), this.F.get(1), this.F.get(2), this.F.get(5));
            DatePicker datePicker = datePickerDialog.getDatePicker();
            Utils utils = Utils.INSTANCE;
            datePicker.setMaxDate(utils.getTodayTimeInSeconds() * 1000);
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivN4ScreenDate)).setOnClickListener(new pl.d(datePickerDialog, 1));
            _$_findCachedViewById(R.id.viewN4ScreenQuestion).setOnClickListener(new ol.k(5, this));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivN4ScreenArrow)).startAnimation(utils.rotateBy180(0.0f, 180.0f));
            t Q2 = Q();
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                str2 = arguments5.getString("slug");
            } else {
                str2 = null;
            }
            HashMap<String, Object> n11 = Q2.n(str2, this.C);
            if (n11 != null) {
                obj10 = n11.get("n4_data_" + this.C);
            } else {
                obj10 = null;
            }
            if (obj10 instanceof String) {
                str3 = (String) obj10;
            } else {
                str3 = null;
            }
            if (str3 != null && (robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etN4ScreenUserComment)) != null) {
                robertoEditText.setText(str3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11060w, e10);
        }
    }

    public final void X(HashMap<String, Object> hashMap) {
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
                LogHelper.INSTANCE.e(this.f11060w, "exception", e10);
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
        return inflater.inflate(R.layout.fragment_n4_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i6;
        String str2;
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
            if (str == null) {
                str = "";
            }
            this.B = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                i6 = arguments2.getInt(Constants.DAYMODEL_POSITION);
            } else {
                i6 = -1;
            }
            this.D = i6;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str2 = arguments3.getString("screenId");
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            this.C = str2;
            U();
            if (this.f30998u) {
                p requireActivity = requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.C0(this.D);
                }
            }
            if (this.E < Q().M) {
                this.E = Q().M;
                RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.etN4ScreenUserComment);
                if (robertoEditText != null) {
                    robertoEditText.setText("");
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11060w, e10);
        }
    }

    @Override // rr.d
    public final void M() {
    }

    /* compiled from: N4ScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            N4ScreenFragment n4ScreenFragment = N4ScreenFragment.this;
            try {
                if (String.valueOf(charSequence).length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((RobertoTextView) n4ScreenFragment._$_findCachedViewById(R.id.tvN4ScreenUserComment)).setVisibility(0);
                } else {
                    ((RobertoTextView) n4ScreenFragment._$_findCachedViewById(R.id.tvN4ScreenUserComment)).setVisibility(8);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(n4ScreenFragment.f11060w, e10);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
