package dk;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AllMiniCoursesActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12910u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ AllMiniCoursesActivity f12911v;

    public /* synthetic */ d(AllMiniCoursesActivity allMiniCoursesActivity, int i6) {
        this.f12910u = i6;
        this.f12911v = allMiniCoursesActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f12910u;
        AllMiniCoursesActivity this$0 = this.f12911v;
        switch (i6) {
            case 0:
                int i10 = AllMiniCoursesActivity.G;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(tr.r.s(this$0, false).putExtra("source", "gpa_all_mini_courses"), this$0.f10307y);
                Bundle bundle = new Bundle();
                bundle.putString("user_version", FirebasePersistence.getInstance().getUser().getVersion());
                gk.a.b(bundle, "gpa_click_minicourse_list");
                return;
            case 1:
                int i11 = AllMiniCoursesActivity.G;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(tr.r.s(this$0, false).putExtra("source", "all_mini_courses"), this$0.f10307y);
                return;
            case 2:
                int i12 = AllMiniCoursesActivity.G;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.finish();
                return;
            default:
                int i13 = AllMiniCoursesActivity.G;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                boolean z10 = this$0.E;
                ArrayList<View> arrayList = this$0.D;
                if (z10) {
                    Iterator<View> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().setVisibility(0);
                    }
                    ((RobertoTextView) this$0.u0(R.id.seeAllText)).setText("VIEW LESS");
                    this$0.E = false;
                } else {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        arrayList.get(size).setVisibility(8);
                    }
                    ((RobertoTextView) this$0.u0(R.id.seeAllText)).setText("VIEW ALL");
                    this$0.E = true;
                }
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "all_mini_courses_view_all_click");
                return;
        }
    }
}
