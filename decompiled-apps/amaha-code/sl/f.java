package sl;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.l;
import tl.q;
/* compiled from: ExpertResourceAdapter.kt */
/* loaded from: classes2.dex */
public final class f extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<vl.b> f31665x;

    /* renamed from: y  reason: collision with root package name */
    public final l<vl.b, k> f31666y;

    /* renamed from: z  reason: collision with root package name */
    public final String f31667z;

    /* compiled from: ExpertResourceAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public f(Context context, ArrayList resourceList, q.h hVar) {
        i.g(resourceList, "resourceList");
        this.f31665x = resourceList;
        this.f31666y = hVar;
        this.f31667z = LogHelper.INSTANCE.makeLogTag("ExpertResourceAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f31665x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        try {
            View view = aVar.f2751a;
            ((RobertoTextView) view.findViewById(R.id.tvExpertResourceType)).setText("Article");
            ((RobertoTextView) view.findViewById(R.id.tvExpertResourceContent)).setText(this.f31665x.get(i6).f());
            com.bumptech.glide.f g5 = Glide.g(view.getContext());
            g5.p("https://" + this.f31665x.get(i6).e()).B((AppCompatImageView) view.findViewById(R.id.ivExpertResourcesCreatives));
            view.setOnClickListener(new ak.d(i6, 7, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31667z, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.layout_expert_resources_item, parent, false, "from(parent.context).inf…rces_item, parent, false)"));
    }
}
