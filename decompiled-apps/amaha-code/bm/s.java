package bm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.l1;
import is.u;
import java.io.File;
import java.util.ArrayList;
/* compiled from: V3GoalsRAExperimentAdapter.kt */
/* loaded from: classes2.dex */
public final class s extends RecyclerView.e<a> {
    public final String A;
    public final LayoutInflater B;
    public final RecyclerView C;

    /* renamed from: x  reason: collision with root package name */
    public final Context f4531x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<RecommendedActivityModel> f4532y;

    /* renamed from: z  reason: collision with root package name */
    public final ss.l<RecommendedActivityModel, hs.k> f4533z;

    /* compiled from: V3GoalsRAExperimentAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public s(androidx.fragment.app.p pVar, ArrayList recommendedActivitiesList, RecyclerView recyclerView, ss.l lVar) {
        kotlin.jvm.internal.i.g(recommendedActivitiesList, "recommendedActivitiesList");
        this.f4531x = pVar;
        this.f4532y = recommendedActivitiesList;
        this.f4533z = lVar;
        this.A = LogHelper.INSTANCE.makeLogTag(s.class);
        Object systemService = pVar.getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.B = (LayoutInflater) systemService;
        this.C = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f4532y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        String str;
        View view = aVar.f2751a;
        try {
            RecommendedActivityModel recommendedActivityModel = this.f4532y.get(i6);
            kotlin.jvm.internal.i.f(recommendedActivityModel, "recommendedActivitiesList[position]");
            RecommendedActivityModel recommendedActivityModel2 = recommendedActivityModel;
            ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setText(recommendedActivityModel2.getTitle());
            String duration = recommendedActivityModel2.getDuration();
            if (duration != null && duration.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            Context context = this.f4531x;
            if (z10) {
                ((RobertoTextView) view.findViewById(R.id.tvActivityType)).setText(recommendedActivityModel2.getTemplateTypeText());
            } else {
                ((RobertoTextView) view.findViewById(R.id.tvActivityType)).setText(context.getString(R.string.dbRaExperimentSubHeader, recommendedActivityModel2.getTemplateTypeText(), recommendedActivityModel2.getDuration()));
            }
            String thumbUrl = recommendedActivityModel2.getThumbUrl();
            if (thumbUrl != null) {
                str = (String) u.p2(gv.r.a1(thumbUrl, new String[]{"/"}, 0, 6));
            } else {
                str = null;
            }
            if (str != null) {
                String[] fileList = context.fileList();
                kotlin.jvm.internal.i.f(fileList, "context.fileList()");
                if (is.k.Q1(str, fileList)) {
                    Glide.c(context).c(context).d(new File(context.getFilesDir(), str)).B((AppCompatImageView) view.findViewById(R.id.ivTitleCard));
                    view.setOnClickListener(new l1(this, i6, recommendedActivityModel2, 15));
                }
            }
            Glide.g(context).p(recommendedActivityModel2.getThumbUrl()).B((AppCompatImageView) view.findViewById(R.id.ivTitleCard));
            view.setOnClickListener(new l1(this, i6, recommendedActivityModel2, 15));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, "exception", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        View inflate = this.B.inflate(R.layout.item_goals_recommended_activity_experiment_layout, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layou…nt_layout, parent, false)");
        return new a(inflate);
    }
}
