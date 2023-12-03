package wm;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.n;
import hs.f;
import is.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import pl.w0;
/* compiled from: LearningHubExperimentAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {
    public ArrayList<LearningHubModel> A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<LearningHubModel> f36753x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f36754y;

    /* renamed from: z  reason: collision with root package name */
    public f<String, String> f36755z;

    /* compiled from: LearningHubExperimentAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public b(Context context, ArrayList arrayList) {
        i.g(context, "context");
        this.f36753x = new ArrayList<>();
        this.f36755z = new f<>("All", "All");
        this.A = arrayList;
        this.f36753x = arrayList;
        this.f36754y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.A.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        LearningHubModel learningHubModel = this.A.get(i6);
        i.f(learningHubModel, "filteredList[position]");
        LearningHubModel learningHubModel2 = learningHubModel;
        String post_type = learningHubModel2.getPost_type();
        int i10 = R.id.ivTitleCard;
        Context context = this.f36754y;
        View view = aVar.f2751a;
        if (post_type != null) {
            switch (post_type.hashCode()) {
                case -1864532585:
                    if (post_type.equals("Quotes")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Quotes");
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(context, R.drawable.ic_learning_hub_quotes_bg));
                        break;
                    }
                    break;
                case -1732810888:
                    if (post_type.equals("Videos")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(0);
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageResource(0);
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(context, R.drawable.ic_video));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Video");
                        break;
                    }
                    break;
                case -1692490108:
                    if (post_type.equals("Creatives")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Creative");
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(context, R.drawable.ic_learning_hub_creative_bg));
                        break;
                    }
                    break;
                case -1164233123:
                    if (post_type.equals("Articles")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageResource(0);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Article");
                        break;
                    }
                    break;
                case -312086034:
                    if (post_type.equals("Therapist says")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Therapist Says");
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(context, R.drawable.ic_learning_hub_therapist_says_bg));
                        break;
                    }
                    break;
                case 2606936:
                    if (post_type.equals("Tips")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((AppCompatImageView) view.findViewById(R.id.ivVideoPlayback)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Tips");
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(context, R.drawable.ic_learning_hub_tips_bg));
                        break;
                    }
                    break;
            }
        }
        String duration = learningHubModel2.getDuration();
        boolean z12 = true;
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
        FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
        Iterator<PostsRead> it = postsRead.iterator();
        while (true) {
            if (it.hasNext()) {
                if (i.b(it.next().getPostId(), learningHubModel2.getId())) {
                    uVar.f23466u = true;
                }
            }
        }
        if (!uVar.f23466u) {
            View findViewById = view.findViewById(R.id.titleCardNewBg);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById2 = view.findViewById(R.id.titleCardNewBg);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        ArrayList<LearningHubFieldModel> fields = learningHubModel2.getFields();
        Iterator<LearningHubFieldModel> it2 = fields.iterator();
        while (it2.hasNext()) {
            LearningHubFieldModel next = it2.next();
            String str3 = null;
            if (k.Q1(next.getData_title(), new String[]{"cover", "thumbnail"})) {
                Object value = next.getValue();
                if (value instanceof String) {
                    str2 = (String) value;
                } else {
                    str2 = null;
                }
                if (str2 != null && (n.B0(str2) ^ z12) == z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    com.bumptech.glide.e<Bitmap> a10 = Glide.g(context).a();
                    a10.Z = next.getValue();
                    a10.f5953b0 = z12;
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
            z12 = true;
            i10 = R.id.ivTitleCard;
        }
        view.setOnClickListener(new w0(this, 13, learningHubModel2));
        ((ConstraintLayout) view.findViewById(R.id.learningHubItemContainer)).setOnClickListener(new wm.a(learningHubModel2, fields, uVar, postsRead, view, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_learning_hub_experiment, recyclerView, false);
        i.f(itemView, "itemView");
        return new a(itemView);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    public final void v() {
        LearningHubExperimentActivity learningHubExperimentActivity;
        boolean z10;
        HashSet hashSet = new HashSet();
        ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
        i.f(postsRead, "getInstance().user.postsRead");
        ArrayList arrayList = new ArrayList();
        for (PostsRead postsRead2 : postsRead) {
            String postId = postsRead2.getPostId();
            if (postId != null) {
                arrayList.add(postId);
            }
        }
        hashSet.addAll(arrayList);
        boolean b10 = i.b(this.f36755z.f19465v, "All");
        ArrayList<LearningHubModel> arrayList2 = this.f36753x;
        if (!b10) {
            ArrayList<LearningHubModel> arrayList3 = new ArrayList<>();
            for (?? r52 : arrayList2) {
                LearningHubModel learningHubModel = (LearningHubModel) r52;
                if (i.b(this.f36755z.f19465v, "Read")) {
                    z10 = is.u.Z1(hashSet, learningHubModel.getId());
                } else if (!is.u.Z1(hashSet, learningHubModel.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList3.add(r52);
                }
            }
            arrayList2 = arrayList3;
        }
        String str = this.f36755z.f19464u;
        if ((!n.B0(str)) && !i.b(str, "All")) {
            ArrayList<LearningHubModel> arrayList4 = new ArrayList<>();
            for (LearningHubModel learningHubModel2 : arrayList2) {
                if (i.b(learningHubModel2.getPost_type(), str)) {
                    arrayList4.add(learningHubModel2);
                }
            }
            arrayList2 = arrayList4;
        }
        this.A = new ArrayList<>(arrayList2);
        i();
        Context context = this.f36754y;
        if (context instanceof LearningHubExperimentActivity) {
            learningHubExperimentActivity = (LearningHubExperimentActivity) context;
        } else {
            learningHubExperimentActivity = null;
        }
        if (learningHubExperimentActivity != null) {
            learningHubExperimentActivity.s0(this.A.isEmpty());
        }
    }

    public final void w(String str) {
        this.f36755z = new f<>(this.f36755z.f19464u, str);
        v();
    }
}
