package ek;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.activity.GratitudeJournalComponentActivity;
import com.theinnerhour.b2b.model.GratitudeJournalQuestionModel;
import java.util.ArrayList;
/* compiled from: GratitudeJournalAdapter.java */
/* loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f14171u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f14172v;

    public j(k kVar, int i6) {
        this.f14172v = kVar;
        this.f14171u = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        defpackage.d.m(bundle, "course");
        k kVar = this.f14172v;
        ArrayList<GratitudeJournalQuestionModel> arrayList = kVar.f14181x;
        int i6 = this.f14171u;
        bundle.putString("question_id", arrayList.get(i6).getQuestionId());
        gk.a.b(bundle, "dashboard_gratitude_card_click");
        Bundle bundle2 = new Bundle();
        bundle2.putInt("Journal", i6);
        bundle2.putBoolean("Dashboard", true);
        Context context = kVar.f14183z;
        Intent intent = new Intent(context, GratitudeJournalComponentActivity.class);
        intent.putExtras(bundle2);
        context.startActivity(intent);
    }
}
