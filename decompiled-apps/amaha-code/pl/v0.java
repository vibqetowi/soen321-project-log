package pl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityScreenDataClass;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import ql.i;
/* compiled from: N7BScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpl/v0;", "Landroidx/fragment/app/n;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v0 extends androidx.fragment.app.n {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28649u = LogHelper.INSTANCE.makeLogTag("N7BScreenFragment");

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f28650v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(ql.t.class), new a(this), new b(this), new c(this));

    /* renamed from: w  reason: collision with root package name */
    public String f28651w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f28652x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f28653y;

    /* renamed from: z  reason: collision with root package name */
    public String f28654z;

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f28655u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f28655u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f28655u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f28656u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f28656u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f28656u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f28657u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f28657u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f28657u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final void F() {
        HashMap<String, Object> hashMap;
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        Object obj5;
        String str5;
        Object obj6;
        ArrayList arrayList;
        HashMap hashMap2;
        Object obj7;
        String str6;
        Object obj8;
        String str7;
        hs.f fVar;
        try {
            NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass = ((ql.t) this.f28650v.getValue()).N;
            if (newDynamicActivityScreenDataClass != null) {
                hashMap = newDynamicActivityScreenDataClass.getData();
            } else {
                hashMap = null;
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN7BScreenNavBarHeader);
            if (hashMap != null) {
                obj = hashMap.get("heading");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN7BScreenTitle);
            if (hashMap != null) {
                obj2 = hashMap.get("title");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            robertoTextView2.setText(str2);
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN7BScreenDescription);
            if (hashMap != null) {
                obj3 = hashMap.get("description");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            } else {
                str3 = null;
            }
            robertoTextView3.setText(str3);
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN7BScreenHintTitle);
            if (hashMap != null) {
                obj4 = hashMap.get("tips_header");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof String) {
                str4 = (String) obj4;
            } else {
                str4 = null;
            }
            robertoTextView4.setText(str4);
            com.bumptech.glide.e<Bitmap> a10 = Glide.i(requireActivity()).a();
            if (hashMap != null) {
                obj5 = hashMap.get("image");
            } else {
                obj5 = null;
            }
            if (obj5 instanceof String) {
                str5 = (String) obj5;
            } else {
                str5 = null;
            }
            a10.Z = str5;
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) _$_findCachedViewById(R.id.ivN7BScreen));
            if (hashMap != null) {
                obj6 = hashMap.get("tips_list");
            } else {
                obj6 = null;
            }
            if (obj6 instanceof ArrayList) {
                arrayList = (ArrayList) obj6;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj9 : arrayList) {
                    if (obj9 instanceof HashMap) {
                        hashMap2 = (HashMap) obj9;
                    } else {
                        hashMap2 = null;
                    }
                    if (hashMap2 != null) {
                        obj7 = hashMap2.get("tip_image");
                    } else {
                        obj7 = null;
                    }
                    if (obj7 instanceof String) {
                        str6 = (String) obj7;
                    } else {
                        str6 = null;
                    }
                    if (hashMap2 != null) {
                        obj8 = hashMap2.get("tip_text");
                    } else {
                        obj8 = null;
                    }
                    if (obj8 instanceof String) {
                        str7 = (String) obj8;
                    } else {
                        str7 = null;
                    }
                    if (str6 != null && str7 != null) {
                        fVar = new hs.f(str6, str7);
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        arrayList2.add(fVar);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    hs.f fVar2 = (hs.f) it.next();
                    View inflate = getLayoutInflater().inflate(R.layout.row_n7b_hint, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llN7BScreenHintList)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.tvN7BRowText)).setText((CharSequence) fVar2.f19465v);
                    Glide.g(requireContext()).p((String) fVar2.f19464u).B((AppCompatImageView) inflate.findViewById(R.id.ivN7BRowImage));
                    ((LinearLayout) _$_findCachedViewById(R.id.llN7BScreenHintList)).addView(inflate);
                }
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN7BScreenNavBarCloseButton);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new u0(this, 1));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28649u, e10);
        }
    }

    public final void I(boolean z10, boolean z11) {
        int i6;
        this.f28652x = z10;
        this.f28653y = z11;
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN7BScreenPlayPause);
        if (appCompatImageView != null) {
            if (z11) {
                i6 = R.drawable.ic_nda_replay;
            } else if (z10) {
                i6 = R.drawable.ic_nda_pause;
            } else {
                i6 = R.drawable.ic_nda_play;
            }
            appCompatImageView.setImageResource(i6);
        }
    }

    public final void J(String str) {
        if (str == null) {
            return;
        }
        if (this.f28651w != null) {
            str = str + '/' + this.f28651w;
        }
        this.f28654z = str;
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN7BScreenTimer);
        if (robertoTextView != null) {
            robertoTextView.setText(this.f28654z);
        }
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

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 16974125);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n7_b_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        String string;
        Long x02;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            F();
            if (this.f28651w == null) {
                Bundle arguments = getArguments();
                if (arguments != null && (string = arguments.getString("duration")) != null && (x02 = gv.m.x0(string)) != null) {
                    Context requireContext = requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    str = i.a.C0504a.a(requireContext, x02.longValue() * 1000);
                } else {
                    str = null;
                }
                this.f28651w = str;
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    z10 = arguments2.getBoolean("isAudioCompleted", false);
                } else {
                    z10 = false;
                }
                this.f28653y = z10;
                Context requireContext2 = requireContext();
                kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                J(i.a.C0504a.a(requireContext2, 0L));
            } else {
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN7BScreenTimer);
                if (robertoTextView != null) {
                    String str2 = this.f28654z;
                    if (str2 == null) {
                        str2 = "00:00/" + this.f28651w;
                    }
                    robertoTextView.setText(str2);
                }
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN7BScreenPlayPause);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new u0(this, 0));
            }
            I(this.f28652x, this.f28653y);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28649u, e10);
        }
    }
}
