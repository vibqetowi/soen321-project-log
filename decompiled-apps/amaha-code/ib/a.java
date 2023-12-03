package ib;

import android.widget.CompoundButton;
import cm.g;
import com.google.android.material.chip.Chip;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N19ScreenFragment;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import fq.o0;
import hr.g7;
import hr.q7;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.x;
import pl.z;
import qb.h;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19921u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f19922v;

    public /* synthetic */ a(int i6, Object obj) {
        this.f19921u = i6;
        this.f19922v = obj;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int i6 = this.f19921u;
        Object obj = this.f19922v;
        switch (i6) {
            case 0:
                Chip chip = (Chip) obj;
                h.a<Chip> aVar = chip.D;
                if (aVar != null) {
                    qb.b bVar = ((qb.a) aVar).f29406a;
                    if (!z10 ? bVar.f(chip, bVar.f29411e) : bVar.a(chip)) {
                        bVar.e();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.C;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    return;
                }
                return;
            case 1:
                N19ScreenFragment this$0 = (N19ScreenFragment) obj;
                int i10 = N19ScreenFragment.K;
                i.g(this$0, "this$0");
                if (z10) {
                    yn.a aVar2 = this$0.F;
                    aVar2.getClass();
                    if (yn.a.b()) {
                        this$0.E = true;
                        return;
                    }
                    compoundButton.setChecked(false);
                    x xVar = new x();
                    ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("new_dynamic", aVar2.a(true), "goals", this$0.F, new z(compoundButton, xVar));
                    xVar.f23469u = notificationPermissionBottomSheet;
                    notificationPermissionBottomSheet.show(this$0.requireActivity().getSupportFragmentManager(), "permission");
                    return;
                }
                this$0.E = false;
                return;
            case 2:
                g this$02 = (g) obj;
                int i11 = g.E;
                i.g(this$02, "this$0");
                if (z10) {
                    yn.a aVar3 = this$02.C;
                    aVar3.getClass();
                    if (!yn.a.b()) {
                        compoundButton.setChecked(false);
                        x xVar2 = new x();
                        ?? notificationPermissionBottomSheet2 = new NotificationPermissionBottomSheet("custom_goals_add", aVar3.a(true), "goals", this$02.C, new g.a(compoundButton, xVar2));
                        xVar2.f23469u = notificationPermissionBottomSheet2;
                        notificationPermissionBottomSheet2.show(this$02.requireActivity().getSupportFragmentManager(), "permission");
                        return;
                    }
                    return;
                }
                return;
            case 3:
                o0 this$03 = (o0) obj;
                int i12 = o0.f15772x;
                i.g(this$03, "this$0");
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                String str = this$03.f15773u;
                String str2 = this$03.f15774v;
                if (str2 != null) {
                    firebasePersistence.addNewGoal(str, str2, false, z10);
                    return;
                } else {
                    i.q("courseId");
                    throw null;
                }
            case 4:
                g7 this$04 = (g7) obj;
                int i13 = g7.J;
                i.g(this$04, "this$0");
                if (z10) {
                    yn.a aVar4 = this$04.A;
                    aVar4.getClass();
                    if (yn.a.b()) {
                        TemplateActivity templateActivity = this$04.D;
                        if (templateActivity != null) {
                            if (templateActivity.W) {
                                this$04.G = true;
                                return;
                            } else if (templateActivity.y0() != null) {
                                TemplateActivity templateActivity2 = this$04.D;
                                if (templateActivity2 != null) {
                                    Goal y02 = templateActivity2.y0();
                                    i.d(y02);
                                    y02.setNotificationScheduled(true);
                                    return;
                                }
                                i.q("act");
                                throw null;
                            } else {
                                return;
                            }
                        }
                        i.q("act");
                        throw null;
                    }
                    compoundButton.setChecked(false);
                    x xVar3 = new x();
                    ?? notificationPermissionBottomSheet3 = new NotificationPermissionBottomSheet("plan", aVar4.a(true), "goals", this$04.A, new g7.b(compoundButton, xVar3));
                    xVar3.f23469u = notificationPermissionBottomSheet3;
                    notificationPermissionBottomSheet3.show(this$04.requireActivity().getSupportFragmentManager(), "permission");
                    return;
                }
                TemplateActivity templateActivity3 = this$04.D;
                if (templateActivity3 != null) {
                    if (templateActivity3.W) {
                        this$04.G = false;
                        return;
                    } else if (templateActivity3.y0() != null) {
                        TemplateActivity templateActivity4 = this$04.D;
                        if (templateActivity4 != null) {
                            Goal y03 = templateActivity4.y0();
                            i.d(y03);
                            y03.setNotificationScheduled(false);
                            return;
                        }
                        i.q("act");
                        throw null;
                    } else {
                        return;
                    }
                }
                i.q("act");
                throw null;
            default:
                q7 this$05 = (q7) obj;
                int i14 = q7.H;
                i.g(this$05, "this$0");
                if (z10) {
                    yn.a aVar5 = this$05.f19029z;
                    aVar5.getClass();
                    if (yn.a.b()) {
                        TemplateActivity templateActivity5 = this$05.C;
                        if (templateActivity5 != null) {
                            if (templateActivity5.W) {
                                this$05.E = true;
                                return;
                            } else if (templateActivity5.y0() != null) {
                                TemplateActivity templateActivity6 = this$05.C;
                                if (templateActivity6 != null) {
                                    Goal y04 = templateActivity6.y0();
                                    i.d(y04);
                                    y04.setNotificationScheduled(true);
                                    return;
                                }
                                i.q("act");
                                throw null;
                            } else {
                                return;
                            }
                        }
                        i.q("act");
                        throw null;
                    }
                    compoundButton.setChecked(false);
                    x xVar4 = new x();
                    ?? notificationPermissionBottomSheet4 = new NotificationPermissionBottomSheet("plan", aVar5.a(true), "goals", this$05.f19029z, new q7.b(compoundButton, xVar4));
                    xVar4.f23469u = notificationPermissionBottomSheet4;
                    notificationPermissionBottomSheet4.show(this$05.requireActivity().getSupportFragmentManager(), "permission");
                    return;
                }
                TemplateActivity templateActivity7 = this$05.C;
                if (templateActivity7 != null) {
                    if (templateActivity7.W) {
                        this$05.E = false;
                        return;
                    } else if (templateActivity7.y0() != null) {
                        TemplateActivity templateActivity8 = this$05.C;
                        if (templateActivity8 != null) {
                            Goal y05 = templateActivity8.y0();
                            i.d(y05);
                            y05.setNotificationScheduled(false);
                            return;
                        }
                        i.q("act");
                        throw null;
                    } else {
                        return;
                    }
                }
                i.q("act");
                throw null;
        }
    }
}
