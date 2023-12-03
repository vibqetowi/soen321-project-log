package gl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4RecentActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fl.w;
import hs.k;
import ik.l1;
import java.util.List;
import k0.a;
import kotlin.jvm.internal.i;
import ss.v;
/* compiled from: NotV4AllRecentAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0252a> {
    public final String A;
    public final int B;

    /* renamed from: x  reason: collision with root package name */
    public List<NotV4RecentModel> f16586x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f16587y;

    /* renamed from: z  reason: collision with root package name */
    public final v<String, String, String, Boolean, String, String, Integer, Boolean, k> f16588z;

    /* compiled from: NotV4AllRecentAdapter.kt */
    /* renamed from: gl.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0252a extends RecyclerView.c0 {
        public C0252a(View view) {
            super(view);
        }
    }

    public a(List itemList, NotV4RecentActivity notV4RecentActivity, w wVar) {
        i.g(itemList, "itemList");
        this.f16586x = itemList;
        this.f16587y = notV4RecentActivity;
        this.f16588z = wVar;
        this.A = LogHelper.INSTANCE.makeLogTag("NotV4AllRecentAdapter");
        this.B = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f16586x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (i.b(this.f16586x.get(i6).isHeader(), Boolean.TRUE)) {
            return 0;
        }
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010a A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:3:0x0002, B:7:0x001b, B:11:0x002a, B:12:0x002f, B:14:0x0035, B:15:0x0041, B:17:0x004a, B:20:0x0057, B:22:0x0063, B:23:0x0095, B:25:0x009d, B:26:0x00ae, B:27:0x00df, B:29:0x00e5, B:32:0x00ee, B:34:0x0104, B:36:0x010a, B:37:0x0116, B:33:0x00f9), top: B:42:0x0002 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(C0252a c0252a, int i6) {
        String subText;
        C0252a c0252a2 = c0252a;
        try {
            NotV4RecentModel notV4RecentModel = this.f16586x.get(i6);
            boolean b10 = i.b(notV4RecentModel.isHeader(), Boolean.TRUE);
            View view = c0252a2.f2751a;
            if (b10) {
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowRecentViewAllHeader);
                String headerTitle = notV4RecentModel.getHeaderTitle();
                if (headerTitle == null) {
                    headerTitle = "";
                }
                robertoTextView.setText(headerTitle);
                return;
            }
            String label = notV4RecentModel.getLabel();
            if (label != null) {
                ((RobertoTextView) view.findViewById(R.id.tvRecentViewAllCardTitle)).setText(label);
            }
            String itemType = notV4RecentModel.getItemType();
            if (itemType != null) {
                boolean b11 = i.b(itemType, "main_activity");
                Context context = this.f16587y;
                if (b11 && i.b(notV4RecentModel.getParentType(), "mini_course")) {
                    ((ConstraintLayout) view.findViewById(R.id.clRecentViewAllCard)).setBackgroundColor(g0.a.b(context, R.color.libraryShortCoursesBackground));
                    Drawable g5 = k0.a.g(((RobertoTextView) view.findViewById(R.id.tvRecentViewAllCardPremium)).getBackground());
                    a.b.g(g5, g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
                    ((RobertoTextView) view.findViewById(R.id.tvRecentViewAllCardPremium)).setBackground(g5);
                } else if (i.b(itemType, "resource")) {
                    ((ConstraintLayout) view.findViewById(R.id.clRecentViewAllCard)).setBackgroundColor(g0.a.b(context, R.color.libraryResourceBackground));
                } else {
                    ((ConstraintLayout) view.findViewById(R.id.clRecentViewAllCard)).setBackgroundColor(g0.a.b(context, R.color.libraryCollectionBackground));
                    Drawable g10 = k0.a.g(((RobertoTextView) view.findViewById(R.id.tvRecentViewAllCardPremium)).getBackground());
                    a.b.g(g10, g0.a.b(context, R.color.notV4RecentPremiumTag));
                    ((RobertoTextView) view.findViewById(R.id.tvRecentViewAllCardPremium)).setBackground(g10);
                }
            }
            if (!notV4RecentModel.isFree() && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                ((RobertoTextView) view.findViewById(R.id.tvRecentViewAllCardPremium)).setVisibility(0);
                subText = notV4RecentModel.getSubText();
                if (subText != null) {
                    ((RobertoTextView) view.findViewById(R.id.tvRecentViewAllCardSubtext)).setText(subText);
                }
                view.setOnClickListener(new l1(this, notV4RecentModel, i6, 2));
            }
            ((RobertoTextView) view.findViewById(R.id.tvRecentViewAllCardPremium)).setVisibility(8);
            subText = notV4RecentModel.getSubText();
            if (subText != null) {
            }
            view.setOnClickListener(new l1(this, notV4RecentModel, i6, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.B) {
            return new C0252a(defpackage.e.h(parent, R.layout.row_recent_view_all, parent, false, "from(parent.context).inf…_view_all, parent, false)"));
        }
        return new C0252a(defpackage.e.h(parent, R.layout.row_recent_view_all_header, parent, false, "from(parent.context).inf…ll_header, parent, false)"));
    }
}
