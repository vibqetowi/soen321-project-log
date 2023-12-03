package el;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.i;
import ss.p;
import tk.x;
/* compiled from: CommunityDashboardGroupAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0220a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<vk.b> f14368x;

    /* renamed from: y  reason: collision with root package name */
    public final p<vk.b, Integer, k> f14369y;

    /* renamed from: z  reason: collision with root package name */
    public final String f14370z;

    /* compiled from: CommunityDashboardGroupAdapter.kt */
    /* renamed from: el.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0220a extends RecyclerView.c0 {
        public C0220a(View view) {
            super(view);
        }
    }

    public a(Context context, ArrayList communityGroups, x xVar) {
        i.g(communityGroups, "communityGroups");
        this.f14368x = communityGroups;
        this.f14369y = xVar;
        this.f14370z = LogHelper.INSTANCE.makeLogTag("CommunityDashboardGroupAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14368x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0220a c0220a, int i6) {
        boolean z10;
        C0220a c0220a2 = c0220a;
        ArrayList<vk.b> arrayList = this.f14368x;
        try {
            View view = c0220a2.f2751a;
            view.setOnClickListener(new ak.d(i6, 2, this));
            e<Bitmap> a10 = Glide.g(view.getContext()).a();
            a10.Z = arrayList.get(i6).a();
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) view.findViewById(R.id.ivDialogCardV4DomainImage));
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvDomainCardV4DomainName);
            String valueOf = String.valueOf(arrayList.get(i6).b());
            if (valueOf.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                String valueOf2 = String.valueOf(valueOf.charAt(0));
                i.e(valueOf2, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf2.toUpperCase(Locale.ROOT);
                i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                sb2.append((Object) upperCase);
                String substring = valueOf.substring(1);
                i.f(substring, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                valueOf = sb2.toString();
            }
            robertoTextView.setText(valueOf);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f14370z, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new C0220a(e.h(parent, R.layout.layout_community_card_v4_pick_group_items, parent, false, "from(parent.context).inf…oup_items, parent, false)"));
    }
}
