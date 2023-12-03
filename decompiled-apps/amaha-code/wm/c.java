package wm;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.i;
import ss.p;
import tk.q;
import xm.b;
/* compiled from: LearningHubExperimentSearchAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<LearningHubModel> f36756x;

    /* renamed from: y  reason: collision with root package name */
    public final p<LearningHubModel, Boolean, k> f36757y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f36758z;

    /* compiled from: LearningHubExperimentSearchAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f36759u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f36760v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvLearningHubExperimentSearchTitle);
            i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            this.f36759u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvLearningHubExperimentSearchType);
            i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            this.f36760v = (RobertoTextView) findViewById2;
        }
    }

    public c(ArrayList arrayList, b.C0636b c0636b) {
        this.f36756x = arrayList;
        this.f36757y = c0636b;
        this.f36758z = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f36758z.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Object obj;
        Object obj2;
        boolean z10;
        a aVar2 = aVar;
        LearningHubModel learningHubModel = (LearningHubModel) u.j2(i6, this.f36758z);
        String str = "";
        String str2 = null;
        RobertoTextView robertoTextView = aVar2.f36760v;
        View view = aVar2.f2751a;
        RobertoTextView robertoTextView2 = aVar2.f36759u;
        if (learningHubModel != null) {
            Iterator<T> it = learningHubModel.getFields().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj;
                    if (!i.b(learningHubFieldModel.getData_title(), "title") && !i.b(learningHubFieldModel.getData_title(), "short_desc")) {
                        z10 = false;
                        continue;
                    } else {
                        z10 = true;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj;
            if (learningHubFieldModel2 != null) {
                obj2 = learningHubFieldModel2.getValue();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = obj2;
            }
            if (str2 != null) {
                str = str2;
            }
            robertoTextView2.setText(str);
            robertoTextView2.setTextColor(g0.a.b(view.getContext(), R.color.title_high_contrast));
            robertoTextView.setText(learningHubModel.getPost_type());
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
            Iterator<PostsRead> it2 = postsRead.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (i.b(it2.next().getPostId(), learningHubModel.getId())) {
                    uVar.f23466u = true;
                    break;
                }
            }
            view.setOnClickListener(new q(uVar, learningHubModel, postsRead, this, 7));
            return;
        }
        robertoTextView2.setText("No results found");
        robertoTextView2.setTextColor(g0.a.b(view.getContext(), R.color.title_high_contrast_54_opacity));
        robertoTextView.setText("");
        view.setOnClickListener(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_learning_hub_experiment_search, parent, false, "from(parent.context).inf…nt_search, parent, false)"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public final void v(String str) {
        boolean z10;
        String str2;
        Object obj;
        Object obj2;
        boolean z11;
        boolean B0 = n.B0(str);
        ArrayList<LearningHubModel> arrayList = this.f36756x;
        if (!B0) {
            ArrayList<LearningHubModel> arrayList2 = new ArrayList<>();
            for (?? r22 : arrayList) {
                Iterator<T> it = ((LearningHubModel) r22).getFields().iterator();
                while (true) {
                    z10 = false;
                    str2 = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj;
                        if (!i.b(learningHubFieldModel.getData_title(), "title") && !i.b(learningHubFieldModel.getData_title(), "short_desc")) {
                            z11 = false;
                            continue;
                        } else {
                            z11 = true;
                            continue;
                        }
                        if (z11) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj;
                if (learningHubFieldModel2 != null) {
                    obj2 = learningHubFieldModel2.getValue();
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str2 = obj2;
                }
                if (str2 != null) {
                    Locale locale = Locale.ENGLISH;
                    String e10 = ri.e.e(locale, "ENGLISH", str2, locale, "this as java.lang.String).toLowerCase(locale)");
                    String lowerCase = str.toLowerCase(locale);
                    i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (r.J0(e10, lowerCase)) {
                        z10 = true;
                    }
                }
                if (z10) {
                    arrayList2.add(r22);
                }
            }
            arrayList = arrayList2;
        }
        this.f36758z = arrayList;
        i();
    }
}
