package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.LearningHubActivity;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.q;
import g0.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: LearningHubActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/LearningHubActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LearningHubActivity extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f10431x = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10432v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f10433w = new LinkedHashMap();

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f10433w;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("removeLearningHubFFM", this.f10432v);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        Intent intent;
        String stringExtra;
        String stringExtra2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_learning_hub);
        try {
            getWindow().setStatusBarColor(a.b(this, R.color.alt_statusbar_orange));
            setTitle("");
            k0().x((Toolbar) n0(R.id.learningHubToolbar));
            g.a l02 = l0();
            if (l02 != null) {
                l02.m(true);
            }
            ((AppBarLayout) n0(R.id.learningHubAppBar)).a(new AppBarLayout.f() { // from class: dk.f
                @Override // com.google.android.material.appbar.AppBarLayout.a
                public final void a(AppBarLayout appBarLayout, int i6) {
                    int i10 = LearningHubActivity.f10431x;
                    LearningHubActivity this$0 = LearningHubActivity.this;
                    kotlin.jvm.internal.i.g(this$0, "this$0");
                    if (Math.abs(i6) - appBarLayout.getTotalScrollRange() == 0) {
                        ((RobertoTextView) this$0.n0(R.id.learningHubToolbarTitle)).setVisibility(0);
                    } else {
                        ((RobertoTextView) this$0.n0(R.id.learningHubToolbarTitle)).setVisibility(8);
                    }
                }
            });
            ((RecyclerView) n0(R.id.learningHubRecyclerView)).setLayoutManager(new LinearLayoutManager(this, 1, false));
            Serializable serializableExtra = getIntent().getSerializableExtra("learningHubList");
            i.e(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.LearningHubModel>");
            ((RecyclerView) n0(R.id.learningHubRecyclerView)).setAdapter(new q(this, (ArrayList) serializableExtra));
            if (!getIntent().getBooleanExtra("showPage", true)) {
                startActivity(new Intent(this, LearningHubArticleActivity.class).putExtra("model", getIntent().getSerializableExtra("model")));
                Serializable serializableExtra2 = getIntent().getSerializableExtra("model");
                i.e(serializableExtra2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.LearningHubModel");
                LearningHubModel learningHubModel = (LearningHubModel) serializableExtra2;
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle2.putString("post_type", learningHubModel.getPost_type());
                bundle2.putString("post_course", learningHubModel.getProgramme());
                bundle2.putString("post_id", learningHubModel.getId());
                Intent intent2 = getIntent();
                if (intent2 != null && (stringExtra2 = intent2.getStringExtra("exp_source")) != null) {
                    bundle2.putString("source", stringExtra2);
                }
                Intent intent3 = getIntent();
                if (intent3 != null && (stringExtra = intent3.getStringExtra("exp_status")) != null) {
                    bundle2.putString("status", stringExtra);
                }
                Intent intent4 = getIntent();
                if (intent4 != null && intent4.hasExtra("exp_first_time_consumption")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (intent = getIntent()) != null) {
                    bundle2.putBoolean("first_time_consumption", intent.getBooleanExtra("exp_first_time_consumption", false));
                }
                gk.a.b(bundle2, "cm_post_detail");
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            if (getIntent().hasExtra("isOnboarding") && getIntent().getBooleanExtra("isOnboarding", false)) {
                bundle3.putBoolean("isOnboarding", true);
            } else {
                bundle3.putBoolean("isOnboarding", false);
            }
            String stringExtra3 = getIntent().getStringExtra("source");
            if (stringExtra3 != null) {
                bundle3.putString("source", stringExtra3);
            }
            gk.a.b(bundle3, "cm_list");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        i.g(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
