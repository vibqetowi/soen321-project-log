package dp;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.resources.model.ResourceData;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ep.c;
import ho.o;
import hs.k;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.p;
/* compiled from: ResourcesAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0190a> {

    /* renamed from: x  reason: collision with root package name */
    public final p<ResourceData, Boolean, k> f13188x;

    /* renamed from: y  reason: collision with root package name */
    public final String f13189y = LogHelper.INSTANCE.makeLogTag(a.class);

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<ResourceData> f13190z;

    /* compiled from: ResourcesAdapter.kt */
    /* renamed from: dp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0190a extends RecyclerView.c0 {
        public C0190a(View view) {
            super(view);
        }
    }

    public a(androidx.fragment.app.p pVar, ArrayList arrayList, c cVar) {
        this.f13188x = cVar;
        this.f13190z = new ArrayList<>();
        this.f13190z = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f13190z.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0004, B:5:0x001b, B:12:0x002d, B:14:0x0066, B:18:0x0078, B:13:0x003f), top: B:23:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0004, B:5:0x001b, B:12:0x002d, B:14:0x0066, B:18:0x0078, B:13:0x003f), top: B:23:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(C0190a c0190a, int i6) {
        boolean z10;
        String title;
        C0190a c0190a2 = c0190a;
        try {
            ResourceData resourceData = this.f13190z.get(i6);
            i.f(resourceData, "list[position]");
            ResourceData resourceData2 = resourceData;
            View view = c0190a2.f2751a;
            String readingTime = resourceData2.getReadingTime();
            if (readingTime != null && readingTime.length() != 0) {
                z10 = false;
                if (!z10) {
                    ((RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleDescription)).setText(view.getContext().getString(R.string.article));
                } else {
                    ((RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleDescription)).setText(view.getContext().getString(R.string.dbRaExperimentSubHeader, view.getContext().getString(R.string.article), resourceData2.getReadingTime()));
                }
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleHeader);
                title = resourceData2.getTitle();
                if (title != null) {
                    title = "";
                }
                robertoTextView.setText(title);
                f g5 = Glide.g(view.getContext());
                g5.p("https://" + resourceData2.getThumb()).B((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesArticle));
                view.setOnClickListener(new o(resourceData2, 8, this));
            }
            z10 = true;
            if (!z10) {
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvRowResourcesArticleHeader);
            title = resourceData2.getTitle();
            if (title != null) {
            }
            robertoTextView2.setText(title);
            f g52 = Glide.g(view.getContext());
            g52.p("https://" + resourceData2.getThumb()).B((AppCompatImageView) view.findViewById(R.id.ivLibraryResourcesArticle));
            view.setOnClickListener(new o(resourceData2, 8, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f13189y, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new C0190a(e.h(parent, R.layout.row_library_dashboard_resources_article, parent, false, "from(parent.context)\n   …s_article, parent, false)"));
    }
}
