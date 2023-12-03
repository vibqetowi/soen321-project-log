package dp;

import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.resources.model.ResourceData;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ep.e;
import ho.o;
import hs.k;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.p;
/* compiled from: ResourcesViewAllAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final p<ResourceData, Boolean, k> f13191x;

    /* renamed from: y  reason: collision with root package name */
    public final String f13192y = LogHelper.INSTANCE.makeLogTag(b.class);

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<ResourceData> f13193z;

    /* compiled from: ResourcesViewAllAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public b(androidx.fragment.app.p pVar, ArrayList arrayList, e eVar) {
        this.f13191x = eVar;
        this.f13193z = new ArrayList<>();
        this.f13193z = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f13193z.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        try {
            ResourceData resourceData = this.f13193z.get(i6);
            i.f(resourceData, "list[position]");
            ResourceData resourceData2 = resourceData;
            String readingTime = resourceData2.getReadingTime();
            if (readingTime != null && readingTime.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            View view = aVar2.f2751a;
            if (z10) {
                ((RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleDescription)).setText(view.getContext().getString(R.string.article));
            } else {
                ((RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleDescription)).setText(view.getContext().getString(R.string.dbRaExperimentSubHeader, view.getContext().getString(R.string.article), resourceData2.getReadingTime()));
            }
            com.bumptech.glide.e<Bitmap> a10 = Glide.g(view.getContext()).a();
            a10.Z = "https://" + resourceData2.getThumb();
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesArticle));
            ((RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleHeader)).setText(resourceData2.getTitle());
            view.setOnClickListener(new o(resourceData2, 9, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f13192y, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(e.h(parent, R.layout.row_library_resources_article, parent, false, "from(parent.context).inf…s_article, parent, false)"));
    }
}
