package fq;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.a1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MascotAnimationUtils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hr.c5;
import hr.e4;
import hr.e6;
import hr.f3;
import hr.g4;
import hr.g6;
import hr.h3;
import hr.p1;
import hr.p3;
import hr.q5;
import hr.r1;
import hr.s3;
import hr.s5;
import hr.t2;
import hr.u1;
import hr.v2;
import hr.v5;
import hr.w1;
import hr.w5;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements a1.a, MascotAnimationUtils.MascotButtonInterface, ChipGroup.d {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15793u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ rr.b f15794v;

    public /* synthetic */ s(rr.b bVar, int i6) {
        this.f15793u = i6;
        this.f15794v = bVar;
    }

    @Override // com.google.android.material.chip.ChipGroup.d
    public void n(ChipGroup chipGroup, ArrayList arrayList) {
        Object obj;
        Chip chip;
        String str;
        RecyclerView.e eVar;
        Chip chip2;
        Integer num;
        Chip chip3;
        String str2;
        CharSequence text;
        Object obj2;
        Chip chip4;
        String str3;
        String str4;
        Chip chip5;
        Integer num2;
        Chip chip6;
        String str5;
        String str6;
        CharSequence text2;
        CharSequence text3;
        Object obj3;
        Chip chip7;
        String str7;
        RecyclerView.e eVar2;
        Chip chip8;
        Integer num3;
        Chip chip9;
        String str8;
        CharSequence text4;
        int i6 = this.f15793u;
        zm.c cVar = null;
        View view = null;
        zm.c cVar2 = null;
        View view2 = null;
        String str9 = null;
        View view3 = null;
        rr.b bVar = this.f15794v;
        switch (i6) {
            case 0:
                tl.d this$0 = (tl.d) bVar;
                int i10 = tl.d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(chipGroup, "<anonymous parameter 0>");
                if (arrayList.isEmpty()) {
                    ChipGroup cgFilter = (ChipGroup) this$0._$_findCachedViewById(R.id.cgFilter);
                    kotlin.jvm.internal.i.f(cgFilter, "cgFilter");
                    Iterator<View> it = f6.b.B0(cgFilter).iterator();
                    while (true) {
                        t0.j0 j0Var = (t0.j0) it;
                        if (j0Var.hasNext()) {
                            Object next = j0Var.next();
                            View view4 = (View) next;
                            if (view4 instanceof Chip) {
                                chip6 = (Chip) view4;
                            } else {
                                chip6 = null;
                            }
                            if (chip6 != null && (text3 = chip6.getText()) != null) {
                                str5 = text3.toString();
                            } else {
                                str5 = null;
                            }
                            Chip chip10 = this$0.C;
                            if (chip10 != null && (text2 = chip10.getText()) != null) {
                                str6 = text2.toString();
                            } else {
                                str6 = null;
                            }
                            if (kotlin.jvm.internal.i.b(str5, str6)) {
                                view2 = next;
                            }
                        }
                    }
                    View view5 = view2;
                    if (view5 != null) {
                        ((ChipGroup) this$0._$_findCachedViewById(R.id.cgFilter)).b(view5.getId());
                        return;
                    }
                    return;
                }
                ChipGroup cgFilter2 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgFilter);
                kotlin.jvm.internal.i.f(cgFilter2, "cgFilter");
                Iterator<View> it2 = f6.b.B0(cgFilter2).iterator();
                while (true) {
                    t0.j0 j0Var2 = (t0.j0) it2;
                    if (j0Var2.hasNext()) {
                        obj2 = j0Var2.next();
                        View view6 = (View) obj2;
                        if (view6 instanceof Chip) {
                            chip5 = (Chip) view6;
                        } else {
                            chip5 = null;
                        }
                        if (chip5 != null) {
                            num2 = Integer.valueOf(chip5.getId());
                        } else {
                            num2 = null;
                        }
                        if (kotlin.jvm.internal.i.b(num2, is.u.g2(arrayList))) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 instanceof Chip) {
                    chip4 = (Chip) obj2;
                } else {
                    chip4 = null;
                }
                if (chip4 != null) {
                    chip4.setTextColor(g0.a.b(this$0.requireContext(), R.color.white));
                    chip4.setChipBackgroundColorResource(R.color.newTemplateDarkGrey);
                    chip4.setChipStrokeColorResource(R.color.newTemplateDarkGrey);
                    Chip chip11 = this$0.C;
                    if (chip11 == null) {
                        this$0.C = chip4;
                    } else {
                        CharSequence text5 = chip11.getText();
                        if (text5 != null) {
                            str3 = text5.toString();
                        } else {
                            str3 = null;
                        }
                        if (!kotlin.jvm.internal.i.b(str3, chip4.getText().toString())) {
                            Chip chip12 = this$0.C;
                            if (chip12 != null) {
                                chip12.setTextColor(g0.a.b(this$0.requireContext(), R.color.newTemplateDarkGrey));
                                chip12.setChipBackgroundColorResource(R.color.white);
                                chip12.setChipStrokeColorResource(R.color.proDashboardFooter);
                                chip12.setChecked(false);
                            }
                            this$0.C = chip4;
                        }
                    }
                    CharSequence text6 = chip4.getText();
                    if (text6 != null) {
                        str9 = text6.toString();
                    }
                    this$0.O(str9);
                    String str10 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    int ordinal = this$0.F.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                str4 = "all";
                            } else {
                                str4 = "couples";
                            }
                        } else {
                            str4 = "psychiatry";
                        }
                    } else {
                        str4 = "therapy";
                    }
                    bundle.putString("flow", str4);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "therapy_psychiatry_db_chip_click");
                    return;
                }
                return;
            case 1:
                an.j this$02 = (an.j) bVar;
                int i11 = an.j.G;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(chipGroup, "<anonymous parameter 0>");
                if (arrayList.isEmpty()) {
                    ChipGroup cgTpFilters = (ChipGroup) this$02._$_findCachedViewById(R.id.cgTpFilters);
                    kotlin.jvm.internal.i.f(cgTpFilters, "cgTpFilters");
                    Iterator<View> it3 = f6.b.B0(cgTpFilters).iterator();
                    while (true) {
                        t0.j0 j0Var3 = (t0.j0) it3;
                        if (j0Var3.hasNext()) {
                            Object next2 = j0Var3.next();
                            View view7 = (View) next2;
                            if (view7 instanceof Chip) {
                                chip9 = (Chip) view7;
                            } else {
                                chip9 = null;
                            }
                            if (chip9 != null && (text4 = chip9.getText()) != null) {
                                str8 = text4.toString();
                            } else {
                                str8 = null;
                            }
                            if (kotlin.jvm.internal.i.b(str8, this$02.f730v)) {
                                view = next2;
                            }
                        }
                    }
                    View view8 = view;
                    if (view8 != null) {
                        ((ChipGroup) this$02._$_findCachedViewById(R.id.cgTpFilters)).b(view8.getId());
                        return;
                    }
                    return;
                }
                ChipGroup cgTpFilters2 = (ChipGroup) this$02._$_findCachedViewById(R.id.cgTpFilters);
                kotlin.jvm.internal.i.f(cgTpFilters2, "cgTpFilters");
                Iterator<View> it4 = f6.b.B0(cgTpFilters2).iterator();
                while (true) {
                    t0.j0 j0Var4 = (t0.j0) it4;
                    if (j0Var4.hasNext()) {
                        obj3 = j0Var4.next();
                        View view9 = (View) obj3;
                        if (view9 instanceof Chip) {
                            chip8 = (Chip) view9;
                        } else {
                            chip8 = null;
                        }
                        if (chip8 != null) {
                            num3 = Integer.valueOf(chip8.getId());
                        } else {
                            num3 = null;
                        }
                        if (kotlin.jvm.internal.i.b(num3, is.u.g2(arrayList))) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                if (obj3 instanceof Chip) {
                    chip7 = (Chip) obj3;
                } else {
                    chip7 = null;
                }
                if (chip7 != null) {
                    this$02.f730v = chip7.getText().toString();
                    chip7.setTextColor(g0.a.b(this$02.requireContext(), R.color.white));
                    chip7.setChipBackgroundColorResource(R.color.title_high_contrast);
                    chip7.setChipStrokeColorResource(R.color.title_high_contrast);
                    Chip chip13 = this$02.f732x;
                    if (chip13 == null) {
                        this$02.f732x = chip7;
                    } else {
                        CharSequence text7 = chip13.getText();
                        if (text7 != null) {
                            str7 = text7.toString();
                        } else {
                            str7 = null;
                        }
                        if (!kotlin.jvm.internal.i.b(str7, chip7.getText().toString())) {
                            Chip chip14 = this$02.f732x;
                            if (chip14 != null) {
                                chip14.setTextColor(g0.a.b(this$02.requireContext(), R.color.title_high_contrast));
                                chip14.setChipBackgroundColorResource(R.color.white);
                                chip14.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                                chip14.setChecked(false);
                            }
                            this$02.f732x = chip7;
                        }
                    }
                    RecyclerView recyclerView = (RecyclerView) this$02._$_findCachedViewById(R.id.rvTpItemsRecycler);
                    if (recyclerView != null) {
                        eVar2 = recyclerView.getAdapter();
                    } else {
                        eVar2 = null;
                    }
                    if (eVar2 instanceof zm.c) {
                        cVar2 = (zm.c) eVar2;
                    }
                    if (cVar2 != null) {
                        cVar2.v(this$02.f730v);
                    }
                    String str11 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("top_pick_chip", this$02.f730v);
                    bundle2.putString("source_of_action", "top_pick_list_view");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "lib_top_pick_chip_click");
                    return;
                }
                return;
            default:
                an.t this$03 = (an.t) bVar;
                int i12 = an.t.f770g0;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(chipGroup, "<anonymous parameter 0>");
                if (arrayList.isEmpty()) {
                    ChipGroup cgLibraryTopPicksFilters = (ChipGroup) this$03._$_findCachedViewById(R.id.cgLibraryTopPicksFilters);
                    kotlin.jvm.internal.i.f(cgLibraryTopPicksFilters, "cgLibraryTopPicksFilters");
                    Iterator<View> it5 = f6.b.B0(cgLibraryTopPicksFilters).iterator();
                    while (true) {
                        t0.j0 j0Var5 = (t0.j0) it5;
                        if (j0Var5.hasNext()) {
                            Object next3 = j0Var5.next();
                            View view10 = (View) next3;
                            if (view10 instanceof Chip) {
                                chip3 = (Chip) view10;
                            } else {
                                chip3 = null;
                            }
                            if (chip3 != null && (text = chip3.getText()) != null) {
                                str2 = text.toString();
                            } else {
                                str2 = null;
                            }
                            if (kotlin.jvm.internal.i.b(str2, this$03.f776v)) {
                                view3 = next3;
                            }
                        }
                    }
                    View view11 = view3;
                    if (view11 != null) {
                        ((ChipGroup) this$03._$_findCachedViewById(R.id.cgLibraryTopPicksFilters)).b(view11.getId());
                        return;
                    }
                    return;
                }
                ChipGroup cgLibraryTopPicksFilters2 = (ChipGroup) this$03._$_findCachedViewById(R.id.cgLibraryTopPicksFilters);
                kotlin.jvm.internal.i.f(cgLibraryTopPicksFilters2, "cgLibraryTopPicksFilters");
                Iterator<View> it6 = f6.b.B0(cgLibraryTopPicksFilters2).iterator();
                while (true) {
                    t0.j0 j0Var6 = (t0.j0) it6;
                    if (j0Var6.hasNext()) {
                        obj = j0Var6.next();
                        View view12 = (View) obj;
                        if (view12 instanceof Chip) {
                            chip2 = (Chip) view12;
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
                if (obj instanceof Chip) {
                    chip = (Chip) obj;
                } else {
                    chip = null;
                }
                if (chip != null) {
                    this$03.f776v = chip.getText().toString();
                    chip.setTextColor(g0.a.b(this$03.requireContext(), R.color.white));
                    chip.setChipBackgroundColorResource(R.color.title_high_contrast);
                    chip.setChipStrokeColorResource(R.color.title_high_contrast);
                    Chip chip15 = this$03.f779y;
                    if (chip15 == null) {
                        this$03.f779y = chip;
                    } else {
                        CharSequence text8 = chip15.getText();
                        if (text8 != null) {
                            str = text8.toString();
                        } else {
                            str = null;
                        }
                        if (!kotlin.jvm.internal.i.b(str, chip.getText().toString())) {
                            Chip chip16 = this$03.f779y;
                            if (chip16 != null) {
                                chip16.setTextColor(g0.a.b(this$03.requireContext(), R.color.title_high_contrast));
                                chip16.setChipBackgroundColorResource(R.color.white);
                                chip16.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                                chip16.setChecked(false);
                            }
                            this$03.f779y = chip;
                        }
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this$03._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                    if (recyclerView2 != null) {
                        eVar = recyclerView2.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof zm.c) {
                        cVar = eVar;
                    }
                    if (cVar != null) {
                        cVar.v(chip.getText().toString());
                    }
                    RecyclerView recyclerView3 = (RecyclerView) this$03._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                    if (recyclerView3 != null) {
                        recyclerView3.l0(0);
                    }
                    String str12 = gk.a.f16573a;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("top_pick_chip", chip.getText().toString());
                    bundle3.putString("source_of_action", "lib_main_screen");
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle3, "lib_top_pick_chip_click");
                    bn.c cVar3 = this$03.c0;
                    if (cVar3 != null) {
                        cVar3.c("top_picks");
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.theinnerhour.b2b.utils.MascotAnimationUtils.MascotButtonInterface
    public void onMascotDismiss() {
        com.theinnerhour.b2b.fragment.coping.a this$0 = (com.theinnerhour.b2b.fragment.coping.a) this.f15794v;
        int i6 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        this$0.J = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x039b, code lost:
        if (r9.equals("s154") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03a5, code lost:
        if (r9.equals("s152") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03c8, code lost:
        if (r9.equals("s150") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03d2, code lost:
        if (r9.equals("s142") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03dc, code lost:
        if (r9.equals("s141") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03e6, code lost:
        if (r9.equals("s140") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03f0, code lost:
        if (r9.equals("s139") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03fa, code lost:
        if (r9.equals("s138") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x047f, code lost:
        if (r9.equals("s56") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0488, code lost:
        if (r9.equals("s55") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0491, code lost:
        if (r9.equals("s51") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x049a, code lost:
        if (r9.equals("s45") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x049d, code lost:
        r7.Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04a7, code lost:
        if (r9.equals("s37") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04ac, code lost:
        if (r7.E != 1) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04ae, code lost:
        r7.O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04b2, code lost:
        r7.Z();
     */
    @Override // androidx.appcompat.widget.a1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i6 = this.f15793u;
        rr.b bVar = this.f15794v;
        switch (i6) {
            case 0:
                t this$0 = (t) bVar;
                int i10 = t.f15798x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                ((T8Activity) activity).x0(new j1(), this$0.f15800v);
                return true;
            case 1:
                g0 this$02 = (g0) bVar;
                int i11 = g0.f15712w;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity2 = this$02.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                ((T8Activity) activity2).x0(new e1(), "result_static_three_good_things");
                return true;
            case 2:
                q0 this$03 = (q0) bVar;
                int i12 = q0.K;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity3 = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
                ((T5Activity) activity3).w0(new h1(), this$03.I);
                return true;
            case 3:
                y0 this$04 = (y0) bVar;
                int i13 = y0.O;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                this$04.S();
                String str = this$04.F;
                switch (str.hashCode()) {
                    case 112151:
                        break;
                    case 112180:
                        break;
                    case 112207:
                        break;
                    case 112211:
                        break;
                    case 112212:
                        break;
                    case 3474660:
                        if (str.equals("s128")) {
                            if (this$04.E == 0) {
                                try {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
                                    int i14 = this$04.E;
                                    int size = this$04.C.size();
                                    Calendar calendar = this$04.H;
                                    if (i14 < size) {
                                        this$04.C.set(this$04.E, simpleDateFormat.format(calendar.getTime()));
                                    } else {
                                        this$04.C.add(simpleDateFormat.format(calendar.getTime()));
                                    }
                                    ((RobertoTextView) this$04._$_findCachedViewById(R.id.tvTimeInput)).setVisibility(8);
                                    break;
                                } catch (Exception e10) {
                                    this$04.C.add("");
                                    LogHelper.INSTANCE.e(this$04.f15826u, "exception", e10);
                                    break;
                                }
                            } else {
                                this$04.Z();
                                break;
                            }
                        }
                        break;
                    case 3474661:
                        if (str.equals("s129")) {
                            if (this$04.E == 0) {
                                this$04.O();
                                break;
                            } else {
                                this$04.Z();
                                break;
                            }
                        }
                        break;
                    case 3474691:
                        break;
                    case 3474692:
                        break;
                    case 3474714:
                        break;
                    case 3474715:
                        break;
                    case 3474716:
                        break;
                    case 3474745:
                        break;
                    case 3474746:
                        if (str.equals("s151")) {
                            if (this$04.E == 2) {
                                this$04.O();
                                break;
                            } else {
                                this$04.Z();
                                break;
                            }
                        }
                        break;
                    case 3474747:
                        break;
                    case 3474749:
                        break;
                }
                androidx.fragment.app.p activity4 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                HashMap<String, Object> hashMap = ((T8Activity) activity4).B;
                hashMap.put("headings", this$04.f15828w);
                hashMap.put("list", this$04.C);
                hashMap.put("s45_37_user_list", this$04.C);
                androidx.fragment.app.p activity5 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                ((T8Activity) activity5).x0(new j1(), this$04.M);
                return true;
            case 4:
            default:
                g6 this$05 = (g6) bVar;
                int i15 = g6.f18453w;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity6 = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Context context = this$05.getContext();
                kotlin.jvm.internal.i.d(context);
                RobertoEditText edt_letter = (RobertoEditText) this$05._$_findCachedViewById(R.id.edt_letter);
                kotlin.jvm.internal.i.f(edt_letter, "edt_letter");
                ((TemplateActivity) activity6).D0(context, edt_letter);
                androidx.fragment.app.p activity7 = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity7).s0(new hr.k());
                return true;
            case 5:
                hr.j0 this$06 = (hr.j0) bVar;
                int i16 = hr.j0.f18606y;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity8 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity8).s0(new hr.l());
                return true;
            case 6:
                hr.k0 this$07 = (hr.k0) bVar;
                int i17 = hr.k0.B;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity9 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity9).s0(new hr.l());
                return true;
            case 7:
                hr.q0 this$08 = (hr.q0) bVar;
                int i18 = hr.q0.f18990w;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity10 = this$08.getActivity();
                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity10).s0(new hr.m());
                return true;
            case 8:
                hr.s0 this$09 = (hr.s0) bVar;
                int i19 = hr.s0.f19111y;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity11 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity11).s0(new hr.m());
                return true;
            case 9:
                hr.g1 this$010 = (hr.g1) bVar;
                int i20 = hr.g1.f18430x;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity12 = this$010.getActivity();
                kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity12).s0(new hr.n());
                return true;
            case 10:
                hr.i1 this$011 = (hr.i1) bVar;
                int i21 = hr.i1.f18558z;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity13 = this$011.getActivity();
                kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity13).s0(new hr.n());
                return true;
            case 11:
                p1 this$012 = (p1) bVar;
                int i22 = p1.C;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity14 = this$012.getActivity();
                kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity14).s0(new hr.o());
                return true;
            case 12:
                r1 this$013 = (r1) bVar;
                int i23 = r1.F;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity15 = this$013.getActivity();
                kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity15).s0(new hr.o());
                return true;
            case 13:
                u1 this$014 = (u1) bVar;
                int i24 = u1.f19230x;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity16 = this$014.getActivity();
                kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity16).s0(new hr.p());
                return true;
            case 14:
                w1 this$015 = (w1) bVar;
                int i25 = w1.f19329z;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity17 = this$015.getActivity();
                kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity17).s0(new hr.p());
                return true;
            case 15:
                t2 this$016 = (t2) bVar;
                int i26 = t2.f19195w;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity18 = this$016.getActivity();
                kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity18).s0(new hr.r());
                return true;
            case 16:
                v2 this$017 = (v2) bVar;
                int i27 = v2.f19274y;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                TemplateActivity templateActivity = this$017.f19276v;
                if (templateActivity != null) {
                    templateActivity.s0(new hr.r());
                    return true;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 17:
                f3 this$018 = (f3) bVar;
                int i28 = f3.f18365x;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity19 = this$018.getActivity();
                kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity19).s0(new hr.u());
                return true;
            case 18:
                h3 this$019 = (h3) bVar;
                int i29 = h3.f18513z;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity20 = this$019.getActivity();
                kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity20).s0(new hr.u());
                return true;
            case 19:
                p3 this$020 = (p3) bVar;
                int i30 = p3.f18950w;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity21 = this$020.getActivity();
                kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity21).s0(new hr.v());
                return true;
            case 20:
                s3 this$021 = (s3) bVar;
                int i31 = s3.f19129z;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity22 = this$021.getActivity();
                kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity22).s0(new hr.v());
                return true;
            case 21:
                e4 this$022 = (e4) bVar;
                int i32 = e4.f18334w;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity23 = this$022.getActivity();
                kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity23).s0(new hr.w());
                return true;
            case 22:
                g4 this$023 = (g4) bVar;
                int i33 = g4.f18438z;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity24 = this$023.getActivity();
                kotlin.jvm.internal.i.e(activity24, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity24).s0(new hr.w());
                return true;
            case 23:
                c5 this$024 = (c5) bVar;
                int i34 = c5.C;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity25 = this$024.getActivity();
                kotlin.jvm.internal.i.e(activity25, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity25).s0(new hr.q());
                return true;
            case 24:
                q5 this$025 = (q5) bVar;
                int i35 = q5.f19017w;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity26 = this$025.getActivity();
                kotlin.jvm.internal.i.e(activity26, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity26).s0(new hr.t());
                return true;
            case 25:
                s5 this$026 = (s5) bVar;
                int i36 = s5.f19149x;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity27 = this$026.getActivity();
                kotlin.jvm.internal.i.e(activity27, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity27).F.put("s145_user_list", this$026.f19151v);
                this$026.M();
                androidx.fragment.app.p activity28 = this$026.getActivity();
                kotlin.jvm.internal.i.e(activity28, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity28).s0(new hr.r());
                return true;
            case 26:
                v5 this$027 = (v5) bVar;
                int i37 = v5.f19292y;
                kotlin.jvm.internal.i.g(this$027, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                this$027.K();
                androidx.fragment.app.p activity29 = this$027.getActivity();
                kotlin.jvm.internal.i.e(activity29, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity29).s0(new hr.r());
                return true;
            case 27:
                w5 this$028 = (w5) bVar;
                int i38 = w5.f19347w;
                kotlin.jvm.internal.i.g(this$028, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity30 = this$028.getActivity();
                kotlin.jvm.internal.i.e(activity30, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity30).s0(new hr.s());
                return true;
            case 28:
                e6 this$029 = (e6) bVar;
                int i39 = e6.f18340x;
                kotlin.jvm.internal.i.g(this$029, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() != R.id.action_show_logs) {
                    return false;
                }
                androidx.fragment.app.p activity31 = this$029.getActivity();
                kotlin.jvm.internal.i.e(activity31, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity31).s0(new hr.k());
                return true;
        }
    }
}
