package an;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import cn.k0;
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
public final /* synthetic */ class q implements ChipGroup.d {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f762u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f763v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t f764w;

    public /* synthetic */ q(int i6, t tVar, kotlin.jvm.internal.x xVar) {
        this.f762u = i6;
        this.f763v = xVar;
        this.f764w = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v41, types: [T, java.lang.Integer] */
    @Override // com.google.android.material.chip.ChipGroup.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ChipGroup chipGroup, ArrayList arrayList) {
        Object obj;
        Chip chip;
        Object obj2;
        boolean z10;
        Chip chip2;
        Integer num;
        View view;
        Chip chip3;
        KeyEvent.Callback callback;
        Object obj3;
        Chip chip4;
        Integer num2;
        Object obj4;
        Chip chip5;
        Integer num3;
        int i6 = this.f762u;
        Chip chip6 = null;
        t this$0 = this.f764w;
        kotlin.jvm.internal.x lastSelectedId = this.f763v;
        switch (i6) {
            case 0:
                int i10 = t.f770g0;
                kotlin.jvm.internal.i.g(lastSelectedId, "$lastSelectedId");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(chipGroup, "<anonymous parameter 0>");
                try {
                    if (arrayList.isEmpty()) {
                        Integer num4 = (Integer) lastSelectedId.f23469u;
                        if (num4 != null) {
                            int intValue = num4.intValue();
                            ChipGroup chipGroup2 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgShortCoursesFilters);
                            if (chipGroup2 != null) {
                                chipGroup2.b(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ChipGroup chipGroup3 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgShortCoursesFilters);
                    if (chipGroup3 != null) {
                        Iterator<View> it = f6.b.B0(chipGroup3).iterator();
                        while (true) {
                            j0 j0Var = (j0) it;
                            if (j0Var.hasNext()) {
                                obj4 = j0Var.next();
                                View view2 = (View) obj4;
                                if (view2 instanceof Chip) {
                                    chip5 = (Chip) view2;
                                } else {
                                    chip5 = null;
                                }
                                if (chip5 != null) {
                                    num3 = Integer.valueOf(chip5.getId());
                                } else {
                                    num3 = null;
                                }
                                if (kotlin.jvm.internal.i.b(num3, lastSelectedId.f23469u)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        view = (View) obj4;
                    } else {
                        view = null;
                    }
                    if (view instanceof Chip) {
                        chip3 = (Chip) view;
                    } else {
                        chip3 = null;
                    }
                    if (chip3 != null) {
                        chip3.setChipBackgroundColorResource(R.color.white);
                        chip3.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                        chip3.setTextColor(g0.a.b(this$0.requireActivity(), R.color.title_high_contrast));
                    }
                    ChipGroup chipGroup4 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgShortCoursesFilters);
                    if (chipGroup4 != null) {
                        Iterator<View> it2 = f6.b.B0(chipGroup4).iterator();
                        while (true) {
                            j0 j0Var2 = (j0) it2;
                            if (j0Var2.hasNext()) {
                                obj3 = j0Var2.next();
                                View view3 = (View) obj3;
                                if (view3 instanceof Chip) {
                                    chip4 = (Chip) view3;
                                } else {
                                    chip4 = null;
                                }
                                if (chip4 != null) {
                                    num2 = Integer.valueOf(chip4.getId());
                                } else {
                                    num2 = null;
                                }
                                if (kotlin.jvm.internal.i.b(num2, is.u.g2(arrayList))) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        callback = (View) obj3;
                    } else {
                        callback = null;
                    }
                    if (callback instanceof Chip) {
                        chip6 = (Chip) callback;
                    }
                    if (chip6 != null) {
                        chip6.setChipBackgroundColorResource(R.color.title_high_contrast);
                        chip6.setChipStrokeColorResource(R.color.title_high_contrast);
                        chip6.setTextColor(g0.a.b(this$0.requireActivity(), R.color.white));
                        int i11 = Resources.getSystem().getDisplayMetrics().widthPixels;
                        Rect rect = new Rect();
                        chip6.getGlobalVisibleRect(rect);
                        if (rect.right == i11) {
                            Rect rect2 = new Rect();
                            chip6.getDrawingRect(rect2);
                            ((HorizontalScrollView) this$0._$_findCachedViewById(R.id.hsvShortCoursesDBFilterContainer)).smoothScrollBy(rect2.right - (i11 - rect.left), 0);
                        } else if (rect.left == 0) {
                            Rect rect3 = new Rect();
                            chip6.getDrawingRect(rect3);
                            ((HorizontalScrollView) this$0._$_findCachedViewById(R.id.hsvShortCoursesDBFilterContainer)).smoothScrollBy(rect3.right - (i11 - rect.right), 0);
                        }
                        String obj5 = chip6.getText().toString();
                        kotlin.jvm.internal.i.g(obj5, "<set-?>");
                        this$0.I = obj5;
                        String str = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putString("miniCourse_chip", this$0.Z());
                        bundle.putString("source_of_action", "lib_main_screen");
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "lib_course_chip_click");
                        this$0.a0(this$0.Z());
                        lastSelectedId.f23469u = Integer.valueOf(chip6.getId());
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f775u, e10);
                    return;
                }
            default:
                int i12 = t.f770g0;
                kotlin.jvm.internal.i.g(lastSelectedId, "$lastSelectedId");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(chipGroup, "chipGroup");
                try {
                    if (arrayList.isEmpty()) {
                        Integer num5 = (Integer) lastSelectedId.f23469u;
                        if (num5 != null) {
                            chipGroup.b(num5.intValue());
                            return;
                        }
                        return;
                    }
                    Iterator<View> it3 = f6.b.B0(chipGroup).iterator();
                    while (true) {
                        j0 j0Var3 = (j0) it3;
                        if (j0Var3.hasNext()) {
                            obj = j0Var3.next();
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
                            if (kotlin.jvm.internal.i.b(num, lastSelectedId.f23469u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    if (obj instanceof Chip) {
                        chip = (Chip) obj;
                    } else {
                        chip = null;
                    }
                    if (chip != null) {
                        chip.setChipBackgroundColorResource(R.color.white);
                        chip.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                        chip.setTextColor(g0.a.b(this$0.requireActivity(), R.color.title_high_contrast));
                    }
                    Iterator<View> it4 = f6.b.B0(chipGroup).iterator();
                    while (true) {
                        j0 j0Var4 = (j0) it4;
                        if (j0Var4.hasNext()) {
                            obj2 = j0Var4.next();
                            int id2 = ((View) obj2).getId();
                            Integer num6 = (Integer) is.u.g2(arrayList);
                            if (num6 != null && id2 == num6.intValue()) {
                                z10 = true;
                                continue;
                                if (z10) {
                                }
                            }
                            z10 = false;
                            if (z10) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 instanceof Chip) {
                        chip6 = obj2;
                    }
                    if (chip6 != null) {
                        String str2 = gk.a.f16573a;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("resource_chip", chip6.getText().toString());
                        bundle2.putString("source_of_action", "lib_main_screen");
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(bundle2, "lib_resource_chip_click");
                        ArrayList<LogModel> arrayList2 = kn.a.f23436a;
                        this$0.f778x = kn.a.n(chip6.getText().toString());
                        lastSelectedId.f23469u = Integer.valueOf(chip6.getId());
                        chip6.setChipBackgroundColorResource(R.color.title_high_contrast);
                        chip6.setChipStrokeColorResource(R.color.title_high_contrast);
                        chip6.setTextColor(g0.a.b(this$0.requireActivity(), R.color.white));
                        if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                            k0 k0Var = this$0.B;
                            if (k0Var != null) {
                                k0Var.n(kn.a.n(chip6.getText().toString()));
                            }
                            ((RecyclerView) this$0._$_findCachedViewById(R.id.rvLibraryDbResources)).l0(0);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f775u, e11);
                    return;
                }
        }
    }
}
