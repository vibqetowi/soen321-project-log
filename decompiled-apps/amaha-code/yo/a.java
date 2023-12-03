package yo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.r;
import ho.o;
import hs.k;
import is.u;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.l;
/* compiled from: RecommendedActivitiesExperimentAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0657a> {
    public final String A;
    public final LayoutInflater B;

    /* renamed from: x  reason: collision with root package name */
    public final Context f38701x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<RecommendedActivityModel> f38702y;

    /* renamed from: z  reason: collision with root package name */
    public final l<RecommendedActivityModel, k> f38703z;

    /* compiled from: RecommendedActivitiesExperimentAdapter.kt */
    /* renamed from: yo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0657a extends RecyclerView.c0 {
        public C0657a(View view) {
            super(view);
        }
    }

    public a(RecommendedActivitiesExperimentActivity recommendedActivitiesExperimentActivity, ArrayList recommendedActivitiesList, xo.a aVar) {
        i.g(recommendedActivitiesList, "recommendedActivitiesList");
        this.f38701x = recommendedActivitiesExperimentActivity;
        this.f38702y = recommendedActivitiesList;
        this.f38703z = aVar;
        this.A = LogHelper.INSTANCE.makeLogTag(a.class);
        Object systemService = recommendedActivitiesExperimentActivity.getSystemService("layout_inflater");
        i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.B = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f38702y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0657a c0657a, int i6) {
        boolean z10;
        String str;
        View view = c0657a.f2751a;
        try {
            RecommendedActivityModel recommendedActivityModel = this.f38702y.get(i6);
            i.f(recommendedActivityModel, "recommendedActivitiesList[position]");
            RecommendedActivityModel recommendedActivityModel2 = recommendedActivityModel;
            ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setText(recommendedActivityModel2.getTitle());
            String duration = recommendedActivityModel2.getDuration();
            if (duration != null && duration.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            Context context = this.f38701x;
            if (z10) {
                ((RobertoTextView) view.findViewById(R.id.tvActivityType)).setText(recommendedActivityModel2.getTemplateTypeText());
            } else {
                ((RobertoTextView) view.findViewById(R.id.tvActivityType)).setText(context.getString(R.string.dbRaExperimentSubHeader, recommendedActivityModel2.getTemplateTypeText(), recommendedActivityModel2.getDuration()));
            }
            ((RobertoTextView) view.findViewById(R.id.tvActivityDuration)).setText(recommendedActivityModel2.getDuration());
            String thumbUrl = recommendedActivityModel2.getThumbUrl();
            if (thumbUrl != null) {
                str = (String) u.p2(r.a1(thumbUrl, new String[]{"/"}, 0, 6));
            } else {
                str = null;
            }
            if (str != null) {
                String[] fileList = context.fileList();
                i.f(fileList, "context.fileList()");
                if (is.k.Q1(str, fileList)) {
                    Glide.c(context).c(context).d(new File(context.getFilesDir(), str)).B((AppCompatImageView) view.findViewById(R.id.ivTitleCard));
                    view.setOnClickListener(new o(this, 6, recommendedActivityModel2));
                }
            }
            Glide.g(context).p(recommendedActivityModel2.getThumbUrl()).B((AppCompatImageView) view.findViewById(R.id.ivTitleCard));
            view.setOnClickListener(new o(this, 6, recommendedActivityModel2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, "exception", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        View inflate = this.B.inflate(R.layout.item_recommended_activities_experiment, (ViewGroup) parent, false);
        i.f(inflate, "inflater.inflate(R.layou…xperiment, parent, false)");
        return new C0657a(inflate);
    }
}
