package ol;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import is.u;
import java.util.List;
/* compiled from: N9ScreenImageAdapter.kt */
/* loaded from: classes2.dex */
public final class r extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final List<String> f27681x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f27682y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27683z = LogHelper.INSTANCE.makeLogTag("N9ScreenImageAdapter");

    /* compiled from: N9ScreenImageAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public r(androidx.fragment.app.p pVar, List list) {
        this.f27681x = list;
        this.f27682y = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        List<String> list = this.f27681x;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        a aVar2 = aVar;
        try {
            List<String> list = this.f27681x;
            if (list != null && (str = (String) u.j2(i6, list)) != null) {
                Glide.g(this.f27682y).p(str).B((AppCompatImageView) aVar2.f2751a.findViewById(R.id.ivN9BScreen));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27683z, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_n9_screen_image_view, parent, false, "from(parent.context)\n   …mage_view, parent, false)"));
        aVar.s(false);
        return aVar;
    }
}
