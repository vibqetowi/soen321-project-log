package wm;

import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.n;
import hs.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
/* compiled from: LearningHubExperimentTodayAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<LearningHubModel> f36761x;

    /* renamed from: y  reason: collision with root package name */
    public final ss.a<k> f36762y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f36763z = true;

    /* compiled from: LearningHubExperimentTodayAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public d(ArrayList arrayList, LearningHubExperimentActivity.d dVar) {
        this.f36761x = arrayList;
        this.f36762y = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f36761x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        LearningHubModel learningHubModel = this.f36761x.get(i6);
        i.f(learningHubModel, "list[position]");
        LearningHubModel learningHubModel2 = learningHubModel;
        String post_type = learningHubModel2.getPost_type();
        int i10 = R.id.ivTitleCard;
        View view = aVar.f2751a;
        if (post_type != null) {
            switch (post_type.hashCode()) {
                case -1864532585:
                    if (post_type.equals("Quotes")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Quotes");
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(view.getContext(), R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(view.getContext(), R.drawable.ic_learning_hub_quotes_todays_bg));
                        break;
                    }
                    break;
                case -1732810888:
                    if (post_type.equals("Videos")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(0);
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(view.getContext(), R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(view.getContext(), R.drawable.ic_video));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Video");
                        break;
                    }
                    break;
                case -1692490108:
                    if (post_type.equals("Creatives")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Creative");
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(view.getContext(), R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(view.getContext(), R.drawable.ic_learning_hub_creative_todays_bg));
                        break;
                    }
                    break;
                case -1164233123:
                    if (post_type.equals("Articles")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageResource(0);
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(view.getContext(), R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Article");
                        break;
                    }
                    break;
                case -312086034:
                    if (post_type.equals("Therapist says")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Therapist Says");
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageResource(0);
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(view.getContext(), R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(view.getContext(), R.drawable.ic_learning_hub_therapist_says_todays_bg));
                        break;
                    }
                    break;
                case 2606936:
                    if (post_type.equals("Tips")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Tips");
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(view.getContext(), R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(view.getContext(), R.drawable.ic_learning_hub_tips_todays_bg));
                        break;
                    }
                    break;
            }
        }
        String duration = learningHubModel2.getDuration();
        if (duration != null && duration.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ((RobertoTextView) view.findViewById(R.id.tvDuration)).setText(learningHubModel2.getDuration());
            ((RobertoTextView) view.findViewById(R.id.tvDuration)).setVisibility(0);
            ((RobertoTextView) view.findViewById(R.id.robertoTextView8)).setVisibility(0);
        } else {
            ((RobertoTextView) view.findViewById(R.id.tvDuration)).setVisibility(8);
            ((RobertoTextView) view.findViewById(R.id.robertoTextView8)).setVisibility(8);
        }
        i.f(view, "holder.itemView");
        u uVar = new u();
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
        Iterator<PostsRead> it = postsRead.iterator();
        while (true) {
            if (it.hasNext()) {
                if (i.b(it.next().getPostId(), learningHubModel2.getId())) {
                    uVar.f23466u = true;
                }
            }
        }
        if (learningHubModel2.getDay() == ((int) courseById.getCourseOpenDay()) && !uVar.f23466u) {
            ((RobertoTextView) view.findViewById(R.id.tvNew)).setVisibility(0);
        } else {
            ((RobertoTextView) view.findViewById(R.id.tvNew)).setVisibility(8);
        }
        ArrayList<LearningHubFieldModel> fields = learningHubModel2.getFields();
        Iterator<LearningHubFieldModel> it2 = fields.iterator();
        while (it2.hasNext()) {
            LearningHubFieldModel next = it2.next();
            String str3 = null;
            if (is.k.Q1(next.getData_title(), new String[]{"cover", "thumbnail"})) {
                Object value = next.getValue();
                if (value instanceof String) {
                    str2 = (String) value;
                } else {
                    str2 = null;
                }
                if (str2 != null && (!n.B0(str2))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    com.bumptech.glide.e<Bitmap> a10 = Glide.g(view.getContext()).a();
                    a10.Z = next.getValue();
                    a10.f5953b0 = true;
                    a10.B((AppCompatImageView) view.findViewById(i10));
                }
            }
            String str4 = "";
            if (i.b(next.getData_title(), "title")) {
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvTitleCard);
                Object value2 = next.getValue();
                if (value2 instanceof String) {
                    str = (String) value2;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                robertoTextView.setText(str);
            }
            if (i.b(next.getData_title(), "short_desc")) {
                RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvTitleCard);
                Object value3 = next.getValue();
                if (value3 instanceof String) {
                    str3 = (String) value3;
                }
                if (str3 != null) {
                    str4 = str3;
                }
                robertoTextView2.setText(str4);
            }
            i10 = R.id.ivTitleCard;
        }
        view.setOnClickListener(new wm.a(this, learningHubModel2, fields, uVar, postsRead, view));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_learning_hub_experiment_today, recyclerView, false);
        i.f(itemView, "itemView");
        return new a(itemView);
    }
}
