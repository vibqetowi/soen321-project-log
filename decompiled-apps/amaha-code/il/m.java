package il;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: NotV4DomainBottomSheetDialog.kt */
/* loaded from: classes2.dex */
public final class m extends com.google.android.material.bottomsheet.f {

    /* renamed from: u  reason: collision with root package name */
    public final a f20373u;

    /* renamed from: v  reason: collision with root package name */
    public final s5 f20374v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f20375w;

    /* compiled from: NotV4DomainBottomSheetDialog.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void a0(String str, boolean z10);
    }

    public m(a domainSelectionListener) {
        kotlin.jvm.internal.i.g(domainSelectionListener, "domainSelectionListener");
        this.f20375w = new LinkedHashMap();
        this.f20373u = domainSelectionListener;
        this.f20374v = new s5(12);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20375w;
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

    @Override // com.google.android.material.bottomsheet.f, g.s, androidx.fragment.app.n
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.i.e(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.e eVar = (com.google.android.material.bottomsheet.e) onCreateDialog;
        eVar.setOnShowListener(new l(0));
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_not_v4_db_domain_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20375w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Set<String> set;
        boolean z10;
        int i6;
        View findViewById;
        boolean z11;
        String str;
        int i10;
        HashMap<String, Course> courseNameMap;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (courseNameMap = user.getCourseNameMap()) != null) {
            set = courseNameMap.keySet();
        } else {
            set = null;
        }
        int i11 = R.layout.row_not_v4_db_domain_item;
        int i12 = 1;
        boolean z12 = false;
        s5 s5Var = this.f20374v;
        if (set != null) {
            for (final String tt2 : set) {
                kotlin.jvm.internal.i.f(tt2, "tt");
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str = user2.getCurrentCourseName();
                } else {
                    str = null;
                }
                boolean b10 = kotlin.jvm.internal.i.b(tt2, str);
                View inflate = requireActivity().getLayoutInflater().inflate(i11, (LinearLayoutCompat) _$_findCachedViewById(R.id.llNotV4DbDomainSelectorExistingCourses), z12);
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvRowNotV4DbDomainName);
                if (robertoTextView != null) {
                    robertoTextView.setText(Constants.getCourseDisplayName(tt2));
                }
                if (b10) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.ivRowNotV4DbDomainCta);
                    if (appCompatImageView != null) {
                        androidx.fragment.app.p requireActivity = requireActivity();
                        Object obj = g0.a.f16164a;
                        appCompatImageView.setImageDrawable(a.c.b(requireActivity, R.drawable.ic_round_check));
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvRowNotV4DbDomainName);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setTextColor(g0.a.b(requireActivity(), R.color.sea));
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(R.id.ivRowNotV4DbDomainCta);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(g0.a.b(requireActivity(), R.color.sea)));
                    }
                } else {
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) inflate.findViewById(R.id.ivRowNotV4DbDomainCta);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setVisibility(8);
                    }
                }
                View findViewById2 = inflate.findViewById(R.id.viewRowNotV4DbDomainFooter);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) inflate.findViewById(R.id.ivRowNotV4DbDomainImage);
                if (appCompatImageView4 != null) {
                    s5Var.getClass();
                    Integer i13 = s5.i(tt2);
                    if (i13 != null) {
                        i10 = i13.intValue();
                    } else {
                        i10 = R.drawable.ic_new_db_anxiety_banner;
                    }
                    appCompatImageView4.setImageResource(i10);
                }
                inflate.setOnClickListener(new View.OnClickListener(this) { // from class: il.k

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ m f20370v;

                    {
                        this.f20370v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i14 = r3;
                        String course = tt2;
                        m this$0 = this.f20370v;
                        switch (i14) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(course, "$course");
                                this$0.f20373u.a0(course, false);
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(course, "$course");
                                this$0.f20373u.a0(course, true);
                                return;
                        }
                    }
                });
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) _$_findCachedViewById(R.id.llNotV4DbDomainSelectorExistingCourses);
                if (linearLayoutCompat != null) {
                    linearLayoutCompat.addView(inflate);
                }
                i11 = R.layout.row_not_v4_db_domain_item;
                z12 = false;
            }
        }
        String[] strArr = {Constants.COURSE_DEPRESSION, Constants.COURSE_STRESS, Constants.COURSE_WORRY, Constants.COURSE_SLEEP, Constants.COURSE_ANGER, Constants.COURSE_HAPPINESS};
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 6; i14++) {
            String str2 = strArr[i14];
            if (set != null && !set.contains(str2)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList.add(str2);
            }
        }
        if (arrayList.isEmpty()) {
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvNotV4DbDomainSelectorAddHeader);
            if (robertoTextView3 != null) {
                robertoTextView3.setVisibility(8);
                return;
            }
            return;
        }
        Iterator it = arrayList.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 >= 0) {
                final String str3 = (String) next;
                if (i15 == arrayList.size() - i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                View inflate2 = requireActivity().getLayoutInflater().inflate(R.layout.row_not_v4_db_domain_item, (ViewGroup) ((LinearLayoutCompat) _$_findCachedViewById(R.id.llNotV4DbDomainSelectorAddCourses)), false);
                RobertoTextView robertoTextView4 = (RobertoTextView) inflate2.findViewById(R.id.tvRowNotV4DbDomainName);
                if (robertoTextView4 != null) {
                    robertoTextView4.setText(Constants.getCourseDisplayName(str3));
                }
                RobertoTextView robertoTextView5 = (RobertoTextView) inflate2.findViewById(R.id.tvRowNotV4DbDomainSubText);
                if (robertoTextView5 != null) {
                    robertoTextView5.setVisibility(8);
                }
                if (z10 && (findViewById = inflate2.findViewById(R.id.viewRowNotV4DbDomainFooter)) != null) {
                    findViewById.setVisibility(8);
                }
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) inflate2.findViewById(R.id.ivRowNotV4DbDomainImage);
                if (appCompatImageView5 != null) {
                    s5Var.getClass();
                    Integer i17 = s5.i(str3);
                    if (i17 != null) {
                        i6 = i17.intValue();
                    } else {
                        i6 = R.drawable.ic_new_db_anxiety_banner;
                    }
                    appCompatImageView5.setImageResource(i6);
                }
                inflate2.setOnClickListener(new View.OnClickListener(this) { // from class: il.k

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ m f20370v;

                    {
                        this.f20370v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i142 = r3;
                        String course = str3;
                        m this$0 = this.f20370v;
                        switch (i142) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(course, "$course");
                                this$0.f20373u.a0(course, false);
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(course, "$course");
                                this$0.f20373u.a0(course, true);
                                return;
                        }
                    }
                });
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llNotV4DbDomainSelectorAddCourses);
                if (linearLayoutCompat2 != null) {
                    linearLayoutCompat2.addView(inflate2);
                }
                i15 = i16;
                i12 = 1;
            } else {
                ca.a.t1();
                throw null;
            }
        }
    }
}
