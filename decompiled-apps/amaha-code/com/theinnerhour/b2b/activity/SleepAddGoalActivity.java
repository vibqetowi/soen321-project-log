package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import rr.a;
/* loaded from: classes2.dex */
public class SleepAddGoalActivity extends a {

    /* renamed from: w  reason: collision with root package name */
    public int f10489w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Class> f10490x = new ArrayList<>();

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        ArrayList<Class> arrayList = this.f10490x;
        arrayList.add(SleepTimeTableActivity.class);
        Iterator<CourseDayModel> it = FirebasePersistence.getInstance().getUser().getSleep().getPlan().iterator();
        while (it.hasNext()) {
            CourseDayModel next = it.next();
            if (next.isCompleted() && next.getHero_banner().getLink().equals(Constants.SCREEN_SYMPTOMS)) {
                arrayList.add(CausesActivity.class);
            }
            if (next.isCompleted() && next.getHero_banner().getLink().equals(Constants.SCREEN_POSITIVE_ENDURING_BEHAVIOUR)) {
                arrayList.add(EnduringActivity.class);
            }
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i6 = this.f10489w;
        ArrayList<Class> arrayList = this.f10490x;
        if (i6 == arrayList.size()) {
            n0();
        } else {
            startActivity(new Intent(this, arrayList.get(this.f10489w)));
        }
        this.f10489w++;
    }
}
