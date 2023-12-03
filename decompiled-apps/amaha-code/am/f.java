package am;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class f extends androidx.activity.h {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(true);
        this.f648d = firestoreGoalsActivity;
    }

    @Override // androidx.activity.h
    public final void a() {
        ConstraintLayout constraintLayout;
        FirestoreGoalsActivity firestoreGoalsActivity = this.f648d;
        yp.b bVar = firestoreGoalsActivity.f11150w;
        if (bVar != null && (constraintLayout = bVar.f38710a) != null && BottomSheetBehavior.from(constraintLayout).getState() == 3) {
            BottomSheetBehavior.from(constraintLayout).setState(4);
            return;
        }
        Intent intent = new Intent();
        firestoreGoalsActivity.setResult(-1, intent);
        boolean z10 = firestoreGoalsActivity.f11152y;
        if (!z10) {
            intent.putExtra("tooltipshow", z10);
        }
        firestoreGoalsActivity.finish();
    }
}
