package ol;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.j1;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import pl.g0;
/* compiled from: N30ScreenListAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends RecyclerView.e<a> {
    public final String A = LogHelper.INSTANCE.makeLogTag("N30ScreenListAdapter");

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<HashMap<String, Object>> f27625x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f27626y;

    /* renamed from: z  reason: collision with root package name */
    public final ss.p<String, String, hs.k> f27627z;

    /* compiled from: N30ScreenListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public g(androidx.fragment.app.p pVar, ArrayList arrayList, g0 g0Var) {
        this.f27625x = arrayList;
        this.f27626y = pVar;
        this.f27627z = g0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27625x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        View view = aVar.f2751a;
        try {
            HashMap hashMap = (HashMap) u.j2(i6, this.f27625x);
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvN30RowTitle);
            String str3 = null;
            if (hashMap != null) {
                obj = hashMap.get("title");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvN30RowDescription);
            if (hashMap != null) {
                obj2 = hashMap.get("description");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            robertoTextView2.setText(str2);
            com.bumptech.glide.e<Bitmap> a10 = Glide.g(this.f27626y).a();
            if (hashMap != null) {
                obj3 = hashMap.get("image");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            }
            a10.Z = str3;
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) view.findViewById(R.id.ivN30Row));
            ((RobertoButton) view.findViewById(R.id.rbN30RowStartCta)).setOnClickListener(new j1(this, 25, hashMap));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_n30_list_view, parent, false, "from(parent.context)\n   …list_view, parent, false)"));
        aVar.s(false);
        return aVar;
    }
}
