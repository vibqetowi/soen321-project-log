package ol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N6AScreenFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dl.l0;
import g0.a;
import ik.j1;
import java.util.ArrayList;
import java.util.List;
/* compiled from: N6AScreenListAdapter.kt */
/* loaded from: classes2.dex */
public final class p extends RecyclerView.e<a> {
    public final ss.p<N12AItemListModel, Boolean, hs.k> A;
    public final ss.l<N12AItemListModel, hs.k> B;
    public final String C;

    /* renamed from: x  reason: collision with root package name */
    public final List<N12AItemListModel> f27676x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<N12AItemListModel> f27677y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f27678z;

    /* compiled from: N6AScreenListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public p(ArrayList arrayList, ArrayList selectedOptionList, androidx.fragment.app.p pVar, N6AScreenFragment.a aVar, N6AScreenFragment.b bVar) {
        kotlin.jvm.internal.i.g(selectedOptionList, "selectedOptionList");
        this.f27676x = arrayList;
        this.f27677y = selectedOptionList;
        this.f27678z = pVar;
        this.A = aVar;
        this.B = bVar;
        this.C = LogHelper.INSTANCE.makeLogTag("N6AScreenListAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27676x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        String str2;
        String str3;
        Context context = this.f27678z;
        View view = aVar.f2751a;
        try {
            N12AItemListModel n12AItemListModel = this.f27676x.get(i6);
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvN6ARowTitle);
            if (n12AItemListModel != null) {
                str = n12AItemListModel.getHeader();
            } else {
                str = null;
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvN6ARowDescription);
            if (n12AItemListModel != null) {
                str2 = n12AItemListModel.getSubHeader();
            } else {
                str2 = null;
            }
            robertoTextView2.setText(str2);
            com.bumptech.glide.e<Bitmap> a10 = Glide.g(context).a();
            if (n12AItemListModel != null) {
                str3 = n12AItemListModel.getImageLink();
            } else {
                str3 = null;
            }
            a10.Z = str3;
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) view.findViewById(R.id.ivN6ARow));
            boolean contains = this.f27677y.contains(n12AItemListModel);
            if (contains) {
                view.findViewById(R.id.viewN6ARow).setBackgroundColor(g0.a.b(context, R.color.amahaLightGreen));
                ((AppCompatImageView) view.findViewById(R.id.ivN6ARowCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_checkbox_amaha_green));
                ((AppCompatImageView) view.findViewById(R.id.ivN6ARowCheckbox)).setImageTintList(null);
            } else {
                view.findViewById(R.id.viewN6ARow).setBackgroundColor(g0.a.b(context, R.color.white));
                ((AppCompatImageView) view.findViewById(R.id.ivN6ARowCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_check_box_outline_blank_blue_24dp));
                ((AppCompatImageView) view.findViewById(R.id.ivN6ARowCheckbox)).setImageTintList(ColorStateList.valueOf(g0.a.b(context, R.color.amahaGreen)));
            }
            view.setOnClickListener(new l0(3, n12AItemListModel, this, contains));
            ((CardView) view.findViewById(R.id.cvN6ARow)).setOnClickListener(new j1(n12AItemListModel, 27, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_n6a_screen_list_view, parent, false, "from(parent.context)\n   …list_view, parent, false)"));
        aVar.s(false);
        return aVar;
    }
}
