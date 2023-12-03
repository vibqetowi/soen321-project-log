package nn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Testimonial;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: TM1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lnn/w1;", "Lrn/b;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w1 extends rn.b {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public String f26640w = "#465a62";

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Testimonial> f26641x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public String f26642y = "";

    /* renamed from: z  reason: collision with root package name */
    public final String f26643z = LogHelper.INSTANCE.makeLogTag(w1.class);

    /* compiled from: TM1Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f26644c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<Testimonial> f26645d;

        /* renamed from: e  reason: collision with root package name */
        public final String f26646e;

        public a(androidx.fragment.app.p pVar, String colour, ArrayList tipsList) {
            kotlin.jvm.internal.i.g(tipsList, "tipsList");
            kotlin.jvm.internal.i.g(colour, "colour");
            this.f26644c = pVar;
            this.f26645d = tipsList;
            this.f26646e = colour;
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            kotlin.jvm.internal.i.g(collection, "collection");
            kotlin.jvm.internal.i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return this.f26645d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            kotlin.jvm.internal.i.g(collection, "collection");
            View inflate = LayoutInflater.from(this.f26644c).inflate(R.layout.row_tm1, collection, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            ArrayList<Testimonial> arrayList = this.f26645d;
            ((RobertoTextView) viewGroup.findViewById(R.id.testimonialText)).setText(arrayList.get(i6).getText());
            ((RobertoTextView) viewGroup.findViewById(R.id.testimonialDetails)).setText(arrayList.get(i6).getUserName() + ' ' + arrayList.get(i6).getDate());
            String str = this.f26646e;
            if (gv.n.B0(str)) {
                str = null;
            }
            ((RobertoTextView) viewGroup.findViewById(R.id.testimonialText)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
            ((RobertoTextView) viewGroup.findViewById(R.id.testimonialDetails)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
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

    public final void I(int i6, int i10) {
        try {
            View[] viewArr = new View[i10];
            ((LinearLayout) _$_findCachedViewById(R.id.tm1DotsContainer)).removeAllViews();
            if (getActivity() != null) {
                boolean z10 = false;
                for (int i11 = 0; i11 < i10; i11++) {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    View inflate = activity.getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.tm1DotsContainer)), false);
                    viewArr[i11] = inflate;
                    kotlin.jvm.internal.i.d(inflate);
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    Object obj = g0.a.f16164a;
                    inflate.setBackground(a.c.b(activity2, R.drawable.circle_filled_grey));
                    ((LinearLayout) _$_findCachedViewById(R.id.tm1DotsContainer)).addView(viewArr[i11]);
                }
                if (i10 == 0) {
                    z10 = true;
                }
                if (!z10) {
                    View view = viewArr[i6];
                    kotlin.jvm.internal.i.d(view);
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    Object obj2 = g0.a.f16164a;
                    view.setBackground(a.c.b(activity3, R.drawable.thumb));
                    if (!gv.n.B0(this.f26640w)) {
                        View view2 = viewArr[i6];
                        kotlin.jvm.internal.i.d(view2);
                        view2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.f26640w)));
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void J() {
        Object next;
        ArrayList<Testimonial> arrayList = this.f26641x;
        try {
            Iterator<T> it = arrayList.iterator();
            Object obj = null;
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int length = ((Testimonial) next).getText().length();
                    do {
                        Object next2 = it.next();
                        int length2 = ((Testimonial) next2).getText().length();
                        if (length < length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            }
            Testimonial testimonial = (Testimonial) next;
            Iterator<T> it2 = arrayList.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    Testimonial testimonial2 = (Testimonial) obj;
                    int length3 = testimonial2.getDate().length() + testimonial2.getUserName().length();
                    do {
                        Object next3 = it2.next();
                        Testimonial testimonial3 = (Testimonial) next3;
                        int length4 = testimonial3.getDate().length() + testimonial3.getUserName().length();
                        if (length3 < length4) {
                            obj = next3;
                            length3 = length4;
                        }
                    } while (it2.hasNext());
                }
            }
            Testimonial testimonial4 = (Testimonial) obj;
            if (testimonial != null && testimonial4 != null) {
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tm1BodyHeightGenerator);
                if (robertoTextView != null) {
                    robertoTextView.setText(testimonial.getText());
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tm1FooterHeightGenerator);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(testimonial4.getUserName() + ' ' + testimonial4.getDate());
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26643z, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
        r8 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        boolean z10;
        boolean z11;
        boolean z12;
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string = arguments.getString("tm1_title");
                String str = null;
                if (string != null) {
                    if (gv.n.B0(string)) {
                        string = null;
                    }
                    if (string != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tm1Title)).setText(string);
                    }
                }
                String string2 = arguments.getString("tm1_dot_color");
                if (string2 != null) {
                    if (gv.n.B0(string2)) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        this.f26640w = string2;
                    }
                }
                ArrayList<String> stringArrayList = arguments.getStringArrayList("tm1_ltestimonial_ist");
                boolean z13 = true;
                if (stringArrayList != null) {
                    if (stringArrayList.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        stringArrayList = null;
                    }
                    if (stringArrayList != null) {
                        arrayList = stringArrayList;
                    }
                }
                ArrayList<String> stringArrayList2 = arguments.getStringArrayList("tm1_date_list");
                if (stringArrayList2 != null) {
                    if (stringArrayList2.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        stringArrayList2 = null;
                    }
                    if (stringArrayList2 != null) {
                        arrayList2 = stringArrayList2;
                    }
                }
                ArrayList<String> stringArrayList3 = arguments.getStringArrayList("tm1_user_list");
                if (stringArrayList3 != null) {
                    if (stringArrayList3.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        stringArrayList3 = null;
                    }
                    if (stringArrayList3 != null) {
                        arrayList3 = stringArrayList3;
                    }
                }
                String string3 = arguments.getString("template_colour", "");
                if (string3 != null && string3.length() != 0) {
                    z13 = false;
                }
                if (str != null) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tm1Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                    this.f26642y = str;
                }
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ArrayList<Testimonial> arrayList4 = this.f26641x;
                String str2 = arrayList.get(i6);
                kotlin.jvm.internal.i.f(str2, "testimonialResponseList[i]");
                String str3 = str2;
                String str4 = (String) is.u.j2(i6, arrayList2);
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = (String) is.u.j2(i6, arrayList3);
                if (str5 == null) {
                    str5 = "";
                }
                arrayList4.add(new Testimonial(str3, str4, str5));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26643z, e10);
        }
    }

    @Override // rn.b
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
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_tm1, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            K();
            J();
            androidx.fragment.app.p activity = getActivity();
            ArrayList<Testimonial> arrayList = this.f26641x;
            if (activity != null) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                ((ViewPager) _$_findCachedViewById(R.id.tm1Viewpager)).setAdapter(new a(activity2, this.f26642y, arrayList));
            }
            ((ViewPager) _$_findCachedViewById(R.id.tm1Viewpager)).b(new b(arrayList.size()));
            ((ViewPager) _$_findCachedViewById(R.id.tm1Viewpager)).v(0);
            I(0, arrayList.size());
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26643z, e10);
        }
    }

    /* compiled from: TM1Fragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f26647a;

        public b(int i6) {
            this.f26647a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = w1.B;
            w1.this.I(i6, this.f26647a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
