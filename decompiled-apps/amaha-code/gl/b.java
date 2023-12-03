package gl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hl.f0;
import hs.k;
import ik.l1;
import java.util.List;
import k0.a;
import kotlin.jvm.internal.i;
import ss.v;
/* compiled from: NotV4RecentAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {
    public final String A;

    /* renamed from: x  reason: collision with root package name */
    public List<NotV4RecentModel> f16589x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f16590y;

    /* renamed from: z  reason: collision with root package name */
    public final v<String, String, String, Boolean, String, String, Integer, Boolean, k> f16591z;

    /* compiled from: NotV4RecentAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public b(List itemList, Context context, f0 f0Var) {
        i.g(itemList, "itemList");
        this.f16589x = itemList;
        this.f16590y = context;
        this.f16591z = f0Var;
        this.A = LogHelper.INSTANCE.makeLogTag("NotV4RecentAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f16589x.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7 A[Catch: Exception -> 0x00fd, TryCatch #0 {Exception -> 0x00fd, blocks: (B:3:0x0002, B:7:0x0015, B:8:0x001e, B:10:0x0027, B:13:0x0034, B:15:0x0040, B:16:0x0072, B:18:0x007a, B:19:0x008b, B:20:0x00bc, B:22:0x00c2, B:25:0x00cb, B:27:0x00e1, B:29:0x00e7, B:30:0x00f3, B:26:0x00d6), top: B:35:0x0002 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        String subText;
        a aVar2 = aVar;
        try {
            NotV4RecentModel notV4RecentModel = this.f16589x.get(i6);
            String label = notV4RecentModel.getLabel();
            View view = aVar2.f2751a;
            if (label != null) {
                ((RobertoTextView) view.findViewById(R.id.tvRecentDashboardCardTitle)).setText(label);
            }
            String itemType = notV4RecentModel.getItemType();
            if (itemType != null) {
                boolean b10 = i.b(itemType, "main_activity");
                Context context = this.f16590y;
                if (b10 && i.b(notV4RecentModel.getParentType(), "mini_course")) {
                    ((ConstraintLayout) view.findViewById(R.id.clRecentDashboardCard)).setBackgroundColor(g0.a.b(context, R.color.libraryShortCoursesBackground));
                    Drawable g5 = k0.a.g(((RobertoTextView) view.findViewById(R.id.tvRecentDashboardCardPremium)).getBackground());
                    a.b.g(g5, g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
                    ((RobertoTextView) view.findViewById(R.id.tvRecentDashboardCardPremium)).setBackground(g5);
                } else if (i.b(itemType, "resource")) {
                    ((ConstraintLayout) view.findViewById(R.id.clRecentDashboardCard)).setBackgroundColor(g0.a.b(context, R.color.libraryResourceBackground));
                } else {
                    ((ConstraintLayout) view.findViewById(R.id.clRecentDashboardCard)).setBackgroundColor(g0.a.b(context, R.color.libraryCollectionBackground));
                    Drawable g10 = k0.a.g(((RobertoTextView) view.findViewById(R.id.tvRecentDashboardCardPremium)).getBackground());
                    a.b.g(g10, g0.a.b(context, R.color.notV4RecentPremiumTag));
                    ((RobertoTextView) view.findViewById(R.id.tvRecentDashboardCardPremium)).setBackground(g10);
                }
            }
            if (!notV4RecentModel.isFree() && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                ((RobertoTextView) view.findViewById(R.id.tvRecentDashboardCardPremium)).setVisibility(0);
                subText = notV4RecentModel.getSubText();
                if (subText != null) {
                    ((RobertoTextView) view.findViewById(R.id.tvRecentDashboardCardSubtext)).setText(subText);
                }
                view.setOnClickListener(new l1(this, notV4RecentModel, i6, 3));
            }
            ((RobertoTextView) view.findViewById(R.id.tvRecentDashboardCardPremium)).setVisibility(8);
            subText = notV4RecentModel.getSubText();
            if (subText != null) {
            }
            view.setOnClickListener(new l1(this, notV4RecentModel, i6, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_recent_dasboard, parent, false, "from(parent.context).inf…_dasboard, parent, false)"));
    }
}
