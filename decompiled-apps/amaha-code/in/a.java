package in;

import ak.d;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import java.io.File;
import java.util.ArrayList;
import jn.a;
import kn.a;
import kotlin.jvm.internal.i;
import ss.l;
/* compiled from: DomainAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0306a> {
    public final f A;
    public final boolean B;
    public final l<String, k> C;
    public final String D;

    /* renamed from: x  reason: collision with root package name */
    public final Context f20407x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<hs.f<String, String>> f20408y;

    /* renamed from: z  reason: collision with root package name */
    public final a.EnumC0358a f20409z;

    /* compiled from: DomainAdapter.kt */
    /* renamed from: in.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0306a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f20410u;

        /* renamed from: v  reason: collision with root package name */
        public final AppCompatImageView f20411v;

        /* renamed from: w  reason: collision with root package name */
        public final View f20412w;

        public C0306a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.domainTitle);
            i.f(findViewById, "itemView.findViewById(R.id.domainTitle)");
            this.f20410u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.domainImg);
            i.f(findViewById2, "itemView.findViewById(R.id.domainImg)");
            this.f20411v = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.domainImgCard);
            i.f(findViewById3, "itemView.findViewById(R.id.domainImgCard)");
            this.f20412w = findViewById3;
        }
    }

    public a(Context context, ArrayList courseList, a.EnumC0358a enumC0358a, f fVar, boolean z10, a.b bVar) {
        i.g(courseList, "courseList");
        this.f20407x = context;
        this.f20408y = courseList;
        this.f20409z = enumC0358a;
        this.A = fVar;
        this.B = z10;
        this.C = bVar;
        this.D = LogHelper.INSTANCE.makeLogTag(a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f20408y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0306a c0306a, int i6) {
        int i10;
        Context context;
        C0306a c0306a2 = c0306a;
        ArrayList<hs.f<String, String>> arrayList = this.f20408y;
        try {
            c0306a2.f20410u.setText(arrayList.get(i6).f19465v);
            a.EnumC0358a enumC0358a = this.f20409z;
            a.EnumC0358a enumC0358a2 = a.EnumC0358a.MAIN_PLAN_LOGS;
            AppCompatImageView appCompatImageView = c0306a2.f20411v;
            if (enumC0358a == enumC0358a2) {
                ArrayList<LogModel> arrayList2 = kn.a.f23436a;
                appCompatImageView.setImageResource(kn.a.i(arrayList.get(i6).f19464u));
            } else {
                String mcDrawable = MiniCourseUtilsKt.getMcDrawable(arrayList.get(i6).f19464u);
                if (!i.b(mcDrawable, "") && (context = this.f20407x) != null) {
                    this.A.d(new File(context.getFilesDir(), mcDrawable)).B(appCompatImageView);
                }
                View view = c0306a2.f20412w;
                if (this.B) {
                    i10 = 8;
                } else {
                    appCompatImageView.setBackgroundColor(Color.parseColor(MiniCourseUtilsKt.getMcColor(arrayList.get(i6).f19464u)));
                    i10 = 0;
                }
                view.setVisibility(i10);
            }
            c0306a2.f2751a.setOnClickListener(new d(i6, 12, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.D, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = b.e(recyclerView, "parent", R.layout.row_logs_domain_item, recyclerView, false);
        i.f(itemView, "itemView");
        return new C0306a(itemView);
    }
}
