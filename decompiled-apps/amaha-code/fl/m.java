package fl;

import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NewDashboardSavedItemsActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.k0;
import hr.f7;
import hr.g7;
import hr.h7;
import hr.k9;
import hr.n9;
import hr.p7;
import hr.q7;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15149u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f15150v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f15151w;

    public /* synthetic */ m(Object obj, int i6, Object obj2) {
        this.f15149u = i6;
        this.f15150v = obj;
        this.f15151w = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r9.y0() != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0326 A[Catch: Exception -> 0x02a8, TryCatch #0 {Exception -> 0x02a8, blocks: (B:116:0x0233, B:118:0x0237, B:120:0x023f, B:122:0x0248, B:124:0x024c, B:126:0x0250, B:131:0x0264, B:133:0x028e, B:135:0x0296, B:137:0x029a, B:178:0x0322, B:180:0x0326, B:182:0x032a, B:191:0x034a, B:192:0x0384, B:183:0x032d, B:185:0x0333, B:187:0x0339, B:188:0x0344, B:189:0x0347, B:193:0x03c1, B:194:0x03c4, B:138:0x02a4, B:139:0x02a7, B:142:0x02ab, B:144:0x02af, B:145:0x02b8, B:146:0x02bb, B:147:0x02bc, B:148:0x02bf, B:130:0x0259, B:149:0x02c0, B:150:0x02c3, B:151:0x02c4, B:152:0x02c7, B:154:0x02ca, B:156:0x02ce, B:158:0x02d2, B:160:0x02db, B:162:0x02e4, B:164:0x02e8, B:166:0x02ec, B:171:0x0300, B:170:0x02f5, B:172:0x0316, B:173:0x0319, B:174:0x031a, B:175:0x031d, B:176:0x031e, B:177:0x0321), top: B:269:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c1 A[Catch: Exception -> 0x02a8, TryCatch #0 {Exception -> 0x02a8, blocks: (B:116:0x0233, B:118:0x0237, B:120:0x023f, B:122:0x0248, B:124:0x024c, B:126:0x0250, B:131:0x0264, B:133:0x028e, B:135:0x0296, B:137:0x029a, B:178:0x0322, B:180:0x0326, B:182:0x032a, B:191:0x034a, B:192:0x0384, B:183:0x032d, B:185:0x0333, B:187:0x0339, B:188:0x0344, B:189:0x0347, B:193:0x03c1, B:194:0x03c4, B:138:0x02a4, B:139:0x02a7, B:142:0x02ab, B:144:0x02af, B:145:0x02b8, B:146:0x02bb, B:147:0x02bc, B:148:0x02bf, B:130:0x0259, B:149:0x02c0, B:150:0x02c3, B:151:0x02c4, B:152:0x02c7, B:154:0x02ca, B:156:0x02ce, B:158:0x02d2, B:160:0x02db, B:162:0x02e4, B:164:0x02e8, B:166:0x02ec, B:171:0x0300, B:170:0x02f5, B:172:0x0316, B:173:0x0319, B:174:0x031a, B:175:0x031d, B:176:0x031e, B:177:0x0321), top: B:269:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174 A[Catch: Exception -> 0x01f3, TryCatch #1 {Exception -> 0x01f3, blocks: (B:11:0x0054, B:13:0x0058, B:15:0x005c, B:23:0x006c, B:25:0x0072, B:27:0x0076, B:30:0x0085, B:32:0x0089, B:34:0x0091, B:36:0x009a, B:38:0x009e, B:40:0x00a2, B:48:0x00b7, B:50:0x00e1, B:52:0x00e9, B:54:0x00ed, B:94:0x0174, B:95:0x01ae, B:55:0x00f7, B:56:0x00fa, B:57:0x00fb, B:59:0x00ff, B:60:0x0108, B:61:0x010b, B:62:0x010c, B:63:0x010f, B:44:0x00ab, B:46:0x00b1, B:64:0x0110, B:65:0x0113, B:66:0x0114, B:67:0x0117, B:69:0x011a, B:71:0x011e, B:73:0x0122, B:75:0x012b, B:77:0x0134, B:79:0x0138, B:81:0x013c, B:86:0x0150, B:85:0x0145, B:87:0x0166, B:88:0x0169, B:89:0x016a, B:90:0x016d, B:91:0x016e, B:92:0x0171, B:28:0x0079, B:96:0x01eb, B:97:0x01ee, B:18:0x0061, B:98:0x01ef, B:99:0x01f2), top: B:270:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ae A[Catch: Exception -> 0x01f3, TryCatch #1 {Exception -> 0x01f3, blocks: (B:11:0x0054, B:13:0x0058, B:15:0x005c, B:23:0x006c, B:25:0x0072, B:27:0x0076, B:30:0x0085, B:32:0x0089, B:34:0x0091, B:36:0x009a, B:38:0x009e, B:40:0x00a2, B:48:0x00b7, B:50:0x00e1, B:52:0x00e9, B:54:0x00ed, B:94:0x0174, B:95:0x01ae, B:55:0x00f7, B:56:0x00fa, B:57:0x00fb, B:59:0x00ff, B:60:0x0108, B:61:0x010b, B:62:0x010c, B:63:0x010f, B:44:0x00ab, B:46:0x00b1, B:64:0x0110, B:65:0x0113, B:66:0x0114, B:67:0x0117, B:69:0x011a, B:71:0x011e, B:73:0x0122, B:75:0x012b, B:77:0x0134, B:79:0x0138, B:81:0x013c, B:86:0x0150, B:85:0x0145, B:87:0x0166, B:88:0x0169, B:89:0x016a, B:90:0x016d, B:91:0x016e, B:92:0x0171, B:28:0x0079, B:96:0x01eb, B:97:0x01ee, B:18:0x0061, B:98:0x01ef, B:99:0x01f2), top: B:270:0x0054 }] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Chip chip;
        RecyclerView.e eVar;
        boolean z11;
        int i6;
        boolean z12;
        float f;
        String goalName;
        TemplateActivity templateActivity;
        String goalName2;
        boolean z13;
        String goalName3;
        String goalName4;
        int i10 = this.f15149u;
        String str = "";
        Object obj = this.f15151w;
        Object obj2 = this.f15150v;
        Chip chip2 = null;
        il.c cVar = null;
        switch (i10) {
            case 0:
                NewDashboardSavedItemsActivity this$0 = (NewDashboardSavedItemsActivity) obj2;
                String chipLabel = (String) obj;
                int i11 = NewDashboardSavedItemsActivity.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(chipLabel, "$chipLabel");
                if (z10) {
                    if (compoundButton instanceof Chip) {
                        chip = (Chip) compoundButton;
                    } else {
                        chip = null;
                    }
                    if (chip != null) {
                        chip.setChipBackgroundColorResource(R.color.title_high_contrast);
                        chip.setChipStrokeColorResource(R.color.title_high_contrast);
                        chip.setTextColor(g0.a.b(this$0, R.color.white));
                        RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.rvSiItemsRecycler);
                        if (recyclerView != null) {
                            eVar = recyclerView.getAdapter();
                        } else {
                            eVar = null;
                        }
                        if (eVar instanceof il.c) {
                            cVar = (il.c) eVar;
                        }
                        if (cVar != null) {
                            z11 = cVar.v(chipLabel, false);
                        } else {
                            z11 = false;
                        }
                        ConstraintLayout constraintLayout = (ConstraintLayout) this$0.u0(R.id.clSiNullState);
                        if (constraintLayout != null) {
                            if (z11) {
                                i6 = 0;
                            } else {
                                i6 = 8;
                            }
                            constraintLayout.setVisibility(i6);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("saved_chip", chipLabel);
                        UtilsKt.fireAnalytics("lib_saved_items_chip_click", bundle);
                        return;
                    }
                    return;
                }
                if (compoundButton instanceof Chip) {
                    chip2 = (Chip) compoundButton;
                }
                if (chip2 != null) {
                    chip2.setChipBackgroundColorResource(R.color.white);
                    chip2.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                    chip2.setTextColor(g0.a.b(this$0, R.color.title_high_contrast));
                    return;
                }
                return;
            case 1:
                ho.n this$02 = (ho.n) obj2;
                Chip chip3 = (Chip) obj;
                int i12 = ho.n.f18024z;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(chip3, "$chip");
                ArrayList<String> arrayList = this$02.f18027w;
                if (z10) {
                    if (arrayList.size() == this$02.f18026v) {
                        Utils.INSTANCE.showCustomToast(this$02.requireContext(), "You have already selected 5 options");
                        chip3.setChecked(false);
                        return;
                    }
                    arrayList.add(chip3.getText().toString());
                    chip3.setChipBackgroundColorResource(R.color.pro_card_dark_blue);
                    chip3.setTextColor(g0.a.b(this$02.requireContext(), R.color.white));
                } else {
                    arrayList.remove(chip3.getText().toString());
                    chip3.setChipBackgroundColorResource(R.color.proBgPink);
                    chip3.setTextColor(g0.a.b(this$02.requireContext(), R.color.proAssessmentBlueLight));
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) this$02._$_findCachedViewById(R.id.presentConcernNext);
                if (appCompatImageView == null) {
                    z12 = true;
                } else {
                    z12 = true;
                    appCompatImageView.setEnabled(!arrayList.isEmpty());
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$02._$_findCachedViewById(R.id.presentConcernNext);
                if (appCompatImageView2 != null) {
                    if (arrayList.isEmpty() ^ z12) {
                        f = 1.0f;
                    } else {
                        f = 0.34f;
                    }
                    appCompatImageView2.setAlpha(f);
                    return;
                }
                return;
            case 2:
                k0 this$03 = (k0) obj2;
                int i13 = k0.f15744x;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                FirebasePersistence.getInstance().addNewGoal(this$03.f15746v, (String) obj, false, z10);
                return;
            case 3:
                Chip ch2 = (Chip) obj2;
                oq.m this$04 = (oq.m) obj;
                int i14 = oq.m.B;
                kotlin.jvm.internal.i.g(ch2, "$ch");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                ArrayList<Chip> arrayList2 = this$04.f27746v;
                if (z10) {
                    ch2.setCloseIconResource(R.drawable.ic_remove_circle_black);
                    androidx.fragment.app.p activity = this$04.getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    ch2.setTextColor(g0.a.b(activity, R.color.white));
                    ch2.setChipStrokeColorResource(R.color.sea);
                    ch2.setChipBackgroundColorResource(R.color.sea);
                    ch2.setChecked(true);
                    arrayList2.add(ch2);
                    ((RobertoButton) this$04._$_findCachedViewById(R.id.btnContinue)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                    return;
                }
                ch2.setCloseIconResource(R.drawable.ic_remove_circle_black_outline);
                arrayList2.remove(ch2);
                androidx.fragment.app.p activity2 = this$04.getActivity();
                kotlin.jvm.internal.i.d(activity2);
                ch2.setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
                ch2.setChipStrokeColorResource(R.color.title_high_contrast);
                ch2.setChipBackgroundColorResource(R.color.white);
                ch2.setChecked(false);
                if (arrayList2.size() == 0) {
                    ((RobertoButton) this$04._$_findCachedViewById(R.id.btnContinue)).setBackgroundResource(R.drawable.button_border_gray);
                    return;
                }
                return;
            case 4:
                Chip ch3 = (Chip) obj2;
                rq.g this$05 = (rq.g) obj;
                int i15 = rq.g.B;
                kotlin.jvm.internal.i.g(ch3, "$ch");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                ArrayList<Chip> arrayList3 = this$05.f30936v;
                if (z10) {
                    ch3.setCloseIconResource(R.drawable.ic_remove_circle_black);
                    androidx.fragment.app.p activity3 = this$05.getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    ch3.setTextColor(g0.a.b(activity3, R.color.white));
                    ch3.setChipStrokeColorResource(R.color.sea);
                    ch3.setChipBackgroundColorResource(R.color.sea);
                    ch3.setChecked(true);
                    arrayList3.add(ch3);
                    ((RobertoButton) this$05._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                    return;
                }
                ch3.setCloseIconResource(R.drawable.ic_remove_circle_black_outline);
                arrayList3.remove(ch3);
                androidx.fragment.app.p activity4 = this$05.getActivity();
                kotlin.jvm.internal.i.d(activity4);
                ch3.setTextColor(g0.a.b(activity4, R.color.title_high_contrast));
                ch3.setChipStrokeColorResource(R.color.title_high_contrast);
                ch3.setChipBackgroundColorResource(R.color.white);
                ch3.setChecked(false);
                if (arrayList3.size() == 0) {
                    ((RobertoButton) this$05._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
                    return;
                }
                return;
            case 5:
                g7 this$06 = (g7) obj2;
                kotlin.jvm.internal.u goalVisible = (kotlin.jvm.internal.u) obj;
                int i16 = g7.J;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(goalVisible, "$goalVisible");
                if (z10) {
                    try {
                        TemplateActivity templateActivity2 = this$06.D;
                        if (templateActivity2 != null) {
                            if (!kotlin.jvm.internal.i.b(templateActivity2.M, "")) {
                                Bundle bundle2 = new Bundle();
                                TemplateActivity templateActivity3 = this$06.D;
                                if (templateActivity3 != null) {
                                    if (templateActivity3.W) {
                                        FirestoreGoal firestoreGoal = this$06.C;
                                        if (firestoreGoal != null && (goalName = firestoreGoal.getGoalName()) != null) {
                                            str = goalName;
                                        }
                                    } else {
                                        Goal y02 = templateActivity3.y0();
                                        kotlin.jvm.internal.i.d(y02);
                                        str = y02.getGoalName();
                                    }
                                    bundle2.putString(Constants.GOAL, str);
                                    bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                    ArrayList k10 = ca.a.k(Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID);
                                    TemplateActivity templateActivity4 = this$06.D;
                                    if (templateActivity4 != null) {
                                        if (k10.contains(templateActivity4.M)) {
                                            TemplateActivity templateActivity5 = this$06.D;
                                            if (templateActivity5 != null) {
                                                bundle2.putString("topicalCourse", templateActivity5.M);
                                                gk.a.b(bundle2, "topical_goal_added");
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        } else {
                                            TemplateActivity templateActivity6 = this$06.D;
                                            if (templateActivity6 != null) {
                                                bundle2.putString("miniCourse", templateActivity6.M);
                                                gk.a.b(bundle2, "mini_goal_added");
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        }
                                        templateActivity = this$06.D;
                                        if (templateActivity == null) {
                                            if (templateActivity.W) {
                                                this$06.F = z10;
                                            } else if (templateActivity.y0() != null) {
                                                goalVisible.f23466u = z10;
                                                TemplateActivity templateActivity7 = this$06.D;
                                                if (templateActivity7 != null) {
                                                    Goal y03 = templateActivity7.y0();
                                                    kotlin.jvm.internal.i.d(y03);
                                                    y03.setVisible(z10);
                                                } else {
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                            }
                                            if (z10) {
                                                ((SwitchCompat) this$06._$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                                                ((RobertoTextView) this$06._$_findCachedViewById(R.id.textView5)).setAlpha(1.0f);
                                                ((SwitchCompat) this$06._$_findCachedViewById(R.id.switch_remind)).setAlpha(1.0f);
                                                ((RobertoTextView) this$06._$_findCachedViewById(R.id.textView5)).setOnClickListener(new f7(this$06, 3));
                                                return;
                                            }
                                            ((SwitchCompat) this$06._$_findCachedViewById(R.id.switch_remind)).setChecked(false);
                                            ((SwitchCompat) this$06._$_findCachedViewById(R.id.switch_remind)).setEnabled(false);
                                            ((RobertoTextView) this$06._$_findCachedViewById(R.id.textView5)).setAlpha(0.5f);
                                            ((SwitchCompat) this$06._$_findCachedViewById(R.id.switch_remind)).setAlpha(0.5f);
                                            ((RobertoTextView) this$06._$_findCachedViewById(R.id.textView5)).setOnClickListener(null);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$06.f18456u, "error setting goal visibility", e10);
                        return;
                    }
                }
                if (z10) {
                    TemplateActivity templateActivity8 = this$06.D;
                    if (templateActivity8 != null) {
                        if (templateActivity8.N) {
                            Bundle bundle3 = new Bundle();
                            TemplateActivity templateActivity9 = this$06.D;
                            if (templateActivity9 != null) {
                                bundle3.putString("miniCourse", templateActivity9.M);
                                TemplateActivity templateActivity10 = this$06.D;
                                if (templateActivity10 != null) {
                                    if (templateActivity10.W) {
                                        FirestoreGoal firestoreGoal2 = this$06.C;
                                        if (firestoreGoal2 != null && (goalName2 = firestoreGoal2.getGoalName()) != null) {
                                            str = goalName2;
                                        }
                                    } else {
                                        Goal y04 = templateActivity10.y0();
                                        kotlin.jvm.internal.i.d(y04);
                                        str = y04.getGoalName();
                                    }
                                    bundle3.putString(Constants.GOAL, str);
                                    bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                    gk.a.b(bundle3, "add_goal");
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                templateActivity = this$06.D;
                if (templateActivity == null) {
                }
                break;
            case 6:
                h7 this$07 = (h7) obj2;
                kotlin.jvm.internal.u goalVisible2 = (kotlin.jvm.internal.u) obj;
                int i17 = h7.B;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(goalVisible2, "$goalVisible");
                TemplateActivity templateActivity11 = this$07.f18540y;
                if (templateActivity11 != null) {
                    if (templateActivity11.W) {
                        this$07.f18541z = z10;
                        goalVisible2.f23466u = z10;
                        return;
                    }
                    Goal y05 = templateActivity11.y0();
                    if (y05 != null) {
                        y05.setVisible(z10);
                        goalVisible2.f23466u = z10;
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 7:
                q7 this$08 = (q7) obj2;
                kotlin.jvm.internal.u goalVisible3 = (kotlin.jvm.internal.u) obj;
                int i18 = q7.H;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(goalVisible3, "$goalVisible");
                try {
                    TemplateActivity templateActivity12 = this$08.C;
                    if (templateActivity12 != null) {
                        if (!templateActivity12.W) {
                            break;
                        } else {
                            if (this$08.B != null) {
                                z13 = true;
                            }
                            z13 = false;
                        }
                        if (z13) {
                            goalVisible3.f23466u = z10;
                            TemplateActivity templateActivity13 = this$08.C;
                            if (templateActivity13 != null) {
                                if (templateActivity13.W) {
                                    this$08.D = z10;
                                } else {
                                    Goal y06 = templateActivity13.y0();
                                    kotlin.jvm.internal.i.d(y06);
                                    y06.setVisible(z10);
                                }
                                if (z10) {
                                    TemplateActivity templateActivity14 = this$08.C;
                                    if (templateActivity14 != null) {
                                        if (!kotlin.jvm.internal.i.b(templateActivity14.M, "")) {
                                            Bundle bundle4 = new Bundle();
                                            TemplateActivity templateActivity15 = this$08.C;
                                            if (templateActivity15 != null) {
                                                if (templateActivity15.W) {
                                                    FirestoreGoal firestoreGoal3 = this$08.B;
                                                    if (firestoreGoal3 != null && (goalName4 = firestoreGoal3.getGoalName()) != null) {
                                                        str = goalName4;
                                                    }
                                                } else {
                                                    Goal y07 = templateActivity15.y0();
                                                    str = y07 != null ? y07.getGoalName() : null;
                                                }
                                                bundle4.putString(Constants.GOAL, str);
                                                bundle4.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                                ArrayList k11 = ca.a.k(Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID);
                                                TemplateActivity templateActivity16 = this$08.C;
                                                if (templateActivity16 != null) {
                                                    if (k11.contains(templateActivity16.M)) {
                                                        TemplateActivity templateActivity17 = this$08.C;
                                                        if (templateActivity17 != null) {
                                                            bundle4.putString("topicalCourse", templateActivity17.M);
                                                            gk.a.b(bundle4, "topical_goal_added");
                                                        } else {
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                    } else {
                                                        TemplateActivity templateActivity18 = this$08.C;
                                                        if (templateActivity18 != null) {
                                                            bundle4.putString("miniCourse", templateActivity18.M);
                                                            gk.a.b(bundle4, "mini_goal_added");
                                                        } else {
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                    }
                                                    if (!z10) {
                                                        ((SwitchCompat) this$08._$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                                                        ((RobertoTextView) this$08._$_findCachedViewById(R.id.textView5)).setAlpha(1.0f);
                                                        ((SwitchCompat) this$08._$_findCachedViewById(R.id.switch_remind)).setAlpha(1.0f);
                                                        ((RobertoTextView) this$08._$_findCachedViewById(R.id.textView5)).setOnClickListener(new p7(this$08, 3));
                                                        return;
                                                    }
                                                    ((SwitchCompat) this$08._$_findCachedViewById(R.id.switch_remind)).setChecked(false);
                                                    ((SwitchCompat) this$08._$_findCachedViewById(R.id.switch_remind)).setEnabled(false);
                                                    ((RobertoTextView) this$08._$_findCachedViewById(R.id.textView5)).setAlpha(0.5f);
                                                    ((SwitchCompat) this$08._$_findCachedViewById(R.id.switch_remind)).setAlpha(0.5f);
                                                    ((RobertoTextView) this$08._$_findCachedViewById(R.id.textView5)).setOnClickListener(null);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                }
                                if (z10) {
                                    TemplateActivity templateActivity19 = this$08.C;
                                    if (templateActivity19 != null) {
                                        if (templateActivity19.N) {
                                            Bundle bundle5 = new Bundle();
                                            TemplateActivity templateActivity20 = this$08.C;
                                            if (templateActivity20 != null) {
                                                bundle5.putString("miniCourse", templateActivity20.M);
                                                TemplateActivity templateActivity21 = this$08.C;
                                                if (templateActivity21 != null) {
                                                    if (templateActivity21.W) {
                                                        FirestoreGoal firestoreGoal4 = this$08.B;
                                                        if (firestoreGoal4 != null && (goalName3 = firestoreGoal4.getGoalName()) != null) {
                                                            str = goalName3;
                                                        }
                                                    } else {
                                                        Goal y08 = templateActivity21.y0();
                                                        kotlin.jvm.internal.i.d(y08);
                                                        str = y08.getGoalName();
                                                    }
                                                    bundle5.putString(Constants.GOAL, str);
                                                    bundle5.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                                    gk.a.b(bundle5, "add_goal");
                                                } else {
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                }
                                if (!z10) {
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            return;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$08.f19024u, "error setting goal visibility", e11);
                    return;
                }
                break;
            case 8:
                k9 this$09 = (k9) obj2;
                String text = (String) obj;
                int i19 = k9.f18694x;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(text, "$text");
                ArrayList<String> arrayList4 = this$09.f18696v;
                if (z10) {
                    arrayList4.add(text);
                    return;
                } else {
                    arrayList4.remove(text);
                    return;
                }
            default:
                kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) obj2;
                String tt2 = (String) obj;
                int i20 = n9.f18894w;
                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                if (z10) {
                    ((ArrayList) selectedOptions.f23469u).add(tt2);
                    return;
                } else {
                    ((ArrayList) selectedOptions.f23469u).remove(tt2);
                    return;
                }
        }
    }
}
