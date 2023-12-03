package com.theinnerhour.b2b.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import fq.c0;
import fq.e0;
import fq.i0;
import fq.n0;
import fq.o0;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rr.a;
import rr.b;
/* compiled from: T4CActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/T4CActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class T4CActivity extends a {
    public b A;
    public String B;
    public final HashMap<String, Object> C;
    public final ArrayList<String> D;

    /* renamed from: w  reason: collision with root package name */
    public y f10525w;

    /* renamed from: x  reason: collision with root package name */
    public int f10526x;

    /* renamed from: y  reason: collision with root package name */
    public int f10527y;

    /* renamed from: z  reason: collision with root package name */
    public final String f10528z;

    public T4CActivity() {
        new LinkedHashMap();
        this.f10528z = "assesment_pos";
        this.C = new HashMap<>();
        this.D = new ArrayList<>();
    }

    @Override // rr.a
    public final void n0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Fragment F;
        if (u0().I()) {
            if (v0().H() > 0) {
                v0().W();
                ArrayList<String> arrayList = this.D;
                arrayList.remove(u.o2(arrayList));
                y v02 = v0();
                if (arrayList.size() > 0 && (F = v02.F((String) u.o2(arrayList))) != null) {
                    this.A = (b) F;
                    return;
                }
                return;
            }
            b F2 = u0().F();
            if (F2 == null) {
                int i6 = this.f10526x - 1;
                this.f10526x = i6;
                if (i6 < this.f10527y) {
                    super.onBackPressed();
                    return;
                } else {
                    w0(true, true);
                    return;
                }
            }
            this.A = F2;
            androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            k10.f(R.id.root_frame_layout, u0(), null);
            k10.j();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_t4c);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i6 = extras.getInt(this.f10528z, 0);
            this.f10527y = i6;
            this.f10526x = i6;
        }
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10525w = supportFragmentManager;
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
            return;
        }
        String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
        i.f(currentCourse, "getInstance().user.currentCourse");
        this.B = currentCourse;
        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
        String str = this.B;
        if (str != null) {
            i.f(firebasePersistence.getCourseById(str), "getInstance().getCourseById(courseId)");
            w0(false, false);
            return;
        }
        i.q("courseId");
        throw null;
    }

    @Override // rr.a
    public final void r0(b bVar) {
        this.A = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
        k10.f(R.id.root_frame_layout, u0(), valueOf);
        k10.j();
        ArrayList<String> arrayList = this.D;
        if (arrayList.size() > 0) {
            arrayList.remove(u.o2(arrayList));
        }
        arrayList.add(valueOf);
    }

    @Override // rr.a
    public final void s0(b bVar) {
        this.A = bVar;
        androidx.fragment.app.a k10 = e.k(v0(), R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
        k10.f(R.id.root_frame_layout, u0(), valueOf);
        k10.d(null);
        k10.j();
        this.D.add(valueOf);
    }

    @Override // rr.a
    public final void t0() {
        this.f10526x++;
        ArrayList<String> arrayList = this.D;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            Fragment F = v0().F(it.next());
            if (F != null) {
                F.setReturnTransition(null);
            }
        }
        arrayList.clear();
        v0().X(null);
        w0(false, true);
    }

    public final b u0() {
        b bVar = this.A;
        if (bVar != null) {
            return bVar;
        }
        i.q("customFragment");
        throw null;
    }

    public final y v0() {
        y yVar = this.f10525w;
        if (yVar != null) {
            return yVar;
        }
        i.q("fragmentManager");
        throw null;
    }

    public final void w0(boolean z10, boolean z11) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(v0());
        if (z11) {
            if (z10) {
                aVar.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
            } else {
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            }
        }
        switch (this.f10526x) {
            case 0:
                this.A = new e0();
                break;
            case 1:
                this.A = new i0();
                break;
            case 2:
                this.A = new e0();
                break;
            case 3:
                this.A = new c0();
                break;
            case 4:
                this.A = new e0();
                break;
            case 5:
                this.A = new o0();
                break;
            case 6:
                this.A = new n0();
                break;
            default:
                n0();
                return;
        }
        String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
        Bundle extras = getIntent().getExtras();
        i.d(extras);
        extras.putInt(Constants.DAYMODEL_POSITION, this.f10526x);
        u0().setArguments(extras);
        aVar.f(R.id.root_frame_layout, u0(), valueOf);
        aVar.j();
        this.D.add(valueOf);
    }
}
