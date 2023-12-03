package up;

import ak.d;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.f;
import hs.k;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.l;
import wp.a;
/* compiled from: DomainAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0578a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<f<String, String>> f34434x;

    /* renamed from: y  reason: collision with root package name */
    public final l<String, k> f34435y;

    /* compiled from: DomainAdapter.kt */
    /* renamed from: up.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0578a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f34436u;

        /* renamed from: v  reason: collision with root package name */
        public final AppCompatImageView f34437v;

        public C0578a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.domainTitle);
            i.f(findViewById, "itemView.findViewById(R.id.domainTitle)");
            this.f34436u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.domainImg);
            i.f(findViewById2, "itemView.findViewById(R.id.domainImg)");
            this.f34437v = (AppCompatImageView) findViewById2;
        }
    }

    public a(ArrayList courseList, a.b bVar) {
        i.g(courseList, "courseList");
        this.f34434x = courseList;
        this.f34435y = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f34434x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0578a c0578a, int i6) {
        C0578a c0578a2 = c0578a;
        ArrayList<f<String, String>> arrayList = this.f34434x;
        c0578a2.f34436u.setText(arrayList.get(i6).f19465v);
        Integer[] miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(arrayList.get(i6).f19464u);
        i.d(miniCourseImage);
        int intValue = miniCourseImage[0].intValue();
        AppCompatImageView appCompatImageView = c0578a2.f34437v;
        appCompatImageView.setImageResource(intValue);
        appCompatImageView.setBackgroundResource(miniCourseImage[1].intValue());
        c0578a2.f2751a.setOnClickListener(new d(i6, 18, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_logs_domain_item, recyclerView, false);
        i.f(itemView, "itemView");
        return new C0578a(itemView);
    }
}
