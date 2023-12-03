package ek;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: LearningHubAdapter.kt */
/* loaded from: classes2.dex */
public final class q extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<LearningHubModel> f14262x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14263y;

    /* compiled from: LearningHubAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public q(Context context, ArrayList arrayList) {
        kotlin.jvm.internal.i.g(context, "context");
        this.f14262x = new ArrayList<>();
        this.f14262x = arrayList;
        this.f14263y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14262x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        LearningHubModel learningHubModel = this.f14262x.get(i6);
        kotlin.jvm.internal.i.f(learningHubModel, "list[position]");
        LearningHubModel learningHubModel2 = learningHubModel;
        String post_type = learningHubModel2.getPost_type();
        Context context = this.f14263y;
        View view = aVar.f2751a;
        if (post_type != null) {
            switch (post_type.hashCode()) {
                case -1864532585:
                    if (post_type.equals("Quotes")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderQuotes));
                        ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(context, R.color.white));
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.solid_dark_blue));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(context, R.drawable.ic_quote_background));
                        break;
                    }
                    break;
                case -1692490108:
                    if (post_type.equals("Creatives")) {
                        view.findViewById(R.id.tint).setVisibility(0);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderCreatives));
                        ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(context, R.color.white));
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.grey_2));
                        break;
                    }
                    break;
                case -1164233123:
                    if (post_type.equals("Articles")) {
                        view.findViewById(R.id.tint).setVisibility(0);
                        ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(context, R.color.white));
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.grey_2));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderArticles));
                        break;
                    }
                    break;
                case -312086034:
                    if (post_type.equals("Therapist says")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderTherapistSays));
                        ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(context, R.color.white));
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.alt_orange_light));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(context, R.drawable.ic_therapist_says_background));
                        break;
                    }
                    break;
                case 2606936:
                    if (post_type.equals("Tips")) {
                        view.findViewById(R.id.tint).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText(view.getContext().getString(R.string.resourceHeaderTips));
                        ((RobertoTextView) view.findViewById(R.id.tvNew)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setTextColor(g0.a.b(context, R.color.white));
                        ((RobertoTextView) view.findViewById(R.id.tvTitleCard)).setTextColor(g0.a.b(context, R.color.white));
                        ((ConstraintLayout) view.findViewById(R.id.titleCardBG)).setBackgroundColor(g0.a.b(context, R.color.goalBlue));
                        ((AppCompatImageView) view.findViewById(R.id.ivTitleCard)).setImageDrawable(a.c.b(context, R.drawable.ic_tips_background));
                        break;
                    }
                    break;
            }
        }
        kotlin.jvm.internal.i.f(view, "holder.itemView");
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
        Iterator<PostsRead> it = postsRead.iterator();
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.i.b(it.next().getPostId(), learningHubModel2.getId())) {
                    uVar.f23466u = true;
                }
            }
        }
        if (learningHubModel2.getDay() == ((int) courseById.getCourseOpenDay()) && !uVar.f23466u) {
            ((RobertoTextView) view.findViewById(R.id.tvNew)).setVisibility(0);
        } else {
            ((RobertoTextView) view.findViewById(R.id.tvNew)).setVisibility(8);
        }
        Iterator<LearningHubFieldModel> it2 = learningHubModel2.getFields().iterator();
        while (it2.hasNext()) {
            LearningHubFieldModel next = it2.next();
            if (kotlin.jvm.internal.i.b(next.getData_title(), "cover")) {
                com.bumptech.glide.e<Bitmap> a10 = Glide.g(context).a();
                a10.Z = next.getValue();
                a10.f5953b0 = true;
                a10.B((AppCompatImageView) view.findViewById(R.id.ivTitleCard));
            }
            String str2 = "";
            String str3 = null;
            if (kotlin.jvm.internal.i.b(next.getData_title(), "title")) {
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvTitleCard);
                Object value = next.getValue();
                if (value instanceof String) {
                    str = (String) value;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                robertoTextView.setText(str);
            }
            if (kotlin.jvm.internal.i.b(next.getData_title(), "short_desc")) {
                RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvTitleCard);
                Object value2 = next.getValue();
                if (value2 instanceof String) {
                    str3 = (String) value2;
                }
                if (str3 != null) {
                    str2 = str3;
                }
                robertoTextView2.setText(str2);
            }
        }
        view.setOnClickListener(new defpackage.a(this, 11, learningHubModel2));
        ((ConstraintLayout) view.findViewById(R.id.container)).setOnClickListener(new p(uVar, learningHubModel2, postsRead, view, this, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_learning_hub, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
