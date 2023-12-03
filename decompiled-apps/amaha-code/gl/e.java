package gl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.SuggestedActivityDetailsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AnimUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import ss.r;
/* compiled from: SuggestedActivityDayPlanAdapter.kt */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.e<b> {
    public final HashMap<String, ArrayList<String>> A;
    public final HashMap<String, String> B;
    public final int C;
    public String D;
    public String E;
    public final r<SuggestedActivityModel, Integer, Boolean, String, k> F;
    public final r<SuggestedActivityModel, Integer, Boolean, String, k> G;
    public final String H;
    public ArrayList<SuggestedActivityModel> I;
    public AnimatorSet J;

    /* renamed from: x  reason: collision with root package name */
    public final String f16602x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<SuggestedActivityModel> f16603y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<SuggestedActivityModel> f16604z;

    /* compiled from: SuggestedActivityDayPlanAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16605a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16606b;

        public a(int i6, boolean z10) {
            this.f16605a = i6;
            this.f16606b = z10;
        }
    }

    /* compiled from: SuggestedActivityDayPlanAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: SuggestedActivityDayPlanAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f16607a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f16608b;

        public c(View view, e eVar) {
            this.f16607a = view;
            this.f16608b = eVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            i.g(p02, "p0");
            try {
                this.f16607a.setVisibility(8);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f16608b.H, e10);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            i.g(p02, "p0");
            try {
                this.f16607a.setVisibility(8);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f16608b.H, e10);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            i.g(p02, "p0");
        }
    }

    public e(String str, ArrayList arrayList, ArrayList saParentPlanList, HashMap saMap, HashMap descriptionMap, int i6, String str2, String str3, SuggestedActivityDetailsActivity.f fVar, SuggestedActivityDetailsActivity.g gVar) {
        i.g(saParentPlanList, "saParentPlanList");
        i.g(saMap, "saMap");
        i.g(descriptionMap, "descriptionMap");
        this.f16602x = str;
        this.f16603y = arrayList;
        this.f16604z = saParentPlanList;
        this.A = saMap;
        this.B = descriptionMap;
        this.C = i6;
        this.D = str2;
        this.E = str3;
        this.F = fVar;
        this.G = gVar;
        this.H = LogHelper.INSTANCE.makeLogTag("SuggestedActivityDayPlanAdapter");
        this.I = new ArrayList<>();
        v(this.D, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.I.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Throwable] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(b bVar, final int i6) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        String str;
        boolean z12;
        boolean z13;
        int i12 = this.C;
        View view = bVar.f2751a;
        try {
            SuggestedActivityModel suggestedActivityModel = this.I.get(i6);
            i.f(suggestedActivityModel, "saParentFilterPlanList[position]");
            final SuggestedActivityModel suggestedActivityModel2 = suggestedActivityModel;
            ((RobertoTextView) view.findViewById(R.id.tvRowSACParentActivityHeader)).setText(suggestedActivityModel2.getContent_label());
            ((RobertoTextView) view.findViewById(R.id.tvRowSACParentActivitySubHeader)).setText(this.B.get(suggestedActivityModel2.getContent_id()));
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivRowSACParentActivityStatus);
            SuggestedActivityModel x10 = x(suggestedActivityModel2.getContent_id());
            if (x10 != null && x10.isCompleted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = R.drawable.ic_completed_tick;
            } else {
                i10 = R.drawable.ic_collection_status_active;
            }
            appCompatImageView.setImageResource(i10);
            ((AppCompatImageView) view.findViewById(R.id.ivRowSACParentActivityStatus)).setImageTintList(ColorStateList.valueOf(g0.a.b(view.getContext(), i12)));
            view.findViewById(R.id.viewRowSACParentActivity).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(view.getContext(), i12)));
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.ivRowSACParentActivityBookmark);
            SuggestedActivityModel x11 = x(suggestedActivityModel2.getContent_id());
            if (x11 != null && x11.isFavorite()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = R.drawable.ic_saved;
            } else {
                i11 = R.drawable.ic_unsaved;
            }
            appCompatImageView2.setImageResource(i11);
            ((AppCompatImageView) view.findViewById(R.id.ivRowSACParentActivityBookmark)).setOnClickListener(new View.OnClickListener(this) { // from class: gl.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f16593v;

                {
                    this.f16593v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = r4;
                    int i14 = i6;
                    SuggestedActivityModel parentActivity = suggestedActivityModel2;
                    e this$0 = this.f16593v;
                    switch (i13) {
                        case 0:
                            i.g(this$0, "this$0");
                            i.g(parentActivity, "$parentActivity");
                            this$0.G.r(this$0.x(parentActivity.getContent_id()), Integer.valueOf(i14), null, null);
                            return;
                        default:
                            i.g(this$0, "this$0");
                            i.g(parentActivity, "$parentActivity");
                            this$0.F.r(this$0.x(parentActivity.getContent_id()), Integer.valueOf(i14), null, null);
                            AnimatorSet animatorSet = this$0.J;
                            if (animatorSet != null) {
                                animatorSet.end();
                            }
                            AnimatorSet animatorSet2 = this$0.J;
                            if (animatorSet2 != null) {
                                animatorSet2.removeAllListeners();
                                return;
                            }
                            return;
                    }
                }
            });
            int i13 = R.id.llRowSACFillerActivityContainer;
            ((LinearLayout) view.findViewById(R.id.llRowSACFillerActivityContainer)).removeAllViews();
            HashMap<String, ArrayList<String>> hashMap = this.A;
            SuggestedActivityModel suggestedActivityModel3 = (SuggestedActivityModel) u.j2(i6, this.I);
            String str2 = null;
            if (suggestedActivityModel3 != null) {
                str = suggestedActivityModel3.getContent_id();
            } else {
                str = null;
            }
            ArrayList<String> arrayList = hashMap.get(str);
            if (arrayList != null) {
                int i14 = 0;
                for (Object obj : arrayList) {
                    int i15 = i14 + 1;
                    if (i14 >= 0) {
                        String str3 = (String) obj;
                        Context context = view.getContext();
                        i.f(context, "holder.itemView.context");
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(i13);
                        i.f(linearLayout, "holder.itemView.llRowSACFillerActivityContainer");
                        if (i14 == arrayList.size() - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        SuggestedActivityModel x12 = x(suggestedActivityModel2.getContent_id());
                        if (x12 != null) {
                            z13 = x12.isCompleted();
                        } else {
                            z13 = false;
                        }
                        y(context, linearLayout, str3, z12, z13, i6, suggestedActivityModel2.getContent_label());
                        str2 = str2;
                        i14 = i15;
                        i13 = R.id.llRowSACFillerActivityContainer;
                    } else {
                        ?? r13 = str2;
                        ca.a.t1();
                        throw r13;
                    }
                }
            }
            String str4 = str2;
            String str5 = this.E;
            if (str5 != null && i.b(str5, suggestedActivityModel2.getContent_id())) {
                this.E = str4;
                View findViewById = view.findViewById(R.id.viewRowSACPulseBg);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                    AnimatorSet showPulseEffect$default = AnimUtils.showPulseEffect$default(AnimUtils.INSTANCE, findViewById, 1500L, 1.3f, 0.0f, 0, 24, null);
                    showPulseEffect$default.addListener(new f(findViewById, this));
                    this.J = showPulseEffect$default;
                }
            }
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: gl.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f16593v;

                {
                    this.f16593v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i132 = r4;
                    int i142 = i6;
                    SuggestedActivityModel parentActivity = suggestedActivityModel2;
                    e this$0 = this.f16593v;
                    switch (i132) {
                        case 0:
                            i.g(this$0, "this$0");
                            i.g(parentActivity, "$parentActivity");
                            this$0.G.r(this$0.x(parentActivity.getContent_id()), Integer.valueOf(i142), null, null);
                            return;
                        default:
                            i.g(this$0, "this$0");
                            i.g(parentActivity, "$parentActivity");
                            this$0.F.r(this$0.x(parentActivity.getContent_id()), Integer.valueOf(i142), null, null);
                            AnimatorSet animatorSet = this$0.J;
                            if (animatorSet != null) {
                                animatorSet.end();
                            }
                            AnimatorSet animatorSet2 = this$0.J;
                            if (animatorSet2 != null) {
                                animatorSet2.removeAllListeners();
                                return;
                            }
                            return;
                    }
                }
            };
            ((RobertoTextView) view.findViewById(R.id.tvRowSACParentActivityHeader)).setOnClickListener(onClickListener);
            ((RobertoTextView) view.findViewById(R.id.tvRowSACParentActivitySubHeader)).setOnClickListener(onClickListener);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.H, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new b(defpackage.e.h(parent, R.layout.row_suggested_activities_container, parent, false, "from(parent.context).inf…container, parent, false)"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(String str, boolean z10) {
        if (str != null) {
            this.D = str;
            ArrayList<SuggestedActivityModel> arrayList = new ArrayList<>();
            for (Object obj : this.f16604z) {
                if (i.b(((SuggestedActivityModel) obj).getSymptom(), this.D)) {
                    arrayList.add(obj);
                }
            }
            this.I = arrayList;
            if (!z10) {
                i();
            }
        }
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet animatorSet2 = this.J;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
    }

    public final a w(String str) {
        boolean z10;
        Iterator<SuggestedActivityModel> it = this.I.iterator();
        int i6 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                return null;
            }
            SuggestedActivityModel next = it.next();
            int i10 = i6 + 1;
            if (i6 >= 0) {
                SuggestedActivityModel suggestedActivityModel = next;
                if (i.b(suggestedActivityModel.getContent_id(), str)) {
                    return new a(i6, false);
                }
                ArrayList<String> arrayList = this.A.get(suggestedActivityModel.getContent_id());
                if (arrayList != null) {
                    Iterator<String> it2 = arrayList.iterator();
                    int i11 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (i.b(it2.next(), str)) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i11);
                    if (valueOf.intValue() == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        num = valueOf;
                    }
                    if (num != null) {
                        num.intValue();
                        return new a(i6, true);
                    }
                }
                i6 = i10;
            } else {
                ca.a.t1();
                throw null;
            }
        }
    }

    public final SuggestedActivityModel x(String str) {
        ArrayList<SuggestedActivityModel> planSuggested;
        Course courseByName = FirebasePersistence.getInstance().getCourseByName(this.f16602x);
        if (courseByName != null && (planSuggested = courseByName.getPlanSuggested()) != null) {
            Iterator<SuggestedActivityModel> it = this.f16603y.iterator();
            int i6 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (i.b(it.next().getContent_id(), str)) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            return (SuggestedActivityModel) u.j2(i6, planSuggested);
        }
        return null;
    }

    public final void y(Context context, LinearLayout linearLayout, String str, boolean z10, final boolean z11, final int i6, final String str2) {
        float f;
        String str3;
        String str4;
        int i10;
        int i11;
        boolean z12;
        int i12;
        int i13;
        String str5;
        int i14 = this.C;
        try {
            final SuggestedActivityModel x10 = x(str);
            boolean z13 = false;
            View inflate = LayoutInflater.from(context).inflate(R.layout.row_suggested_filler_activity, (ViewGroup) linearLayout, false);
            View findViewById = inflate.findViewById(R.id.clRowSAFParentContainer);
            if (findViewById != null) {
                if (z11) {
                    f = 1.0f;
                } else {
                    f = 0.6f;
                }
                findViewById.setAlpha(f);
            }
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvRowSAFParentActivityHeader);
            if (x10 != null) {
                str3 = x10.getContent_label();
            } else {
                str3 = null;
            }
            robertoTextView.setText(str3);
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvRowSAFParentActivitySubHeader);
            HashMap<String, String> hashMap = this.B;
            if (x10 != null) {
                str4 = x10.getContent_id();
            } else {
                str4 = null;
            }
            robertoTextView2.setText(hashMap.get(str4));
            RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvRowSAFParentActivityHeader);
            int i15 = R.color.title_high_contrast_54_opacity;
            if (z11) {
                i10 = R.color.title_high_contrast;
            } else {
                i10 = R.color.title_high_contrast_54_opacity;
            }
            robertoTextView3.setTextColor(g0.a.b(context, i10));
            RobertoTextView robertoTextView4 = (RobertoTextView) inflate.findViewById(R.id.tvRowSAFParentActivitySubHeader);
            if (z11) {
                i15 = R.color.title_high_contrast;
            }
            robertoTextView4.setTextColor(g0.a.b(context, i15));
            View findViewById2 = inflate.findViewById(R.id.viewRowSAFBottom);
            if (z10) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            findViewById2.setVisibility(i11);
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.ivRowSAFParentActivityStatus);
            if (x10 != null && x10.isCompleted()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i12 = R.drawable.ic_check_transparent_grey_bg;
            } else if (z11) {
                i12 = R.drawable.ic_collection_status_active;
            } else {
                i12 = R.drawable.ic_collection_status_locked;
            }
            appCompatImageView.setImageResource(i12);
            ((AppCompatImageView) inflate.findViewById(R.id.ivRowSAFParentActivityStatus)).setImageTintList(ColorStateList.valueOf(g0.a.b(context, i14)));
            inflate.findViewById(R.id.viewRowSAFBottom).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(context, i14)));
            String str6 = this.E;
            if (str6 != null) {
                if (x10 != null) {
                    str5 = x10.getContent_id();
                } else {
                    str5 = null;
                }
                if (i.b(str6, str5)) {
                    this.E = null;
                    View findViewById3 = inflate.findViewById(R.id.viewRowSAFPulseBg);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(0);
                        AnimatorSet showPulseEffect$default = AnimUtils.showPulseEffect$default(AnimUtils.INSTANCE, findViewById3, 1500L, 1.3f, 0.0f, 0, 24, null);
                        showPulseEffect$default.addListener(new c(findViewById3, this));
                        this.J = showPulseEffect$default;
                    }
                }
            }
            inflate.setOnClickListener(new View.OnClickListener(this) { // from class: gl.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f16597v;

                {
                    this.f16597v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = r6;
                    String str7 = str2;
                    SuggestedActivityModel suggestedActivityModel = x10;
                    boolean z14 = z11;
                    int i17 = i6;
                    e this$0 = this.f16597v;
                    switch (i16) {
                        case 0:
                            i.g(this$0, "this$0");
                            this$0.F.r(suggestedActivityModel, Integer.valueOf(i17), Boolean.valueOf(z14), str7);
                            AnimatorSet animatorSet = this$0.J;
                            if (animatorSet != null) {
                                animatorSet.end();
                            }
                            AnimatorSet animatorSet2 = this$0.J;
                            if (animatorSet2 != null) {
                                animatorSet2.removeAllListeners();
                                return;
                            }
                            return;
                        default:
                            i.g(this$0, "this$0");
                            this$0.G.r(suggestedActivityModel, Integer.valueOf(i17), Boolean.valueOf(z14), str7);
                            return;
                    }
                }
            });
            ((AppCompatImageView) inflate.findViewById(R.id.ivRowSAFParentActivityBookmark)).setVisibility(0);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(R.id.ivRowSAFParentActivityBookmark);
            if (x10 != null && x10.isFavorite()) {
                z13 = true;
            }
            if (z13) {
                i13 = R.drawable.ic_saved;
            } else {
                i13 = R.drawable.ic_unsaved;
            }
            appCompatImageView2.setImageResource(i13);
            ((AppCompatImageView) inflate.findViewById(R.id.ivRowSAFParentActivityBookmark)).setOnClickListener(new View.OnClickListener(this) { // from class: gl.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f16597v;

                {
                    this.f16597v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = r6;
                    String str7 = str2;
                    SuggestedActivityModel suggestedActivityModel = x10;
                    boolean z14 = z11;
                    int i17 = i6;
                    e this$0 = this.f16597v;
                    switch (i16) {
                        case 0:
                            i.g(this$0, "this$0");
                            this$0.F.r(suggestedActivityModel, Integer.valueOf(i17), Boolean.valueOf(z14), str7);
                            AnimatorSet animatorSet = this$0.J;
                            if (animatorSet != null) {
                                animatorSet.end();
                            }
                            AnimatorSet animatorSet2 = this$0.J;
                            if (animatorSet2 != null) {
                                animatorSet2.removeAllListeners();
                                return;
                            }
                            return;
                        default:
                            i.g(this$0, "this$0");
                            this$0.G.r(suggestedActivityModel, Integer.valueOf(i17), Boolean.valueOf(z14), str7);
                            return;
                    }
                }
            });
            linearLayout.addView(inflate);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.H, e10);
        }
    }
}
