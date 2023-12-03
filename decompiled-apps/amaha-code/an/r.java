package an;

import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f765u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f766v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f767w;

    public /* synthetic */ r(int i6, t tVar, kotlin.jvm.internal.x xVar) {
        this.f765u = i6;
        this.f766v = tVar;
        this.f767w = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Chip chip;
        int i6 = this.f765u;
        kotlin.jvm.internal.x filterStr = this.f767w;
        t this$0 = this.f766v;
        switch (i6) {
            case 0:
                int i10 = t.f770g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(filterStr, "$filterStr");
                try {
                    ChipGroup chipGroup = (ChipGroup) this$0._$_findCachedViewById(R.id.cgShortCoursesFilters);
                    Chip chip2 = null;
                    if (chipGroup != null) {
                        chip = (Chip) chipGroup.findViewWithTag(filterStr.f23469u);
                    } else {
                        chip = null;
                    }
                    if (chip instanceof Chip) {
                        chip2 = chip;
                    }
                    if (chip2 != null) {
                        ChipGroup chipGroup2 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgShortCoursesFilters);
                        if (chipGroup2 != null) {
                            chipGroup2.b(chip2.getId());
                        }
                        ((HorizontalScrollView) this$0._$_findCachedViewById(R.id.hsvShortCoursesDBFilterContainer)).smoothScrollTo(chip2.getLeft() - (chip2.getPaddingLeft() + ((ChipGroup) this$0._$_findCachedViewById(R.id.cgShortCoursesFilters)).getPaddingLeft()), chip2.getTop());
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f775u, e10);
                    return;
                }
            default:
                int i11 = t.f770g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(filterStr, "$filterStr");
                ArrayList<LogModel> arrayList = kn.a.f23436a;
                View findViewWithTag = ((ChipGroup) this$0._$_findCachedViewById(R.id.cgResourcesFilters)).findViewWithTag(kn.a.j((String) filterStr.f23469u));
                kotlin.jvm.internal.i.f(findViewWithTag, "cgResourcesFilters.findV…eSpecificName(filterStr))");
                Chip chip3 = (Chip) findViewWithTag;
                ((ChipGroup) this$0._$_findCachedViewById(R.id.cgResourcesFilters)).b(chip3.getId());
                ((HorizontalScrollView) this$0._$_findCachedViewById(R.id.hsvResourcesDBFilterContainer)).smoothScrollTo(chip3.getLeft() - (((ChipGroup) this$0._$_findCachedViewById(R.id.cgResourcesFilters)).getPaddingLeft() + chip3.getPaddingLeft()), chip3.getTop());
                return;
        }
    }
}
