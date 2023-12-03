package el;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.CircleImageView;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: CommunityDashboardPostsAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {
    public final String A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<vk.c> f14371x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f14372y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14373z;

    /* compiled from: CommunityDashboardPostsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public b(Context context, ArrayList<vk.c> communityPostList, boolean z10, boolean z11) {
        i.g(communityPostList, "communityPostList");
        this.f14371x = communityPostList;
        this.f14372y = z10;
        this.f14373z = z11;
        this.A = LogHelper.INSTANCE.makeLogTag("CommunityDashboardPostsAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14371x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        int i10;
        Spanned fromHtml;
        a aVar2 = aVar;
        ArrayList<vk.c> arrayList = this.f14371x;
        try {
            View view = aVar2.f2751a;
            view.setOnClickListener(new ak.d(i6, 3, this));
            f g5 = Glide.g(view.getContext());
            int i11 = i6 % 5;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                i10 = R.drawable.community_card_v3_image6;
                            } else {
                                i10 = R.drawable.community_card_v3_image5;
                            }
                        } else {
                            i10 = R.drawable.community_card_v3_image4;
                        }
                    } else {
                        i10 = R.drawable.community_card_v3_image3;
                    }
                } else {
                    i10 = R.drawable.community_card_v3_image2;
                }
            } else {
                i10 = R.drawable.community_card_v3_image1;
            }
            g5.o(Integer.valueOf(i10)).B((AppCompatImageView) view.findViewById(R.id.ivCommunityCardV3VerifyBackground));
            Glide.g(view.getContext()).p(arrayList.get(i6).b()).B((CircleImageView) view.findViewById(R.id.ivCommunityCardV3Profile));
            ((RobertoTextView) view.findViewById(R.id.tvCommunityCardV3Name)).setText(arrayList.get(i6).c());
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml(arrayList.get(i6).a(), 0);
                ((RobertoTextView) view.findViewById(R.id.tvCommunityCardV3Description)).setText(fromHtml);
            } else {
                ((RobertoTextView) view.findViewById(R.id.tvCommunityCardV3Description)).setText(Html.fromHtml(arrayList.get(i6).a()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(e.h(parent, R.layout.layout_community_card_v3_items, parent, false, "from(parent.context).inf…_v3_items, parent, false)"));
    }
}
