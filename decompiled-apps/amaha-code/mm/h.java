package mm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.t;
import g0.a;
import hs.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ol.n;
import ss.l;
/* compiled from: JournalThoughtAcknowledgeListAdapter.kt */
/* loaded from: classes2.dex */
public final class h extends RecyclerView.e<a> {
    public final l<? super String, k> A;
    public final String B;
    public final HashSet<Integer> C;

    /* renamed from: x  reason: collision with root package name */
    public final List<? extends hs.f<String, ? extends ArrayList<String>>> f25633x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<hs.f<String, ArrayList<String>>> f25634y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f25635z;

    /* compiled from: JournalThoughtAcknowledgeListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public h(ArrayList optionList, ArrayList selectedOptionList, p pVar, sm.k onItemExpand) {
        kotlin.jvm.internal.i.g(optionList, "optionList");
        kotlin.jvm.internal.i.g(selectedOptionList, "selectedOptionList");
        kotlin.jvm.internal.i.g(onItemExpand, "onItemExpand");
        this.f25633x = optionList;
        this.f25634y = selectedOptionList;
        this.f25635z = pVar;
        this.A = onItemExpand;
        this.B = LogHelper.INSTANCE.makeLogTag("JTAScreenListAdapter");
        this.C = new HashSet<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f25633x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Object obj;
        boolean z10;
        a aVar2 = aVar;
        View view = aVar2.f2751a;
        try {
            hs.f<String, ? extends ArrayList<String>> fVar = this.f25633x.get(i6);
            ((RobertoTextView) view.findViewById(R.id.tvJTAScreenRowQuestion)).setText(fVar.f19464u);
            Iterator<T> it = this.f25634y.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.i.b(((hs.f) obj).f19464u, fVar.f19464u)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (((hs.f) obj) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Context context = this.f25635z;
            if (z10) {
                ((AppCompatImageView) view.findViewById(R.id.ivJTAScreenRowCheckbox)).setBackgroundColor(g0.a.b(context, R.color.amahaLightGreen));
                ((AppCompatImageView) view.findViewById(R.id.ivJTAScreenRowCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_checkbox_amaha_green));
                ((AppCompatImageView) view.findViewById(R.id.ivJTAScreenRowCheckbox)).setImageTintList(null);
                ((AppCompatImageView) view.findViewById(R.id.ivJTAScreenRowArrow)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                ((MotionLayout) view.findViewById(R.id.mlJTAParentContainer)).m(0.0f);
            } else {
                ((AppCompatImageView) view.findViewById(R.id.ivJTAScreenRowCheckbox)).setBackgroundColor(g0.a.b(context, R.color.white));
                ((AppCompatImageView) view.findViewById(R.id.ivJTAScreenRowCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_check_box_outline_blank_blue_24dp));
                ((AppCompatImageView) view.findViewById(R.id.ivJTAScreenRowCheckbox)).setImageTintList(ColorStateList.valueOf(g0.a.b(context, R.color.amahaGreen)));
                ((AppCompatImageView) view.findViewById(R.id.ivJTAScreenRowArrow)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                ((MotionLayout) view.findViewById(R.id.mlJTAParentContainer)).A();
            }
            this.C.add(Integer.valueOf(i6));
            Iterator it2 = ((ArrayList) fVar.f19465v).iterator();
            while (it2.hasNext()) {
                String chip = (String) it2.next();
                kotlin.jvm.internal.i.f(chip, "chip");
                ChipGroup chipGroup = (ChipGroup) view.findViewById(R.id.cgJTAScreenRow);
                kotlin.jvm.internal.i.f(chipGroup, "holder.itemView.cgJTAScreenRow");
                v(chip, chipGroup, fVar, aVar2);
            }
            view.setOnClickListener(new t(26, aVar2, this, fVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_jta_screen_list_view, parent, false, "from(parent.context).inf…list_view, parent, false)"));
        aVar.s(false);
        return aVar;
    }

    public final void v(String str, ChipGroup chipGroup, hs.f fVar, a aVar) {
        boolean z10;
        try {
            ArrayList<hs.f<String, ArrayList<String>>> arrayList = this.f25634y;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((ArrayList) ((hs.f) it.next()).f19465v).contains(str)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            int i6 = bn.a.f4534a;
            Chip h10 = bn.a.h(this.f25635z, str, chipGroup, z10, null);
            if (h10 != null) {
                h10.setOnCheckedChangeListener(new n(this, fVar, aVar, 1));
            }
            chipGroup.addView(h10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
        }
    }
}
