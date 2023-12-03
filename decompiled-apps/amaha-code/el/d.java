package el;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import ik.j1;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import ss.p;
/* compiled from: DashboardExperimentMultiCardAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.e<RecyclerView.c0> {
    public ArrayList<CourseDayModelV1> A;
    public int B;
    public int C;
    public final p<CourseDayModelV1, Boolean, k> D;
    public final int E;
    public final int F;
    public final int G;
    public HashMap<String, String> H;

    /* renamed from: x  reason: collision with root package name */
    public int f14380x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14381y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14382z;

    /* compiled from: DashboardExperimentMultiCardAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14383u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14384v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14385w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f14386x;

        /* renamed from: y  reason: collision with root package name */
        public final AppCompatImageView f14387y;

        /* renamed from: z  reason: collision with root package name */
        public final View f14388z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.rowDbMultiCardExpLockedDayText);
            i.f(findViewById, "view.findViewById(R.id.r…ultiCardExpLockedDayText)");
            this.f14383u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.rowDbMultiCardExpLockedActivityName);
            i.f(findViewById2, "view.findViewById(R.id.r…ardExpLockedActivityName)");
            this.f14384v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.rowDbMultiCardExpLockedActivityDuration);
            i.f(findViewById3, "view.findViewById(R.id.r…xpLockedActivityDuration)");
            this.f14385w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.rowDbMultiCardExpLockedStatusText);
            i.f(findViewById4, "view.findViewById(R.id.r…iCardExpLockedStatusText)");
            this.f14386x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.rowDbMultiCardExpLockedActivityFooterImage);
            i.f(findViewById5, "view.findViewById(R.id.r…ockedActivityFooterImage)");
            this.f14387y = (AppCompatImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.rowDbMultiCardExpLockedContainer);
            i.f(findViewById6, "view.findViewById(R.id.r…tiCardExpLockedContainer)");
            this.f14388z = findViewById6;
        }
    }

    /* compiled from: DashboardExperimentMultiCardAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14389u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14390v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14391w;

        /* renamed from: x  reason: collision with root package name */
        public final AppCompatImageView f14392x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f14393y;

        /* renamed from: z  reason: collision with root package name */
        public final AppCompatImageView f14394z;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.rowDbMultiCardExpUnlockedDayText);
            i.f(findViewById, "view.findViewById(R.id.r…tiCardExpUnlockedDayText)");
            this.f14389u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.rowDbMultiCardExpUnlockedActivityName);
            i.f(findViewById2, "view.findViewById(R.id.r…dExpUnlockedActivityName)");
            this.f14390v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.rowDbMultiCardExpUnlockedActivityDuration);
            i.f(findViewById3, "view.findViewById(R.id.r…UnlockedActivityDuration)");
            this.f14391w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.rowDbMultiCardExpUnlockedActivityFooterImage);
            i.f(findViewById4, "view.findViewById(R.id.r…ockedActivityFooterImage)");
            this.f14392x = (AppCompatImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.rowDbMultiCardExpUnlockedStatusText);
            i.f(findViewById5, "view.findViewById(R.id.r…ardExpUnlockedStatusText)");
            this.f14393y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.rowDbMultiCardExpUnlockedImage);
            i.f(findViewById6, "view.findViewById(R.id.r…ultiCardExpUnlockedImage)");
            this.f14394z = (AppCompatImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.rowDbMultiCardExpUnlockedContainer);
            i.f(findViewById7, "view.findViewById(R.id.r…CardExpUnlockedContainer)");
            this.A = findViewById7;
        }
    }

    public d(int i6, boolean z10, boolean z11, ArrayList plan, int i10, int i11, V3DashboardActivity.o oVar) {
        i.g(plan, "plan");
        this.f14380x = i6;
        this.f14381y = z10;
        this.f14382z = z11;
        this.A = plan;
        this.B = i10;
        this.C = i11;
        this.D = oVar;
        this.E = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        this.F = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
        this.G = 4096;
        this.H = new HashMap<>();
    }

    public static int w(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                return R.drawable.ir_db_multicard_footer_7;
                            }
                            return R.drawable.ir_db_multicard_footer_6;
                        }
                        return R.drawable.ir_db_multicard_footer_5;
                    }
                    return R.drawable.ir_db_multicard_footer_4;
                }
                return R.drawable.ir_db_multicard_footer_3;
            }
            return R.drawable.ir_db_multicard_footer_2;
        }
        return R.drawable.ir_db_multicard_footer_1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return 7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        CourseDayModelV1 v10 = v(i6);
        int i10 = this.F;
        if (v10 == null) {
            return i10;
        }
        if (v10.getPosition() >= this.f14380x) {
            if (v10.getPosition() <= this.f14380x) {
                if (this.f14381y) {
                    return this.G;
                }
            } else {
                return i10;
            }
        }
        return this.E;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        int i10;
        String str;
        long j10;
        CourseDayModelV1 v10 = v(i6);
        if (v10 != null) {
            b bVar = null;
            a aVar = null;
            String str2 = "";
            if (v10.getPosition() > this.f14380x) {
                if (c0Var instanceof a) {
                    aVar = (a) c0Var;
                }
                if (aVar != null) {
                    aVar.f14383u.setText("Day " + (i6 + 1));
                    aVar.f14384v.setText(v10.getContent_label());
                    HashMap<String, String> hashMap = this.H;
                    String content_id = v10.getContent_id();
                    if (content_id == null) {
                        content_id = "";
                    }
                    String str3 = hashMap.get(content_id);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    aVar.f14385w.setText(str2);
                    u uVar = new u();
                    if (v10.getPosition() == this.f14380x + 1 && !this.f14381y) {
                        if (i6 > 0) {
                            CourseDayModelV1 v11 = v(i6 - 1);
                            if (v11 != null) {
                                j10 = v11.getStart_date();
                            } else {
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                str = "Preview is available!";
                            }
                        }
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            uVar.f23466u = true;
                            str = "Available tomorrow";
                        }
                        str = "Unlock to access";
                    } else {
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            str = "Available later";
                        }
                        str = "Unlock to access";
                    }
                    aVar.f14386x.setText(str);
                    aVar.f14387y.setImageResource(w(i6));
                    View view = aVar.f2751a;
                    aVar.f14388z.setBackgroundColor(g0.a.b(view.getContext(), this.C));
                    view.setOnClickListener(new c(v10, this, i6, aVar, uVar, 0));
                    return;
                }
                return;
            }
            if (c0Var instanceof b) {
                bVar = (b) c0Var;
            }
            if (bVar != null) {
                bVar.f14389u.setText("Day " + (i6 + 1));
                bVar.f14390v.setText(v10.getContent_label());
                HashMap<String, String> hashMap2 = this.H;
                String content_id2 = v10.getContent_id();
                if (content_id2 == null) {
                    content_id2 = "";
                }
                String str4 = hashMap2.get(content_id2);
                if (str4 != null) {
                    str2 = str4;
                }
                bVar.f14391w.setText(str2);
                bVar.f14392x.setImageResource(w(i6));
                int i11 = 8;
                if (this.f14381y && v10.getPosition() == this.f14380x) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                bVar.f14393y.setVisibility(i10);
                int position = v10.getPosition();
                int i12 = this.f14380x;
                AppCompatImageView appCompatImageView = bVar.f14394z;
                if (position == i12) {
                    if (this.f14381y) {
                        appCompatImageView.setImageResource(R.drawable.ic_multicard_lock_partial);
                        appCompatImageView.setVisibility(0);
                    } else {
                        appCompatImageView.setImageResource(R.drawable.ic_multicard_completed_check);
                        if (this.f14382z) {
                            i11 = 0;
                        }
                        appCompatImageView.setVisibility(i11);
                    }
                } else {
                    appCompatImageView.setImageResource(R.drawable.ic_multicard_completed_check);
                    appCompatImageView.setVisibility(0);
                }
                View view2 = bVar.f2751a;
                bVar.A.setBackgroundColor(g0.a.b(view2.getContext(), this.C));
                view2.setOnClickListener(new j1(this, 15, v10));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.F) {
            return new a(e.h(parent, R.layout.row_db_multicard_exp_locked, parent, false, "from(parent.context).inf…xp_locked, parent, false)"));
        }
        return new b(e.h(parent, R.layout.row_db_multicard_exp_unlocked, parent, false, "from(parent.context).inf…_unlocked, parent, false)"));
    }

    public final CourseDayModelV1 v(int i6) {
        int i10 = this.B;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return (CourseDayModelV1) is.u.j2(i6 + 23, this.A);
                }
                return (CourseDayModelV1) is.u.j2(i6 + 16, this.A);
            }
            return (CourseDayModelV1) is.u.j2(i6 + 8, this.A);
        }
        return (CourseDayModelV1) is.u.j2(i6 + 1, this.A);
    }
}
