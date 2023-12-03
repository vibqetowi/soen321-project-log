package am;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements androidx.activity.result.b, d.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f615u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f616v;

    public /* synthetic */ b(FirestoreGoalsActivity firestoreGoalsActivity, int i6) {
        this.f615u = i6;
        this.f616v = firestoreGoalsActivity;
    }

    @Override // androidx.activity.result.b
    public final void b(Object obj) {
        fm.a aVar;
        int i6 = this.f615u;
        FirestoreGoalsActivity this$0 = this.f616v;
        switch (i6) {
            case 0:
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                int i10 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                fm.a aVar3 = this$0.f11151x;
                if (aVar3 != null) {
                    aVar3.p();
                    return;
                }
                return;
            default:
                int i11 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (((androidx.activity.result.a) obj).f976u == -1 && (aVar = this$0.f11151x) != null) {
                    aVar.p();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.material.tabs.d.b
    public final void c(TabLayout.g gVar, int i6) {
        int i10 = FirestoreGoalsActivity.E;
        FirestoreGoalsActivity this$0 = this.f616v;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (i6 == 0) {
            View inflate = this$0.getLayoutInflater().inflate(R.layout.row_textview, (ViewGroup) null);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            RobertoTextView robertoTextView = (RobertoTextView) inflate;
            robertoTextView.setText(this$0.getString(R.string.customGoalRegularHeader));
            robertoTextView.setFont("Lato-Bold.ttf");
            robertoTextView.setTextSize(2, 14.0f);
            robertoTextView.setTextColor(g0.a.b(this$0, R.color.orange));
            gVar.b(robertoTextView);
            return;
        }
        View inflate2 = this$0.getLayoutInflater().inflate(R.layout.row_textview, (ViewGroup) null);
        kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView2 = (RobertoTextView) inflate2;
        robertoTextView2.setText(this$0.getString(R.string.customGoalCustomHeader));
        robertoTextView2.setFont("Lato-Bold.ttf");
        robertoTextView2.setTextSize(2, 14.0f);
        robertoTextView2.setTextColor(g0.a.b(this$0, R.color.learning_hub_grey_3));
        gVar.b(robertoTextView2);
    }
}
