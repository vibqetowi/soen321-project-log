package nm;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import hs.k;
import is.u;
import is.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import qm.q;
import t0.j0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26393u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f26394v;

    public /* synthetic */ b(d dVar, int i6) {
        this.f26393u = i6;
        this.f26394v = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Chip chip;
        String str;
        Chip chip2;
        CharSequence text;
        Chip chip3;
        String str2;
        Chip chip4;
        boolean z10;
        CharSequence text2;
        boolean z11;
        JournalActivity journalActivity;
        JournalActivity journalActivity2;
        JournalActivity journalActivity3;
        ArrayList arrayList;
        int i6;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        View view2;
        Chip chip5;
        CharSequence text3;
        String obj;
        Object obj2;
        boolean z15;
        List<Integer> checkedChipIds;
        View view3;
        Chip chip6;
        String str3;
        CharSequence text4;
        Object obj3;
        boolean z16;
        boolean z17;
        int i11 = this.f26393u;
        String str4 = "";
        int i12 = R.id.cgJournalTemplatesFiltersChipsContainer;
        d this$0 = this.f26394v;
        switch (i11) {
            case 0:
                int i13 = d.F;
                i.g(this$0, "this$0");
                if (this$0.C) {
                    ChipGroup chipGroup = (ChipGroup) this$0._$_findCachedViewById(R.id.cgJournalTemplatesFiltersChipsContainer);
                    if (chipGroup != null) {
                        Iterator<View> it = f6.b.B0(chipGroup).iterator();
                        while (true) {
                            j0 j0Var = (j0) it;
                            if (j0Var.hasNext()) {
                                View view4 = (View) j0Var.next();
                                boolean z18 = view4 instanceof Chip;
                                if (z18) {
                                    chip3 = (Chip) view4;
                                } else {
                                    chip3 = null;
                                }
                                if (chip3 != null && (text2 = chip3.getText()) != null) {
                                    str2 = text2.toString();
                                } else {
                                    str2 = null;
                                }
                                if (z18) {
                                    chip4 = (Chip) view4;
                                } else {
                                    chip4 = null;
                                }
                                if (chip4 != null) {
                                    List<String> d10 = this$0.K().J.d();
                                    if (d10 != null) {
                                        this$0.K().getClass();
                                        if (u.Z1(d10, um.c.g(str2))) {
                                            z10 = true;
                                            chip4.setChecked(z10);
                                        }
                                    }
                                    z10 = false;
                                    chip4.setChecked(z10);
                                }
                            }
                        }
                    }
                    ChipGroup chipGroup2 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
                    if (chipGroup2 != null) {
                        Iterator<View> it2 = f6.b.B0(chipGroup2).iterator();
                        while (true) {
                            j0 j0Var2 = (j0) it2;
                            if (j0Var2.hasNext()) {
                                View view5 = (View) j0Var2.next();
                                boolean z19 = view5 instanceof Chip;
                                if (z19) {
                                    chip = (Chip) view5;
                                } else {
                                    chip = null;
                                }
                                if (chip != null && (text = chip.getText()) != null) {
                                    str = text.toString();
                                } else {
                                    str = null;
                                }
                                if (z19) {
                                    chip2 = (Chip) view5;
                                } else {
                                    chip2 = null;
                                }
                                if (chip2 != null) {
                                    chip2.setChecked(i.b(this$0.K().K.d(), str));
                                }
                            }
                        }
                    }
                    this$0.S();
                    return;
                }
                return;
            case 1:
                int i14 = d.F;
                i.g(this$0, "this$0");
                String str5 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                String[] J = this$0.J();
                bundle.putStringArray("filter_value", J);
                if (J.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bundle.putBoolean("is_filter_applied", !z11);
                k kVar = k.f19476a;
                gk.a.b(bundle, "journal_filter_click");
                this$0.S();
                return;
            case 2:
                int i15 = d.F;
                i.g(this$0, "this$0");
                gk.a.b(null, "journal_new_entry_add_click");
                p requireActivity = this$0.requireActivity();
                if (requireActivity instanceof JournalActivity) {
                    journalActivity = (JournalActivity) requireActivity;
                } else {
                    journalActivity = null;
                }
                if (journalActivity != null) {
                    View n02 = journalActivity.n0(R.id.viewJournalTemplateBottomSheetBlanketView);
                    if (n02 != null) {
                        n02.setVisibility(0);
                    }
                    BottomSheetBehavior.from((ConstraintLayout) journalActivity.n0(R.id.clJournalTemplateBottomSheet)).setState(3);
                    return;
                }
                return;
            case 3:
                int i16 = d.F;
                i.g(this$0, "this$0");
                p requireActivity2 = this$0.requireActivity();
                if (requireActivity2 instanceof JournalActivity) {
                    journalActivity2 = (JournalActivity) requireActivity2;
                } else {
                    journalActivity2 = null;
                }
                if (journalActivity2 != null) {
                    journalActivity2.f11213x = true;
                    journalActivity2.onBackPressed();
                    return;
                }
                return;
            case 4:
                int i17 = d.F;
                i.g(this$0, "this$0");
                p requireActivity3 = this$0.requireActivity();
                if (requireActivity3 instanceof JournalActivity) {
                    journalActivity3 = (JournalActivity) requireActivity3;
                } else {
                    journalActivity3 = null;
                }
                if (journalActivity3 != null) {
                    y supportFragmentManager = journalActivity3.getSupportFragmentManager();
                    androidx.fragment.app.a l2 = defpackage.e.l(supportFragmentManager, supportFragmentManager);
                    l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
                    l2.d("tips");
                    l2.e(R.id.flJournalActivityMain, new q(), null, 1);
                    l2.j();
                    return;
                }
                return;
            case 5:
                int i18 = d.F;
                i.g(this$0, "this$0");
                ChipGroup chipGroup3 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgJournalTemplatesFiltersChipsContainer);
                if (chipGroup3 != null && (checkedChipIds = chipGroup3.getCheckedChipIds()) != null) {
                    arrayList = new ArrayList();
                    for (Integer num : checkedChipIds) {
                        um.c K = this$0.K();
                        ChipGroup chipGroup4 = (ChipGroup) this$0._$_findCachedViewById(i12);
                        if (chipGroup4 != null) {
                            Iterator<View> it3 = f6.b.B0(chipGroup4).iterator();
                            while (true) {
                                j0 j0Var3 = (j0) it3;
                                if (j0Var3.hasNext()) {
                                    obj3 = j0Var3.next();
                                    int id2 = ((View) obj3).getId();
                                    if (num != null && id2 == num.intValue()) {
                                        z16 = true;
                                        continue;
                                    } else {
                                        z16 = false;
                                        continue;
                                    }
                                    if (z16) {
                                    }
                                } else {
                                    obj3 = 0;
                                }
                            }
                            view3 = obj3;
                        } else {
                            view3 = null;
                        }
                        if (view3 instanceof Chip) {
                            chip6 = (Chip) view3;
                        } else {
                            chip6 = null;
                        }
                        if (chip6 != null && (text4 = chip6.getText()) != null) {
                            str3 = text4.toString();
                        } else {
                            str3 = null;
                        }
                        K.getClass();
                        String g5 = um.c.g(str3);
                        if (g5 != null) {
                            arrayList.add(g5);
                        }
                        i12 = R.id.cgJournalTemplatesFiltersChipsContainer;
                    }
                } else {
                    arrayList = null;
                }
                ChipGroup chipGroup5 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
                if (chipGroup5 != null) {
                    i6 = chipGroup5.getCheckedChipId();
                } else {
                    i6 = -1;
                }
                if (i6 != -1) {
                    ChipGroup chipGroup6 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
                    if (chipGroup6 != null) {
                        Iterator<View> it4 = f6.b.B0(chipGroup6).iterator();
                        while (true) {
                            j0 j0Var4 = (j0) it4;
                            if (j0Var4.hasNext()) {
                                obj2 = j0Var4.next();
                                if (((View) obj2).getId() == i6) {
                                    z15 = true;
                                    continue;
                                } else {
                                    z15 = false;
                                    continue;
                                }
                                if (z15) {
                                }
                            } else {
                                obj2 = 0;
                            }
                        }
                        view2 = obj2;
                    } else {
                        view2 = null;
                    }
                    if (view2 instanceof Chip) {
                        chip5 = (Chip) view2;
                    } else {
                        chip5 = null;
                    }
                    if (chip5 != null && (text3 = chip5.getText()) != null && (obj = text3.toString()) != null) {
                        str4 = obj;
                    }
                }
                this$0.K().J.l(arrayList);
                this$0.K().K.l(str4);
                this$0.M();
                this$0.S();
                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivParentNavBarFilterIndicator);
                if (appCompatImageView != null) {
                    if (arrayList != null && arrayList.isEmpty()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (str4.length() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i10 = 8;
                            appCompatImageView.setVisibility(i10);
                        }
                    }
                    i10 = 0;
                    appCompatImageView.setVisibility(i10);
                }
                String str6 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                String[] J2 = this$0.J();
                bundle2.putStringArray("filter_value", J2);
                if (J2.length == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bundle2.putBoolean("is_filter_applied", !z12);
                k kVar2 = k.f19476a;
                gk.a.b(bundle2, "journal_filter_apply");
                return;
            default:
                int i19 = d.F;
                i.g(this$0, "this$0");
                String str7 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                String[] J3 = this$0.J();
                bundle3.putStringArray("filter_value", J3);
                if (J3.length == 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                bundle3.putBoolean("is_filter_applied", !z17);
                k kVar3 = k.f19476a;
                gk.a.b(bundle3, "journal_filter_clear_all");
                ChipGroup chipGroup7 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgJournalTemplatesFiltersChipsContainer);
                if (chipGroup7 != null) {
                    chipGroup7.B.b();
                }
                ChipGroup chipGroup8 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
                if (chipGroup8 != null) {
                    chipGroup8.B.b();
                }
                this$0.K().J.l(w.f20676u);
                this$0.K().K.l("");
                this$0.M();
                this$0.S();
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivParentNavBarFilterIndicator);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
