package go;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProAssessmentDetailAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0254a> {

    /* renamed from: x  reason: collision with root package name */
    public final JSONArray f16664x;

    /* compiled from: ProAssessmentDetailAdapter.kt */
    /* renamed from: go.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0254a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f16665u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f16666v;

        public C0254a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.rowAssessmentDetailQuestion);
            i.f(findViewById, "view.findViewById(R.id.r…AssessmentDetailQuestion)");
            this.f16665u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.rowAssessmentDetailAnswer);
            i.f(findViewById2, "view.findViewById(R.id.rowAssessmentDetailAnswer)");
            this.f16666v = (RobertoTextView) findViewById2;
        }
    }

    public a(Activity activity, JSONArray jSONArray) {
        i.g(activity, "activity");
        this.f16664x = jSONArray;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f16664x.length();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0254a c0254a, int i6) {
        String str;
        String join;
        C0254a c0254a2 = c0254a;
        JSONObject jSONObject = this.f16664x.getJSONObject(i6);
        c0254a2.f16665u.setText(jSONObject.optString("question"));
        JSONArray optJSONArray = jSONObject.optJSONArray("options");
        if (optJSONArray != null && (join = optJSONArray.join(", ")) != null) {
            str = n.F0(join, "\"", "");
        } else {
            str = null;
        }
        c0254a2.f16666v.setText(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_assessment_detail, recyclerView, false);
        i.f(itemView, "itemView");
        return new C0254a(itemView);
    }
}
