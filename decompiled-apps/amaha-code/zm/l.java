package zm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import ik.l1;
import java.util.ArrayList;
/* compiled from: LibraryResourcesFilterAdapter.kt */
/* loaded from: classes2.dex */
public final class l extends RecyclerView.e<a> {
    public final Context A;

    /* renamed from: x  reason: collision with root package name */
    public final String f39667x = LogHelper.INSTANCE.makeLogTag(l.class);

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<String> f39668y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f39669z;

    /* compiled from: LibraryResourcesFilterAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public l(p pVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f39668y = new ArrayList<>();
        this.f39669z = new ArrayList<>();
        this.f39669z = arrayList;
        this.A = pVar;
        this.f39668y = arrayList2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f39669z.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ArrayList<String> arrayList = this.f39669z;
        try {
            String str = arrayList.get(i6);
            int hashCode = str.hashCode();
            Context context = this.A;
            View view = aVar2.f2751a;
            switch (hashCode) {
                case -1864532585:
                    if (!str.equals("Quotes")) {
                        break;
                    } else {
                        Object obj = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowFilter)).setImageDrawable(a.c.b(context, R.drawable.ic_filter_quotes));
                        ((RobertoTextView) view.findViewById(R.id.tvRowFilter)).setText(context.getString(R.string.quotes));
                        break;
                    }
                case -1732810888:
                    if (!str.equals("Videos")) {
                        break;
                    } else {
                        Object obj2 = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowFilter)).setImageDrawable(a.c.b(context, R.drawable.ic_filter_video));
                        ((RobertoTextView) view.findViewById(R.id.tvRowFilter)).setText(context.getString(R.string.videos));
                        break;
                    }
                case -1692490108:
                    if (!str.equals("Creatives")) {
                        break;
                    } else {
                        Object obj3 = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowFilter)).setImageDrawable(a.c.b(context, R.drawable.ic_filter_creatives));
                        ((RobertoTextView) view.findViewById(R.id.tvRowFilter)).setText(context.getString(R.string.creatives));
                        break;
                    }
                case -1164233123:
                    if (!str.equals("Articles")) {
                        break;
                    } else {
                        Object obj4 = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowFilter)).setImageDrawable(a.c.b(context, R.drawable.ic_filter_article));
                        ((RobertoTextView) view.findViewById(R.id.tvRowFilter)).setText(context.getString(R.string.articles));
                        break;
                    }
                case -312086034:
                    if (!str.equals("Therapist says")) {
                        break;
                    } else {
                        Object obj5 = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowFilter)).setImageDrawable(a.c.b(context, R.drawable.ic_filter_therapist_says));
                        ((RobertoTextView) view.findViewById(R.id.tvRowFilter)).setText(context.getString(R.string.therapistSays));
                        break;
                    }
                case 2606936:
                    if (!str.equals("Tips")) {
                        break;
                    } else {
                        Object obj6 = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowFilter)).setImageDrawable(a.c.b(context, R.drawable.ic_filter_tips));
                        ((RobertoTextView) view.findViewById(R.id.tvRowFilter)).setText(context.getString(R.string.tips));
                        break;
                    }
            }
            if (this.f39668y.contains(arrayList.get(i6))) {
                Object obj7 = g0.a.f16164a;
                ((AppCompatImageView) view.findViewById(R.id.ivRowFilterCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_check_box_sea_curved));
                ((AppCompatImageView) view.findViewById(R.id.ivRowFilterCheckbox)).setImageTintList(null);
            } else {
                Object obj8 = g0.a.f16164a;
                ((AppCompatImageView) view.findViewById(R.id.ivRowFilterCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_check_box_outline_blank_blue_24dp));
                ((AppCompatImageView) view.findViewById(R.id.ivRowFilterCheckbox)).setImageTintList(ColorStateList.valueOf(g0.a.b(context, R.color.title_high_contrast)));
            }
            view.setOnClickListener(new l1(this, i6, aVar2, 19));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39667x, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_library_resources_filter, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
