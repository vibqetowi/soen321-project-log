package an;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import t0.j0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ChipGroup.d {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f696u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f697v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ rr.b f698w;

    public /* synthetic */ e(kotlin.jvm.internal.x xVar, rr.b bVar, int i6) {
        this.f696u = i6;
        this.f697v = xVar;
        this.f698w = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v23, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v45, types: [T, java.lang.Integer] */
    @Override // com.google.android.material.chip.ChipGroup.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ChipGroup chipGroup, ArrayList arrayList) {
        View view;
        Chip chip;
        KeyEvent.Callback callback;
        Object obj;
        Chip chip2;
        Integer num;
        Object obj2;
        Chip chip3;
        Integer num2;
        Object obj3;
        Chip chip4;
        Object obj4;
        Chip chip5;
        boolean z10;
        Chip chip6;
        Integer num3;
        int i6 = this.f696u;
        kotlin.jvm.internal.x lastSelectedId = this.f697v;
        rr.b bVar = this.f698w;
        Chip chip7 = null;
        switch (i6) {
            case 0:
                f this$0 = (f) bVar;
                int i10 = f.C;
                kotlin.jvm.internal.i.g(lastSelectedId, "$lastSelectedId");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(chipGroup, "chipGroup");
                try {
                    if (arrayList.isEmpty()) {
                        Integer num4 = (Integer) lastSelectedId.f23469u;
                        if (num4 != null) {
                            chipGroup.b(num4.intValue());
                            return;
                        }
                        return;
                    }
                    Iterator<View> it = f6.b.B0(chipGroup).iterator();
                    while (true) {
                        j0 j0Var = (j0) it;
                        if (j0Var.hasNext()) {
                            obj3 = j0Var.next();
                            View view2 = (View) obj3;
                            if (view2 instanceof Chip) {
                                chip6 = (Chip) view2;
                            } else {
                                chip6 = null;
                            }
                            if (chip6 != null) {
                                num3 = Integer.valueOf(chip6.getId());
                            } else {
                                num3 = null;
                            }
                            if (kotlin.jvm.internal.i.b(num3, lastSelectedId.f23469u)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    if (obj3 instanceof Chip) {
                        chip4 = (Chip) obj3;
                    } else {
                        chip4 = null;
                    }
                    if (chip4 != null) {
                        chip4.setChipBackgroundColorResource(R.color.white);
                        chip4.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                        chip4.setTextColor(g0.a.b(this$0.requireActivity(), R.color.title_high_contrast));
                    }
                    Iterator<View> it2 = f6.b.B0(chipGroup).iterator();
                    while (true) {
                        j0 j0Var2 = (j0) it2;
                        if (j0Var2.hasNext()) {
                            obj4 = j0Var2.next();
                            int id2 = ((View) obj4).getId();
                            Integer num5 = (Integer) is.u.g2(arrayList);
                            if (num5 != null && id2 == num5.intValue()) {
                                z10 = true;
                                continue;
                                if (z10) {
                                }
                            }
                            z10 = false;
                            if (z10) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    if (obj4 instanceof Chip) {
                        chip5 = (Chip) obj4;
                    } else {
                        chip5 = null;
                    }
                    if (chip5 != null) {
                        String str = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putString("resource_chip", chip5.getText().toString());
                        bundle.putString("source_of_action", "resource_list_view");
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "lib_resource_chip_click");
                        ArrayList<LogModel> arrayList2 = kn.a.f23436a;
                        this$0.f701v = kn.a.n(chip5.getText().toString());
                        lastSelectedId.f23469u = Integer.valueOf(chip5.getId());
                        chip5.setChipBackgroundColorResource(R.color.title_high_contrast);
                        chip5.setChipStrokeColorResource(R.color.title_high_contrast);
                        chip5.setTextColor(g0.a.b(this$0.requireActivity(), R.color.white));
                        if (this$0.f703x != null && Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                            cn.w wVar = this$0.f703x;
                            if (wVar != null) {
                                wVar.f(this$0.f701v, is.u.I2(this$0.J()));
                                ((RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryResources)).l0(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("libraryResourcesViewModel");
                            throw null;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f700u, e10);
                    return;
                }
            default:
                h this$02 = (h) bVar;
                int i11 = h.F;
                kotlin.jvm.internal.i.g(lastSelectedId, "$lastSelectedId");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(chipGroup, "<anonymous parameter 0>");
                try {
                    if (arrayList.isEmpty()) {
                        Integer num6 = (Integer) lastSelectedId.f23469u;
                        if (num6 != null) {
                            int intValue = num6.intValue();
                            ChipGroup chipGroup2 = (ChipGroup) this$02._$_findCachedViewById(R.id.cgShortCoursesFilters);
                            if (chipGroup2 != null) {
                                chipGroup2.b(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ChipGroup chipGroup3 = (ChipGroup) this$02._$_findCachedViewById(R.id.cgShortCoursesFilters);
                    if (chipGroup3 != null) {
                        Iterator<View> it3 = f6.b.B0(chipGroup3).iterator();
                        while (true) {
                            j0 j0Var3 = (j0) it3;
                            if (j0Var3.hasNext()) {
                                obj2 = j0Var3.next();
                                View view3 = (View) obj2;
                                if (view3 instanceof Chip) {
                                    chip3 = (Chip) view3;
                                } else {
                                    chip3 = null;
                                }
                                if (chip3 != null) {
                                    num2 = Integer.valueOf(chip3.getId());
                                } else {
                                    num2 = null;
                                }
                                if (kotlin.jvm.internal.i.b(num2, lastSelectedId.f23469u)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        view = (View) obj2;
                    } else {
                        view = null;
                    }
                    if (view instanceof Chip) {
                        chip = (Chip) view;
                    } else {
                        chip = null;
                    }
                    if (chip != null) {
                        chip.setChipBackgroundColorResource(R.color.white);
                        chip.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                        chip.setTextColor(g0.a.b(this$02.requireActivity(), R.color.title_high_contrast));
                    }
                    ChipGroup chipGroup4 = (ChipGroup) this$02._$_findCachedViewById(R.id.cgShortCoursesFilters);
                    if (chipGroup4 != null) {
                        Iterator<View> it4 = f6.b.B0(chipGroup4).iterator();
                        while (true) {
                            j0 j0Var4 = (j0) it4;
                            if (j0Var4.hasNext()) {
                                obj = j0Var4.next();
                                View view4 = (View) obj;
                                if (view4 instanceof Chip) {
                                    chip2 = (Chip) view4;
                                } else {
                                    chip2 = null;
                                }
                                if (chip2 != null) {
                                    num = Integer.valueOf(chip2.getId());
                                } else {
                                    num = null;
                                }
                                if (kotlin.jvm.internal.i.b(num, is.u.g2(arrayList))) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        callback = (View) obj;
                    } else {
                        callback = null;
                    }
                    if (callback instanceof Chip) {
                        chip7 = (Chip) callback;
                    }
                    if (chip7 != null) {
                        chip7.setChipBackgroundColorResource(R.color.title_high_contrast);
                        chip7.setChipStrokeColorResource(R.color.title_high_contrast);
                        chip7.setTextColor(g0.a.b(this$02.requireActivity(), R.color.white));
                        int i12 = Resources.getSystem().getDisplayMetrics().widthPixels;
                        Rect rect = new Rect();
                        chip7.getGlobalVisibleRect(rect);
                        if (rect.right == i12) {
                            Rect rect2 = new Rect();
                            chip7.getDrawingRect(rect2);
                            ((HorizontalScrollView) this$02._$_findCachedViewById(R.id.hsvShortCoursesDBFilterContainer)).smoothScrollBy(rect2.right - (i12 - rect.left), 0);
                        } else if (rect.left == 0) {
                            Rect rect3 = new Rect();
                            chip7.getDrawingRect(rect3);
                            ((HorizontalScrollView) this$02._$_findCachedViewById(R.id.hsvShortCoursesDBFilterContainer)).smoothScrollBy(rect3.right - (i12 - rect.right), 0);
                        }
                        String obj5 = chip7.getText().toString();
                        String str2 = gk.a.f16573a;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("miniCourse_chip", obj5);
                        bundle2.putString("source_of_action", "course_list_view");
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(bundle2, "lib_course_chip_click");
                        String obj6 = chip7.getText().toString();
                        kotlin.jvm.internal.i.g(obj6, "<set-?>");
                        this$02.D = obj6;
                        this$02.M(this$02.K());
                        lastSelectedId.f23469u = Integer.valueOf(chip7.getId());
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$02.f713u, e11);
                    return;
                }
        }
    }
}
