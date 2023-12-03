package com.theinnerhour.b2b.components.resetprogram.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import cp.d;
import cp.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ll.b;
import org.json.JSONArray;
import so.b0;
import ss.l;
import ta.v;
import tl.o;
/* compiled from: ResetProgrammeLoadingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/resetprogram/activity/ResetProgrammeLoadingActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ResetProgrammeLoadingActivity extends c {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f11619w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final String f11620v;

    /* compiled from: ResetProgrammeLoadingActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<Boolean, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                ResetProgrammeLoadingActivity resetProgrammeLoadingActivity = ResetProgrammeLoadingActivity.this;
                if (booleanValue) {
                    new Handler(Looper.getMainLooper()).postDelayed(new o(15, resetProgrammeLoadingActivity), 2000L);
                } else {
                    LogHelper.INSTANCE.e(resetProgrammeLoadingActivity.f11620v, "Programme reset failure");
                    Toast.makeText(resetProgrammeLoadingActivity, resetProgrammeLoadingActivity.getString(R.string.telecommunicationsError), 1).show();
                    resetProgrammeLoadingActivity.startActivity(new b().a(resetProgrammeLoadingActivity, true));
                    resetProgrammeLoadingActivity.finish();
                }
            }
            return hs.k.f19476a;
        }
    }

    public ResetProgrammeLoadingActivity() {
        new LinkedHashMap();
        this.f11620v = LogHelper.INSTANCE.makeLogTag(ResetProgrammeLoadingActivity.class);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reset_programme_loading);
        e eVar = (e) new o0(this, new ok.c(new cp.c())).a(e.class);
        eVar.f11882z.e(this, new b0(16, new a()));
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("courses");
        JSONArray jSONArray = new JSONArray();
        i.d(stringArrayListExtra);
        Iterator<String> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        String version = FirebasePersistence.getInstance().getUser().getVersion();
        i.f(version, "getInstance().user.version");
        v.H(f.H(eVar), null, 0, new d(eVar, version, stringArrayListExtra, null), 3);
    }
}
