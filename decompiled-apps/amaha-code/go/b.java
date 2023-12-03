package go;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentListingActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fo.f;
import hs.k;
import ik.l1;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import ss.p;
/* compiled from: ProAssessmentListingAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final Activity f16667x;

    /* renamed from: y  reason: collision with root package name */
    public final JSONArray f16668y;

    /* renamed from: z  reason: collision with root package name */
    public final p<JSONObject, Boolean, k> f16669z;

    /* compiled from: ProAssessmentListingAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f16670u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f16671v;

        /* renamed from: w  reason: collision with root package name */
        public final View f16672w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvRowAssessmentListingHeading);
            i.f(findViewById, "view.findViewById(R.id.t…AssessmentListingHeading)");
            this.f16670u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowAssessmentListingStatus);
            i.f(findViewById2, "view.findViewById(R.id.t…wAssessmentListingStatus)");
            this.f16671v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.rowAssessmentDivider);
            i.f(findViewById3, "view.findViewById(R.id.rowAssessmentDivider)");
            this.f16672w = findViewById3;
        }
    }

    public b(ProAssessmentListingActivity proAssessmentListingActivity, JSONArray assessmentList, f fVar) {
        i.g(assessmentList, "assessmentList");
        this.f16667x = proAssessmentListingActivity;
        this.f16668y = assessmentList;
        this.f16669z = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f16668y.length();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        int i10;
        a aVar2 = aVar;
        JSONArray jSONArray = this.f16668y;
        JSONObject jSONObject = jSONArray.getJSONObject(i6);
        int length = jSONArray.length() - 1;
        View view = aVar2.f16672w;
        if (i6 == length) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
        aVar2.f16670u.setText(jSONObject.optString("assessment_name"));
        if (jSONObject.getBoolean("assessment_complete")) {
            i10 = R.string.proAssessmentCompleteStatus;
        } else {
            i10 = R.string.proAssessmentAssignedStatus;
        }
        aVar2.f16671v.setText(this.f16667x.getString(i10));
        aVar2.f2751a.setOnClickListener(new l1(jSONObject, this, i6, 22));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_assessment_listing, recyclerView, false);
        i.f(itemView, "itemView");
        return new a(itemView);
    }
}
